% Se a expressão for apenas um número, o resultado é o próprio número.
avaliar(X, X) :- number(X).

% Soma
avaliar(A + B, Resultado) :-
    avaliar(A, ResA),
    avaliar(B, ResB),
    Resultado is ResA + ResB.

% Subtração
avaliar(A - B, Resultado) :-
    avaliar(A, ResA),
    avaliar(B, ResB),
    Resultado is ResA - ResB.

% Multiplicação
avaliar(A * B, Resultado) :-
    avaliar(A, ResA),
    avaliar(B, ResB),
    Resultado is ResA * ResB.

% Divisão
avaliar(A / B, Resultado) :-
    avaliar(A, ResA),
    avaliar(B, ResB),
    Resultado is ResA / ResB.