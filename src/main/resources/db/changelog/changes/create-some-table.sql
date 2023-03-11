--liquibase formatted sql
--changeset <oryshak>:<create-some-table>
CREATE TABLE IF NOT EXISTS public.names (
    id bigint NOT NULL,
    name character varying (256) NOT NULL,
    CONSTRAINT names_pk PRIMARY KEY(id)
    );

--rollback DROP TABLE public.names;
