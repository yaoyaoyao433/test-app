package com.tencent.liteav.f;

import com.tencent.liteav.i.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h extends c {
    private static h d;
    private List<a.k> e;
    private CopyOnWriteArrayList<a.k> f = new CopyOnWriteArrayList<>();

    public static h a() {
        if (d == null) {
            d = new h();
        }
        return d;
    }

    private h() {
    }

    public void a(List<a.k> list) {
        this.e = list;
        this.f.clear();
        if (this.c != null) {
            a(this.c);
        }
    }

    public List<a.k> b() {
        return this.f;
    }

    public void a(com.tencent.liteav.d.e eVar) {
        if (this.a == 0 || this.b == 0 || this.e == null || this.e.size() == 0) {
            return;
        }
        com.tencent.liteav.d.g b = b(eVar);
        for (a.k kVar : this.e) {
            if (kVar != null) {
                this.f.add(a(kVar, a(kVar.b, b)));
            }
        }
    }

    private a.k a(a.k kVar, a.h hVar) {
        a.k kVar2 = new a.k();
        kVar2.b = hVar;
        kVar2.a = kVar.a;
        kVar2.c = kVar.c;
        kVar2.d = kVar.d;
        return kVar2;
    }

    @Override // com.tencent.liteav.f.c
    public void c() {
        super.c();
        b(this.f);
        b(this.e);
        this.e = null;
    }

    protected void b(List<a.k> list) {
        if (list != null) {
            for (a.k kVar : list) {
                if (kVar != null && kVar.a != null && !kVar.a.isRecycled()) {
                    kVar.a.recycle();
                    kVar.a = null;
                }
            }
            list.clear();
        }
    }
}
