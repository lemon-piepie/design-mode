## 适配器模式
### 定义
将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
### 类型
+ 类结构型模式（耦合度更高）
+ 对象结构型模式
### 结构
+ 目标接口（接口）：当前系统业务所期待的接口
+ 适配者：被访问和适配的，现存组件库中的组件接口
+ 适配器：继承或引用适配者，将适配者接口转换成目标接口