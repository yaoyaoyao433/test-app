package com.meituan.met.mercury.load.download;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.u;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.core.DDLoadParams;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.core.k;
import com.meituan.met.mercury.load.core.r;
import com.meituan.met.mercury.load.core.s;
import com.meituan.met.mercury.load.repository.task.a;
import com.meituan.met.mercury.load.utils.d;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.met.mercury.load.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Map<String, c> b = new ConcurrentHashMap();
    private int c;
    private final Map<String, List<k>> d;
    private String e;
    private ThreadPoolExecutor f;

    private c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419bd42cbfec11561030b92ceda34f96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419bd42cbfec11561030b92ceda34f96");
            return;
        }
        this.c = 1;
        this.d = new HashMap();
        this.e = str;
        if (TextUtils.equals(str, "game")) {
            this.c = 2;
        }
        if (com.meituan.met.mercury.load.core.c.o.containsKey(str) && com.meituan.met.mercury.load.core.c.o.get(str).intValue() > 0) {
            this.c = com.meituan.met.mercury.load.core.c.o.get(str).intValue();
        }
        this.f = g.a("D-" + str, this.c, this.c, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static c a(String str) {
        c cVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "504f9a2d7a41ed2911dd5e291e3c3db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "504f9a2d7a41ed2911dd5e291e3c3db7");
        }
        c cVar2 = b.get(str);
        if (cVar2 == null) {
            synchronized (b) {
                cVar = b.get(str);
                if (cVar == null) {
                    cVar = new c(str);
                    b.put(str, cVar);
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public final synchronized void a(@NonNull String str, @NonNull BundleData bundleData, k kVar, DDLoadParams dDLoadParams) {
        String str2;
        com.meituan.met.mercury.load.repository.task.c cVar;
        DDResource b2;
        File d;
        File e;
        com.meituan.met.mercury.load.repository.task.a aVar;
        Object[] objArr = {str, bundleData, kVar, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9175140ea05d4769ff97c611182bc4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9175140ea05d4769ff97c611182bc4e");
        } else if (!com.meituan.met.mercury.load.core.c.p) {
            s.a(str, bundleData, kVar, dDLoadParams);
        } else {
            if (!TextUtils.isEmpty(str) && bundleData != null && !TextUtils.isEmpty(bundleData.bundleName) && !TextUtils.isEmpty(bundleData.getBundleVersion()) && !TextUtils.isEmpty(bundleData.md5)) {
                String b3 = b(bundleData.bundleName, bundleData.getBundleVersion());
                List<k> list = this.d.get(b3);
                if (!d.a(list)) {
                    list.add(kVar);
                    this.d.put(b3, list);
                    return;
                }
                Object[] objArr2 = {str, bundleData, kVar, dDLoadParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2557a53ce70080cb06623c0b7e957d12", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.meituan.met.mercury.load.repository.task.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2557a53ce70080cb06623c0b7e957d12");
                    str2 = b3;
                } else {
                    Object[] objArr3 = {str, bundleData, dDLoadParams};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "56aec6fa5187629316412c2b26f1e06e", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar = (com.meituan.met.mercury.load.repository.task.c) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "56aec6fa5187629316412c2b26f1e06e");
                        str2 = b3;
                    } else if (bundleData == null || bundleData.diff == null || TextUtils.isEmpty(bundleData.diff.diffUrl) || TextUtils.isEmpty(bundleData.diff.diffMd5) || TextUtils.isEmpty(bundleData.diff.oldMd5) || (b2 = r.a(str).b(bundleData.diff.oldMd5)) == null || !b2.isLocalCacheValid()) {
                        str2 = b3;
                        cVar = null;
                    } else {
                        String str3 = bundleData.diff.diffUrl;
                        String str4 = bundleData.diff.diffMd5;
                        String str5 = bundleData.md5;
                        File file = new File(b2.getLocalPath());
                        File d2 = d(str, bundleData, dDLoadParams);
                        Object[] objArr4 = {str, bundleData};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "27f4636c2b1e1de68d23fa52aeba73c4", RobustBitConfig.DEFAULT_VALUE)) {
                            d = (File) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "27f4636c2b1e1de68d23fa52aeba73c4");
                        } else {
                            String a2 = e.a(bundleData.diff.diffUrl);
                            if (TextUtils.isEmpty(a2)) {
                                a2 = bundleData.diff.diffMd5;
                            }
                            d = com.meituan.met.mercury.load.core.e.d(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
                        }
                        File file2 = d;
                        int i = dDLoadParams.preloadTag;
                        Object[] objArr5 = {str, bundleData};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        str2 = b3;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f0fe0c35ceb0864cf787f9a5cc1b0950", RobustBitConfig.DEFAULT_VALUE)) {
                            e = (File) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f0fe0c35ceb0864cf787f9a5cc1b0950");
                        } else {
                            String a3 = e.a(bundleData.diff.diffUrl);
                            if (TextUtils.isEmpty(a3)) {
                                a3 = bundleData.diff.diffMd5;
                            }
                            e = com.meituan.met.mercury.load.core.e.e(str, bundleData.bundleName, bundleData.getBundleVersion(), a3);
                        }
                        cVar = new com.meituan.met.mercury.load.repository.task.c(str3, str4, str5, file, d2, file2, i, e);
                    }
                    if (cVar == null) {
                        cVar = c(str, bundleData, dDLoadParams);
                    }
                    if (cVar == null) {
                        cVar = b(str, bundleData, dDLoadParams);
                    }
                    com.meituan.met.mercury.load.repository.task.a aVar2 = cVar;
                    if (aVar2 != null) {
                        aVar2.a(new a(str, bundleData, kVar, dDLoadParams));
                        aVar2.a(str, bundleData.bundleName, bundleData.getBundleVersion());
                    }
                    aVar = aVar2;
                }
                if (aVar == null) {
                    kVar.onFail(new f((short) 1, "create download task bundle data not valid!"));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(kVar);
                this.d.put(str2, arrayList);
                a(aVar);
                return;
            }
            kVar.onFail(new f((short) 1, "business or bundle data not valid!"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull com.meituan.met.mercury.load.repository.task.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09d7394700764bb0d756034d5f5075a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09d7394700764bb0d756034d5f5075a");
        } else {
            this.f.execute(aVar);
        }
    }

    public final synchronized void a(String str, boolean z, DDResource dDResource, Exception exc) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), dDResource, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed41db05a3dca2c71965ece148540c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed41db05a3dca2c71965ece148540c25");
            return;
        }
        for (k kVar : this.d.get(str)) {
            if (z) {
                kVar.onSuccess(dDResource);
            } else {
                kVar.onFail(exc);
            }
        }
        this.d.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.meituan.met.mercury.load.repository.task.b b(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12ccfbb3ed6943da4a254bf2178a317b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.met.mercury.load.repository.task.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12ccfbb3ed6943da4a254bf2178a317b");
        }
        if (bundleData == null || TextUtils.isEmpty(bundleData.url) || TextUtils.isEmpty(bundleData.md5)) {
            return null;
        }
        return new com.meituan.met.mercury.load.repository.task.b(bundleData.url, bundleData.md5, d(str, bundleData, dDLoadParams), dDLoadParams.limitWifi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.meituan.met.mercury.load.repository.task.d c(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e447f99d6addd5408dea952aa0a1dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.met.mercury.load.repository.task.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e447f99d6addd5408dea952aa0a1dcf");
        }
        if (bundleData == null || bundleData.mode != 1 || bundleData.xzip == null || TextUtils.isEmpty(bundleData.xzip.url) || TextUtils.isEmpty(bundleData.xzip.md5)) {
            return null;
        }
        return new com.meituan.met.mercury.load.repository.task.d(bundleData.xzip.url, bundleData.xzip.md5, a(str, bundleData), bundleData.md5, d(str, bundleData, dDLoadParams), dDLoadParams.preloadTag, b(str, bundleData), dDLoadParams.limitWifi);
    }

    private static File d(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7143cd540a5cf621af2b7be62cd57182", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7143cd540a5cf621af2b7be62cd57182");
        }
        String a2 = e.a(bundleData.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.md5;
        }
        u uVar = u.b;
        if (dDLoadParams != null && dDLoadParams.storageMode == 1) {
            uVar = u.e;
        }
        return com.meituan.met.mercury.load.core.e.a(str, bundleData.bundleName, bundleData.getBundleVersion(), a2, uVar);
    }

    private File a(String str, BundleData bundleData) {
        Object[] objArr = {str, bundleData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2233516e9b8b5f68f01c94b8c119a04", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2233516e9b8b5f68f01c94b8c119a04");
        }
        String a2 = e.a(bundleData.xzip.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.xzip.md5;
        }
        return com.meituan.met.mercury.load.core.e.b(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
    }

    private File b(String str, BundleData bundleData) {
        Object[] objArr = {str, bundleData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb3f54d29e586cab8288328016bb77e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb3f54d29e586cab8288328016bb77e");
        }
        String a2 = e.a(bundleData.xzip.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.xzip.md5;
        }
        return com.meituan.met.mercury.load.core.e.c(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends a.AbstractC0388a {
        public static ChangeQuickRedirect a;
        private String d;
        private BundleData e;
        private k f;
        private DDLoadParams g;
        private long h;

        public a(String str, BundleData bundleData, k kVar, DDLoadParams dDLoadParams) {
            Object[] objArr = {c.this, str, bundleData, kVar, dDLoadParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c557e2239c896970bc40517b7519d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c557e2239c896970bc40517b7519d4");
                return;
            }
            this.d = str;
            this.e = bundleData;
            this.f = kVar;
            this.g = dDLoadParams;
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ba23ae70dc8f16e136b31ef2a52581", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ba23ae70dc8f16e136b31ef2a52581");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("download callback start");
            bVar.a(aVar.getClass().getName(), aVar);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            if (this.h <= 0) {
                this.h = System.currentTimeMillis();
            }
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar, long j, int i) {
            String str;
            String str2;
            Object[] objArr = {aVar, new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc70f4a5a56f2acfa77521f42159d4e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc70f4a5a56f2acfa77521f42159d4e3");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("download callback success");
            bVar.a(aVar.getClass().getName(), aVar);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            if (this.f != null) {
                String absolutePath = aVar.a().getAbsolutePath();
                if (i == 1 && this.e.getXzip() != null) {
                    str2 = this.e.getXzip().getMd5();
                    str = aVar.b().getAbsolutePath();
                } else if (i != 2 || this.e.getDiff() == null) {
                    str = absolutePath;
                    str2 = null;
                } else {
                    str2 = this.e.getDiff().getDiffMd5();
                    str = aVar.b().getAbsolutePath();
                }
                DDResource.a aVar2 = new DDResource.a();
                aVar2.b = this.d;
                aVar2.c = this.e.bundleName;
                aVar2.d = this.e.getBundleVersion();
                aVar2.e = this.e.md5;
                aVar2.f = this.e.tags;
                aVar2.g = this.e.url;
                aVar2.i = this.e.mode;
                aVar2.h = str;
                aVar2.k = !aVar.d();
                aVar2.l = this.e.noVersion;
                aVar2.m = this.e.getOriginMd5();
                aVar2.n = i;
                aVar2.o = str2;
                c.this.a(c.b(this.e.bundleName, this.e.getBundleVersion()), true, aVar2.a(), (Exception) null);
                String str3 = this.g.preloadTag > 0 ? "preloadFull" : "full";
                if (aVar instanceof com.meituan.met.mercury.load.repository.task.c) {
                    str3 = this.g.preloadTag > 0 ? "preloadDiff" : "diff";
                } else if (aVar instanceof com.meituan.met.mercury.load.repository.task.d) {
                    str3 = this.g.preloadTag > 0 ? "preloadXzip" : "xzip";
                }
                a(this.d, this.e.bundleName, this.e.getBundleVersion(), str3, true, aVar.d(), System.currentTimeMillis() - this.h, 0);
            }
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar, Exception exc) {
            com.meituan.met.mercury.load.repository.task.a b;
            f fVar;
            Object[] objArr = {aVar, exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160a9bb4a4f76b18ec111b5930ae35a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160a9bb4a4f76b18ec111b5930ae35a3");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("download callback fail");
            bVar.a(aVar.getClass().getName(), aVar).a(exc).a(exc == null ? "" : exc.toString());
            com.meituan.met.mercury.load.utils.c.b(bVar);
            boolean z = aVar instanceof com.meituan.met.mercury.load.repository.task.c;
            if (z) {
                b = c.a(this.d).c(this.d, this.e, this.g);
                if (b == null) {
                    b = c.b(this.d, this.e, this.g);
                }
            } else {
                b = aVar instanceof com.meituan.met.mercury.load.repository.task.d ? c.b(this.d, this.e, this.g) : null;
            }
            if (b != null) {
                b.a(aVar.c());
                b.a(this.d, this.e.bundleName, this.e.getBundleVersion());
                com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("download Callback fallback");
                bVar2.a("fallbackTask", b);
                com.meituan.met.mercury.load.utils.c.a(bVar2);
                c.a(this.d).a(b);
            } else if (this.f != null) {
                if (exc instanceof f) {
                    fVar = (f) exc;
                    if (TextUtils.isEmpty(fVar.d)) {
                        fVar.d = this.e.bundleName;
                    }
                    if (TextUtils.isEmpty(fVar.e)) {
                        fVar.e = this.e.getBundleVersion();
                    }
                } else {
                    fVar = new f((short) 7, exc != null ? exc.toString() : "download fail !", this.e.bundleName, this.e.getBundleVersion(), exc);
                }
                c.this.a(c.b(this.e.bundleName, this.e.getBundleVersion()), false, (DDResource) null, (Exception) fVar);
                String str = this.g.preloadTag > 0 ? "preloadFull" : "full";
                if (z) {
                    str = this.g.preloadTag > 0 ? "preloadDiff" : "diff";
                } else if (aVar instanceof com.meituan.met.mercury.load.repository.task.d) {
                    str = this.g.preloadTag > 0 ? "preloadXzip" : "xzip";
                }
                a(this.d, this.e.bundleName, this.e.getBundleVersion(), str, false, false, System.currentTimeMillis() - this.h, fVar.c);
            }
        }

        private void a(String str, String str2, String str3, String str4, boolean z, boolean z2, long j, int i) {
            Object[] objArr = {str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e287e479e1850e2e8595fa2eca0302", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e287e479e1850e2e8595fa2eca0302");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("downloadType", str4);
            hashMap.put("success", z ? "1" : "0");
            hashMap.put("fileCached", z2 ? "1" : "0");
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, sb.toString());
            com.meituan.met.mercury.load.report.e.a().a(str, str2, str3, "DDDBundleFetch", Float.valueOf((float) j), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd0140dd82219389d5ca4899e90cd6af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd0140dd82219389d5ca4899e90cd6af");
        }
        return str + CommonConstant.Symbol.MINUS + str2;
    }
}
