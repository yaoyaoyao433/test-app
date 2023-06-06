package com.meituan.android.singleton;

import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static UserCenter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2312cc430df827bea6d8638dad878099", RobustBitConfig.DEFAULT_VALUE) ? (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2312cc430df827bea6d8638dad878099") : UserCenter.getInstance(b.a);
    }
}
