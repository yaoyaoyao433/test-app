package com.dianping.gcmrnmodule.wrapperviews.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class p extends n {
    public static ChangeQuickRedirect b;

    @Override // com.dianping.gcmrnmodule.wrapperviews.events.n, com.facebook.react.uimanager.events.b
    public final String a() {
        return "onPageDisappear";
    }

    public p(int i, JSONObject jSONObject) {
        super(i, jSONObject);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09606c15a4d34ea46470e06f2f9477ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09606c15a4d34ea46470e06f2f9477ca");
        }
    }
}
