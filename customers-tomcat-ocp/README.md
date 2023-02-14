Create postgresql database:

oc new-app postgresql-ephemeral \
  -p DATABASE_SERVICE_NAME=customers-db \
  -p POSTGRESQL_DATABASE=customers
