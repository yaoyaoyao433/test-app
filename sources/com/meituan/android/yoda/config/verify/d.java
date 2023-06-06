package com.meituan.android.yoda.config.verify;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private boolean d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f69dee3a9a6f8db4c6e975b38dd685", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f69dee3a9a6f8db4c6e975b38dd685");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = false;
        f();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50ecda141e74863d9c85a382fd8d39a9", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50ecda141e74863d9c85a382fd8d39a9") : new d();
    }

    @Override // com.meituan.android.yoda.config.verify.b
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40e847e35fe8818060a7464ccf1c070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40e847e35fe8818060a7464ccf1c070");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81162d525fe10cf85433708699f47f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81162d525fe10cf85433708699f47f3e");
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
