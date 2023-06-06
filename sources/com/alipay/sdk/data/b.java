package com.alipay.sdk.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.ConditionVariable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.app.c;
import com.alipay.sdk.util.d;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static volatile b a;
    public String b;
    public String c = "sdk-and-lite";
    public String d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements APSecuritySdk.InitResultListener {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ ConditionVariable b;

        public a(String[] strArr, ConditionVariable conditionVariable) {
            this.a = strArr;
            this.b = conditionVariable;
        }

        @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
        public final void onResult(APSecuritySdk.TokenResult tokenResult) {
            if (tokenResult != null) {
                this.a[0] = tokenResult.apdidToken;
            }
            this.b.open();
        }
    }

    public b() {
        String a2 = c.a();
        if (c.b()) {
            return;
        }
        this.c += '_' + a2;
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    public static String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(ConnectionResult.NETWORK_ERROR) + 1000);
    }

    public static synchronized void a(String str) {
        synchronized (b.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(com.alipay.sdk.sys.b.a().b).edit().putString("trideskey", str).apply();
            com.alipay.sdk.cons.a.b = str;
        }
    }

    public static String b(com.alipay.sdk.sys.a aVar, Context context, HashMap<String, String> hashMap) {
        try {
            return (String) Executors.newFixedThreadPool(2).submit(new CallableC0026b(aVar, context, hashMap)).get(PayTask.j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "third", "GetApdidTimeout", th);
            return "";
        }
    }

    public static String a(com.alipay.sdk.sys.a aVar, Context context, HashMap<String, String> hashMap) {
        String[] strArr = {""};
        try {
            APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(context);
            ConditionVariable conditionVariable = new ConditionVariable();
            aPSecuritySdk.initToken(0, hashMap, new a(strArr, conditionVariable));
            conditionVariable.block(PayTask.j);
        } catch (Throwable th) {
            d.a(th);
            com.alipay.sdk.app.statistic.a.a(aVar, "third", "GetApdidEx", th);
        }
        if (TextUtils.isEmpty(strArr[0])) {
            com.alipay.sdk.app.statistic.a.a(aVar, "third", "GetApdidNull", "missing token");
        }
        d.a("mspl", "ap:" + strArr[0]);
        return strArr[0];
    }

    public static String a(Context context) {
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder();
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(packageName);
                sb.append(";");
                sb.append(packageInfo.versionCode);
                sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                return sb.toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.data.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class CallableC0026b implements Callable<String> {
        public final /* synthetic */ com.alipay.sdk.sys.a a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ HashMap c;

        public CallableC0026b(com.alipay.sdk.sys.a aVar, Context context, HashMap hashMap) {
            this.a = aVar;
            this.b = context;
            this.c = hashMap;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() throws Exception {
            return b.a(this.a, this.b, this.c);
        }
    }
}
