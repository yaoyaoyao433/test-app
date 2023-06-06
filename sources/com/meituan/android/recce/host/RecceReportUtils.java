package com.meituan.android.recce.host;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.recce.host.HostConstants;
import com.meituan.android.recce.reporter.a;
import com.meituan.android.recce.shark.WasaiRequestService;
import com.meituan.android.recce.shark.n;
import com.meituan.android.recce.shark.q;
import com.meituan.android.recce.shark.r;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RecceReportUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void reportError(Object obj, String str, int i, int i2, int i3, String str2, String str3) {
        Object[] objArr = {obj, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fa40ea32e564bbf4216cff5e456b5cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fa40ea32e564bbf4216cff5e456b5cd");
            return;
        }
        switch (i3) {
            case 0:
                a.a(obj, str2, HostConstants.ErrorLevel.getLevelName(i2));
            case 1:
                a.b(obj, str2, HostConstants.ErrorLevel.getLevelName(i2));
                break;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("project", "com.sankuai.wasai.jsbacktracesre");
            jSONObject.put("category", HostConstants.ErrorCategory.getRaptorErrorCategory(i));
            jSONObject.put("level", HostConstants.ErrorLevel.getLevelName(i2));
            jSONObject.put("sec_category", str2);
            jSONObject.put("content", str3);
            jSONObject.put("unionId", com.meituan.android.recce.a.c());
            jSONObject.put(DeviceInfo.TM, System.currentTimeMillis());
            jSONObject.put("resourceUrl", "recce/mvp/" + str + "/index");
            jSONObject.put("realUrl", "http://w.sankuai.com/hig/js-backtraces-report/index." + str + ".html#/");
            jSONObject.put("pageUrl", "http://w.sankuai.com/hig/js-backtraces-report/index." + str + ".html#/");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            reportErrorBody(jSONArray.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void reportErrorBody(String str) {
        q qVar;
        ar arVar;
        Call<ap> postJson;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e6471dd233248e8ec0bab4de1f9c3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e6471dd233248e8ec0bab4de1f9c3ba");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("v", "1");
        hashMap.put("sdk", "1.10.1");
        hashMap.put("pageId", "owl-wasai");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("Accept", "*/*");
        hashMap2.put("Accept-Language", "zh-CN,zh;q=0.9");
        hashMap2.put("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
        hashMap2.put("Referer", "https://wasai.sankuai.com/");
        hashMap2.put("User-Agent", com.meituan.android.recce.a.d());
        HashMap hashMap3 = new HashMap();
        hashMap3.put(c.a, str);
        r.a aVar = new r.a();
        Object[] objArr2 = {"https://catfront.dianping.com/api/log/"};
        ChangeQuickRedirect changeQuickRedirect3 = r.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "b5054ca319714a02c720d3fcb6329a02", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (r.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "b5054ca319714a02c720d3fcb6329a02");
        } else if (!TextUtils.isEmpty("https://catfront.dianping.com/api/log/")) {
            aVar.b.c = "https://catfront.dianping.com/api/log/";
        }
        Object[] objArr3 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect4 = r.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "f1d36fd410f901512646fd4c30a18a46", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (r.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "f1d36fd410f901512646fd4c30a18a46");
        } else {
            if (aVar.b.d == null) {
                aVar.b.d = new HashMap();
            }
            aVar.b.d.putAll(hashMap);
        }
        Object[] objArr4 = {hashMap2};
        ChangeQuickRedirect changeQuickRedirect5 = r.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect5, false, "63d017e6f08961d63ac8342b2af188c8", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (r.a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect5, false, "63d017e6f08961d63ac8342b2af188c8");
        } else {
            if (aVar.b.e == null) {
                aVar.b.e = new HashMap();
            }
            aVar.b.e.putAll(hashMap2);
        }
        Object[] objArr5 = {hashMap3};
        ChangeQuickRedirect changeQuickRedirect6 = r.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect6, false, "8fc07896a22ffa2b1e8a7edfb642bdd7", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (r.a) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect6, false, "8fc07896a22ffa2b1e8a7edfb642bdd7");
        } else {
            aVar.b.f = hashMap3;
        }
        n nVar = new n() { // from class: com.meituan.android.recce.host.RecceReportUtils.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.retrofit2.f
            public void onResponse(Call<ap> call, Response<ap> response) {
                boolean z = true;
                Object[] objArr6 = {call, response};
                ChangeQuickRedirect changeQuickRedirect7 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "c54a81f6038c303878b2bc830002cdfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "c54a81f6038c303878b2bc830002cdfc");
                } else if (response != null && response.e() != null) {
                    String string = response.e().string();
                    RecceReportUtils.toastReportResult((TextUtils.isEmpty(string) || !string.startsWith("OK")) ? false : false, string);
                } else {
                    RecceReportUtils.toastReportResult(false, "code=" + response.b());
                }
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public void onFailure(Call<ap> call, Throwable th) {
                Object[] objArr6 = {call, th};
                ChangeQuickRedirect changeQuickRedirect7 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "bc019ec8104a40992c99e7f6c5d1df4f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "bc019ec8104a40992c99e7f6c5d1df4f");
                    return;
                }
                RecceReportUtils.toastReportResult(false, th.getMessage());
                th.printStackTrace();
            }
        };
        Object[] objArr6 = {nVar};
        ChangeQuickRedirect changeQuickRedirect7 = r.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect7, false, "d5052f0ecb977487a293448171a0dd13", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (r.a) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect7, false, "d5052f0ecb977487a293448171a0dd13");
        } else {
            aVar.b.b = new WeakReference<>(nVar);
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = r.a.a;
        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect8, false, "83f035ccd43ac0ee52b1c11aa1cb0b85", RobustBitConfig.DEFAULT_VALUE)) {
            r rVar = (r) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect8, false, "83f035ccd43ac0ee52b1c11aa1cb0b85");
            return;
        }
        r rVar2 = aVar.b;
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = r.a;
        if (PatchProxy.isSupport(objArr8, rVar2, changeQuickRedirect9, false, "b33e1c19c61f0ec29f81b1c08561b444", RobustBitConfig.DEFAULT_VALUE)) {
            r rVar3 = (r) PatchProxy.accessDispatch(objArr8, rVar2, changeQuickRedirect9, false, "b33e1c19c61f0ec29f81b1c08561b444");
            return;
        }
        String str2 = rVar2.c;
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = r.a;
        if (PatchProxy.isSupport(objArr9, rVar2, changeQuickRedirect10, false, "308c6fe74fb1e13b04939b938ef0c8a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, rVar2, changeQuickRedirect10, false, "308c6fe74fb1e13b04939b938ef0c8a7");
        } else if (rVar2.e == null) {
            rVar2.e = new HashMap();
        }
        rVar2.a();
        Object[] objArr10 = {str2};
        ChangeQuickRedirect changeQuickRedirect11 = r.a;
        if (PatchProxy.isSupport(objArr10, rVar2, changeQuickRedirect11, false, "0cabf164c7e67a8095932b1cbe14c9e0", RobustBitConfig.DEFAULT_VALUE)) {
            postJson = (Call) PatchProxy.accessDispatch(objArr10, rVar2, changeQuickRedirect11, false, "0cabf164c7e67a8095932b1cbe14c9e0");
        } else {
            Object[] objArr11 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = q.a;
            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect12, true, "6fdff30f9c5d33013813cf948d58f01d", RobustBitConfig.DEFAULT_VALUE)) {
                arVar = (ar) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect12, true, "6fdff30f9c5d33013813cf948d58f01d");
            } else {
                qVar = q.a.a;
                arVar = qVar.b;
            }
            WasaiRequestService wasaiRequestService = (WasaiRequestService) arVar.a(WasaiRequestService.class);
            if (rVar2.f != null) {
                if (str2.startsWith(AbsApiFactory.HTTP) || str2.startsWith(AbsApiFactory.HTTPS)) {
                    postJson = wasaiRequestService.postFormWithUrl(str2, rVar2.d, rVar2.e, rVar2.f);
                } else {
                    postJson = wasaiRequestService.postForm(str2, rVar2.d, rVar2.e, rVar2.f);
                }
            } else {
                postJson = wasaiRequestService.postJson(str2, rVar2.d, rVar2.e, rVar2.g);
            }
        }
        postJson.a(rVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toastReportResult(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c19612c48d4ca21bbf20a0f25895366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c19612c48d4ca21bbf20a0f25895366");
            return;
        }
        Context b = com.meituan.android.recce.a.b();
        if (b == null || !com.meituan.android.recce.utils.a.a(b)) {
            return;
        }
        String str2 = z ? "错误日志上报成功: " : "错误日志上报失败: ";
        Toast.makeText(b, str2 + str, 0).show();
    }
}
