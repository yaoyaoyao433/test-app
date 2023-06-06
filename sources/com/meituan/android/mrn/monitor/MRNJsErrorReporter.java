package com.meituan.android.mrn.monitor;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.ReadableArray;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNJsErrorReporter {
    public static ChangeQuickRedirect a = null;
    private static final String c = "MRNJsErrorReporter";
    private static MRNJsErrorReporter d;
    public ExecutorService b;
    private ar e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface JSCrashRetrofitService {
        @POST
        @Headers({"Accept-Charset: UTF-8", "Content-Encoding: gzip"})
        Call<ap> postCrashData(@Url String str, @Body ak akVar);
    }

    public static /* synthetic */ void a(MRNJsErrorReporter mRNJsErrorReporter, String str) {
        byte[] a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mRNJsErrorReporter, changeQuickRedirect, false, "027f8e8505373941ff78c74da89193f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNJsErrorReporter, changeQuickRedirect, false, "027f8e8505373941ff78c74da89193f2");
        } else if (TextUtils.isEmpty(str) || (a2 = mRNJsErrorReporter.a(str)) == null) {
        } else {
            try {
                Response<ap> a3 = ((JSCrashRetrofitService) mRNJsErrorReporter.e.a(JSCrashRetrofitService.class)).postCrashData("https://dreport.meituan.net/perf/public/", al.a(a2, PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON)).a();
                if ((a3 != null ? a3.c : -1) == 200) {
                    com.facebook.common.logging.a.a(c, "Crash report success");
                } else {
                    com.facebook.common.logging.a.a(c, "Crash report error");
                }
            } catch (Exception e) {
                com.meituan.android.mrn.utils.c.a("[MRNJsErrorReporter@reportJsCrash]", e);
            }
        }
    }

    public MRNJsErrorReporter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e7755b753d26e0fb21973b1f48c0d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e7755b753d26e0fb21973b1f48c0d2");
            return;
        }
        this.b = com.sankuai.android.jarvis.c.b("mrn-jserror-netThreadPool");
        this.e = new ar.a().a("https://dreport.meituan.net/").a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a(30000, 30000)).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
    }

    public static synchronized MRNJsErrorReporter a() {
        synchronized (MRNJsErrorReporter.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "390f7374ef994d9c0d9110c56d2b2144", RobustBitConfig.DEFAULT_VALUE)) {
                return (MRNJsErrorReporter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "390f7374ef994d9c0d9110c56d2b2144");
            }
            if (d == null) {
                d = new MRNJsErrorReporter();
            }
            return d;
        }
    }

    public final JSONObject a(Context context, com.meituan.android.mrn.engine.k kVar, MRNExceptionsManagerModule.b bVar) {
        boolean z;
        JSONObject jSONObject;
        String str;
        String a2;
        Object[] objArr = {context, kVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff43823d7e94a702b449c1b30d4a8c2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff43823d7e94a702b449c1b30d4a8c2d");
        }
        if (bVar == null) {
            return null;
        }
        try {
            com.meituan.android.mrn.config.e a3 = com.meituan.android.mrn.config.c.a();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fc3bbc86757a54821e50ee77316dc08", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fc3bbc86757a54821e50ee77316dc08")).booleanValue();
            } else {
                z = com.meituan.android.mrn.debug.a.c() && com.meituan.android.mrn.engine.f.c(context) && !com.meituan.android.mrn.debug.a.c(context);
            }
            String h = z ? a3.h() : a3.j();
            String g = z ? a3.g() : a3.i();
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(g)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("category", "fe_perf_public");
                jSONObject2.put("token", g);
                jSONObject2.put("project", h);
                jSONObject2.put("type", "mrn");
                jSONObject2.put("os", "Android");
                jSONObject2.put("osVersion", Build.VERSION.RELEASE);
                jSONObject2.put("osBuildVersion", Build.ID);
                jSONObject2.put("appVersion", a3.l());
                jSONObject2.put("appBuildVersion", a3.m());
                jSONObject2.put("platform", "mrn");
                jSONObject2.put("platformVersion", "3.1201.206");
                jSONObject2.put("deviceManufacturer", Build.BRAND);
                jSONObject2.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
                jSONObject2.put("deviceId", a3.n());
                jSONObject2.put("guid", UUID.randomUUID().toString());
                jSONObject2.put("occurTime", System.currentTimeMillis());
                jSONObject2.put("uploadTime", System.currentTimeMillis());
                jSONObject2.put("city", k.a(context));
                jSONObject2.put("network", com.meituan.android.mrn.config.c.a().b());
                String a4 = k.a(bVar.c);
                jSONObject2.put("message", a4);
                if (bVar.i != null) {
                    a2 = Log.getStackTraceString(bVar.i);
                } else {
                    String str2 = bVar.c;
                    ReadableArray readableArray = bVar.d;
                    if (kVar != null) {
                        str = kVar.k;
                        jSONObject = null;
                    } else {
                        jSONObject = null;
                        str = null;
                    }
                    a2 = k.a(str2, readableArray, jSONObject, str);
                }
                jSONObject2.put(SnifferDBHelper.COLUMN_LOG, a2);
                jSONObject2.put("simpleLog", a4);
                jSONObject2.put("pageStack", f.a().b());
                jSONObject2.put("lastPage", f.a().b);
                jSONObject2.put("exceptionType", bVar.b ? "warn" : "error");
                jSONObject2.put("isNativeError", bVar.i != null);
                jSONObject2.put("exceptionLevel", "");
                if (kVar != null && kVar.i != null) {
                    jSONObject2.put(ShowLogJsHandler.PARAM_NAME_MODULE, kVar.i.c);
                    jSONObject2.put("moduleVersion", kVar.i.f);
                }
                if (!bVar.f) {
                    jSONObject2.put(ShowLogJsHandler.PARAM_NAME_MODULE, "rn_mrn_unhandled");
                }
                if (!jSONObject2.has(ShowLogJsHandler.PARAM_NAME_MODULE)) {
                    jSONObject2.put(ShowLogJsHandler.PARAM_NAME_MODULE, MRNBundleManager.BASE_BUNDLE_NAME);
                }
                JSONObject a5 = k.a(kVar, bVar);
                if (a5 != null) {
                    jSONObject2.put("userInfo", a5.toString());
                }
                return jSONObject2;
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            com.meituan.android.mrn.utils.c.a("[MRNJsErrorReporter.getReportJSON]", e);
            return null;
        }
    }

    private byte[] a(String str) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6087368c7cbfee5b42a3da7219cc0a81", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6087368c7cbfee5b42a3da7219cc0a81");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (IOException unused) {
            gZIPOutputStream = null;
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.flush();
            byteArrayOutputStream.close();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                gZIPOutputStream.close();
            } catch (IOException unused2) {
            }
            return byteArray;
        } catch (IOException unused3) {
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
            } catch (IOException unused4) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
            } catch (IOException unused5) {
            }
            throw th;
        }
    }
}
