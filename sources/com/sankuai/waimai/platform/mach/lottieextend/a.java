package com.sankuai.waimai.platform.mach.lottieextend;

import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final File c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9a97a509e94cd2cff131382ef9b644", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9a97a509e94cd2cff131382ef9b644");
            return;
        }
        this.c = q.a(com.meituan.android.singleton.b.a, "waimai", "mach/lottie", u.e);
        if (this.c.exists()) {
            return;
        }
        this.c.mkdirs();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ba36d4bb6a0bc32e5780f0df77ba01e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ba36d4bb6a0bc32e5780f0df77ba01e");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caaaf27d4ae7fb1b3a4138a669c26cf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caaaf27d4ae7fb1b3a4138a669c26cf0");
        }
        try {
            return okio.f.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    @NonNull
    public final C1055a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e965ce6fcd1133bbb716305dd6ce1e", RobustBitConfig.DEFAULT_VALUE) ? (C1055a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e965ce6fcd1133bbb716305dd6ce1e") : new C1055a(this.c, b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66f47c1e2ba654b6a2f48c8746c2d9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66f47c1e2ba654b6a2f48c8746c2d9db");
        } else if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    b(file2);
                }
            }
            file.delete();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.lottieextend.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1055a {
        public static ChangeQuickRedirect a;
        String b;
        final File c;
        final String d;
        q e;
        com.sankuai.waimai.lottie.c f;

        public C1055a(File file, String str) {
            Object[] objArr = {file, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49dd4fd74c9ea8019746670e9b49e78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49dd4fd74c9ea8019746670e9b49e78");
                return;
            }
            this.d = str;
            this.c = new File(file, str);
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943f4dea760897de9f706e4d98ed385e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943f4dea760897de9f706e4d98ed385e")).booleanValue() : new File(this.c, this.e.b(this.d, "")).exists();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedReader] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String b() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r8 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.mach.lottieextend.a.C1055a.a
                java.lang.String r10 = "1c490ab9adc66dcae9251b3ab5c617a5"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1b
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L1b:
                r0 = 0
                java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                java.io.File r2 = r11.c     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                com.meituan.android.cipstorage.q r3 = r11.e     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                java.lang.String r4 = r11.d     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                java.lang.String r5 = "pull_refresh_refreshing.json"
                java.lang.String r3 = r3.b(r4, r5)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                if (r2 != 0) goto L35
                return r0
            L35:
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                r1.<init>()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
            L44:
                java.lang.String r3 = r2.readLine()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                if (r3 == 0) goto L4e
                r1.append(r3)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                goto L44
            L4e:
                com.sankuai.waimai.lottie.c r3 = r11.f     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                if (r3 == 0) goto L57
                com.sankuai.waimai.lottie.c r3 = r11.f     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                r3.a(r0)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
            L57:
                java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L71
                r2.close()     // Catch: java.io.IOException -> L5e
            L5e:
                return r1
            L5f:
                r1 = move-exception
                goto L74
            L61:
                r2 = r0
            L62:
                com.sankuai.waimai.lottie.c r1 = r11.f     // Catch: java.lang.Throwable -> L71
                if (r1 == 0) goto L6b
                com.sankuai.waimai.lottie.c r1 = r11.f     // Catch: java.lang.Throwable -> L71
                r1.b()     // Catch: java.lang.Throwable -> L71
            L6b:
                if (r2 == 0) goto L70
                r2.close()     // Catch: java.io.IOException -> L70
            L70:
                return r0
            L71:
                r0 = move-exception
                r1 = r0
                r0 = r2
            L74:
                if (r0 == 0) goto L79
                r0.close()     // Catch: java.io.IOException -> L79
            L79:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.lottieextend.a.C1055a.b():java.lang.String");
        }

        public final boolean a(InputStream inputStream) {
            ZipInputStream zipInputStream;
            Object[] objArr = {inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e5a4868927e9a351574c9d7613d2c49", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e5a4868927e9a351574c9d7613d2c49")).booleanValue();
            }
            if (inputStream == null) {
                return false;
            }
            ZipInputStream zipInputStream2 = null;
            try {
                if (!this.c.exists()) {
                    this.c.mkdirs();
                }
                zipInputStream = new ZipInputStream(inputStream);
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (!name.contains("../") && !name.contains("__MACOSX")) {
                                File file = new File(this.c, name);
                                if (nextEntry.isDirectory()) {
                                    file.mkdirs();
                                } else {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.close();
                                }
                                if (name.endsWith(".json")) {
                                    this.e.a(this.d, name);
                                }
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        zipInputStream2 = zipInputStream;
                        if (zipInputStream2 != null) {
                            try {
                                zipInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (zipInputStream != null) {
                            try {
                                zipInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                zipInputStream.close();
                return true;
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = null;
            }
        }
    }
}
