package com.sankuai.waimai.launcher.init;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.util.ProcessUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.kit.utils.d;
import com.sankuai.waimai.router.method.Func2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final LinkedHashMap<String, Long> b;
    public final LinkedHashMap<String, Long> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae14f0650c4a11dc3d042fc3c3d015e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae14f0650c4a11dc3d042fc3c3d015e");
            return;
        }
        this.b = new LinkedHashMap<>();
        this.c = new LinkedHashMap<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab0e0a4fe5a2f20a599882e80ed34934", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab0e0a4fe5a2f20a599882e80ed34934") : a.a;
    }

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a00ffac4fcc35ca9c5155f4cee6ef97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a00ffac4fcc35ca9c5155f4cee6ef97");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b a2 = a();
            Object[] objArr2 = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "64457b0735b564424084684ccb0aef15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "64457b0735b564424084684ccb0aef15");
            } else if (j > 0) {
                a2.b.put(str, Long.valueOf(j));
            }
        }
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "598f0fb8890a0e802e41196c4bc54350", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "598f0fb8890a0e802e41196c4bc54350")).longValue() : SystemClock.elapsedRealtime();
    }

    public static long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75aa8adf9a82869ceea294db5a6f3d44", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75aa8adf9a82869ceea294db5a6f3d44")).longValue() : SystemClock.elapsedRealtime() - j;
    }

    public void a(final String str, final LinkedHashMap<String, Long> linkedHashMap) {
        Object[] objArr = {str, linkedHashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8d2b1313b1d85bd1093b33f1d84459e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8d2b1313b1d85bd1093b33f1d84459e");
        } else if (ProcessUtil.isMainProcess(com.meituan.android.singleton.b.a)) {
            com.sankuai.waimai.kit.utils.d.a(new d.a() { // from class: com.sankuai.waimai.launcher.init.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.utils.d.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "615f703831484b37446e6b0ea92593c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "615f703831484b37446e6b0ea92593c7");
                        return;
                    }
                    if (com.sankuai.meituan.takeoutnew.a.j) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "653a7a52d1e9f7cd373ea8e63075b91b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "653a7a52d1e9f7cd373ea8e63075b91b");
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("tag", str);
                                hashMap.put("item", entry.getKey());
                                hashMap.put("value", entry.getValue());
                                arrayList.add(hashMap);
                            }
                            try {
                                Func2 func2 = (Func2) com.sankuai.waimai.router.a.a(Func2.class, "perflab_reporter");
                                if (func2 != null) {
                                    func2.call("init_record", arrayList);
                                }
                            } catch (Exception e) {
                                Log.e("PerfLab", String.format("report init items failed: %s", e.getMessage()));
                            }
                        }
                    }
                    MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("takeout/init_items/" + str, 1L);
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        createCustomSpeedMeterTask.recordStepUseDefined((String) entry2.getKey(), ((Long) entry2.getValue()).longValue() + 1);
                    }
                    h.a(createCustomSpeedMeterTask);
                }
            }, (String) null);
        }
    }
}
