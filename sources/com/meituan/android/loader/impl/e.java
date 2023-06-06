package com.meituan.android.loader.impl;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, a> b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public volatile boolean a = false;
        public volatile String b;
        public volatile String c;
    }

    public static String a(DynFile dynFile, String str) throws IOException {
        Object[] objArr = {dynFile, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f3f2e75b43d50cf32524730abf500eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f3f2e75b43d50cf32524730abf500eb");
        }
        if (dynFile.getBundleName() == null) {
            f.e("资源bundleName为null，不会创建单独的文件锁！");
        }
        try {
            return b(dynFile, str);
        } catch (Throwable unused) {
            f.e(">>>>DynloaderUtils unZipAPk fail in lock. bundleName:" + dynFile.getBundleName());
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c8 A[Catch: Throwable -> 0x0370, TRY_ENTER, TryCatch #4 {Throwable -> 0x0370, blocks: (B:33:0x00dd, B:35:0x00e3, B:37:0x00e9, B:39:0x00f1, B:42:0x0122, B:63:0x017b, B:65:0x019c, B:67:0x01a6, B:68:0x01ad, B:75:0x01e9, B:77:0x01f5, B:78:0x0210, B:80:0x0217, B:82:0x0223, B:83:0x0236, B:85:0x023c, B:86:0x0261, B:100:0x02c8, B:101:0x02ce, B:44:0x0129, B:48:0x0132, B:50:0x013e, B:53:0x0147, B:55:0x014f, B:57:0x0157, B:59:0x0166, B:60:0x016a), top: B:157:0x00dd }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(com.meituan.android.loader.impl.DynFile r23, java.lang.String r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.loader.impl.e.b(com.meituan.android.loader.impl.DynFile, java.lang.String):java.lang.String");
    }

    public static boolean a(String str, DynFile dynFile) {
        a aVar;
        boolean z = false;
        Object[] objArr = {str, dynFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "080e3a2c65f43e7fededc605c66abbb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "080e3a2c65f43e7fededc605c66abbb5")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str) || dynFile.getLocalPath() == null || !new File(dynFile.getLocalPath()).exists()) {
            return false;
        }
        if (dynFile.getType() == 1) {
            if (dynFile.getLocalPath().endsWith("_tmp_")) {
                String localPath = dynFile.getLocalPath();
                if (!com.meituan.android.loader.impl.provider.a.a(com.meituan.android.loader.impl.a.e, str)) {
                    File file = new File(localPath);
                    String substring = localPath.substring(0, localPath.length() - 5);
                    File file2 = new File(substring);
                    com.meituan.android.loader.impl.utils.b.a(">>>DynLoader tryRenameSoFileAndTagVerify , soName=" + str + ", tmpLocalPath=" + localPath + ", finalLocalPath=" + substring);
                    String tempZipPath = dynFile.getTempZipPath();
                    synchronized (b) {
                        aVar = b.get(tempZipPath);
                        if (aVar == null) {
                            aVar = new a();
                            b.put(tempZipPath, aVar);
                        }
                    }
                    synchronized (b.get(tempZipPath)) {
                        if (file.renameTo(file2)) {
                            aVar.a = true;
                            aVar.b = substring;
                            aVar.c = dynFile.getCurOriginMd5();
                            dynFile.setLocalPath(substring);
                            dynFile.setLocalPathBundleVersion(dynFile.getCurBundleVersion());
                            f.d(">>>DynLoaderUtils tryRenameSoFileAndTagVerify rename success, bundleName:" + dynFile.getBundleName() + ", timems:" + (System.currentTimeMillis() - currentTimeMillis));
                            z = true;
                        }
                    }
                    d.a(str, 2, dynFile.getType());
                } else {
                    d.a(str, 2, dynFile.getType());
                    f.d(">>>DynLoader tryRenameSoFileAndTagVerify, so is already loaded, rename abort, soName=" + str);
                }
            } else {
                d.a(str, 2, dynFile.getType());
                com.meituan.android.loader.impl.utils.b.a(">>>DynLoader tryRenameSoFileAndTagVerify, not end with _tmp_, rename abort, soName=" + str);
            }
        } else if (dynFile.getType() == 2) {
            d.a(str, 2, dynFile.getType());
            com.meituan.android.loader.impl.utils.b.a(">>>DynLoader tryRenameSoFileAndTagVerify, assets exitsts, soName=" + str);
        }
        return z;
    }
}
