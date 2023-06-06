package com.tencent.liteav.f;

import com.tencent.liteav.i.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    protected int a;
    protected int b;
    protected com.tencent.liteav.d.e c;

    public void a(com.tencent.liteav.d.g gVar) {
        this.a = gVar.a;
        this.b = gVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.tencent.liteav.d.g b(com.tencent.liteav.d.e eVar) {
        com.tencent.liteav.d.g gVar = new com.tencent.liteav.d.g();
        float m = (this.a * 1.0f) / eVar.m();
        float n = (this.b * 1.0f) / eVar.n();
        if (com.tencent.liteav.c.i.a().s != 2 ? m < n : m > n) {
            m = n;
        }
        gVar.a = (int) (eVar.m() * m);
        gVar.b = (int) (eVar.n() * m);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a.h a(a.h hVar, com.tencent.liteav.d.g gVar) {
        a.h hVar2 = new a.h();
        hVar2.a = (hVar.a - ((this.a - gVar.a) / 2)) / gVar.a;
        hVar2.b = (hVar.b - ((this.b - gVar.b) / 2)) / gVar.b;
        hVar2.c = hVar.c / gVar.a;
        return hVar2;
    }

    public void c(com.tencent.liteav.d.e eVar) {
        this.c = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.a = 0;
        this.b = 0;
        this.c = null;
    }
}
