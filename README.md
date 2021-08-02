# Zero 中文教程
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.vertxup/vertx-zero/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/cn.vertxup/vertx-zero/)  [![Apache License 2](https://img.shields.io/badge/license-ASF2-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)  [![Build Status](https://travis-ci.org/silentbalanceyh/vertx-zero.svg?branch=master)](https://travis-ci.org/silentbalanceyh/vertx-zero) 
## 0.楔子

　　Zero，又称为：“零”，最初的名字起源于高达W中的“飞翼零式”，其实那时想写个框架，最好是：零编码、零配置、零BUG——也许这只是个遥远的梦。从正式官方网站的英文教程问世后，就再也没有更新过教程了，于是重新开启“零”的大门，只是我依旧在尝试将教程写得更加梦幻，最初的落笔点就是名字，包括项目名字、章节名字。

　　有人说Zero只有后端，其实相反，它还包含一套定制过的前端，虽然不是符合所有人的胃口，但是，从目前已经上线的几个生产系统看来，也简化了不少开发的工作量。于是通过“**闯关**”的方式来写一条类似游戏攻略一样的东西，说不定把读者当做玩家，简而精，能提炼更好的心得呢？

## 1. 资源

　　Zero相关的资源表

| 在线地址 | 说明 |
|---|:---|
| <http://www.vertxup.cn> | Zero，后端框架 |
| <http://www.vertxui.cn> | Zero UI，前端框架 |
| <http://www.vertxai.cn> | Zero 工具集 |

　　Zero公众号（申请微信群先加微信号：445191171）：

![](./_image/2020-03-07/2020-03-07-13-24-07.jpg)

## 2. 教程

>  我一直在思考使用什么样的方式来写教程，如果告别了曾经那种概念，是不是会写成空中楼阁一样只有代码和“招式”的东西，沉淀下来，还是简单点吧（图、代码、解说一步到位），不过项目名称还是沿用希腊神话中的诸神之名，含义为：以诸神之名开启零之誓约。

　　Zero目前的版本中仅支持Maven，最新版为`0.6.0`，一直以`0`前缀做版本号，是因为我在收集生产环境的运行数据，当然我希望它的`1.0`是经过了生产环境验证的框架，成为一个真正可用的框架，而不是简单的样子货而已。


### 环境

　　在您的Maven项目的 `pom.xml` 文件中引入以下配置（推荐使用正式版）：

```xml
    <parent>
        <artifactId>vertx-import</artifactId>
        <groupId>cn.vertxup</groupId>
        <version>0.5.4</version>
    </parent>
```

　　然后书写主程序：

```java
package cn.vertxup;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

@Up
public class ApolloUp {

    public static void main(final String[] args) {
        VertxApplication.run(ApolloUp.class);
    }
}
```

　　启动该程序，您将在控制台看到如下信息，就证明Zero系统成功启动：

```shell
[ ZERO ] ( Http Server ) ZeroHttpAgent Http Server has been started successfully. 
         Endpoint: http://198.18.21.28:6083/.
```

## 3. 后端教程（Zero）

### 3.1. 零之遥（Απόλλων）

* [1.1.启航：Zero](document/apollo/001.apollo.first.md)
* [1.2.曲径通幽：@Path](document/apollo/002.apollo.uri.md)
* [1.3.四叶葎：Http方法](document/apollo/003.apollo.method.md)
* [1.4.思无邪：入参](document/apollo/004.apollo.param.md)
* [1.5.孤城暗雪：验证](document/apollo/005.apollo.validation.md)
* [1.6.潘多拉魔盒：异步](document/apollo/006.apollo.async.md)
* [1.7.虚之墙：安全](document/apollo/007.apollo.security.md)
* [1.8.珠玉在侧：容错](document/apollo/008.apollo.error.md)

### 3.2. 侧庭石（Παράπλευρη δικαστική πέτρα）

* [2.1.珷玞：Jooq](document/athena/001.athena.jooq.md)

## 4. 前端教程（Zero Ui）

>  为了将教程全部集中到一起讲解，所以补充Zero Ui的文档追加在Zero之后讲解。

### 4.1. 顾河梁（Κοιτάζοντας πίσω στο ποτάμι）

* [1.1.初赦：Zero Ui](document/ui/001.ui.structure.md)

## COPYRIGHT IN CHINA




