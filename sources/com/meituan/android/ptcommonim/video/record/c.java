package com.meituan.android.ptcommonim.video.record;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final Activity b;

    private c(Activity activity) {
        this.b = activity;
    }

    public static Runnable a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3f01a2c95ee4447393373d9637eb569", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3f01a2c95ee4447393373d9637eb569") : new c(activity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40401da43957b34aa527d28489373d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40401da43957b34aa527d28489373d7f");
        } else {
            PTIMRecordFragment.b(this.b);
        }
    }
}
