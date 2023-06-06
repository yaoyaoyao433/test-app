package com.sankuai.waimai.platform.domain.core.channel;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f0bec059e6661ec125f20df33f2a7ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f0bec059e6661ec125f20df33f2a7ac");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar.b = jSONObject.optString("ys");
            aVar.c = jSONObject.optString("ys_id");
            aVar.d = jSONObject.optString("activity_id");
            aVar.f = jSONObject.optString("back_url");
            aVar.e = jSONObject.optString("chname");
            aVar.g = jSONObject.optString("restaurant_id");
        } catch (Exception unused) {
        }
        return aVar;
    }
}
