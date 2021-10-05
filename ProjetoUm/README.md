Existe um erro no Projeto da Biblioteca que deixamos passar, não mudei por motivos de ter passado a data limite.

O código de devolução do Usuario-Aluno e Usuario-Professor está com uma variavel invertida,a linha que atribui o valor para a punição do aluno ou professor esta incorreta.

LocalDate dataSuspensao = entrega.plusDays(dataDiferenca); deveria ser LocalDate dataSuspensao = data.plusDays(dataDiferenca); 

pois a lógica certa é apartir do dia qu entregou e não da data que deveria ser a entrega.
