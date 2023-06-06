package com.meituan.android.privacy.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e67d922b600b3f610805e7020ff45da9", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException();
        }
        PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e67d922b600b3f610805e7020ff45da9");
    }
}
