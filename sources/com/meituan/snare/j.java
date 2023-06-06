package com.meituan.snare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public ScheduledExecutorService b;
    public long c;
    volatile boolean d;

    public static j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92921df49d2da24bb1900bc38d9b1d8f", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92921df49d2da24bb1900bc38d9b1d8f") : a.a;
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd63d3bc3c5092befca86fd016d3b0ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd63d3bc3c5092befca86fd016d3b0ad");
            return;
        }
        this.b = com.sankuai.android.jarvis.c.c("snare-pages");
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final j a = new j();
    }

    public final void a(s[] sVarArr) {
        Object[] objArr = {sVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31085c35592338f09e181689c0337f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31085c35592338f09e181689c0337f27");
            return;
        }
        f a2 = f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        File[] f = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "fcd24e3ab6606946e3d4aeea15c1b431", RobustBitConfig.DEFAULT_VALUE) ? (File[]) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "fcd24e3ab6606946e3d4aeea15c1b431") : a2.f(".pages");
        if (f == null || f.length <= 0) {
            return;
        }
        for (s sVar : sVarArr) {
            for (int i = 0; i < f.length; i++) {
                File file = f[i];
                if (file != null) {
                    if (f.a().a(sVar.c, file.getAbsolutePath())) {
                        f[i] = null;
                    }
                    if (file.getAbsolutePath().contains(f.a().a((String) null))) {
                        f[i] = null;
                    }
                }
            }
        }
        for (File file2 : f) {
            if (file2 != null) {
                f.a().e(file2.getAbsolutePath());
            }
        }
    }
}
