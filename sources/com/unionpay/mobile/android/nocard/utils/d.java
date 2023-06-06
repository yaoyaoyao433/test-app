package com.unionpay.mobile.android.nocard.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.sankuai.xm.im.message.bean.Message;
import com.unionpay.mobile.android.callback.UPAndroidCallback;
import com.unionpay.mobile.android.plugin.BaseActivity;
import com.unionpay.mobile.android.utils.k;
/* loaded from: classes6.dex */
public final class d {
    private static UPAndroidCallback a;

    public static void a(Context context, com.unionpay.mobile.android.model.b bVar) {
        String str;
        String str2;
        k.b("uppay", "exit() +++");
        k.a("uppay", "reqId=" + bVar.I.a);
        BaseActivity baseActivity = (BaseActivity) context;
        if (bVar.I.f.length() > 0) {
            k.a("uppay", "result=" + bVar.I.f);
            int i = bVar.I.a;
            if (i != 1000) {
                switch (i) {
                    case 0:
                    case 2:
                    case 5:
                        k.b("uppay", "notifyAppResult() +++");
                        Intent intent = new Intent();
                        intent.putExtra("pay_result", bVar.I.f);
                        intent.putExtra("result_data", bVar.bj);
                        if (bVar.V != null && bVar.V.length() > 0 && bVar.W != null && bVar.W.length() > 0 && !bVar.U) {
                            intent.putExtra("notify_url", bVar.V);
                            intent.putExtra("notify_msg", bVar.W);
                        }
                        if (bVar.n != null) {
                            intent.putExtra("qn", bVar.n);
                            intent.putExtra(Message.SID, bVar.k);
                            intent.putExtra("secret", bVar.l);
                        }
                        if (a != null) {
                            a.UPAndroidOK(bVar.I.f, bVar.n, bVar.k, bVar.l);
                        }
                        baseActivity.setResult(-1, intent);
                        str = "uppay";
                        str2 = "notifyAppResult() ---";
                        k.b(str, str2);
                        break;
                    case 3:
                        k.b("uppay", "notifyTencentJarResult() +++");
                        Intent intent2 = new Intent();
                        intent2.putExtra("pay_result", bVar.I.f);
                        intent2.putExtra("tencentWID", bVar.I.h);
                        intent2.putExtra("tencentUID", bVar.I.g);
                        intent2.putExtra("bankInfo", bVar.I.j);
                        intent2.putExtra("cardType", bVar.I.k);
                        intent2.putExtra("cardNo", bVar.I.i);
                        baseActivity.setResult(-1, intent2);
                        str = "uppay";
                        str2 = "notifyTencentJarResult() ---";
                        k.b(str, str2);
                        break;
                }
            }
            k.b("uppay", " notifyBrowserResult() +++ ");
            Intent intent3 = null;
            String str3 = bVar.I.f;
            String str4 = str3.equalsIgnoreCase("fail") ? "1" : str3.equalsIgnoreCase("cancel") ? "-1" : "0";
            int i2 = bVar.I.a;
            if (i2 == 1) {
                intent3 = new Intent(bVar.I.b);
                k.b("uppay", " other browser ");
                k.a("uppay", " result Action=" + bVar.I.b);
            } else if (i2 == 4) {
                Intent intent4 = new Intent("com.UCMobile.PluginApp.ActivityState");
                intent4.putExtra("ActivityState", "inactive");
                intent4.addCategory("android.intent.category.DEFAULT");
                baseActivity.sendBroadcast(intent4);
                intent3 = new Intent("com.unionpay.uppay.resultURL");
                k.b("uppay", " uc browser ");
            }
            if (!TextUtils.isEmpty(bVar.r) && !"exit".equalsIgnoreCase(bVar.r)) {
                String str5 = bVar.r + str4;
                k.a("uppay", "result URL= ".concat(String.valueOf(str5)));
                try {
                    if (1000 == bVar.I.a) {
                        Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                        intent5.addCategory("android.intent.category.BROWSABLE");
                        baseActivity.startActivity(intent5);
                    } else {
                        intent3.putExtra("ResultURL", str5);
                        k.a("browser", intent3.toURI());
                        baseActivity.sendBroadcast(intent3);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                str = "uppay";
                str2 = " notifyBrowserResult() --- ";
                k.b(str, str2);
            }
        }
        if (bVar.V != null && bVar.V.length() > 0 && bVar.W != null && bVar.W.length() > 0) {
            boolean z = bVar.U;
            String str6 = bVar.V;
            String str7 = bVar.W;
            if (z) {
                new Thread(new e(str6, str7, context)).start();
            }
        }
        baseActivity.finish();
        k.b("uppay", "exit() +++");
    }
}
