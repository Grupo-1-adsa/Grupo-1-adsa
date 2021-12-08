var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Publicacao = require('../models').Publicacao;

router.get('/', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    let instrucaoSql = `select * from [dbo].[Advertencia] inner join [dbo].[Funcionario] on fkFuncionario = idFuncionario inner join Responsavel on Funcionario.fkResponsavel = Responsavel.idResponsavel `;

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

    let instrucaoSql = `select  * from Equipamento  inner join Funcionario on Equipamento.fkFuncionario = Funcionario.idFuncionario inner join Responsavel on Funcionario.fkResponsavel = Responsavel.idResponsavel  where  Responsavel.idResponsavel= ${idUsuario} ORDER BY Funcionario.idFuncionario DESC `;

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
/* ROTA PARA CRIAR BALAO */
router.get('/balao/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select  * from Equipamento  inner join Funcionario on Equipamento.fkFuncionario = Funcionario.idFuncionario inner join Responsavel on Funcionario.fkResponsavel = Responsavel.idResponsavel  where  Responsavel.idResponsavel= ${idUsuario} ORDER BY Funcionario.idFuncionario DESC `;

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
/* ROTA PARA ADV */
router.get('/adv/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Advertencia] inner join [dbo].[Funcionario] on fkFuncionario = idFuncionario inner join Responsavel on Funcionario.fkResponsavel = Responsavel.idResponsavel  where  idFuncionario=${idUsuario} `;

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

router.get('/advertencia/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Advertencia] inner join [dbo].[Funcionario] on fkFuncionario = idFuncionario inner join Responsavel on Funcionario.fkResponsavel = Responsavel.idResponsavel`;

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
