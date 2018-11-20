start -> Declaration | Assignment | DeclarationAndAssignment | MethodDeclaration\
Declaration -> Type Identifier \
Assignment ->  Identifier AssignmentOperators value \
DeclarationAndAssignment -> Type Identifier AssignmentOperators value 
MethodDeclaration -> ReturnType Identifier (OptionalParameter)
OptionalParameter -> Parameters | Empty
Parameters -> Parameter, Parameter | Parameter
MethodBodyStart -> "{" Expression | 
