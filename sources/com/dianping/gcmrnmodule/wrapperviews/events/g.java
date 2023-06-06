package com.dianping.gcmrnmodule.wrapperviews.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends c {
    public static ChangeQuickRedirect b;

    @Override // com.dianping.gcmrnmodule.wrapperviews.events.c, com.facebook.react.uimanager.events.b
    public final String a() {
        return "onDisappear";
    }

    public g(int i, JSONObject jSONObject) {
        super(i, jSONObject);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f7ddf2b18961973f88a00ab4d03d29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f7ddf2b18961973f88a00ab4d03d29");
        }
    }
}
