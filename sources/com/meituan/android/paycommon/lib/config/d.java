package com.meituan.android.paycommon.lib.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements com.meituan.android.paybase.login.b {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static com.meituan.android.paybase.login.b a() {
        return b;
    }

    @Override // com.meituan.android.paybase.login.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d845e1bb61e283c255959fbec530732f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d845e1bb61e283c255959fbec530732f");
        } else {
            a.a(z);
        }
    }
}
