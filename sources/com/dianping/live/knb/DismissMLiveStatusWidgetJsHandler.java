package com.dianping.live.knb;

import com.dianping.live.live.utils.j;
import com.dianping.live.status.b;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.util.exception.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DismissMLiveStatusWidgetJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ESNhGr+jVLgHZxzlPbc2pkFX1S8VukLV2Ol4RE5sxhcB8Pcz6c2yPvbfy/Ei7BB0IoY85katpJBmTPVnbqIbqg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9771d45b10bd9f04cf839f478e4bde6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9771d45b10bd9f04cf839f478e4bde6");
            return;
        }
        try {
            b.b.a();
        } catch (Exception e) {
            e.printStackTrace();
            j.a("DismissMLiveStatusWidgetJsHandler exception" + a.a(e));
        }
    }
}
