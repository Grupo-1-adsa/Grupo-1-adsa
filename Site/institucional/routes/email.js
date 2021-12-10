var express = require('express');
var router = express.Router();
var nodemailer = require("nodemailer");

router.post('/:email', function (req, res, next) {

    var Nome = req.body.username;
    var Cnpj = req.body.cnpj;
    var Cep = req.body.cep;
    var Telefone = req.body.telefone;
    var Email = req.body.email;

    let transporter = nodemailer.createTransport({
        host: 'smtp.gmail.com',
        service: 'Gmail',
        port: 587,
        secure: true,
        auth: {
            user: `tfast5234@gmail.com`,
            pass: `#Gfgrupo1`
        },
       
    });

    let info = {
        //to: "support@newaccount1623165703042.freshdesk.com",
        to: "tfast5234@gmail.com",
        subject: `Mensagem do(a) cliente ${Nome}.`,
        text: `O nosso próximo passo é marcar uma reunião para começar outros processos.
        Falaremos mais a fundo sobre como funcionará nossa prestação de serviço!`,
        
        /* subject: `Mensagem do(a) cliente ${Nome}.`,
        text: `Informações da empresa:\n
         CNPJ: ${Cnpj}, \n
         Cep: ${Cep}\n
         Telefone ${Telefone}\n
         Email: ${Email}.`, */

    };

    transporter.sendMail(info, function (error) {
        if (error) {
            console.log(error);
        } else {
            console.log('Email enviado com sucesso.');
            return res.status(200).json({
                success:true
            });

        }
    });

    console.log(info)

    res.send('Qualquer coisa que vc quiser')
});

module.exports = router;