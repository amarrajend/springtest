module com.ourkadai.sp.infra {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.web;
    requires spring.core;

    requires java.base;
    requires spring.jdbc;
    requires java.sql;

    opens com.ourkadai.sp to spring.core, spring.beans, spring.context;
    opens com.ourkadai.sp.db to spring.core, spring.beans, spring.context;

    exports com.ourkadai.sp;
}
