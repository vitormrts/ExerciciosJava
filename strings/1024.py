def criptografia(string):
    msg1 = ""
    for char in string:
        if char.isalpha():
            msg1 += chr(ord(char) + 3)
        else:
            msg1 += char
    msg1 = msg1[::-1]
    meio = int(len(msg1)/2)
    primeira_metade = msg1[:meio]
    segunda_metade = msg1[meio:]
    msg2 = ""
    for char in segunda_metade:
        msg2 += chr(ord(char) - 1)
    
    final = primeira_metade + msg2
    print(final)


linhas = int(input())
for i in range(linhas):
    string = input()
    criptografia(string)
