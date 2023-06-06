package com.meituan.android.loader.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Keep;
import com.meituan.android.loader.c;
import com.meituan.android.loader.impl.bean.DynRunParam;
import com.meituan.android.loader.impl.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynLoaderImpl implements com.meituan.android.loader.e {
    public static ChangeQuickRedirect a;
    private static boolean b;

    @Override // com.meituan.android.loader.e
    public final boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f361cbef42a86d182f979faa72ca3cd1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f361cbef42a86d182f979faa72ca3cd1")).booleanValue();
        }
        if (str == null || str.contains("../")) {
            return false;
        }
        if (i == 2) {
            String str2 = b.c + File.separator + str;
            if (new File(str2).exists()) {
                int a2 = d.a(str.split("/")[0], 2);
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoaderImpl Type_ASSETS dynFilePath=" + str2 + ", exists=true, getstate=" + a2);
                if (a2 == 2) {
                    a(i, str);
                    return true;
                }
            } else {
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoaderImpl Type_ASSETS dynFilePath=" + str2 + ", exists=false");
            }
            if (a(a.e.getAssets(), str)) {
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoaderImpl Type_ASSETS isAssetsFileExist true");
                a(i, str);
                return true;
            }
            a(i, str, -1);
            return false;
        } else if (i == 1) {
            String str3 = com.meituan.android.loader.g.c + File.separator + APKStructure.Lib_Type + str + ".so";
            File file = new File(str3);
            int a3 = d.a(str, 1);
            f.d(">>>DynLoaderImpl available Type_LIB localABIdynFilePath=" + str3 + ", 111 exists=" + file.exists() + ", getstate:" + a3 + ",fileName=" + str);
            if (file.exists() && a3 == 2) {
                a(i, str);
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoaderImpl Type_LIB localABIdynFilePath=" + str3 + ", 111 verify success!!");
                return true;
            }
            String str4 = com.meituan.android.loader.g.b + File.separator + APKStructure.Lib_Type + str + ".so";
            File file2 = new File(str4);
            f.d(">>>DynLoaderImpl available Type_LIB dynFilePath=" + str4 + ", 222 exists=" + file2.exists() + ", getstate:" + a3 + ",fileName=" + str);
            if (file2.exists() && a3 == 2) {
                a(i, str);
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoaderImpl Type_LIB dynFilePath=" + str4 + ", 222 verify success!!");
                return true;
            }
            File file3 = new File(a.e.getApplicationInfo().nativeLibraryDir + File.separator + APKStructure.Lib_Type + str + ".so");
            StringBuilder sb = new StringBuilder(">>>DynLoaderImpl Type_LIB loacalDynfile=");
            sb.append(file3);
            sb.append(", 333 exists=");
            sb.append(file3.exists());
            com.meituan.android.loader.impl.utils.b.a(sb.toString());
            if (file3.exists()) {
                a(i, str);
                return true;
            }
            a(i, str, a3);
            return false;
        } else {
            return false;
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eaeb3f6031bbe776be7f6ffbc53e79a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eaeb3f6031bbe776be7f6ffbc53e79a");
            return;
        }
        h a2 = h.a();
        h a3 = h.a();
        a3.getClass();
        h.a aVar = new h.a();
        aVar.c = str;
        aVar.b = "DynLoaderAvailableSuccess";
        a2.a(aVar);
    }

    private void a(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9468dc8c68f4ae760f78e83022049cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9468dc8c68f4ae760f78e83022049cb");
            return;
        }
        h a2 = h.a();
        h a3 = h.a();
        a3.getClass();
        h.a aVar = new h.a();
        aVar.c = str;
        aVar.b = "DynLoaderAvailableFail";
        aVar.e = String.valueOf(i2);
        a2.a(aVar);
    }

    private boolean a(AssetManager assetManager, String str) {
        Object[] objArr = {assetManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff07b36bccdf335ddd5b0821de03dad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff07b36bccdf335ddd5b0821de03dad")).booleanValue();
        }
        try {
            assetManager.open(str);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Keep
    private String getLibPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf9314a6ea714572aa4230c3f9ac840", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf9314a6ea714572aa4230c3f9ac840");
        }
        String str2 = com.meituan.android.loader.g.c + File.separator + APKStructure.Lib_Type + str + ".so";
        if (new File(str2).exists()) {
            return str2;
        }
        String str3 = com.meituan.android.loader.g.b + File.separator + APKStructure.Lib_Type + str + ".so";
        if (new File(str3).exists()) {
            return str3;
        }
        return null;
    }

    @Keep
    public String getAssetPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad84f97c4f6984e69293a6f3afd9baf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad84f97c4f6984e69293a6f3afd9baf");
        }
        if (str == null || str.contains("../")) {
            return null;
        }
        String str2 = b.c + File.separator + str;
        if (new File(str2).exists()) {
            return str2;
        }
        return null;
    }

    @Override // com.meituan.android.loader.e
    public final InputStream a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4abbc44157c8b711255986ab8396b4", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4abbc44157c8b711255986ab8396b4") : b(context, str);
    }

    private InputStream b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be06a7ea253514547b6a29ac47acb90f", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be06a7ea253514547b6a29ac47acb90f");
        }
        String str2 = b.c + File.separator + str;
        if (!new File(str2).exists()) {
            try {
                return context.getApplicationContext().getAssets().open(str);
            } catch (IOException unused) {
                h.a().a((Throwable) null, "DynLoaderImpl.open");
                return null;
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str2);
            h a2 = h.a();
            a2.getClass();
            h.a aVar = new h.a();
            aVar.c = str;
            aVar.b = "DynLoaderOpenAssetSuccess";
            h.a().a(aVar);
            return fileInputStream;
        } catch (Exception e) {
            h a3 = h.a();
            a3.getClass();
            h.a aVar2 = new h.a();
            aVar2.c = str;
            aVar2.d = e.getMessage();
            aVar2.b = "DynLoaderOpenAssetFail";
            h.a().a(aVar2);
            return null;
        }
    }

    @Override // com.meituan.android.loader.e
    public final void a(com.meituan.android.loader.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d59424c42b83cfe8f21d1205e56aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d59424c42b83cfe8f21d1205e56aa6");
        } else {
            a.a(aVar, null, false);
        }
    }

    @Override // com.meituan.android.loader.e
    public final void a(com.meituan.android.loader.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482e7f626a4a4a015bdec0481f1965be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482e7f626a4a4a015bdec0481f1965be");
        } else {
            a.a(aVar, null, z);
        }
    }

    @Override // com.meituan.android.loader.e
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f4a6cece7950fbd9be8c1adf8c2b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f4a6cece7950fbd9be8c1adf8c2b22");
        } else {
            a.a(z);
        }
    }

    @Override // com.meituan.android.loader.e
    public final int a() {
        return a.f;
    }

    @Override // com.meituan.android.loader.e
    public final String b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e08431fef4cf5e8f56d33bb5e9470ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e08431fef4cf5e8f56d33bb5e9470ea");
        }
        if (str == null || str.contains("../")) {
            return null;
        }
        if (i == 2) {
            return getAssetPath(str);
        }
        if (i == 1) {
            return getLibPath(str);
        }
        return null;
    }

    @Override // com.meituan.android.loader.e
    public final void a(com.meituan.android.loader.a aVar, com.meituan.android.loader.c cVar, boolean z) {
        Object[] objArr = {aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3038ab3ab4c76c4a015b91a53c53c177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3038ab3ab4c76c4a015b91a53c53c177");
        } else {
            a.a(aVar, cVar, z);
        }
    }

    @Override // com.meituan.android.loader.e
    public final synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4896790c9039845f1b4d9cbc93afa0fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4896790c9039845f1b4d9cbc93afa0fc")).booleanValue();
        }
        boolean b2 = b(str);
        if (a.a()) {
            com.meituan.android.loader.c cVar = new c.a().a(Arrays.asList(str)).b;
            f.d("加载之后拉取资源更新 " + str);
            a.a(null, cVar, false, DynRunParam.genePreDownloadAfterLoadRunParam(b2));
        }
        return b2;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1621a979bcfd06d99a128f8f2356a2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1621a979bcfd06d99a128f8f2356a2c")).booleanValue();
        }
        f.d(">>>Dynloader start load " + str);
        b();
        if (b) {
            try {
                try {
                    f.d(">>>Dynloader before System.loadLibrary " + str);
                    System.loadLibrary(str);
                    f.d(">>>Dynloader after System.loadLibrary " + str);
                    c(str);
                    return true;
                } catch (Throwable th) {
                    h.a().a(th, "DynLoaderImpl.load");
                    try {
                        f.d(">>>Dynloader before SoLoader.loadLibraryWithRelink " + str);
                        com.meituan.android.soloader.k.b(str);
                        f.d(">>>Dynloader after SoLoader.loadLibraryWithRelink " + str);
                        c(str);
                        return true;
                    } catch (Throwable unused) {
                        a(str, th.getMessage());
                        f.d(">>>Dynloader load fail, libName:" + str + ", errorMsg:" + th.getMessage());
                        return false;
                    }
                }
            } catch (Throwable unused2) {
                String libPath = getLibPath(str);
                if (libPath != null) {
                    f.d(">>>Dynloader before System.load " + libPath);
                    System.load(libPath);
                    f.d(">>>Dynloader after System.load " + libPath);
                    c(str);
                    return true;
                }
                a(str, "soPath is null");
                h.a().a((Throwable) null, "DynLoaderImpl.load");
                return false;
            }
        }
        return false;
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fabca85bd548fc7f77ec00c5c0ae419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fabca85bd548fc7f77ec00c5c0ae419");
            return;
        }
        com.meituan.android.loader.impl.provider.a.a(a.e, str, true);
        h a2 = h.a();
        a2.getClass();
        h.a aVar = new h.a();
        aVar.c = str;
        aVar.b = "DynLoaderLoadSoSuccess";
        h.a().a(aVar);
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac48ec70271f069c4090f1067cf5c493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac48ec70271f069c4090f1067cf5c493");
            return;
        }
        h a2 = h.a();
        a2.getClass();
        h.a aVar = new h.a();
        aVar.c = str;
        aVar.b = "DynLoaderLoadSoFail";
        aVar.d = str2;
        h.a().a(aVar);
    }

    @Override // com.meituan.android.loader.e
    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b09a47daf37252f716e2d8bb9ceb495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b09a47daf37252f716e2d8bb9ceb495");
        } else if (b) {
        } else {
            if (com.meituan.android.loader.g.b.equals(com.meituan.android.loader.g.c)) {
                z = d(com.meituan.android.loader.g.b);
            } else {
                b = d(com.meituan.android.loader.g.b);
                if (d(com.meituan.android.loader.g.c) && b) {
                    z = true;
                }
            }
            b = z;
        }
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d8645c7860e18a217029830d1cf131", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d8645c7860e18a217029830d1cf131")).booleanValue();
        }
        String a2 = com.meituan.android.loader.g.a(a.e, str);
        if (a2 == null) {
            h.a().a((DynFile) null, "DynLoaderApplySuccess");
        } else {
            h.a().a((DynFile) null, "DynLoaderApplyFail", a2);
        }
        return a2 == null;
    }
}
