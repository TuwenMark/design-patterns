原型模式就是拷贝对象，包括深拷贝和浅拷贝

浅拷贝：对于基本数据类型、String类型的属性，拷贝的是值。而其他对象属性的字段，拷贝的是内存地址。原对象和拷贝对象的属性都指向同一个属性对象。
深拷贝：所有类型的属性都会将它们的值拷贝一份，直至穷尽所有相关对象的所有属性。

实现浅拷贝：使用默认的clone()方法，即super.clone()
实现深拷贝：① 自定义clone()方法，内部调用所有对象属性的clone()方法。（需要所有对象属性也都实现了深拷贝）② 利用序列化和反序列化。（推荐）
