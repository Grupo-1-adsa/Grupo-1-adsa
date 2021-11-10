var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Publicacao = require('../models').Publicacao;

/* ROTA QUE RECUPERA CRIA UMA PUBLICAÇÃO */
router.post('/publicar/:idUsuario', function (req, res, next) {
    console.log("Iniciando Publicação...")

    let idUsuario = req.params.idUsuario;

    Publicacao.create({
        descricao: req.body.descricao,
        fkUsuario: idUsuario,
        dataPost: req.body.dataPost
    }).then(resultado => {
        console.log("Post realizado com sucesso!!");
        res.send(resultado);
    }).catch(erro => {
        console.log('DEU UM ERRINHO')
        console.error(erro);
        res.status(500).send(erro.message);
    })
})

/* ROTA QUE RECUPERA AS PUBLICAÇÕES DE UM USUÁRIO PELO ID */
router.get('/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from Equipamento  inner join Funcionario on Funcionario.idFuncionario = Equipamento.fkFuncionario inner join Responsavel on Responsavel.idResponsavel = ${idUsuario}  ORDER BY Funcionario.idFuncionario DESC`;

    sequelize.query(instrucaoSql, {
        model: Publicacao,
        mapToModel: true
    })
        .then(resultado => {
            console.log(`Encontrados: ${resultado.length}`);
            res.json(resultado);
        }).catch(erro => {
            console.error(erro);
            res.status(500).send(erro.message);
        });
});

module.exports = router;
