package com.huawei.hms.hatool;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d1 extends o {
    public String g = "";

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "1");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.d);
        jSONObject.put("appid", this.a);
        jSONObject.put("hmac", this.g);
        jSONObject.put("chifer", this.f);
        jSONObject.put(DeviceInfo.TM, this.b);
        jSONObject.put("servicetag", this.c);
        jSONObject.put("requestid", this.e);
        return jSONObject;
    }

    public void g(String str) {
        this.g = str;
    }
}
