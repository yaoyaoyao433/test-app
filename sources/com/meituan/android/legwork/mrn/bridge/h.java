package com.meituan.android.legwork.mrn.bridge;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final String c;
    private final Promise d;
    private final String e;

    private h(Activity activity, String str, Promise promise, String str2) {
        this.b = activity;
        this.c = str;
        this.d = promise;
        this.e = str2;
    }

    public static Runnable a(Activity activity, String str, Promise promise, String str2) {
        Object[] objArr = {activity, str, promise, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96955b7a925019d9b9e5f98a29b18fa7", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96955b7a925019d9b9e5f98a29b18fa7") : new h(activity, str, promise, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5654461b1becc0bdb0c17f1358bf1d14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5654461b1becc0bdb0c17f1358bf1d14");
        } else {
            LocationBridgeModule.lambda$requestActualLocation$34(this.b, this.c, this.d, this.e);
        }
    }
}
