package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.sys.a;
import com.alipay.sdk.util.f;
import com.alipay.sdk.util.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AuthTask {
    public static final Object c = com.alipay.sdk.util.f.class;
    public Activity a;
    public com.alipay.sdk.widget.a b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements f.e {
        public a() {
        }

        @Override // com.alipay.sdk.util.f.e
        public final void a() {
            AuthTask.this.b();
        }
    }

    public AuthTask(Activity activity) {
        this.a = activity;
        com.alipay.sdk.sys.b.a().a(this.a);
        this.b = new com.alipay.sdk.widget.a(activity, com.alipay.sdk.widget.a.k);
    }

    private void a() {
        com.alipay.sdk.widget.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new com.alipay.sdk.sys.a(this.a, str, "auth"), str, z);
    }

    public synchronized Map<String, String> authV2(String str, boolean z) {
        com.alipay.sdk.sys.a aVar;
        aVar = new com.alipay.sdk.sys.a(this.a, str, "authV2");
        return j.a(aVar, innerAuth(aVar, str, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
        if (com.alipay.sdk.data.a.a().r != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
        if (com.alipay.sdk.data.a.a().r != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
        com.alipay.sdk.data.a.a().a(r6, r5.a, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
        b();
        com.alipay.sdk.app.statistic.a.b(r5.a, r6, r7, r6.d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String innerAuth(com.alipay.sdk.sys.a r6, java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(com.alipay.sdk.sys.a, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(android.app.Activity r4, java.lang.String r5, com.alipay.sdk.sys.a r6) {
        /*
            r3 = this;
            r3.a()
            r0 = 0
            com.alipay.sdk.packet.impl.a r1 = new com.alipay.sdk.packet.impl.a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            com.alipay.sdk.packet.b r4 = r1.a(r6, r4, r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            org.json.JSONObject r4 = r4.a()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            java.lang.String r5 = "form"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            java.lang.String r5 = "onload"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            java.util.List r4 = com.alipay.sdk.protocol.b.a(r4)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            r3.b()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            r5 = 0
        L25:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            if (r5 >= r1) goto L48
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            com.alipay.sdk.protocol.b r1 = (com.alipay.sdk.protocol.b) r1     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            com.alipay.sdk.protocol.a r1 = r1.a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            com.alipay.sdk.protocol.a r2 = com.alipay.sdk.protocol.a.WapPay     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            if (r1 != r2) goto L45
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            com.alipay.sdk.protocol.b r4 = (com.alipay.sdk.protocol.b) r4     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            java.lang.String r4 = r3.a(r6, r4)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L55
            r3.b()
            return r4
        L45:
            int r5 = r5 + 1
            goto L25
        L48:
            r3.b()
            goto L67
        L4c:
            r4 = move-exception
            java.lang.String r5 = "biz"
            java.lang.String r1 = "H5AuthDataAnalysisError"
            com.alipay.sdk.app.statistic.a.a(r6, r5, r1, r4)     // Catch: java.lang.Throwable -> L7c
            goto L64
        L55:
            r4 = move-exception
            com.alipay.sdk.app.e r5 = com.alipay.sdk.app.e.NETWORK_ERROR     // Catch: java.lang.Throwable -> L7c
            int r5 = r5.i     // Catch: java.lang.Throwable -> L7c
            com.alipay.sdk.app.e r5 = com.alipay.sdk.app.e.a(r5)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "net"
            com.alipay.sdk.app.statistic.a.a(r6, r0, r4)     // Catch: java.lang.Throwable -> L7c
            r0 = r5
        L64:
            r3.b()
        L67:
            if (r0 != 0) goto L71
            com.alipay.sdk.app.e r4 = com.alipay.sdk.app.e.FAILED
            int r4 = r4.i
            com.alipay.sdk.app.e r0 = com.alipay.sdk.app.e.a(r4)
        L71:
            int r4 = r0.i
            java.lang.String r5 = r0.j
            java.lang.String r6 = ""
            java.lang.String r4 = com.alipay.sdk.app.d.a(r4, r5, r6)
            return r4
        L7c:
            r4 = move-exception
            r3.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.a(android.app.Activity, java.lang.String, com.alipay.sdk.sys.a):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.alipay.sdk.widget.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    private String a(com.alipay.sdk.sys.a aVar, com.alipay.sdk.protocol.b bVar) {
        String[] strArr = bVar.c;
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        Intent intent = new Intent(this.a, H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C0029a.a(aVar, intent);
        this.a.startActivity(intent);
        synchronized (c) {
            try {
                c.wait();
            } catch (InterruptedException unused) {
                return d.a();
            }
        }
        String str = d.b;
        return TextUtils.isEmpty(str) ? d.a() : str;
    }
}
