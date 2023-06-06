package com.meituan.android.mercury.msc.adaptor.core;

import android.text.TextUtils;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAdaptorLog;
import com.meituan.android.mercury.msc.adaptor.bean.MSCAppMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCCacheIndexInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCMetaInfo;
import com.meituan.android.mercury.msc.adaptor.bean.MSCMetaInfoRequest;
import com.meituan.met.mercury.load.bean.MSCAppIdPublishId;
import com.meituan.met.mercury.load.core.i;
import com.meituan.met.mercury.load.utils.g;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.tencent.open.SocialConstants;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static final ScheduledExecutorService b = g.a("MSCLoader", 2);
    private static final ScheduledExecutorService c = g.a("MSCLoader", 2);
    private static volatile d d;

    public static /* synthetic */ void a(d dVar, final MSCMetaInfoRequest mSCMetaInfoRequest, final MSCMetaInfo mSCMetaInfo) {
        Object[] objArr = {mSCMetaInfoRequest, mSCMetaInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "b585fd4efe629b4eed75fb5aaa7bc20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "b585fd4efe629b4eed75fb5aaa7bc20e");
        } else if (mSCMetaInfoRequest == null || mSCMetaInfoRequest.callback == null) {
        } else {
            c.execute(new Runnable() { // from class: com.meituan.android.mercury.msc.adaptor.core.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a50646a16ab33679f67282db8991f007", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a50646a16ab33679f67282db8991f007");
                        return;
                    }
                    MSCAdaptorLog mSCAdaptorLog = new MSCAdaptorLog("Callback onSuccess");
                    mSCAdaptorLog.putExtra(SocialConstants.TYPE_REQUEST, mSCMetaInfoRequest).putExtra("data", mSCMetaInfo);
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog);
                    mSCMetaInfoRequest.callback.a(mSCMetaInfo);
                }
            });
        }
    }

    public static /* synthetic */ void a(d dVar, final MSCMetaInfoRequest mSCMetaInfoRequest, final Exception exc) {
        Object[] objArr = {mSCMetaInfoRequest, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "37a662b30494ed240054f43cc70edafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "37a662b30494ed240054f43cc70edafb");
        } else if (mSCMetaInfoRequest == null || mSCMetaInfoRequest.callback == null) {
        } else {
            c.execute(new Runnable() { // from class: com.meituan.android.mercury.msc.adaptor.core.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0e90dc5f033a541e2067a4569f7d83e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0e90dc5f033a541e2067a4569f7d83e");
                        return;
                    }
                    MSCAdaptorLog mSCAdaptorLog = new MSCAdaptorLog("Callback onFail");
                    mSCAdaptorLog.putExtra(SocialConstants.TYPE_REQUEST, mSCMetaInfoRequest).putExtra("error", exc);
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog);
                    mSCMetaInfoRequest.callback.a(e.a(exc));
                }
            });
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "267474eb1e8254a24e97e80c478bcecb", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "267474eb1e8254a24e97e80c478bcecb");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public final void a(MSCMetaInfoRequest mSCMetaInfoRequest) {
        Object[] objArr = {mSCMetaInfoRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa3fb59f0143493c4ec78723fda6bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa3fb59f0143493c4ec78723fda6bd2");
        } else {
            b.execute(new b(mSCMetaInfoRequest));
        }
    }

    public final void b(MSCMetaInfoRequest mSCMetaInfoRequest) {
        Object[] objArr = {mSCMetaInfoRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3002a7b54bf9517e0dec08a52f6abf98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3002a7b54bf9517e0dec08a52f6abf98");
        } else {
            b.execute(new a(mSCMetaInfoRequest));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b extends i {
        public static ChangeQuickRedirect a;
        private final MSCMetaInfoRequest c;

        public b(MSCMetaInfoRequest mSCMetaInfoRequest) {
            super(mSCMetaInfoRequest);
            Object[] objArr = {d.this, mSCMetaInfoRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5250c19ec6c446fd62d3c192309abff6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5250c19ec6c446fd62d3c192309abff6");
            } else {
                this.c = mSCMetaInfoRequest;
            }
        }

        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            MSCAppIdPublishId mSCAppIdPublishId;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baddc35c708922c9c3c85448d5083651", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baddc35c708922c9c3c85448d5083651");
                return;
            }
            try {
                MSCAppMetaInfo a2 = f.a().a(this.c.appId, this.c.validTime);
                if (!this.c.forceUpdate && a2 != null) {
                    a2.setFrom(1);
                    ArrayList arrayList = new ArrayList();
                    MSCMetaInfo mSCMetaInfo = new MSCMetaInfo();
                    arrayList.add(a2);
                    mSCMetaInfo.setMscApps(arrayList);
                    MSCAdaptorLog mSCAdaptorLog = new MSCAdaptorLog("getMetaInfo cache hash data");
                    mSCAdaptorLog.putExtra(SocialConstants.TYPE_REQUEST, this.c).putExtra("data", mSCMetaInfo);
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog);
                    d.a(d.this, this.c, mSCMetaInfo);
                    return;
                }
                f a3 = f.a();
                String str = this.c.appId;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "4b83321b566b5c556bc52d2af94da2a4", RobustBitConfig.DEFAULT_VALUE)) {
                    mSCAppIdPublishId = (MSCAppIdPublishId) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "4b83321b566b5c556bc52d2af94da2a4");
                } else if (a3.b.containsKey(str)) {
                    MSCCacheIndexInfo mSCCacheIndexInfo = a3.b.get(str);
                    mSCAppIdPublishId = new MSCAppIdPublishId(mSCCacheIndexInfo.appId, mSCCacheIndexInfo.publishId);
                } else {
                    mSCAppIdPublishId = null;
                }
                if (mSCAppIdPublishId != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mSCAppIdPublishId);
                    this.c.cacheMscVersion = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(this.c.appId);
                this.c.mscAppIds = arrayList3;
                MSCAdaptorLog mSCAdaptorLog2 = new MSCAdaptorLog("getMetaInfo cache not data");
                mSCAdaptorLog2.putExtra(SocialConstants.TYPE_REQUEST, this.c);
                com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog2);
                d.this.b(this.c);
            } catch (Exception e) {
                d.a(d.this, this.c, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends i {
        public static ChangeQuickRedirect a;
        public MSCMetaInfoRequest b;

        public a(MSCMetaInfoRequest mSCMetaInfoRequest) {
            super(mSCMetaInfoRequest);
            Object[] objArr = {d.this, mSCMetaInfoRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd598d03d51d53f132014a2983786fea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd598d03d51d53f132014a2983786fea");
            } else {
                this.b = mSCMetaInfoRequest;
            }
        }

        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [boolean, byte] */
        @Override // com.meituan.met.mercury.load.core.i
        public final void a() {
            ?? r1;
            String a2;
            Call<ap> mSCBundleInfo;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca896e3a0dd7802260826112f3fcc4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca896e3a0dd7802260826112f3fcc4c");
                return;
            }
            try {
                if (!com.meituan.met.mercury.load.core.c.i && this.b.preloadTag == 1) {
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(new MSCAdaptorLog("msc adapter preload horn close"));
                    return;
                }
                if (TextUtils.isEmpty(this.b.appId)) {
                    List<MSCAppIdPublishId> b = f.a().b();
                    if (b != null && b.size() > 0) {
                        this.b.cacheMscVersion = b;
                    }
                    r1 = 1;
                } else {
                    r1 = 0;
                }
                if (this.b.cacheMscVersion == null) {
                    this.b.cacheMscVersion = new ArrayList();
                }
                com.meituan.met.mercury.load.retrofit.b a3 = com.meituan.met.mercury.load.retrofit.b.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mercury.msc.adaptor.core.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7b37510c91cba7a0924e1b1436bedcf4", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7b37510c91cba7a0924e1b1436bedcf4");
                } else if (com.meituan.android.mercury.msc.adaptor.core.a.b == null) {
                    a2 = com.meituan.met.mercury.load.core.e.a("msc_adaptor").b("INIT_APP_PARAMETER", "");
                } else {
                    a2 = com.meituan.android.mercury.msc.adaptor.core.a.b.a();
                    com.meituan.met.mercury.load.core.e.a("msc_adaptor").a("INIT_APP_PARAMETER", a2);
                }
                String str = this.b.metaInfoTestUrl;
                String a4 = com.meituan.android.mercury.msc.adaptor.core.a.a();
                List<String> list = this.b.mscAppIds;
                List<MSCAppIdPublishId> list2 = this.b.cacheMscVersion;
                boolean c = com.meituan.android.mercury.msc.adaptor.core.a.c();
                Object[] objArr3 = {a2, str, a4, list, list2, Byte.valueOf((byte) r1), Byte.valueOf(c ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.met.mercury.load.retrofit.b.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "3ff1851eacf0e5c224e62b7b44977d48", RobustBitConfig.DEFAULT_VALUE)) {
                    mSCBundleInfo = (Call) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "3ff1851eacf0e5c224e62b7b44977d48");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("mscAppIds", list);
                    hashMap.put("platform", "Android");
                    hashMap.put("app", a2);
                    hashMap.put("needVip", Boolean.valueOf((boolean) r1));
                    hashMap.put("appVersionName", com.meituan.met.mercury.load.core.e.d());
                    hashMap.put("channel", com.meituan.met.mercury.load.core.e.k());
                    hashMap.put("uuid", com.meituan.met.mercury.load.core.e.h());
                    hashMap.put("cityID", com.meituan.met.mercury.load.core.e.j());
                    hashMap.put("dddVersion", com.meituan.met.mercury.load.core.e.f());
                    if (TextUtils.isEmpty(a4)) {
                        a4 = com.meituan.met.mercury.load.core.e.b(ContainerInfo.ENV_MSC);
                    }
                    hashMap.put("mscVersion", a4);
                    if (!TextUtils.isEmpty(a4)) {
                        com.meituan.met.mercury.load.core.e.a(ContainerInfo.ENV_MSC, a4);
                    }
                    hashMap.put("localMscApps", list2);
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit getMSCMetaInfo");
                    bVar.a("body", hashMap);
                    if (!TextUtils.isEmpty(str)) {
                        bVar.a("url", str);
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                        mSCBundleInfo = a3.b.getMSCBundleInfoTest(str);
                    } else {
                        String str2 = c ? "https://ddapi.fe.test.sankuai.com/config/msc/checkList" : "https://dd.meituan.com/config/msc/checkList";
                        bVar.a("url", str2);
                        com.meituan.met.mercury.load.utils.c.a(bVar);
                        mSCBundleInfo = a3.b.getMSCBundleInfo(str2, hashMap);
                    }
                }
                try {
                    Response<ap> a5 = mSCBundleInfo.a();
                    MSCAdaptorLog mSCAdaptorLog = new MSCAdaptorLog("CheckUpdateMetaInfo:");
                    mSCAdaptorLog.putExtra("response", a5);
                    mSCAdaptorLog.putExtra(SocialConstants.TYPE_REQUEST, this.b);
                    com.meituan.android.mercury.msc.adaptor.utils.a.a(mSCAdaptorLog);
                    if (a5 == null || a5.c != 200 || a5.e == null) {
                        throw new e((short) 2, "msc checkupdate server response not valid");
                    }
                    MSCMetaInfo mSCMetaInfo = (MSCMetaInfo) com.meituan.met.mercury.load.utils.a.a(a5.e.string(), (Class<Object>) MSCMetaInfo.class);
                    if (mSCMetaInfo == null) {
                        throw new e((short) 5, "server response not valid");
                    }
                    Object[] objArr4 = {mSCMetaInfo};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7e31103d23c9aba3dfba5f587114675b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7e31103d23c9aba3dfba5f587114675b");
                    } else {
                        f.a().b(mSCMetaInfo.getMscAppVersionsToDelete());
                        f.a().a(mSCMetaInfo.getMscApps());
                    }
                    d.a(d.this, this.b, mSCMetaInfo);
                } catch (Exception e) {
                    if (e instanceof SocketTimeoutException) {
                        throw new e((short) 6, e.toString());
                    }
                    throw new e((short) 5, e.toString());
                }
            } catch (Exception e2) {
                d.a(d.this, this.b, e2);
            }
        }
    }
}
