package com.meituan.mmp.lib.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final m b;
    public final com.meituan.mmp.lib.config.a c;
    volatile boolean d;
    com.meituan.mmp.lib.web.f e;
    public volatile boolean f;
    final List<AppPage> g;
    final List<Integer> h;
    private boolean i;

    public d(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b1868abc28f45831f49d5a160e5891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b1868abc28f45831f49d5a160e5891");
            return;
        }
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.b = mVar;
        this.c = mVar.d;
    }

    @NonNull
    public final AppPage a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5985c218dddad2e24d3937cfd1291825", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5985c218dddad2e24d3937cfd1291825");
        }
        this.i = true;
        AppPage a2 = a(str);
        if (a2 != null) {
            this.g.remove(a2);
            if (!a2.g) {
                bb.b("从复用池取出AppPage: 剩余" + this.g.size() + ", path: " + a2.d() + ", 资源：" + com.meituan.mmp.lib.utils.h.a(a2.p), new Object[0]);
            } else {
                bb.b("复用池中的AppPage已经发生RenderProcessGone，新建", new Object[0]);
                a2 = new AppPage(context, this.b, this.c);
            }
            b();
            return a2;
        }
        bb.b("复用池中未找到合适的AppPage，新建", new Object[0]);
        return new AppPage(context, this.b, this.c);
    }

    public final AppPage a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86f691b16206b2fdf593b963e6402d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86f691b16206b2fdf593b963e6402d0");
        }
        AppPage a2 = a(str, true, false, false);
        if (a2 != null) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "find AppPage that current page matched: " + str);
            return a2;
        }
        AppPage a3 = a(str, false, true, false);
        if (a3 != null) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "find AppPage that loaded resource: " + str);
            return a3;
        }
        AppPage a4 = a(str, false, false, true);
        if (a4 != null) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "find AppPage that will load resource: " + str);
            return a4;
        }
        return c();
    }

    private AppPage a(@NonNull String str, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "000e77b49354cf8b98a1f05b4ffa0847", RobustBitConfig.DEFAULT_VALUE) ? (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "000e77b49354cf8b98a1f05b4ffa0847") : a(str, z, z2, z3, false);
    }

    private AppPage c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd723c4c2cc1d51b9474d6625656369f", RobustBitConfig.DEFAULT_VALUE) ? (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd723c4c2cc1d51b9474d6625656369f") : a(null, false, false, false, true);
    }

    private AppPage a(@Nullable String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b13d5d4ce090284e58212f4fc30468", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b13d5d4ce090284e58212f4fc30468");
        }
        List<AppPage> a2 = a(true, str, z, z2, z3, z4);
        if (a2.isEmpty()) {
            return null;
        }
        return a2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.mmp.lib.engine.AppPage> a(boolean r20, @android.support.annotation.Nullable java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.engine.d.a(boolean, java.lang.String, boolean, boolean, boolean, boolean):java.util.List");
    }

    public final AppPage a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436c14a8a9fb3ee2146370fe3518b61e", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436c14a8a9fb3ee2146370fe3518b61e");
        }
        AppPage appPage = new AppPage(context, this.b, this.c);
        this.b.g.a(appPage.j());
        a(appPage.j());
        if (!this.i) {
            appPage.j = this.e;
        }
        a(appPage);
        return appPage;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca47c90807741b2a5541b1558c529cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca47c90807741b2a5541b1558c529cf7");
        } else if (o.e(this.b.b)) {
            com.meituan.mmp.lib.trace.b.a("AppPageManager", "cachePreloadPageViewId", this.b.b, Integer.valueOf(i));
            this.h.add(Integer.valueOf(i));
        }
    }

    public final void a(Context context, MMPPackageInfo mMPPackageInfo, com.meituan.mmp.lib.trace.h hVar, final v vVar) {
        Object[] objArr = {context, mMPPackageInfo, hVar, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a644fc77a2ae410c27a99ad062403d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a644fc77a2ae410c27a99ad062403d8a");
        } else if (!this.f && MMPHornPreloadConfig.a().d.enableBlankPagePreload) {
            if (c() != null) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "already have reusable WebView in pool, cancel preload package");
                return;
            }
            final AppPage a2 = a(context);
            ab.a("preloadPagePackage: " + mMPPackageInfo.h + " - " + mMPPackageInfo.g);
            a2.j = new com.meituan.mmp.lib.web.f() { // from class: com.meituan.mmp.lib.engine.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.web.f
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c258420d9d8080c43846f9ae29663026", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c258420d9d8080c43846f9ae29663026");
                        return;
                    }
                    if (vVar != null) {
                        vVar.a(exc);
                    }
                    d.this.b(a2);
                }
            };
            a2.a(hVar);
            a2.a(mMPPackageInfo, new v() { // from class: com.meituan.mmp.lib.engine.d.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    String str2 = str;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5644dc41e1eff944b74057270677408d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5644dc41e1eff944b74057270677408d");
                    } else if (vVar != null) {
                        vVar.onReceiveValue(str2);
                    }
                }

                @Override // com.meituan.mmp.lib.engine.v
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac5ee3bcdf65f0e799af8f022f71e1e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac5ee3bcdf65f0e799af8f022f71e1e5");
                        return;
                    }
                    if (vVar != null) {
                        vVar.a(exc);
                    }
                    d.this.b(a2);
                }
            });
            ab.a();
        }
    }

    public final void a(Context context, com.meituan.mmp.lib.trace.h hVar, v vVar) {
        Object[] objArr = {context, hVar, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec849518f01d43bfaf2b3e0aa16c2abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec849518f01d43bfaf2b3e0aa16c2abb");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppPageManager", "preloadDefaultResources");
        a(context, this.c.n("/"), hVar, vVar);
    }

    public void a(Context context, @Nullable List<String> list, com.meituan.mmp.lib.trace.h hVar, final v vVar) {
        int i = 0;
        Object[] objArr = {context, list, hVar, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe66bb466109bebddb015f35ce472100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe66bb466109bebddb015f35ce472100");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppPageManager", "preloadResources: " + com.meituan.mmp.lib.utils.h.a((Collection) list));
        if (this.f) {
            return;
        }
        if (!MMPHornPreloadConfig.a().d.enableBlankPagePreload) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "page resource preload disabled by config");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            List<AppPage> a2 = a(false, it.next(), true, true, true, false);
            if (!a2.isEmpty()) {
                it.remove();
                for (AppPage appPage : a2) {
                    Integer num = (Integer) hashMap.get(appPage);
                    hashMap.put(appPage, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (com.meituan.mmp.lib.utils.h.a((List) list)) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "resource not requested, no need to preload resource");
            } else {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "AppPage in pool have all requested resources, no need to preload resource");
            }
        } else {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "need preload resource: " + com.meituan.mmp.lib.utils.h.a((Collection) arrayList));
            final AppPage appPage2 = null;
            for (Map.Entry entry : hashMap.entrySet()) {
                AppPage appPage3 = (AppPage) entry.getKey();
                if (!appPage3.e() && d(appPage3) && ((Integer) entry.getValue()).intValue() > i) {
                    i = ((Integer) entry.getValue()).intValue();
                    appPage2 = appPage3;
                }
            }
            if (appPage2 == null) {
                appPage2 = c();
            }
            if (appPage2 == null) {
                appPage2 = a(context);
            } else {
                this.g.remove(appPage2);
                this.g.add(appPage2);
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "preload resource to AppPage that have: " + com.meituan.mmp.lib.utils.h.a(appPage2.p) + " and will load: " + com.meituan.mmp.lib.utils.h.a(appPage2.q));
            }
            if (!this.d) {
                return;
            }
            appPage2.a(hVar);
            if (!arrayList.isEmpty()) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "preload resource to AppPage: " + com.meituan.mmp.lib.utils.h.a((Collection) arrayList));
                appPage2.a(arrayList);
                b();
            }
            appPage2.a(new v() { // from class: com.meituan.mmp.lib.engine.d.3
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    String str2 = str;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ada16d821d8cccde7ea61c66812a9040", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ada16d821d8cccde7ea61c66812a9040");
                    } else if (vVar != null) {
                        vVar.onReceiveValue(str2);
                    }
                }

                @Override // com.meituan.mmp.lib.engine.v
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb6d997aefa7eb76047579ff71489e9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb6d997aefa7eb76047579ff71489e9b");
                        return;
                    }
                    com.meituan.mmp.lib.trace.b.a("AppPage loadBasicPackages error", exc);
                    if (vVar != null) {
                        vVar.a(exc);
                    }
                    d.this.b(appPage2);
                }
            });
        }
        if (c() == null) {
            com.meituan.mmp.lib.trace.b.b("AppPageManager", "no AppPage in pool have resource space, create one");
            a(context).a((v) null);
        }
    }

    public final void a(Context context, @Nullable com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041b65940928804299b8457b9d832500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041b65940928804299b8457b9d832500");
        } else if (this.f) {
        } else {
            String i = this.c.i();
            AppPage a2 = a(i);
            if (a2 == null) {
                a2 = a(context);
            }
            if (this.d && !a2.e()) {
                a2.a(hVar);
                a2.b(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppPage appPage) {
        Object[] objArr = {appPage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19cde9f26d0d014b1df668ae119d317d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19cde9f26d0d014b1df668ae119d317d");
            return;
        }
        this.g.add(appPage);
        b();
        if (this.g.size() > com.meituan.mmp.lib.config.b.v()) {
            bb.b("复用池满，" + this.g.size() + "个，销毁最老的AppPage", new Object[0]);
            this.g.remove(0).l();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02a078a89a9aab8a396bb9b37365b847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02a078a89a9aab8a396bb9b37365b847");
            return;
        }
        for (AppPage appPage : this.g) {
            appPage.l();
        }
        this.g.clear();
    }

    public final void b(AppPage appPage) {
        Object[] objArr = {appPage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a19ac918bab6f91e05475b5dd5d517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a19ac918bab6f91e05475b5dd5d517");
            return;
        }
        this.g.remove(appPage);
        appPage.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec569ea5b768b0c3afac8d272a4d103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec569ea5b768b0c3afac8d272a4d103");
        } else if (DebugHelper.b()) {
            String str = "pool: \n";
            if (this.g.isEmpty()) {
                str = "pool: \nempty";
            } else {
                for (AppPage appPage : this.g) {
                    if (appPage.d() != null) {
                        str = str + "current: " + appPage.d() + ", ";
                    }
                    str = ((str + (appPage.p.size() + appPage.q.size()) + " resources, ") + com.meituan.mmp.lib.utils.h.a(appPage.p) + " + " + com.meituan.mmp.lib.utils.h.a(appPage.q)) + "\n";
                }
            }
            com.meituan.mmp.lib.trace.b.a("AppPageManager", str);
        }
    }

    private boolean a(AppPage appPage, View view) {
        Object[] objArr = {appPage, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accd1cadbc42d56f8c96117feffe264a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accd1cadbc42d56f8c96117feffe264a")).booleanValue();
        }
        if (appPage != null && com.meituan.mmp.lib.config.f.a(appPage.c(), view)) {
            appPage.l();
            b.a.a("releaseAppPageIfWebViewCrashed appPage: " + appPage + ", view: " + view);
            return true;
        }
        return false;
    }

    @SuppressLint({"Iterator"})
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b166ce1418f0fbd2cc8f8dcf10a040b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b166ce1418f0fbd2cc8f8dcf10a040b");
            return;
        }
        for (AppPage appPage : this.g) {
            if (a(appPage, view)) {
                this.g.remove(appPage);
            }
        }
    }

    private boolean c(AppPage appPage) {
        Object[] objArr = {appPage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9059ad0e49bce9c3c4e33a7f94dd3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9059ad0e49bce9c3c4e33a7f94dd3e")).booleanValue();
        }
        for (MMPPackageInfo mMPPackageInfo : appPage.o) {
            if (mMPPackageInfo != null && "mmp_sdk".equals(mMPPackageInfo.g) && !mMPPackageInfo.f.equals(this.b.d.l.mmpSdk.f)) {
                com.meituan.mmp.lib.trace.b.b("AppPageManager", "verifyLoadedPackage, loaded package does not match current version, destory appPage");
                b(appPage);
                return false;
            }
        }
        return true;
    }

    private boolean d(@NonNull AppPage appPage) {
        Object[] objArr = {appPage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d2e9acbc0a8621753a1bffc18c0978", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d2e9acbc0a8621753a1bffc18c0978")).booleanValue() : appPage.p.size() + appPage.q.size() < com.meituan.mmp.lib.config.b.w();
    }
}
