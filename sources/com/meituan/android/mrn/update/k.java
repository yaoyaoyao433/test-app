package com.meituan.android.mrn.update;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.mrn.config.af;
import com.meituan.android.mrn.config.q;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.x;
import com.meituan.android.mrn.update.d;
import com.meituan.android.mrn.update.h;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.utils.SelectPhotoUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class k {
    public static ChangeQuickRedirect a;
    private static k g;
    public Context b;
    public IMRNCheckUpdate c;
    public List<i> d;
    public volatile boolean e;
    public h.a f;
    private g h;
    private ScheduledExecutorService i;
    private ScheduledFuture j;
    private volatile boolean k;
    private Map<String, String> l;
    private Map<String, Integer> m;
    private List<d.c> n;

    public static /* synthetic */ void a(k kVar, ResponseBundle responseBundle) {
        Object[] objArr = {responseBundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "aa72a6b03e10ec1a1d68ede6f07d10aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "aa72a6b03e10ec1a1d68ede6f07d10aa");
        } else if (responseBundle != null) {
            kVar.a(responseBundle.name, responseBundle.version, responseBundle.id);
            if (responseBundle.meta != null) {
                for (ResponseBundle responseBundle2 : responseBundle.meta) {
                    kVar.a(responseBundle2.name, responseBundle2.version, responseBundle2.id);
                }
            }
        }
    }

    public static /* synthetic */ void a(k kVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "20292ec64462c9b50fb3f18f6bc04e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "20292ec64462c9b50fb3f18f6bc04e3c");
        } else if (aVar != null) {
            p.a("[MRNUpdater@checkUpdateSingleBundle]", aVar.a);
            aVar.b = false;
            kVar.c(aVar);
        }
    }

    public static /* synthetic */ void a(k kVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "dba33e4c6dfcaf086a47b83c781ad253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "dba33e4c6dfcaf086a47b83c781ad253");
            return;
        }
        p.a("[MRNUpdater@convertBundleList]", list);
        if (!kVar.e() || list == null || list.size() == 0) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ResponseBundle) it.next()).tags = "homepage";
        }
    }

    public static /* synthetic */ void a(k kVar, List list, a aVar, c cVar) {
        List<ResponseBundle> a2;
        Object[] objArr = {list, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "09d0bbd29ec62c908692ce52a4dc4cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "09d0bbd29ec62c908692ce52a4dc4cdc");
            return;
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = list == null ? StringUtil.NULL : Integer.valueOf(list.size());
        p.a("[MRNUpdater@checkUpdateCompleted]", objArr2);
        if (aVar != null) {
            List<String> list2 = aVar.e;
            List<String> list3 = aVar.f;
            String str = aVar.a;
            boolean z = aVar.b;
            d dVar = aVar.d;
            if (!TextUtils.isEmpty(str)) {
                if (z) {
                    j.a(list);
                    kVar.a(list);
                }
                if (list == null || list.size() <= 0) {
                    dVar.a(new d.a(str, null, cVar == null ? new c(f.WHOLE, q.DD_NO_BUNDLE_INFO.Z) : cVar, f.WHOLE, true, false, true));
                    return;
                } else if (z) {
                    List<ResponseBundle> c = j.c(Collections.singletonList(str));
                    if (c == null || c.size() == 0) {
                        dVar.a(new d.a(str, null, null, f.WHOLE, true, false, true));
                    } else {
                        kVar.a(c, dVar, aVar.c);
                    }
                    kVar.a(j.a("homepage"), aVar.c, true);
                    return;
                } else {
                    kVar.a(list, dVar, aVar.c);
                    return;
                }
            }
            j.a(list);
            kVar.a(list);
            if (list2 != null && list2.size() > 0) {
                if (!list2.contains("homepage")) {
                    list2.add("homepage");
                }
                a2 = j.b(list2);
            } else if (list3 != null && list3.size() > 0) {
                a2 = j.c(list3);
                a2.addAll(j.a("homepage"));
            } else {
                a2 = j.a("homepage");
            }
            kVar.a(a2, aVar.c, true);
        }
    }

    public static /* synthetic */ boolean a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff573f59ec5e4a0ead636a8a13a98b37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff573f59ec5e4a0ead636a8a13a98b37")).booleanValue();
        }
        p.a("[MRNUpdater@needDownload]", str + CommonConstant.Symbol.UNDERLINE + str2);
        com.meituan.android.mrn.engine.e bundle = MRNBundleManager.sharedInstance().getBundle(str, str2);
        if (z) {
            return !com.meituan.android.mrn.engine.h.b(bundle);
        }
        com.meituan.android.mrn.engine.e a2 = x.a().a(str);
        return a2 == null ? !com.meituan.android.mrn.engine.h.b(bundle) : com.meituan.android.mrn.utils.e.a(str2, a2.f) < 0 ? !com.meituan.android.mrn.engine.h.b(a2) : !com.meituan.android.mrn.engine.h.b(bundle);
    }

    public static /* synthetic */ void b(k kVar, a aVar) {
        a aVar2;
        e eVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "11d6eccfb6b5b6671cec757ffe763c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "11d6eccfb6b5b6671cec757ffe763c0e");
            return;
        }
        try {
            p.a("[MRNUpdater@checkUpdateAllBundle]", new Object[0]);
            aVar.b = true;
            kVar.c(aVar);
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr2 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "b4ea6d56cc7b05ef7c5e10bcdf107990", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "b4ea6d56cc7b05ef7c5e10bcdf107990");
            } else {
                com.meituan.android.mrn.common.b.a(kVar.b, "mrn_latest_check_update_time", currentTimeMillis);
            }
            p.a("[MRNUpdater@checkUpdateAllBundle]", "isForeground:" + kVar.e);
        } catch (Throwable th) {
            try {
                p.a("[MRNUpdater@checkUpdateAllBundle]", th, new Object[0]);
                p.a("[MRNUpdater@checkUpdateAllBundle]", "isForeground:" + kVar.e);
                if (!kVar.e) {
                    return;
                }
                com.facebook.common.logging.a.b("MRNUpdater", " 轮询时长 " + kVar.b());
                aVar2 = new a();
                eVar = new e(false);
            } catch (Throwable th2) {
                p.a("[MRNUpdater@checkUpdateAllBundle]", "isForeground:" + kVar.e);
                if (kVar.e) {
                    com.facebook.common.logging.a.b("MRNUpdater", " 轮询时长 " + kVar.b());
                    a aVar3 = new a();
                    aVar3.c = new e(false);
                    kVar.a(aVar3, kVar.b());
                }
                throw th2;
            }
        }
        if (kVar.e) {
            com.facebook.common.logging.a.b("MRNUpdater", " 轮询时长 " + kVar.b());
            aVar2 = new a();
            eVar = new e(false);
            aVar2.c = eVar;
            kVar.a(aVar2, kVar.b());
        }
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a57607022c6ad91b7aeedce9e854766d", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a57607022c6ad91b7aeedce9e854766d");
        }
        if (g == null) {
            throw new com.meituan.android.mrn.engine.j("you should call init with context first");
        }
        return g;
    }

    public static k a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b194e5476f61780de70d285d7698e1d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b194e5476f61780de70d285d7698e1d5");
        }
        if (g == null) {
            synchronized (k.class) {
                if (g == null) {
                    g = new k(context);
                }
            }
        }
        return g;
    }

    private k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b005f086f7d8dd9035936c4eeefb4cf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b005f086f7d8dd9035936c4eeefb4cf9");
            return;
        }
        this.d = new LinkedList();
        this.e = true;
        this.k = false;
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.n = Collections.synchronizedList(new ArrayList());
        this.i = com.sankuai.android.jarvis.c.c("mrn-Worker");
        this.b = context;
        this.f = new h.a(context, com.meituan.android.mrn.engine.f.a(context));
        this.h = new g(context, new b() { // from class: com.meituan.android.mrn.update.k.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.update.b
            public final boolean a(String str, String str2, boolean z) {
                Object[] objArr2 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc638e9c8594ba6c8bfece7f8572f8a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc638e9c8594ba6c8bfece7f8572f8a1")).booleanValue() : k.a(str, str2, z);
            }

            @Override // com.meituan.android.mrn.update.b
            public final boolean a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad7dc1aa3d36accf8b38d707eb4ac8c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad7dc1aa3d36accf8b38d707eb4ac8c1")).booleanValue() : com.meituan.android.mrn.engine.h.b(MRNBundleManager.sharedInstance().getBundle(str, str2));
            }

            @Override // com.meituan.android.mrn.update.b
            public final File b(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36cd5bf772e8b8dcd1208649f52c9c55", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36cd5bf772e8b8dcd1208649f52c9c55") : x.a().d(str, str2);
            }

            @Override // com.meituan.android.mrn.update.b
            public final File c(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9f581ad1c5ceca11eced6adb0a2cc7f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (File) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9f581ad1c5ceca11eced6adb0a2cc7f");
                }
                File d = x.a().d(str, str2);
                return !d.exists() ? x.a().b(str, str2) : d;
            }

            @Override // com.meituan.android.mrn.update.b
            public final boolean a(String str, String str2, File file, e eVar) {
                Object[] objArr2 = {str, str2, file, eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8eb0f45c487d36084400984ef71003f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8eb0f45c487d36084400984ef71003f")).booleanValue();
                }
                return MRNBundleManager.sharedInstance().installBundleFromFile(file, eVar == null || eVar.b) != null;
            }
        });
        g gVar = this.h;
        d dVar = new d() { // from class: com.meituan.android.mrn.update.k.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.b bVar) {
            }

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e87e56988cda3da6a10ef8a9db20a4dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e87e56988cda3da6a10ef8a9db20a4dd");
                    return;
                }
                k.a(k.this, cVar.a);
                k.this.a(cVar);
            }

            @Override // com.meituan.android.mrn.update.d
            public final void a(@NonNull d.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b47e0e0a416e8334d806a01089ee0b44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b47e0e0a416e8334d806a01089ee0b44");
                } else {
                    k.this.a(aVar.a, aVar.b);
                }
            }
        };
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "a18bded48382e7f042e0793426e8c2ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "a18bded48382e7f042e0793426e8c2ca");
        } else {
            gVar.c.add(dVar);
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9c9ec8f662df1843209237d0156af5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9c9ec8f662df1843209237d0156af5")).booleanValue() : !com.meituan.android.mrn.config.c.a().d();
    }

    public final void a(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee2b401d1a88348cf196c2bd7c2b283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee2b401d1a88348cf196c2bd7c2b283");
            return;
        }
        p.a("[MRNUpdater@warmUpByTag]", arrayList);
        if (e()) {
            return;
        }
        a aVar = new a();
        aVar.e = arrayList;
        aVar.c = new e(false);
        if (!j.a()) {
            a(aVar);
        } else {
            b(aVar);
        }
    }

    public final void a(ArrayList<String> arrayList, boolean z) {
        Object[] objArr = {arrayList, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d11a21b80c974f59b29054e8a4bfcd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d11a21b80c974f59b29054e8a4bfcd6");
            return;
        }
        p.a("[MRNUpdater@warmUpByBundle]", arrayList);
        if (e()) {
            return;
        }
        a aVar = new a();
        aVar.f = arrayList;
        aVar.c = new e(false);
        if (!j.a()) {
            a(aVar);
        } else {
            b(aVar);
        }
    }

    private void b(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445070b1659cce5019beb9c5da05f27d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445070b1659cce5019beb9c5da05f27d");
        } else {
            this.i.execute(new Runnable() { // from class: com.meituan.android.mrn.update.k.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "797d25b34977b4f7ef0745abd67cfa0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "797d25b34977b4f7ef0745abd67cfa0b");
                        return;
                    }
                    p.a("[MRNUpdater@handleMessage]", "MESSAGE_DOWNLOAD_BUNDLE ");
                    if (!TextUtils.isEmpty(aVar.a)) {
                        k.this.a(j.c(Collections.singletonList(aVar.a)), aVar.d, aVar.c);
                    } else if (aVar.e != null && aVar.e.size() > 0) {
                        k.this.a(j.b(aVar.e), aVar.c);
                    } else if (aVar.f == null || aVar.f.size() <= 0) {
                    } else {
                        k.this.a(j.c(aVar.f), aVar.c);
                    }
                }
            });
        }
    }

    public final void a(String str, boolean z, d dVar, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a10c67e1fb9bbee1a7998614fad8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a10c67e1fb9bbee1a7998614fad8a6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final a aVar = new a();
            aVar.a = str;
            aVar.d = dVar;
            aVar.c = new e(z2);
            p.a("[MRNUpdater@updateSingleBundle]", str);
            ResponseBundle b = j.b(str);
            if (z || b == null) {
                p.a("[MRNUpdater@updateSingleBundle]", "updateSingleBundle 2");
                this.i.execute(new Runnable() { // from class: com.meituan.android.mrn.update.k.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "104356be65c3595d0fb97a35503c5703", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "104356be65c3595d0fb97a35503c5703");
                            return;
                        }
                        p.a("[MRNUpdater@handleMessage]", "MESSAGE_PERIOD_CHECK_UPDATE_BUNDLE_NAME ");
                        k.a(k.this, aVar);
                    }
                });
                return;
            }
            p.a("[MRNUpdater@updateSingleBundle]", "updateSingleBundle 3");
            b(aVar);
        }
    }

    public void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6e23a3a62603c846133ef3b91a1386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6e23a3a62603c846133ef3b91a1386");
        } else {
            a(aVar, 0L);
        }
    }

    public synchronized void a(final a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376d8b37fd3957ef78f23fe512bb2f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376d8b37fd3957ef78f23fe512bb2f1a");
            return;
        }
        p.a("[MRNUpdater@checkUpdateAll]", new Object[0]);
        if (this.j != null) {
            this.j.cancel(false);
            this.j = null;
        }
        this.j = this.i.schedule(new Runnable() { // from class: com.meituan.android.mrn.update.k.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "849a997a2a6d065830fdbbcf6c54d75c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "849a997a2a6d065830fdbbcf6c54d75c");
                    return;
                }
                p.a("[MRNUpdater@handleMessage]", "MESSAGE_PERIOD_CHECK_UPDATE_ALL ");
                k.b(k.this, aVar);
            }
        }, j, TimeUnit.MILLISECONDS);
    }

    private List<RequestBundleInfo> f() {
        RequestBundleInfo fromMRNBundle;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f97420c61ab49e7c9ff3238be82121", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f97420c61ab49e7c9ff3238be82121");
        }
        List<com.meituan.android.mrn.engine.e> b = x.a().b();
        ArrayList arrayList = new ArrayList();
        if (b != null && b.size() > 0) {
            for (com.meituan.android.mrn.engine.e eVar : b) {
                if (eVar.h != 0 && (fromMRNBundle = RequestBundleInfo.fromMRNBundle(eVar, this.f)) != null) {
                    arrayList.add(fromMRNBundle);
                }
            }
        }
        return arrayList;
    }

    private void c(final a aVar) {
        String str;
        String str2;
        String str3;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8e84c36db37d3f90020b408aabb5f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8e84c36db37d3f90020b408aabb5f0");
        } else if (aVar == null) {
        } else {
            Object[] objArr2 = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.b ? "全量下载 " : "单包下载 ");
            if (aVar.e == null) {
                str = "";
            } else {
                str = "tags: " + aVar.e.toString();
            }
            sb.append(str);
            if (aVar.f == null) {
                str2 = "";
            } else {
                str2 = " bundleNames: " + aVar.f.toString();
            }
            sb.append(str2);
            if (aVar.a == null) {
                str3 = "";
            } else {
                str3 = " blockBundle: " + aVar.a;
            }
            sb.append(str3);
            objArr2[0] = sb.toString();
            p.a("[MRNUpdater@checkUpdate]", objArr2);
            rx.e<MRNCheckUpdateResponse> eVar = new rx.e<MRNCheckUpdateResponse>() { // from class: com.meituan.android.mrn.update.k.6
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(MRNCheckUpdateResponse mRNCheckUpdateResponse) {
                    int i;
                    MRNCheckUpdateResponse mRNCheckUpdateResponse2 = mRNCheckUpdateResponse;
                    Object[] objArr3 = {mRNCheckUpdateResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "07e570235e784a9cfa1222fcaa6ece7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "07e570235e784a9cfa1222fcaa6ece7c");
                        return;
                    }
                    p.a("[MRNUpdater@onNext]", "Response: " + com.meituan.android.mrn.utils.g.a(mRNCheckUpdateResponse2));
                    if (mRNCheckUpdateResponse2.code != 0 || mRNCheckUpdateResponse2.body == null) {
                        if (k.this.d != null && k.this.d.size() > 0) {
                            Iterator it = k.this.d.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                        }
                        k kVar = k.this;
                        a aVar2 = aVar;
                        f fVar = f.WHOLE;
                        if (mRNCheckUpdateResponse2.code != 0) {
                            i = q.DD_HTTP_CODE_ERROR.Z;
                        } else {
                            i = q.DD_NO_BUNDLE_INFO.Z;
                        }
                        k.a(kVar, (List) null, aVar2, new c(fVar, i));
                        return;
                    }
                    if (k.this.d != null && k.this.d.size() > 0) {
                        for (i iVar : k.this.d) {
                            iVar.a(aVar.b, mRNCheckUpdateResponse2.body.bundles, mRNCheckUpdateResponse2.body.bundlesToDel);
                        }
                    }
                    if (mRNCheckUpdateResponse2.body.bundles != null && mRNCheckUpdateResponse2.body.bundles.size() > 0) {
                        k.a(k.this, mRNCheckUpdateResponse2.body.bundles);
                    }
                    k.a(k.this, mRNCheckUpdateResponse2.body.bundles, aVar, (c) null);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "47f2d903a0f6362e287414d51d60f4f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "47f2d903a0f6362e287414d51d60f4f0");
                        return;
                    }
                    if (k.this.d != null && k.this.d.size() > 0) {
                        Iterator it = k.this.d.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                    com.facebook.common.logging.a.b("MRNUpdater@onError", (String) null, th);
                    k.a(k.this, (List) null, aVar, new c(f.WHOLE, q.DD_HTTP_FAILED.Z));
                }
            };
            af.a();
            HashMap hashMap = new HashMap();
            if (!aVar.b && !TextUtils.isEmpty(aVar.a)) {
                hashMap.put("bundleNames", aVar.a);
            }
            MRNCheckUpdateRequest mRNCheckUpdateRequest = new MRNCheckUpdateRequest("Android", com.meituan.android.mrn.config.c.a().e(), String.valueOf(com.meituan.android.mrn.config.c.a().m()), com.meituan.android.mrn.config.c.a().k() == null ? "" : com.meituan.android.mrn.config.c.a().k(), "3.1201.206", "0.63.3", com.meituan.android.mrn.config.c.a().n() == null ? "" : com.meituan.android.mrn.config.c.a().n(), aVar.b ? f() : null);
            this.c.checkUpdate(com.meituan.android.mrn.config.d.a(this.b).a(), hashMap, mRNCheckUpdateRequest).a(eVar);
            com.facebook.common.logging.a.a("MRNUpdater@checkUpdate", "Query: %s Request: %s", hashMap, com.meituan.android.mrn.utils.g.a(mRNCheckUpdateRequest));
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a32f85581123eafcc344f51ae046b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a32f85581123eafcc344f51ae046b43");
            return;
        }
        h b = this.f.b(str, str2);
        b.a = str3;
        this.f.a(str, str2, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<ResponseBundle> list, e eVar) {
        Object[] objArr = {list, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2fae71a46785c2851dd040ccd11092c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2fae71a46785c2851dd040ccd11092c");
        } else {
            a(list, eVar, false);
        }
    }

    private synchronized void a(List<ResponseBundle> list, e eVar, boolean z) {
        Object[] objArr = {list, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cd95c220db7b0cce967e47b5afb21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cd95c220db7b0cce967e47b5afb21a");
            return;
        }
        p.a("[MRNUpdater@download]", new Object[0]);
        if (list == null) {
            return;
        }
        if (z) {
            com.meituan.android.mrn.config.horn.e eVar2 = com.meituan.android.mrn.config.horn.e.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.e.a;
            if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "666af208e1576eb71e7a0f7933ec2ecc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "666af208e1576eb71e7a0f7933ec2ecc")).booleanValue() : ((Boolean) t.b.a("enableBundleSequence")).booleanValue()) {
                ArrayList arrayList = new ArrayList();
                for (ResponseBundle responseBundle : list) {
                    if (responseBundle.tags.contains("homepage")) {
                        arrayList.add(responseBundle);
                        if (responseBundle.sequence > 0) {
                            responseBundle.sequence = Integer.MAX_VALUE - responseBundle.sequence;
                        }
                    }
                }
                Collections.sort(arrayList, new Comparator<ResponseBundle>() { // from class: com.meituan.android.mrn.update.k.7
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(ResponseBundle responseBundle2, ResponseBundle responseBundle3) {
                        return responseBundle3.sequence - responseBundle2.sequence;
                    }
                });
                com.meituan.android.mrn.config.horn.e eVar3 = com.meituan.android.mrn.config.horn.e.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.config.horn.e.a;
                int intValue = PatchProxy.isSupport(objArr3, eVar3, changeQuickRedirect3, false, "0131e141d2d613de80bc9a0f3a3901e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, eVar3, changeQuickRedirect3, false, "0131e141d2d613de80bc9a0f3a3901e0")).intValue() : ((Integer) t.b.a("downloadLimit")).intValue();
                com.meituan.android.mrn.config.horn.e eVar4 = com.meituan.android.mrn.config.horn.e.b;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.config.horn.e.a;
                boolean booleanValue = PatchProxy.isSupport(objArr4, eVar4, changeQuickRedirect4, false, "667a8328cd3c3fdf7485078ebb6eb79a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, eVar4, changeQuickRedirect4, false, "667a8328cd3c3fdf7485078ebb6eb79a")).booleanValue() : ((Boolean) t.b.a("enableLimit")).booleanValue();
                for (int i = 0; i < arrayList.size() && (!booleanValue || i < intValue); i++) {
                    ResponseBundle responseBundle2 = (ResponseBundle) arrayList.get(i);
                    int i2 = responseBundle2.sequence;
                    if (i2 <= 0) {
                        eVar.c = 5;
                    } else {
                        eVar.c = i2;
                    }
                    this.h.a(responseBundle2, false, (d) null, eVar);
                }
                list.removeAll(arrayList);
            }
        }
        for (ResponseBundle responseBundle3 : list) {
            this.h.a(responseBundle3, false, (d) null, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<ResponseBundle> list, d dVar, e eVar) {
        Object[] objArr = {list, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ecb8e68163b800d411ea3e3535f8ebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ecb8e68163b800d411ea3e3535f8ebf");
            return;
        }
        p.a("[MRNUpdater@addBundleToPoolFirst]", list);
        if (list == null) {
            return;
        }
        for (ResponseBundle responseBundle : list) {
            this.h.a(responseBundle, true, dVar, eVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public boolean b;
        public e c;
        public d d;
        public List<String> e;
        public List<String> f;

        public a() {
            this.c = new e();
        }
    }

    public long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eaac2ee3ec3a1b5ebf13983614e2b9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eaac2ee3ec3a1b5ebf13983614e2b9f")).longValue();
        }
        long a2 = com.meituan.android.mrn.config.horn.f.b.a();
        if (a2 <= 0) {
            return 600000L;
        }
        return a2;
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b5ae2491d2f28fac53de2f0c8928e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b5ae2491d2f28fac53de2f0c8928e3");
            return;
        }
        p.a("[MRNUpdater@onBackground]", "onBackground ");
        this.e = false;
        if (this.j != null) {
            this.j.cancel(false);
            this.j = null;
        }
    }

    private synchronized void a(List<ResponseBundle> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df66f1aac1d3ea3d88d0607c7d207c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df66f1aac1d3ea3d88d0607c7d207c5");
        } else if (list != null) {
            if (!this.k) {
                this.k = true;
                HashMap hashMap = new HashMap();
                for (ResponseBundle responseBundle : list) {
                    if (responseBundle.tagList != null && responseBundle.tagList.contains("homepage")) {
                        this.l.put(responseBundle.name, responseBundle.version);
                        String e = com.meituan.android.mrn.monitor.g.e(responseBundle.name);
                        if (hashMap.containsKey(e)) {
                            hashMap.put(e, Integer.valueOf(((Integer) hashMap.get(e)).intValue() + 1));
                        } else {
                            hashMap.put(e, 1);
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    com.meituan.android.mrn.monitor.g.a().a("biz", (String) entry.getKey()).a("MRNHomepageDownload", ((Integer) entry.getValue()).intValue());
                }
                com.meituan.android.mrn.monitor.g.a().a("biz", SelectPhotoUtil.ALL_ID).a("MRNHomepageDownload", this.l.size());
                if (this.l.size() == 0) {
                    com.meituan.android.mrn.monitor.g.a().a("biz", SelectPhotoUtil.ALL_ID).a("MRNHomepageDownloadCost", 0.0f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(d.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738ea5d8b5a132b87d20f7f13c4ca142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738ea5d8b5a132b87d20f7f13c4ca142");
        } else if (cVar == null) {
        } else {
            if (this.n != null) {
                this.n.add(cVar);
            }
            if (this.l == null) {
                return;
            }
            String str = cVar.b;
            String str2 = cVar.c;
            if (this.l.size() > 0) {
                if (TextUtils.equals(str2, this.l.get(str)) && !this.m.containsKey(str)) {
                    this.m.put(str, Integer.valueOf(cVar.i));
                }
                this.l.remove(str);
            }
            if (this.l.size() == 0) {
                this.l = null;
                g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41be65a765f43cbfca7b6cbfb617846f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41be65a765f43cbfca7b6cbfb617846f");
        } else if (this.l == null) {
        } else {
            this.l.remove(str);
            if (this.l.size() == 0) {
                this.l = null;
                g();
            }
        }
    }

    private void g() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e171979a27b737ea26fa8a19299203e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e171979a27b737ea26fa8a19299203e3");
        } else if (this.m != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Integer> entry : this.m.entrySet()) {
                String e = com.meituan.android.mrn.monitor.g.e(entry.getKey());
                if (hashMap.containsKey(e)) {
                    hashMap.put(e, Integer.valueOf(((Integer) hashMap.get(e)).intValue() + entry.getValue().intValue()));
                } else {
                    hashMap.put(e, entry.getValue());
                }
                i += entry.getValue().intValue();
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                com.meituan.android.mrn.monitor.g.a().a("biz", (String) entry2.getKey()).a("MRNHomepageDownloadCost", ((Integer) entry2.getValue()).intValue());
            }
            com.meituan.android.mrn.monitor.g.a().a("biz", SelectPhotoUtil.ALL_ID).a("MRNHomepageDownloadCost", i);
            this.m = null;
        }
    }

    public final synchronized void d() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "280bb2948bf379cb45e95f57d93a61c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "280bb2948bf379cb45e95f57d93a61c6");
        } else if (this.n != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i2 = 0;
            for (d.c cVar : this.n) {
                if (cVar != null) {
                    i++;
                    i2 += cVar.i;
                    String e = com.meituan.android.mrn.monitor.g.e(cVar.b);
                    if (hashMap.containsKey(e)) {
                        hashMap.put(e, Integer.valueOf(((Integer) hashMap.get(e)).intValue() + 1));
                        hashMap2.put(e, Integer.valueOf(((Integer) hashMap2.get(e)).intValue() + cVar.i));
                    } else {
                        hashMap.put(e, 1);
                        hashMap2.put(e, Integer.valueOf(cVar.i));
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                com.meituan.android.mrn.monitor.g.a().a("biz", (String) entry.getKey()).a("MRNLaunchDownload", ((Integer) entry.getValue()).intValue());
            }
            com.meituan.android.mrn.monitor.g.a().a("biz", SelectPhotoUtil.ALL_ID).a("MRNLaunchDownload", i);
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                com.meituan.android.mrn.monitor.g.a().a("biz", (String) entry2.getKey()).a("MRNLaunchDownloadCost", ((Integer) entry2.getValue()).intValue());
            }
            com.meituan.android.mrn.monitor.g.a().a("biz", SelectPhotoUtil.ALL_ID).a("MRNLaunchDownloadCost", i2);
            this.n = null;
        }
    }
}
