package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.huawei.hms.adapter.internal.CommonCode;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.j;
import com.tencent.open.utils.k;
import com.unionpay.tsmservice.data.Constant;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    protected static h a;
    protected HandlerThread e;
    protected Handler f;
    protected Random b = new Random();
    protected List<Serializable> d = Collections.synchronizedList(new ArrayList());
    protected List<Serializable> c = Collections.synchronizedList(new ArrayList());
    protected Executor g = j.b();
    protected Executor h = j.b();

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (a == null) {
                a = new h();
            }
            hVar = a;
        }
        return hVar;
    }

    private h() {
        this.e = null;
        if (this.e == null) {
            this.e = new HandlerThread("opensdk.report.handlerthread", 10);
            this.e.start();
        }
        if (!this.e.isAlive() || this.e.getLooper() == null) {
            return;
        }
        this.f = new Handler(this.e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1000:
                        h.this.b();
                        break;
                    case 1001:
                        h.this.e();
                        break;
                }
                super.handleMessage(message);
            }
        };
    }

    public void a(final Bundle bundle, String str, final boolean z) {
        if (bundle == null) {
            return;
        }
        SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (a("report_via", str) || z) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.g, new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String k = k.k(d.b(com.tencent.open.utils.f.a()));
                        String k2 = k.k(d.c(com.tencent.open.utils.f.a()));
                        String k3 = k.k(d.a());
                        String k4 = k.k(d.d(com.tencent.open.utils.f.a()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", "1000");
                        bundle2.putString("imei", k);
                        bundle2.putString(Constants.Environment.KEY_IMSI, k2);
                        bundle2.putString("android_id", k4);
                        bundle2.putString("mac", k3);
                        bundle2.putString("platform", "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("position", "");
                        bundle2.putString("network", a.a(com.tencent.open.utils.f.a()));
                        bundle2.putString("language", d.b());
                        bundle2.putString(CommonCode.MapKey.HAS_RESOLUTION, d.a(com.tencent.open.utils.f.a()));
                        bundle2.putString(Constants.Environment.KEY_APN, a.b(com.tencent.open.utils.f.a()));
                        bundle2.putString("model_name", Build.MODEL);
                        bundle2.putString("timezone", TimeZone.getDefault().getID());
                        bundle2.putString("sdk_ver", com.tencent.connect.common.Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", k.d(com.tencent.open.utils.f.a(), "com.qzone"));
                        bundle2.putString(com.tencent.connect.common.Constants.PARAM_QQ_VER, k.c(com.tencent.open.utils.f.a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", k.e(com.tencent.open.utils.f.a(), com.tencent.open.utils.f.b()));
                        bundle2.putString("packagename", com.tencent.open.utils.f.b());
                        bundle2.putString(com.tencent.connect.common.Constants.PARAM_APP_VER, k.d(com.tencent.open.utils.f.a(), com.tencent.open.utils.f.b()));
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        h.this.d.add(new c(bundle2));
                        int size = h.this.d.size();
                        int a2 = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (a2 == 0) {
                            a2 = 10000;
                        }
                        if (!h.this.a("report_via", size) && !z) {
                            if (h.this.f.hasMessages(1001)) {
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1001;
                            h.this.f.sendMessageDelayed(obtain, a2);
                            return;
                        }
                        h.this.e();
                        h.this.f.removeMessages(1001);
                    } catch (Exception e) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    public void a(String str, long j, long j2, long j3, int i) {
        a(str, j, j2, j3, i, "", false);
    }

    public void a(final String str, final long j, final long j2, final long j3, final int i, final String str2, final boolean z) {
        SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (a("report_cgi", sb.toString()) || z) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.h, new Runnable() { // from class: com.tencent.open.b.h.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                        Bundle bundle = new Bundle();
                        String a2 = a.a(com.tencent.open.utils.f.a());
                        bundle.putString(Constants.Environment.KEY_APN, a2);
                        bundle.putString("appid", "1000067");
                        bundle.putString("commandid", str);
                        bundle.putString(GearsLocator.DETAIL, str2);
                        bundle.putString("deviceInfo", "network=" + a2 + "&sdcard=" + (Environment.getExternalStorageState().equals("mounted") ? 1 : 0) + "&wifi=" + a.e(com.tencent.open.utils.f.a()));
                        int i2 = 100;
                        int a3 = 100 / h.this.a(i);
                        if (a3 <= 0) {
                            i2 = 1;
                        } else if (a3 <= 100) {
                            i2 = a3;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i2);
                        bundle.putString("frequency", sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j2);
                        bundle.putString("reqSize", sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i);
                        bundle.putString(Constant.KEY_RESULT_CODE, sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(j3);
                        bundle.putString("rspSize", sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(elapsedRealtime);
                        bundle.putString("timeCost", sb6.toString());
                        bundle.putString("uin", "1000");
                        h.this.c.add(new c(bundle));
                        int size = h.this.c.size();
                        int a4 = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (a4 == 0) {
                            a4 = 10000;
                        }
                        if (!h.this.a("report_cgi", size) && !z) {
                            if (h.this.f.hasMessages(1000)) {
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1000;
                            h.this.f.sendMessageDelayed(obtain, a4);
                            return;
                        }
                        h.this.b();
                        h.this.f.removeMessages(1000);
                    } catch (Exception e) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    protected void b() {
        if (k.b(com.tencent.open.utils.f.a())) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.h, new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map<String, String> c = h.this.c();
                        if (c != null && !c.isEmpty()) {
                            int a2 = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Common_HttpRetryCount");
                            if (a2 == 0) {
                                a2 = 3;
                            }
                            SLog.d("openSDK_LOG.ReportManager", "-->doReportCgi, retryCount: " + a2);
                            boolean z = false;
                            int i = 0;
                            while (true) {
                                i++;
                                try {
                                    int d = com.tencent.open.a.a.a().b("https://wspeed.qq.com/w.cgi", c).d();
                                    SLog.i("openSDK_LOG.ReportManager", "-->doReportCgi, statusCode: " + d);
                                    if (d != 200) {
                                        break;
                                    }
                                    g.a().b("report_cgi");
                                    z = true;
                                    break;
                                } catch (SocketTimeoutException e) {
                                    SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e);
                                    if (i >= a2) {
                                        break;
                                    }
                                } catch (Exception e2) {
                                    SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e2);
                                }
                            }
                            if (!z) {
                                g.a().a("report_cgi", h.this.c);
                            }
                            h.this.c.clear();
                        }
                    } catch (Exception e3) {
                        SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception out.", e3);
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r4.b.nextInt(100) < r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r4.b.nextInt(100) < r5) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-->availableFrequency, report: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " | ext: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.open.log.SLog.d(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L23
            return r1
        L23:
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r2 = 1
            r3 = 100
            if (r0 == 0) goto L40
            int r5 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L3f
            int r5 = r4.a(r5)
            java.util.Random r6 = r4.b
            int r6 = r6.nextInt(r3)
            if (r6 >= r5) goto L58
            goto L54
        L3f:
            return r1
        L40:
            java.lang.String r0 = "report_via"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L56
            int r5 = com.tencent.open.b.f.a(r6)
            java.util.Random r6 = r4.b
            int r6 = r6.nextInt(r3)
            if (r6 >= r5) goto L58
        L54:
            r1 = 1
            goto L58
        L56:
            r5 = 100
        L58:
            java.lang.String r6 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-->availableFrequency, result: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r2 = " | frequency: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.tencent.open.log.SLog.d(r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.h.a(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "report_cgi"
            boolean r0 = r6.equals(r0)
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1d
            android.content.Context r0 = com.tencent.open.utils.f.a()
            com.tencent.open.utils.g r0 = com.tencent.open.utils.g.a(r0, r2)
            java.lang.String r2 = "Common_CGIReportMaxcount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L37
        L1b:
            r0 = 5
            goto L37
        L1d:
            java.lang.String r0 = "report_via"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L36
            android.content.Context r0 = com.tencent.open.utils.f.a()
            com.tencent.open.utils.g r0 = com.tencent.open.utils.g.a(r0, r2)
            java.lang.String r2 = "Agent_ReportBatchCount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L37
            goto L1b
        L36:
            r0 = 0
        L37:
            java.lang.String r1 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "-->availableCount, report: "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r6 = " | dataSize: "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = " | maxcount: "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            com.tencent.open.log.SLog.d(r1, r6)
            if (r7 < r0) goto L5e
            r6 = 1
            return r6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.h.a(java.lang.String, int):boolean");
    }

    protected int a(int i) {
        if (i == 0) {
            int a2 = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Common_CGIReportFrequencySuccess");
            if (a2 == 0) {
                return 10;
            }
            return a2;
        }
        int a3 = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Common_CGIReportFrequencyFailed");
        if (a3 == 0) {
            return 100;
        }
        return a3;
    }

    protected Map<String, String> c() {
        if (this.c.size() == 0) {
            return null;
        }
        c cVar = (c) this.c.get(0);
        if (cVar == null) {
            SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
            return null;
        }
        String str = cVar.a.get("appid");
        List<Serializable> a2 = g.a().a("report_cgi");
        if (a2 != null) {
            this.c.addAll(a2);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: " + this.c.size());
        if (this.c.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("appid", str);
            hashMap.put("releaseversion", com.tencent.connect.common.Constants.SDK_VERSION_REPORT);
            hashMap.put("device", Build.DEVICE);
            hashMap.put("qua", com.tencent.connect.common.Constants.SDK_QUA);
            hashMap.put("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
            for (int i = 0; i < this.c.size(); i++) {
                c cVar2 = (c) this.c.get(i);
                hashMap.put(i + "_1", cVar2.a.get(Constants.Environment.KEY_APN));
                hashMap.put(i + "_2", cVar2.a.get("frequency"));
                hashMap.put(i + "_3", cVar2.a.get("commandid"));
                hashMap.put(i + "_4", cVar2.a.get(Constant.KEY_RESULT_CODE));
                hashMap.put(i + "_5", cVar2.a.get("timeCost"));
                hashMap.put(i + "_6", cVar2.a.get("reqSize"));
                hashMap.put(i + "_7", cVar2.a.get("rspSize"));
                hashMap.put(i + "_8", cVar2.a.get(GearsLocator.DETAIL));
                hashMap.put(i + "_9", cVar2.a.get("uin"));
                hashMap.put(i + "_10", d.e(com.tencent.open.utils.f.a()) + "&" + cVar2.a.get("deviceInfo"));
            }
            SLog.v("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: " + hashMap.toString());
            return hashMap;
        } catch (Exception e) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", e);
            return null;
        }
    }

    protected Map<String, String> d() {
        List<Serializable> a2 = g.a().a("report_via");
        if (a2 != null) {
            this.d.addAll(a2);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.d.size());
        if (this.d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Serializable> it = this.d.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = new JSONObject();
            c cVar = (c) it.next();
            for (String str : cVar.a.keySet()) {
                try {
                    String str2 = cVar.a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject2.toString());
            return hashMap;
        } catch (JSONException e2) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    protected void e() {
        if (k.b(com.tencent.open.utils.f.a())) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.g, new Runnable() { // from class: com.tencent.open.b.h.5
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
                    r19 = r4;
                    r23 = r6;
                    r21 = r13;
                    r0 = r17;
                    r2 = true;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 287
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.h.AnonymousClass5.run():void");
                }
            });
        }
    }

    public void a(final String str, final Map<String, String> map) {
        if (k.b(com.tencent.open.utils.f.a())) {
            j.b(new Runnable() { // from class: com.tencent.open.b.h.6
                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    try {
                        int a2 = f.a();
                        if (a2 == 0) {
                            a2 = 3;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + a2);
                        do {
                            i++;
                            try {
                                try {
                                    int d = com.tencent.open.a.a.a().a(str, map).d();
                                    SLog.i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + d);
                                    return;
                                } catch (SocketTimeoutException e) {
                                    SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                                    if (i >= a2) {
                                    }
                                }
                            } catch (Exception e2) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e2);
                                return;
                            }
                        } while (i >= a2);
                    } catch (Exception e3) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e3);
                    }
                }
            });
        }
    }
}
