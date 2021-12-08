'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Equipamento = sequelize.define('Equipamento', {
      idEquipamento: {
            field: 'idEquipamento',
            type: DataTypes.INTEGER,
            primaryKey: true,
            autoIncrement: true
        },
        numeroSerie: {
            field: 'numeroSerie',
            type: DataTypes.STRING,
            allowNull: false
        },
        CPU: {
            field: 'CPU',
            type: DataTypes.STRING,
            allowNull: false
        },
        RAM: {
            field: 'RAM',
            type: DataTypes.STRING,
            allowNull: false
        },
        HD: {
            field: 'HD',
            type: DataTypes.STRING,
            allowNull: false
        },
       
        fkFuncionario: {
            field: 'fkFuncionario',
            type: DataTypes.INTEGER,
            allowNull: false
        },
        SO: {
            field: 'SO',
            type: DataTypes.STRING,
            allowNull: false
        },
        data: {
          field: 'data',
          type: DataTypes.DATE, // NÃO existe DATETIME. O tipo DATE aqui já tem data e hora
          allowNull: false
        },
        statusEquip: {
          field: 'statusEquip',
          type: DataTypes.STRING,
          allowNull: false
      },
    }, {
        tableName: 'equipamento',
        freezeTableName: true,
        underscored: true,
        timestamps: false,
    });

    return Equipamento;
};