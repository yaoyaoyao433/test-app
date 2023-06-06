package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.a;
import com.alipay.sdk.util.d;
import com.alipay.sdk.util.l;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.robust.common.CommonConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h = "";
    public String i = "";
    public String j;

    public b(Context context, boolean z) {
        context = context != null ? context.getApplicationContext() : context;
        this.a = String.format("%s,%s", b(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
        this.c = a(context);
        long a = z ? 0L : a.c.a(context);
        String b = b("15.8.02");
        String b2 = b("h.a.3.8.02");
        this.d = String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", b, b2, "~" + a);
        this.e = String.format("%s,%s,-,-,-", b(com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().b).c), b(com.alipay.sdk.sys.b.a().c()));
        String b3 = b(com.alipay.sdk.util.b.c(context));
        String b4 = b(Build.VERSION.RELEASE);
        String b5 = b(Build.MODEL);
        com.alipay.sdk.util.b.a(context);
        String b6 = b(AppUtil.DEFAULT_IMEI);
        String b7 = b(com.alipay.sdk.util.b.b(context).s);
        com.alipay.sdk.util.b.a(context);
        this.f = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", b3, "android", b4, b5, CommonConstant.Symbol.MINUS, b6, b7, "gw", b(AppUtil.DEFAULT_IMEI));
        this.g = CommonConstant.Symbol.MINUS;
        this.j = CommonConstant.Symbol.MINUS;
    }

    private static String b() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    private synchronized void c(String str, String str2, String str3) {
        d.b("mspl", String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.h)) {
            str4 = "" + CommonConstant.Symbol.XOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.isEmpty(str) ? CommonConstant.Symbol.MINUS : b(str);
        objArr[1] = b(str2);
        objArr[2] = b(str3);
        objArr[3] = b(a());
        sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.h += sb.toString();
    }

    public final void a(String str, String str2, Throwable th) {
        a(str, str2, a(th));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(String str, String str2, String str3) {
        d.a(d.c("mspl", String.format("err %s %s %s", str, str2, str3)));
        String str4 = "";
        if (!TextUtils.isEmpty(this.i)) {
            str4 = "" + CommonConstant.Symbol.XOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = TextUtils.isEmpty(str3) ? CommonConstant.Symbol.MINUS : b(str3);
        objArr[3] = b(a());
        sb.append(String.format("%s,%s,%s,%s", objArr));
        this.i += sb.toString();
    }

    public final void a(String str, String str2, Throwable th, String str3) {
        String a = a(th);
        a(str, str2, str3 + ": " + a);
    }

    private static String d(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split("&");
        String str4 = null;
        if (split != null) {
            String str5 = null;
            str2 = null;
            str3 = null;
            for (String str6 : split) {
                String[] split2 = str6.split("=");
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase("partner")) {
                        str5 = split2[1].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                    } else if (split2[0].equalsIgnoreCase("out_trade_no")) {
                        str2 = split2[1].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                    } else if (split2[0].equalsIgnoreCase(HybridSignPayJSHandler.ARG_TRADE_NO)) {
                        str3 = split2[1].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                    } else if (split2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(l.b(null, split2[1]));
                            if (TextUtils.isEmpty(str2)) {
                                str2 = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(str5)) {
                        str5 = split2[1];
                    }
                }
            }
            str4 = str5;
        } else {
            str2 = null;
            str3 = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", b(str3), b(str2), b(str4));
    }

    public final void b(String str, String str2, String str3) {
        c("", str, str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
    }

    public final void a(String str, String str2) {
        c("", str, str2);
    }

    private static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(CommonConstant.Symbol.COLON);
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    private static String c(String str) {
        return TextUtils.isEmpty(str) ? CommonConstant.Symbol.MINUS : str;
    }

    private static String a() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    private static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, "】").replace(CommonConstant.Symbol.BRACKET_LEFT, "（").replace(CommonConstant.Symbol.BRACKET_RIGHT, "）").replace(CommonConstant.Symbol.COMMA, "，").replace(CommonConstant.Symbol.XOR, "~").replace("#", "＃");
    }

    public final String a(String str) {
        String d = d(str);
        this.b = d;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.a, d, this.c, this.d, this.e, this.f, this.g, c(this.h), c(this.i), this.j);
    }

    private static String a(Context context) {
        String str = CommonConstant.Symbol.MINUS;
        String str2 = CommonConstant.Symbol.MINUS;
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + a(packageInfo);
                } catch (Throwable unused) {
                }
                str = packageName;
            } catch (Throwable unused2) {
            }
        }
        return String.format("%s,%s,-,-,-", b(str), b(str2));
    }

    private static String a(PackageInfo packageInfo) {
        Signature[] signatureArr;
        Signature[] signatureArr2;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                String str = CommonConstant.Symbol.QUESTION_MARK;
                try {
                    String a = l.a((com.alipay.sdk.sys.a) null, signature.toByteArray());
                    str = TextUtils.isEmpty(a) ? CommonConstant.Symbol.QUESTION_MARK : l.f(a).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb.append(CommonConstant.Symbol.MINUS);
                sb.append(str);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return CommonConstant.Symbol.QUESTION_MARK;
        }
    }
}
