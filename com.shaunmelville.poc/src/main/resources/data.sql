CREATE TABLE IF NOT EXISTS public."users"
(
    username character varying(254) COLLATE pg_catalog."default" NOT NULL,
    password character varying(254) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "username_pkey" PRIMARY KEY (username)
);

CREATE TABLE IF NOT EXISTS public."student"
(
    firstname character varying(254) COLLATE pg_catalog."default" NOT NULL,
    student_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(254) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Student_pkey" PRIMARY KEY (student_uuid)
);

CREATE TABLE IF NOT EXISTS public."subject"
(
    subject_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    name character varying(254) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "class_pkey" PRIMARY KEY (subject_uuid, name)
);

CREATE TABLE IF NOT EXISTS public."attendance"
(
    attendance_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    student_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    subject_schedule_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    date date NOT NULL,
    CONSTRAINT "attendance_pkey" PRIMARY KEY (attendance_uuid)
);

CREATE TABLE IF NOT EXISTS public."subject_schedule"
(
    subject_schedule_uuid character varying(50) COLLATE pg_catalog."default" NOT NULL,
    datetime_from timestamp without time zone NOT NULL,
    datetime_to timestamp without time zone NOT NULL,
    subject_uuid character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "subject_schedule_pkey" PRIMARY KEY (subject_schedule_uuid)
);

INSERT INTO users VALUES ('shaun@shaunmelville.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6') ON CONFLICT DO NOTHING;
INSERT INTO users VALUES ('amanda@email.com', '$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6') ON CONFLICT DO NOTHING;