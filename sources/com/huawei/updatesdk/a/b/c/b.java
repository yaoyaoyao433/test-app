package com.huawei.updatesdk.a.b.c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.a.b.c.c.c;
import com.huawei.updatesdk.a.b.c.c.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b extends AsyncTask<c, Void, d> {
    protected c a;
    private com.huawei.updatesdk.a.b.c.c.a c;
    private d b = null;
    private com.huawei.updatesdk.a.a.b.b d = null;
    private int e = 0;

    public b(c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        this.a = null;
        this.c = null;
        this.a = cVar;
        this.c = aVar;
    }

    private d a(String str, d dVar) {
        try {
            dVar.fromJson(new JSONObject(str));
            dVar.b(0);
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "parse json error", e);
        }
        return dVar;
    }

    private void a(d dVar, int i, d.a aVar, Throwable th) {
        if (dVar != null) {
            dVar.b(i);
            dVar.a(aVar);
            dVar.a(th.toString());
        }
    }

    private void a(d dVar, Throwable th, String str) {
        d.a aVar;
        int i = 1;
        if (th instanceof ConnectException) {
            aVar = d.a.CONNECT_EXCEPTION;
        } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            aVar = d.a.CONNECT_EXCEPTION;
            i = 2;
        } else if (th instanceof IllegalArgumentException) {
            aVar = d.a.PARAM_ERROR;
            i = 5;
        } else if (th instanceof IllegalAccessException) {
            aVar = d.a.UNKNOWN_EXCEPTION;
        } else if (!(th instanceof ArrayIndexOutOfBoundsException)) {
            if ((th instanceof InterruptedException) || (th instanceof InterruptedIOException)) {
                a(dVar, 0, d.a.NORMAL, th);
                com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK task is canceled");
            } else if (th instanceof IOException) {
                aVar = d.a.IO_EXCEPTION;
            } else if (dVar != null) {
                dVar.a(th.toString());
            }
            a(str, th);
        } else {
            aVar = d.a.NO_PROGUARD;
            i = 6;
        }
        a(dVar, i, aVar, th);
        a(str, th);
    }

    private void a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("invoke store error");
        sb.append(", exceptionType:");
        sb.append(th.getClass().getName());
        sb.append(", url:");
        sb.append(str);
        sb.append(", method:");
        sb.append(this.a.b());
        sb.append(", retryTimes:" + this.e);
        String sb2 = sb.toString();
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", sb2, th);
        com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK call store error: " + sb2);
    }

    private boolean a(String str) {
        return TextUtils.isEmpty(str) || !g.d(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.huawei.updatesdk.a.b.c.c.d r4) {
        /*
            r3 = this;
            boolean r0 = r3.isCancelled()
            if (r0 != 0) goto L60
            com.huawei.updatesdk.a.b.c.c.a r0 = r3.c
            if (r0 == 0) goto L60
            if (r4 != 0) goto L59
            java.lang.String r0 = "StoreTask"
            java.lang.String r1 = "notifyResult, response is null"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r1)
            com.huawei.updatesdk.a.b.c.c.c r0 = r3.a     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L2a
            java.lang.String r0 = r0.b()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L2a
            com.huawei.updatesdk.a.b.c.c.d r0 = com.huawei.updatesdk.a.b.c.a.a(r0)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L2a
            r4 = r0
            goto L45
        L20:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "notifyResult, create response error, method:"
            r1.<init>(r2)
            goto L33
        L2a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "notifyResult, create response error, method:"
            r1.<init>(r2)
        L33:
            com.huawei.updatesdk.a.b.c.c.c r2 = r3.a
            java.lang.String r2 = r2.b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StoreTask"
            com.huawei.updatesdk.a.a.c.a.a.a.a(r2, r1, r0)
        L45:
            if (r4 != 0) goto L52
            com.huawei.updatesdk.a.b.c.c.d r4 = new com.huawei.updatesdk.a.b.c.c.d
            r4.<init>()
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.PARAM_ERROR
        L4e:
            r4.a(r0)
            goto L55
        L52:
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.UNKNOWN_EXCEPTION
            goto L4e
        L55:
            r0 = 1
            r4.b(r0)
        L59:
            com.huawei.updatesdk.a.b.c.c.a r0 = r3.c
            com.huawei.updatesdk.a.b.c.c.c r1 = r3.a
            r0.b(r1, r4)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.b(com.huawei.updatesdk.a.b.c.c.d):void");
    }

    private void b(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            str2 = "StoreTask";
            str3 = "UpdateSDK response error, resData == null";
        } else {
            str2 = "StoreTask";
            str3 = "UpdateSDK response error, resData is not json string";
        }
        com.huawei.updatesdk.a.a.a.a(str2, str3);
    }

    private boolean c(d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.d() == 1 || dVar.d() == 2) {
            int i = this.e;
            this.e = i + 1;
            if (i >= 3) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry completed total times = " + this.e + ",response.responseCode = " + dVar.d());
                return false;
            }
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry times = " + this.e + ",response.responseCode = " + dVar.d());
            return true;
        }
        return false;
    }

    private String d() {
        String a = com.huawei.updatesdk.b.g.a.a();
        return TextUtils.isEmpty(a) ? "Android/1.0" : a;
    }

    private void e() {
        b(this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.huawei.updatesdk.a.b.c.c.d a() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.a():com.huawei.updatesdk.a.b.c.c.d");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public d doInBackground(c... cVarArr) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "doInBackground, method:" + this.a.b());
        com.huawei.updatesdk.b.g.b.a(this);
        d c = c();
        com.huawei.updatesdk.a.b.c.c.a aVar = this.c;
        if (aVar != null) {
            aVar.a(this.a, c);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "onPostExecute, method:" + this.a.b());
        com.huawei.updatesdk.b.g.b.a().remove(this);
        e();
    }

    public final void a(Executor executor) {
        com.sankuai.waimai.launcher.util.aop.b.a(this, executor, this.a);
    }

    public void b() {
        com.huawei.updatesdk.a.a.b.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
            this.d = null;
        }
    }

    public final d c() {
        d dVar = null;
        do {
            if (this.e > 0 && dVar != null) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "call store error! responseCode:" + dVar.d() + ", retryTimes:" + this.e);
            }
            dVar = a();
        } while (c(dVar));
        this.b = dVar;
        return this.b;
    }
}
