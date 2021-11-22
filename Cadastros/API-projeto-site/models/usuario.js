	'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{	
		idEmpresa: {
			field: 'idEmpresa',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},
		nomeEmpresa: {
			field: 'nomeEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},
		loginEmpresa: {
			field: 'loginEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},
		senhaEmpresa: {
			field: 'senhaEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},
		cnpj: {
			field: 'CNPJ',
			type: DataTypes.INTEGER,
			allowNull: false
		},
		cep: {
			field: 'cep',
			type: DataTypes.INTEGER,
			allowNull: false
		},
		bairro: {
			field: 'bairro',
			type: DataTypes.STRING,
			allowNull: false
		},
		logradouro: {
			field: 'logradouro',
			type: DataTypes.STRING,
			allowNull: false
		},
		cidade: {
			field: 'cidade',
			type: DataTypes.STRING,
			allowNull: false
		},
		complemento: {
			field: 'complemento',
			type: DataTypes.STRING,
			allowNull: false
		},
		numero: {
			field: 'numero',
			type: DataTypes.INTEGER,
			allowNull: false
		},
		telefone: {
			field: 'telefone',
			type: DataTypes.INTEGER,
			allowNull: false
		},
		email: {
			field: 'email',
			type: DataTypes.STRING,
			allowNull: false
		},
	
	}, 
	{
		tableName: 'Empresa', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
