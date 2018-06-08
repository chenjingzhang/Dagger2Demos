# Dagger2Demos

     dagger2demo22  
1懒加载 
2Provider
3Qualifier
4Singleton/@Scole


     dagger2demo33
Component的依赖关系: Component之间存在一种依赖关系，如果一个Component无法提供某些对象的注入， 那么它可以依赖其他的可以提供该对象的Component来完成注入

     dagger2demo44
 子Component将会有父Component的注入能力，并且可以在父Component的基础上增强注入能力。
 这里父子Component并不真正具有java中类的继承关系，而应该只是一种扩展关系。    
   
  dagger2demo55
  
  .Android的注入

   1. AndroidInjection.inject(this);
   会获取demoApplication中的dispatchingActicityInjector

   2通过dispatchingFragmentInjector找到对应MainActivity的 AndroidInjector.Factory
   即MainActicitySubComponent类中的buidler,

  3.然后使用buidler创造MainActicity的注入器 AndroidInjector  即MainActicitySubComponent
 
  4.最终使用MainActicitySubComponent完成对MainActivity的注入
