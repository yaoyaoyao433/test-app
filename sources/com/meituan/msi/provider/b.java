package com.meituan.msi.provider;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.provider.a
    public final String a(String str) {
        String absolutePath;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a997f6ac489a2aef976f4822c7cebea6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a997f6ac489a2aef976f4822c7cebea6");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        if (str.startsWith(MTURLUtil.FILE_BASE)) {
            return str.substring(5);
        }
        if (str.startsWith("msifile://")) {
            if (str.equals("msifile://store") || str.equals("msifile://store/")) {
                return a() + File.separator + "store/";
            } else if (str.equals("msifile://usr") || str.equals("msifile://usr/")) {
                return c();
            } else {
                if (str.equals("msifile://temp") || str.equals("msifile://temp/")) {
                    return b();
                }
                if (str.startsWith("msifile://store/")) {
                    String substring = str.substring(16);
                    return a() + File.separator + "store/" + substring;
                }
                String absolutePath2 = com.meituan.msi.util.file.e.b(com.meituan.msi.a.f()).getAbsolutePath();
                if (TextUtils.isEmpty(str) || !str.startsWith("msifile://")) {
                    return null;
                }
                String substring2 = str.substring(10);
                Object[] objArr2 = {absolutePath2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.util.file.e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "df84d1a478bb6e5cfde6239e5dec70ff", RobustBitConfig.DEFAULT_VALUE)) {
                    absolutePath = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "df84d1a478bb6e5cfde6239e5dec70ff");
                } else {
                    File file = new File(absolutePath2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    absolutePath = file.getAbsolutePath();
                }
                return absolutePath + File.separator + substring2;
            }
        }
        return null;
    }

    @Override // com.meituan.msi.provider.a
    public final File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b446dd26e334cc9c8812086cfa9b7ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b446dd26e334cc9c8812086cfa9b7ca");
        }
        File file = new File(com.meituan.msi.util.file.e.a(com.meituan.msi.a.f()));
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.meituan.msi.provider.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabb0bb8689884367e8f48ecca4e936a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabb0bb8689884367e8f48ecca4e936a");
        }
        File b = com.meituan.msi.util.file.e.b(com.meituan.msi.a.f());
        if (!b.exists() || !b.isDirectory()) {
            b.mkdirs();
        }
        return b.getAbsolutePath() + File.separator;
    }

    @Override // com.meituan.msi.provider.a
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcce2d0dcd450b239e2ee6bdfb9e5269", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcce2d0dcd450b239e2ee6bdfb9e5269");
        }
        return "msifile://" + str;
    }

    @Override // com.meituan.msi.provider.a
    public final String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573fc4d2968eb8455349f71d86c1d19e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573fc4d2968eb8455349f71d86c1d19e");
        }
        if (i == 0) {
            return "tmp_" + str;
        }
        return str;
    }

    @Override // com.meituan.msi.provider.a
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72bd10b2643bca17a8fe91288a9c25b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72bd10b2643bca17a8fe91288a9c25b");
        }
        File b = com.meituan.msi.util.file.e.b(com.meituan.msi.a.f());
        if (!b.exists() || !b.isDirectory()) {
            b.mkdirs();
        }
        return b.getAbsolutePath() + File.separator;
    }
}
