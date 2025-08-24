intentos = 3
pin_c = "1234"

while intentos > 0 :
    pin_i = input("Ingrese su pin de 4 digitos: ")
    if pin_i == pin_c :
        print("PIN correcto.")
        break
    else :
        intentos -= 1
        print("Pin incorrecto, intentelo de nuevo. Intentos restantes:", intentos)

if intentos == 0 :
    print("Cuenta bloqueada.")
else :
    saldo = 1000

    def consultar(saldo) : 
        print("Su saldo actual es de:", saldo)

    def retirar(saldo) :
        monto = int(input("Ingrese el monto que desea retirar: "))
        if monto <= saldo:
            saldo -= monto 
            print("Operacion exitosa. Su nuevo saldo es de:", saldo)
        else :
            print("Saldo insuficiente.")
        return saldo


    def depositar(saldo) :
        monto = int(input("Ingrese cantidad a depositar: "))
        if monto > 0 :
            saldo += monto
            print("Operacion exitosa. Su nuevo saldo es de:", saldo)
        else :
            print("Monto invalido. Intentelo de nuevo.")
        return saldo


    while True : 
        print("Bienvenido/a al cajero automatico.")
        print("Menu:")
        print("1. Consultar saldo")
        print("2. Retirar dinero")
        print("3. Depositar dinero")
        print("4. Salir")
        opcion = input("Ingrese el numero de su opcion: ")

        if opcion == "1" :
            consultar(saldo)
        elif opcion == "2" :
            saldo = retirar(saldo)
        elif opcion == "3" :
            saldo = depositar(saldo)
        elif opcion == "4" :
            print("Gracias por usar el cajero automatico.")
            break
        else :
            print("Opcion invalida. Intentelo de nuevo.")