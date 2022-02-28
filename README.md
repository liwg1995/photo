### 打包
```
mvn clean
mvn install
```

### 访问
- 将生成的`war`包解压导入`tomcat`的`ROOT`目录下，运行`startup.sh`脚本运行`tomcat`即可

#### 前台
- http://<IP:8080>

#### 后台
- http://<IP:8080>/manage/login.html
> 默认账号及密码：`admin/admin`
