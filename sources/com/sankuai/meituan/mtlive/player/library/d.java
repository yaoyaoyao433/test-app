package com.sankuai.meituan.mtlive.player.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public float f;
    public int g;
    public int h;
    public boolean i;
    private boolean j;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c5539f1f6f605976f5b810fe862268", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c5539f1f6f605976f5b810fe862268");
            return;
        }
        this.b = true;
        this.c = 5.0f;
        this.d = 5.0f;
        this.e = 3;
        this.f = 1.0f;
        this.g = 800;
        this.h = 3;
        this.i = false;
        this.j = true;
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void a(float f) {
        this.c = f;
    }

    public final void b(float f) {
        this.d = f;
    }

    public final void c(float f) {
        this.f = f;
    }

    public final void b(boolean z) {
        this.j = z;
    }
}
