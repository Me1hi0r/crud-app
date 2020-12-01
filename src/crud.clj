(ns crud
  (:require [clojure.java.jdbc :as dbc]
            [config :refer [db-prod table-name table-info db-test]])
  (:import (java.time LocalDate)))


(comment
  (def sql-table
    (dbc/create-table-ddl
     table-name
     table-info))

  (def sql-drop
    (dbc/drop-table-ddl
     table-name))

  (dbc/execute!
   db-prod
   [sql-table])

  (def person
    {:fname "Semen22"
     :lname "Voz"
     :address "Os"
     :oms 123876
     :gender "male"
     :dbirth (LocalDate/parse "2006-08-11")})

  (dbc/insert!
   db-prod
   table-name
   person)

  (dbc/query
   db-prod
   [(format "SELECT * FROM %s" (symbol table-name))])

  )
