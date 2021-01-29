class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self._size = 0

class Queue:
    def __init__(self):
        self.first = None
        self.last = None
        self._size = 0

    def push(self, elem):
        node = Node(elem)
        if self._size == 0: # fila vazia
            self.last = node
            self.first = node
        else: # atualiza o ultimo
            self.last.next = node
            self.last = node

        self._size += 1

    def pop(self):
        if len(self) > 0:
            elem = self.first.data
            self.first = self.first.next
            self._size -= 1
            return elem
        raise IndexError("The queue is empty.")

    def peek(self):
        if len(self) > 0:
            return self.top.data
        raise IndexError("The stack is empty")
        
    def __len__(self):  # O(1)
        """ Retorna o tamanho da lista """
        return self._size

    def __repr__(self):
        if self._size > 0:
            r = ''
            pointer = self.first
            while pointer:
                r = r + str(pointer.data) + " " 
                pointer = pointer.next
            return r
        raise IndexError("The queue is empty")

    def __str__(self):
        return self.__repr__()

class Stack:
    def __init__(self):
        self.top = None
        self._size = 0

    def push(self, elem):
        node = Node(elem)
        node.next = self.top
        self.top = node
        self._size += 1

    def pop(self):
        if self._size > 0:
            elem = self.top.data
            self.top = self.top.next
            self._size -= 1
            return elem
        raise IndexError("The stack is empty")

    def peek(self):
        if self._size > 0:
            return self.top.data
        raise IndexError("The stack is empty")

    def __len__(self):  # O(1)
        """ Retorna o tamanho da lista """
        return self._size

    def __repr__(self):
        if self._size > 0:
            r = ''
            pointer = self.top
            while pointer:
                r = r + str(pointer.data) + "\n" 
                pointer = pointer.next
            return r
        raise IndexError("The stack is empty")

    def __str__(self):
        return self.__repr__()

def solucao(expressao):
    operador = ''
    num = ''
    numeradores = Queue()
    denominadores = Stack()
    aux = 0
    msg = expressao.replace(" ", "")
    for caracter in msg:
        if caracter.isalnum():
            num += caracter
        else:
            if numeradores._size < 2 and aux == 0:
                numeradores.push(num)
                aux = 1
            else:
                denominadores.push(num)
                aux = 0
            operador += caracter
            num = ''
    denominadores.push(num)

    n1 = int(numeradores.pop())
    n2 = int(numeradores.pop())
    d2 = int(denominadores.pop())
    d1 = int(denominadores.pop())
    op = operador[1]

    if op == "+":
        numerador = n1*d2 + n2*d1
        denominador = d1*d2
    elif op == "-":
        numerador = n1*d2 - n2*d1
        denominador = d1*d2
    elif op == "*":
        numerador = n1*n2
        denominador = d1*d2
    else:
        numerador = n1*d2
        denominador = n2*d1

    # if numerador % denominador == 0 or denominador % numerador == 0:
    #     simplificado = 
    mdc = mdc_euclidiano(numerador, denominador)
    if mdc > 1:
        print("{:.0f}/{:.0f} = {:.0f}/{:.0f}".format(numerador, denominador, numerador/mdc, denominador/mdc))
    else:
        pass
        print(str(numerador) + "/" + str(denominador) + " = " + str(numerador) + "/" + str(denominador))

def mdc_euclidiano(dividendo, divisor):
    resto = dividendo % divisor

    while resto != 0:
        dividendo, divisor, mdc = divisor, resto, resto

        resto = dividendo % divisor
    else:
        return divisor

    return mdc

linhas = int(input(""))
for i in range(linhas):
    expressao = str(input(""))
    solucao(expressao)