package com.meituan.mmp.main;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class aa {
    public static ChangeQuickRedirect a;

    public void a(@NonNull String str, @NonNull String str2, String str3, String str4, String str5) {
    }

    public final void a(@NonNull String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58275b353350bb5c30c8d18ab4a6e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58275b353350bb5c30c8d18ab4a6e0b");
        } else {
            a("MMP", str, str2, str3, str4);
        }
    }
}
