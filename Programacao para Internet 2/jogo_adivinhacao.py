import random

print('''         Jogo de adivinhação 
         MESTRE DOS MAGOS \n''')

opcao = 0
while opcao != 2:
    print('''    >>> Breve instrução: Para jogar o gafanhoto tera que digitar numeros 
    inteiros de 1 a 10, para tentar adivinhar o numero secreto  
      
    [ 1 ] Jogar
	[ 2 ] Sair do Jogo''')

    opcao = int(input('\n>>>>>>>>>>>> Qual a sua opção: '))
    print('\n' * 130)

    if opcao == 1:
        numero_secreto = random.randrange(1, 10)
        total_de_tentativas = 3
        rodada = 1
        for rodada in range(1, total_de_tentativas + 1):
            print('rodada {} de {} '.format(rodada, total_de_tentativas))
            chute = 0
            while True:
                chute = int(input('Digite um numero: '))
                if((chute >= 0) and (chute <= 10)):
                    igual = chute == numero_secreto
                    break
                else:
                    print('\n' * 130)
                    print('de 1 a 10 gafanhoto bisonho, tente novamente')



            print('Você digitou', chute)

            if igual:
                if rodada == 1:
                    print('Excelente adivinhador o numero secreto era >>> {} '.format(numero_secreto))
                    print('Sua pontuação é ...........................>>> 10')
                    break
                elif rodada == 2:
                    print('Bom adivinhador o numero secreto era >>> {} '.format(numero_secreto))
                    print('Sua pontuação é .....................>>> 5')
                    break
                elif rodada == 3:
                    print('Ta ficando bom o numero secreto era >>> {} '.format(numero_secreto))
                    print('Sua pontuação é ....................>>> 2')
                    break
            else:
                print('\nErrou, continue tentando mestre das adivinhações\n')


    elif opcao == 2:
        print('Fechando jogo, voltge sempre')

    else:
        print('Opção invalida gafanhoto bisonho, tente novamente')
