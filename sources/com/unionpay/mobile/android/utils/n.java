package com.unionpay.mobile.android.utils;

import android.content.Context;
import android.os.Handler;
import com.sankuai.xm.im.message.bean.Message;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class n extends UPPayEngine implements com.unionpay.mobile.android.fully.a {
    private Context b;

    public n(Context context) {
        super(context);
        this.b = context;
    }

    @Override // com.unionpay.mobile.android.nocard.utils.UPPayEngine, com.unionpay.mobile.android.fully.a
    public final String a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("reqtm", i());
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        k.c("uppay", "post message = ".concat(String.valueOf(str)));
        String e = e(str);
        com.unionpay.mobile.android.net.d d = d();
        if (d != null) {
            try {
                d.a(e);
                HashMap<String, String> hashMap = new HashMap<>(1);
                hashMap.put(Message.SID, f());
                d.a(hashMap);
                g();
                if (this.a == null) {
                    this.a = new com.unionpay.mobile.android.net.c(d, this.b);
                }
                int a = this.a.a();
                String c = this.a.c();
                if (a == 0) {
                    String f = f(c);
                    k.a("uppay", "[ response msg ] ".concat(String.valueOf(f)));
                    return f;
                }
                Handler e2 = e();
                if (e2 != null) {
                    android.os.Message obtainMessage = e2.obtainMessage(2);
                    obtainMessage.arg1 = a;
                    e2.sendMessage(obtainMessage);
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
