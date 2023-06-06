package com.meituan.android.common.locate.fusionlocation.bean;

import android.os.SystemClock;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtLocation a;
    public MtLocation b;
    public long c;

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8e81dd7bfc553499913d92fb4ed0f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8e81dd7bfc553499913d92fb4ed0f78");
            return;
        }
        this.a = null;
        this.b = null;
        this.c = 0L;
    }

    public void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdbd7b809e4afb154749424c59e4c817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdbd7b809e4afb154749424c59e4c817");
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.a = mtLocation;
    }
}
