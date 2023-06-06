package com.sankuai.waimai.store.search.common.api.monitor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public b c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0f257415fa634fc2bbef18c1939bc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0f257415fa634fc2bbef18c1939bc6");
        } else {
            this.b = false;
        }
    }

    public static c a(@NonNull String str, @NonNull String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21bc39ad06a0661016bb1788c054ace5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21bc39ad06a0661016bb1788c054ace5");
        }
        c cVar = new c();
        cVar.c = new b(str, str2, str3);
        return cVar;
    }
}
