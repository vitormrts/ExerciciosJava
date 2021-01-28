def solucao(D, N):
    D = str(D)
    N = str(N)
    if D not in N:
        print(int(N))
    else:
        for char in N:
            if char == D:
                N = N.replace(D, "")
        if N.count('0') == len(N):
            print(0)
        else:
            print(int(N))


while True:
    valores = input()
    D = int(valores[0])
    N = int(valores[2:])
    if D == 0 and N == 0:
        break
    solucao(D, N)
