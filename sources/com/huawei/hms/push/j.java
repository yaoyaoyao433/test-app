package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j {
    public static final String[] a = {"url", "app", "cosa", "rp"};
    public Context b;
    public k c;

    public j(Context context, k kVar) {
        this.b = context;
        this.c = kVar;
    }

    public static boolean b(String str) {
        for (String str2 : a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter launchApp, appPackageName =");
            sb.append(this.c.d());
            sb.append(",and msg.intentUri is ");
            sb.append(this.c.n());
            HMSLog.i("PushSelfShowLog", sb.toString());
            if (q.c(this.b, this.c.d())) {
                b();
            } else {
                d();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }

    public void c() {
        k kVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.b != null && (kVar = this.c) != null) {
            if ("app".equals(kVar.i())) {
                a();
                return;
            } else if ("cosa".equals(this.c.i())) {
                b();
                return;
            } else if ("rp".equals(this.c.i())) {
                HMSLog.w("PushSelfShowLog", this.c.i() + " not support rich message.");
                return;
            } else if ("url".equals(this.c.i())) {
                HMSLog.w("PushSelfShowLog", this.c.i() + " not support URL.");
                return;
            } else {
                HMSLog.d("PushSelfShowLog", this.c.i() + " is not exist in hShowType");
                return;
            }
        }
        HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
    }

    public final void d() {
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.c.n())) {
                sb.append("&referrer=");
                sb.append(Uri.encode(a(this.c.n())));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("market://details?id=");
            sb2.append(this.c.d());
            sb2.append((Object) sb);
            String sb3 = sb2.toString();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(sb3));
            intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(sb3));
            intent2.setPackage("com.android.vending");
            if (q.a(this.b, "com.android.vending", intent2).booleanValue()) {
                intent2.setFlags(402653184);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("open google play store's app detail, IntentUrl is:");
                sb4.append(intent2.toURI());
                HMSLog.i("PushSelfShowLog", sb4.toString());
                this.b.startActivity(intent2);
            } else if (q.a(this.b, PackageConstants.SERVICES_PACKAGE_APPMARKET, intent).booleanValue()) {
                intent.setFlags(402653184);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("open HiApp's app detail, IntentUrl is:");
                sb5.append(intent.toURI());
                HMSLog.i("PushSelfShowLog", sb5.toString());
                this.b.startActivity(intent);
            } else {
                HMSLog.i("PushSelfShowLog", "open app detail by browser.");
                e();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "open market app detail failed,exception:" + e);
        }
    }

    public final void e() {
        String decode;
        String str = "";
        String str2 = "";
        try {
            Uri parse = Uri.parse(Uri.decode(this.c.n()));
            try {
                str = parse.getQueryParameter("h_w_hiapp_referrer");
            } catch (Exception unused) {
                HMSLog.i("PushSelfShowLog", "parse h_w_hiapp_referrer failed");
            }
            try {
                str2 = parse.getQueryParameter("h_w_gp_referrer");
            } catch (Exception unused2) {
                HMSLog.i("PushSelfShowLog", "parse h_w_hiapp_referrer failed");
            }
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "parse intentUri error." + e.toString());
        }
        if (Util.isEMUI() && Util.isChinaROM()) {
            HMSLog.i("PushSelfShowLog", "It is China device, open Huawei market web, referrer: " + str);
            decode = Uri.decode(str);
            if (!URLUtil.isValidUrl(decode)) {
                Context context = this.b;
                if (context != null) {
                    ResourceLoaderUtil.setmContext(context);
                    decode = ResourceLoaderUtil.getString("hms_push_vmall");
                } else {
                    decode = null;
                }
            }
        } else {
            HMSLog.i("PushSelfShowLog", "not EMUI system or not in China, open google play web, referrer: " + str2);
            decode = Uri.decode(str2);
            if (!URLUtil.isValidUrl(decode)) {
                ResourceLoaderUtil.setmContext(this.b);
                decode = ResourceLoaderUtil.getString("hms_push_google") + this.c.d();
            }
        }
        HMSLog.i("PushSelfShowLog", "open the URL by browser: " + decode);
        q.e(this.b, decode);
    }

    public final void b() {
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("enter launchExistApp cosa, appPackageName =");
            sb.append(this.c.d());
            sb.append(",and msg.intentUri is ");
            sb.append(this.c.n());
            HMSLog.i("PushSelfShowLog", sb.toString());
            Intent b = q.b(this.b, this.c.d());
            boolean z = false;
            if (this.c.n() != null) {
                try {
                    Intent parseUri = Intent.parseUri(this.c.n(), 0);
                    parseUri.setSelector(null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Intent.parseUri(msg.intentUri, 0), action:");
                    sb2.append(parseUri.getAction());
                    HMSLog.i("PushSelfShowLog", sb2.toString());
                    boolean booleanValue = q.a(this.b, this.c.d(), parseUri).booleanValue();
                    if (booleanValue) {
                        b = parseUri;
                    }
                    z = booleanValue;
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("intentUri error.");
                    sb3.append(e.toString());
                    HMSLog.w("PushSelfShowLog", sb3.toString());
                }
            } else {
                if (this.c.a() != null) {
                    Intent intent = new Intent(this.c.a());
                    if (q.a(this.b, this.c.d(), intent).booleanValue()) {
                        b = intent;
                    }
                }
                b.setPackage(this.c.d());
            }
            if (b == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            if (z) {
                b.addFlags(y.a);
            } else {
                b.setFlags(805437440);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("start ");
            sb4.append(b.toURI());
            HMSLog.i("PushSelfShowLog", sb4.toString());
            this.b.startActivity(b);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public final String a(String str) {
        int i;
        try {
            int indexOf = str.indexOf(63);
            if (indexOf == -1) {
                return str;
            }
            String[] split = str.substring(indexOf + 1).split("&");
            ArrayList arrayList = new ArrayList();
            for (String str2 : split) {
                if (!str2.startsWith("h_w_hiapp_referrer") && !str2.startsWith("h_w_gp_referrer")) {
                    arrayList.add(str2);
                }
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append((String) arrayList.get(i2));
                if (i2 < arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            String substring = arrayList.size() == 0 ? str.substring(0, indexOf) : str.substring(0, i) + sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("after delete referrer, the new IntentUri is:");
            sb2.append(substring);
            HMSLog.d("PushSelfShowLog", sb2.toString());
            return substring;
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "delete referrer exception." + e.toString());
            return str;
        }
    }
}
