process.env.NODE_ENV = 'production'; // altere para 'production' ou 'dev'

var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index');
var usuariosRouter = require('./routes/usuarios');
var leiturasRouter = require('./routes/leituras');
var publicacoesRouter = require('./routes/publicacoes');
var publicacoesRouterSup = require('./routes/publicacoesSup');
var publicacoesRouterSupLeitura = require('./routes/publicacoesSupLeitura');
const enviaEmail = require('./routes/email');

var app = express();

app.use(logger('dev')); 
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public/login')));


app.use('/', indexRouter);
app.use('/usuarios', usuariosRouter);
app.use('/leituras', leiturasRouter);
app.use('/publicacoes', publicacoesRouter);
app.use('/publicacoesSup', publicacoesRouterSup);
app.use('/publicacoesSupLeitura', publicacoesRouterSupLeitura);
app.use('/email', enviaEmail);
module.exports = app;
