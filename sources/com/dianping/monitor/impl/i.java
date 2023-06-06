package com.dianping.monitor.impl;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.logreportswitcher.c;
import com.meituan.android.common.metricx.koom.KoomDebugger;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static String f;
    private static i n;
    int c;
    private int e;
    private String g;
    private String h;
    private String i;
    private long j;
    private int k;
    private Context m;
    private SimpleDateFormat o;
    private static final Executor d = com.sankuai.android.jarvis.c.a("CrashMonitor", 1, 2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static boolean b = a.DEBUG;
    private static long l = 86400000;

    private i(Context context, int i, String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043abede7d54a170a58bb205f1903c21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043abede7d54a170a58bb205f1903c21");
            return;
        }
        this.c = 10;
        this.j = 0L;
        this.k = 0;
        this.o = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.e = i;
        if (TextUtils.isEmpty(f)) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            f = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a2b0344b659efe6aaff00e1907fce22", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a2b0344b659efe6aaff00e1907fce22") : com.dianping.monitor.h.b(context);
        }
        this.g = com.dianping.monitor.h.b();
        this.h = com.dianping.monitor.h.c();
        this.i = com.dianping.monitor.h.a();
        this.m = context.getApplicationContext();
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19b637011c8bd9f82f36c3c0e25a7598", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19b637011c8bd9f82f36c3c0e25a7598");
            return;
        }
        this.j = com.dianping.monitor.h.b(context, "CRASH_MONITOR_TIME");
        this.k = com.dianping.monitor.h.a(context, "CRASH_MONITOR_TIMES");
        if (this.j == 0) {
            this.j = System.currentTimeMillis();
            this.k = 0;
        }
    }

    public static synchronized i a(Context context, int i, String str) {
        synchronized (i.class) {
            Object[] objArr = {context, Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf17e0898a4e34cdab2aa775ef746ec2", 6917529027641081856L)) {
                return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf17e0898a4e34cdab2aa775ef746ec2");
            }
            if (n == null) {
                n = new i(context, i, str);
            }
            return n;
        }
    }

    public final synchronized void a(long j, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {new Long(j), str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb4f1f32355d294d938b2944d3587b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb4f1f32355d294d938b2944d3587b9");
        } else if (c.b.a.a(KoomDebugger.CRASH)) {
            if (this.j + l < System.currentTimeMillis()) {
                this.j = System.currentTimeMillis();
                this.k = 0;
                com.dianping.monitor.h.a(this.m, "CRASH_MONITOR_TIME", this.j);
            }
            if (this.k < this.c) {
                Object[] objArr2 = {new Long(j), str, str2, str3, str4, str5};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e2c4e2718a12b5b6170f576aa211697", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e2c4e2718a12b5b6170f576aa211697");
                } else {
                    final JSONObject jSONObject = new JSONObject();
                    try {
                        String format = this.o.format(new Date(System.currentTimeMillis()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.e);
                        jSONObject.put("appId", sb.toString());
                        jSONObject.put("appVersion", f);
                        jSONObject.put("platVersion", this.g);
                        jSONObject.put("deviceBrand", this.h);
                        jSONObject.put(DeviceInfo.DEVICE_MODEL, this.i);
                        jSONObject.put("crashTime", format);
                        jSONObject.put("unionId", str);
                        jSONObject.put("platform", "android");
                        jSONObject.put("reason", str2);
                        jSONObject.put("mapId", str3);
                        jSONObject.put("category", str5);
                        jSONObject.put("crashContent", str4);
                        com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.dianping.monitor.impl.i.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                InputStream inputStream;
                                Throwable th;
                                HttpURLConnection httpURLConnection;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f01c4e662a4207c87f34da691e3b970d", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f01c4e662a4207c87f34da691e3b970d");
                                    return;
                                }
                                OutputStream outputStream = null;
                                try {
                                    httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(c.b()).openConnection());
                                    try {
                                        httpURLConnection.addRequestProperty("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
                                        httpURLConnection.setConnectTimeout(15000);
                                        httpURLConnection.setReadTimeout(15000);
                                        httpURLConnection.setDoInput(true);
                                        httpURLConnection.setDoOutput(true);
                                        httpURLConnection.setRequestMethod("POST");
                                        OutputStream outputStream2 = httpURLConnection.getOutputStream();
                                        try {
                                            outputStream2.write(jSONObject.toString().getBytes());
                                            inputStream = httpURLConnection.getInputStream();
                                            try {
                                                httpURLConnection.getResponseCode();
                                                if (outputStream2 != null) {
                                                    try {
                                                        outputStream2.close();
                                                    } catch (IOException e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception e2) {
                                                        e2.printStackTrace();
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                            } catch (Error unused) {
                                                outputStream = outputStream2;
                                                if (outputStream != null) {
                                                    try {
                                                        outputStream.close();
                                                    } catch (IOException e3) {
                                                        e3.printStackTrace();
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception e4) {
                                                        e4.printStackTrace();
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                            } catch (Exception unused2) {
                                                outputStream = outputStream2;
                                                if (outputStream != null) {
                                                    try {
                                                        outputStream.close();
                                                    } catch (IOException e5) {
                                                        e5.printStackTrace();
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception e6) {
                                                        e6.printStackTrace();
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                outputStream = outputStream2;
                                                if (outputStream != null) {
                                                    try {
                                                        outputStream.close();
                                                    } catch (IOException e7) {
                                                        e7.printStackTrace();
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Exception e8) {
                                                        e8.printStackTrace();
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                throw th;
                                            }
                                        } catch (Error unused3) {
                                            inputStream = null;
                                        } catch (Exception unused4) {
                                            inputStream = null;
                                        } catch (Throwable th3) {
                                            inputStream = null;
                                            outputStream = outputStream2;
                                            th = th3;
                                        }
                                    } catch (Error unused5) {
                                        inputStream = null;
                                    } catch (Exception unused6) {
                                        inputStream = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        inputStream = null;
                                    }
                                } catch (Error unused7) {
                                    httpURLConnection = null;
                                    inputStream = null;
                                } catch (Exception unused8) {
                                    httpURLConnection = null;
                                    inputStream = null;
                                } catch (Throwable th5) {
                                    inputStream = null;
                                    th = th5;
                                    httpURLConnection = null;
                                }
                            }
                        });
                    } catch (JSONException unused) {
                    }
                }
                this.k++;
                com.dianping.monitor.h.a(this.m, "CRASH_MONITOR_TIMES", this.k);
            }
        }
    }
}
