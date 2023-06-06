package com.sankuai.waimai.platform.widget.filterbar.implement.model;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public BubbleInfoBean d;
    public long e;

    public static a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54c1f389976c14daaf8d83c297903363", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54c1f389976c14daaf8d83c297903363");
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        a aVar = new a();
        aVar.b = jSONObject.optInt("type", 0);
        aVar.c = jSONObject.optString("code", "");
        aVar.d = BubbleInfoBean.fromJson(jSONObject.optJSONObject("bubbleInfo"));
        aVar.e = jSONObject.optLong(DeviceInfo.TM, 0L);
        return aVar;
    }

    public final JSONObject a() {
        JSONObject json;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4be4dc078ed3ab325b0abdcb1f364c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4be4dc078ed3ab325b0abdcb1f364c0");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.b);
            jSONObject.put("code", this.c);
            if (this.d != null && (json = this.d.toJson()) != null && json.length() != 0) {
                jSONObject.put("bubbleInfo", json);
            }
            jSONObject.put(DeviceInfo.TM, this.e);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
