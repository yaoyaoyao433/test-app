package com.meituan.mmp.lib;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.MMPUpdateConfig;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.mmp.lib.utils.am;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static final List<MMPUpdateConfig> b = new CopyOnWriteArrayList();

    public static /* synthetic */ void a(MMPUpdateConfig mMPUpdateConfig) {
        Object[] objArr = {mMPUpdateConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b93917ef9c944e68c456eafff46fc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b93917ef9c944e68c456eafff46fc85");
        } else {
            b.remove(mMPUpdateConfig);
        }
    }

    public static void a(final Context context) {
        boolean z;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1c382c783739c8c00606bd15117a3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1c382c783739c8c00606bd15117a3af");
            return;
        }
        Object[] objArr2 = {context, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "30815f62687244d64dca6927d832cd93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "30815f62687244d64dca6927d832cd93");
            return;
        }
        final MMPHornPreloadConfig a2 = MMPHornPreloadConfig.a();
        if (!a2.d.isDefaultConfig) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MMPHornPreloadConfig.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d47efec181589d7910a391c174cecca2", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d47efec181589d7910a391c174cecca2")).booleanValue();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z2 = a2.d() == 0 || a2.d() + a2.e() <= currentTimeMillis;
                if (z2) {
                    Object[] objArr4 = {new Long(currentTimeMillis)};
                    ChangeQuickRedirect changeQuickRedirect4 = MMPHornPreloadConfig.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "a78d0fb67768d1c84273b69e6fd8e2c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "a78d0fb67768d1c84273b69e6fd8e2c8");
                    } else {
                        SharedPreferences.Editor edit = a2.c.edit();
                        edit.putLong("lastCheck", currentTimeMillis);
                        edit.apply();
                    }
                }
                z = z2;
            }
            if (!z) {
                com.meituan.mmp.lib.trace.b.b("MMPPrefetch", "MMPPrefetch skip for time limit");
                return;
            }
            DebugHelper.a();
            if (DebugHelper.h) {
                com.meituan.mmp.lib.trace.b.b("MMPPrefetch", "MMPPrefetch skip for keepCachedVersion");
            } else {
                com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.r.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "347ed1e3408a2c80508e83138d7fbe99", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "347ed1e3408a2c80508e83138d7fbe99");
                        } else {
                            com.meituan.mmp.lib.update.k.a(new Runnable() { // from class: com.meituan.mmp.lib.r.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "335049c1dc11ec7fc27ee5ae2a8ea7f4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "335049c1dc11ec7fc27ee5ae2a8ea7f4");
                                        return;
                                    }
                                    MMPEnvHelper.ensureFullInited();
                                    r.a(context, a2);
                                }
                            });
                        }
                    }
                }, a2.d.prefetchEarliestTime);
            }
        }
    }

    private static boolean a(MMPHornPreloadConfig.PrefetchAppInfo prefetchAppInfo, Context context) {
        Object[] objArr = {prefetchAppInfo, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f70af4f1b715f9491c462f2b173072f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f70af4f1b715f9491c462f2b173072f0")).booleanValue();
        }
        if (TextUtils.isEmpty(prefetchAppInfo.appId)) {
            return false;
        }
        if (!prefetchAppInfo.onlyWifi || am.b(context)) {
            if (prefetchAppInfo.cityIds == null || prefetchAppInfo.cityIds.length == 0) {
                return true;
            }
            com.meituan.mmp.main.k cityController = MMPEnvHelper.getCityController();
            if (cityController == null) {
                return false;
            }
            long a2 = cityController.a();
            if (a2 == 0) {
                Log.e("MMPPrefetch", "empty city id");
                return false;
            }
            for (long j : prefetchAppInfo.cityIds) {
                if (a2 == j) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.mmp.lib.update.a {
        public static ChangeQuickRedirect a;

        public a(com.meituan.mmp.lib.trace.h hVar) {
            super(hVar);
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acbcc0a633b98f067a48442f80e09e69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acbcc0a633b98f067a48442f80e09e69");
            }
        }

        @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
        public final void a(boolean z, MMPAppProp mMPAppProp) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), mMPAppProp};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260d378055632180b8e7b85be8b143f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260d378055632180b8e7b85be8b143f2");
                return;
            }
            this.c.a("update", Boolean.valueOf(z));
            this.c.a("mmp.prefetch.point.checkupdate", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", "success"));
        }

        @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
        public final void a(String str, Throwable th) {
            Object[] objArr = {str, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af64eb6797a0a4c751abac480425ca4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af64eb6797a0a4c751abac480425ca4");
            } else {
                this.c.a("mmp.prefetch.point.checkupdate", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("state", "failed", "reason", str));
            }
        }

        @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
        public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
            Object[] objArr = {mMPAppProp, mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a3aa2a9a0d42d71de1f6ab6d387fc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a3aa2a9a0d42d71de1f6ab6d387fc5");
                return;
            }
            super.a(mMPAppProp, mMPPackageInfo);
            if (mMPPackageInfo != null) {
                this.c.a("mmp.prefetch.duration.download.package", mMPPackageInfo.g);
            }
        }

        @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
        public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, boolean z) {
            Object[] objArr = {mMPAppProp, mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "662fbf750c819e5e47abc88bdd4cd597", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "662fbf750c819e5e47abc88bdd4cd597");
                return;
            }
            super.a(mMPAppProp, mMPPackageInfo, z);
            if (mMPPackageInfo != null) {
                com.meituan.mmp.lib.trace.h hVar = this.c;
                String str = mMPPackageInfo.g;
                HashMap a2 = com.meituan.mmp.lib.utils.v.a("packageName", mMPPackageInfo.g);
                Object[] objArr2 = {"mmp.prefetch.duration.download.package", str, a2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.trace.h.a;
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "5ce1ef7281eba9021d5ffd6f4ea77ccb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "5ce1ef7281eba9021d5ffd6f4ea77ccb");
                } else {
                    hVar.a("mmp.prefetch.duration.download.package", str, hVar.a(a2, "success"));
                }
            }
        }

        @Override // com.meituan.mmp.lib.update.a, com.meituan.mmp.lib.update.m
        public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Throwable th) {
            Object[] objArr = {mMPAppProp, mMPPackageInfo, str, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c563622800de2500b76e4d3a0be198", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c563622800de2500b76e4d3a0be198");
                return;
            }
            super.a(mMPAppProp, mMPPackageInfo, str, th);
            if (mMPPackageInfo != null) {
                com.meituan.mmp.lib.trace.h hVar = this.c;
                String str2 = mMPPackageInfo.g;
                HashMap a2 = com.meituan.mmp.lib.utils.v.a("packageName", mMPPackageInfo.g);
                Object[] objArr2 = {"mmp.prefetch.duration.download.package", str2, a2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.trace.h.a;
                if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "0d31373ee0b1fbad38781f2a4c2002f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "0d31373ee0b1fbad38781f2a4c2002f6");
                } else {
                    hVar.a("mmp.prefetch.duration.download.package", str2, hVar.a(a2, "fail"));
                }
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f18e61e152a01c11844745ec7ba6e36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f18e61e152a01c11844745ec7ba6e36");
        } else if (!b.isEmpty()) {
            b.a.a("MMPPrefetch", "cancel " + b.size() + " prefetch tasks by mini app launch");
            for (MMPUpdateConfig mMPUpdateConfig : b) {
                mMPUpdateConfig.j = true;
            }
        }
    }

    public static void a(Context context, MMPHornPreloadConfig mMPHornPreloadConfig) {
        Object[] objArr = {context, mMPHornPreloadConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32cf9387e5fd9f25850c6d1cf76f6948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32cf9387e5fd9f25850c6d1cf76f6948");
            return;
        }
        MMPHornPreloadConfig.PrefetchAppInfo[] prefetchAppInfoArr = !mMPHornPreloadConfig.d.enablePrefetch ? null : mMPHornPreloadConfig.d.prefetchApps;
        if (prefetchAppInfoArr == null) {
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPPrefetch", "updateMMPApps: " + prefetchAppInfoArr.length);
        final ArrayList<MMPHornPreloadConfig.PrefetchAppInfo> arrayList = new ArrayList();
        boolean z = mMPHornPreloadConfig.d.unzipAfterPrefetch;
        for (MMPHornPreloadConfig.PrefetchAppInfo prefetchAppInfo : prefetchAppInfoArr) {
            if (a(prefetchAppInfo, context)) {
                arrayList.add(prefetchAppInfo);
            }
        }
        for (final MMPHornPreloadConfig.PrefetchAppInfo prefetchAppInfo2 : arrayList) {
            com.meituan.mmp.lib.trace.b.b("MMPPrefetch", "updateMMPApp " + prefetchAppInfo2.appId);
            String str = prefetchAppInfo2.appId;
            final s sVar = new s() { // from class: com.meituan.mmp.lib.r.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.s
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d5f3945fc6c4100cb95ba9093c29128", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d5f3945fc6c4100cb95ba9093c29128");
                    } else if (arrayList.lastIndexOf(prefetchAppInfo2) == arrayList.size() - 1) {
                        PackageManageUtil.a((MMPAppProp) null, true);
                    }
                }
            };
            Object[] objArr2 = {str, context, Byte.valueOf(z ? (byte) 1 : (byte) 0), null, sVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3a717a751f604a67286a3bd47101a05a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3a717a751f604a67286a3bd47101a05a");
            } else {
                final MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig();
                mMPUpdateConfig.b = str;
                mMPUpdateConfig.c = z;
                final com.meituan.mmp.lib.trace.h hVar = new com.meituan.mmp.lib.trace.h(context, str);
                if (TextUtils.isEmpty(null)) {
                    hVar.a("source", (Object) 3);
                } else {
                    mMPUpdateConfig.h = 5;
                    mMPUpdateConfig.k = null;
                    hVar.a("extraPreloadSource", (Object) null);
                    hVar.a("source", (Object) 5);
                }
                hVar.b("mmp.preload.start", (Map<String, Object>) null);
                Object[] objArr3 = {mMPUpdateConfig};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4a426f14880dcb4d824f442511a2ea9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4a426f14880dcb4d824f442511a2ea9e");
                } else {
                    b.add(mMPUpdateConfig);
                }
                com.meituan.mmp.lib.update.k.a().b(mMPUpdateConfig, new com.meituan.mmp.lib.update.i() { // from class: com.meituan.mmp.lib.r.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.update.i
                    public final void a(MMPAppProp mMPAppProp) {
                    }

                    @Override // com.meituan.mmp.lib.update.i
                    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
                    }

                    @Override // com.meituan.mmp.lib.update.i
                    public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
                        Object[] objArr4 = {mMPAppProp, list};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "228b836cd9dace152b781ad010e95c25", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "228b836cd9dace152b781ad010e95c25");
                            return;
                        }
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2674702b4f28fcaf7c2c7c81b7cfaa3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2674702b4f28fcaf7c2c7c81b7cfaa3f");
                            return;
                        }
                        com.meituan.mmp.lib.trace.h.this.a("mmp.prefetch.point.full.prefetch", (Map<String, Object>) null);
                        com.meituan.mmp.lib.trace.h.this.b("mmp.preload.success", (Map<String, Object>) null);
                        if (sVar != null) {
                            sVar.a();
                        }
                        r.a(mMPUpdateConfig);
                    }

                    @Override // com.meituan.mmp.lib.update.i
                    public final void a(MMPAppProp mMPAppProp, String str2, Exception exc) {
                        Object[] objArr4 = {mMPAppProp, str2, exc};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9856e93d69f23091fe89c3ac1b401604", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9856e93d69f23091fe89c3ac1b401604");
                            return;
                        }
                        String message = exc == null ? "" : exc.getMessage();
                        Object[] objArr5 = {str2, message};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "af355c035aa4938ac40b7eb639166667", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "af355c035aa4938ac40b7eb639166667");
                            return;
                        }
                        com.meituan.mmp.lib.trace.h.this.b("mmp.preload.fail", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("reason", str2, GearsLocator.DETAIL, message));
                        if (sVar != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(CommonConstant.Symbol.COLON);
                            sb.append(message);
                        }
                        r.a(mMPUpdateConfig);
                    }
                }, new a(hVar));
            }
        }
    }
}
