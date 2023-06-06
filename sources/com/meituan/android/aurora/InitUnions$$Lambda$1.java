package com.meituan.android.aurora;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class InitUnions$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final InitUnions arg$1;
    private final Application arg$2;

    public InitUnions$$Lambda$1(InitUnions initUnions, Application application) {
        this.arg$1 = initUnions;
        this.arg$2 = application;
    }

    private static Runnable get$Lambda(InitUnions initUnions, Application application) {
        Object[] objArr = {initUnions, application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eaa20f3fbcfe6fe7547193b4acf113a9", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eaa20f3fbcfe6fe7547193b4acf113a9") : new InitUnions$$Lambda$1(initUnions, application);
    }

    public static Runnable lambdaFactory$(InitUnions initUnions, Application application) {
        Object[] objArr = {initUnions, application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff774dc95eeb1cfcb53a369caa5a7520", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff774dc95eeb1cfcb53a369caa5a7520") : new InitUnions$$Lambda$1(initUnions, application);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6139ba7bb2ab6479c3a4c73fdb0f9997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6139ba7bb2ab6479c3a4c73fdb0f9997");
        } else {
            InitUnions.access$lambda$0(this.arg$1, this.arg$2);
        }
    }
}
