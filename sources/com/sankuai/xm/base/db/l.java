package com.sankuai.xm.base.db;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.systemdb.SysDBOpenHelper;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.base.util.w;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public static Boolean b;
    private static final byte[] c = "SQLite".getBytes();

    public static boolean a(Context context, String str) {
        InputStream inputStream;
        boolean z = false;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b108129122736a842ae0493137d96b5f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b108129122736a842ae0493137d96b5f")).booleanValue();
        }
        try {
            File databasePath = context.getDatabasePath(str);
            if (databasePath.exists()) {
                inputStream = com.sankuai.xm.base.util.k.q(databasePath.getPath());
                try {
                    byte[] bArr = new byte[6];
                    inputStream.read(bArr, 0, 6);
                    z = !Arrays.equals(bArr, c);
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    try {
                        com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, String.format("db exception:%s", th.getMessage()), new Object[0]);
                        return z;
                    } finally {
                        m.a(inputStream2);
                    }
                }
            } else {
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59bdb2b0eb968ae16583fb39bc635d27", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59bdb2b0eb968ae16583fb39bc635d27")).booleanValue();
        }
        if (file == null) {
            throw new IllegalArgumentException("file must not be null");
        }
        boolean delete = file.delete() | false | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] listFiles = parentFile.listFiles(new FileFilter() { // from class: com.sankuai.xm.base.db.l.1
                public static ChangeQuickRedirect a;

                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    Object[] objArr2 = {file2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ed30e55cde0a476e85eb0f97f235f0b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ed30e55cde0a476e85eb0f97f235f0b")).booleanValue() : file2.getName().startsWith(str);
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    delete |= file2.delete();
                }
            }
        }
        return delete;
    }

    public static h a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "230c64f9de03204110b11795c1fc8850", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "230c64f9de03204110b11795c1fc8850");
        }
        h hVar = (h) c(context, "xm_sdk_integration_db_engine");
        return hVar == null ? new SysDBOpenHelper() : hVar;
    }

    public static boolean b(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e087648a8959d0142162b52521266796", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e087648a8959d0142162b52521266796")).booleanValue();
        }
        try {
            if (b != null) {
                return b.booleanValue();
            }
            if (context == null) {
                com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "DBUtils::isDependOnCryptLib context null", new Object[0]);
                return false;
            }
            if (((h) c(context, "xm_sdk_integration_db_engine")) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            b = valueOf;
            return valueOf.booleanValue();
        } catch (Exception e) {
            com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, e);
            return false;
        }
    }

    private static Object c(Context context, String str) {
        ApplicationInfo applicationInfo;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e59c480c351fc2fadaa4be1b985fdc9", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e59c480c351fc2fadaa4be1b985fdc9");
        }
        if (TextUtils.isEmpty(str) || context == null) {
            return null;
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (applicationInfo.metaData == null) {
            return null;
        }
        for (String str2 : applicationInfo.metaData.keySet()) {
            if (TextUtils.equals(str, str2)) {
                Class<?> cls = Class.forName((String) applicationInfo.metaData.get(str2));
                if (cls == null) {
                    return null;
                }
                return cls.newInstance();
            }
        }
        return null;
    }

    public static String b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c8cae7290aa026c941c848df122f9cc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c8cae7290aa026c941c848df122f9cc");
        }
        try {
            if (context == null) {
                com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "DBUtils::calculatePassword context null", new Object[0]);
                return "";
            }
            return String.format("x'%s'", com.sankuai.xm.base.util.l.b(w.a(context) + str));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
