package singleton;

/**
 * @author Grey
 * @date 2020/4/9
 */
// 只有这种单例可以防止反射破坏
// 以下是枚举类型的单例模式不会被反射破坏的原因：
//1. 枚举类型的构造函数是私有的，无法通过反射获取。
//2. 枚举类型的构造函数在类加载时就会被调用，因此即使通过反射获取了构造函数，也无法创建新的实例。
//因此，枚举类型的单例模式是唯一不会被反射破坏的单例模式。
public enum Singleton8 {
    INSTANCE;
}
