CREATE TABLE Empresa  (
    idEmpresa INT IDENTITY(1,1) PRIMARY KEY  NOT NULL,
    loginEmpresa VARCHAR(45) NOT NULL,
    senhaEmpresa VARCHAR(45) NOT NULL,
    nomeEmpresa VARCHAR(45) NOT NULL,
    CNPJ CHAR(14) NOT NULL,
    telefone CHAR(15) NOT NULL,
    email VARCHAR(80) NOT NULL,
    logradouro VARCHAR(45) NOT NULL,
    cidade VARCHAR(45) NOT NULL,
    numero VARCHAR(45) NOT NULL,
    complemento VARCHAR(45) NULL,
    cep CHAR(8) NOT NULL,
    bairro VARCHAR(45) NOT NULL
)

CREATE TABLE Responsavel  (
    idResponsavel INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
    nomeReponsavel VARCHAR(45) NOT NULL,
    CPF CHAR(14) NOT NULL,
    loginResponsavel VARCHAR(45) NOT NULL,
    senhaResponsavel VARCHAR(45) NOT NULL,
    telefone VARCHAR(11) NOT NULL,
    fkEmpresa INT FOREIGN KEY REFERENCES [dbo].[Empresa](idEmpresa) NOT NULL,
)

CREATE TABLE Funcionario (
    idFuncionario INT IDENTiTY(1,1) PRIMARY KEY NOT NULL,
    nomeFuncionario VARCHAR(45) NOT NULL,
    telefone CHAR(15) NOT NULL,
    email VARCHAR(45) NOT NULL,
    loginFuncionario VARCHAR(45) NOT NULL,
    senhaFuncionario VARCHAR(45) NOT NULL,
    fkResponsavel INT FOREIGN KEY REFERENCES [dbo].[Responsavel](idResponsavel)
)

CREATE TABLE Equipamento (
	idEquipamento INT IDENTITY (1,1)  PRIMARY KEY NOT NULL,
	numeroSerie VARCHAR(45) NOT NULL,
	CPU VARCHAR(45) NOT NULL,
	GPU VARCHAR(45)NOT NULL,
	RAM VARCHAR(45) NOT NULL,
	HD VARCHAR(45) NOT NULL,
	fkFuncionario INT FOREIGN KEY REFERENCES [dbo].[Funcionario](idFuncionario)
)
CREATE TABLE Leitura (
	idLeitura INT IDENTITY (1,1)  PRIMARY KEY NOT NULL,
	dataHora DATETIME NOT NULL,
	CPU VARCHAR(45) NOT NULL,
	RAM VARCHAR(45) NOT NULL,
	HD VARCHAR(45) NOT NULL,
	fkEquipamento INT FOREIGN KEY REFERENCES [dbo].[Equipamento](idEquipamento)
)

--Insert de empresa teste no banco manualmente

Insert into Empresa	(
	loginEmpresa, 
	senhaEmpresa, 
	nomeEmpresa, 
	CNPJ, 
	telefone, 
	email, 
	logradouro, 
	cidade, 
	numero, 
	complemento, 
	cep, 
	bairro) 
	values 
 		(
		'Bandtec',
		'Urubu100',
		'Digital School',
		'66864270000159',
		'11994434432',
		'digitalschool@bandtec.com.br',
		'Rua Haddock Lobo', 
		'São Paulo', 
		'513', 
		null, 
		'02324220', 
		'Consolação'
	)
	select * from [dbo].[Empresa]

    INSERT INTO
	[dbo].[Funcionario]
	(
	nomeFuncionario,
	telefone,
	email,
	loginFuncionario,
	senhaFuncionario,
	fkResponsavel
	)
	VALUES 
	(
	'Pedrinho',
	'11983873473',
	'pedrinho@gmail.test',
	'pedrinho',
	'Urubu100',
	1
	)

    select * from [dbo].[Funcionario] 

    -- INSERT INTO 
	-- [dbo].[Leitura]
	-- (
	-- CPU,
	-- RAM,
	-- HD,
	-- fkEquipamento
	-- )
	-- VALUES
	-- (
	-- '',
	-- '10',
	-- '2'
	-- ) mudar depois os campos erro de regra de negócio

    jdbc:sqlserver://procrastinator.database.windows.net:1433;database=procrastinator;user=procrastinator@procrastinator;password={your_passoword_here};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;