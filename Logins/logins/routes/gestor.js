var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Gestao = require('../models').Gestao;
var Funcionario = require('../models').Funcionario;
var Publicacao = require('../models').Publicacao;
var Empresa = require('../models').Empresa;
var Equipamento = require('../models').Equipamento;


/* ROTA PARA CADASTRAR RESPONSAVEL */

router.post("/cadastrarresponsavel/:idUsuario", function (req, res, next) {
    let idUsuario = req.params.idUsuario;
    Gestao.create({
        CPF: req.body.CPF,
        loginResponsavel: req.body.loginResponsavel,
        senhaResponsavel: req.body.senhaResponsavel,
        telefone: req.body.telefone,
        nomeResponsavel: req.body.nomeResponsavel,
        tipo: req.body.tipo,
        fkEmpresa: idUsuario,
    }).then(resultado => {
        console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

/* ROTA PARA CADASTRAR FUNCIONARIO Empresa*/

router.post("/cadastrarfuncionario/:idUsuario", function (req, res, next) {
    let idUsuario = req.params.idUsuario;
    Funcionario.create({
        email: req.body.email,
        loginFuncionario: req.body.loginFuncionario,
        senhaFuncionario: req.body.senhaFuncionario,
        telefone: req.body.telefone,
        nomeFuncionario: req.body.nomeFuncionario,
        fkResponsavel: idUsuario,
    }).then(resultado => {
        console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

/* ROTA CADASTRO EMPRESA */
router.post('/cadastrar', function (req, res, next) {
    Empresa.create({
        loginEmpresa: req.body.loginEmpresa,
        senhaEmpresa: req.body.senhaEmpresa,
        nomeEmpresa: req.body.nomeEmpresa,
        CNPJ: req.body.cnpj,
        telefone: req.body.telefone,
        email: req.body.email,
        logradouro: req.body.logradouro,
        cidade: req.body.cidade,
        numero: req.body.numero,
        complemento: req.body.complemento,
        cep: req.body.cep,
        bairro: req.body.bairro

    }).then(resultado => {
        console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

/* ROTA CADASTRO EMPRESA */
router.post('/cadastrar', function (req, res, next) {
    Empresa.create({
        loginEmpresa: req.body.loginEmpresa,
        senhaEmpresa: req.body.senhaEmpresa,
        nomeEmpresa: req.body.nomeEmpresa,
        CNPJ: req.body.cnpj,
        telefone: req.body.telefone,
        email: req.body.email,
        logradouro: req.body.logradouro,
        cidade: req.body.cidade,
        numero: req.body.numero,
        complemento: req.body.complemento,
        cep: req.body.cep,
        bairro: req.body.bairro

    }).then(resultado => {
        console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

    /* Update tabela empresa*/
    router.put('/update', function (req, res, next) {

    var idEmpresa = req.body.idEmpresa;
    var nomeEmpresa = req.body.nomeEmpresa;
    var CNPJ = req.body.CNPJ;
    var cep = req.body.cep;
    var bairro = req.body.bairro;
    var logradouro = req.body.logradouro;
    var cidade = req.body.cidade;
    var numero = req.body.numero;
    var complemento = req.body.complemento;
    var loginEmpresa = req.body.loginEmpresa;
    var senhaEmpresa = req.body.senhaEmpresa;
    var telefone = req.body.telefone;
    var email = req.body.email;
    let instrucaoSql;

    instrucaoSql = `update [dbo].[Empresa] set loginEmpresa = '${loginEmpresa}',senhaEmpresa='${senhaEmpresa}',nomeEmpresa='${nomeEmpresa}',CNPJ='${CNPJ}',telefone='${telefone}',email='${email}',logradouro='${logradouro}',cidade='${cidade}',numero=${+(numero)},complemento='${complemento}',cep='${cep}',bairro='${bairro}' where idEmpresa = ${+(idEmpresa)}`;

    console.log(instrucaoSql);
    sequelize.query(instrucaoSql, {
        model: Empresa
    }).then(resultado => {
        console.log(`Encontrados: ${resultado.length}`);
        if (resultado.length == 1) {
            sessoes.push(resultado[0].dataValues.login);
            console.log('sessoes: ', sessoes);
            res.json(resultado[0]);
        } else if (resultado.length == 0) {
            res.status(403).send('Login e/ou senha inválido(s)');
        } else {
            res.status(403).send('Mais de um usuário com o mesmo login e senha!');
        }
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});
/* -------------------------- */
router.put('/updateeq', function (req, res, next) {
    var fkFuncionario = req.body.fkFuncionario;
    var maquina = req.body.idFuncionario;
    let instrucaoSql;

    instrucaoSql = `update [dbo].[Equipamento] set fkFuncionario = ${fkFuncionario} where idEquipamento = ${maquina};`;

    sequelize.query(instrucaoSql, {
        model: Equipamento
    }).then(resultado => {
        console.log(`Encontrados: ${resultado.length}`);
        if (resultado.length == 1) {
            sessoes.push(resultado[0].dataValues.login);
            console.log('sessoes: ', sessoes);
            res.json(resultado[0]);
        } else if (resultado.length == 0) {
            res.status(403).send('Login e/ou senha inválido(s)');
        } else {
            res.status(403).send('Mais de um usuário com o mesmo login e senha!');
        }
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});
/* ROTA DELETAR */
router.delete('/delete/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `DELETE FROM [dbo].[Empresa] WHERE idEmpresa = ${idUsuario}`;

    sequelize.query(instrucaoSql, {
            model: Empresa,
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
/* ROTA DELETAR maquina */
router.delete('/deletemaquina/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `DELETE FROM [dbo].[Equipamento] WHERE idEquipamento = ${idUsuario}`;

    sequelize.query(instrucaoSql, {
            model: Equipamento,
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
/* ROTA DELETAR GESTOR */
router.delete('/deletegest/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');
    var idUsuario = req.params.idUsuario;
    let instrucaoSql = `DELETE FROM responsavel WHERE idResponsavel = ${idUsuario}`;
    sequelize.query(instrucaoSql, {
            model: Gestao,
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

/* ROTA QUE RECUPERA AS PUBLICAÇÕES DE UM USUÁRIO PELO ID */
router.get('/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Empresa] inner join [dbo].[Responsavel] on idEmpresa = fkEmpresa where idEmpresa = ${idUsuario} and tipo = 'gestor'`;

    sequelize.query(instrucaoSql, {
            model: Gestao,
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

/* ROTA QUE RECUPERA AS PUBLICAÇÕES DE UM USUÁRIO PELO ID */
router.get('/sup/:idUsuario', function (req, res, next) {

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Empresa] inner join [dbo].[Responsavel] on idEmpresa = fkEmpresa where idEmpresa = ${idUsuario} and tipo = 'suporte'`;

    sequelize.query(instrucaoSql, {
            model: Gestao,
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

/* ROTA QUE RECUPERA AS PUBLICAÇÕES DE UM USUÁRIO PELO ID */
router.get('/equipamentos/:idUsuario', function (req, res, next) {

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Equipamento] inner join [dbo].[Funcionario] on fkFuncionario = idFuncionario inner join [dbo].[Responsavel] on fkResponsavel = idResponsavel where idResponsavel = ${idUsuario}`;

    sequelize.query(instrucaoSql, {
            model: Gestao,
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
/* ----------------------------------------------------------- */
router.get('/empresa/:idUsuario', function (req, res, next) {

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Empresa]`;

    sequelize.query(instrucaoSql, {
            model: Empresa,
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

/* ----------------------------------------------------------- */

router.get('/disponivel/:idUsuario', function (req, res, next) {
    console.log('Recuperando todas as publicações');

    var idUsuario = req.params.idUsuario;

    let instrucaoSql = `select * from [dbo].[Funcionario] where fkResponsavel =${idUsuario} `;

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
/* Update tabela funcionario  */

/* Update tabela */
router.put('/updateresponsavel/:idUsuario', function (req, res, next) {
    var idUsuario = req.params.idUsuario;
    var loginResponsavel = req.body.loginResponsavel;
    var senhaResponsavel = req.body.senhaResponsavel;
    var nomeResponsavel = req.body.nomeResponsavel;
    var telefone = req.body.telefone;
    var email = req.body.email;
    var CPF = req.body.CPF;

    instrucaoSql = `update [dbo].[Responsavel] set 
    loginResponsavel = '${loginResponsavel}',
    senhaResponsavel='${senhaResponsavel}',
    nomeResponsavel='${nomeResponsavel}',
    telefone='${telefone}',
    CPF='${CPF}' WHERE idResponsavel = ${idUsuario} `;

    console.log(instrucaoSql);
    sequelize.query(instrucaoSql, {
        model: Gestao
    }).then(resultado => {
        console.log(`Encontrados: ${resultado.length}`);
        if (resultado.length == 1) {
            sessoes.push(resultado[0].dataValues.login);
            console.log('sessoes: ', sessoes);
            res.json(resultado[0]);
        } else if (resultado.length == 0) {
            res.status(403).send('Login e/ou senha inválido(s)');
        } else {
            res.status(403).send('Mais de um usuário com o mesmo login e senha!');
        }
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

router.post('/cadastrarequipamento', function (req, res, next) {
    Equipamento.create({
        numeroSerie: req.body.numeroSerie,
        CPU: req.body.CPU,
        RAM: req.body.RAM,
        HD: req.body.HD,
        fkFuncionario: req.body.fkFuncionario,
        SO: req.body.SO,
        data: req.body.data,
        statusEquip: req.body.statusEquip
    }).then(resultado => {
        console.log(`Registro criado: ${resultado}`)
        res.send(resultado);
    }).catch(erro => {
        console.error(erro);
        res.status(500).send(erro.message);
    });
});

module.exports = router;