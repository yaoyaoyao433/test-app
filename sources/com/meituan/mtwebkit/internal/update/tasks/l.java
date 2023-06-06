package com.meituan.mtwebkit.internal.update.tasks;

import android.content.pm.PackageInfo;
import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends com.meituan.mtwebkit.internal.task.a<PackageInfo> {
    public static ChangeQuickRedirect a;
    @Depend
    private i b;
    @Depend
    private i k;
    @Depend
    private e l;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe1be5ad6a5ab9cea3f8110d9821ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe1be5ad6a5ab9cea3f8110d9821ff6");
            return;
        }
        this.b = new i();
        this.k = new i();
    }

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ PackageInfo b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a1dd827cc5288fb82892be78f6a817", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a1dd827cc5288fb82892be78f6a817");
        }
        PackageInfo c = this.b.c();
        if (c == null) {
            this.l.c();
            c = this.k.c();
        }
        if (c != null) {
            com.meituan.mtwebkit.internal.l.a();
        }
        return c;
    }
}
