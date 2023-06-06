package com.meituan.msc.modules.update.packageattachment;

import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.reporter.MSCReporter;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str, long j, boolean z) {
        Set<File> emptySet;
        Object[] objArr = {str, new Long(j), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf28b1db26cf7d01217493da8c56d53a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf28b1db26cf7d01217493da8c56d53a");
            return;
        }
        long j2 = j * 1024 * 1024;
        if (str == null || str.length() == 0) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || file.isFile()) {
            return;
        }
        int i = 4;
        g.d("LRUCleaner", "clean:", str, "limitSize:", Long.valueOf(j), ErrorCode.ERROR_TYPE_M);
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        Object[] objArr2 = {listFiles};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0857b2ab7649dd7d804c2937abcffd09", RobustBitConfig.DEFAULT_VALUE)) {
            emptySet = (Set) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0857b2ab7649dd7d804c2937abcffd09");
        } else if (listFiles != null && listFiles.length > 0) {
            TreeSet treeSet = new TreeSet(new Comparator<File>() { // from class: com.meituan.msc.modules.update.packageattachment.c.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file2, File file3) {
                    File file4 = file2;
                    File file5 = file3;
                    Object[] objArr3 = {file4, file5};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43d837d8a11f4799d6ecb5fc70ad48e1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43d837d8a11f4799d6ecb5fc70ad48e1")).intValue();
                    }
                    int a2 = (int) (c.a(file5) - c.a(file4));
                    return a2 == 0 ? file5.compareTo(file4) : a2;
                }
            });
            treeSet.addAll(Arrays.asList(listFiles));
            emptySet = treeSet;
        } else {
            emptySet = Collections.emptySet();
        }
        long j3 = 0;
        long j4 = 0;
        for (File file2 : emptySet) {
            long b = b(file2);
            long j5 = j3 + b;
            if (j5 > j2 && file2.isDirectory()) {
                boolean a2 = r.a(file2);
                Object[] objArr3 = new Object[i];
                objArr3[0] = "delete file";
                objArr3[1] = Boolean.valueOf(a2);
                objArr3[2] = file2.getAbsolutePath();
                objArr3[3] = Long.valueOf(b);
                g.d("LRUCleaner", objArr3);
                j4 += b;
            } else {
                if (file2.isDirectory()) {
                    g.b("LRUCleaner", "keep file", file2.getAbsolutePath(), Long.valueOf(b));
                } else {
                    g.d("LRUCleaner", "keep file", file2.getAbsolutePath(), Long.valueOf(b));
                }
                j3 = j5;
            }
            i = 4;
        }
        g.d("LRUCleaner", "clean finished.", str, "limitSize:", Long.valueOf(j2), "curSize:", Long.valueOf(j3), "delSize:", Long.valueOf(j4));
        Object[] objArr4 = {str, new Long(j2), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect3, true, "34495bcba24119d3db71f1bfd6618fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect3, true, "34495bcba24119d3db71f1bfd6618fe5");
        } else {
            new MSCReporter().a("msc.lru.cleaner").a("path", str).a("curSize", Long.valueOf(j2)).a("delSize", Long.valueOf(j4)).c();
        }
    }

    public static long a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4519bdfd9506c4dc2812c0ef2301be37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4519bdfd9506c4dc2812c0ef2301be37")).longValue();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat stat = Os.stat(file.getPath());
                return Math.max(Math.max(stat.st_atime, stat.st_mtime), stat.st_ctime);
            } catch (Throwable unused) {
            }
        }
        return file.lastModified() / 1000;
    }

    private static long b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea7d339bbbd2685cca4f4307225441b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea7d339bbbd2685cca4f4307225441b8")).longValue();
        }
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return 0L;
        }
        for (String str : list) {
            j += b(new File(file, str));
        }
        return j;
    }
}
