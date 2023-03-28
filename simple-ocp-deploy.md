## Setup

This demo has been developed using the following setup:

- OpenShift Container Platform 4.12
- Red Hat OpenShift Pipelines Operator 1.6.2 (Tekton 0.28.3)

## Manual deployment in OCP

Create a coolstore project

Install pipelines operator

`oc new-project coolstore`
### Deploy customers service

Deploy postgresql for customers service

`oc new-app \
    --name="customers-db" \
    -e POSTGRESQL_USER=customers \
    -e POSTGRESQL_PASSWORD=customers \
    -e POSTGRESQL_DATABASE=customers \
     --image-stream="openshift/postgresql:13-el7"`

Run `helm install -f helm/customers-tomcat-ocp/values.yaml customers helm/customers-tomcat-ocp/`

run `oc apply -f ./ocp-deploy/customers-pipeline-run.yaml`

## deploy order service

`oc new-app \
    --name="postgresql-orders" \
    -e POSTGRESQL_USER=orders \
    -e POSTGRESQL_PASSWORD=orders \
    -e POSTGRESQL_DATABASE=orders \
     --image-stream="openshift/postgresql:13-el7"`

Run `helm install -f helm/orders/values.yaml orders helm/orders/`
     
## deploy inventory service

`oc new-app \
    --name="postgresql-inventory" \
    -e POSTGRESQL_USER=inventory \
    -e POSTGRESQL_PASSWORD=inventory \
    -e POSTGRESQL_DATABASE=inventory \
     --image-stream="openshift/postgresql:13-el7"`

     Run `helm install -f helm/inventory/values.yaml inventory helm/inventory/`

## deploy gateway service

Run `helm install -f helm/gateway/values.yaml gateway helm/gateway/`
       
## deploy frontend service

Run `helm install -f helm/frontend/values.yaml frontend helm/frontend/`

## Accessing the front-end

Click on the external link from the ordersfrontend deployment.  You will see a ui as shown below:

![Coosltore](docs/images/globex-customers.png "Customers page")