const express = require('express');
const path = require('path');
const cookieParser = require('cookie-parser');
const indexRouter = require('./routes/index');
const enviaEmail = require('./routes/email');
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);
app.use('/email', enviaEmail);

app.listen(8080);

module.exports = app;