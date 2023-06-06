package com.meituan.android.time;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.cipstorage.q;
import com.meituan.android.time.retrofit.SntpNetWorkResult;
import com.meituan.android.time.retrofit.SntpTimeService;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c m;
    public com.meituan.android.time.a b;
    public int e;
    private a g;
    private volatile TimeChangeReceiver h;
    private String i;
    private volatile boolean k;
    private volatile boolean l;
    private a.InterfaceC0637a n;
    private Context o;
    private long p;
    private Handler q;
    private volatile long r;
    public static final String[] c = {"hk.pool.ntp.org", "tw.pool.ntp.org", "time.asia.apple.com", "jp.pool.ntp.org", "pool.ntp.org", "asia.pool.ntp.org", "ntp1.aliyun.com", "sg.pool.ntp.org", "cn.pool.ntp.org"};
    public static String d = "http://apimobile.meituan.com/group/v1/timestamp/milliseconds";
    private static final ThreadFactory j = new ThreadFactory() { // from class: com.meituan.android.time.c.1
        public static ChangeQuickRedirect a;
        private final AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b5484c77b7e65ba4902d36e4d2f96a6", 6917529027641081856L)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b5484c77b7e65ba4902d36e4d2f96a6");
            }
            return new Thread(runnable, "SntpClock #" + this.b.getAndIncrement());
        }
    };
    static final ExecutorService f = com.sankuai.android.jarvis.c.a("SntpClock", 2, j);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a {
    }

    public static /* synthetic */ long b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "b1c82b4825c28d092944a000ffbebaf7", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b1c82b4825c28d092944a000ffbebaf7")).longValue();
        }
        if (cVar.o != null) {
            return q.a(cVar.o, "mtplatform_sntpclock", 2).b("time_offset", 0L);
        }
        return 0L;
    }

    public static /* synthetic */ void e(c cVar) {
        long j2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c0bb00dd53149a002e6a1e81e759f5c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c0bb00dd53149a002e6a1e81e759f5c7");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(cVar.b(TextUtils.isEmpty(cVar.i) ? d : cVar.i));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        long j3 = 0;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong("currentMs");
            if (optLong > 0) {
                j2 = optLong - currentTimeMillis;
                j3 = cVar.b(optLong);
                cVar.r = j3;
                cVar.p = j2;
                cVar.a("offset from meituan server is: " + cVar.p);
                cVar.a(cVar.p);
            }
        }
        j2 = 0;
        cVar.r = j3;
        cVar.p = j2;
        cVar.a("offset from meituan server is: " + cVar.p);
        cVar.a(cVar.p);
    }

    public static /* synthetic */ void f(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "dc667fcb69204df7056a20989a69009c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "dc667fcb69204df7056a20989a69009c");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.time.retrofit.a a2 = com.meituan.android.time.retrofit.a.a(cVar.n);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.time.retrofit.a.a;
        (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "01982fc9856872cfa9c57259be6f58f3", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "01982fc9856872cfa9c57259be6f58f3") : ((SntpTimeService) a2.b.a(SntpTimeService.class)).getStandardNetTime()).a(new f<SntpNetWorkResult>() { // from class: com.meituan.android.time.c.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<SntpNetWorkResult> call, Response<SntpNetWorkResult> response) {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c427ff5ff2ee0cad0b5419d49bb97210", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c427ff5ff2ee0cad0b5419d49bb97210");
                    return;
                }
                SntpNetWorkResult e = response.e();
                if (e == null) {
                    return;
                }
                long j2 = e.currentMs - currentTimeMillis;
                c.this.r = c.this.b(e.currentMs);
                c.this.p = j2;
                c cVar2 = c.this;
                cVar2.a("offset by retrofit from meituan server is: " + c.this.p);
                c.this.a(c.this.p);
                c.this.a(true);
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<SntpNetWorkResult> call, Throwable th) {
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d0c83acdbd1708de85f3b637f35d535", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d0c83acdbd1708de85f3b637f35d535");
                    return;
                }
                Log.e("sntp", "onFailure: ");
                c cVar2 = c.this;
                cVar2.a("offset by retrofit from meituan server fail: " + th.getMessage());
                c.this.a(false);
                th.printStackTrace();
            }
        });
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "599817f82ec0f5f24bdcb4773442cc74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "599817f82ec0f5f24bdcb4773442cc74");
            return;
        }
        this.i = null;
        this.e = 5000;
        this.l = true;
        this.q = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.time.c.2
            public static ChangeQuickRedirect a;
            private int e = 0;
            public List<Long> b = new ArrayList();
            public List<Long> c = new ArrayList();

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fa6905d80859a3514f9e5bd25d14d27", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fa6905d80859a3514f9e5bd25d14d27");
                    return;
                }
                this.e++;
                long[] longArray = message.getData().getLongArray("offset");
                long[] longArray2 = message.getData().getLongArray("real_offset");
                for (long j2 : longArray) {
                    this.b.add(Long.valueOf(j2));
                }
                for (long j3 : longArray2) {
                    this.c.add(Long.valueOf(j3));
                }
                if (this.e >= 2) {
                    c.this.p = c.this.a(this.b);
                    c.this.r = c.this.a(this.c);
                    c.this.a("calculated offset val: " + c.this.p);
                    new StringBuilder("calculated offset val :").append(c.this.p);
                    if (0 == c.this.p || Math.abs(c.this.p) > DDLoadConstants.TIME_HOURS_MILLIS) {
                        c.this.a("calculated offset is not available, get from meituan server ");
                        c cVar = c.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "2b0b6d3208fea9f28e5b375b51928d73", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "2b0b6d3208fea9f28e5b375b51928d73");
                        } else {
                            c.f.execute(new b());
                        }
                    } else {
                        c.this.a(true);
                        c.this.a("calculated offset is available, save ");
                        c.this.a(c.this.p);
                    }
                    this.b.clear();
                    this.c.clear();
                    this.e = 0;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad031be8a9a81c717e0b14447d99d0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad031be8a9a81c717e0b14447d99d0f");
        } else if (this.g == null || str == null) {
        } else {
            str.isEmpty();
        }
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "321c9d2eb55c7f1575180fd5993bf974", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "321c9d2eb55c7f1575180fd5993bf974")).longValue() : d().p;
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12aeaf60595d49e3088e161ba7462f4a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12aeaf60595d49e3088e161ba7462f4a")).longValue() : System.currentTimeMillis() + d().p;
    }

    public static long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7475b81ce977ce742f514337b9abe0b7", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7475b81ce977ce742f514337b9abe0b7")).longValue();
        }
        long j2 = d().r;
        if (j2 == 0) {
            return 0L;
        }
        return j2 + SystemClock.elapsedRealtime();
    }

    public static synchronized void a(Context context) {
        synchronized (c.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "127b17c1640f04e8f98a22baad7d0b63", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "127b17c1640f04e8f98a22baad7d0b63");
            } else {
                a(context, 5000);
            }
        }
    }

    private static synchronized void a(Context context, int i) {
        synchronized (c.class) {
            Object[] objArr = {context, 5000};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f61bd4614e1a02b36517949ffe65746", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f61bd4614e1a02b36517949ffe65746");
            } else {
                a(context, 5000, null);
            }
        }
    }

    private void a(ExecutorService executorService) {
        Object[] objArr = {executorService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0754cb3ad5ae6630126c1830ec3a5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0754cb3ad5ae6630126c1830ec3a5a");
            return;
        }
        if (executorService == null) {
            executorService = f;
        }
        executorService.execute(new Runnable() { // from class: com.meituan.android.time.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41221b41bef9b0189be9ae5cb974ca5c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41221b41bef9b0189be9ae5cb974ca5c");
                    return;
                }
                c.d().p = c.b(c.this);
            }
        });
        for (int i = 0; i < 2; i++) {
            executorService.execute(new RunnableC0369c(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2726243f4eb034defee296726f098f06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2726243f4eb034defee296726f098f06");
        } else if (this.o != null) {
            q.a(this.o, "mtplatform_sntpclock", 2).a("time_offset", j2);
        }
    }

    private static synchronized void a(final Context context, int i, ExecutorService executorService) {
        synchronized (c.class) {
            Object[] objArr = {context, Integer.valueOf(i), null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8339b4334dcc2ae88d7a163b1742f08c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8339b4334dcc2ae88d7a163b1742f08c");
            } else if (context == null && (context = e()) == null) {
            } else {
                if (!(context instanceof Application)) {
                    context = context.getApplicationContext();
                }
                if (context == null) {
                    return;
                }
                c d2 = d();
                d2.o = context;
                if (i != 0) {
                    d2.e = i;
                }
                d2.a((ExecutorService) null);
                if (d2.h == null) {
                    d2.h = new TimeChangeReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    context.registerReceiver(d2.h, intentFilter);
                }
                if (!d2.k) {
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a329d7cb6e76103c0f27d57963e10395", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a329d7cb6e76103c0f27d57963e10395");
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.meituan.android.time.c.4
                            public static ChangeQuickRedirect a;

                            @Override // android.net.ConnectivityManager.NetworkCallback
                            public final void onAvailable(Network network) {
                                Object[] objArr3 = {network};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21f1a1ff247a9fa3e5333f3d38373ed7", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21f1a1ff247a9fa3e5333f3d38373ed7");
                                } else if (c.d().l) {
                                } else {
                                    c.a(context);
                                }
                            }
                        };
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (Build.VERSION.SDK_INT >= 26) {
                                connectivityManager.registerDefaultNetworkCallback(networkCallback);
                            } else {
                                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), networkCallback);
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.meituan.android.time.SntpClock$5
                            public static ChangeQuickRedirect a;

                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context2, Intent intent) {
                                Object[] objArr3 = {context2, intent};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a020f68ca13145a86803d9e343b663e", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a020f68ca13145a86803d9e343b663e");
                                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                    NetworkInfo networkInfo = null;
                                    try {
                                        networkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                                    } catch (Throwable unused2) {
                                    }
                                    if (networkInfo == null || !networkInfo.isConnected() || c.d().l) {
                                        return;
                                    }
                                    c.a(context2);
                                }
                            }
                        };
                        IntentFilter intentFilter2 = new IntentFilter();
                        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        context.registerReceiver(broadcastReceiver, intentFilter2);
                    }
                    d2.k = true;
                }
            }
        }
    }

    private static Context e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fbe5cf336bf9c2674ca77e8e49d685c", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fbe5cf336bf9c2674ca77e8e49d685c");
        }
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d144489371840e5d62ccb4313977fabb", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d144489371840e5d62ccb4313977fabb");
        }
        if (m == null) {
            synchronized (c.class) {
                if (m == null) {
                    m = new c();
                }
            }
        }
        return m;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5632f3b92e32acf5633b9dc4899159", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5632f3b92e32acf5633b9dc4899159");
        }
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            try {
                URLConnection wrapURLConnection = HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
                wrapURLConnection.setReadTimeout(this.e);
                wrapURLConnection.setRequestProperty("accept", "*/*");
                wrapURLConnection.setRequestProperty("connection", "Keep-Alive");
                wrapURLConnection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
                wrapURLConnection.connect();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(wrapURLConnection.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str2 = str2 + readLine;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            a(false);
                            th.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return str2;
                        } catch (Throwable th2) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            throw th2;
                        }
                    }
                }
                a(true);
                bufferedReader2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc36a93f2992e92b90732974f2aae3af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc36a93f2992e92b90732974f2aae3af");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e09b30c9ff1a6566650b4418d237e0b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e09b30c9ff1a6566650b4418d237e0b");
                return;
            }
            try {
                if (c.this.n == null) {
                    c.e(c.this);
                } else {
                    c.f(c.this);
                }
            } catch (Throwable th) {
                c cVar = c.this;
                cVar.a("offset from meituan server fail: " + th.getMessage());
                th.printStackTrace();
            }
        }
    }

    public final long a(List<Long> list) {
        int i;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692cdb4c76cdd311301a326fd29a5f09", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692cdb4c76cdd311301a326fd29a5f09")).longValue();
        }
        if (list.size() <= 1) {
            return 0L;
        }
        Collections.sort(list);
        if (list.size() <= 3) {
            return list.get(list.size() - 1).longValue();
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "786c22aaf960966f594e551021c14772", 6917529027641081856L)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "786c22aaf960966f594e551021c14772")).intValue();
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < list.size() - 1) {
                i2++;
                arrayList.add(Long.valueOf(Math.abs(list.get(i2).longValue() - list.get(i2).longValue())));
            }
            long j2 = Long.MAX_VALUE;
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (j2 > ((Long) arrayList.get(i4)).longValue() && ((Long) arrayList.get(i4)).longValue() > 1) {
                    j2 = ((Long) arrayList.get(i4)).longValue();
                    i3 = i4;
                }
            }
            i = i3;
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        for (Long l : list) {
            long longValue = l.longValue();
            if (Math.abs(longValue - list.get(i).longValue()) < 1000) {
                arrayList2.add(Long.valueOf(longValue));
            }
        }
        long j3 = 0;
        for (Long l2 : arrayList2) {
            j3 += l2.longValue();
        }
        if (arrayList2.size() <= 0) {
            return 0L;
        }
        return j3 / arrayList2.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.time.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0369c implements Runnable {
        public static ChangeQuickRedirect a;
        private int c;

        public RunnableC0369c(int i) {
            Object[] objArr = {c.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a70ce6db841ee5f93743cc46413c7e2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a70ce6db841ee5f93743cc46413c7e2");
            } else {
                this.c = i;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640db5a793db408ae1cce697618436d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640db5a793db408ae1cce697618436d2");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            com.meituan.android.time.b bVar = new com.meituan.android.time.b(c.this.g);
            for (int length = this.c * ((c.c.length / 2) + 1); length < Math.min((this.c + 1) * ((c.c.length / 2) + 1), c.c.length); length++) {
                if (bVar.a(c.c[length], c.this.e)) {
                    arrayList.add(Long.valueOf(bVar.c));
                    arrayList2.add(Long.valueOf(c.this.b(bVar.b)));
                }
            }
            Message obtainMessage = c.this.q.obtainMessage();
            Bundle bundle = new Bundle();
            long[] jArr = new long[arrayList.size()];
            long[] jArr2 = new long[arrayList2.size()];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = ((Long) arrayList.get(i)).longValue();
            }
            for (int i2 = 0; i2 < jArr2.length; i2++) {
                jArr2[i2] = ((Long) arrayList2.get(i2)).longValue();
            }
            bundle.putLongArray("offset", jArr);
            bundle.putLongArray("real_offset", jArr2);
            obtainMessage.setData(bundle);
            obtainMessage.arg1 = this.c;
            obtainMessage.sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7abd270d89d257993d08fea11460dee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7abd270d89d257993d08fea11460dee");
            return;
        }
        this.l = z;
        if (this.b != null) {
            this.b.trustedTimeCallBack(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4e1c7bd9e09541d595d2d20eaa4355", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4e1c7bd9e09541d595d2d20eaa4355")).longValue() : j2 - SystemClock.elapsedRealtime();
    }
}
