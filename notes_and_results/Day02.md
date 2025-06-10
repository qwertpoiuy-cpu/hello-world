# Day02

## 一、四大组件

### 1、Activity

提供用户界面和交互

### 2、Service

后台运行的组件

### 3、Broadcast Receiver（广播接收器）

接收和响应广播

### 4、Content Provider（内容提供者）

管理应用程序数据

## 二、Activity生命周期方法

### onCreate()

### onStart()

### onResume()

### onPause()

### onStop()

### onRestart()

### onDestroy()

## 三、Activity启动模式

### 1、standard

每次启动新建实例

### 2、singleTop

若栈顶是目标实例，复用；否则新建

### 3、singleTask

查找任务栈，存在则复用，并清除其上方所有实例，否则新建

### 4、singleInstance

全局唯一实例

## 四、Intent

### 1、显示Intent

指定特定组件

### 2、隐式Intent

不指定特定组件

## 五、Fragment

### 1、静态添加Fragment

在布局中指定

### 2、动态添加Fragment

在代码中创建和管理

## 五、Fragment事务操作类型

### 1、add/remove

添加和移除

### 2、show/hide

显示和隐藏

### 3、replace

替换

### 4、attach/detach

附加到Activity/从Activity分离

### 5、setCustomAnimations

设置过渡动画

### 6、addToBackStack

允许返回键回退事务

### 7、commit/commitNow

提交事务

## 六、Fragment生命周期状态

### 运行

### 暂停

### 停止

### 销毁

## 七、Fragment通信方法

### 与Activity通信

### 外部对外public方法

### Fragment Result API





