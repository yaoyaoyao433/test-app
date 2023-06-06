package com.dianping.networklog;

import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.ILuban;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f extends a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.networklog.a, com.dianping.networklog.b
    public final JSONObject a() {
        JsonObject jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19416f6400c741dcf6fbeb1dd2c300df", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19416f6400c741dcf6fbeb1dd2c300df");
        }
        ILuban luban = NVLinker.getLuban();
        if (luban == null || (jsonObject = luban.get("nvCommonConfig")) == null) {
            return null;
        }
        try {
            return new JSONObject(jsonObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }
}
