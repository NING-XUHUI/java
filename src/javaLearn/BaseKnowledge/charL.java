package javaLearn.BaseKnowledge;

/**
 * char 是一个单一的16位Unicode字符
 * 最小值是\u0000（即0）
 * 最大值是\uffff（即65535）
 * char数据类型可以存储任何字符
 */
public class charL {
    public static void main(String[] args) {
        char a = 'a';
        char b = 97;
        //根据ascii码转换为a
        char c = '我';
        char d = '\u4e00';
        //"一"字 \u4e00 - \u9fa5 两万多的汉字
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
