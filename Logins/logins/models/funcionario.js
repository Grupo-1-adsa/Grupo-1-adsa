'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Funcionario = sequelize.define('Funcionario', {
        idFuncionario: {
            field: 'idFuncionario',
            type: DataTypes.INTEGER,
            primaryKey: true,
            autoIncrement: true
        },
        email: {
            field: 'email',
            type: DataTypes.STRING,
            allowNull: false
        },
        loginFuncionario: {
            field: 'loginFuncionario',
            type: DataTypes.STRING,
            allowNull: false
        },
        senhaFuncionario: {
            field: 'senhaFuncionario',
            type: DataTypes.STRING,
            allowNull: false
        },
        telefone: {
            field: 'telefone',
            type: DataTypes.STRING,
            allowNull: false
        },
        nomeFuncionario: {
            field: 'nomeFuncionario',
            type: DataTypes.STRING,
            allowNull: false
        },
        fkResponsavel: {
            field: 'fkResponsavel',
            type: DataTypes.INTEGER,
            allowNull: false
        },
    }, {
        tableName: 'funcionario',
        freezeTableName: true,
        underscored: true,
        timestamps: false,
    });

    return Funcionario;
};