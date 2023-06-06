package com.meituan.android.mrn.engine;

import android.text.TextUtils;
import com.meituan.android.mrn.update.ResponseBundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class y {
    public static ChangeQuickRedirect a;
    public static final Object b = new Object();

    public static boolean a(ResponseBundle responseBundle, File file) {
        boolean z;
        Object[] objArr = {responseBundle, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f762c013a8d1462bfc5856f439c9860", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f762c013a8d1462bfc5856f439c9860")).booleanValue();
        }
        com.meituan.android.mrn.config.horn.i iVar = com.meituan.android.mrn.config.horn.i.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.horn.i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "43297c2d0860ac82cba9e1a7c27dcdac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "43297c2d0860ac82cba9e1a7c27dcdac")).booleanValue() : ((Boolean) com.meituan.android.mrn.config.t.b.a("enableLog")).booleanValue()) {
            com.facebook.common.logging.a.b("[MRNMtPreDownload@installZipBundle]", "bundleName:" + responseBundle.name + " zipMd5:" + responseBundle.zipMd5 + " dioMd5:" + responseBundle.md5);
            StringBuilder sb = new StringBuilder("fileUrl:");
            sb.append(responseBundle.url);
            com.facebook.common.logging.a.b("[MRNMtPreDownload@installZipBundle]", sb.toString());
        }
        String a2 = com.sankuai.meituan.bundle.service.k.a(file);
        e bundle = MRNBundleManager.sharedInstance().getBundle(responseBundle.name, responseBundle.version);
        if (bundle != null) {
            z = bundle.j() ? true : h.b(bundle);
        } else {
            z = false;
        }
        if (z) {
            com.facebook.common.logging.a.b("[MRNMtPreDownload@installZipBundle]", "has same bundle in Bundles!");
            return true;
        } else if (!TextUtils.equals(responseBundle.zipMd5, a2)) {
            com.meituan.android.mrn.utils.k.b(file);
            com.facebook.common.logging.a.b("[MRNMtPreDownload@installZipBundle]", "check zipFile md5 failed! zipMd5:" + responseBundle.zipMd5 + " real file md5:" + a2);
            return false;
        } else {
            synchronized (b) {
                MRNBundleManager.sharedInstance().installBundleFromZipFile(responseBundle.name, responseBundle.version, file, responseBundle.md5);
            }
            return false;
        }
    }

    public static void a(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "632e9f29be2ee00b032034b0122f308b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "632e9f29be2ee00b032034b0122f308b");
        } else if (list != null) {
            for (e eVar : list) {
                if (eVar != null && eVar.j()) {
                    a(eVar, false);
                }
            }
        }
    }

    public static e a(e eVar, boolean z) {
        Object[] objArr = {eVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba73ef2b28487f15608b8d21fc119ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba73ef2b28487f15608b8d21fc119ec9");
        }
        synchronized (b) {
            File d = x.a().d(eVar.c, eVar.f);
            File file = new File(eVar.q);
            com.facebook.common.logging.a.b("[MRNMtPreDownload@dealZipBundle]", "start unzip bundleName:" + eVar.c + " dioMd5:" + eVar.r + " destName:" + d.getName() + " zipName:" + file.getName());
            if (!a(file, d)) {
                MRNBundleManager.sharedInstance().removeBundleForce(eVar);
                return null;
            }
            String a2 = com.sankuai.meituan.bundle.service.k.a(d);
            if (!TextUtils.equals(eVar.r, a2)) {
                com.facebook.common.logging.a.b("[MRNMtPreDownload@dealZipBundle]", "check dioFile md5 fail, dioMd5:" + eVar.r + " destMd5:" + a2);
                MRNBundleManager.sharedInstance().removeBundleForce(eVar);
                return null;
            }
            MRNBundleManager.sharedInstance().removeBundleForce(eVar);
            e installBundleFromFile = MRNBundleManager.sharedInstance().installBundleFromFile(d, false);
            com.facebook.common.logging.a.b("[MRNMtPreDownload@dealZipBundle]", "install bundleName:" + eVar.c + " destFileName:" + d.getName());
            if (TextUtils.equals(eVar.c, installBundleFromFile.c)) {
                return installBundleFromFile;
            }
            com.facebook.common.logging.a.b("[MRNMtPreDownload@dealZipBundle]", " getError bundle, need bundle:" + eVar.c + " get bundle:" + installBundleFromFile.c);
            return null;
        }
    }

    private static boolean a(File file, File file2) {
        ZipFile zipFile;
        IOException e;
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        ZipFile zipFile2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "584b9cd90efc5d49f946af82b3eb1ad0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "584b9cd90efc5d49f946af82b3eb1ad0")).booleanValue();
            }
            try {
                if (!file.exists()) {
                    com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", " source zipFile don't exit");
                    return false;
                }
                zipFile = new ZipFile(file);
                try {
                    if (zipFile.size() != 1) {
                        com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", " deleteFile ZipFile.size()!=1");
                        com.sankuai.meituan.bundle.service.k.b(file);
                        try {
                            zipFile.close();
                        } catch (Exception e2) {
                            com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e2.toString());
                        }
                        return false;
                    }
                    ZipEntry nextElement = zipFile.entries().nextElement();
                    if (nextElement == null) {
                        com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", " deleteFile zipEntry is null");
                        com.sankuai.meituan.bundle.service.k.b(file);
                        try {
                            zipFile.close();
                        } catch (Exception e3) {
                            com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e3.toString());
                        }
                        return false;
                    }
                    com.sankuai.meituan.bundle.service.k.c(file2);
                    com.sankuai.meituan.bundle.service.k.a(file2, zipFile.getInputStream(nextElement));
                    com.sankuai.meituan.bundle.service.k.b(file);
                    if (file2.exists()) {
                        com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", " unzipFile success and delete source file，sourceFilePath:" + file.getAbsoluteFile());
                        try {
                            zipFile.close();
                        } catch (Exception e4) {
                            com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e4.toString());
                        }
                        return true;
                    }
                    com.facebook.common.logging.a.b("[MRNMtPreDownload@makeUnzip]", " destFile.exists() is false:" + file2.getAbsolutePath());
                    try {
                        zipFile.close();
                    } catch (Exception e5) {
                        com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e5.toString());
                    }
                    return false;
                } catch (IOException e6) {
                    e = e6;
                    zipFile2 = zipFile;
                    e.printStackTrace();
                    com.facebook.common.logging.a.a("[MRNMtPreDownload@makeUnzip]", " catchException:", e.getMessage());
                    if (file.exists()) {
                        boolean a2 = com.sankuai.meituan.bundle.service.util.c.a(file, file2);
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                            } catch (Exception e7) {
                                com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e7.toString());
                            }
                        }
                        return a2;
                    }
                    com.facebook.common.logging.a.b("[MRNMtPreDownload@makeUnzip]", " zipFile is not exit");
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception e8) {
                            com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e8.toString());
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e9) {
                            com.facebook.common.logging.a.b("[MRNMtPreDownload@unzipFile]", "Exception:" + e9.toString());
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
    }
}
