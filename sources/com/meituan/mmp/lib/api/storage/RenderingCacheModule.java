package com.meituan.mmp.lib.api.storage;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.lib.utils.r;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.mmp.main.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RenderingCacheModule extends ServiceApi {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(RenderingCacheModule renderingCacheModule, JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, renderingCacheModule, changeQuickRedirect, false, "8d80a4b335e8d74e317d93254b7341f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, renderingCacheModule, changeQuickRedirect, false, "8d80a4b335e8d74e317d93254b7341f9");
            return;
        }
        com.meituan.mmp.lib.config.a appConfig = renderingCacheModule.getAppConfig();
        String a2 = a.a(appConfig, str);
        Object opt = jSONObject.opt("cache");
        SharedPreferences a3 = a.a(appConfig.c());
        if (opt == null || StringUtil.NULL.equals(opt.toString())) {
            b.b("RenderingCacheModule", "received null dynamic cache, clear cache");
            a3.edit().remove(a2).apply();
            return;
        }
        JSONObject b = ac.b(a.a(a3, a2, ""));
        if (b.length() == 0) {
            b.b("RenderingCacheModule", "static cache is null, can not add dynamic cache");
            return;
        }
        try {
            b.put("cache", opt);
        } catch (JSONException e) {
            b.a(e);
        }
        a.a(appConfig, str, b.toString());
        Object opt2 = jSONObject.opt("cacheTemplate");
        a.b(appConfig, str, opt2 != null ? opt2.toString() : null);
        a.a(appConfig);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fbb0f342eac17d0ebeb6e539a7a49d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fbb0f342eac17d0ebeb6e539a7a49d") : new String[]{"setInitialRenderingCache"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5956a43cded1c258304a7c48ba0b838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5956a43cded1c258304a7c48ba0b838");
            return;
        }
        if (((str.hashCode() == -850939528 && str.equals("setInitialRenderingCache")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        Object[] objArr2 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ab336fd71f05d9d2b91fb9d87997107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ab336fd71f05d9d2b91fb9d87997107");
            return;
        }
        final String optString = jSONObject.optString("pageName", "");
        if (getAppConfig() != null && getAppConfig().l(optString) != a.EnumC0404a.DYNAMIC) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "current renderingCacheState is not dynamic"));
        } else {
            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.api.storage.RenderingCacheModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57867eb2cc57064c8ea8affe359ffa29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57867eb2cc57064c8ea8affe359ffa29");
                        return;
                    }
                    RenderingCacheModule.a(RenderingCacheModule.this, jSONObject, optString);
                    iApiCallback.onSuccess(null);
                }
            });
        }
    }

    public static void a(com.meituan.mmp.lib.config.a aVar, String str, String str2) {
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8541d46de029054e076a47ffe083b3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8541d46de029054e076a47ffe083b3f1");
            return;
        }
        ab.a("saveStaticRenderCache");
        a.b(aVar, str, (String) null);
        a.a(aVar, str, str2);
        a.a(aVar);
        ab.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        static String a(com.meituan.mmp.lib.config.a aVar, String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbd606c60a0c5de62495836045715b66", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbd606c60a0c5de62495836045715b66");
            }
            String p = str != null ? com.meituan.mmp.lib.config.a.p(str) : "";
            return MMPEnvHelper.getEnvInfo().getUserID() + CommonConstant.Symbol.COLON + MMPEnvHelper.getEnvInfo().getAppID() + CommonConstant.Symbol.COLON + aVar.g() + CommonConstant.Symbol.COLON + p;
        }

        public static String b(com.meituan.mmp.lib.config.a aVar, String str) {
            Object[] objArr = {aVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6a0a08fd993aa4dd0da815105f7810b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6a0a08fd993aa4dd0da815105f7810b");
            }
            return a(aVar, str) + "_template";
        }

        public static synchronized SharedPreferences a(String str) {
            synchronized (a.class) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f4a9430570b63752b66438e011cbcba", RobustBitConfig.DEFAULT_VALUE)) {
                    return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f4a9430570b63752b66438e011cbcba");
                }
                return MMPEnvHelper.getSharedPreferences("mmp_init_cache" + str);
            }
        }

        static void a(com.meituan.mmp.lib.config.a aVar, String str, String str2) {
            Object[] objArr = {aVar, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37fd8b7757d4399310c070d542110e58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37fd8b7757d4399310c070d542110e58");
                return;
            }
            String a2 = a(aVar, str);
            b.b("RenderingCacheModule", "saveRenderCache to " + a2 + ", " + r.a(str2));
            b(a(aVar.c()), a2, str2);
        }

        static void a(com.meituan.mmp.lib.config.a aVar) {
            long j;
            File file;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "933e030121035b8c433c9a0c492e1cae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "933e030121035b8c433c9a0c492e1cae");
                return;
            }
            ab.a("RenderingCacheModule checkSize");
            SharedPreferences a2 = a(aVar.c());
            String str = "mmp_init_cache" + aVar.c();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5b7f5916743e540f3f4b58c90d139ce8", RobustBitConfig.DEFAULT_VALUE)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5b7f5916743e540f3f4b58c90d139ce8")).longValue();
            } else if (TextUtils.isEmpty(str) || MMPEnvHelper.getContext() == null) {
                j = -1;
            } else {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "701ca5ec33fffbfcae3e216692fdd77d", RobustBitConfig.DEFAULT_VALUE)) {
                    file = (File) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "701ca5ec33fffbfcae3e216692fdd77d");
                } else {
                    file = new File(MMPEnvHelper.getContext().getApplicationInfo().dataDir, "shared_prefs/" + str + ".xml");
                }
                if (file.exists()) {
                    j = file.length();
                } else {
                    j = z.a(MMPEnvHelper.getContext(), str);
                }
            }
            b.b("RenderingCacheModule", "checkFileSize: " + r.a(j));
            if (j >= 31457280) {
                b.c("RenderingCacheModule", "clear rendering cache because size is over limit");
                MetricsModule.a("mmp.count.clear.render.cache", v.a("mmp.id", aVar.c()));
                a2.edit().clear().apply();
            }
            ab.a();
        }

        static void b(com.meituan.mmp.lib.config.a aVar, String str, String str2) {
            Object[] objArr = {aVar, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8149c1c7689e7305ab0f45f76ce41317", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8149c1c7689e7305ab0f45f76ce41317");
                return;
            }
            String b = b(aVar, str);
            b.b("RenderingCacheModule", "saveSnapshotTemplate to " + b + ", " + r.a(str2));
            b(a(aVar.c()), b, str2);
        }

        @Nullable
        public static String a(com.meituan.mmp.lib.config.a aVar, String str, int i, String str2) {
            Object[] objArr = {aVar, str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ac207a9901c1360bf58edde0bcf01c2", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ac207a9901c1360bf58edde0bcf01c2");
            }
            ab.a("obtainRenderCache");
            String a2 = a(aVar, str);
            String a3 = a(a(aVar.c()), a2, "");
            if (TextUtils.isEmpty(a3)) {
                b.b("RenderingCacheModule", "cache not found for " + a2);
            } else {
                a3 = a(a3, aVar, str, i, str2);
                b.b("RenderingCacheModule", "obtainRenderCache: return " + r.a(a3));
            }
            ab.a();
            return a3;
        }

        @Nullable
        public static String a(String str, com.meituan.mmp.lib.config.a aVar, String str2, int i, String str3) {
            Object[] objArr = {str, aVar, str2, Integer.valueOf(i), str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae68d6d5c2b88e53c7e41aa2a6103ab9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae68d6d5c2b88e53c7e41aa2a6103ab9");
            }
            try {
                ac.a aVar2 = new ac.a(str);
                aVar2.a("id", Integer.valueOf(i));
                aVar2.a(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
                aVar2.a("navigationType", str3);
                a.EnumC0404a l = aVar.l(str2);
                if (l != a.EnumC0404a.NONE) {
                    aVar2.a("initialRenderingCache", l.name().toLowerCase());
                }
                return aVar2.a();
            } catch (JSONException e) {
                b.a(e);
                return null;
            }
        }

        private static void b(SharedPreferences sharedPreferences, String str, String str2) {
            Object[] objArr = {sharedPreferences, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74bfcdef9e5ac5a220c4a7c788920c2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74bfcdef9e5ac5a220c4a7c788920c2c");
            } else if ((sharedPreferences instanceof z) && com.meituan.mmp.lib.config.b.G()) {
                ((z) sharedPreferences).a(str, str2);
            } else {
                sharedPreferences.edit().putString(str, str2).apply();
            }
        }

        public static String a(SharedPreferences sharedPreferences, String str, String str2) {
            Object[] objArr = {sharedPreferences, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96f2b3b88957b2f9cc6344108e0015c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96f2b3b88957b2f9cc6344108e0015c8");
            }
            if ((sharedPreferences instanceof z) && com.meituan.mmp.lib.config.b.G()) {
                return ((z) sharedPreferences).b(str, str2);
            }
            return sharedPreferences.getString(str, str2);
        }
    }
}
