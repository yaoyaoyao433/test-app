package com.tencent.liteav.f;

import com.tencent.liteav.i.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends c {
    private static f d;
    private List<a.e> e;
    private CopyOnWriteArrayList<a.e> f = new CopyOnWriteArrayList<>();

    public static f a() {
        if (d == null) {
            d = new f();
        }
        return d;
    }

    private f() {
    }

    public void a(List<a.e> list) {
        this.e = list;
        b(this.f);
        if (this.c != null) {
            a(this.c);
        }
    }

    public List<a.e> b() {
        return this.f;
    }

    public void a(com.tencent.liteav.d.e eVar) {
        if (this.a == 0 || this.b == 0 || this.e == null || this.e.size() == 0) {
            return;
        }
        com.tencent.liteav.d.g b = b(eVar);
        for (a.e eVar2 : this.e) {
            if (eVar2 != null) {
                this.f.add(a(eVar2, a(eVar2.b, b)));
            }
        }
    }

    private a.e a(a.e eVar, a.h hVar) {
        a.e eVar2 = new a.e();
        eVar2.b = hVar;
        eVar2.a = eVar.a;
        eVar2.c = eVar.c;
        eVar2.d = eVar.d;
        return eVar2;
    }

    @Override // com.tencent.liteav.f.c
    public void c() {
        super.c();
        b(this.f);
        b(this.e);
        this.e = null;
    }

    protected void b(List<a.e> list) {
        if (list != null) {
            for (a.e eVar : list) {
                if (eVar != null && eVar.a != null && !eVar.a.isRecycled()) {
                    eVar.a.recycle();
                    eVar.a = null;
                }
            }
            list.clear();
        }
    }
}
