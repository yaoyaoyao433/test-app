package com.sankuai.waimai.store.util.monitor.report;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    static final List<a> b = Collections.synchronizedList(new ArrayList());
    private static ExecutorService e;
    final Handler c;
    final Runnable d;

    public static /* synthetic */ void a(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "1feadcd302ef39b61914d42ddcd48333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "1feadcd302ef39b61914d42ddcd48333");
            return;
        }
        int size = b.size();
        for (int i = 0; i < size; i++) {
            a aVar = b.get(i);
            if (aVar != null) {
                hVar.a(aVar.b, aVar.c, aVar.d);
            }
        }
        b.clear();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68c301ba0c92b93fe909cf3057cd479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68c301ba0c92b93fe909cf3057cd479");
            return;
        }
        this.d = new Runnable() { // from class: com.sankuai.waimai.store.util.monitor.report.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "208b430f0462e3a0208e7e8f0eeba113", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "208b430f0462e3a0208e7e8f0eeba113");
                } else {
                    h.a(h.this);
                }
            }
        };
        this.c = new Handler(Looper.getMainLooper());
        if (e == null) {
            e = com.sankuai.android.jarvis.c.a("store-LogUploadPool");
        }
    }

    private void b(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502711e79eee9e50f530ac7a6afe15cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502711e79eee9e50f530ac7a6afe15cf");
        } else if (cls == null || TextUtils.isEmpty(str)) {
        } else {
            if (a()) {
                a("error", cls, str, str2);
            } else {
                com.dianping.codelog.b.b(cls, str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea42dead425ee6b574c8b78c2fbda535", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea42dead425ee6b574c8b78c2fbda535")).booleanValue() : com.sankuai.waimai.store.config.i.h().a("raptor_log_reporter_key/new_report", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef075151e2c1b7362b4164a2775f6981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef075151e2c1b7362b4164a2775f6981");
        } else {
            b(cls, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, @NonNull Class cls, @NonNull String str2, String str3) {
        Object[] objArr = {str, cls, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121c24e520e699ac326ffcb866cd771a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121c24e520e699ac326ffcb866cd771a");
            return;
        }
        JSONObject a2 = a(str, System.currentTimeMillis(), cls.getSimpleName() + "::" + str2, str3);
        if (a2 != null) {
            c(a2);
            if ("error".equals(str)) {
                b(a2);
            }
        }
    }

    private void b(@NonNull final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa062c749b5b22f1ef77440a70783bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa062c749b5b22f1ef77440a70783bd");
        } else if (e != null) {
            try {
                e.submit(new Runnable() { // from class: com.sankuai.waimai.store.util.monitor.report.h.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44037f7c2f4ab66f6f3934d70378439b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44037f7c2f4ab66f6f3934d70378439b");
                        } else {
                            h.a(jSONObject);
                        }
                    }
                });
            } catch (Throwable th) {
                com.dianping.judas.util.a.a(th);
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dd2e423d58a5d5d72c6c8372dc17d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dd2e423d58a5d5d72c6c8372dc17d28");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("content", jSONArray.toString());
            jSONObject2.put("customParam", b().toString());
            String jSONObject3 = jSONObject2.toString();
            String a2 = com.dianping.codelog.Utils.b.a(true);
            Object[] objArr2 = {a2, jSONObject3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9e12714980ab1ea89277fe2e0532fb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9e12714980ab1ea89277fe2e0532fb3");
            } else if (TextUtils.isEmpty(a2)) {
            } else {
                byte[] a3 = a(jSONObject3, null);
                ((SGCodeLogRetrofitService) new ar.a().a("https://catdot.dianping.com").a(com.meituan.android.singleton.i.a("defaultokhttp")).a().a(SGCodeLogRetrofitService.class)).codeLog(al.a(a3, PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON)).a();
            }
        } catch (Exception e2) {
            com.dianping.judas.util.a.a(e2);
        }
    }

    private static JSONObject b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2cf679cb130f195ecdd781496ca719e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2cf679cb130f195ecdd781496ca719e");
        }
        JSONObject jSONObject = com.dianping.codelog.b.a().c() == null ? new JSONObject() : com.dianping.codelog.b.a().c();
        try {
            jSONObject.put("appId", com.dianping.codelog.b.a().a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put("unionId", com.dianping.codelog.b.a().b());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put("debug", com.dianping.codelog.Utils.a.a(com.dianping.codelog.b.b()));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put("platform", "android");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str)) {
                str = str.trim();
            }
            jSONObject.put("platVersion", str);
            jSONObject.put("os-build", str);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            jSONObject.put("deviceBrand", Build.BRAND);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            jSONObject.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            jSONObject.put("device-fingerprint", Build.FINGERPRINT);
            jSONObject.put("appVersion", f.b());
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    private static byte[] a(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "661a8ea40c9e5a19479c7f2a0d6dcb14", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "661a8ea40c9e5a19479c7f2a0d6dcb14");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        String str3 = TextUtils.isEmpty(null) ? "UTF-8" : null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            gZIPOutputStream.write(str.getBytes(str3));
            gZIPOutputStream.flush();
            byteArrayOutputStream.close();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                gZIPOutputStream.close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            return byteArray;
        } catch (IOException e4) {
            e = e4;
            gZIPOutputStream2 = gZIPOutputStream;
            e.printStackTrace();
            byte[] bArr = new byte[0];
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream2 != null) {
                    gZIPOutputStream2.close();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            try {
                byteArrayOutputStream.close();
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            throw th;
        }
    }

    private static JSONObject a(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9972538e2d663245605ba18acc376ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9972538e2d663245605ba18acc376ffb");
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", str2);
            jSONObject.put("time", j);
            jSONObject.put("level", str);
            jSONObject.put(SnifferDBHelper.COLUMN_LOG, str3);
            jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, str2.contains("::") ? str2.substring(0, str2.indexOf("::")) : str2);
        } catch (Exception e2) {
            com.dianping.judas.util.a.a(e2);
        }
        return jSONObject;
    }

    private void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0999c2a328bff3863d074f8faf2f26d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0999c2a328bff3863d074f8faf2f26d6");
        } else if (jSONObject == null) {
        } else {
            try {
                String jSONObject2 = jSONObject.toString();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(SnifferDBHelper.COLUMN_LOG, jSONObject2);
                jSONObject3.put("level", jSONObject.getString("level"));
                jSONObject3.put(DeviceInfo.TM, jSONObject.getString("time"));
                jSONObject3.put("category", jSONObject.getString("category"));
                com.dianping.networklog.c.a(jSONObject3.toString(), 3);
            } catch (Exception e2) {
                com.dianping.judas.util.a.a(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final Class b;
        final String c;
        final String d;

        private a(Class cls, String str, String str2) {
            Object[] objArr = {cls, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ec12f2d004e2035208d5cb1399acd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ec12f2d004e2035208d5cb1399acd4");
                return;
            }
            this.b = cls;
            this.c = str;
            this.d = str2;
        }
    }
}
