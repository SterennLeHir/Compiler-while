grammar while;

//On définit l'output comme étant un AST
options{
    output =AST;
} 
tokens
{
Node_Program;
Node_Bloc;
Node_Exprlist;
Node_Output;
Node_Input;
Node_ForEach;
Node_For;
Node_While;
Node_If;
Node_Else;
Node_Affectation;
Node_Function;
Node_Left;
Node_Right;
Node_Head;
Node_Tail;
Node_Cons;
Node_List;
Node_Call;
Node_Params;
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
	:	function+ -> ^(Node_Program function+);
function	
	:	'function' Symbol ':' WS* definition  -> ^(Node_Function  Symbol  definition) ; 

definition 
	:	'read' input WS* '%' commands '%' WS* 'write' output WS* -> input commands output; 
input 	
	: 	inputSub? ->^(Node_Input inputSub?);	
inputSub
	:	Variable (',' Variable)*-> Variable + ;
output	
	:	Variable (',' Variable)* -> ^(Node_Output Variable+);	
vars	
	:	Variable (',' Variable)* -> ^(Node_Left Variable+);
exprs	
	:	expression (',' expression)* -> ^(Node_Right expression+); 
commands 
	:	WS* command (';' command)* WS* -> ^(Node_Bloc command+); 
command      
	:	'foreach' Variable 'in' expression 'do' commands 'od' -> ^(Node_ForEach Variable expression commands)
		| 'for' expression 'do' commands 'od' -> ^(Node_For expression commands)
		| 'while' expression 'do' commands 'od' -> ^(Node_While expression commands)
		| 'if' expression 'then'  commands ('else' commands)? 'fi' -> ^(Node_If expression commands ^(Node_Else commands)?)
		| 'nop'
		| vars ':=' exprs -> ^(Node_Affectation vars exprs) 
		;  
exprBase     
	 :	'(' Symbol lExpr? ')' -> ^(Node_Call Symbol ^(Node_Params lExpr?))
		| '(' 'hd' exprBase ')' ->  ^(Node_Head exprBase)
		| '(' 'tl' exprBase ')' -> ^(Node_Tail exprBase)
		| '(' 'cons' lExpr? ')' -> ^(Node_Cons lExpr?)
		| '(' 'list' lExpr? ')' -> ^(Node_List lExpr?)
		| 'nil' 
		| Variable
		| Symbol;
expression
	:	exprBase ('=?' exprBase)? ;
lExpr	
	:	exprBase+; 

	