package com.meituan.android.mrn.update;

import android.support.annotation.CallSuper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.bundle.service.b;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends b.a {
    public static ChangeQuickRedirect a;
    private int b;
    private long c;

    public abstract void a(File file, long j, int i, int i2);

    public abstract void b(int i);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692aeec1eebdd69817d536e1c2f6f7b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692aeec1eebdd69817d536e1c2f6f7b7");
            return;
        }
        this.b = -1;
        this.c = -1L;
    }

    @Override // com.sankuai.meituan.bundle.service.b.a
    @CallSuper
    public final void a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7fe2c4335b20073887752b94a59dbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7fe2c4335b20073887752b94a59dbe6");
            return;
        }
        try {
            a(file, this.c, this.c > 0 ? (int) (System.currentTimeMillis() - this.c) : -1, this.b);
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("BundleInstallBaseCallback@onSuccess", th);
            a(400);
        }
    }

    @Override // com.sankuai.meituan.bundle.service.b.a
    @CallSuper
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13de490c35ccf18e28f68a624bf87ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13de490c35ccf18e28f68a624bf87ad");
            return;
        }
        try {
            b(i);
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("BundleInstallBaseCallback@onFailed", th);
            throw new RuntimeException(th);
        }
    }

    @Override // com.sankuai.meituan.bundle.service.b.a
    @CallSuper
    public final void a(int i, long j, long j2) {
        Object[] objArr = {1, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789dd113a495bdd6fe1abc2913ea8723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789dd113a495bdd6fe1abc2913ea8723");
            return;
        }
        this.b = (int) j2;
        if (this.c == -1) {
            this.c = System.currentTimeMillis();
        }
    }
}
