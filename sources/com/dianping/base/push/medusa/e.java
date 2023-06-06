package com.dianping.base.push.medusa;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.util.h;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    Context b;
    String c;
    String d;
    com.dianping.base.push.pushservice.e e;
    private d f;
    private a g;

    public e(Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cfea54ef130531e6ec4ed78fec454fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cfea54ef130531e6ec4ed78fec454fe");
            return;
        }
        this.b = context.getApplicationContext();
        this.f = dVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1062d0958165ef4f9bfac04e737a4944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1062d0958165ef4f9bfac04e737a4944");
            return;
        }
        try {
            this.e = com.dianping.base.push.pushservice.e.a(this.b, "medusa");
        } catch (Exception unused) {
            com.dianping.base.push.pushservice.c.d("Medusa", "cips init failed!");
        }
        this.c = this.b.getPackageName();
        if (this.c.contains("push.demo")) {
            this.c = "com.dianping.v1";
        }
        this.d = "";
        try {
            this.d = this.b.getPackageManager().getPackageInfo(this.c, 0).versionName;
        } catch (Throwable th) {
            com.dianping.base.push.pushservice.c.d("Medusa", th.toString());
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504fbfeab0a4d1753d4ebe382e394a95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504fbfeab0a4d1753d4ebe382e394a95");
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.medusa.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a480518b6014155a2076b56e02ef742", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a480518b6014155a2076b56e02ef742");
                    } else {
                        e.this.b(z);
                    }
                }
            });
        } else {
            b(z);
        }
    }

    synchronized void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023936c4f6ddf57b7de8cfd942d268df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023936c4f6ddf57b7de8cfd942d268df");
            return;
        }
        com.dianping.base.push.pushservice.c.a("Medusa", "realStartReport " + z);
        if (this.g != null && !this.g.c) {
            if (!z && this.g.b) {
                com.dianping.base.push.pushservice.c.a("Medusa", "realStartReport not force return");
                return;
            }
            a aVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8ac743e04ab26819c676324ffd1c0b79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8ac743e04ab26819c676324ffd1c0b79");
            } else {
                com.dianping.base.push.pushservice.c.a("Medusa", "ReportRunnable stop");
                if (!aVar.c) {
                    if (aVar.d != null) {
                        try {
                            aVar.d.interrupt();
                        } catch (Exception e) {
                            com.dianping.base.push.pushservice.c.d("Medusa", e.toString());
                        }
                    }
                    aVar.c = true;
                    aVar.a();
                }
            }
        }
        this.g = new a(z);
        com.sankuai.waimai.launcher.util.aop.b.a(h.a(), this.g);
    }

    JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943a49bc627d759b6793d5e25bdeaaa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943a49bc627d759b6793d5e25bdeaaa4");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newdid", this.f.c());
            d dVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            jSONObject.put("newtk", PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "3087993b114df1ee3231a95140ccfe30", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "3087993b114df1ee3231a95140ccfe30") : com.dianping.base.push.pushservice.f.d(b.c().b));
            jSONObject.put(Constants.Environment.KEY_CITYID, this.f.a() == null ? "" : this.f.a());
            jSONObject.put("newuid", this.f.b() == null ? "" : this.f.b());
            d dVar2 = this.f;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            jSONObject.put("ps", PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "2111467d2cbee077ad478793cf2b5c31", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "2111467d2cbee077ad478793cf2b5c31")).booleanValue() : NotificationManagerCompat.from(b.c().b).areNotificationsEnabled() ? "1" : "0");
            jSONObject.put("oncid", c(true));
            jSONObject.put("offcid", c(false));
        } catch (Exception e) {
            com.dianping.base.push.pushservice.c.d("Medusa", "getParameters exception " + e.getMessage());
        }
        return jSONObject;
    }

    private String c(boolean z) {
        List<NotificationChannel> notificationChannels;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c43c0984a3117f1026f6256fcd91c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c43c0984a3117f1026f6256fcd91c4");
        }
        String str = ";";
        if (this.b != null && Build.VERSION.SDK_INT >= 26 && (notificationChannels = ((NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION)).getNotificationChannels()) != null && notificationChannels.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (z && notificationChannel.getImportance() > 0) {
                    sb.append(notificationChannel.getId());
                    sb.append(";");
                } else if (!z && notificationChannel.getImportance() == 0) {
                    sb.append(notificationChannel.getId());
                    sb.append(";");
                }
            }
            str = sb.toString();
        }
        com.dianping.base.push.pushservice.c.a("Medusa", "getNotificationList on " + z + ", " + str);
        return str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        boolean b;
        volatile boolean c;
        Thread d;
        private HttpURLConnection f;
        private OutputStream g;
        private InputStream h;
        private byte[] i;
        private int j;

        public a(boolean z) {
            Object[] objArr = {e.this, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0624c391d6e10a4f858bcf5f6ce28df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0624c391d6e10a4f858bcf5f6ce28df");
                return;
            }
            this.i = new byte[1024];
            this.c = false;
            this.j = 0;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1408c9a11779daee1fe1e24166e5ab4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1408c9a11779daee1fe1e24166e5ab4");
                return;
            }
            com.dianping.base.push.pushservice.c.a("Medusa", "ReportRunnable run " + this.b);
            try {
                this.d = Thread.currentThread();
                JSONObject a2 = e.this.a();
                if (a(a2) && !this.c) {
                    if (com.dianping.base.push.pushservice.f.a() != null) {
                        com.dianping.base.push.pushservice.f.a().a(0L, "report_start_medusa_report", 0, 0, 200, 0, 0, 0, null, "");
                    }
                    if (b(a2)) {
                        e.this.e.b("remote_data", a2.toString());
                        e.this.e.b("last_report_time", com.meituan.android.time.c.b());
                    }
                } else {
                    com.dianping.base.push.pushservice.c.d("Medusa", "ReportRunnable checkParam not pass");
                }
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("Medusa", "ReportRunnable exception : " + e.getMessage());
            } finally {
                this.c = true;
            }
        }

        private boolean a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a309b3c9af1a7b869e4c3daa81c4966", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a309b3c9af1a7b869e4c3daa81c4966")).booleanValue();
            }
            try {
                com.dianping.base.push.pushservice.c.a("Medusa", "Medusa: checking, param: " + jSONObject.toString());
                if (com.dianping.base.push.pushservice.f.a() != null) {
                    com.dianping.base.push.pushservice.f.a().a(0L, "check_param_medusa_report", 0, 0, 200, 0, 0, 0, null, "");
                }
            } catch (Throwable th) {
                com.dianping.base.push.pushservice.c.d("Medusa", th.toString());
            }
            if (TextUtils.isEmpty(jSONObject.optString("newtk"))) {
                com.dianping.base.push.pushservice.c.a("Medusa", "empty token!");
                return false;
            } else if (TextUtils.isEmpty(jSONObject.optString("newdid"))) {
                com.dianping.base.push.pushservice.c.a("Medusa", "empty deviceId!");
                return false;
            } else {
                String a2 = e.this.e.a("remote_data", "");
                if (!TextUtils.isEmpty(a2)) {
                    try {
                        if (!a2.equals(jSONObject.toString())) {
                            com.dianping.base.push.pushservice.c.a("Medusa", "data has changed, start report");
                            return true;
                        }
                    } catch (Exception e) {
                        com.dianping.base.push.pushservice.c.d("Medusa", "something wrong with the data: " + e.toString());
                        e.this.e.b("remote_data", "");
                    }
                }
                long a3 = e.this.e.a("last_report_time", 0L);
                long b = com.meituan.android.time.c.b();
                long a4 = e.this.e.a("last_report_interval", 1440L) * LocationStrategy.LOCATION_TIMEOUT;
                com.dianping.base.push.pushservice.c.a("Medusa", "lastReportTime = " + a3 + ", currentTime = " + b + "，reportInterval = " + a4);
                if (a3 == 0) {
                    com.dianping.base.push.pushservice.c.a("Medusa", "has not report, start report");
                    return true;
                }
                if (b - a3 >= a4) {
                    com.dianping.base.push.pushservice.c.a("Medusa", "time has changed, start report");
                    return true;
                }
                return false;
            }
        }

        private boolean b(JSONObject jSONObject) {
            boolean z = false;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdf346d9727e2a73e06f3d8d98d43f9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdf346d9727e2a73e06f3d8d98d43f9")).booleanValue();
            }
            com.dianping.base.push.pushservice.c.a("Medusa", "try report " + (this.j + 1) + ", body = " + jSONObject);
            if (jSONObject == null) {
                return false;
            }
            int i = this.j + 1;
            this.j = i;
            if (i > 2) {
                com.dianping.base.push.pushservice.c.d("Medusa", String.format(Locale.CHINA, "retry %d exceed max retry count %d", Integer.valueOf(this.j), 2));
                return false;
            }
            this.g = null;
            this.h = null;
            this.f = null;
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(com.dianping.base.push.pushservice.f.e(e.this.b) ? "https://medusa.51ping.com/sdk/report" : "https://medusa.dianping.com/sdk/report").openConnection());
                e eVar = e.this;
                HttpURLConnection httpURLConnection = this.f;
                Object[] objArr2 = {httpURLConnection, jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "775483e2822fda46a69c83854b1e7ad0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "775483e2822fda46a69c83854b1e7ad0");
                } else if (httpURLConnection != null) {
                    httpURLConnection.addRequestProperty("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
                    httpURLConnection.addRequestProperty("Accept", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
                    httpURLConnection.addRequestProperty(Constants.Environment.KEY_CT, "2");
                    httpURLConnection.addRequestProperty("bundleid", eVar.c);
                    httpURLConnection.addRequestProperty("sdk", "4052001");
                    httpURLConnection.addRequestProperty("appversion", eVar.d);
                    httpURLConnection.addRequestProperty(Constants.Environment.KEY_CITYID, jSONObject.optString(Constants.Environment.KEY_CITYID, ""));
                }
                this.f.setReadTimeout(10000);
                this.f.setConnectTimeout(10000);
                this.f.setDoInput(true);
                this.f.setDoOutput(true);
                this.f.setRequestMethod("POST");
                this.f.connect();
                this.g = this.f.getOutputStream();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                if (this.g != null) {
                    while (true) {
                        int read = byteArrayInputStream.read(this.i);
                        if (read == -1) {
                            break;
                        }
                        this.g.write(this.i, 0, read);
                    }
                    this.g.flush();
                }
                int responseCode = this.f.getResponseCode();
                com.dianping.base.push.pushservice.c.a("Medusa", "response code: " + responseCode);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                this.h = this.f.getInputStream();
                while (true) {
                    int read2 = this.h.read(this.i);
                    if (read2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(this.i, 0, read2);
                }
                String optString = new JSONObject(new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset())).optString("msg");
                if (responseCode == 200 && "success".equals(optString)) {
                    z = true;
                }
                com.dianping.base.push.pushservice.c.a("Medusa", "msg: " + optString);
                if (com.dianping.base.push.pushservice.f.a() != null) {
                    com.dianping.base.push.pushservice.f.a().pv4(0L, "medusa_report", 0, 8, responseCode, 0, 0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), null, "", 1);
                    if (z) {
                        com.dianping.base.push.pushservice.f.a().a(0L, "medusa_report_successful", 0, 8, responseCode, 0, 0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime), null, "");
                    }
                }
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("Medusa", "Medusa: report throw exception: " + e.toString());
                if (com.dianping.base.push.pushservice.f.a() != null) {
                    com.dianping.base.push.pushservice.f.a().pv4(0L, "medusa_report", 0, 0, -100, 0, 0, 0, null, "", 1);
                }
                if ((e instanceof UnknownHostException) || (e instanceof SocketTimeoutException)) {
                    return b(jSONObject);
                }
            } finally {
                a();
            }
            return z;
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7258f6453abdf1d47442fff0d57fbf0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7258f6453abdf1d47442fff0d57fbf0c");
                return;
            }
            com.dianping.base.push.pushservice.util.d.a(this.g);
            com.dianping.base.push.pushservice.util.d.a(this.h);
            if (this.f != null) {
                this.f.disconnect();
            }
        }
    }
}
