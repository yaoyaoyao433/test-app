package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class k implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("title")
    public String b;
    @SerializedName("content")
    public String c;
    @SerializedName("btn_text")
    public String d;
    @SerializedName("order_view_id")
    public String e;

    public static k a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202113e19c6c3f4911119e14b2bc1420", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202113e19c6c3f4911119e14b2bc1420");
        }
        if (jSONObject == null) {
            return null;
        }
        return (k) new Gson().fromJson(jSONObject.toString(), (Class<Object>) k.class);
    }
}
