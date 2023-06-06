package com.meituan.msc.modules.page.render.webview;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.af;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.update.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    @Nullable
    public static String a(com.meituan.msc.modules.update.f fVar, String str, int i, String str2) {
        Object[] objArr = {fVar, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2917f0db13fe34a4dd6ebf9fdcaee1bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2917f0db13fe34a4dd6ebf9fdcaee1bc");
        }
        if (a(fVar, str)) {
            return b(fVar, str, i, str2);
        }
        return null;
    }

    public static boolean a(com.meituan.msc.modules.update.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8cc9cc74d10eb3305f781191c256194", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8cc9cc74d10eb3305f781191c256194")).booleanValue() : fVar.j(str) != a.EnumC0474a.NONE && com.meituan.msc.common.config.b.d();
    }

    @Nullable
    public static String a(String str, com.meituan.msc.modules.update.f fVar, String str2, int i, String str3) {
        Object[] objArr = {str, fVar, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "298d02f55732ea808b1d707e19f2487e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "298d02f55732ea808b1d707e19f2487e");
        }
        try {
            ab.a aVar = new ab.a(str);
            aVar.a("id", Integer.valueOf(i));
            aVar.a(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
            aVar.a("navigationType", str3);
            a.EnumC0474a j = fVar.j(str2);
            if (j != a.EnumC0474a.NONE) {
                aVar.a("initialRenderingCache", j.name().toLowerCase());
            }
            return aVar.a();
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a(e);
            return null;
        }
    }

    static void a(com.meituan.msc.modules.update.f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d36f48e394bbf9c09a542f6659853d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d36f48e394bbf9c09a542f6659853d30");
            return;
        }
        String c = c(fVar, str);
        com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "saveSnapshotTemplate to ", c, ", ", com.meituan.msc.common.utils.q.a(str2));
        b(a(fVar.j()), c, str2);
    }

    @Nullable
    private static String b(com.meituan.msc.modules.update.f fVar, String str, int i, String str2) {
        Object[] objArr = {fVar, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b7517b15428636a6a7bdce4100e0f9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b7517b15428636a6a7bdce4100e0f9b");
        }
        String b = b(fVar, str);
        String a2 = a(a(fVar.j()), b, "");
        if (TextUtils.isEmpty(a2)) {
            com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "cache not found for ", b);
            return a2;
        }
        String a3 = a(a2, fVar, str, i, str2);
        com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "obtainRenderCache: return ", com.meituan.msc.common.utils.q.a(a3));
        return a3;
    }

    static void b(com.meituan.msc.modules.update.f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4ad54c3430f7233ace2be386a99bfdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4ad54c3430f7233ace2be386a99bfdc");
            return;
        }
        String b = b(fVar, str);
        com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "saveRenderCache to ", b, ", ", com.meituan.msc.common.utils.q.a(str2));
        b(a(fVar.j()), b, str2);
    }

    static String b(com.meituan.msc.modules.update.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc6566cb8556e720257323987c69655d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc6566cb8556e720257323987c69655d");
        }
        String b = str != null ? am.b(str) : "";
        return MSCEnvHelper.getEnvInfo().getUserID() + CommonConstant.Symbol.COLON + MSCEnvHelper.getEnvInfo().getAppID() + CommonConstant.Symbol.COLON + fVar.w() + CommonConstant.Symbol.COLON + b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(com.meituan.msc.modules.update.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "602701e3326c9ff1acd6864e6bd0e45a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "602701e3326c9ff1acd6864e6bd0e45a");
        }
        return b(fVar, str) + "_template";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized SharedPreferences a(String str) {
        synchronized (k.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48da0d199410b507a22f90542ba534fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48da0d199410b507a22f90542ba534fd");
            }
            return MSCEnvHelper.getSharedPreferences("msc_init_cache" + str);
        }
    }

    private static long b(String str) {
        File file;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "794a71e85795f0c735c861a0a2f2ce43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "794a71e85795f0c735c861a0a2f2ce43")).longValue();
        }
        if (TextUtils.isEmpty(str) || MSCEnvHelper.getContext() == null) {
            return -1L;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6808856aa5f72076a9131489fdde71f6", RobustBitConfig.DEFAULT_VALUE)) {
            file = (File) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6808856aa5f72076a9131489fdde71f6");
        } else {
            file = new File(MSCEnvHelper.getContext().getApplicationInfo().dataDir, "shared_prefs/" + str + ".xml");
        }
        if (file.exists()) {
            return file.length();
        }
        return af.a(MSCEnvHelper.getContext(), str);
    }

    static void a(com.meituan.msc.modules.update.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e030ee5b9cfe2f92ce956ee97c84eb17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e030ee5b9cfe2f92ce956ee97c84eb17");
            return;
        }
        SharedPreferences a2 = a(fVar.j());
        long b = b("msc_init_cache" + fVar.j());
        com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "checkFileSize: ", com.meituan.msc.common.utils.q.a(b));
        if (b >= 31457280) {
            com.meituan.msc.modules.reporter.g.e("RenderingCacheModule", "clear rendering cache because size is over limit");
            com.meituan.msc.modules.api.report.b.a("msc.count.clear.render.cache", t.a("mmp.id", fVar.j()));
            a2.edit().clear().apply();
        }
    }

    private static void b(SharedPreferences sharedPreferences, String str, String str2) {
        Object[] objArr = {sharedPreferences, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40ba0a1158ee61e7712900b412a20c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40ba0a1158ee61e7712900b412a20c42");
        } else if (sharedPreferences instanceof af) {
            ((af) sharedPreferences).a(str, str2);
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        Object[] objArr = {sharedPreferences, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46b82bd078d073281d91b44c57e99b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46b82bd078d073281d91b44c57e99b0e");
        }
        if (sharedPreferences instanceof af) {
            return ((af) sharedPreferences).b(str, str2);
        }
        return sharedPreferences.getString(str, str2);
    }
}
