(ns config)

(def db-prod
  {:dbtype "postgresql"
   :dbname "postgres"
   :host "165.227.141.189"
   :user "postgres"
   :password "dbpass"})

(def pg-test
  {:dbtype "postgresql"
   :dbname "postgres"
   :host "165.227.141.189"
   :user "postgres"
   :password "dbpass"})

(def table-info
  [[:id "serial primary key"]
   [:fname "varchar(15) not null"]
   [:lname "varchar(15) not null"]
   [:gender "varchar(6) not null"]
   [:dbirth "date"]
   [:address "varchar(1000) not null"]
   [:oms "int not null"]])

(def table-name :character)
