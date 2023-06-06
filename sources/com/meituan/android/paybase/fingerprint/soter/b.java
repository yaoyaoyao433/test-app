package com.meituan.android.paybase.fingerprint.soter;

import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MTPaySuppressFBWarnings({"DC_DOUBLECHECK"})
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static c b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "671340994df3e8d6cc540fad48232ed7", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "671340994df3e8d6cc540fad48232ed7");
        }
        if (b == null) {
            throw new IllegalStateException("SoterConfig is not init");
        }
        return b;
    }
}
