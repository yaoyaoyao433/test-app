package com.meituan.met.mercury.load.core;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.u;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.repository.task.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private static final Map<String, ThreadPoolExecutor> b = Collections.synchronizedMap(new HashMap());

    public static void a(@NonNull String str, @NonNull BundleData bundleData, k kVar, DDLoadParams dDLoadParams) {
        DDResource b2;
        File d;
        File e;
        com.meituan.met.mercury.load.repository.task.a aVar;
        Object[] objArr = {str, bundleData, kVar, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        com.meituan.met.mercury.load.repository.task.a aVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b0700409cc8cb47fb1aa1c977033367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b0700409cc8cb47fb1aa1c977033367");
        } else if (TextUtils.isEmpty(str) || bundleData == null || TextUtils.isEmpty(bundleData.bundleName) || TextUtils.isEmpty(bundleData.getBundleVersion()) || TextUtils.isEmpty(bundleData.md5)) {
            if (kVar != null) {
                kVar.onFail(new f((short) 1, "business or bundle data not valid!"));
            }
        } else {
            ThreadPoolExecutor b3 = b(str);
            Object[] objArr2 = {str, bundleData, kVar, dDLoadParams};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "06c4dfffbf60040fed44c51e677b6bfb", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.meituan.met.mercury.load.repository.task.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "06c4dfffbf60040fed44c51e677b6bfb");
            } else {
                Object[] objArr3 = {str, bundleData, dDLoadParams};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0bd8114387dae0f70c1d780b886f2e3c", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar2 = (com.meituan.met.mercury.load.repository.task.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0bd8114387dae0f70c1d780b886f2e3c");
                } else if (bundleData != null && bundleData.diff != null && !TextUtils.isEmpty(bundleData.diff.diffUrl) && !TextUtils.isEmpty(bundleData.diff.diffMd5) && !TextUtils.isEmpty(bundleData.diff.oldMd5) && !dDLoadParams.limitWifi && (b2 = r.a(str).b(bundleData.diff.oldMd5)) != null && b2.isLocalCacheValid()) {
                    String str2 = bundleData.diff.diffUrl;
                    String str3 = bundleData.diff.diffMd5;
                    String str4 = bundleData.md5;
                    File file = new File(b2.getLocalPath());
                    File e2 = e(str, bundleData, dDLoadParams);
                    Object[] objArr4 = {str, bundleData};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "270a6dacc80405a4a0501308ea345d95", RobustBitConfig.DEFAULT_VALUE)) {
                        d = (File) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "270a6dacc80405a4a0501308ea345d95");
                    } else {
                        String a2 = com.meituan.met.mercury.load.utils.e.a(bundleData.diff.diffUrl);
                        if (TextUtils.isEmpty(a2)) {
                            a2 = bundleData.diff.diffMd5;
                        }
                        d = e.d(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
                    }
                    File file2 = d;
                    int i = dDLoadParams.preloadTag;
                    Object[] objArr5 = {str, bundleData};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "2ad4d5bddd6ea0d6a00a285e31c554ab", RobustBitConfig.DEFAULT_VALUE)) {
                        e = (File) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "2ad4d5bddd6ea0d6a00a285e31c554ab");
                    } else {
                        String a3 = com.meituan.met.mercury.load.utils.e.a(bundleData.diff.diffUrl);
                        if (TextUtils.isEmpty(a3)) {
                            a3 = bundleData.diff.diffMd5;
                        }
                        e = e.e(str, bundleData.bundleName, bundleData.getBundleVersion(), a3);
                    }
                    aVar2 = new com.meituan.met.mercury.load.repository.task.c(str2, str3, str4, file, e2, file2, i, e);
                }
                if (aVar2 == null) {
                    aVar2 = d(str, bundleData, dDLoadParams);
                }
                com.meituan.met.mercury.load.repository.task.a c = aVar2 == null ? c(str, bundleData, dDLoadParams) : aVar2;
                if (c != null) {
                    c.a(new a(str, bundleData, kVar, dDLoadParams));
                    c.a(str, bundleData.bundleName, bundleData.getBundleVersion());
                }
                aVar = c;
            }
            if (aVar != null) {
                b3.execute(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadPoolExecutor b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7163d9c7c6f711184d4aa5f433b9db3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7163d9c7c6f711184d4aa5f433b9db3b");
        }
        ThreadPoolExecutor threadPoolExecutor = b.get(str);
        if (threadPoolExecutor == null) {
            synchronized (b) {
                threadPoolExecutor = b.get(str);
                if (threadPoolExecutor == null) {
                    PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
                    threadPoolExecutor = com.meituan.met.mercury.load.utils.g.a("D-" + str, 1, 1, 10L, TimeUnit.SECONDS, priorityBlockingQueue);
                    b.put(str, threadPoolExecutor);
                }
            }
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.meituan.met.mercury.load.repository.task.b c(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4836fae4617b220a0b9e392b2b03bb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.met.mercury.load.repository.task.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4836fae4617b220a0b9e392b2b03bb4");
        }
        if (bundleData == null || TextUtils.isEmpty(bundleData.url) || TextUtils.isEmpty(bundleData.md5)) {
            return null;
        }
        return new com.meituan.met.mercury.load.repository.task.b(bundleData.url, bundleData.md5, e(str, bundleData, dDLoadParams), dDLoadParams.limitWifi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.meituan.met.mercury.load.repository.task.d d(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "410345920d43aacd74d6d41a19d8102a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.met.mercury.load.repository.task.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "410345920d43aacd74d6d41a19d8102a");
        }
        if (bundleData == null || bundleData.mode != 1 || bundleData.xzip == null || TextUtils.isEmpty(bundleData.xzip.url) || TextUtils.isEmpty(bundleData.xzip.md5)) {
            return null;
        }
        return new com.meituan.met.mercury.load.repository.task.d(bundleData.xzip.url, bundleData.xzip.md5, a(str, bundleData), bundleData.md5, e(str, bundleData, dDLoadParams), dDLoadParams.preloadTag, b(str, bundleData), dDLoadParams.limitWifi);
    }

    private static File e(String str, BundleData bundleData, DDLoadParams dDLoadParams) {
        Object[] objArr = {str, bundleData, dDLoadParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d026bf4ffab3ac54de070eb8950c78ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d026bf4ffab3ac54de070eb8950c78ea");
        }
        String a2 = com.meituan.met.mercury.load.utils.e.a(bundleData.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.md5;
        }
        u uVar = u.b;
        if (dDLoadParams != null && dDLoadParams.storageMode == 1) {
            uVar = u.e;
        }
        return e.a(str, bundleData.bundleName, bundleData.getBundleVersion(), a2, uVar);
    }

    private static File a(String str, BundleData bundleData) {
        Object[] objArr = {str, bundleData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e9582e2cbc3e5ef198c04da49e17a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e9582e2cbc3e5ef198c04da49e17a1a");
        }
        String a2 = com.meituan.met.mercury.load.utils.e.a(bundleData.xzip.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.xzip.md5;
        }
        return e.b(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
    }

    private static File b(String str, BundleData bundleData) {
        Object[] objArr = {str, bundleData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8d5eeca75ff29546eb14842f854b6e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8d5eeca75ff29546eb14842f854b6e5");
        }
        String a2 = com.meituan.met.mercury.load.utils.e.a(bundleData.xzip.url);
        if (TextUtils.isEmpty(a2)) {
            a2 = bundleData.xzip.md5;
        }
        return e.c(str, bundleData.bundleName, bundleData.getBundleVersion(), a2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a extends a.AbstractC0388a {
        public static ChangeQuickRedirect a;
        private String b;
        private BundleData d;
        private k e;
        private DDLoadParams f;
        private long g;

        public a(String str, BundleData bundleData, k kVar, DDLoadParams dDLoadParams) {
            Object[] objArr = {str, bundleData, kVar, dDLoadParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b0055fdee01e63f04584e6838dbc016", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b0055fdee01e63f04584e6838dbc016");
                return;
            }
            this.b = str;
            this.d = bundleData;
            this.e = kVar;
            this.f = dDLoadParams;
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea029fcb00eb72c9363053884890e116", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea029fcb00eb72c9363053884890e116");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ResourceDownloadHelper ResourceDownloadCallback start");
            bVar.a(aVar.getClass().getName(), aVar);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            if (this.g <= 0) {
                this.g = System.currentTimeMillis();
            }
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar, long j, int i) {
            Object[] objArr = {aVar, new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7710c065d3740debc7ae9fb4ea572d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7710c065d3740debc7ae9fb4ea572d");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ResourceDownloadHelper ResourceDownloadCallback success");
            bVar.a(aVar.getClass().getName(), aVar);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            if (this.e != null) {
                String str = null;
                String absolutePath = aVar.a().getAbsolutePath();
                if (i == 1 && this.d.getXzip() != null) {
                    str = this.d.getXzip().getMd5();
                    absolutePath = aVar.b().getAbsolutePath();
                } else if (i == 2 && this.d.getDiff() != null) {
                    str = this.d.getDiff().getDiffMd5();
                    absolutePath = aVar.b().getAbsolutePath();
                }
                DDResource.a aVar2 = new DDResource.a();
                aVar2.b = this.b;
                aVar2.c = this.d.bundleName;
                aVar2.d = this.d.getBundleVersion();
                aVar2.e = this.d.md5;
                aVar2.f = this.d.tags;
                aVar2.g = this.d.url;
                aVar2.i = this.d.mode;
                aVar2.h = absolutePath;
                aVar2.k = true ^ aVar.d();
                aVar2.l = this.d.noVersion;
                aVar2.m = this.d.getOriginMd5();
                aVar2.n = i;
                aVar2.o = str;
                this.e.onSuccess(aVar2.a());
                String str2 = this.f.preloadTag > 0 ? "preloadFull" : "full";
                if (aVar instanceof com.meituan.met.mercury.load.repository.task.c) {
                    str2 = this.f.preloadTag > 0 ? "preloadDiff" : "diff";
                } else if (aVar instanceof com.meituan.met.mercury.load.repository.task.d) {
                    str2 = this.f.preloadTag > 0 ? "preloadXzip" : "xzip";
                }
                a(this.b, this.d.bundleName, this.d.getBundleVersion(), str2, true, aVar.d(), System.currentTimeMillis() - this.g, 0);
            }
        }

        @Override // com.meituan.met.mercury.load.repository.task.a.AbstractC0388a
        public final void a(com.meituan.met.mercury.load.repository.task.a aVar, Exception exc) {
            f fVar;
            String str;
            Object[] objArr = {aVar, exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72adfe4c8fb3647783c68a70ba4055b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72adfe4c8fb3647783c68a70ba4055b5");
                return;
            }
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("ResourceDownloadHelper ResourceDownloadCallback fail");
            bVar.a(aVar.getClass().getName(), aVar).a(exc).a(exc == null ? "" : exc.toString());
            com.meituan.met.mercury.load.utils.c.b(bVar);
            com.meituan.met.mercury.load.repository.task.a aVar2 = null;
            boolean z = aVar instanceof com.meituan.met.mercury.load.repository.task.c;
            if (z) {
                aVar2 = s.d(this.b, this.d, this.f);
                if (aVar2 == null) {
                    aVar2 = s.c(this.b, this.d, this.f);
                }
            } else if (aVar instanceof com.meituan.met.mercury.load.repository.task.d) {
                aVar2 = s.c(this.b, this.d, this.f);
            }
            if (aVar2 != null) {
                aVar2.a(aVar.c());
                aVar2.a(this.b, this.d.bundleName, this.d.getBundleVersion());
                com.meituan.met.mercury.load.utils.b bVar2 = new com.meituan.met.mercury.load.utils.b("ResourceDownloadHelper ResourceDownloadCallback fallback");
                bVar2.a("originTask", aVar);
                bVar2.a("fallbackTask", aVar2);
                com.meituan.met.mercury.load.utils.c.a(bVar2);
                s.b(this.b).execute(aVar2);
            } else if (this.e != null) {
                if (exc instanceof f) {
                    fVar = (f) exc;
                    if (TextUtils.isEmpty(fVar.d)) {
                        fVar.d = this.d.bundleName;
                    }
                    if (TextUtils.isEmpty(fVar.e)) {
                        fVar.e = this.d.getBundleVersion();
                    }
                } else {
                    fVar = new f((short) 7, exc != null ? exc.toString() : "download fail !", this.d.bundleName, this.d.getBundleVersion(), exc);
                }
                this.e.onFail(fVar);
                String str2 = this.f.preloadTag > 0 ? "preloadFull" : "full";
                if (z) {
                    str = this.f.preloadTag > 0 ? "preloadDiff" : "diff";
                } else {
                    if (aVar instanceof com.meituan.met.mercury.load.repository.task.d) {
                        str = this.f.preloadTag > 0 ? "preloadXzip" : "xzip";
                    }
                    a(this.b, this.d.bundleName, this.d.getBundleVersion(), str2, false, false, System.currentTimeMillis() - this.g, fVar.c);
                }
                str2 = str;
                a(this.b, this.d.bundleName, this.d.getBundleVersion(), str2, false, false, System.currentTimeMillis() - this.g, fVar.c);
            }
        }

        private void a(String str, String str2, String str3, String str4, boolean z, boolean z2, long j, int i) {
            Object[] objArr = {str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e08e7cafb431758f2bbb48e7621eb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e08e7cafb431758f2bbb48e7621eb9");
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
}
