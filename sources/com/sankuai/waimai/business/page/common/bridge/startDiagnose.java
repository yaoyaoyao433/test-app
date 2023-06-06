package com.sankuai.waimai.business.page.common.bridge;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.diagnose.a;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class startDiagnose extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "I3UfUhjBiCj70XEA5bD8Ck++5bjw4djL052sj6WbMi28aONOzb6mPAiP4NklLW5SQrZ7/CGvTmDoGOwSl2iU4A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daa76052f3a72f34a4156f7016f096bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daa76052f3a72f34a4156f7016f096bb");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.business.page.common.bridge.startDiagnose.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "017daba470543338d2f02d3123d41ddf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "017daba470543338d2f02d3123d41ddf");
                    } else {
                        a.a().a(new a.InterfaceC1068a() { // from class: com.sankuai.waimai.business.page.common.bridge.startDiagnose.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.net.diagnose.a.InterfaceC1068a
                            public final void a(int i) {
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e494b049493e7f07d0494f95f24b7695", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e494b049493e7f07d0494f95f24b7695");
                                } else {
                                    startDiagnose.this.publishProgress(i);
                                }
                            }

                            @Override // com.sankuai.waimai.platform.net.diagnose.a.InterfaceC1068a
                            public final void a(String str) {
                                Object[] objArr3 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1abdc7bdea9664d218ebb8d84a55d0f7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1abdc7bdea9664d218ebb8d84a55d0f7");
                                    return;
                                }
                                startDiagnose.this.publishProgress(100);
                                startDiagnose.this.publishComplete(true ^ TextUtils.isEmpty(str));
                                startDiagnose.this.publishResult(str);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ee2417ac30f9549d014a712eb478a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ee2417ac30f9549d014a712eb478a93");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(i));
        try {
            jSONObject.put("action", "KNBNetworkStatusAction");
            jSONObject.put("event", "event_diagnose_progress");
            jSONObject.put("data", new Gson().toJson(hashMap));
        } catch (Exception unused) {
        }
        JsHandlerFactory.publish(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishComplete(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21b46a1f5d01cd943a6280b3020d6af8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21b46a1f5d01cd943a6280b3020d6af8");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Boolean.valueOf(z));
        try {
            jSONObject.put("action", "KNBNetworkStatusAction");
            jSONObject.put("event", "event_diagnose_complete");
            jSONObject.put("data", new Gson().toJson(hashMap));
        } catch (Exception unused) {
        }
        JsHandlerFactory.publish(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void publishResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eb7b1ae8ecc371b3a31e6153af5f571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eb7b1ae8ecc371b3a31e6153af5f571");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_PROGRESS, str);
        try {
            jSONObject.put("action", "KNBNetworkStatusAction");
            jSONObject.put("event", "event_diagnose_result");
            jSONObject.put("data", new Gson().toJson(hashMap));
        } catch (Exception unused) {
        }
        JsHandlerFactory.publish(jSONObject);
    }
}
