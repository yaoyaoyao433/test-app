package com.dianping.codelog.Appender;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    public static b b;

    @Override // com.dianping.codelog.Appender.a
    public final void a() {
    }

    @Override // com.dianping.codelog.Appender.a
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48de97aaf6b14700f566ea358a72d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48de97aaf6b14700f566ea358a72d1b");
        } else {
            com.dianping.codelog.Utils.a.a(com.dianping.codelog.b.b());
        }
    }

    @Override // com.dianping.codelog.Appender.a
    public final void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037f3ae252046a29304b84b8405651d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037f3ae252046a29304b84b8405651d2");
        } else if (com.dianping.codelog.Utils.a.a(com.dianping.codelog.b.b())) {
            Log.e(str2, str3);
        }
    }
}
