package com.meituan.android.bsdiff;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BSPatchUtil {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;

    public static native int bspatch(String str, String str2, String str3);

    public static native String readErrorMessage();

    static {
        try {
            System.loadLibrary("bsdiff-gzip");
            b = false;
        } catch (Throwable th) {
            b = true;
            com.meituan.android.bsdiff.a.a("so_load_fail", th.toString());
        }
    }

    public static void a(File file, File file2, File file3) throws FileNotFoundException, a {
        Object[] objArr = {file, file2, file3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67870922dd8c7ea43255a093566c2ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67870922dd8c7ea43255a093566c2ae3");
        } else if (b) {
            com.meituan.android.bsdiff.a.a("patch_file", file2.getAbsolutePath());
        } else if (!file.exists()) {
            throw new FileNotFoundException("originalFile not found");
        } else {
            if (!file3.exists()) {
                throw new FileNotFoundException("patchFile not found");
            }
            if (bspatch(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath()) != 0) {
                throw new a(readErrorMessage());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }
}
