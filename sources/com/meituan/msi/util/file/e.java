package com.meituan.msi.util.file;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7646b8f75a1bb32b7c151a077df0c6cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7646b8f75a1bb32b7c151a077df0c6cf");
        }
        return com.meituan.msi.util.cipStorage.a.a(context, "msi") + "/";
    }

    public static File b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0870cd621748fe9c66d02fbfa5d1f903", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0870cd621748fe9c66d02fbfa5d1f903");
        }
        File b = com.meituan.msi.util.cipStorage.a.b(context, "temp");
        if (b.isFile()) {
            b.delete();
        }
        if (!b.exists() || !b.isDirectory()) {
            b.mkdirs();
        }
        return b;
    }

    public static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b6da4533c69345903a9cba54ea5e051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b6da4533c69345903a9cba54ea5e051");
            return;
        }
        File b = b(context);
        double a2 = c.a(b.getAbsolutePath(), 1);
        if (a2 > -2.147483648E9d) {
            File[] listFiles = b.listFiles();
            com.meituan.msi.log.a.a("tmp file is too big");
            if (listFiles == null || listFiles.length <= 1) {
                return;
            }
            List asList = Arrays.asList(listFiles);
            Collections.sort(asList, new Comparator<File>() { // from class: com.meituan.msi.util.file.e.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    File file3 = file;
                    File file4 = file2;
                    Object[] objArr2 = {file3, file4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894931ec6416df4b9ef5cfde9eb0dec2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894931ec6416df4b9ef5cfde9eb0dec2")).intValue();
                    }
                    if (file3.lastModified() == file4.lastModified()) {
                        return 0;
                    }
                    return file3.lastModified() < file4.lastModified() ? -1 : 1;
                }
            });
            long j = (long) (a2 - 1.073741824E9d);
            for (int i = 0; i < asList.size() - 1 && j > 0; i++) {
                ((File) asList.get(i)).delete();
                j -= ((File) asList.get(i)).length();
            }
        }
    }
}
