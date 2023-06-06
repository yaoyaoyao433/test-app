package com.meituan.android.loader.impl.control;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.loader.impl.DynFile;
import com.meituan.android.loader.impl.f;
import com.meituan.android.loader.impl.h;
import com.meituan.android.loader.impl.j;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    final b b;
    Map<String, DynFile> c;
    @Nullable
    Map<String, DynFile> d;

    public c(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0bc1c3a3abc2958e2acc68f0489041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0bc1c3a3abc2958e2acc68f0489041");
        } else {
            this.b = bVar;
        }
    }

    public final Map<String, DynFile> a(Map<String, DynFile> map, @Nullable Map<String, DynFile> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a025063ff209a3c0183e27710700ff10", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a025063ff209a3c0183e27710700ff10");
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        this.c = map;
        this.d = map2;
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        Object[] objArr2 = {hashMap, hashMap2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8f0a5da7a6c929a0223fcdf4b2d0171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8f0a5da7a6c929a0223fcdf4b2d0171");
        } else {
            com.meituan.met.mercury.load.core.d a2 = g.a("dynloader");
            if (com.meituan.android.loader.impl.utils.a.b) {
                a2.c = true;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            f.d(">>>DynLoader blockingGetHotFixVersion start");
            final a aVar = new a(this.c);
            a2.b(new n() { // from class: com.meituan.android.loader.impl.control.c.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x01f2  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01e4 A[SYNTHETIC] */
                @Override // com.meituan.met.mercury.load.core.n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(@android.support.annotation.Nullable java.util.List<com.meituan.met.mercury.load.core.DDResource> r20) {
                    /*
                        Method dump skipped, instructions count: 667
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.loader.impl.control.c.AnonymousClass1.onSuccess(java.util.List):void");
                }

                @Override // com.meituan.met.mercury.load.core.n
                public final void onFail(Exception exc) {
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fef4da494e6633fec93a2fd758e1c55b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fef4da494e6633fec93a2fd758e1c55b");
                        return;
                    }
                    f.d(">>>Dynloader blockingGetHotFixVersion failed, " + exc.toString());
                    if ((exc instanceof com.meituan.met.mercury.load.core.f) && ((com.meituan.met.mercury.load.core.f) exc).c == 10) {
                        aVar.a();
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f.d(">>>DynLoader blockingGetHotFixVersion end");
        }
        Set<String> a3 = a(hashMap2);
        HashMap hashMap3 = new HashMap();
        for (Map.Entry<String, DynFile> entry : map2.entrySet()) {
            if (!entry.getValue().isInnerSo() && (!hashMap.containsKey(entry.getKey()) || (a3 != null && a3.contains(entry.getKey())))) {
                hashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap3;
    }

    private Set<String> a(final Map<String, DynFile> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828654d0a5381eab15279b364b098613", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828654d0a5381eab15279b364b098613");
        }
        if (map.isEmpty()) {
            return null;
        }
        Set<String> keySet = map.keySet();
        f.a("GeneralControllerV2 update", "blockingLoadResources start, " + keySet);
        final CountDownLatch countDownLatch = new CountDownLatch(keySet.size());
        final HashSet hashSet = new HashSet();
        com.meituan.met.mercury.load.core.d a2 = g.a("dynloader");
        if (com.meituan.android.loader.impl.utils.a.b) {
            a2.c = true;
        }
        a2.a(keySet, DDLoadStrategy.NET_ONLY, new k() { // from class: com.meituan.android.loader.impl.control.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.met.mercury.load.core.k
            public final void onSuccess(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07c829d0d509ee97c93293c36c8c9985", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07c829d0d509ee97c93293c36c8c9985");
                    return;
                }
                c.this.a(map, dDResource, hashSet);
                countDownLatch.countDown();
            }

            @Override // com.meituan.met.mercury.load.core.k
            public final void onFail(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e41548aec4c7ea7e207fa0ca173aac55", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e41548aec4c7ea7e207fa0ca173aac55");
                    return;
                }
                c.this.b.a(map, hashSet, exc, 2);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            f.d("latch timeout");
            e.printStackTrace();
        }
        f.a("GeneralControllerV2 update", "blockingLoadResources end");
        return hashSet;
    }

    synchronized void a(Map<String, DynFile> map, DDResource dDResource, Set<String> set) {
        Object[] objArr = {map, dDResource, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b97fb0404ef8e37d8bff7761f14a1036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b97fb0404ef8e37d8bff7761f14a1036");
        } else if (dDResource == null) {
            h.a().a((DynFile) null, "DynLoaderHotFixDownloadSuccess");
        } else {
            f.a(">>>Dynloader blockingLoadResources success", dDResource.getName());
            DynFile dynFile = map.get(dDResource.getName());
            if (dynFile != null) {
                dynFile.updateHotFix(dDResource);
            }
            h.a().a(dynFile, "DynLoaderHotFixDownloadSuccess");
            this.b.a(map, dDResource, set);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect a;
        public Map<String, DynFile> b;

        public a(Map<String, DynFile> map) {
            Object[] objArr = {c.this, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54501590d9029313859e9be5f0f6600b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54501590d9029313859e9be5f0f6600b");
            } else {
                this.b = new HashMap(map);
            }
        }

        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f53ec096e2888dfc13c90ac9b2ee77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f53ec096e2888dfc13c90ac9b2ee77");
            } else if (c.this.b.c.shouldDownloadAllInnerHotfix) {
                this.b.remove(str);
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f50e3df8defb4dccdbaa9fc230594800", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f50e3df8defb4dccdbaa9fc230594800");
            } else if (c.this.b.c.shouldDownloadAllInnerHotfix) {
                b bVar = c.this.b;
                Collection<DynFile> values = this.b.values();
                Object[] objArr2 = {values};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c8e64c54330c77e3f5083a1c23bdbb5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c8e64c54330c77e3f5083a1c23bdbb5c");
                    return;
                }
                for (DynFile dynFile : values) {
                    if (dynFile.isInnerSo() && !TextUtils.isEmpty(dynFile.getLocalPath())) {
                        j.a(dynFile.getLocalPath());
                        if (bVar.b != null) {
                            bVar.b.remove(dynFile);
                        }
                        f.d("远端无版本，删除内置so的已下载的热更, bundleName:" + dynFile.getBundleName() + ",path: " + dynFile.getLocalPath());
                    }
                }
            }
        }
    }
}
