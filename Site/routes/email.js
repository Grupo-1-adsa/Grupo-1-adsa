var express = require('express');
var router = express.Router();
var nodemailer = require("nodemailer");

router.post('/:email', function (req, res, next) {

    var Nome = req.body.username;
    var Email = req.body.cnpj;
    var Assunto = req.body.cep;
    var Telefone = req.body.telefone;
    var Mensagem = req.body.email;

    let transporter = nodemailer.createTransport({
        host: 'smtp.gmail.com',
        service: 'Gmail',
        port: 587,
        secure: true,
        auth: {
            user: `tfast5234@gmail.com`,
            pass: `#Gfgrupo1`
        }
    });

    let info = {
        //to: "support@newaccount1623165703042.freshdesk.com",
        to: "tfast5234@gmail.com",
        subject: `Mensagem do(a) cliente ${Nome}. \n
         Assunto: ${Assunto}. `,
        text: `Mensagem: ${Mensagem}, \n
        telefone do cliente: ${Telefone} e email: ${Email}.`
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



