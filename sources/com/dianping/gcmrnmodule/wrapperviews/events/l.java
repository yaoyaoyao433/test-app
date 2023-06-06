package com.dianping.gcmrnmodule.wrapperviews.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends a {
    public static ChangeQuickRedirect b;

    @Override // com.dianping.gcmrnmodule.wrapperviews.events.a, com.facebook.react.uimanager.events.b
    public final String a() {
        return "onHoverStatusChanged";
    }

    public l(int i, JSONObject jSONObject) {
        super(i, jSONObject);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d45177f8936868251976a7c34a6d4cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d45177f8936868251976a7c34a6d4cc");
        }
    }
}
