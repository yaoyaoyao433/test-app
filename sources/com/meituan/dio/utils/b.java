package com.meituan.dio.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileFilter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final FileFilter b = new FileFilter() { // from class: com.meituan.dio.utils.b.1
        public static ChangeQuickRedirect a;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ef93b9ae0228de397cfd6e89ac65e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ef93b9ae0228de397cfd6e89ac65e5")).booleanValue() : !file.isHidden();
        }
    };

    public static boolean a(File file) {
        boolean z = true;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "182e3b193e8252b892d4f8b3794ac938", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "182e3b193e8252b892d4f8b3794ac938")).booleanValue();
        }
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c835a0388b7be5e35495556b9bbc8fd5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c835a0388b7be5e35495556b9bbc8fd5")).booleanValue();
            }
            if (file.exists()) {
                Object[] objArr3 = {file};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "012f16e638857431e2278df9648c3e92", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "012f16e638857431e2278df9648c3e92")).booleanValue();
                } else {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file2 : listFiles) {
                            a(file2);
                        }
                    }
                }
                if (z) {
                    return file.delete();
                }
                return false;
            }
            return true;
        }
        return file.delete();
    }
}
