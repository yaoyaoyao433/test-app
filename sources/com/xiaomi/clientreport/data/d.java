package com.xiaomi.clientreport.data;

import android.os.Build;
import com.meituan.robust.common.CommonConstant;
import com.vivo.push.PushClientConstants;
import com.xiaomi.push.jj;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class d {
    private String a = Build.VERSION.RELEASE + CommonConstant.Symbol.MINUS + Build.VERSION.INCREMENTAL;
    private String b = jj.c();
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.e);
            jSONObject.put("reportType", this.g);
            jSONObject.put("clientInterfaceId", this.f);
            jSONObject.put("os", this.a);
            jSONObject.put("miuiVersion", this.b);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.h);
            jSONObject.put("sdkVersion", this.i);
            return jSONObject;
        } catch (JSONException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return null;
        }
    }

    public String b() {
        JSONObject a = a();
        return a == null ? "" : a.toString();
    }
}
