### 使用介绍

一、导入jar包

```xml
<dependency>
    <groupId>com.trc</groupId>
    <artifactId>pndaox</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

当然关于Mybatis的依赖还是需要的

二、使用注解

在Dao文件中添加@DaoGen

```java
@DaoGen(primaryKey = "id")
public interface UserDao extends EntityDao<User> {

	List<User> queryByUserNameAndId(@Param("userName") String userName, @Param("id") int id);

	int updateForUserName(@Param("userName") String userName, @Param("id") int id);

	List<User> getListOrderByUserNameWithAsc(User user);
}
```

在该注解中可以自定义ID名、各种操作的前缀名称和各种分隔名

三、编写方法

在Dao文件下进行如下操作

1、插入数据（insert）

```java
int insert(T t);
```

2、批量插入数据

```java
int batchInsert(List<T> items);
```

3、根据某个字段进行获取数据，且返回的是一个Model形式

```java
T findById(int id);
```

> By后跟着检索条件的字段名，如果有多个条件，就在@DaoGen中进行separator属性的配置（分隔符），默认是And

```java
T findByIdAndAge(@Param("id") int id,@Param("age") int age);
```

4、根据某些字段进行获取数据，且返回的是列表的形式

```java
List<T> queryByUserName(String userName);
```

> By后跟着检索条件的字段名，如果有多个条件，就在@DaoGen中进行separator属性的配置（分隔符），默认是And

5、获取某个字段特定值的数据

```java
List<T> queryInIds(@Param("ids") Collection<Integer> ids);
```

6、更新数据

```java
int update(T t);
```

7、更新某些字段

```java
int updateForUserName(@Param("userName") String userName, @Param("id") int id);
```

> 其默认以主键作为限定条件

8、删除数据

```java
int removeById(@Param("id") String id)
```

9、根据Model作为条件，获取列表数据

```java
List<T> getListOrderByUserNameWithAsc(T t);
```

10、使用分页

```java
List<T> queryAll(RowBounds rowBounds);
```