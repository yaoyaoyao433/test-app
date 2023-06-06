package com.meituan.android.paycommon.lib.config;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.paybase.config.c {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static com.meituan.android.paybase.config.c a() {
        return b;
    }

    @Override // com.meituan.android.paybase.config.c
    public final void a(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f2d1e35b710f2d5c758481c204a0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f2d1e35b710f2d5c758481c204a0a6");
        } else {
            a.a(activity, i, str);
        }
    }
}
