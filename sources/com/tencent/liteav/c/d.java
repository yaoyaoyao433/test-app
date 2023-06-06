package com.tencent.liteav.c;

import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    private static d a;
    private final LinkedList<com.tencent.liteav.d.f> b = new LinkedList<>();
    private com.tencent.liteav.d.f c;

    public static d a() {
        if (a == null) {
            a = new d();
        }
        return a;
    }

    private d() {
    }

    public void a(com.tencent.liteav.d.f fVar) {
        this.c = fVar;
        this.b.add(fVar);
    }

    public com.tencent.liteav.d.f b() {
        return this.c;
    }

    public void c() {
        if (this.b.size() == 0) {
            return;
        }
        this.b.removeLast();
    }

    public List<com.tencent.liteav.d.f> d() {
        return this.b;
    }

    public void e() {
        this.b.clear();
    }
}
