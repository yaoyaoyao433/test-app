package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.sdk.sys.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class PayResultActivity extends Activity {
    public static final HashMap<String, Object> a = new HashMap<>();
    public com.alipay.sdk.sys.a b = null;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.finish();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public static volatile String a;
        public static volatile String b;
    }

    private static void a(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            com.alipay.sdk.util.d.a(e);
        }
        try {
            activity.startActivity(intent);
        } catch (Throwable unused) {
            activity.finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "orderSuffix"))) {
                b.a = com.sankuai.waimai.platform.utils.f.a(intent, "phonecashier.pay.hash");
                String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "orderSuffix");
                String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "externalPkgName");
                com.alipay.sdk.sys.a a4 = a.C0029a.a(intent);
                this.b = a4;
                if (a4 == null) {
                    finish();
                }
                a(this, b.a, a2, a3);
                a(this, 300);
                return;
            }
            if (this.b == null) {
                finish();
            }
            String a5 = com.sankuai.waimai.platform.utils.f.a(intent, "phonecashier.pay.result");
            int a6 = com.sankuai.waimai.platform.utils.f.a(intent, "phonecashier.pay.resultOrderHash", 0);
            if (a6 != 0 && TextUtils.equals(b.a, String.valueOf(a6))) {
                if (!TextUtils.isEmpty(a5)) {
                    String str = b.a;
                    b.b = a5;
                    a(a, str);
                } else {
                    a(b.a);
                }
                b.a = "";
                a(this, 300);
                return;
            }
            com.alipay.sdk.sys.a aVar = this.b;
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "SchemePayWrongHashEx", "Expected " + b.a + ", got " + a6);
            a(b.a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    private static void a(String str) {
        b.b = d.a();
        a(a, str);
    }

    private static void a(Activity activity, int i) {
        new Handler().postDelayed(new a(activity), 300L);
    }

    private static boolean a(HashMap<String, Object> hashMap, String str) {
        Object obj;
        if (hashMap == null || str == null || (obj = hashMap.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }
}
