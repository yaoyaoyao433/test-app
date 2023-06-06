package com.meituan.met.mercury.load.core;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.met.mercury.load.bean.BaseResponse;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.CheckListData;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.repository.CheckResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class p {
    public static ChangeQuickRedirect a;
    private static final ScheduledExecutorService b = com.meituan.met.mercury.load.utils.g.a("NM", 2);
    private static volatile p c;

    public static p a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e086ce82894ac386e217057fd94a53", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e086ce82894ac386e217057fd94a53");
        }
        if (c == null) {
            synchronized (p.class) {
                if (c == null) {
                    c = new p();
                }
            }
        }
        return c;
    }

    public final void a(CheckResourceRequest checkResourceRequest) {
        Object[] objArr = {checkResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa7253678553ddb6b93916240a2de89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa7253678553ddb6b93916240a2de89");
        } else {
            b.execute(new a(checkResourceRequest));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends i {
        public static ChangeQuickRedirect a;
        private CheckResourceRequest b;
        private Call<BaseResponse<CheckListData>> c;
        private Set<String> e;

        public a(CheckResourceRequest checkResourceRequest) {
            super(checkResourceRequest);
            Object[] objArr = {checkResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0caea838036ae79a6dda150064180a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0caea838036ae79a6dda150064180a");
                return;
            }
            this.b = checkResourceRequest;
            this.e = Collections.synchronizedSet(checkResourceRequest.getRequestResources());
        }

        public final void a(List<DDResource> list, boolean z) {
            Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d8251891c12106d99ee792d14c3720", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d8251891c12106d99ee792d14c3720");
                return;
            }
            if (this.b.getLoadCallback() != null) {
                this.b.getLoadCallback().onSuccess(list);
            }
            if (z || this.e.isEmpty()) {
                return;
            }
            for (DDResource dDResource : list) {
                if (dDResource != null) {
                    this.e.remove(dDResource.getName());
                }
            }
        }

        public final void a(f fVar, boolean z) {
            Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94becd262e5d9e2a6b8df0581706c5c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94becd262e5d9e2a6b8df0581706c5c4");
                return;
            }
            if (this.b.getLoadCallback() != null) {
                this.b.getLoadCallback().onFail(fVar);
            }
            if (z || this.e.isEmpty()) {
                return;
            }
            this.e.remove(fVar.d);
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            f fVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec423c81384d4a6c169faa3072367ddc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec423c81384d4a6c169faa3072367ddc");
            } else if (this.b.getStrategy() == DDLoadStrategy.PRELOAD_META) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e310eb90ab958791cd807d1af393f49a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e310eb90ab958791cd807d1af393f49a");
                    return;
                }
                try {
                    CheckListData a2 = a(this.b.requestResources);
                    if (a2 == null) {
                        a(new f((short) 2, "CheckListMetaRunable server response not valid"), true);
                        return;
                    }
                    com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).a(a2.bundles);
                    com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).b(a2.bundlesToDel);
                    if (this.b.requestResources == null || this.b.requestResources.size() <= 0) {
                        com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).a();
                    }
                    List<BundleData> b = com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).b();
                    if (com.meituan.met.mercury.load.utils.d.a(b)) {
                        a(new f((short) 10, "CheckListMetaRunable server response not valid"), true);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (BundleData bundleData : b) {
                        if (bundleData != null && (this.b.requestResources == null || this.b.requestResources.size() <= 0 || this.b.requestResources.contains(bundleData.bundleName))) {
                            DDResource.a aVar = new DDResource.a();
                            aVar.b = this.b.getBusiness();
                            aVar.c = bundleData.bundleName;
                            aVar.d = bundleData.getBundleVersion();
                            aVar.e = bundleData.md5;
                            aVar.f = bundleData.tags;
                            aVar.m = bundleData.getOriginMd5();
                            arrayList.add(aVar.a());
                        }
                    }
                    a((List<DDResource>) arrayList, true);
                } catch (Exception e) {
                    if (e instanceof f) {
                        fVar = (f) e;
                    } else {
                        fVar = new f((short) -1, "exception:" + e.toString());
                    }
                    a(fVar, true);
                }
            } else if (this.b.getStrategy() == DDLoadStrategy.CACHEMETA_OR_NET) {
                b();
            } else {
                a(new f((short) 1, "DDLoadStrategy Params Is Error"), true);
            }
        }

        private void b() {
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5979756a2a57577af4940d0818630131", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5979756a2a57577af4940d0818630131");
                return;
            }
            try {
                if (this.b.getParams().metaCacheDuration < 300) {
                    this.b.getParams().metaCacheDuration = 300L;
                }
                HashSet<String> hashSet = new HashSet(this.b.requestResources);
                HashSet<String> hashSet2 = new HashSet(hashSet);
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = hashSet.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    BundleData b = com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).b(next);
                    if (b != null && System.currentTimeMillis() - b.producedTimeMillis < this.b.getParams().metaCacheDuration * 1000) {
                        arrayList.add(b);
                        hashSet2.remove(next);
                        it.remove();
                    }
                }
                if (!com.meituan.met.mercury.load.utils.d.a(arrayList)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((BundleData) it2.next(), true);
                    }
                }
                if (hashSet.size() > 0) {
                    CheckListData a2 = a(hashSet);
                    if (a2 == null) {
                        for (String str : hashSet) {
                            a(new f((short) 2, "CheckListMetaRunable server response not valid", str), false);
                        }
                        return;
                    }
                    if (!com.meituan.met.mercury.load.utils.d.a(a2.bundles)) {
                        for (BundleData bundleData : a2.bundles) {
                            if (bundleData != null) {
                                hashSet2.remove(bundleData.bundleName);
                                a(bundleData, false);
                            }
                        }
                    }
                    if (hashSet2.size() > 0) {
                        for (String str2 : hashSet2) {
                            a(new f((short) 10, "CheckListMetaRunable server response not valid", str2), false);
                        }
                    }
                    com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).a(a2.bundles);
                    com.meituan.met.mercury.load.core.a.a(this.b.getBusiness()).b(a2.bundlesToDel);
                    r.a(this.b.getBusiness()).a(a2.bundlesToDel, 10);
                }
            } catch (Exception e) {
                for (String str3 : this.e) {
                    String str4 = "CheckListRunnable unknown exception:" + e.toString();
                    if (e instanceof f) {
                        f fVar = (f) e;
                        i = fVar.c;
                        if (!TextUtils.isEmpty(fVar.getMessage())) {
                            str4 = fVar.getMessage();
                        }
                    } else {
                        i = -1;
                    }
                    a(new f((short) i, str4, str3), false);
                }
            }
        }

        private CheckListData a(Set<String> set) {
            Object[] objArr = {set};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa0db25ac18a1d6ed618310b3336c91", RobustBitConfig.DEFAULT_VALUE)) {
                return (CheckListData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa0db25ac18a1d6ed618310b3336c91");
            }
            this.c = com.meituan.met.mercury.load.retrofit.b.a().a(this.b.getBusiness(), set, m.b(this.b.getBusiness(), null), this.b.getParams());
            try {
                Response<BaseResponse<CheckListData>> a2 = this.c.a();
                com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("CheckListMetaRunable response");
                bVar.a(ShieldMonitorKey.TAG_BUSINESS, this.b.getBusiness());
                bVar.a("strategy", this.b.getStrategy());
                if (a2 != null && a2.e() != null && a2.e().data != null) {
                    CheckListData checkListData = a2.e().data;
                    bVar.a("resultData", checkListData);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    return checkListData;
                }
                bVar.b = "CheckListRunnable response server response not valid";
                com.meituan.met.mercury.load.utils.c.a(bVar);
                return null;
            } catch (Exception e) {
                if (e instanceof SocketTimeoutException) {
                    throw new f((short) 6, "CheckListMetaRunable socket timeout exception");
                }
                throw new f((short) 5, "CheckListMetaRunable fail:" + e.toString());
            }
        }

        private void a(final BundleData bundleData, final boolean z) {
            DDResource b;
            Object[] objArr = {bundleData, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2daa96a8b0e0854a5cc28eca7ee224e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2daa96a8b0e0854a5cc28eca7ee224e7");
            } else if (bundleData != null && (b = r.a(this.b.getBusiness()).b(bundleData.md5)) != null && TextUtils.equals(b.getName(), bundleData.bundleName) && TextUtils.equals(b.getVersion(), bundleData.getBundleVersion())) {
                b.setHitMetaCache(z);
                b.refreshLastUseMillis();
                b.setIsNewest(1);
                b.setFromNet(false);
                a(Arrays.asList(b), false);
                r.a(this.b.getBusiness()).a(b);
            } else {
                com.meituan.met.mercury.load.download.c.a(this.b.getBusiness()).a(this.b.getBusiness(), bundleData, new k() { // from class: com.meituan.met.mercury.load.core.p.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onSuccess(@Nullable DDResource dDResource) {
                        Object[] objArr2 = {dDResource};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3232c1909d11f9ff678e1b7a9ead68cd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3232c1909d11f9ff678e1b7a9ead68cd");
                            return;
                        }
                        dDResource.setHitMetaCache(z);
                        dDResource.refreshLastUseMillis();
                        dDResource.setIsNewest(1);
                        a.this.a(Arrays.asList(dDResource), false);
                        r.a(a.this.b.getBusiness()).a(dDResource);
                    }

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onFail(Exception exc) {
                        f fVar;
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc0d2f2d8d9a671a2830f862a7cb9bfa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc0d2f2d8d9a671a2830f862a7cb9bfa");
                            return;
                        }
                        if (exc instanceof f) {
                            fVar = (f) exc;
                        } else {
                            fVar = new f((short) -1, "exception:" + exc.toString(), bundleData.bundleName);
                        }
                        if (TextUtils.isEmpty(fVar.d)) {
                            fVar.d = bundleData.bundleName;
                        }
                        a.this.a(fVar, false);
                    }
                }, this.b.getParams());
            }
        }
    }
}
