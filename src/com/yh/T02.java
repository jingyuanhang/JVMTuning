package com.yh;

/**
 *
 * @author jingyuanhang
 * @date 2017/10/17
 * -XX:-DoEscapeAnalysis -XX:-EliminateAllocations -XX:+PrintGCDetails   -XX:-UseTLAB
 * 关闭逃逸分析   关闭标量替换    打印GC详细信息
 *
 */
public class T02 {
    public static void main(String[] args) {
        byte[] b = new byte[1024];
    }
}
