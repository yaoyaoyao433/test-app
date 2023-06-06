package com.sankuai.waimai.business.user.api.user.request;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Handler b;

    public a(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9963ff8fff4a53b22cb0b424a6e03a1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9963ff8fff4a53b22cb0b424a6e03a1a");
        } else {
            this.b = handler;
        }
    }
}
