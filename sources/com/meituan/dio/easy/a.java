package com.meituan.dio.easy;

import com.meituan.dio.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Random c = new Random(System.currentTimeMillis());
    protected File b;

    public a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e00e73093996d205954f2d7c38280cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e00e73093996d205954f2d7c38280cb");
        } else if (file == null) {
            throw new NullPointerException("cacheDirectory can't be null");
        } else {
            if (file.isFile()) {
                throw new IllegalArgumentException("cacheDirectory can't be file");
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b = file;
        }
    }

    public final File a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f07778a9c214078085b18f499fbae6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f07778a9c214078085b18f499fbae6a");
        }
        if (file == null) {
            return null;
        }
        String path = file.getPath();
        return new File(this.b, String.format("dio_%s%s_%s", Integer.valueOf(Math.abs(path.hashCode())), Integer.valueOf(path.length()), Long.valueOf(file.lastModified())));
    }

    public final File a(DioFile dioFile) {
        File file;
        File file2;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3cbfbd51f8be80f9c87f991920f032", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3cbfbd51f8be80f9c87f991920f032");
        }
        if (!dioFile.o()) {
            return dioFile.d();
        }
        Object[] objArr2 = {dioFile};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        File file3 = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aee0370b8618a19f937d2272596dfe0", RobustBitConfig.DEFAULT_VALUE)) {
            file = (File) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aee0370b8618a19f937d2272596dfe0");
        } else {
            File d = dioFile.d();
            if (d == null) {
                file = null;
            } else {
                File a2 = a(d);
                String a3 = dioFile.a();
                file = new File(a2, f.a(a3) ? "" : String.format("%s%s", Integer.valueOf(Math.abs(a3.hashCode())), Integer.valueOf(a3.length())));
            }
        }
        if (a(dioFile, file)) {
            return file;
        }
        try {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            file2 = new File(file.getParentFile(), PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "02e0b5adab63f29763ce70983290d9f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "02e0b5adab63f29763ce70983290d9f7") : String.format("%s_%s", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Math.abs(c.nextInt()))));
            try {
                try {
                    dioFile.a(file2);
                    if (!file2.renameTo(file)) {
                        if (!a(dioFile, file)) {
                            com.meituan.dio.utils.b.a(file2);
                            return null;
                        }
                    }
                    com.meituan.dio.utils.b.a(file2);
                    return file;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    com.meituan.dio.utils.b.a(file2);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                file3 = file2;
                com.meituan.dio.utils.b.a(file3);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file2 = null;
        } catch (Throwable th2) {
            th = th2;
            com.meituan.dio.utils.b.a(file3);
            throw th;
        }
    }

    private boolean a(DioFile dioFile, File file) {
        Object[] objArr = {dioFile, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc57da5838e1f735a2b7888d456e6ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc57da5838e1f735a2b7888d456e6ac0")).booleanValue();
        }
        if (dioFile == null || file == null) {
            return false;
        }
        if (dioFile.j()) {
            return file.isDirectory();
        }
        return file.length() == dioFile.l();
    }
}
