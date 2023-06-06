package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.alipay.sdk.sys.a;
import com.alipay.sdk.util.l;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.tencent.mapsdk.internal.y;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public Activity a;
    public volatile IAlixPay b;
    public boolean d;
    public e e;
    public final com.alipay.sdk.sys.a f;
    public final Object c = IAlixPay.class;
    public boolean g = false;
    public String h = null;
    public String i = null;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements AlipayResultActivity.a {
        public final /* synthetic */ CountDownLatch a;

        public a(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.a
        public final void a(int i, String str, String str2) {
            f.this.h = com.alipay.sdk.app.d.a(i, str, str2);
            this.a.countDown();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements APayEntranceActivity.a {
        public final /* synthetic */ CountDownLatch a;

        public b(CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public final void a(String str) {
            f.this.i = str;
            this.a.countDown();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c extends IRemoteServiceCallback.Stub {
        public c() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 3;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            com.alipay.sdk.app.statistic.a.b(f.this.f, "wlt", str, str2);
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                com.alipay.sdk.app.statistic.a.a(f.this.f, "biz", "ErrIntentEx", e);
            }
            intent.setClassName(str, str2);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    com.alipay.sdk.sys.a aVar = f.this.f;
                    com.alipay.sdk.app.statistic.a.b(aVar, "biz", "isFg", runningAppProcessInfo.processName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + runningAppProcessInfo.importance + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
            } catch (Throwable unused) {
            }
            try {
                if (f.this.a == null) {
                    com.alipay.sdk.app.statistic.a.a(f.this.f, "biz", "ErrActNull", "");
                    Context context = f.this.f.c;
                    if (context != null) {
                        context.startActivity(intent);
                    }
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    f.this.a.startActivity(intent);
                    com.alipay.sdk.sys.a aVar2 = f.this.f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    com.alipay.sdk.app.statistic.a.b(aVar2, "biz", "stAct2", sb.toString());
                }
                f.this.e.a();
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.a(f.this.f, "biz", "ErrActNull", th);
                throw th;
            }
        }

        public /* synthetic */ c(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d implements ServiceConnection {
        private d() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.alipay.sdk.app.statistic.a.a(f.this.f, "biz", "srvCon");
            synchronized (f.this.c) {
                f.this.b = IAlixPay.Stub.asInterface(iBinder);
                f.this.c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.alipay.sdk.app.statistic.a.a(f.this.f, "biz", "srvDis");
            f.this.b = null;
        }

        public /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    public f(Activity activity, com.alipay.sdk.sys.a aVar, e eVar) {
        this.a = activity;
        this.f = aVar;
        this.e = eVar;
        com.alipay.sdk.util.d.b("mspl", "alipaySdk");
    }

    private String b(String str, String str2) {
        JSONObject jSONObject;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String a2 = l.a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.sys.a aVar = this.f;
        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "BSAStart", a2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + elapsedRealtime);
        a.C0029a.a(this.f, a2);
        APayEntranceActivity.a.put(a2, new b(countDownLatch));
        try {
            HashMap<String, String> a3 = com.alipay.sdk.sys.a.a(this.f);
            a3.put("ts_intent", String.valueOf(elapsedRealtime));
            jSONObject = new JSONObject(a3);
        } catch (Throwable th) {
            try {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e2) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSAWaiting", e2);
                return com.alipay.sdk.app.d.a(com.alipay.sdk.app.e.PAY_WAITTING.i, com.alipay.sdk.app.e.PAY_WAITTING.j, "");
            } catch (Throwable th2) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSAEx", th2);
                return "scheme_failed";
            }
        }
        Intent intent = new Intent(this.a, APayEntranceActivity.class);
        intent.putExtra("ap_order_info", str);
        intent.putExtra("ap_target_packagename", str2);
        intent.putExtra("ap_session", a2);
        if (jSONObject != null) {
            intent.putExtra("ap_local_info", jSONObject.toString());
        }
        com.alipay.sdk.app.statistic.a.a(this.a, this.f, str, this.f.d);
        this.a.startActivity(intent);
        com.alipay.sdk.data.a.a().a(this.f, this.a.getApplicationContext(), false);
        countDownLatch.await();
        String str3 = this.i;
        String str4 = "unknown";
        try {
            String str5 = j.a(this.f, str3).get("resultStatus");
            str4 = str5 == null ? StringUtil.NULL : str5;
        } catch (Throwable th3) {
            com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSAStatEx", th3);
        }
        com.alipay.sdk.sys.a aVar2 = this.f;
        com.alipay.sdk.app.statistic.a.a(aVar2, "biz", "BSADone-" + str4);
        if (TextUtils.isEmpty(str3)) {
            com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSAEmpty");
            return "scheme_failed";
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.f.a(java.lang.String):java.lang.String");
    }

    private void a(l.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.a.startActivity(intent);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(this.f, "biz", "StartLaunchAppTransEx", th);
        }
        Thread.sleep(200L);
    }

    private String a(String str, String str2, PackageInfo packageInfo, l.c cVar) {
        String str3;
        com.alipay.sdk.sys.a aVar;
        boolean z = false;
        int i = packageInfo != null ? packageInfo.versionCode : 0;
        String str4 = packageInfo != null ? packageInfo.versionName : "";
        com.alipay.sdk.util.d.b("mspl", "pay bind or scheme");
        com.alipay.sdk.sys.a aVar2 = this.f;
        com.alipay.sdk.app.statistic.a.b(aVar2, "biz", "PgWltVer", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str4);
        com.alipay.sdk.sys.a aVar3 = this.f;
        if (aVar3 != null && !TextUtils.isEmpty(aVar3.g)) {
            z = this.f.g.toLowerCase().contains("auth");
        }
        if (!z && l.e()) {
            if (cVar != null) {
                try {
                    if (com.alipay.sdk.data.a.a().q) {
                        a(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BindSkipByModel");
            str3 = "failed";
        } else if (!z && l.c(this.f, str2)) {
            if (cVar != null) {
                try {
                    if (com.alipay.sdk.data.a.a().q) {
                        a(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BindSkipByL");
            str3 = "failed";
        } else {
            if (cVar != null) {
                try {
                    if (!com.alipay.sdk.data.a.a().p) {
                        a(cVar);
                    }
                } catch (Throwable unused3) {
                }
            }
            Pair<String, Boolean> a2 = a(str, str2, this.f);
            String str5 = (String) a2.first;
            try {
                if ("failed".equals(str5) && ((Boolean) a2.second).booleanValue() && com.alipay.sdk.data.a.a().o) {
                    com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BindRetry");
                    str3 = (String) a(str, str2, this.f).first;
                }
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BindRetryEx", th);
            }
            str3 = str5;
        }
        com.alipay.sdk.util.d.b("mspl", "pay bind result: " + str3);
        Activity activity = this.a;
        com.alipay.sdk.sys.a aVar4 = this.f;
        com.alipay.sdk.app.statistic.a.a(activity, aVar4, str, aVar4.d);
        if ("failed".equals(str3)) {
            if (!com.alipay.sdk.data.a.a().g) {
                com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BSPNotStartByConfig", "");
                return str3;
            } else if (!"com.eg.android.AlipayGphone".equals(str2) || i <= 125) {
                com.alipay.sdk.sys.a aVar5 = this.f;
                com.alipay.sdk.app.statistic.a.b(aVar5, "biz", "BSPNotStartByPkg", str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i);
            } else if (com.alipay.sdk.data.a.a().l && (aVar = this.f) != null && l.b(aVar.f) != 0) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPNotStartByUsr");
                return str3;
            } else {
                Activity activity2 = this.a;
                return (activity2 == null || !a(str2, activity2, this.f)) ? "scheme_failed" : a(str, str2);
            }
        }
        return str3;
    }

    private String a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject;
        String str6 = str;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String a2 = l.a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.app.statistic.a.b(this.f, "biz", "BSPStart", a2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + elapsedRealtime);
        a.C0029a.a(this.f, a2);
        AlipayResultActivity.a.put(a2, new a(countDownLatch));
        try {
            try {
                String[] split = str6.split("&", -1);
                str3 = "";
                str4 = "";
                int length = split.length;
                int i = 0;
                while (true) {
                    str5 = null;
                    if (i >= length) {
                        jSONObject = null;
                        break;
                    }
                    str5 = split[i];
                    if (str5.startsWith("bizcontext=")) {
                        String substring = str5.substring(str5.indexOf(CommonConstant.Symbol.BIG_BRACKET_LEFT), str5.lastIndexOf(CommonConstant.Symbol.BIG_BRACKET_RIGHT) + 1);
                        int indexOf = str5.indexOf(substring);
                        str3 = str5.substring(0, indexOf);
                        str4 = str5.substring(indexOf + substring.length());
                        jSONObject = new JSONObject(substring);
                        if (jSONObject.optString(Constants.Environment.KEY_SC).equals("h5tonative")) {
                            jSONObject.put(Constants.Environment.KEY_SC, "h5tonative_scheme");
                        } else {
                            jSONObject.put(Constants.Environment.KEY_SC, "h5tonative_sdkscheme");
                        }
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPEx", th);
                return "scheme_failed";
            }
        } catch (Exception e2) {
            try {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPSCReplaceEx", e2, Base64.encodeToString(str.getBytes(), 2));
            } catch (InterruptedException e3) {
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPWaiting", e3);
                return com.alipay.sdk.app.d.a(com.alipay.sdk.app.e.PAY_WAITTING.i, com.alipay.sdk.app.e.PAY_WAITTING.j, "");
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            if (str6.indexOf(str5) == str6.lastIndexOf(str5)) {
                str6 = str6.replace(str5, str3 + jSONObject.toString() + str4);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sourcePid", Binder.getCallingPid());
                jSONObject2.put("external_info", str6);
                jSONObject2.put(PushClientConstants.TAG_PKG_NAME, this.a.getPackageName());
                jSONObject2.put(DBSession.TABLE_NAME, a2);
                String encodeToString = Base64.encodeToString(jSONObject2.toString().getBytes("UTF-8"), 2);
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20000125");
                appendQueryParameter.appendQueryParameter("mqpSchemePay", encodeToString);
                try {
                    HashMap<String, String> a3 = com.alipay.sdk.sys.a.a(this.f);
                    a3.put("ts_scheme", String.valueOf(elapsedRealtime));
                    appendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(a3).toString());
                } catch (Throwable th2) {
                    com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPLocEx", th2);
                }
                String uri = appendQueryParameter.build().toString();
                Intent intent = new Intent();
                intent.setPackage(str2);
                intent.addFlags(y.a);
                intent.setData(Uri.parse(uri));
                com.alipay.sdk.app.statistic.a.a(this.a, this.f, str6, this.f.d);
                this.a.startActivity(intent);
                com.alipay.sdk.data.a.a().a(this.f, this.a.getApplicationContext(), false);
                com.alipay.sdk.util.d.b("mspl", "pay scheme waiting " + uri);
                countDownLatch.await();
                String str7 = this.h;
                String str8 = "unknown";
                try {
                    String str9 = j.a(this.f, str7).get("resultStatus");
                    str8 = str9 == null ? StringUtil.NULL : str9;
                } catch (Throwable th3) {
                    com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPStatEx", th3);
                }
                com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPDone-" + str8);
                if (TextUtils.isEmpty(str7)) {
                    com.alipay.sdk.app.statistic.a.a(this.f, "biz", "BSPEmpty");
                    return "scheme_failed";
                }
                return str7;
            }
            throw new RuntimeException("multi ctx_args");
        }
        throw new RuntimeException("empty ctx_args");
    }

    private static boolean a(String str, Context context, com.alipay.sdk.sys.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) == null) {
                com.alipay.sdk.app.statistic.a.a(aVar, "biz", "BSPDetectFail");
                return false;
            }
            return true;
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "BSPDetectFail", th);
            return false;
        }
    }

    private Pair<String, Boolean> a(String str, String str2, com.alipay.sdk.sys.a aVar) {
        int i;
        c cVar;
        Activity activity;
        Activity activity2;
        String Pay;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(l.a(str2));
        String a2 = l.a(this.a, str2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(str != null ? str.length() : 0);
        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindStarting", sb.toString());
        com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
        try {
            if (!com.alipay.sdk.data.a.a().k) {
                ComponentName startService = this.a.getApplication().startService(intent);
                com.alipay.sdk.app.statistic.a.b(aVar, "biz", "stSrv", startService != null ? startService.getPackageName() : StringUtil.NULL);
            } else {
                com.alipay.sdk.app.statistic.a.b(aVar, "biz", "stSrv", "skipped");
            }
            if (com.alipay.sdk.data.a.a().n) {
                i = 65;
                com.alipay.sdk.app.statistic.a.b(aVar, "biz", "bindFlg", "imp");
            } else {
                i = 1;
            }
            d dVar = new d(this, null);
            if (this.a.getApplicationContext().bindService(intent, dVar, i)) {
                synchronized (this.c) {
                    if (this.b == null) {
                        try {
                            this.c.wait(com.alipay.sdk.data.a.a().b());
                        } catch (InterruptedException e2) {
                            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "BindWaitTimeoutEx", e2);
                        }
                    }
                }
                IAlixPay iAlixPay = this.b;
                try {
                    if (iAlixPay == null) {
                        String a3 = l.a(this.a, str2);
                        com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ClientBindFailed", a2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a3);
                        Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                        try {
                            this.a.getApplicationContext().unbindService(dVar);
                        } catch (Throwable th) {
                            com.alipay.sdk.util.d.a(th);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(SystemClock.elapsedRealtime());
                        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindEnd", sb2.toString());
                        com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                        this.b = null;
                        if (this.d && (activity4 = this.a) != null) {
                            activity4.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return pair;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(elapsedRealtime2);
                    com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBinded", sb3.toString());
                    if (this.a.getRequestedOrientation() == 0) {
                        this.a.setRequestedOrientation(1);
                        this.d = true;
                    }
                    int version = iAlixPay.getVersion();
                    cVar = new c(this, null);
                    try {
                        if (version >= 3) {
                            iAlixPay.registerCallback03(cVar, str, null);
                        } else {
                            iAlixPay.registerCallback(cVar);
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(elapsedRealtime3);
                        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindPay", sb4.toString());
                        if (version >= 3) {
                            iAlixPay.r03("biz", "bind_pay", null);
                        }
                        if (version >= 2) {
                            HashMap<String, String> a4 = com.alipay.sdk.sys.a.a(aVar);
                            a4.put("ts_bind", String.valueOf(elapsedRealtime));
                            a4.put("ts_bend", String.valueOf(elapsedRealtime2));
                            a4.put("ts_pay", String.valueOf(elapsedRealtime3));
                            Pay = iAlixPay.pay02(str, a4);
                        } else {
                            Pay = iAlixPay.Pay(str);
                        }
                        String str3 = Pay;
                        try {
                            iAlixPay.unregisterCallback(cVar);
                        } catch (Throwable th2) {
                            com.alipay.sdk.util.d.a(th2);
                        }
                        try {
                            this.a.getApplicationContext().unbindService(dVar);
                        } catch (Throwable th3) {
                            com.alipay.sdk.util.d.a(th3);
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(SystemClock.elapsedRealtime());
                        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindEnd", sb5.toString());
                        com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                        this.b = null;
                        if (this.d && (activity3 = this.a) != null) {
                            activity3.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return new Pair<>(str3, Boolean.FALSE);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ClientBindFailed", th, "in_bind");
                            Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.TRUE);
                            if (cVar != null) {
                                try {
                                    iAlixPay.unregisterCallback(cVar);
                                } catch (Throwable th5) {
                                    com.alipay.sdk.util.d.a(th5);
                                }
                            }
                            try {
                                this.a.getApplicationContext().unbindService(dVar);
                            } catch (Throwable th6) {
                                com.alipay.sdk.util.d.a(th6);
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(SystemClock.elapsedRealtime());
                            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindEnd", sb6.toString());
                            com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                            this.b = null;
                            if (this.d && (activity2 = this.a) != null) {
                                activity2.setRequestedOrientation(0);
                                this.d = false;
                            }
                            return pair2;
                        } catch (Throwable th7) {
                            if (cVar != null) {
                                try {
                                    iAlixPay.unregisterCallback(cVar);
                                } catch (Throwable th8) {
                                    com.alipay.sdk.util.d.a(th8);
                                }
                            }
                            try {
                                this.a.getApplicationContext().unbindService(dVar);
                            } catch (Throwable th9) {
                                com.alipay.sdk.util.d.a(th9);
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(SystemClock.elapsedRealtime());
                            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgBindEnd", sb7.toString());
                            com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                            this.b = null;
                            if (this.d && (activity = this.a) != null) {
                                activity.setRequestedOrientation(0);
                                this.d = false;
                            }
                            throw th7;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    cVar = null;
                }
            } else {
                throw new Throwable("bindService fail");
            }
        }
    }
}
