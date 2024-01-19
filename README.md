# compiler-while

## Description du projet

Ce projet s'est déroulé pour le module Théorie des Langages et Compilation. L'objectif était de créer un compilateur pour le langage While, langage créé par Olivier Ridoux. 

## Arborescence
```bash
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── fr
    │           └── esir
    │               └── tlc
    │                   ├── Main.java
    │                   ├── resources
    │                   │   ├── while.g
    │                   │   ├── whileLexer.java
    │                   │   └── whileParser.java
    │                   ├── semantic
    │                   │   ├── exceptions
    │                   │   │   ├── DuplicateFunctionException.java
    │                   │   │   ├── IncorrectAssignementException.java
    │                   │   │   ├── UndeclaredFunctionException.java
    │                   │   │   ├── UndeclaredMainException.java
    │                   │   │   ├── UndeclaredOutputException.java
    │                   │   │   └── UndeclaredVariableException.java
    │                   │   ├── Table.java
    │                   │   └── VisitorSemantic.java
    │                   └── threeAdressesCode
    │                       ├── Affectation.java
    │                       ├── FuncBegin.java
    │                       ├── FuncEnd.java
    │                       ├── Generator.java
    │                       ├── Goto.java
    │                       ├── IfzGoto.java
    │                       ├── Instruction.java
    │                       ├── Label.java
    │                       ├── Param.java
    │                       ├── Register.java
    │                       └── Return.java
    └── tests
        ├── grammaire
        │   ├── cons.txt
        │   ├── ExprBase.txt
        │   ├── hd.txt
        │   ├── listes.txt
        │   ├── Symbole&Variable.txt
        │   ├── Test.txt
        │   └── tl.txt
        ├── testExceptions
        │   ├── testDuplicateFunction.txt
        │   ├── testIncorrectAssignement.txt
        │   ├── testIncorrectCallFunction.txt
        │   ├── test.txt
        │   ├── testUndeclaredForEachVariable.txt
        │   ├── testUndeclaredForVariable.txt
        │   ├── testUndeclaredFunction.txt
        │   ├── testUndeclaredOutput.txt
        │   ├── testUndeclaredVariable.txt
        │   └── testUndeclaredWhileVariable.txt
        └── test.while
```
Dans le projet, nous avons deux dossiers dans le dossier src : main et test.
Le dossier main regroupe tout le code source du projet à savoir l'analyse sémantique, la génération du code trois adresses, les fichiers de la grammaire, du lexer et du parser, l'archive de Antlr et le fichier principal Main. 
Dans le dossier test, nous avons un script d'un code source en while (`test.while`), un dossier grammaire avec les tests des différentes règles de grammaire et un dossier sémantique avec les tests de vérifications sémantiques. 

## Lancement du projet

Nous n'avons pas terminé le compilateur. Pour découvrir le projet voici les étapes à réaliser : 
1. Cloner le projet : ([github.com/SterennLeHir/Compiler-while](https://github.com/SterennLeHir/Compiler-while.git))
2. Lancer le main avec un script while en argument. 

Vous pourrez voir différentes étapes en console avec la génération du code 3 adresses. 
