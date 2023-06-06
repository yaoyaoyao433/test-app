package com.meituan.android.loader.impl.control;

import android.support.annotation.Nullable;
import com.meituan.android.loader.impl.DynFile;
import com.meituan.android.loader.impl.f;
import com.meituan.android.loader.impl.h;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.d;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final b b;
    Map<String, DynFile> c;

    public d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a2e4c169891ead9c4372d244a2a2bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a2e4c169891ead9c4372d244a2a2bf");
        } else {
            this.b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, DynFile> a(Map<String, DynFile> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2c5febbe5c49f011cae3cc7834d2bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2c5febbe5c49f011cae3cc7834d2bd");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, DynFile> entry : (this.b.e ? map : this.c).entrySet()) {
            String key = entry.getKey();
            DynFile value = entry.getValue();
            if (!value.isInnerSo()) {
                boolean a2 = this.b.a(value, value.getBundleVersion());
                boolean containsKey = map.containsKey(key);
                if (!a2) {
                    if (containsKey) {
                        hashMap.put(key, value);
                    }
                    StringBuilder sb = new StringBuilder(">>>DynLoader ");
                    sb.append(this.b.e ? "" : "覆盖安装");
                    sb.append(" 静态版本复用检查-不可复用: ");
                    sb.append(value.getBundleName());
                    sb.append(", reason: ");
                    sb.append(this.b.d);
                    f.d(sb.toString());
                    h.a().a(value.getBundleName(), "static", this.b.c.type, this.b.d, !this.b.e);
                } else {
                    StringBuilder sb2 = new StringBuilder(">>>DynLoader ");
                    sb2.append(this.b.e ? "" : "覆盖安装");
                    sb2.append(" 静态版本复用检查-可复用: ");
                    sb2.append(value.getBundleName());
                    f.d(sb2.toString());
                    h.a().a(value.getBundleName(), "static", this.b.c.type);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ResourceNameVersion> b(Map<String, DynFile> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b98349872f32142c8b74baa340070a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b98349872f32142c8b74baa340070a");
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, DynFile> entry : map.entrySet()) {
            DynFile value = entry.getValue();
            if (value != null) {
                arrayList.add(new ResourceNameVersion.Builder().name(entry.getKey()).version(value.getBundleVersion()).build());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> a(final Map<String, DynFile> map, List<ResourceNameVersion> list) {
        Object[] objArr = {map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce81c5464b08133785f4098bed5c274", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce81c5464b08133785f4098bed5c274");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        f.d(">>>Dynloader blockingFetchResources start, " + list);
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final HashSet hashSet = new HashSet();
        com.meituan.met.mercury.load.core.d a2 = g.a("dynloader");
        if (com.meituan.android.loader.impl.utils.a.b) {
            a2.c = true;
        }
        DDLoadParams dDLoadParams = new DDLoadParams(1);
        k kVar = new k() { // from class: com.meituan.android.loader.impl.control.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.met.mercury.load.core.k
            public final void onSuccess(@Nullable DDResource dDResource) {
                Object[] objArr2 = {dDResource};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c3eb6b75bc65b27c5f2c6da849e4666", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c3eb6b75bc65b27c5f2c6da849e4666");
                    return;
                }
                d.this.a(map, dDResource, hashSet);
                countDownLatch.countDown();
            }

            @Override // com.meituan.met.mercury.load.core.k
            public final void onFail(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdb0a1004bcc09138f1346cccd540aa1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdb0a1004bcc09138f1346cccd540aa1");
                    return;
                }
                d.this.b.a(map, hashSet, exc, 1);
                countDownLatch.countDown();
            }
        };
        Object[] objArr2 = {list, dDLoadParams, kVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.core.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6c106362ad5b73a8091c4d7ca1386ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6c106362ad5b73a8091c4d7ca1386ffd");
        } else if (list == null || list.isEmpty()) {
            kVar.onFail(new com.meituan.met.mercury.load.core.f((short) 1, "resourceNameVersions should not be empty"));
        } else {
            d.a aVar = new d.a(a2, DDLoadStrategy.SPECIFIED, list, kVar);
            m a3 = m.a();
            com.meituan.met.mercury.load.repository.b bVar = new com.meituan.met.mercury.load.repository.b(a2.b, DDLoadStrategy.SPECIFIED, dDLoadParams, list, aVar);
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "be92b6a1b434923d2235b9c96ed26b9f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "be92b6a1b434923d2235b9c96ed26b9f");
            } else {
                m.b.execute(new m.b(bVar));
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f.a("GeneralControllerV2 update", "blockingFetchResources end");
        return hashSet;
    }

    synchronized void a(Map<String, DynFile> map, DDResource dDResource, Set<String> set) {
        Object[] objArr = {map, dDResource, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60743b25da5cb4f888dacdbcacbc8dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60743b25da5cb4f888dacdbcacbc8dbc");
        } else if (dDResource == null) {
            h.a().a((DynFile) null, "DynLoaderDownloadSuccess");
        } else {
            f.d(">>>Dynloader blockingFetchResources success," + dDResource.getName());
            DynFile dynFile = map.get(dDResource.getName());
            dynFile.updateStaticFile(dDResource);
            String b = com.meituan.android.loader.impl.b.b(com.meituan.android.loader.impl.a.e);
            h a2 = h.a();
            h a3 = h.a();
            a3.getClass();
            h.a a4 = new h.a().a(dynFile, "DynLoaderDownloadSuccess");
            a4.d = this.b.d;
            a4.f = this.b.c.type;
            a4.e = b;
            a2.a(a4);
            this.b.a(map, dDResource, set);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<DynFile> a(Map<String, DynFile> map, Set<String> set) {
        Object[] objArr = {map, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "251190862210ce0bfb3a85789be513b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "251190862210ce0bfb3a85789be513b7");
        }
        HashSet hashSet = new HashSet();
        if (map == null || set == null || map.size() == 0 || set.size() == 0) {
            return hashSet;
        }
        for (String str : set) {
            DynFile dynFile = map.get(str);
            if (dynFile != null) {
                hashSet.add(dynFile);
            }
        }
        return hashSet;
    }
}
