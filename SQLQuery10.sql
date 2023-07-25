/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [FullName]
      ,[Email]
      ,[Password]
      ,[SignupID]
  FROM [TXInstitute].[dbo].[signup]

  CREATE TABLE dbo.signup (
	[SignupID] [int] identity(1,1) primary key,
	[FullName] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	)

	  CREATE TABLE dbo.signup (
	[SignupID] [int],
	[FullName] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	)

drop table signup

ALTER TABLE signup DROP COLUMN SignupID
ALTER TABLE signup ADD SignupID INT IDENTITY(1,1)

SET IDENTITY_INSERT signup ON;




CREATE TABLE [dbo].[home](
	[IndexNo] [int] NOT NULL,
	[Subject] [varchar](50) NOT NULL,
	[Grade] [varchar](50) NOT NULL,
 CONSTRAINT [PK_home] PRIMARY KEY CLUSTERED 
(
	[IndexNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[home](
	[IndexNo] [int] NOT NULL,
	[Subject] [varchar](50) NOT NULL,
	[Grade] [varchar](50) NOT NULL,
	PRIMARY KEY (IndexNo)
	)
GO

SELECT TOP (1000) [IndexNo]
      ,[Subject]
      ,[Grade]
  FROM [TXInstitute].[dbo].[home]

  drop table home;

  USE TXINstitute;
  
  CREATE TABLE [dbo].[home](
	[Id] [int] PRIMARY KEY identity(1,1),
	[IndexNo] [int] NOT NULL,
	[Subject] [varchar](50) NOT NULL unique ,
	[Grade] [varchar](50) NOT NULL
	)
GO



  CREATE TABLE [dbo].[home](
	[IndexNo] [int] PRIMARY KEY identity(1,1),
	[Subject] [varchar](50) NOT NULL unique ,
	[Grade] [varchar](50) NOT NULL
	)
GO
select * from home;
