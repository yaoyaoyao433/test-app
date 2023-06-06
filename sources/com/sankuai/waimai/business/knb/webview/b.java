package com.sankuai.waimai.business.knb.webview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;

    public static boolean a(int i) {
        return (i & 2) > 0;
    }

    public static boolean b(int i) {
        return (i & 512) > 0;
    }

    public static boolean c(int i) {
        return (i & 256) > 0;
    }

    public static boolean d(int i) {
        return (i & 128) > 0;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0595a693311f5d17ee8290e25aebc749", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0595a693311f5d17ee8290e25aebc749");
        } else {
            this.f = Integer.MAX_VALUE;
        }
    }

    public static b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67004d201834bbc8d63e367a9513c3a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67004d201834bbc8d63e367a9513c3a2");
        }
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.b = jSONObject.optString("title");
            bVar.c = jSONObject.optString("content");
            bVar.d = jSONObject.optString("imageURL");
            bVar.e = jSONObject.optString("detailURL");
            bVar.f = jSONObject.optInt("channel");
            bVar.g = jSONObject.optString("description_icon");
            bVar.h = jSONObject.optString("description");
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return bVar;
    }
}
