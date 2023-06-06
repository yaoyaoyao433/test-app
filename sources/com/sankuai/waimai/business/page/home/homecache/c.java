package com.sankuai.waimai.business.page.home.homecache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public ExecutorService b;

    public c() {
        this("waimai-home-cache-ececutor", 2);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1132701cb7c042f4bc1d939c13966bae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1132701cb7c042f4bc1d939c13966bae");
        }
    }

    private c(String str, int i) {
        Object[] objArr = {str, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d81e53898ec5088a18c1470f504b1d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d81e53898ec5088a18c1470f504b1d8");
        } else {
            this.b = com.sankuai.android.jarvis.c.a(str, 2);
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff34a73f86b2c73b8a82018b95533168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff34a73f86b2c73b8a82018b95533168");
        } else if (this.b != null) {
            this.b.execute(runnable);
        }
    }
}
