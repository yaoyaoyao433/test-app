package com.meituan.mmp.lib.utils;

import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mmp.lib.executor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static final List<String> b = h.a("service.js", "runtime.js", "babel-polyfill.js");
    private static final Map<DioFile, a> c = new ConcurrentHashMap();
    private static final List<DioFile> d = Collections.synchronizedList(new ArrayList());

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public IOException b;
    }

    public static void a(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "292da40e34d164a1c5afe7f610c1d6f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "292da40e34d164a1c5afe7f610c1d6f5");
        } else if (dioFile.o()) {
            com.meituan.mmp.lib.trace.b.c("preloadAllBrotherEntries: " + dioFile.e());
            DioFile[] m = new DioFile(dioFile.d().getPath()).m();
            if (m != null) {
                for (final DioFile dioFile2 : m) {
                    String e = dioFile2.e();
                    if (e != null && e.endsWith(".js") && b.contains(e)) {
                        Object[] objArr2 = {dioFile2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5e0b2886f5432ef0eff9f36d30fcffe5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5e0b2886f5432ef0eff9f36d30fcffe5");
                        } else if (dioFile2.o()) {
                            d.add(dioFile2);
                            com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.utils.o.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94bae3bad8ceaecec18544041f111199", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94bae3bad8ceaecec18544041f111199");
                                    } else if (o.d.remove(DioFile.this)) {
                                        com.meituan.mmp.main.ab.a("preloadDioData: " + DioFile.this.e());
                                        o.c.put(DioFile.this, o.d(DioFile.this));
                                        com.meituan.mmp.main.ab.a();
                                    }
                                }
                            });
                            a.c.a(new Runnable() { // from class: com.meituan.mmp.lib.utils.o.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f2de8827e24895fcaf87104b174fef9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f2de8827e24895fcaf87104b174fef9");
                                        return;
                                    }
                                    o.d.remove(DioFile.this);
                                    o.c.remove(DioFile.this);
                                }
                            }, MetricsAnrManager.ANR_THRESHOLD);
                        }
                    }
                }
            }
        }
    }

    public static a b(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "feda2b223545b8f83248f96746c77e90", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "feda2b223545b8f83248f96746c77e90");
        }
        a remove = c.remove(dioFile);
        if (remove != null) {
            com.meituan.mmp.lib.trace.b.a("DioDataCache", "cache hit: " + dioFile.e());
            return remove;
        }
        com.meituan.mmp.lib.trace.b.a("DioDataCache", "cache miss: " + dioFile.e());
        return d(dioFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96888c16d398eb416e4a855e5358fc08", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96888c16d398eb416e4a855e5358fc08");
        }
        a aVar = new a();
        try {
            aVar.a = s.a(dioFile);
        } catch (IOException e) {
            com.meituan.mmp.lib.trace.b.a("DioDataCache", e);
            aVar.b = e;
        }
        return aVar;
    }
}
