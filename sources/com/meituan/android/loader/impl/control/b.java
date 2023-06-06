package com.meituan.android.loader.impl.control;

import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.loader.impl.DynFile;
import com.meituan.android.loader.impl.bean.DynRunParam;
import com.meituan.android.loader.impl.e;
import com.meituan.android.loader.impl.f;
import com.meituan.android.loader.impl.h;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b f;
    Set<DynFile> b;
    @NonNull
    protected DynRunParam c;
    protected String d;
    protected boolean e;
    private com.meituan.android.loader.c g;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c704ffa85e0f7e3be3c137f3dfe08f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c704ffa85e0f7e3be3c137f3dfe08f4");
        }
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    f = new b();
                }
            }
        }
        return f;
    }

    public final Set<DynFile> a(Set<DynFile> set, Set<DynFile> set2, com.meituan.android.loader.c cVar, DynRunParam dynRunParam, boolean z) {
        Object[] objArr = {set, set2, cVar, dynRunParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4111893f852b583bf0a04c53c384d569", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4111893f852b583bf0a04c53c384d569");
        }
        f.a("GeneralControllerV2 update", "update start");
        this.c = dynRunParam;
        this.g = cVar;
        this.b = set;
        this.e = z;
        a(set2);
        Map<String, DynFile> a2 = a(set, set2);
        HashMap hashMap = new HashMap();
        for (DynFile dynFile : a2.values()) {
            if (a(dynFile)) {
                hashMap.put(dynFile.getBundleName().toLowerCase(), dynFile);
            }
        }
        Map<String, DynFile> a3 = new c(this).a(a2, hashMap);
        d dVar = new d(this);
        Object[] objArr2 = {a2, a3};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "3eb0797d161e0d25db1f1743680c6e82", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "3eb0797d161e0d25db1f1743680c6e82");
        }
        dVar.c = a2;
        Map<String, DynFile> a4 = dVar.a(a3);
        if (a3 == null || a3.isEmpty()) {
            return null;
        }
        return dVar.a(a3, dVar.a(a4, dVar.b(a4)));
    }

    private boolean a(DynFile dynFile) {
        String name;
        Object[] objArr = {dynFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19b1ae1246febd511099ede9d9e2f2f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19b1ae1246febd511099ede9d9e2f2f5")).booleanValue();
        }
        if (!this.c.shouldDownloadAllDyn || dynFile.isInnerSo()) {
            if (dynFile.isInnerSo() || this.g == null || (name = dynFile.getName()) == null) {
                return false;
            }
            if (dynFile.getType() != 1) {
                if (dynFile.getType() == 2) {
                    if (this.g.c != null) {
                        for (String str : this.g.c) {
                            if (str.contains(name)) {
                                return true;
                            }
                        }
                    }
                    if (this.g.e != null) {
                        for (String str2 : this.g.e) {
                            if (str2.contains(name)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                if (this.g.b != null) {
                    for (String str3 : this.g.b) {
                        if (TextUtils.equals(str3, name)) {
                            return true;
                        }
                    }
                }
                if (this.g.d != null) {
                    for (String str4 : this.g.d) {
                        if (TextUtils.equals(str4, name)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.meituan.android.loader.impl.DynFile r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.loader.impl.control.b.a(com.meituan.android.loader.impl.DynFile, java.lang.String):boolean");
    }

    private void b(DynFile dynFile) {
        Object[] objArr = {dynFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9d1a1ef96547e67b5fa48ae2d586f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9d1a1ef96547e67b5fa48ae2d586f0");
            return;
        }
        String b = f.b(dynFile.getBundleName());
        dynFile.setVerified(true);
        com.meituan.android.loader.impl.d.a(b, 2, dynFile.getType());
        d(dynFile);
    }

    public final synchronized void a(Map<String, DynFile> map, DDResource dDResource, Set<String> set) {
        boolean z = true;
        Object[] objArr = {map, dDResource, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18156f1a7dc078cfdc0c2f5b26119f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18156f1a7dc078cfdc0c2f5b26119f3");
            return;
        }
        DynFile dynFile = map.get(dDResource.getName());
        String b = f.b(dynFile.getBundleName());
        if (!TextUtils.isEmpty(b)) {
            com.meituan.android.loader.impl.d.a(b, 1, dynFile.getType());
        }
        Object[] objArr2 = {dynFile};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ced90281fb16e6020ffb02ecf1ca4f27", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ced90281fb16e6020ffb02ecf1ca4f27")).booleanValue();
        } else if (!this.c.shouldUnzip) {
            if (dynFile.getType() == 1) {
                if (this.g != null && this.g.d != null) {
                    for (String str : this.g.d) {
                        if (TextUtils.equals(dynFile.getName(), str)) {
                            break;
                        }
                    }
                }
                z = false;
            } else {
                if (dynFile.getType() == 2 && this.g != null && this.g.e != null) {
                    for (String str2 : this.g.e) {
                        if (TextUtils.equals(dynFile.getName(), str2)) {
                            break;
                        }
                    }
                }
                z = false;
            }
        }
        if (z) {
            String c = c(dynFile);
            if (c == null) {
                h.a().a(dynFile, "DynLoaderVerifySuccess");
            } else {
                h.a().a(dynFile, "DynLoaderVerifyFail", c);
                f.e(">>>Dynloader 下载文件不可用！ " + dDResource.getName() + ", errMsg:" + c);
                set.add(dDResource.getName());
            }
        } else {
            d(dynFile);
        }
    }

    public final synchronized void a(Map<String, DynFile> map, Set<String> set, Exception exc, int i) {
        String str;
        Object[] objArr = {map, set, exc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796ecce24fdc85fde0bd568a0c350431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796ecce24fdc85fde0bd568a0c350431");
            return;
        }
        DynFile dynFile = null;
        if (exc instanceof com.meituan.met.mercury.load.core.f) {
            str = ((com.meituan.met.mercury.load.core.f) exc).d;
            if (str != null) {
                dynFile = map.get(str);
                dynFile.setSource(i);
                set.add(str);
            } else {
                f.e(">>>Dynloader DDLoaderException#getResourceName must not be null");
            }
        } else {
            str = null;
        }
        if (i == 2) {
            f.e(">>>Dynloader blockingLoadResources failed! bundleName:" + str + ", errMsg:" + exc.getMessage());
            h.a().a(dynFile, "DynLoaderHotFixDownloadFail", exc.toString());
            return;
        }
        f.e(">>>Dynloader blockingFetchResources failed! bundleName:" + str + ", errMsg:" + exc.getMessage());
        String b = com.meituan.android.loader.impl.b.b(com.meituan.android.loader.impl.a.e);
        h a2 = h.a();
        h a3 = h.a();
        a3.getClass();
        h.a a4 = new h.a().a(dynFile, "DynLoaderDownloadFail");
        a4.d = exc.getMessage();
        a4.g = this.d;
        a4.f = this.c.type;
        a4.e = b;
        a2.a(a4);
    }

    private String c(DynFile dynFile) {
        Object[] objArr = {dynFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf409b0faa38af6eb096b4b3e87a18a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf409b0faa38af6eb096b4b3e87a18a");
        }
        if (dynFile == null || dynFile.getTempZipPath() == null) {
            return "dynFile tempPath and md5 should not be null";
        }
        try {
            dynFile.setLocalPath(e.a(dynFile, com.meituan.android.loader.impl.b.b));
            dynFile.setLocalPathBundleVersion(dynFile.getCurBundleVersion());
            if (dynFile.getLocalPath() == null || !new File(dynFile.getLocalPath()).exists()) {
                return "dynFile localPath verify fail";
            }
            d(dynFile);
            return null;
        } catch (Throwable th) {
            h.a().a(th, "checkAvailable,unzipApkFile");
            f.e(">>>DynLoader General checkAvailablDownload unzipApkFile error. Detail: " + th.getMessage());
            return String.format("unzipApkFile failed: %s", th.getMessage());
        }
    }

    private void d(DynFile dynFile) {
        Object[] objArr = {dynFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea178393c1a547d996f9ac192378d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea178393c1a547d996f9ac192378d63");
            return;
        }
        this.b.remove(dynFile);
        this.b.add(dynFile);
    }

    private Map<String, DynFile> a(Set<DynFile> set, Set<DynFile> set2) {
        Object[] objArr = {set, set2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89d6784ddbe2e4e95e63b03d8340992", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89d6784ddbe2e4e95e63b03d8340992");
        }
        HashMap hashMap = new HashMap();
        for (DynFile dynFile : set) {
            if (dynFile.isInnerSo()) {
                hashMap.put(dynFile.getBundleName().toLowerCase(), dynFile);
            } else {
                Iterator<DynFile> it = set2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        DynFile next = it.next();
                        if (TextUtils.equals(next.getBundleName(), dynFile.getBundleName())) {
                            next.setSource(dynFile.getSource());
                            next.setLocalPath(dynFile.getLocalPath());
                            next.setLocalPathBundleVersion(dynFile.getCurBundleVersion());
                            next.setTempZipPath(dynFile.getTempZipPath());
                            next.setTempZipBundleVersion(dynFile.getTempZipBundleVersion());
                            next.setHotFixFile(dynFile.getHotFixFile());
                            break;
                        }
                    }
                }
            }
        }
        for (DynFile dynFile2 : set2) {
            hashMap.put(dynFile2.getBundleName().toLowerCase(), dynFile2);
        }
        return hashMap;
    }

    private void a(Set<DynFile> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e56f145410614520a88dec5596c6972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e56f145410614520a88dec5596c6972");
            return;
        }
        String a2 = com.meituan.android.soloader.utils.a.a();
        String str = Build.CPU_ABI;
        for (String str2 : Arrays.asList("arm64-v8a", "armeabi", "armeabi-v7a")) {
            if (!TextUtils.equals(str2, a2) && !TextUtils.equals(str2, str)) {
                String str3 = com.meituan.android.loader.impl.b.b + str2;
                f.d(">>>GeneralControllerV2 clear " + str3 + ", success:" + com.meituan.android.loader.impl.b.c(str3));
            }
        }
        HashSet hashSet = new HashSet();
        for (DynFile dynFile : set) {
            if (dynFile.getType() == 2) {
                hashSet.add(dynFile.getBundleName().substring(17));
            }
        }
        a(com.meituan.android.loader.impl.b.b + APKStructure.Assets_Type, hashSet);
    }

    private void a(String str, Set<String> set) {
        File[] listFiles;
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95ee0eb5cb275a31810ae55b3b92dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95ee0eb5cb275a31810ae55b3b92dc1");
        } else if (str != null && set.size() != 0) {
            HashSet hashSet = new HashSet();
            for (String str2 : set) {
                hashSet.add(str2.split("/")[0]);
            }
            File file = new File(str);
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (!hashSet.contains(file2.getName())) {
                        String absolutePath = file2.getAbsolutePath();
                        f.d(">>>GeneralControllerV2 clear " + absolutePath + ", success:" + com.meituan.android.loader.impl.b.c(absolutePath));
                    }
                }
            }
        }
    }
}
