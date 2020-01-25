1. spring-context 会自动将 spring-core、spring-beans、spring-aop、spring-expression 这几个基础 jar 包带进来。
2. IOC 总体来说有两处地方最重要，一个是创建 Bean 容器，一个是初始化 Bean
3. pplicationContext 继承自 BeanFactory，但是它不应该被理解为 BeanFactory 的实现类，而是说其内部持有一个实例化的 BeanFactory（DefaultListableBeanFactory）。以后所有的 BeanFactory 相关的操作其实是委托给这个实例来处理的。
4. 如果需要使用上面这些 ”非 default“ 标签，那么上面的 xml 头部的地方也要引入相应的 namespace 和 .xsd 文件的路径，如下所示。同时代码中需要提供相应的 parser 来解析，如 MvcNamespaceHandler、TaskNamespaceHandler、
ContextNamespaceHandler、AopNamespaceHandler 等。

5. Spring如何检测循环引用: 检查当前线程是否已经在创建该bean
-> A -> B -> A B依赖A -> A依赖B
ThreadLocal<Object> prototypesCurrentlyInCreation
/**
 * Return whether the specified prototype bean is currently in creation
 * (within the current thread).
 * @param beanName the name of the bean
 */
protected boolean isPrototypeCurrentlyInCreation(String beanName) {
    Object curVal = this.prototypesCurrentlyInCreation.get();
	return (curVal != null &&
	(curVal.equals(beanName) || (curVal instanceof Set && ((Set<?>) curVal).contains(beanName))));
}
//依赖String数组 初始化时检测循环依赖
String[] dependsOn = mbd.getDependsOn();
	
	