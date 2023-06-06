package com.tencent.liteav.c;

import com.tencent.liteav.i.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    private static f a;
    private List<a.i> b;

    public static f a() {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new f();
                }
            }
        }
        return a;
    }

    public void a(List<a.i> list) {
        this.b = list;
    }

    public a.i b() {
        if (this.b == null || this.b.size() == 0) {
            return null;
        }
        return this.b.get(0);
    }

    public void c() {
        if (this.b != null) {
            this.b.clear();
        }
        this.b = null;
    }
}
