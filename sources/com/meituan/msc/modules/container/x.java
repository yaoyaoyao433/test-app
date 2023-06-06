package com.meituan.msc.modules.container;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.msc.common.utils.ak;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.f;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.PackagePreLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.k;
import com.meituan.msc.modules.update.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x implements Runnable {
    public static ChangeQuickRedirect a;
    private final String b;
    private final WeakReference<l> c;
    private final WeakReference<com.meituan.msc.modules.engine.h> d;

    public x(l lVar, com.meituan.msc.modules.engine.h hVar, String str) {
        Object[] objArr = {lVar, hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9e3255c2675bad53f62c915b8dc216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9e3255c2675bad53f62c915b8dc216");
            return;
        }
        this.c = new WeakReference<>(lVar);
        this.d = new WeakReference<>(hVar);
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.meituan.msc.modules.engine.h hVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfecd99b8794f01bf6a1b4a655a5c030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfecd99b8794f01bf6a1b4a655a5c030");
            return;
        }
        l lVar = this.c.get();
        if (lVar == null || (hVar = this.d.get()) == null) {
            com.meituan.msc.modules.reporter.g.d("PreloadTaskAfterPageFP", "containerDelegate or runtime is null");
        } else if (lVar.M() || lVar.L()) {
            com.meituan.msc.modules.reporter.g.d("PreloadTaskAfterPageFP", "containerDelegate finishing or destroyed");
        } else {
            com.meituan.msc.modules.reporter.g.d("PreloadTaskAfterPageFP", "prefetch sub package after first render");
            final com.meituan.msc.modules.update.pkg.e a2 = com.meituan.msc.modules.update.pkg.e.a();
            final String str = this.b;
            Object[] objArr2 = {hVar, str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.pkg.e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "598705cb5be5aaaf189c64d462afc83e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "598705cb5be5aaaf189c64d462afc83e");
            } else {
                com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.update.pkg.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Map<String, m> map;
                        HashMap hashMap;
                        boolean z;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa00e71901856dacd021721d99a40c8a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa00e71901856dacd021721d99a40c8a");
                            return;
                        }
                        AppMetaInfoWrapper appMetaInfoWrapper = hVar.r.h;
                        if (appMetaInfoWrapper == null) {
                            g.d("PrefetchPackageManager", "prefetchSubPackage metaInfo null");
                            return;
                        }
                        com.meituan.msc.modules.update.a aVar = hVar.s;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "d1754e35ee64d5296acb2efbce89405d", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "d1754e35ee64d5296acb2efbce89405d");
                        } else {
                            if (aVar.f == null) {
                                JSONObject optJSONObject = aVar.b.optJSONObject("preloadRule");
                                Object[] objArr5 = {optJSONObject};
                                ChangeQuickRedirect changeQuickRedirect5 = m.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ef1539387a7042773f3b2630ae81e823", RobustBitConfig.DEFAULT_VALUE)) {
                                    hashMap = (HashMap) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ef1539387a7042773f3b2630ae81e823");
                                } else {
                                    HashMap hashMap2 = new HashMap();
                                    if (optJSONObject != null) {
                                        Iterator<String> keys = optJSONObject.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                                            if (optJSONObject2 != null) {
                                                m mVar = new m();
                                                mVar.b = optJSONObject2.optString("network", "wifi");
                                                JSONArray optJSONArray = optJSONObject2.optJSONArray("packages");
                                                if (optJSONArray != null && optJSONArray.length() > 0) {
                                                    ArrayList<String> arrayList = new ArrayList<>();
                                                    int length = optJSONArray.length();
                                                    for (int i = 0; i < length; i++) {
                                                        String optString = optJSONArray.optString(i);
                                                        if (!TextUtils.isEmpty(optString)) {
                                                            arrayList.add(optString);
                                                        }
                                                    }
                                                    mVar.c = arrayList;
                                                }
                                                hashMap2.put(next, mVar);
                                            }
                                        }
                                    }
                                    hashMap = hashMap2;
                                }
                                aVar.f = hashMap;
                            }
                            map = aVar.f;
                        }
                        m mVar2 = map.get(am.b(str));
                        if (mVar2 != null && !f.a((List) mVar2.c)) {
                            Context context = MSCEnvHelper.getContext();
                            Object[] objArr6 = {context, mVar2};
                            ChangeQuickRedirect changeQuickRedirect6 = m.a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "f332c5ab16e8ba05033e163efbfdabbf", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "f332c5ab16e8ba05033e163efbfdabbf")).booleanValue();
                            } else if (context == null || mVar2 == null) {
                                z = false;
                            } else {
                                z = TextUtils.equals("all", mVar2.b) ? true : ak.a(context);
                            }
                            if (z) {
                                Iterator<String> it = mVar2.c.iterator();
                                while (it.hasNext()) {
                                    final String next2 = it.next();
                                    final PackageInfoWrapper subPackageByName = appMetaInfoWrapper.getSubPackageByName(next2);
                                    if (subPackageByName == null) {
                                        g.d("PrefetchPackageManager", "prefetchSubPackage packageInfo null", next2);
                                    } else {
                                        d.a().a(hVar.o, subPackageByName, new b<PackageInfoWrapper>() { // from class: com.meituan.msc.modules.update.pkg.e.1.1
                                            public static ChangeQuickRedirect a;

                                            {
                                                AnonymousClass1.this = this;
                                            }

                                            @Override // com.meituan.msc.modules.update.pkg.b
                                            public final /* synthetic */ void a(@NonNull PackageInfoWrapper packageInfoWrapper) {
                                                PackageInfoWrapper packageInfoWrapper2 = packageInfoWrapper;
                                                Object[] objArr7 = {packageInfoWrapper2};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5d11eda60fed730faa978b53b24756b6", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5d11eda60fed730faa978b53b24756b6");
                                                    return;
                                                }
                                                g.d("PrefetchPackageManager", "prefetchSubPackage succeed", packageInfoWrapper2);
                                                e.a(packageInfoWrapper2.appId, packageInfoWrapper2);
                                                hVar.G.a(packageInfoWrapper2);
                                                PackagePreLoadReporter b = PackagePreLoadReporter.b();
                                                k.a aVar2 = new k.a();
                                                aVar2.b = hVar.a();
                                                aVar2.d = "predownload";
                                                aVar2.c = hVar.r.y();
                                                aVar2.e = packageInfoWrapper2.isFromNet() ? "network" : PackageLoadReporter.LoadType.LOCAL;
                                                aVar2.g = subPackageByName.getPkgTypeString();
                                                aVar2.f = next2;
                                                b.a(aVar2.a());
                                            }

                                            @Override // com.meituan.msc.modules.update.pkg.b
                                            public final void a(String str2, Exception exc) {
                                                Object[] objArr7 = {str2, exc};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b2535ef7c5c7aaabc0258321f5acf921", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b2535ef7c5c7aaabc0258321f5acf921");
                                                    return;
                                                }
                                                g.b("PrefetchPackageManager", exc, "prefetchSubPackage failed", str2);
                                                PackagePreLoadReporter b = PackagePreLoadReporter.b();
                                                k.a aVar2 = new k.a();
                                                aVar2.b = hVar.a();
                                                aVar2.d = "predownload";
                                                aVar2.c = hVar.r.y();
                                                aVar2.g = subPackageByName.getPkgTypeString();
                                                b.a(aVar2.a(), exc);
                                            }
                                        });
                                    }
                                }
                                return;
                            }
                        }
                        g.d("PrefetchPackageManager", "cant prefetch sub package");
                    }
                });
            }
            if (lVar.K()) {
                if (!com.meituan.msc.common.utils.n.a(hVar, hVar.r.f())) {
                    com.meituan.msc.modules.reporter.g.d("PreloadTaskAfterPageFP", "root path is not webview render, don't cache next page");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d("PreloadTaskAfterPageFP", hVar.a(), "cache one page after first render");
                ((com.meituan.msc.modules.engine.c) hVar.c(com.meituan.msc.modules.engine.c.class)).a(lVar.C(), this.b);
            }
        }
    }
}
