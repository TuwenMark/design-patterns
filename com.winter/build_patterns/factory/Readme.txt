1. 普通写法
一个维度：口味

pizza抽象类
pizza实体类  →  抽象类
pizza订购类  →  根据种类订购不同的pizza
客户端  →  输入订购的pizza种类

2. 简单工厂
一个维度：口味

pizza抽象类
pizza实体类  →  抽象类
pizza工厂类：封装根据type生成pizza的逻辑
pizza订购类：直接通过工厂生成pizza
客户端  →  输入订购的pizza种类

3. 工厂方法
两个维度：地理位置、口味

pizza抽象类
pizza实体类  →  抽象类
pizza工厂抽象类：封装工厂方法，根据地理位置创建不同的工厂
pizza工厂类：封装根据type生成pizza的逻辑
    pizza订购类：直接通过抽象工厂生成pizza
客户端  →  输入订购的pizza种类
