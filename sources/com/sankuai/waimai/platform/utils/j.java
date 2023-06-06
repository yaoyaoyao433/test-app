package com.sankuai.waimai.platform.utils;

import android.os.Build;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cd35e4dcad52c173cd15319cfb74b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cd35e4dcad52c173cd15319cfb74b54");
        } else if (Build.VERSION.SDK_INT < 24 || com.sankuai.waimai.platform.utils.sharedpreference.a.t()) {
        } else {
            bundle.remove("android:viewHierarchyState");
        }
    }
}
