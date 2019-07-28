# jenkins

## building the new image:
```bash
docker build -t myjenkins:1.0 .
```

## running myjenkins:
```bash
docker run --name myjenkins -d -p 8080:8080 -p 50000:50000 myjenkins:1.0
```
The Jenkins console will be available at http://localhost:8080


## executing commands in myjenkins container:
```bash
docker exec -it myjenkins bash
```


## stopping and removing myjenkins container:
```bash
docker stop $(docker ps -a | grep myjenkins | awk '{print $1}')
docker rm $(docker ps -a | grep myjenkins | awk '{print $1}')
```

