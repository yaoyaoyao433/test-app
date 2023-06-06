package com.meituan.android.yoda;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.android.yoda.config.verify.b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public boolean d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45b2d750c42ab53458e2781d3386b95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45b2d750c42ab53458e2781d3386b95");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = false;
        f();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "687d66b817f045c55b309c4d175263de", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "687d66b817f045c55b309c4d175263de") : new e();
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final void a(com.meituan.android.yoda.config.verify.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c811c19428dddd64a94398ca303e6111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c811c19428dddd64a94398ca303e6111");
        } else if (bVar == null) {
        } else {
            this.b = bVar.c();
            this.c = bVar.d();
            this.d = bVar.e();
        }
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d3dc992506d691bf1f29e547bdbcbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d3dc992506d691bf1f29e547bdbcbc");
        } else {
            f();
        }
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final int c() {
        return this.b;
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final int d() {
        return this.c;
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final boolean e() {
        return this.d;
    }

    private void f() {
        this.b = 0;
        this.c = 0;
        this.d = false;
    }
}
