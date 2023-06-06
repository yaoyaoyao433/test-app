package com.xiaomi.push;
/* loaded from: classes6.dex */
public class cr {
    private static volatile cr b;
    public cq a;

    public static cr a() {
        if (b == null) {
            synchronized (cr.class) {
                if (b == null) {
                    b = new cr();
                }
            }
        }
        return b;
    }
}
