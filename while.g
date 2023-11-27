grammar while;

//On définit l'output comme étant un AST
options{
    output =AST;
} 
tokens
{
Node_Commands;
Node_Exprlist;
Node_Output;
Node_Input;
Node_ForEach;
Node_For;
Node_While;
Node_If;
Node_Affectation;
}

//Fragments

fragment Maj
	:	'A'..'Z';
fragment Min
	:	'a'..'z';
fragment Dec
	:	'0'..'9';
	
//Tokens
Variable        :	Maj(Maj|Min|Dec)*('!'|'?')?;

Symbol          :	Min(Maj|Min|Dec)*('!'|'?')?;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
 

//Rules
program 
	:	function program? ;
function	
	:	'function' Symbol ':' WS* definition  -> ^('function' Symbol ':' definition) ; 

definition 
	:	'read' input WS* '%' commands '%' WS* 'write' output WS* -> ^('read' input commands 'write' output);
input 	
	: 	inputSub? ->^(Node_Input inputSub?);	
inputSub
	:	Variable (',' Variable)*-> Variable + ;
output	
	:	Variable (',' Variable)* -> ^(Node_Output Variable+);	
vars	
	:	Variable (',' Variable)* -> Variable+;
exprs	
	:	expression (',' expression)* -> expression+; 
commands 
	:	WS* command (';' command)* WS* -> ^(Node_Commands command+); 
command      
	:	'foreach' Variable 'in' expression 'do' commands 'od' ^(Node_ForEach expression commands)
		| 'for' expression 'do' commands 'od' -> ^(Node_For expression commands)
		| 'while' expression 'do' commands 'od' -> ^(Node_While expression commands)
		| 'if' WS* expression 'then'  commands 'od' (WS*'else' commands)? WS* 'fi' ^(Node_If expression commands)
		| 'nop'
		| vars ':=' exprs -> ^(Node_Affectation vars exprs) 
		;  
exprBase     
	 :	'(' Symbol lExpr ')'
		| '(' 'hd' exprBase ')' 
		| '(' 'tl' exprBase ')'
		| '(' 'cons' lExpr ')'
		| '(' 'list' lExpr ')'
		| 'nil' 
		| Variable
		| Symbol;
expression
	:	exprBase ('=?' exprBase)? ;
lExpr	
	:	(exprBase lExpr)?; // à vérifier avec le prof si ça englobe tout

	