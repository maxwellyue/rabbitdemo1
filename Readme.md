### 安装并运行Rabbit服务器

环境mac 10.12.5

* 安装
在Mac OS X中使用brew工具，可以很容易的安装RabbitMQ的服务端，只需要按如下命令操作即可：
```
# brew更新到最新版本，执行：
brew update
# 安装Erlang，执行：(一般默认mac会安装，这一步可省略)
brew install erlang
# 安装RabbitMQ Server，执行：
brew install rabbitmq
```
* 配置环境变量

通过上面的命令，RabbitMQ Server的命令会被安装到/usr/local/sbin，并不会自动加到用户的环境变量中去，

所以需要在.bash_profile文件中增加下面内容：
```
PATH=$PATH:/usr/local/sbin
```

* 启动服务
```
# 启动RabbitMQ的服务端，执行
rabbitmq-server
```


* 访问

localhost:15672

用户名和密码均为：guest

可以在打开的页面中，点击Admin，添加用户。


### 使用spring boot 快速搭建应用

* RabbitConfig：配置Rabbit
* User：测试用的发送实体消息
* RabbitReceiver：消息接受
* RabbitSender：消息发送
* application.properties：Rabbit服务的参数等
