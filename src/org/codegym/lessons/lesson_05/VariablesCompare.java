//package org.codegym.lessons.lesson_05;
//
//
//import org.openjdk.jol.vm.VM;
//
//
///**
// * @desc: 基本数据类型和String（引用类型）比较方法 (重点&&难点）
// *
// * 1.Java 基本类型的包装类的大部分都实现了常量池技术，即 Byte,Short,Integer(-128~127),Long,Character,Boolean。
// *   两种浮点数类型的包装类 Float,Double 并没有实现常量池技术。
// *
// * 2.用 == 做比较的时候，基本类型只是比较变量的值，而引用类型是比较对象的内存地址。
// * 3.用 equals()方法做字符串比较的时候，只比较值。
// *
// *
// * @author: zhailihu
// * @date: 06/02/2022 23:03
// *
// */
//public class VariablesCompare {
//    public static void main(String[] args) {
//
//        //constant pool
////        int a =  1275;
////        int b =  1270;
//
////        Integer c = new Integer(1270);
////        Integer d = new Integer(1270);
//
//        //引用类型   「abc」=> 常量池
//        String str1 = "abc";
//        String str2 = "abc";
//        String str3 = new String("abc");
//        System.out.println( str1.equals(str3)  );
//
//
//        //non constant pool
////        double d1 = 15.55;
////        double d2 = 16.66;
////        double d3 = 15.55;
//
//
//
////        System.out.println("======================= Print Variables Memory Address =======================");
////        System.out.println("a:" + Long.toHexString(VM.current().addressOf(a)));
////        System.out.println("b:" + VM.current().addressOf(b));
////        System.out.println("a == b: " + ( a == b) );
////
//        System.out.println("str1:" + VM.current().addressOf(str1));
//        System.out.println("str2:" + VM.current().addressOf(str2));
//        System.out.println("str3:" + VM.current().addressOf(str3));
////        System.out.println("str3.equals(str2)" + str3.equals(str2));
////
////
////        System.out.println("d1:" + VM.current().addressOf(d1));
////        System.out.println("d2:" + VM.current().addressOf(d2));
////        System.out.println("d3:" + VM.current().addressOf(d3));
//
//    }
//}
