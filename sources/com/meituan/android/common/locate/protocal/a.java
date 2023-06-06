package com.meituan.android.common.locate.protocal;

import android.text.TextUtils;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String a;
    public boolean b;

    public JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7140941e1b0edf0c00caa4d223bfbd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7140941e1b0edf0c00caa4d223bfbd3");
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.a)) {
            try {
                jSONObject.put("ble", this.a);
            } catch (JSONException unused) {
                c.a("extra put ble exception", 3);
            }
        }
        try {
            jSONObject.put("is_new_strategy", this.b);
            jSONObject.put("beacon_count", com.meituan.android.common.locate.ble.a.a().b());
        } catch (JSONException unused2) {
            c.a("extra put is_new_strategy exception", 3);
        }
        return jSONObject;
    }
}
