# Java Notes

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

- 逻辑运算 (Logical): `&& || !`（`&&`/`||` 有短路特性）
```java
boolean cond = (a > 0) && (b > 0); // 如果左边为 false，右边不会计算
```

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
