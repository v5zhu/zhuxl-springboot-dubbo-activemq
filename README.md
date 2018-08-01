# zhuxl-springboot-dubbo
spring boot 集成的dubbo（基于yml配置）

# 如何使用
### 1.git clone 
git clone https://github.com/v5zhu/zhuxl-springboot-dubbo.git

### 2. 修改配置
修改provider和consumer下的application.yml配置，将zookeeper注册中心修改成自己的注册中心

### 3. 打包
mvn clean package or mvn clean install

### 4.运行服务提供者
java -jar zhuxl-dubbo-provider.jar

### 5.运行服务消费者
java -jar zhuxl-dubbo-consumer.jar

### 6.测试访问
测试工具访问：http://localhost:8102/order/book
参数：{
  "orderId":"123456"
}
