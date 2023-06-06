package com.sankuai.waimai.monitor;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.metrics.traffic.reflection.ApacheHttpWrapper;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.CommonParamsInfo;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.monitor.model.HeadParamsInfo;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "ErrorCodeManager";
    private static volatile boolean c = false;
    private static d d;
    private static Application e;

    public static /* synthetic */ void a(CommonParamsInfo commonParamsInfo) {
        DefaultHttpClient defaultHttpClient;
        Object[] objArr = {commonParamsInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6296b1b3189e1315570240ef35e39f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6296b1b3189e1315570240ef35e39f9");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            HeadParamsInfo headParamsInfo = new HeadParamsInfo();
            headParamsInfo.setProject(commonParamsInfo.getRaptorProject());
            headParamsInfo.setPageUrl(commonParamsInfo.getPageId());
            headParamsInfo.setCategory(commonParamsInfo.getAppName());
            headParamsInfo.setSec_category(commonParamsInfo.getAppVersion());
            headParamsInfo.setLevel("warn");
            headParamsInfo.setUnionId(commonParamsInfo.getUnionId());
            headParamsInfo.setTimestamp(System.currentTimeMillis());
            headParamsInfo.setOs(commonParamsInfo.getOs());
            headParamsInfo.setContent("谛听识别码:" + commonParamsInfo.getDitingIdentifyCode());
            headParamsInfo.setDynamicMetric(commonParamsInfo);
            arrayList.add(headParamsInfo);
            String json = new Gson().toJson(arrayList);
            new StringBuilder("report json: ").append(json);
            com.sankuai.waimai.monitor.utils.d a2 = com.sankuai.waimai.monitor.utils.d.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.monitor.utils.d.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e901e9e131f8731b0042090f29775b17", RobustBitConfig.DEFAULT_VALUE)) {
                defaultHttpClient = (DefaultHttpClient) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e901e9e131f8731b0042090f29775b17");
            } else {
                Object[] objArr3 = {Integer.valueOf((int) UserCenter.TYPE_LOGOUT_NEGATIVE)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.monitor.utils.d.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b42e5934769c27c587e29d5c67a76acb", RobustBitConfig.DEFAULT_VALUE)) {
                    defaultHttpClient = (DefaultHttpClient) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b42e5934769c27c587e29d5c67a76acb");
                } else {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, UserCenter.TYPE_LOGOUT_NEGATIVE);
                    SchemeRegistry schemeRegistry = new SchemeRegistry();
                    schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                    schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
                    DefaultHttpClient defaultHttpClient2 = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                    ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient2);
                    ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient2);
                    a2.c = defaultHttpClient2;
                    defaultHttpClient = a2.c;
                }
            }
            HttpPost httpPost = new HttpPost("https://catfront.dianping.com/api/log?v=1&sdk=1.5.28&pageId=" + commonParamsInfo.getPageId());
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 9; ART-AL00x Build/HUAWEIART-AL00x; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/78.0.3904.62 XWEB/2783 MMWEBSDK/20210302 Mobile Safari/537.36 MMWEBID/2622 MicroMessenger/8.0.2.1860(0x280002A8) Process/appbrand0 WeChat/arm64 Weixin NetType/WIFI Language/zh_CN ABI/arm64 MiniProgramEnv/android");
            httpPost.setHeader("Referer", "waimai_error_pageid");
            httpPost.setHeader("Accept-Encoding", "gzip, deflate, br");
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new BasicNameValuePair(com.huawei.hms.opendevice.c.a, json));
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList2, "UTF-8"));
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute != null) {
                new StringBuilder("SUCCEED: ").append(execute.getStatusLine().getStatusCode());
            } else {
                Log.e(b, "FAILED {response body is null}");
            }
        } catch (Exception e2) {
            Log.e(b, e2.getMessage());
        }
    }

    public static void a(Application application, d dVar) {
        Object[] objArr = {application, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e33cdfe3c4bbce0982c495fa86caed93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e33cdfe3c4bbce0982c495fa86caed93");
        } else if (c) {
        } else {
            if (application != null) {
                c = true;
            }
            d = dVar;
            e = application;
            com.sankuai.waimai.monitor.utils.b a2 = com.sankuai.waimai.monitor.utils.b.a();
            Object[] objArr2 = {application};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.monitor.utils.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ee8221b4a8b477ffa2a645266b9a6f1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ee8221b4a8b477ffa2a645266b9a6f1a");
            } else if (application != null) {
                application.registerActivityLifecycleCallbacks(a2.b);
            }
            c.a();
        }
    }

    public static void a(ErrorCode errorCode, String str) {
        Object[] objArr = {errorCode, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbda57878bf6bbfd4f3fe101520bff55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbda57878bf6bbfd4f3fe101520bff55");
        } else {
            a(errorCode, str, false, d);
        }
    }

    public static void a(ErrorCode errorCode, String str, boolean z) {
        Object[] objArr = {errorCode, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e98baa2c164a1533deb7049c3cb16eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e98baa2c164a1533deb7049c3cb16eec");
        } else {
            a(errorCode, "com.sankuai.wmcustomfront.diting.report", true, d);
        }
    }

    private static void a(ErrorCode errorCode, String str, boolean z, d dVar) {
        Object[] objArr = {errorCode, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3be97c7b30b0dcb5dceaac5e492c56ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3be97c7b30b0dcb5dceaac5e492c56ab");
            return;
        }
        Context context = errorCode.getContext();
        if (context == null) {
            return;
        }
        try {
            CommonParamsInfo b2 = dVar.b(context);
            b2.setScreenshotsReport(z);
            b2.setRaptorProject(str);
            b2.setCategory(dVar.a());
            b2.setOs("Android");
            b2.setReportProject("diting");
            b2.setShowTimeHour(com.sankuai.waimai.monitor.utils.a.e(e));
            b2.setShowTimeMin(com.sankuai.waimai.monitor.utils.a.a());
            b2.setChargingState(com.sankuai.waimai.monitor.utils.a.c(e));
            b2.setRingMode(com.sankuai.waimai.monitor.utils.a.d(e));
            b2.setExts(errorCode.getExtras());
            b2.updateBusinessId();
            if (dVar != null) {
                dVar.a(com.sankuai.waimai.monitor.utils.b.a().b());
                b2.setAppName(dVar.a());
                b2.setAppVersion(dVar.b());
                b2.setUnionId(dVar.d());
                b2.setUserId(dVar.c());
                b2.setUuid(dVar.e());
                b2.setBusiness(dVar.f());
                b2.setOwlProject(dVar.g());
            }
            if (errorCode != null) {
                b2.setDitingIdentifyCode(errorCode.buildErrorCodeStr());
                b2.setErrorType(errorCode.getType());
                b2.setErrorCode(errorCode.getCode());
                b2.setPageId(errorCode.getRandomPageId());
                b2.setTtId(errorCode.getBusinessCodeByLog());
                b2.setEncodeTtId(errorCode.getBusinessCode());
            }
            b(b2);
        } catch (Exception unused) {
        }
    }

    private static void b(final CommonParamsInfo commonParamsInfo) {
        Object[] objArr = {commonParamsInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61a2282d6c759cefabb0631712e74c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61a2282d6c759cefabb0631712e74c8e");
        } else if (commonParamsInfo == null) {
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.monitor.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9556e2a018eade8b5aa76b36d124d072", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9556e2a018eade8b5aa76b36d124d072");
                    } else {
                        b.a(CommonParamsInfo.this);
                    }
                }
            });
        }
    }

    public static d a() {
        return d;
    }
}
