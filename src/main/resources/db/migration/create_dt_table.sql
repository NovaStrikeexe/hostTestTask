CREATE SCHEMA IF NOT EXISTS archivist;

GRANT USAGE ON SCHEMA archivist to archi;

CREATE TABLE archivist.dt_table(
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

COMMENT ON COLUMN archivist.dt_table."id" IS 'Айдишник записи';
COMMENT ON COLUMN archivist.dt_table."userId" IS 'Айдишник пользователя';
COMMENT ON COLUMN archivist.dt_table."cardNumber" IS 'Номер медицинской карты';
COMMENT ON COLUMN archivist.dt_table."lastName" IS 'Фамилия пациента';
COMMENT ON COLUMN archivist.dt_table."firstName" IS 'Имя пациента';
COMMENT ON COLUMN archivist.dt_table."middleName" IS 'Отчество пациента';
COMMENT ON COLUMN archivist.dt_table."snils" IS 'Номер снилс (Страховой номер индивидуального лицевого счёта)';
COMMENT ON COLUMN archivist.dt_table."enp" IS 'Номер полиса ОМС (Обязательного медицинского страхования)';
COMMENT ON COLUMN archivist.dt_table."birthDate" IS 'Дата рождения пациента';
COMMENT ON COLUMN archivist.dt_table."remdResult" IS 'Результат отправки в рэмд (реестр элеĸтронных медицинсĸих доĸументов)';
COMMENT ON COLUMN archivist.dt_table."codeMo" IS 'Код медицинсĸой организации';
COMMENT ON COLUMN archivist.dt_table."date_insert" IS 'Дата создания записи';
COMMENT ON COLUMN archivist.dt_table."date_insert" IS 'Дата изменения записи';

-- Permissions

GRANT SELECT ON ALL TABLES IN SCHEMA archivist TO archi;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA archivist TO archi;