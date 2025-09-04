frase = input("Ingresa una frase: ")

palabras = frase.split()
palabras_mayus = [palabra.upper() for palabra in palabras]

print("lista de palabras: ", palabras)
print("Lista de palabras en mayusculas: ")
for palabra in palabras_mayus:
    print(palabra)

busca = input("Ingresa la palabra a buscar: ")
contador = frase.lower().count(busca.lower())
print(f"La palabra {busca} aparece {contador} vez/veces en la frase.")

remplazar= input("Ingresa la palabra a reemplazar: ")
nueva = input("Ingresa la nueva palabra: ")
if frase.lower().count(remplazar.lower()) > 0:
    nueva_frase = frase.replace(remplazar, nueva)
    print("Frase actualizada: ", nueva_frase)
else:
    print("Ingresaste una palabra que no existe en la frase.")





