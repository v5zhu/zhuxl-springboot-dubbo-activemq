# zhuxl-springboot-dubbo
spring boot 集成的dubbo（基于yml配置）

#简介
消息队列中间件用于系统间解耦，增加系统的响应速度,
以下耗时项目中采用主线程阻塞5秒来模拟实现系统耗时
（1）加入消息前：
下单操作（5秒）->减库存（5秒）->响应
总共耗时：10秒
（2）加入消息后：
下单操作（5秒）->响应
 
 发消息↓ ↑消息确认

减库存（5秒）
总共耗时：5秒

结论：加入消息队列中间件后，系统之间的串行模式改成了并行模式，系统复杂性增加了，但系统的性能得到了明显提升
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
