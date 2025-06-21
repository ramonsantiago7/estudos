def calcular_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc

def classificar_imc(imc):
    if imc < 18.5:
        return "Abaixo do peso"
    elif 18.5 <= imc < 24.9:
        return "Peso normal"
    elif 25 <= imc < 29.9:
        return "Sobrepeso"
    elif 30 <= imc < 34.9:
        return "Obesidade grau 1"
    elif 35 <= imc < 39.9:
        return "Obesidade grau 2"
    else:
        return "Obesidade grau 3 (mórbida)"

# Entrada de dados do usuário
try:
    peso = float(input("Digite seu peso (em kg): "))
    altura = float(input("Digite sua altura (em metros): "))

    # Cálculo do IMC
    imc = calcular_imc(peso, altura)
    classificacao = classificar_imc(imc)

    # Exibição do resultado
    print(f"\nSeu IMC é: {imc:.2f}")
    print(f"Classificação: {classificacao}")

except ValueError:
    print("Por favor, insira valores numéricos válidos.")
