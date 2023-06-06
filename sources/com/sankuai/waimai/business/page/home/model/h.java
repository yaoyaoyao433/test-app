package com.sankuai.waimai.business.page.home.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a = null;
    public static int b = 1;
    public static int c = 2;
    public static int d = 3;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a63a227f45e6a7a6e01e00bb2e51cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a63a227f45e6a7a6e01e00bb2e51cf");
        } else {
            this.j = 0;
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0e71fd4b99f8021c6ae19a0eb8f845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0e71fd4b99f8021c6ae19a0eb8f845");
            return;
        }
        this.e = jSONObject.optInt("type");
        this.f = jSONObject.optString("key");
        this.g = jSONObject.optString("value");
        this.h = jSONObject.optInt("stime");
        this.i = jSONObject.optInt("etime");
    }

    public final String a() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79e54f17b59398f11608a9e2f0a2507e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79e54f17b59398f11608a9e2f0a2507e");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.e);
        jSONObject.put("key", this.f);
        jSONObject.put("value", this.g);
        jSONObject.put("stime", this.h);
        jSONObject.put("etime", this.i);
        return jSONObject.toString();
    }

    public final boolean b() {
        return this.e == d;
    }
}
