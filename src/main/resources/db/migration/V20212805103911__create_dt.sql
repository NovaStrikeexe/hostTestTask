CREATE SCHEMA IF NOT EXISTS archivist;

GRANT USAGE ON SCHEMA archivist to archi;

CREATE TABLE archivist.dateSave(
    "id" integer PRIMARY KEY,
    "userId" integer NOT NULL,
    "cardNumber" varchar(20) NULL,
    "lastName" varchar(30) NULL,
    "firstName" varchar(30) NULL,
    "middleName" varchar(30) NULL,
    "snils" varchar(15) NULL,
    "enp" varchar (20) NULL,
    "birthDate" DATE NULL,
    "remdResult" varchar(10) NOT NULL,
    "codeMo" varchar (35)NULL,
    "date_insert" DATE NOT NULL,
    "date_update" DATE NOT NULL
);

-- Column comments

COMMENT ON COLUMN archivist.dateSave."id" IS 'Айдишник записи';
COMMENT ON COLUMN archivist.dateSave."userId" IS 'Айдишник пользователя';
COMMENT ON COLUMN archivist.dateSave."cardNumber" IS 'Номер медицинской карты';
COMMENT ON COLUMN archivist.dateSave."lastName" IS 'Фамилия пациента';
COMMENT ON COLUMN archivist.dateSave."firstName" IS 'Имя пациента';
COMMENT ON COLUMN archivist.dateSave."middleName" IS 'Отчество пациента';
COMMENT ON COLUMN archivist.dateSave."snils" IS 'Номер снилс (Страховой номер индивидуального лицевого счёта)';
COMMENT ON COLUMN archivist.dateSave."enp" IS 'Номер полиса ОМС (Обязательного медицинского страхования)';
COMMENT ON COLUMN archivist.dateSave."birthDate" IS 'Дата рождения пациента';
COMMENT ON COLUMN archivist.dateSave."remdResult" IS 'Результат отправки в рэмд (реестр элеĸтронных медицинсĸих доĸументов)';
COMMENT ON COLUMN archivist.dateSave."codeMo" IS 'Код медицинсĸой организации';
COMMENT ON COLUMN archivist.dateSave."date_insert" IS 'Дата создания записи';
COMMENT ON COLUMN archivist.dateSave."date_insert" IS 'Дата изменения записи';

-- Permissions

GRANT SELECT ON ALL TABLES IN SCHEMA archivist TO archi;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA archivist TO archi;