'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Empresa = sequelize.define('Empresa',{
      idEmpresa: {
			field: 'idEmpresa',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},	 	
  loginEmpresa:{
			field: 'loginEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},			
    senhaEmpresa:{
			field: 'senhaEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},
    nomeEmpresa:{
			field: 'nomeEmpresa',
			type: DataTypes.STRING,
			allowNull: false
		},
		CNPJ:{
			field: 'CNPJ',
			type: DataTypes.STRING,
			allowNull: false
		},
		telefone:{
			field: 'telefone',
			type: DataTypes.STRING,
			allowNull: false
		},
    email:{
			field: 'email',
			type: DataTypes.STRING,
			allowNull: false
		},
    logradouro:{
			field: 'logradouro',
			type: DataTypes.STRING,
			allowNull: false
		},
    cidade:{
			field: 'cidade',
			type: DataTypes.STRING,
			allowNull: false
		},
    numero:{
			field: 'numero',
			type: DataTypes.INTEGER,
			allowNull: false
		},
    	
complemento:{
			field: 'complemento',
			type: DataTypes.STRING,
			allowNull: false
		},
    	
cep:{
			field: 'cep',
			type: DataTypes.STRING,
			allowNull: false
		},
    bairro:{
			field: 'bairro',
			type: DataTypes.STRING,
			allowNull: false
		},
   
	}, 
	{
		tableName: 'empresa', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Empresa;
};
