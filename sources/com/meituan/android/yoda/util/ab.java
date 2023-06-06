package com.meituan.android.yoda.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private static final ab b = new ab();

    public static rx.functions.b a() {
        return b;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95d17a57f1bc218a369f1d4062d18a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95d17a57f1bc218a369f1d4062d18a8");
            return;
        }
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = aa.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b40fb8eb78924952cd93e539d37d586e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b40fb8eb78924952cd93e539d37d586e");
        } else if (obj == null || !(obj instanceof aa.a)) {
        } else {
            aa.a aVar = (aa.a) obj;
            Context context = aVar.a;
            final String str = aVar.b;
            int i = aVar.c;
            int i2 = aVar.d;
            final YodaResponseListener yodaResponseListener = aVar.e;
            Object[] objArr3 = {context, "yoda://www.meituan.com/v2/verify", str, Integer.valueOf(i), Integer.valueOf(i2), yodaResponseListener};
            ChangeQuickRedirect changeQuickRedirect3 = aa.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6150cd1b15855d030a3901f5fa8926ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6150cd1b15855d030a3901f5fa8926ea");
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("yoda://www.meituan.com/v2/verify").buildUpon().appendQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str).appendQueryParameter("env", String.valueOf(i)).appendQueryParameter("themeResId", String.valueOf(i2)).build());
                intent.setPackage(context.getPackageName());
                intent.setFlags(com.tencent.mapsdk.internal.y.a);
                context.registerReceiver(new BroadcastReceiver() { // from class: com.meituan.android.yoda.util.YodaSchemeUtil$1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent2) {
                        Error error;
                        Object[] objArr4 = {context2, intent2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ad70be126486c3846c275afbc4d0019", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ad70be126486c3846c275afbc4d0019");
                            return;
                        }
                        try {
                            switch (com.sankuai.waimai.platform.utils.f.a(intent2, "errorCode", -2)) {
                                case -2:
                                    if (YodaResponseListener.this != null) {
                                        YodaResponseListener.this.onError(str, new Error(-2, "内部错误"));
                                        break;
                                    }
                                    break;
                                case -1:
                                    try {
                                        error = (Error) com.sankuai.waimai.platform.utils.f.c(intent2, "error");
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        error = null;
                                    }
                                    if (YodaResponseListener.this != null) {
                                        YodaResponseListener.this.onError(str, error);
                                        break;
                                    }
                                    break;
                                case 0:
                                    if (YodaResponseListener.this != null) {
                                        YodaResponseListener.this.onCancel(str);
                                        break;
                                    }
                                    break;
                                case 1:
                                    String a2 = com.sankuai.waimai.platform.utils.f.a(intent2, OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY);
                                    if (YodaResponseListener.this != null) {
                                        YodaResponseListener.this.onYodaResponse(str, a2);
                                        break;
                                    }
                                    break;
                            }
                        } catch (Exception unused) {
                        }
                        context2.unregisterReceiver(this);
                    }
                }, new IntentFilter("com.meituan.android.yoda.result"));
                context.startActivity(intent);
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, aVar.b);
            com.meituan.android.yoda.monitor.report.a.a("yoda_mtsi_intercept_call", 200, 10, jsonObject);
        }
    }
}
