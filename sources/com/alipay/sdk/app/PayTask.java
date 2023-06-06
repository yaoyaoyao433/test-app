package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.alipay.sdk.data.a;
import com.alipay.sdk.sys.a;
import com.alipay.sdk.util.f;
import com.alipay.sdk.util.h;
import com.alipay.sdk.util.j;
import com.alipay.sdk.util.l;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.message.bean.Message;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PayTask {
    public static final Object h = com.alipay.sdk.util.f.class;
    public static long i = 0;
    public static final long j = 3000;
    public static long k = -1;
    public Activity a;
    public com.alipay.sdk.widget.a b;
    public final String c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map<String, c> g = new HashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ H5PayCallback c;

        public a(String str, boolean z, H5PayCallback h5PayCallback) {
            this.a = str;
            this.b = z;
            this.c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.alipay.sdk.util.a h5Pay = PayTask.this.h5Pay(new com.alipay.sdk.sys.a(PayTask.this.a, this.a, "payInterceptorWithUrl"), this.a, this.b);
            com.alipay.sdk.util.d.b("mspl", "inc finished: " + h5Pay.b);
            this.c.onPayResult(h5Pay);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements f.e {
        public b() {
        }

        @Override // com.alipay.sdk.util.f.e
        public final void a() {
            PayTask.this.dismissLoading();
        }
    }

    public PayTask(Activity activity) {
        this.a = activity;
        com.alipay.sdk.sys.b.a().a(this.a);
        this.b = new com.alipay.sdk.widget.a(activity, com.alipay.sdk.widget.a.j);
    }

    public static boolean b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - k >= j) {
            k = elapsedRealtime;
            return false;
        }
        return true;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                com.alipay.sdk.sys.b.a().a(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - i < com.alipay.sdk.data.a.a().f) {
                    return false;
                }
                i = elapsedRealtime;
                com.alipay.sdk.data.a.a().a(null, context.getApplicationContext(), false);
                return true;
            } catch (Exception e) {
                com.alipay.sdk.util.d.a(e);
                return false;
            }
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.widget.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
            this.b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        String a2 = l.a("<request_token>", "</request_token>", l.b(trim2).get("req_data"));
                        com.alipay.sdk.sys.a aVar = new com.alipay.sdk.sys.a(this.a, "", "");
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + a2 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + aVar.a(Constants.Environment.KEY_SC, "h5tonative") + CommonConstant.Symbol.DOUBLE_QUOTES;
                    }
                }
                if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        String a3 = l.a("<request_token>", "</request_token>", l.b(trim3).get("req_data"));
                        com.alipay.sdk.sys.a aVar2 = new com.alipay.sdk.sys.a(this.a, "", "");
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + a3 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + aVar2.a(Constants.Environment.KEY_SC, "h5tonative") + CommonConstant.Symbol.DOUBLE_QUOTES;
                    }
                }
                if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    com.alipay.sdk.sys.a aVar3 = new com.alipay.sdk.sys.a(this.a, "", "");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", aVar3.a(Constants.Environment.KEY_SC, "h5tonative"));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String a4 = l.a(CommonConstant.Symbol.QUESTION_MARK, "", str);
                    if (!TextUtils.isEmpty(a4)) {
                        Map<String, String> b2 = l.b(a4);
                        StringBuilder sb = new StringBuilder();
                        if (a(false, true, HybridSignPayJSHandler.ARG_TRADE_NO, sb, b2, HybridSignPayJSHandler.ARG_TRADE_NO, "alipay_trade_no")) {
                            a(true, false, "pay_phase_id", sb, b2, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = b2.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(b2.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(b2.get(Message.SID)) || !TextUtils.isEmpty(b2.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES);
                            if (a(true, true, "extern_token", sb, b2, "extern_token", "cid", Message.SID, "s_id")) {
                                a(true, false, "appenv", sb, b2, "appenv");
                                sb.append("&pay_channel_id=\"alipay_sdk\"");
                                c cVar = new c(this, null);
                                cVar.a = b2.get("return_url");
                                cVar.b = b2.get("show_url");
                                cVar.c = b2.get("pay_order_id");
                                com.alipay.sdk.sys.a aVar4 = new com.alipay.sdk.sys.a(this.a, "", "");
                                String str3 = sb.toString() + "&bizcontext=\"" + aVar4.a(Constants.Environment.KEY_SC, "h5tonative") + CommonConstant.Symbol.DOUBLE_QUOTES;
                                this.g.put(str3, cVar);
                                return str3;
                            }
                            return "";
                        }
                    }
                }
                if (trim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") || trim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") || (com.alipay.sdk.app.a.a() && trim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    String a5 = new com.alipay.sdk.sys.a(this.a, "", "").a(Constants.Environment.KEY_SC, "h5tonative");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", trim);
                    jSONObject2.put("bizcontext", a5);
                    return String.format("new_external_info==%s", jSONObject2.toString());
                } else if (com.alipay.sdk.data.a.a().h && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                    Uri parse = Uri.parse(trim);
                    String queryParameter = parse.getQueryParameter("return_url");
                    String queryParameter2 = parse.getQueryParameter("show_url");
                    String queryParameter3 = parse.getQueryParameter("pay_order_id");
                    String a6 = a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                    String a7 = a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                    String[] strArr = new String[4];
                    strArr[0] = parse.getQueryParameter("app_name");
                    strArr[1] = !TextUtils.isEmpty(parse.getQueryParameter("cid")) ? "ali1688" : "";
                    strArr[2] = !TextUtils.isEmpty(parse.getQueryParameter(Message.SID)) ? "tb" : "";
                    strArr[3] = !TextUtils.isEmpty(parse.getQueryParameter("s_id")) ? "tb" : "";
                    String a8 = a(strArr);
                    String a9 = a(parse.getQueryParameter("extern_token"), parse.getQueryParameter("cid"), parse.getQueryParameter(Message.SID), parse.getQueryParameter("s_id"));
                    String a10 = a(parse.getQueryParameter("appenv"));
                    if (!TextUtils.isEmpty(a6) && !TextUtils.isEmpty(a8) && !TextUtils.isEmpty(a9)) {
                        String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", a6, a7, a8, a9, a10, new com.alipay.sdk.sys.a(this.a, "", "").a(Constants.Environment.KEY_SC, "h5tonative"));
                        c cVar2 = new c(this, null);
                        cVar2.a = queryParameter;
                        cVar2.b = queryParameter2;
                        cVar2.c = queryParameter3;
                        cVar2.d = a6;
                        this.g.put(format, cVar2);
                        return format;
                    }
                }
            }
        } catch (Throwable th) {
            com.alipay.sdk.util.d.a(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        String b2;
        b2 = h.b(new com.alipay.sdk.sys.a(this.a, "", "fetchTradeToken"), this.a.getApplicationContext(), "pref_trade_token", "");
        com.alipay.sdk.util.d.a("mspl", "get trade token: " + b2);
        return b2;
    }

    public String getVersion() {
        return "15.8.02";
    }

    public synchronized com.alipay.sdk.util.a h5Pay(com.alipay.sdk.sys.a aVar, String str, boolean z) {
        com.alipay.sdk.util.a aVar2;
        String str2;
        String str3;
        aVar2 = new com.alipay.sdk.util.a();
        String[] split = a(aVar, str, z).split(";");
        HashMap hashMap = new HashMap();
        for (String str4 : split) {
            int indexOf = str4.indexOf("={");
            if (indexOf >= 0) {
                String substring = str4.substring(0, indexOf);
                String str5 = substring + "={";
                hashMap.put(substring, str4.substring(str4.indexOf(str5) + str5.length(), str4.lastIndexOf(CommonConstant.Symbol.BIG_BRACKET_RIGHT)));
            }
        }
        if (hashMap.containsKey("resultStatus")) {
            aVar2.b = (String) hashMap.get("resultStatus");
        }
        boolean equals = "9000".equals(hashMap.get("resultStatus"));
        String str6 = (String) hashMap.get("result");
        c remove = this.g.remove(str);
        String[] strArr = new String[2];
        strArr[0] = remove != null ? remove.c : "";
        strArr[1] = remove != null ? remove.d : "";
        a(strArr);
        if (hashMap.containsKey("callBackUrl")) {
            str2 = (String) hashMap.get("callBackUrl");
        } else {
            if (str6.length() > 15) {
                String a2 = a(l.a("&callBackUrl=\"", CommonConstant.Symbol.DOUBLE_QUOTES, str6), l.a("&call_back_url=\"", CommonConstant.Symbol.DOUBLE_QUOTES, str6), l.a("&return_url=\"", CommonConstant.Symbol.DOUBLE_QUOTES, str6), URLDecoder.decode(l.a("&return_url=", "&", str6), "utf-8"), URLDecoder.decode(l.a("&callBackUrl=", "&", str6), "utf-8"), l.a("call_back_url=\"", CommonConstant.Symbol.DOUBLE_QUOTES, str6));
                if (!TextUtils.isEmpty(a2)) {
                    str2 = a2;
                }
            }
            if (remove != null) {
                if (equals) {
                    str3 = remove.a;
                } else {
                    str3 = remove.b;
                }
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
            }
            str2 = remove != null ? com.alipay.sdk.data.a.a().e : "";
        }
        aVar2.a = str2;
        if (TextUtils.isEmpty(aVar2.a)) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "H5CbUrlEmpty", "");
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z) {
        return a(new com.alipay.sdk.sys.a(this.a, str, Constants.EventType.PAY), str, z);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            com.alipay.sdk.util.d.b("mspl", "intercepted: " + fetchOrderInfoFromH5PayUrl);
            new Thread(new a(fetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        com.alipay.sdk.sys.a aVar;
        aVar = new com.alipay.sdk.sys.a(this.a, str, "payV2");
        return j.a(aVar, a(aVar, str, z));
    }

    public void showLoading() {
        com.alipay.sdk.widget.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0223 A[Catch: all -> 0x02bd, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x0026, B:10:0x0029, B:12:0x0032, B:14:0x0046, B:15:0x004a, B:17:0x006b, B:19:0x0073, B:20:0x0076, B:22:0x007a, B:24:0x0082, B:25:0x008f, B:27:0x0097, B:55:0x018b, B:66:0x0232, B:64:0x0223, B:16:0x0066, B:29:0x00a7, B:31:0x00c4, B:54:0x0171, B:33:0x00cb, B:37:0x00dd, B:39:0x00e5, B:41:0x0128, B:43:0x0130, B:45:0x0136, B:46:0x013b, B:48:0x0144, B:50:0x0155, B:51:0x0162, B:36:0x00db), top: B:81:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.String a(com.alipay.sdk.sys.a r8, java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.sys.a, java.lang.String, boolean):java.lang.String");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c {
        public String a;
        public String b;
        public String c;
        public String d;

        private c() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    private static boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2 = "";
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        } else if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            return true;
        } else {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            return true;
        }
    }

    public static String a(com.alipay.sdk.sys.a aVar, String str, List<a.b> list, String str2, Activity activity) {
        l.c a2 = l.a(aVar, activity, list);
        if (a2 == null || a2.a(aVar) || a2.a() || !TextUtils.equals(a2.a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        com.alipay.sdk.util.d.a("mspl", "PayTask not_login");
        String valueOf = String.valueOf(str.hashCode());
        PayResultActivity.a.put(valueOf, new Object());
        Intent intent = new Intent(activity, PayResultActivity.class);
        intent.putExtra("orderSuffix", str);
        intent.putExtra("externalPkgName", activity.getPackageName());
        intent.putExtra("phonecashier.pay.hash", valueOf);
        a.C0029a.a(aVar, intent);
        activity.startActivity(intent);
        synchronized (PayResultActivity.a.get(valueOf)) {
            try {
                com.alipay.sdk.util.d.a("mspl", "PayTask wait");
                PayResultActivity.a.get(valueOf).wait();
            } catch (InterruptedException unused) {
                com.alipay.sdk.util.d.a("mspl", "PayTask interrupted");
                return d.a();
            }
        }
        String str3 = PayResultActivity.b.b;
        com.alipay.sdk.util.d.a("mspl", "PayTask ret: " + str3);
        return str3;
    }

    private String a(com.alipay.sdk.sys.a aVar, String str) {
        showLoading();
        e eVar = null;
        try {
            try {
                JSONObject a2 = new com.alipay.sdk.packet.impl.e().a(aVar, this.a.getApplicationContext(), str).a();
                String optString = a2.optString("end_code", null);
                List<com.alipay.sdk.protocol.b> a3 = com.alipay.sdk.protocol.b.a(a2.optJSONObject("form").optJSONObject("onload"));
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    if (a3.get(i2).a == com.alipay.sdk.protocol.a.Update) {
                        String[] strArr = a3.get(i2).c;
                        if (strArr.length == 3 && TextUtils.equals("tid", strArr[0])) {
                            com.alipay.sdk.tid.a a4 = com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().b);
                            if (!TextUtils.isEmpty(strArr[1]) && !TextUtils.isEmpty(strArr[2])) {
                                a4.a(strArr[1], strArr[2]);
                            }
                        }
                    }
                }
                a(aVar, a2);
                dismissLoading();
                com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                for (int i3 = 0; i3 < a3.size(); i3++) {
                    com.alipay.sdk.protocol.b bVar = a3.get(i3);
                    if (bVar.a == com.alipay.sdk.protocol.a.WapPay) {
                        String a5 = a(aVar, bVar);
                        dismissLoading();
                        com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                        return a5;
                    } else if (bVar.a == com.alipay.sdk.protocol.a.OpenWeb) {
                        String a6 = a(aVar, bVar, optString);
                        dismissLoading();
                        com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                        return a6;
                    }
                }
                dismissLoading();
                com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
            } catch (IOException e) {
                e a7 = e.a(e.NETWORK_ERROR.i);
                com.alipay.sdk.app.statistic.a.a(aVar, "net", e);
                dismissLoading();
                com.alipay.sdk.app.statistic.a.a(this.a, aVar, str, aVar.d);
                eVar = a7;
            }
            if (eVar == null) {
                eVar = e.a(e.FAILED.i);
            }
            return d.a(eVar.i, eVar.j, "");
        }
    }

    private static void a(com.alipay.sdk.sys.a aVar, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().b).a(optString, optString2);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ParserTidClientKeyEx", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
        r11 = com.alipay.sdk.app.d.a(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], com.alipay.sdk.util.l.b(r10, r0[2]));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(com.alipay.sdk.sys.a r10, com.alipay.sdk.protocol.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.sys.a, com.alipay.sdk.protocol.b, java.lang.String):java.lang.String");
    }

    private String a(com.alipay.sdk.sys.a aVar, com.alipay.sdk.protocol.b bVar) {
        String[] strArr = bVar.c;
        Intent intent = new Intent(this.a, H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        if (strArr.length == 2) {
            bundle.putString("cookie", strArr[1]);
        }
        intent.putExtras(bundle);
        a.C0029a.a(aVar, intent);
        this.a.startActivity(intent);
        synchronized (h) {
            try {
                h.wait();
            } catch (InterruptedException e) {
                com.alipay.sdk.util.d.a(e);
                return d.a();
            }
        }
        String str = d.b;
        return TextUtils.isEmpty(str) ? d.a() : str;
    }
}
