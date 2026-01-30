# Java Notes
```java
int x; // 声明int类型变量x
x = 234; // 赋值
byte b = 89; // 声明并赋值
boolean isFun = true; // 布尔值
double d = 3456.98; // 双精度浮点数
char c = 'f'; // 字符（单引号）
long big = 3456789L; // long类型需加L/l后缀
float f = 32.5f; // float类型需加F/f后缀
```
## Character

        ```java
        char c = 'A';                      // single char

        String s = "multiple characters"; // string (multiple characters)

        String text = """
        line1
        line2
        """;                             // multi-line text block (preserves newlines)

        // String 空字符串 vs null
        String empty = ""; // 空字符串，length() == 0
        String none = null;  // null 引用
        ```
## Type Conversion / 类型转换

- **隐式类型转换（自动转换）Implicit Conversion**
        - 小范围 → 大范围：自动完成（如 int → double）
        ```java
        int i = 10;
        double d = i; // int 自动转 double
        ```

- **显示类型转换（强制转换）Explicit Conversion (Casting)**
        - 大范围 → 小范围：需强制转换，否则报错（如 double → int）
        ```java
        double d2 = 3.14;
        int i2 = (int)d2; // 强制类型转换，结果为 3
        ```

- **字符与数字的转换**
        ```java
        char c = 'A';
        int code = c;      // char 隐式转 int，结果 65
        char c2 = (char)66; // int 显式转 char，结果 'B'
        ```
```

## Data Types / 数据类型

- **Primitive / 原始类型 (size):**
	- `byte` 1 byte
	- `short` 2 bytes
	- `int` 4 bytes
	- `long` 8 bytes
	- `float` 4 bytes
	- `double` 8 bytes
	- `char` 2 bytes
	- `boolean`

## Keyboard Input / 从键盘读取

- `java.util.Scanner`

        ```java
        import java.util.Scanner;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();              // 读取整数

        double d = sc.nextDouble();        // 读取浮点数
        sc.nextLine();                     // 消耗行尾缓冲区换行符

        String line = sc.nextLine();       // 读取整行（包含空格）

        sc.close();                         //释放底层资源
                        ```


## Operations / 运算符

- 算术运算 (Arithmetic): `+ - * / %`

        ```java
        int a = 7, b = 2;
        int r1 = a + b; // 9
        int r2 = a / b; // 3  （整数除法，余数被丢弃）
        double r3 = (double)a / b; // 3.5（浮点除法）
        int mod = a % b; // 1
        double pow = Math.pow(a, b); // 幂运算，a 的 b 次方（如 7^2=49）
        double sqrt = Math.sqrt(a); // 平方根运算
        ```
不同类型间不能进行运算，java会自动进行隐式转换
注意整数相除结果还是整数，就是商，没有余数
小数直接参与计算，结果可能不正确


- 一元运算 (Unary): `+ - ++ -- !`
```java
int x = 1;
int y = ++x; // 前缀++：先增后用（x=2, y=2）
int z = x++; // 后缀++：先用后增（z=2, x=3）
boolean bnot = !(true); // 逻辑非
```

- 关系运算 (Relational): `> < >= <= == !=`
```java
boolean eq = (a == b);
boolean lt = (a < b);
```

- 逻辑运算 (Logical): `&& || !`（`&&`/`||` 有短路特性 and遇F直接结束 or遇T直接结束）
```java
boolean cond = (a > 0) && (b > 0); // 如果左边为 false，右边不会计算
```
短路逻辑运算符


- 三元运算 (Ternary): `?:`
```java
int max = (a > b) ? a : b;
```

- 位运算 (Bitwise): `& | ^ ~ << >> >>>`（用于整数）
```java
int bits = 1 << 3; // 左移：8
```

- 关键字 `instanceof`：类型检查
```java
String s2 = "hi";
boolean isStr = s2 instanceof String; // true
```

类型转换
隐式转换：小转大 byte short int long float double 
核心就是在前面补0凑bit位
        byte b = 10; // 8位:   00001010
        short s = b; // 16位:  00000000 00001010
        int i = s;   // 32位:  00000000 00000000 00000000 00001010
        long l = i;  // 64位:  00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001010

        float f = i; // int转float，数值不变，精度提升（补0在二进制表示的高位）
        double d = f; // float转double，补0扩展到64位

如果是byte/short类型数据进行运算，java会自动先提升为int类型
        // 例：
        byte b1 = 10, b2 = 20;
        // byte b3 = b1 + b2; // 错误，b1+b2结果是int，不能直接赋值给byte
        int sum = b1 + b2;    // 正确，b1+b2自动提升为int

如果小跟大进行运算，java会自动先把小的提升为大的
        // 例：
        int i = 10;
        double d = 3.14;
        double result = i + d; // i 自动提升为 double，结果是 double 类型

char 本质上就是一个数字（Unicode 编码/ASCII 编码），但打印时会显示对应的字符。
char 和 int 可以互相转换：char 转 int 得到编码，int 转 char 得到字符。



强制/显式转换：大转小
目标类型 变量名 = （目标类型）数据
        // 例：
        double d = 3.99;
        int i = (int)d;         // i = 3，强制类型转换，直接截断小数部分
        // 例：
        byte b1 = 10, b2 = 20;
        byte b3 = (byte)(b1 + b2);      // b3=30 强制转回byte，b1+b2结果先被自动提升为int，再手动强制转回byte
        byte b4 = (byte)b1 + b2;       // 实际等价于 (byte)b1 + b2，即10+20=30，(byte)30=30，b4=30
        // 但如果是 byte b5 = (byte)(b1 + 130); // b1=10, 10+130=140, (byte)140=-116（超出byte范围，溢出）




字符运算
会查询ASCII
大小写转换：大到小差32
```java
char letter1 = "A";     //大写
char letter2 = (char)(letter1 + 32);    //小写

```


字符串运算：只有+的拼接操作
从左往右依次进行
```java
System.out.println(1 + 8 + "岁" + 1 + 2); // 输出: 9岁12
```





数组
```java
int arr[] = new int[]{}
int arr[] = {}

//动态
int arr[] = new int[5]
```
遍历数组的快速生成方式
数组名.fori 回车



格式化代码
crtl alt L


```java
Random = new random()
```