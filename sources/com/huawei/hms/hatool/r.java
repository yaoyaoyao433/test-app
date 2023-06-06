package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class r implements s {
    public List<q> a;
    public o b;
    public p c;
    public s d;
    public String e = "";
    public String f;

    public r(String str) {
        this.f = str;
    }

    @Override // com.huawei.hms.hatool.s
    public JSONObject a() {
        String str;
        String str2;
        List<q> list = this.a;
        if (list == null || list.size() == 0) {
            str = "hmsSdk";
            str2 = "Not have actionEvent to send";
        } else if (this.b == null || this.c == null || this.d == null) {
            str = "hmsSdk";
            str2 = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, this.b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a = this.d.a();
            a.put("properties", this.c.a());
            try {
                a.put("events_global_properties", new JSONObject(this.e));
            } catch (JSONException unused) {
                a.put("events_global_properties", this.e);
            }
            jSONObject2.put("events_common", a);
            JSONArray jSONArray = new JSONArray();
            for (q qVar : this.a) {
                JSONObject a2 = qVar.a();
                if (a2 != null) {
                    jSONArray.put(a2);
                } else {
                    y.e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String a3 = com.huawei.secure.android.common.encrypt.utils.c.a(com.huawei.secure.android.common.encrypt.aes.a.a(r0.a(jSONObject2.toString().getBytes("UTF-8")), com.huawei.secure.android.common.encrypt.utils.c.a(this.f)));
                if (TextUtils.isEmpty(a3)) {
                    y.e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put("event", a3);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "hmsSdk";
                str2 = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        y.e(str, str2);
        return null;
    }

    public void a(c1 c1Var) {
        this.d = c1Var;
    }

    public void a(o oVar) {
        this.b = oVar;
    }

    public void a(p pVar) {
        this.c = pVar;
    }

    public void a(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    public void a(List<q> list) {
        this.a = list;
    }
}
