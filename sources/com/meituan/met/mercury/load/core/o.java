package com.meituan.met.mercury.load.core;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.met.mercury.load.bean.BaseResponse;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.CheckListData;
import com.meituan.met.mercury.load.bean.ResourceIdVersion;
import com.meituan.met.mercury.load.bean.ResourceNameVersion;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.repository.CheckResourceRequest;
import com.meituan.met.mercury.load.repository.FetchResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.tencent.open.SocialConstants;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class o {
    public static ChangeQuickRedirect a;
    public static final ScheduledExecutorService b = com.meituan.met.mercury.load.utils.g.a(ErrorCode.ERROR_TYPE_N, 2);
    private static volatile o c;
    private m d;

    public static /* synthetic */ void a(o oVar, n nVar, Exception exc) {
        Object[] objArr = {nVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, oVar, changeQuickRedirect, false, "005eff3386ad3340849c9ad3d6134a2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, oVar, changeQuickRedirect, false, "005eff3386ad3340849c9ad3d6134a2c");
        } else if (nVar != null) {
            nVar.onFail(exc);
        }
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cd4115b5a780dc9965f83c06ce0e71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cd4115b5a780dc9965f83c06ce0e71");
        } else {
            this.d = m.a();
        }
    }

    public static o a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd8e5e7a54fe38f3d8a1814d648737e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd8e5e7a54fe38f3d8a1814d648737e6");
        }
        if (c == null) {
            synchronized (o.class) {
                if (c == null) {
                    c = new o();
                }
            }
        }
        return c;
    }

    public final void a(CheckResourceRequest checkResourceRequest) {
        Object[] objArr = {checkResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaccadf93cb79310080e152c1476baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaccadf93cb79310080e152c1476baf");
        } else {
            b.execute(new a(checkResourceRequest));
        }
    }

    public final void a(FetchResourceRequest fetchResourceRequest) {
        Object[] objArr = {fetchResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0af243df9edd8ede1b2214f3285741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0af243df9edd8ede1b2214f3285741");
        } else {
            b.execute(new d(fetchResourceRequest));
        }
    }

    public final void a(com.meituan.met.mercury.load.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ebb2e5a520f3262a3195d69103ca81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ebb2e5a520f3262a3195d69103ca81");
        } else {
            b.execute(new c(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class d extends i {
        public static ChangeQuickRedirect a;
        protected FetchResourceRequest b;

        public d(FetchResourceRequest fetchResourceRequest) {
            super(fetchResourceRequest);
            Object[] objArr = {o.this, fetchResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e430300f4540d86988138ef9cea506a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e430300f4540d86988138ef9cea506a5");
            } else {
                this.b = fetchResourceRequest;
            }
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            Call<BaseResponse<BundleData>> bundle;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3881bc4a832ed1cb37d7d1d56e664d19", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3881bc4a832ed1cb37d7d1d56e664d19");
                return;
            }
            try {
                HashSet hashSet = new HashSet();
                hashSet.add(this.b.getResourceName());
                com.meituan.met.mercury.load.retrofit.b a2 = com.meituan.met.mercury.load.retrofit.b.a();
                String business = this.b.getBusiness();
                String resourceName = this.b.getResourceName();
                String resourceVersion = this.b.getResourceVersion();
                m unused = o.this.d;
                List<ResourceNameVersion> c = m.c(this.b.getBusiness(), hashSet);
                Object[] objArr2 = {business, resourceName, resourceVersion, c};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.retrofit.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "dc813d2066e8d9b2b80a254ddb1a3817", RobustBitConfig.DEFAULT_VALUE)) {
                    bundle = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "dc813d2066e8d9b2b80a254ddb1a3817");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("appVersion", Long.valueOf(e.e()));
                    hashMap.put("appVersionName", e.d());
                    hashMap.put("applicationId", e.g());
                    hashMap.put(DeviceInfo.USER_ID, e.i());
                    hashMap.put("UUID", e.h());
                    hashMap.put("channel", e.k());
                    hashMap.put("platform", "Android");
                    hashMap.put("sdkVersion", e.f());
                    hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, resourceName);
                    hashMap.put("bundleVersion", resourceVersion);
                    hashMap.put("localBundles", c);
                    String str = a2.a(business) + String.format("config/%s/bundle", business);
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit getBundle");
                    bVar.a("url", str).a("body", hashMap);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    bundle = a2.b.getBundle(str, hashMap);
                }
                try {
                    Response<BaseResponse<BundleData>> a3 = bundle.a();
                    com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("fetch response");
                    bVar2.a(SocialConstants.TYPE_REQUEST, this.b);
                    if (a3 != null && a3.e() != null) {
                        BundleData bundleData = a3.e().data;
                        bVar2.a("bundleData", bundleData);
                        com.meituan.met.mercury.load.utils.c.a(bVar2);
                        if (bundleData != null && !TextUtils.isEmpty(bundleData.url) && TextUtils.equals(bundleData.bundleName, this.b.getResourceName()) && TextUtils.equals(bundleData.getBundleVersion(), this.b.getResourceVersion())) {
                            DDResource b = r.a(this.b.getBusiness()).b(bundleData.md5);
                            if (b != null && TextUtils.equals(b.getName(), bundleData.bundleName) && TextUtils.equals(b.getVersion(), bundleData.getBundleVersion())) {
                                b.setFromNet(false);
                                a(this.b.getBusiness(), b);
                                return;
                            }
                            com.meituan.met.mercury.load.download.c.a(this.b.getBusiness()).a(this.b.getBusiness(), bundleData, new k() { // from class: com.meituan.met.mercury.load.core.o.d.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.met.mercury.load.core.k
                                public final void onSuccess(DDResource dDResource) {
                                    Object[] objArr3 = {dDResource};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "797ff8ef43e9cb92ad2a0765cc6bb018", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "797ff8ef43e9cb92ad2a0765cc6bb018");
                                    } else {
                                        d.this.a(d.this.b.getBusiness(), dDResource);
                                    }
                                }

                                @Override // com.meituan.met.mercury.load.core.k
                                public final void onFail(Exception exc) {
                                    Object[] objArr3 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d66c1983258d78a7f8708d4dcaa3758", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d66c1983258d78a7f8708d4dcaa3758");
                                    } else {
                                        o.a(o.this, d.this.b.getLoadCallback(), exc);
                                    }
                                }
                            }, this.b.getParams());
                            return;
                        }
                        o.a(o.this, this.b.getLoadCallback(), new f((short) 10, "fetch resource not found at server", this.b.getResourceName(), this.b.getResourceVersion()));
                        return;
                    }
                    bVar2.b = "FetchSpecifiedRunnable.getBundleCall server response not valid!";
                    com.meituan.met.mercury.load.utils.c.a(bVar2);
                    o.a(o.this, this.b.getLoadCallback(), new f((short) 2, "fetch server response not valid", this.b.getResourceName(), this.b.getResourceVersion()));
                } catch (Exception e) {
                    if (e instanceof SocketTimeoutException) {
                        throw new f((short) 6, "fetch socket timeout exception", this.b.getResourceName(), this.b.getResourceVersion());
                    }
                    throw new f((short) 5, "fetch getBundle exception:" + e.toString(), this.b.getResourceName(), this.b.getResourceVersion());
                }
            } catch (Exception e2) {
                e = e2;
                if (!(e instanceof f)) {
                    e = new f((short) -1, "fetch exception:" + e.toString(), this.b.getResourceName(), this.b.getResourceVersion());
                }
                o.a(o.this, this.b.getLoadCallback(), e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, DDResource dDResource) {
            Object[] objArr = {str, dDResource};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a0a13312e1a86ade02e057860b2a54", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a0a13312e1a86ade02e057860b2a54");
                return;
            }
            if (this.b.getLoadCallback() != null) {
                this.b.getLoadCallback().onSuccess(Arrays.asList(dDResource));
            }
            if (dDResource != null) {
                dDResource.refreshLastUseMillis();
            }
            r.a(str).a(dDResource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends i {
        public static ChangeQuickRedirect a;
        protected CheckResourceRequest b;
        private Set<String> e;

        public a(CheckResourceRequest checkResourceRequest) {
            super(checkResourceRequest);
            Object[] objArr = {o.this, checkResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d45e2d624296b404ea0a97ce301137", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d45e2d624296b404ea0a97ce301137");
                return;
            }
            this.b = checkResourceRequest;
            this.e = new HashSet(checkResourceRequest.getRequestResources());
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade9c271a47b0f3c63da4415c12ca49a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade9c271a47b0f3c63da4415c12ca49a");
            } else if (this.b.getParams() != null && this.b.getParams().preloadTag == 1 && !com.meituan.met.mercury.load.core.c.i) {
                com.meituan.met.mercury.load.utils.c.a("DDD preload horn close");
            } else {
                try {
                    List<ResourceIdVersion> list = null;
                    if (this.b.getStrategy() != DDLoadStrategy.REMOTE_BUNDLES) {
                        m unused = o.this.d;
                        list = m.b(this.b.getBusiness(), null);
                    }
                    try {
                        Response<BaseResponse<CheckListData>> a2 = com.meituan.met.mercury.load.retrofit.b.a().a(this.b.getBusiness(), this.b.getRequestResources(), list, this.b.getParams()).a();
                        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("CheckListRunnable response");
                        bVar.a(ShieldMonitorKey.TAG_BUSINESS, this.b.getBusiness());
                        bVar.a("strategy", this.b.getStrategy());
                        if (a2 != null && a2.e() != null && a2.e().data != null) {
                            CheckListData checkListData = a2.e().data;
                            bVar.a("resultData", checkListData);
                            com.meituan.met.mercury.load.utils.c.a(bVar);
                            if (this.b.getStrategy() == DDLoadStrategy.REMOTE_BUNDLES) {
                                a(this.b, checkListData);
                                return;
                            }
                            r.a(this.b.getBusiness()).a(checkListData.bundlesToDel, 10);
                            a(this.b, checkListData.bundles);
                            return;
                        }
                        bVar.b = "CheckListRunnable response server response not valid";
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                        if (this.b.getStrategy() == DDLoadStrategy.NET_FIRST) {
                            m.a().a(this.b);
                        } else if (this.b.getStrategy() == DDLoadStrategy.REMOTE_BUNDLES) {
                            o.a(o.this, this.b.getLoadCallback(), new f((short) 2, "CheckListRunnable server response not valid"));
                            return;
                        } else {
                            if (this.b.getRequestResources() != null && !this.b.getRequestResources().isEmpty()) {
                                for (String str : this.b.getRequestResources()) {
                                    a(str);
                                    o.a(o.this, this.b.getLoadCallback(), new f((short) 2, "CheckListRunnable server response not valid", str));
                                }
                            }
                            o.a(o.this, this.b.getLoadCallback(), new f((short) 2, "CheckListRunnable server response not valid request resources is empty"));
                        }
                        if (this.b == null || this.b.getParams() == null) {
                            return;
                        }
                        if (this.b.getRequestResources() != null && !this.b.getRequestResources().isEmpty()) {
                            for (String str2 : this.b.getRequestResources()) {
                                this.b.getParams().onFail(1, new f((short) 2, "CheckListRunnable server response not valid", str2), this.b.getLoadCallback() == null);
                            }
                            return;
                        }
                        this.b.getParams().onFail(1, new f((short) 2, "CheckListRunnable server response not valid request resources is empty"), this.b.getLoadCallback() == null);
                    } catch (Exception e) {
                        if (e instanceof SocketTimeoutException) {
                            throw new f((short) 6, "CheckListRunnable socket timeout exception");
                        }
                        throw new f((short) 5, "CheckListRunnable fail:" + e.toString());
                    }
                } catch (Exception e2) {
                    e = e2;
                    com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("CheckListRunnable unknown exception");
                    bVar2.a("notCallBackResources", this.e);
                    bVar2.a(LogMonitor.EXCEPTION_TAG, e.toString());
                    com.meituan.met.mercury.load.utils.c.a(bVar2);
                    if (this.b.getStrategy() == DDLoadStrategy.REMOTE_BUNDLES) {
                        if (!(e instanceof f)) {
                            e = new f((short) -1, "CheckListRunnable exception:" + e.toString());
                        }
                        if (this.b.getParams() != null) {
                            this.b.getParams().onFail(1, (f) e, this.b.getLoadCallback() == null);
                        }
                        o.a(o.this, this.b.getLoadCallback(), e);
                        return;
                    }
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
                        o.a(o.this, this.b.getLoadCallback(), new f((short) i, str4, str3));
                    }
                }
            }
        }

        private void a(CheckResourceRequest checkResourceRequest, CheckListData checkListData) {
            Object[] objArr = {checkResourceRequest, checkListData};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "612e8d1d616029af3da3f027850819e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "612e8d1d616029af3da3f027850819e5");
            } else if (!CollectionUtils.isEmpty(checkListData.bundles)) {
                ArrayList arrayList = new ArrayList();
                for (BundleData bundleData : checkListData.bundles) {
                    if (bundleData != null) {
                        DDResource.a aVar = new DDResource.a();
                        aVar.b = checkResourceRequest.getBusiness();
                        aVar.c = bundleData.bundleName;
                        aVar.d = bundleData.getBundleVersion();
                        aVar.e = bundleData.md5;
                        aVar.f = bundleData.tags;
                        aVar.m = bundleData.getOriginMd5();
                        arrayList.add(aVar.a());
                    }
                }
                if (checkResourceRequest.getLoadCallback() != null) {
                    checkResourceRequest.getLoadCallback().onSuccess(arrayList);
                }
            } else {
                o.a(o.this, checkResourceRequest.getLoadCallback(), new f((short) 10, "resource not found at server"));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:135:0x0259 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0254  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(com.meituan.met.mercury.load.repository.CheckResourceRequest r19, java.util.List<com.meituan.met.mercury.load.bean.BundleData> r20) {
            /*
                Method dump skipped, instructions count: 606
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.met.mercury.load.core.o.a.a(com.meituan.met.mercury.load.repository.CheckResourceRequest, java.util.List):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(CheckResourceRequest checkResourceRequest, List<DDResource> list) {
            Object[] objArr = {checkResourceRequest, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67cef63433de1934f9ad8b9e599b9e02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67cef63433de1934f9ad8b9e599b9e02");
                return;
            }
            if (!CollectionUtils.isEmpty(list)) {
                for (DDResource dDResource : list) {
                    dDResource.setIsNewest(1);
                    dDResource.refreshLastUseMillis();
                    dDResource.setDeleteState(0);
                }
            }
            if (checkResourceRequest.getLoadCallback() != null) {
                checkResourceRequest.getLoadCallback().onSuccess(list);
            }
            r.a(checkResourceRequest.getBusiness()).a(list);
        }

        private void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f16ffd7e236267fa93c89d7eb904b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f16ffd7e236267fa93c89d7eb904b9");
            } else if (this.e == null || this.e.size() <= 0 || TextUtils.isEmpty(str)) {
            } else {
                this.e.remove(str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends i {
        public static ChangeQuickRedirect a;
        private com.meituan.met.mercury.load.repository.a b;

        public b(com.meituan.met.mercury.load.repository.a aVar) {
            super(aVar);
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5d0e209db4c8bd031532f235638517", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5d0e209db4c8bd031532f235638517");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c751aaf7c2e69a7892003a8d8d6911d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c751aaf7c2e69a7892003a8d8d6911d1");
                return;
            }
            try {
                final com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("Fetch BundleData Download");
                bVar.a(SocialConstants.TYPE_REQUEST, this.b);
                DDResource b = r.a(this.b.getBusiness()).b(this.b.a.md5);
                if (b != null && TextUtils.equals(b.getName(), this.b.a.bundleName) && TextUtils.equals(b.getVersion(), this.b.a.getBundleVersion())) {
                    b.setFromNet(false);
                    a(this.b, Arrays.asList(b));
                    bVar.a("result", b);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    return;
                }
                com.meituan.met.mercury.load.download.c.a(this.b.getBusiness()).a(this.b.getBusiness(), this.b.a, new k() { // from class: com.meituan.met.mercury.load.core.o.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onSuccess(@Nullable DDResource dDResource) {
                        Object[] objArr2 = {dDResource};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dc4ae10f9231c460fdfb24874c17be2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dc4ae10f9231c460fdfb24874c17be2");
                            return;
                        }
                        b.this.a(b.this.b, Arrays.asList(dDResource));
                        bVar.a("result", dDResource);
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                    }

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onFail(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df6d627dd2bddb6b53f55d52c817928a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df6d627dd2bddb6b53f55d52c817928a");
                            return;
                        }
                        b.this.a(b.this.b, exc);
                        bVar.a("exc", exc);
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                    }
                }, this.b.getParams());
            } catch (Exception e) {
                a(this.b, e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.meituan.met.mercury.load.repository.a aVar, Exception exc) {
            Object[] objArr = {aVar, exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90579405bbba400eb708f30d56174ea5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90579405bbba400eb708f30d56174ea5");
            } else if (aVar.getLoadCallback() != null) {
                aVar.getLoadCallback().onFail(exc);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.meituan.met.mercury.load.repository.a aVar, List<DDResource> list) {
            Object[] objArr = {aVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85baa3dea97ba645ab3e7c3d887a6a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85baa3dea97ba645ab3e7c3d887a6a0");
                return;
            }
            if (!CollectionUtils.isEmpty(list)) {
                for (DDResource dDResource : list) {
                    dDResource.setIsNewest(1);
                    dDResource.refreshLastUseMillis();
                    dDResource.setDeleteState(0);
                }
            }
            if (aVar.getLoadCallback() != null) {
                aVar.getLoadCallback().onSuccess(list);
            }
            r.a(aVar.getBusiness()).a(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends i {
        public static ChangeQuickRedirect a;
        private com.meituan.met.mercury.load.repository.b c;
        private List<ResourceNameVersion> e;

        public c(com.meituan.met.mercury.load.repository.b bVar) {
            super(bVar);
            Object[] objArr = {o.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6fbcaa44a61f8c6f7a787ff8d17e94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6fbcaa44a61f8c6f7a787ff8d17e94");
                return;
            }
            this.c = bVar;
            this.e = new ArrayList(bVar.b);
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            Call<BaseResponse<List<BundleData>>> bundles;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc59d3cbba79a9ee90a7f39fbb7ed6ac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc59d3cbba79a9ee90a7f39fbb7ed6ac");
                return;
            }
            try {
                com.meituan.met.mercury.load.retrofit.b a2 = com.meituan.met.mercury.load.retrofit.b.a();
                String business = this.c.getBusiness();
                List<ResourceNameVersion> list = this.c.b;
                m unused = o.this.d;
                List<ResourceNameVersion> c = m.c(this.c.getBusiness(), null);
                Object[] objArr2 = {business, list, c};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.retrofit.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ba0a9b4cdcfb5b1c55d05e80a2bd91c8", RobustBitConfig.DEFAULT_VALUE)) {
                    bundles = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ba0a9b4cdcfb5b1c55d05e80a2bd91c8");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("appVersion", Long.valueOf(e.e()));
                    hashMap.put("appVersionName", e.d());
                    hashMap.put("applicationId", e.g());
                    hashMap.put(DeviceInfo.USER_ID, e.i());
                    hashMap.put("UUID", e.h());
                    hashMap.put("channel", e.k());
                    hashMap.put("platform", "Android");
                    hashMap.put("sdkVersion", e.f());
                    hashMap.put("nameVersions", list);
                    hashMap.put("localBundles", c);
                    String str = a2.a(business) + String.format("config/%s/bundles", business);
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit getBundles");
                    bVar.a("url", str).a("body", hashMap);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    bundles = a2.b.getBundles(str, hashMap);
                }
                try {
                    Response<BaseResponse<List<BundleData>>> a3 = bundles.a();
                    com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("batch fetch getBundles");
                    bVar2.a(ShieldMonitorKey.TAG_BUSINESS, this.c.getBusiness());
                    bVar2.a("strategy", this.c.getStrategy());
                    if (a3 != null && a3.e() != null && a3.e().data != null && !com.meituan.met.mercury.load.utils.d.a(a3.e().data)) {
                        List<BundleData> list2 = a3.e().data;
                        bVar2.a("bundleDataList", list2);
                        com.meituan.met.mercury.load.utils.c.a(bVar2);
                        a(this.c, list2);
                        return;
                    }
                    bVar2.b = "batch fetch getBundles server response not valid";
                    com.meituan.met.mercury.load.utils.c.a(bVar2);
                    if (this.c.b != null && !this.c.b.isEmpty()) {
                        for (ResourceNameVersion resourceNameVersion : this.c.b) {
                            a(resourceNameVersion);
                            if (resourceNameVersion != null) {
                                o.a(o.this, this.c.getLoadCallback(), new f((short) 2, "batch fetch server response not valid", resourceNameVersion.getName(), resourceNameVersion.getVersion()));
                            } else {
                                o.a(o.this, this.c.getLoadCallback(), new f((short) 2, "batch fetch server response not valid"));
                            }
                        }
                        return;
                    }
                    o.a(o.this, this.c.getLoadCallback(), new f((short) 2, "batch fetch server response not valid request nameVersions is empty"));
                } catch (Exception e) {
                    if (e instanceof SocketTimeoutException) {
                        throw new f((short) 6, "batch fetch socket timeout exception", (Throwable) e);
                    }
                    throw new f((short) 5, "batch fetch net fail:" + e.toString());
                }
            } catch (Exception e2) {
                com.meituan.met.mercury.load.utils.b bVar3 = new com.meituan.met.mercury.load.utils.b("batch fetch exception");
                bVar3.a("notCallbackNameVersions", this.e);
                com.meituan.met.mercury.load.utils.c.a(bVar3);
                for (ResourceNameVersion resourceNameVersion2 : this.e) {
                    int i = -1;
                    String str2 = "Batch fetch unknown exception:" + e2.toString();
                    String str3 = "";
                    String str4 = "";
                    if (resourceNameVersion2 != null) {
                        str3 = resourceNameVersion2.getName();
                        str4 = resourceNameVersion2.getVersion();
                    }
                    if (e2 instanceof f) {
                        f fVar = (f) e2;
                        i = fVar.c;
                        String message = fVar.getMessage();
                        if (!TextUtils.isEmpty(message)) {
                            str2 = message;
                        }
                    }
                    o.a(o.this, this.c.getLoadCallback(), new f((short) i, str2, str3, str4));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.meituan.met.mercury.load.repository.b bVar, List<DDResource> list) {
            Object[] objArr = {bVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cf63acecbae0a9ce8b090bbad33fc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cf63acecbae0a9ce8b090bbad33fc0");
                return;
            }
            if (bVar.getLoadCallback() != null) {
                bVar.getLoadCallback().onSuccess(list);
            }
            if (!com.meituan.met.mercury.load.utils.d.a(list)) {
                for (DDResource dDResource : list) {
                    if (dDResource != null) {
                        dDResource.refreshLastUseMillis();
                    }
                }
            }
            r.a(bVar.getBusiness()).a(list);
        }

        private void a(ResourceNameVersion resourceNameVersion) {
            Object[] objArr = {resourceNameVersion};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da72d464d04efe5d6ec5e155ebc32dd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da72d464d04efe5d6ec5e155ebc32dd");
            } else if (this.e == null || this.e.size() <= 0 || resourceNameVersion == null) {
            } else {
                Iterator<ResourceNameVersion> it = this.e.iterator();
                while (it.hasNext()) {
                    ResourceNameVersion next = it.next();
                    if (next != null && TextUtils.equals(next.getName(), resourceNameVersion.getName()) && TextUtils.equals(next.getVersion(), resourceNameVersion.getVersion())) {
                        it.remove();
                        return;
                    }
                }
            }
        }

        private void a(com.meituan.met.mercury.load.repository.b bVar, List<BundleData> list) {
            boolean z;
            Object[] objArr = {bVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e20f7c6d2edb0ded09af8405bb877ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e20f7c6d2edb0ded09af8405bb877ae");
                return;
            }
            List<ResourceNameVersion> list2 = bVar.b;
            ArrayList<ResourceNameVersion> arrayList = new ArrayList();
            if (list2 != null && !list2.isEmpty()) {
                arrayList.addAll(list2);
                if (!CollectionUtils.isEmpty(list)) {
                    for (BundleData bundleData : list) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ResourceNameVersion resourceNameVersion = (ResourceNameVersion) it.next();
                            if (resourceNameVersion != null && TextUtils.equals(bundleData.bundleName, resourceNameVersion.getName()) && TextUtils.equals(bundleData.getBundleVersion(), resourceNameVersion.getVersion())) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                for (ResourceNameVersion resourceNameVersion2 : arrayList) {
                    a(resourceNameVersion2);
                    if (resourceNameVersion2 != null) {
                        o.a(o.this, bVar.getLoadCallback(), new f((short) 10, "batch fetch resource not found at server", resourceNameVersion2.getName(), resourceNameVersion2.getVersion()));
                    } else {
                        o.a(o.this, bVar.getLoadCallback(), new f((short) 10, "batch fetch resource not found at server"));
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<BundleData> arrayList3 = new ArrayList();
            if (!CollectionUtils.isEmpty(list)) {
                for (BundleData bundleData2 : list) {
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator<ResourceNameVersion> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            ResourceNameVersion next = it2.next();
                            if (TextUtils.equals(next.getName(), bundleData2.bundleName) && TextUtils.equals(next.getVersion(), bundleData2.getBundleVersion())) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                        }
                    }
                    DDResource b = r.a(bVar.getBusiness()).b(bundleData2.md5);
                    if (b != null && TextUtils.equals(b.getName(), bundleData2.bundleName) && TextUtils.equals(b.getVersion(), bundleData2.getBundleVersion())) {
                        a(new ResourceNameVersion(b.getName(), b.getVersion()));
                        arrayList2.add(b);
                    } else {
                        arrayList3.add(bundleData2);
                    }
                }
                if (!CollectionUtils.isEmpty(arrayList2)) {
                    b(bVar, arrayList2);
                }
            }
            if (CollectionUtils.isEmpty(arrayList3)) {
                return;
            }
            for (BundleData bundleData3 : arrayList3) {
                com.meituan.met.mercury.load.download.c.a(bVar.getBusiness()).a(bVar.getBusiness(), bundleData3, new k() { // from class: com.meituan.met.mercury.load.core.o.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onSuccess(@Nullable DDResource dDResource) {
                        Object[] objArr2 = {dDResource};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4826f2a7c92c4ab9a8fd1838e2bd6b9d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4826f2a7c92c4ab9a8fd1838e2bd6b9d");
                        } else {
                            c.this.b(c.this.c, Arrays.asList(dDResource));
                        }
                    }

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onFail(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a45192358ce36807561fe65d06596c13", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a45192358ce36807561fe65d06596c13");
                        } else {
                            o.a(o.this, c.this.c.getLoadCallback(), exc);
                        }
                    }
                }, bVar.getParams());
                if (bundleData3 != null) {
                    a(new ResourceNameVersion(bundleData3.bundleName, bundleData3.getBundleVersion()));
                }
            }
        }
    }
}
