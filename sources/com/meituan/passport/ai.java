package com.meituan.passport;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private com.meituan.android.cipstorage.q b;
    private UserCenter c;

    public ai(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d12560b361e7b543a828f00bd8f138", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d12560b361e7b543a828f00bd8f138");
            return;
        }
        this.b = com.meituan.android.cipstorage.q.a(context, "homepage_passport", 2);
        com.meituan.passport.utils.aa.a(context, "homepage_passport", "passport");
        this.c = UserCenter.getInstance(context);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2c234a91ec8a3ab08873776f5230f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2c234a91ec8a3ab08873776f5230f4")).booleanValue() : !this.b.b("showPolicyDialog", true);
    }
}
