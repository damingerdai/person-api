# person-api

基于spring boot和mybatis的crud项目

## Set Up

### Create Docker Network

```shell
docker network create person-network
```

### Create Docker Volume

```shell
docker volume create --name=person-volume
```

### Create Database


```shell
docker-compose up db
```