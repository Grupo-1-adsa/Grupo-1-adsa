	'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('Usuario',{
		idResponsavel: {
			field: 'idResponsavel',
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},
		cpf:{
			field: 'CPF',
			type: DataTypes.STRING,
			allowNull: false
		},
		loginResponsavel:{
			field: 'loginResponsavel',
			type: DataTypes.STRING,
			allowNull: false
		},
		password:{
			field: 'senhaResponsavel',
			type: DataTypes.STRING,
			allowNull: false
		},
		telefone:{
			field: 'telefone',
			type: DataTypes.STRING,
			allowNull: false
		},
		fkEmpresa: {
      field: 'fkEmpresa',
      type: DataTypes.INTEGER,
      allowNull: false
    },	
		username: {
			field: 'nomeResponsavel',
			type: DataTypes.STRING,
			allowNull: false
		},
		tipo: {
			field: 'tipo',
			type: DataTypes.STRING,
			allowNull: false
		}
	}, 
	{
		tableName: 'responsavel', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
