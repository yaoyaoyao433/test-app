package com.meituan.msi.lib.map.utils;

import android.util.Log;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a = null;
    public static ExecutorService b = null;
    private static MsiContext c = null;
    private static int d = 3;
    private static String e;
    private static String f;

    public static long a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "949cedea9084b78f80b22580ad93cdb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "949cedea9084b78f80b22580ad93cdb6")).longValue();
        }
        if (jsonObject.has("timeStamp")) {
            return jsonObject.get("timeStamp").getAsLong();
        }
        return 0L;
    }

    public static void a(Map<String, String> map, Map<String, Float> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8171776389baee2c6c4a303a19eeca47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8171776389baee2c6c4a303a19eeca47");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.report.c cVar = new com.sankuai.meituan.mapsdk.mapcore.report.c();
        cVar.c = new com.sankuai.meituan.mapsdk.mapcore.report.e(map, map2);
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4f8e608af6ad75f1d5c0ef7a0501b3ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4f8e608af6ad75f1d5c0ef7a0501b3ae");
        } else {
            com.sankuai.meituan.mapsdk.mapcore.report.h.a().a("", cVar);
        }
    }

    public static void a(MsiContext msiContext, int i, String str, String str2) {
        c = msiContext;
        d = i;
        e = str;
        f = str2;
    }

    public static void a(final Class<?> cls, final String str, final int i, final String str2) {
        Object[] objArr = {cls, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d0f8804e545e710e1fce561d6e1bcbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d0f8804e545e710e1fce561d6e1bcbd");
            return;
        }
        if (b == null) {
            b = com.sankuai.android.jarvis.c.a("MSICodeLog");
        }
        b.execute(new Runnable() { // from class: com.meituan.msi.lib.map.utils.j.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93424d5c924b350670994687a3de312b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93424d5c924b350670994687a3de312b");
                } else {
                    com.sankuai.meituan.mapsdk.mapcore.report.f.a(j.c.getActivity(), j.d, j.e, cls, str, i, String.format(Locale.getDefault(), "%s,biz:%s", str2, j.f));
                }
            }
        });
    }

    public static void a(final Class<?> cls, final String str, int i, final Throwable th) {
        Object[] objArr = {cls, str, Integer.valueOf((int) Constants.REQUEST_SHARE_TO_TROOP_BAR), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85fee8adc609f47c880f691731666227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85fee8adc609f47c880f691731666227");
            return;
        }
        if (b == null) {
            b = com.sankuai.android.jarvis.c.a("MSICodeLog");
        }
        b.execute(new Runnable() { // from class: com.meituan.msi.lib.map.utils.j.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a551b0be370f062fdeff0d189557a7e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a551b0be370f062fdeff0d189557a7e8");
                    return;
                }
                com.sankuai.meituan.mapsdk.mapcore.report.f.a(j.c.getActivity(), j.d, j.e, cls, str, r4, Log.getStackTraceString(th));
            }
        });
    }
}
