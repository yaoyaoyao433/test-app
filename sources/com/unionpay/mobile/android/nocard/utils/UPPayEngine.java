package com.unionpay.mobile.android.nocard.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.monitor.report.db.TraceBean;
import com.unionpay.mobile.android.nocard.views.bh;
import com.unionpay.mobile.android.utils.k;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class UPPayEngine implements Handler.Callback, com.unionpay.mobile.android.fully.a, Runnable {
    private Context e;
    private Handler f;
    private com.unionpay.mobile.android.net.d b = null;
    private String c = null;
    private String d = null;
    private a g = null;
    private com.unionpay.mobile.android.model.b h = null;
    protected com.unionpay.mobile.android.net.c a = null;
    private long i = 0;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, String str);
    }

    /* loaded from: classes6.dex */
    public final class b {
        public int a;
        public String b;

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public UPPayEngine(Context context) {
        this.e = null;
        this.f = null;
        this.e = context;
        this.f = new Handler(this);
    }

    private native String commonMessage(long j, String str, String str2, String str3);

    private native String decryptResponse(long j, String str);

    private native String desEncryptMessage(long j, String str, String str2);

    private native String encryptMessage(long j, String str);

    private native String followRulesMessage(long j, String str, String str2);

    private native String getServerUrl(int i, int i2, int i3);

    private native String getUserInfo(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    public static String i() {
        return new SimpleDateFormat("yyyyMMddhhmmss").format((Date) new java.sql.Date(System.currentTimeMillis()));
    }

    private native String initMessage(long j, String str, String str2);

    private void n(String str) {
        new Thread(this, str).start();
    }

    private native String openupgradeMessage(long j, String str, String str2);

    private native String payingMessage(long j, String str, String str2, String str3, String str4, String str5);

    private native String retrieveInitializeKey(long j);

    private native String rsaEncryptMessageForHFT(long j, String str);

    private native String rsaPrivateEncryptMessage(long j, String str);

    private native String ruleMessage(long j, String str, String str2);

    private native void setSessionKey(long j, String str);

    private native String unBoundMessage(long j, String str, String str2);

    @Override // com.unionpay.mobile.android.fully.a
    public String a(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("reqtm", i());
            str2 = jSONObject.toString();
        } catch (JSONException unused) {
            str2 = str;
        }
        k.c("uppay", "post message = ".concat(String.valueOf(str)));
        this.b.a(encryptMessage(this.i, str2));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        g();
        if (this.a == null) {
            this.a = new com.unionpay.mobile.android.net.c(this.b, this.e);
        }
        int a2 = this.a.a();
        String c = this.a.c();
        if (a2 == 0) {
            String decryptResponse = decryptResponse(this.i, c);
            k.a("uppay", "[ response msg ] ".concat(String.valueOf(decryptResponse)));
            return decryptResponse;
        }
        android.os.Message obtainMessage = this.f.obtainMessage(2);
        obtainMessage.arg1 = a2;
        this.f.sendMessage(obtainMessage);
        return null;
    }

    public final String a(String str, String str2) {
        return desEncryptMessage(this.i, str, str2);
    }

    public final void a() {
        String serverUrl;
        StringBuilder sb;
        String str;
        if (TextUtils.isEmpty(this.h.bk)) {
            int i = "01".equalsIgnoreCase(this.h.I.c) ? 1 : "02".equalsIgnoreCase(this.h.I.c) ? 2 : "98".equalsIgnoreCase(this.h.I.c) ? 98 : "99".equalsIgnoreCase(this.h.I.c) ? 99 : "95".equalsIgnoreCase(this.h.I.c) ? 95 : 0;
            k.a("uppay", "idx  is : " + i + ", isNewTypeTn :" + this.h.c);
            serverUrl = getServerUrl(this.h.f ? 2 : this.h.c ? 1 : 0, i, this.h.aO);
        } else {
            if (this.h.f) {
                sb = new StringBuilder();
                sb.append(this.h.bk);
                str = "/app/mobile/hft";
            } else if (this.h.c) {
                sb = new StringBuilder();
                sb.append(this.h.bk);
                str = "/app/mobile/json";
            } else {
                sb = new StringBuilder();
                sb.append(this.h.bk);
                str = "/gateway/mobile/json";
            }
            sb.append(str);
            serverUrl = sb.toString();
        }
        k.a("uppay", "url  is : ".concat(String.valueOf(serverUrl)));
        this.b = new com.unionpay.mobile.android.net.d(serverUrl);
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void a(com.unionpay.mobile.android.model.b bVar) {
        if (this.h == null || this.h != bVar) {
            this.h = bVar;
        }
    }

    public final void a(a aVar) {
        this.g = aVar;
    }

    public final void a(String str, String str2, int i) {
        this.b.a(commonMessage(this.i, str, str2, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        if (i <= 0) {
            n(str);
            return;
        }
        this.f.sendMessageDelayed(this.f.obtainMessage(1, str), i * 1000);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.b.a(payingMessage(this.i, str, str2, str3, str4, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n(Constants.EventType.PAY);
    }

    public final String b() {
        return this.d;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void b(String str, String str2) {
        this.b.a(initMessage(this.i, this.h.f ? bh.b(this.e, str, "android", this.h.a(), this.h.g, this.h.d) : bh.a(this.e, str, "android", this.h.a(), this.h.g, str2), i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put("secret", retrieveInitializeKey(this.i));
        this.b.a(hashMap);
        n("init");
    }

    public final long c() {
        return this.i;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void c(String str, String str2) {
        a(str, str2, 0);
    }

    public final com.unionpay.mobile.android.net.d d() {
        return this.b;
    }

    public final boolean d(String str) {
        setSessionKey(this.i, str);
        return true;
    }

    public final Handler e() {
        return this.f;
    }

    public final String e(String str) {
        return encryptMessage(this.i, str);
    }

    public final String f() {
        return this.c;
    }

    public final String f(String str) {
        return decryptResponse(this.i, str);
    }

    public final String g(String str) {
        return rsaPrivateEncryptMessage(this.i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        String c = this.b.c();
        if (TextUtils.isEmpty(c)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(f(c));
            String string = jSONObject.getString("cmd");
            String string2 = jSONObject.getString("reqtm");
            com.unionpay.mobile.android.net.d dVar = this.b;
            Context context = this.e;
            dVar.a(context, string, this.h.b + string2 + com.unionpay.mobile.android.utils.f.d(this.e));
        } catch (JSONException unused) {
            this.b.a(this.e, "uppay", "1234567890");
        }
    }

    public final String h(String str) {
        return rsaEncryptMessageForHFT(this.i, str);
    }

    public final void h() {
        this.e = null;
        this.f.removeCallbacksAndMessages(null);
        this.f = null;
        this.b = null;
        this.h = null;
        this.a = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        String str = null;
        if (message.what == 0) {
            b bVar = (b) message.obj;
            if (bVar.a == 0) {
                str = decryptResponse(this.i, bVar.b);
                k.a("uppay", "resp is:".concat(String.valueOf(str)));
            }
            if (this.g != null) {
                this.g.a(bVar.a, str);
                k.b("uppayEx", "UPPayEngine:" + this.g.toString());
            }
        } else if (message.what == 1) {
            n((String) message.obj);
        } else if (message.what == 2 && this.g != null) {
            this.g.a(message.arg1, null);
        }
        return true;
    }

    public final void i(String str) {
        this.b.a(ruleMessage(this.i, str, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n(TraceBean.RULE);
    }

    public native long initJNIEnv(Activity activity, int i, int i2, boolean z, String str, int i3, String str2);

    public final void j(String str) {
        this.b.a(followRulesMessage(this.i, str, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n("followRule");
    }

    public final void k(String str) {
        this.b.a(openupgradeMessage(this.i, str, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n("openupgrade");
    }

    public final void l(String str) {
        this.b.a(unBoundMessage(this.i, str, i()));
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n("unbindcard");
    }

    public final void m(String str) {
        String userInfo = getUserInfo(this.i, str, i());
        k.a("uppay", "actEntrust msg:".concat(String.valueOf(userInfo)));
        this.b.a(userInfo);
        HashMap<String, String> hashMap = new HashMap<>(1);
        hashMap.put(Message.SID, this.c);
        this.b.a(hashMap);
        n("getuserinfo");
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap<String, String> d;
        String str;
        String str2;
        try {
            if (this.h == null || this.h.aO <= 0 || this.h.aO > 5) {
                d = this.b.d();
                str = "magic_number";
                str2 = "20131120";
            } else {
                d = this.b.d();
                str = "magic_number";
                str2 = "20150423";
            }
            d.put(str, str2);
            g();
            if (this.a == null) {
                this.a = new com.unionpay.mobile.android.net.c(this.b, this.e);
            }
            b bVar = new b(this.a.a(), this.a.c());
            if (this.f != null) {
                android.os.Message obtainMessage = this.f.obtainMessage();
                obtainMessage.what = 0;
                obtainMessage.obj = bVar;
                this.f.sendMessage(obtainMessage);
            }
        } catch (NullPointerException | Exception unused) {
        }
    }
}
