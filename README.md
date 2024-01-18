# ibm_java-aws

1. sudo apt update
2. sudo apt install mysql-server
sudo systemctl start mysql.service
sudo mysql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
exit
mysql -u root -p

===============

udo apt install docker.io
sudo docker run --name mysql -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root --restart unless-stopped mysql:8
sudo docker exec -it mysql mysql -p
