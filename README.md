# Controle de KM

Sistema web para registrar o uso de um veículo comercial compartilhado,
substituindo a prancheta de papel mantida dentro do carro.

## Usuários
- Motoristas (6): registram saída e chegada do veículo pelo celular.
- Administrativo: consulta as viagens e fecha o mês.

## Dados de cada viagem
- Motorista
- Data/hora e KM de saída
- Data/hora e KM de chegada
- Destino/motivo (opcional)
- Abastecimento: ocorreu (sim/não), valor e posto

## Regras de negócio
1. O KM inicial é preenchido automaticamente com o KM final da viagem anterior.
2. O KM final não pode ser menor que o KM inicial.
3. Não é possível iniciar uma viagem se houver outra em andamento.
4. Os dados de abastecimento só são informados quando houver abastecimento.
5. O administrativo pode corrigir registros incorretos.

## Funcionalidades previstas
- [ ] Iniciar viagem
- [ ] Finalizar viagem
- [ ] Consulta de viagens por mês
- [ ] Exportação para CSV/Excel
- [ ] Login

## Tecnologias
Java, Spring Boot, (banco de dados a definir)