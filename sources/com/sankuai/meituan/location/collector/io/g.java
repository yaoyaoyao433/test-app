package com.sankuai.meituan.location.collector.io;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static ReentrantLock b = new ReentrantLock();
    private static volatile File c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        static void a(SharedPreferences sharedPreferences, String str) {
            Object[] objArr = {sharedPreferences, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba3614563abf78b700d7c91ac4ba1a90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba3614563abf78b700d7c91ac4ba1a90");
            } else if (sharedPreferences.getString("collector_item_record_filename", "").equals(str)) {
            } else {
                a(str);
            }
        }

        static void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a52fb4404776b80cbe6e3de00ca74799", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a52fb4404776b80cbe6e3de00ca74799");
            } else {
                com.meituan.android.common.locate.reporter.f.c().putInt("collector_item_record", 1).putString("collector_item_record_filename", str).apply();
            }
        }
    }

    @SuppressLint({"PrimitiveParseDetector"})
    private static File a(File file) {
        File file2;
        NumberFormatException e;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6dabf8687458952e4a27e5bbe6e47ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6dabf8687458952e4a27e5bbe6e47ac");
        }
        if (c == null || !c.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
            long j = 0;
            File file3 = null;
            for (File file4 : listFiles) {
                try {
                    if (Long.valueOf(file4.getName()).longValue() > j) {
                        try {
                            file3 = file4;
                            j = Long.valueOf(file4.getName()).longValue();
                        } catch (NumberFormatException e2) {
                            e = e2;
                            file2 = file4;
                            LogUtils.a(e);
                            a(new File[]{file4});
                            file3 = file2;
                        }
                    }
                } catch (NumberFormatException e3) {
                    file2 = file3;
                    e = e3;
                }
            }
            return file3;
        }
        return c;
    }

    private static void a(File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0b1bd78d66fcf53b47602ef3beefe88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0b1bd78d66fcf53b47602ef3beefe88");
            return;
        }
        for (File file : fileArr) {
            if (file != null && file.exists()) {
                try {
                    Long.valueOf(file.getName());
                } catch (NumberFormatException unused) {
                    file.delete();
                } catch (Throwable th) {
                    LogUtils.a(th);
                }
            }
        }
    }

    public static void a(Context context, c cVar) {
        int i;
        boolean z;
        String str;
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "429147a1b70401c10140325e64eebe65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "429147a1b70401c10140325e64eebe65");
            return;
        }
        f.a();
        b.lock();
        try {
            File a2 = d.a(context);
            if (!a2.exists() || !a2.isDirectory()) {
                a2.mkdirs();
            }
            if (a2.exists()) {
                File a3 = a(a2);
                Object[] objArr2 = {context, a3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b1a6877cc01f94588410f7e4892fcd30", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b1a6877cc01f94588410f7e4892fcd30")).booleanValue();
                } else {
                    if (context != null && a3 != null) {
                        String name = a3.getName();
                        Object[] objArr3 = {name};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7b5484079cabde753efb6fbf8a67e908", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7b5484079cabde753efb6fbf8a67e908")).intValue();
                        } else {
                            SharedPreferences b2 = com.meituan.android.common.locate.reporter.f.b();
                            a.a(b2, name);
                            i = b2.getInt("collector_item_record", 1);
                        }
                        if (i < 100 && a3.exists() && (!a3.exists() || a3.length() <= 51200)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z) {
                    a3 = new File(a2, String.valueOf(System.currentTimeMillis()));
                    a.a(a3.getName());
                    try {
                        a3.createNewFile();
                        a(context);
                        LogUtils.a("collector StoreManager create new file:" + a3.getName() + " ok");
                    } catch (IOException unused) {
                        LogUtils.a("collector StoreManager create new file:" + a3.getName() + " failed.so write in failed");
                        return;
                    }
                }
                if (cVar.a(a3)) {
                    String name2 = a3.getName();
                    Object[] objArr4 = {name2};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b88c3c4509e6763e8284b4fdfa5e5b63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b88c3c4509e6763e8284b4fdfa5e5b63");
                    } else {
                        SharedPreferences b3 = com.meituan.android.common.locate.reporter.f.b();
                        a.a(b3, name2);
                        b3.edit().putInt("collector_item_record", b3.getInt("collector_item_record", 1) + 1).apply();
                    }
                    c = a3;
                    str = "collector StoreManager file write success";
                } else {
                    str = "collector StoreManager file write failed!!";
                }
                LogUtils.a(str);
            }
        } finally {
            b.unlock();
        }
    }

    private static void a(Context context) {
        File[] listFiles;
        File[] fileArr;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        File[] fileArr2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb0374c8dfbcf857d94c1af03a34c416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb0374c8dfbcf857d94c1af03a34c416");
            return;
        }
        File a2 = d.a(context);
        if (a2.exists() && (listFiles = a2.listFiles()) != null && listFiles.length > 60) {
            int length = listFiles.length - 60;
            try {
                Object[] objArr2 = {listFiles, Integer.valueOf(length)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "731d0094d21791333c6050bb9619aa8f", RobustBitConfig.DEFAULT_VALUE)) {
                    fileArr = (File[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "731d0094d21791333c6050bb9619aa8f");
                } else {
                    for (int i = 0; i < length; i++) {
                        for (int i2 = 1; i2 < listFiles.length; i2++) {
                            if (Long.valueOf(listFiles[i2].getName()).longValue() < Long.valueOf(listFiles[i].getName()).longValue()) {
                                File file = listFiles[i2];
                                listFiles[i2] = listFiles[i];
                                listFiles[i] = file;
                            }
                        }
                    }
                    fileArr = new File[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        fileArr[i3] = listFiles[i3];
                    }
                }
                fileArr2 = fileArr;
            } catch (NumberFormatException unused) {
                a(listFiles);
            } catch (Throwable th) {
                LogUtils.a(th);
            }
            if (fileArr2 == null || fileArr2.length == 0) {
                return;
            }
            for (File file2 : fileArr2) {
                LogUtils.a("delete" + file2.getName() + "because local file too much");
                file2.delete();
            }
        }
    }
}
