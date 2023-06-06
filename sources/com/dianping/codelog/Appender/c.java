package com.dianping.codelog.Appender;

import android.content.Context;
import com.dianping.codelog.Utils.e;
import com.dianping.codelog.Utils.f;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.dianping.codelog.Appender.a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final c a = new c();
    }

    public c() {
    }

    @Override // com.dianping.codelog.Appender.a
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689df985e415bab7c66b16d7aad4670f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689df985e415bab7c66b16d7aad4670f");
        } else {
            a(str, str2, str3, false);
        }
    }

    @Override // com.dianping.codelog.Appender.a
    public final void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c8d84aecb7f55faab789d7c70bc183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c8d84aecb7f55faab789d7c70bc183");
        } else {
            b(str, str2, str3, false);
        }
    }

    public final void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec8c79786737418e8e529f5bfe6ee3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec8c79786737418e8e529f5bfe6ee3e");
        } else {
            f.a(str, str2, str3, z, (e) null);
        }
    }

    public final void b(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c62f8cbfba24b82564ded423e78b991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c62f8cbfba24b82564ded423e78b991");
        } else {
            f.a(str, str2, str3, z, new e() { // from class: com.dianping.codelog.Appender.c.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.codelog.Utils.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e634edc3bac25dbcd0455b22c937115", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e634edc3bac25dbcd0455b22c937115");
                    } else {
                        com.dianping.codelog.Utils.c.a("FileAppender", "post log fail xxx.");
                    }
                }
            });
        }
    }

    @Override // com.dianping.codelog.Appender.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786f290b4641d145eeb5b30962220cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786f290b4641d145eeb5b30962220cf3");
        } else {
            com.sankuai.android.jarvis.c.a("CleanCodeLogThread", new Runnable() { // from class: com.dianping.codelog.Appender.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "403db637d1c42a26d3c921f7d3bda465", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "403db637d1c42a26d3c921f7d3bda465");
                    } else {
                        c.b();
                    }
                }
            }).start();
        }
    }

    static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7229b5cc86a916098994cc313c3945c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7229b5cc86a916098994cc313c3945c")).booleanValue();
        }
        Context b = com.dianping.codelog.b.b();
        if (b != null) {
            try {
                File a2 = q.a(b, "dpplatform_codelog", "codelog_dir");
                File file = new File(b.getFilesDir(), "novalogbase");
                File file2 = new File(b.getFilesDir(), "codelog_dir");
                a(a2);
                a(file);
                a(file2);
                if (!file.exists()) {
                    if (!file2.exists()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    private static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e604eb5d8bce78adf2ede465be3c7d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e604eb5d8bce78adf2ede465be3c7d9")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        return file.delete();
    }
}
