package com.meituan.android.edfu.mbar.util;

import android.content.Context;
import android.os.Build;
import com.meituan.android.cipstorage.q;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    public static String b = null;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    private static String f = "MBarDynloader";
    private static volatile boolean g = true;
    private static boolean h = false;
    private static boolean i = false;
    private static Context j;

    public static /* synthetic */ boolean a(boolean z) {
        i = true;
        return true;
    }

    public static /* synthetic */ boolean b(boolean z) {
        g = true;
        return true;
    }

    public static void a(final Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c59d382cc6c794451f3964823197e28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c59d382cc6c794451f3964823197e28d");
        } else if (g) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "db1190863abbb0c6818819e1ba24af6f", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "db1190863abbb0c6818819e1ba24af6f")).booleanValue();
            } else if (!Build.CPU_ABI.equals("armeabi-v7a") && !Build.CPU_ABI.equals("arm64-v8a")) {
                z = false;
            }
            if (z) {
                g = false;
                com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.edfu.mbar.util.g.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3aad6eb7d6451fe1d2f93569365997c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3aad6eb7d6451fe1d2f93569365997c");
                            return;
                        }
                        if (!g.h) {
                            try {
                                com.meituan.android.soloader.k.a(context, false);
                                g.a(true);
                            } catch (Throwable th) {
                                m a2 = m.a();
                                a2.a("dynloader", " SO INIT ERROR:" + th.getMessage());
                            }
                        }
                        g.b(context);
                        g.b(true);
                    }
                });
            }
        }
    }

    private static boolean a(InputStream inputStream, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03949e3f0ff5b8e5e8fed17e1960611e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03949e3f0ff5b8e5e8fed17e1960611e")).booleanValue();
            }
            try {
                File parentFile = new File(str).getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                IOUtils.copy(inputStream, byteArrayOutputStream);
                fileOutputStream = new FileOutputStream(str);
            } catch (FileNotFoundException e2) {
                e = e2;
            } catch (IOException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            } catch (OutOfMemoryError unused) {
            }
            try {
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return true;
            } catch (FileNotFoundException e7) {
                e = e7;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return false;
            } catch (IOException e10) {
                e = e10;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                return false;
            } catch (Exception e13) {
                e = e13;
                fileOutputStream2 = fileOutputStream;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                return false;
            } catch (OutOfMemoryError unused2) {
                fileOutputStream2 = fileOutputStream;
                try {
                    System.gc();
                    System.runFinalization();
                } catch (Throwable unused3) {
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e19) {
                        e19.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77a5bf3f90d1aa859dd44789862ecf30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77a5bf3f90d1aa859dd44789862ecf30");
        } else if (context == null) {
        } else {
            Context applicationContext = context.getApplicationContext();
            j = applicationContext == null ? context : applicationContext;
            try {
                if (a() && !c(j)) {
                    final Context context2 = j;
                    Object[] objArr2 = {context2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "775403acd2efb0c06b740fe906b8fbd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "775403acd2efb0c06b740fe906b8fbd1");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("qrModel");
                    c.a aVar = new c.a();
                    Object[] objArr3 = {arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5ebc2baaeb6a6038bcb7585a0e68c39f", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (c.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5ebc2baaeb6a6038bcb7585a0e68c39f");
                    } else {
                        aVar.b.c = arrayList;
                    }
                    com.meituan.android.loader.c cVar = aVar.b;
                    final long currentTimeMillis = System.currentTimeMillis();
                    DynLoader.toggleDownload(new com.meituan.android.loader.a() { // from class: com.meituan.android.edfu.mbar.util.g.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.loader.a
                        public final void onDynDownloadSuccess() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3a62b954b7fd15d359187fc0765d8585", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3a62b954b7fd15d359187fc0765d8585");
                                return;
                            }
                            String unused = g.f;
                            g.c(context2);
                            m.a().a("mbar_download_time", (float) (System.currentTimeMillis() - currentTimeMillis));
                        }

                        @Override // com.meituan.android.loader.a
                        public final void onDynDownloadFailure() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "061f0485dfbdc3157bfde734d8e6a07e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "061f0485dfbdc3157bfde734d8e6a07e");
                                return;
                            }
                            String unused = g.f;
                            m.a().a("mbar_load_fail", 1.0f);
                            m.a().a("dynloader", " download resource failure");
                        }
                    }, cVar, false);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92ce9dde9a79fb5e54e41535de785976", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92ce9dde9a79fb5e54e41535de785976")).booleanValue();
        }
        if (h) {
            return e();
        }
        return f();
    }

    private static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf3b9617648da46caf74ecc727ddac66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf3b9617648da46caf74ecc727ddac66")).booleanValue();
        }
        boolean available = DynLoader.available("MBarScannerV2", 1);
        new StringBuilder("DynLoader MBarScannerV2 isLibAvailable :").append(available);
        if (!available) {
            m.a().a("mbar_loadso_fail", 1.0f);
            m.a().a("dynloader", " mbar lib unavailable");
            return false;
        }
        boolean load = DynLoader.load("MBarScannerV2");
        new StringBuilder("DynLoader MBarScannerV2 load success :").append(load);
        if (!load) {
            m.a().a("mbar_loadso_fail", 1.0f);
            m.a().a("dynloader", " mbar load failed");
            return false;
        }
        d = true;
        return true;
    }

    private static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef0ed007cde6d074d3e9ba40bcc80c88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef0ed007cde6d074d3e9ba40bcc80c88")).booleanValue();
        }
        if (!i && j != null) {
            try {
                com.meituan.android.soloader.k.a(j, false);
                i = true;
            } catch (Throwable th) {
                m a2 = m.a();
                a2.a("dynloader", " SO INIT ERROR:" + th.getMessage());
            }
        }
        try {
            com.meituan.android.soloader.k.b("MBarScannerV2");
            d = true;
            return true;
        } catch (Throwable th2) {
            m a3 = m.a();
            a3.a("dynloader", " so native load failed" + th2.getMessage());
            m.a().a("mbar_loadso_fail", 1.0f);
            return false;
        }
    }

    public static boolean c(Context context) {
        boolean z;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70e2e4d55fa5b7c4b8e228ddc0ab1037", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70e2e4d55fa5b7c4b8e228ddc0ab1037")).booleanValue();
        }
        String absolutePath = q.b(context, b.b, "qrdetectorfp16_v8_0_5.edfu").getAbsolutePath();
        String absolutePath2 = q.b(context, b.b, "qrdetectorfp16_v7_0_5.edfu").getAbsolutePath();
        new StringBuilder("DynLoader modelPath :").append(absolutePath);
        boolean a2 = a(absolutePath);
        new StringBuilder("DynLoader isModelAvailable :").append(a2);
        if (!a2) {
            z = a(context, absolutePath);
            if (!z) {
                if (a(absolutePath2)) {
                    b = absolutePath2;
                    z = true;
                }
            } else {
                b = absolutePath;
            }
        } else {
            b = absolutePath;
            z = a2;
        }
        if (!z) {
            m.a().a("dynloader", " save model failed");
            return false;
        }
        new StringBuilder("saveModel success :").append(z);
        c = true;
        return true;
    }

    public static void b() {
        c = false;
        d = false;
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fb9c8bccd63521c6fccc824a67ca821", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fb9c8bccd63521c6fccc824a67ca821")).booleanValue() : new File(str).exists();
    }

    private static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd4e78c2ba50450dc8a16e175133ddce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd4e78c2ba50450dc8a16e175133ddce")).booleanValue();
        }
        boolean available = DynLoader.available("qrModel/qrdetectorfp16_v2.edfu", 2);
        new StringBuilder("DynLoader saveModel- isModelAvailable :").append(available);
        if (!available) {
            m.a().a("dynloader", " model unavailable");
            return false;
        }
        InputStream open = DynLoader.open(context, "qrModel/qrdetectorfp16_v2.edfu");
        if (open == null) {
            m.a().a("dynloader", " open assets failed");
            return false;
        } else if (a(open, str)) {
            return true;
        } else {
            m.a().a("dynloader", " save model file failed");
            return false;
        }
    }
}
