package com.meituan.android.recce.bridge.env;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ccef330abab8f915447aefcf37c697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ccef330abab8f915447aefcf37c697");
            return;
        }
        this.b = 0;
        this.c = com.meituan.android.recce.a.f();
        this.d = com.meituan.android.recce.a.g();
        this.e = com.meituan.android.recce.a.h();
        this.f = com.meituan.android.recce.a.i();
        this.g = com.meituan.android.recce.a.e();
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f668bdc5efd6fe1556df8637d0ef5dc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f668bdc5efd6fe1556df8637d0ef5dc7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", this.b);
            jSONObject.put("osVersion", this.c);
            jSONObject.put("device", this.d);
            jSONObject.put("appName", this.e);
            jSONObject.put("appVersion", this.f);
            jSONObject.put("recceVersion", this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
