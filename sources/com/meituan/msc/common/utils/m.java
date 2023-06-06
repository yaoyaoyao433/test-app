package com.meituan.msc.common.utils;

import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.msc.common.executor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static final List<String> b;
    private static final Map<DioFile, a> c;
    private static final List<DioFile> d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public IOException b;
    }

    static {
        String[] strArr = {"service.js", "runtime.js", "babel-polyfill.js"};
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = f.a;
        b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6c7bcaa177d3ce9d22391d3e3862aa6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6c7bcaa177d3ce9d22391d3e3862aa6") : new ArrayList(Arrays.asList(strArr));
        c = new ConcurrentHashMap();
        d = Collections.synchronizedList(new ArrayList());
    }

    public static void a(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27b812206dc67d8cbfbf7443e4e136d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27b812206dc67d8cbfbf7443e4e136d6");
        } else if (dioFile.o()) {
            com.meituan.msc.modules.reporter.g.b("preloadAllBrotherEntries", dioFile.e());
            DioFile[] m = new DioFile(dioFile.d().getPath()).m();
            if (m != null) {
                for (final DioFile dioFile2 : m) {
                    String e = dioFile2.e();
                    if (e != null && e.endsWith(".js") && b.contains(e)) {
                        Object[] objArr2 = {dioFile2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "995b5f008ef75af7695f5fa5763fcd97", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "995b5f008ef75af7695f5fa5763fcd97");
                        } else if (dioFile2.o()) {
                            d.add(dioFile2);
                            com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.common.utils.m.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5dc02109be998508d02930a57febc3ba", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5dc02109be998508d02930a57febc3ba");
                                    } else if (m.d.remove(DioFile.this)) {
                                        m.c.put(DioFile.this, m.d(DioFile.this));
                                    }
                                }
                            });
                            a.c.a(new Runnable() { // from class: com.meituan.msc.common.utils.m.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f3174b856a9c77d95b9aec4f417eb5d3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f3174b856a9c77d95b9aec4f417eb5d3");
                                        return;
                                    }
                                    m.d.remove(DioFile.this);
                                    m.c.remove(DioFile.this);
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "083228dd062d2272656ae910bfa5edcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "083228dd062d2272656ae910bfa5edcd");
        }
        a remove = c.remove(dioFile);
        if (remove != null) {
            com.meituan.msc.modules.reporter.g.a("DioDataCache", "cache hit: ", dioFile.e());
            return remove;
        }
        com.meituan.msc.modules.reporter.g.a("DioDataCache", "cache miss: ", dioFile.e());
        return d(dioFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69b351bd64afbe5a2dcfa836dd28946b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69b351bd64afbe5a2dcfa836dd28946b");
        }
        a aVar = new a();
        try {
            aVar.a = r.a(dioFile);
        } catch (IOException e) {
            com.meituan.msc.modules.reporter.g.a("DioDataCache", e);
            aVar.b = e;
        }
        return aVar;
    }
}
