package com.meituan.msc.modules.service.codecache;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.jse.bridge.JSCodeCacheCreator;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.i;
import com.meituan.msc.modules.engine.j;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.modules.update.packageattachment.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private final d c;
    private final com.meituan.msc.modules.preload.executor.e d;

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07a97f5fcee10c5870efbd460cf33f21", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07a97f5fcee10c5870efbd460cf33f21");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c(context, com.meituan.msc.modules.update.packageattachment.e.a(context));
                }
            }
        }
        return b;
    }

    public static synchronized c a() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62b698c39a617a435040491d30275dfb", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62b698c39a617a435040491d30275dfb");
            } else if (b == null) {
                throw new IllegalStateException("createInstance() needs to be called before getInstance()");
            } else {
                return b;
            }
        }
    }

    private c(Context context, com.meituan.msc.modules.update.packageattachment.e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2450d736b1e905a8f8a3375ce3fff98e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2450d736b1e905a8f8a3375ce3fff98e");
            return;
        }
        this.d = eVar.b;
        CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
        this.c = CodeCacheConfig.e() ? new d(context, this.d) : null;
    }

    public final String a(h hVar, PackageInfoWrapper packageInfoWrapper, DioFile dioFile, String str, boolean z) {
        Object[] objArr = {hVar, packageInfoWrapper, dioFile, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee01b51ca247dcf916d7e6b91704cb5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee01b51ca247dcf916d7e6b91704cb5a");
        }
        if (packageInfoWrapper == null || !CodeCacheConfig.d.c(packageInfoWrapper.appId)) {
            return null;
        }
        com.meituan.msc.modules.service.codecache.a aVar = new com.meituan.msc.modules.service.codecache.a(packageInfoWrapper.appId, i.a(hVar), packageInfoWrapper, dioFile, str);
        String absolutePath = b(aVar).getAbsolutePath();
        c(aVar);
        return absolutePath;
    }

    public final LoadJSCodeCacheCallback a(@NonNull h hVar, DioFile dioFile) {
        Object[] objArr = {hVar, dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2071a0389ba76e539b18c89155773cfc", RobustBitConfig.DEFAULT_VALUE) ? (LoadJSCodeCacheCallback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2071a0389ba76e539b18c89155773cfc") : new a(hVar);
    }

    private File b(com.meituan.msc.modules.service.codecache.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20c4ef6ac4481223f4827f879ed45ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20c4ef6ac4481223f4827f879ed45ca");
        }
        com.meituan.msc.modules.update.packageattachment.d c = aVar.c();
        return c.a("codecache/" + aVar.a()).getAbsoluteFile();
    }

    private void c(com.meituan.msc.modules.service.codecache.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c867490d331c323658d34b224baeed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c867490d331c323658d34b224baeed0");
            return;
        }
        CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
        a(aVar, CodeCacheConfig.g() * 1000);
    }

    private void a(com.meituan.msc.modules.service.codecache.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28651cac35ae0f86c5ddbd431668e72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28651cac35ae0f86c5ddbd431668e72b");
        } else {
            this.d.a(new e(this, aVar), i);
        }
    }

    public final void a(String str, String str2, PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {str, str2, packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85828591c149c5b90979d369e3f3886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85828591c149c5b90979d369e3f3886");
        } else if (CodeCacheConfig.d.c(packageInfoWrapper.appId)) {
            this.d.b(new f(this, str, str2, packageInfoWrapper));
        }
    }

    public final boolean a(com.meituan.msc.modules.service.codecache.a aVar, boolean z) {
        boolean z2;
        Object[] objArr = {aVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f0c732f3c061dd6dbcc02a951dde25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f0c732f3c061dd6dbcc02a951dde25")).booleanValue();
        }
        if (aVar != null && CodeCacheConfig.d.c(aVar.getAppId())) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b8ff92cc8cce0a85814f8dcb2cada7a", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b8ff92cc8cce0a85814f8dcb2cada7a")).booleanValue();
            } else {
                File b2 = b(aVar);
                z2 = b2 != null && b2.exists();
            }
            return !z2;
        }
        return false;
    }

    public final void a(com.meituan.msc.modules.service.codecache.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e7c892967d3eeb5bdd32b5808ec2323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e7c892967d3eeb5bdd32b5808ec2323");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb0c93ff989b11ab3866e6d675602429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb0c93ff989b11ab3866e6d675602429");
            return;
        }
        com.meituan.msc.modules.update.packageattachment.d c = aVar.c();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.packageattachment.d.a;
        if (PatchProxy.isSupport(objArr3, c, changeQuickRedirect3, false, "ac77614faa8b2c503f0e68b5a75e563e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c, changeQuickRedirect3, false, "ac77614faa8b2c503f0e68b5a75e563e");
        } else {
            File a2 = c.a();
            if (!a2.exists()) {
                a2.mkdirs();
                CodeCacheConfig codeCacheConfig = CodeCacheConfig.d;
                if (CodeCacheConfig.h()) {
                    com.meituan.msc.modules.update.packageattachment.e eVar = c.b;
                    PackageInfoWrapper packageInfoWrapper = c.c;
                    Object[] objArr4 = {packageInfoWrapper, a2};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.packageattachment.e.a;
                    if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "7d89cc1ae40c94bea695fdedadf6b2ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "7d89cc1ae40c94bea695fdedadf6b2ac");
                    } else {
                        eVar.b.b(new com.meituan.msc.modules.update.packageattachment.a(eVar, new e.a(packageInfoWrapper.getLocalPath(), a2.getAbsolutePath())));
                    }
                } else {
                    com.meituan.msc.modules.update.packageattachment.e eVar2 = c.b;
                    PackageInfoWrapper packageInfoWrapper2 = c.c;
                    Object[] objArr5 = {packageInfoWrapper2, a2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.packageattachment.e.a;
                    if (PatchProxy.isSupport(objArr5, eVar2, changeQuickRedirect5, false, "1397ee426a964d5d519dda34698b55ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, eVar2, changeQuickRedirect5, false, "1397ee426a964d5d519dda34698b55ab");
                    } else {
                        eVar2.a(new e.a(packageInfoWrapper2.getLocalPath(), a2.getAbsolutePath()));
                    }
                }
            }
        }
        File b2 = b(aVar);
        DioFile dioFile = aVar.b;
        boolean createCodeCacheFromDioFile = JSCodeCacheCreator.createCodeCacheFromDioFile(dioFile.d().getAbsolutePath(), dioFile.a(), aVar.c, b2.getAbsolutePath());
        g.d("CodeCacheManager", "Create code cache: ", aVar.b, ", CodeCacheFile: ", b2, ", success: ", Boolean.valueOf(createCodeCacheFromDioFile));
        if (!createCodeCacheFromDioFile || this.c == null) {
            return;
        }
        d dVar = this.c;
        Object[] objArr6 = {aVar, b2};
        ChangeQuickRedirect changeQuickRedirect6 = d.a;
        if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "0ef17e3ba94aadfce879db9dd7b68f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "0ef17e3ba94aadfce879db9dd7b68f72");
            return;
        }
        String a3 = dVar.a(aVar.getAppId(), aVar.getPackageName(), aVar.getJsFileRelativePath());
        CodeCacheUsageInfo codeCacheUsageInfo = dVar.b.get(a3);
        String absolutePath = b2.getAbsolutePath();
        if (codeCacheUsageInfo != null) {
            codeCacheUsageInfo.setCodeCacheFile(absolutePath);
            codeCacheUsageInfo.setFileSize(b2.length());
            codeCacheUsageInfo.setMarkedToRemove(false);
            return;
        }
        CodeCacheUsageInfo codeCacheUsageInfo2 = new CodeCacheUsageInfo(aVar.getAppId(), aVar.getAppVersion(), aVar.getPackageName(), aVar.getJsFileRelativePath(), absolutePath, System.currentTimeMillis(), b2.length(), 0);
        codeCacheUsageInfo2.attachLocalCacheMap(dVar.b);
        dVar.b.put(a3, codeCacheUsageInfo2);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c899ac2681656c615f59c7762bf1e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c899ac2681656c615f59c7762bf1e0");
        } else if (this.c != null) {
            this.c.b(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements LoadJSCodeCacheCallback {
        public static ChangeQuickRedirect a;
        private final WeakReference<h> b;

        private a(h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5dc89f1ca7214a117f2aef5517c65c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5dc89f1ca7214a117f2aef5517c65c");
            } else {
                this.b = new WeakReference<>(hVar);
            }
        }

        @Override // com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback
        public final void onLoad(String str, String str2, LoadJSCodeCacheCallback.LoadStatus loadStatus) {
            Object[] objArr = {str, str2, loadStatus};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6281c6f7eaf89e3e5783fac5efac4807", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6281c6f7eaf89e3e5783fac5efac4807");
            } else if (TextUtils.isEmpty(str2)) {
            } else {
                switch (loadStatus) {
                    case invalid:
                    case unsupported:
                        g.d("CodeCache", "Load CodeCache, file: ", str2, "status: ", loadStatus);
                        new File(str2).delete();
                        break;
                }
                h hVar = this.b.get();
                if (hVar == null) {
                    return;
                }
                j jVar = hVar.p;
                Object[] objArr2 = {str2, loadStatus};
                ChangeQuickRedirect changeQuickRedirect2 = j.d;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "91288cf5bdf1246b50c9b9e46ddd7086", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "91288cf5bdf1246b50c9b9e46ddd7086");
                    return;
                }
                b bVar = jVar.g;
                Object[] objArr3 = {loadStatus};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "763ee11c29eaadc52253063020fd9806", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "763ee11c29eaadc52253063020fd9806");
                } else if (loadStatus != null) {
                    int[] iArr = bVar.b;
                    int ordinal = loadStatus.ordinal();
                    iArr[ordinal] = iArr[ordinal] + 1;
                }
            }
        }
    }
}
