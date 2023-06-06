package com.tencent.smtt.sdk;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/* loaded from: classes6.dex */
public class g {
    static int a = 0;
    static boolean b = false;
    private static g e = null;
    private static int h = 0;
    private static int i = 3;
    private static String k;
    private v c = null;
    private v d = null;
    private boolean f = false;
    private boolean g = false;
    private File j = null;

    private g() {
    }

    public static g a(boolean z) {
        if (e == null && z) {
            synchronized (g.class) {
                if (e == null) {
                    e = new g();
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i2) {
        h = i2;
    }

    private void b(int i2) {
        String valueOf = String.valueOf(i2);
        Properties properties = new Properties();
        properties.setProperty(k, valueOf);
        try {
            properties.store(new FileOutputStream(new File(this.j, "count.prop")), (String) null);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public static int d() {
        return h;
    }

    private int i() {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(this.j, "count.prop");
                if (file.exists()) {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        Properties properties = new Properties();
                        properties.load(bufferedInputStream2);
                        int intValue = Integer.valueOf(properties.getProperty(k, "1")).intValue();
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return intValue;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedInputStream = bufferedInputStream2;
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public v a() {
        if (this.f) {
            return this.c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010c A[Catch: Throwable -> 0x0173, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0035, B:16:0x006a, B:18:0x009d, B:22:0x00a3, B:69:0x01e7, B:64:0x01a4, B:66:0x01d1, B:68:0x01d5, B:23:0x00aa, B:25:0x00b0, B:27:0x00c9, B:29:0x00e0, B:51:0x0120, B:53:0x012e, B:56:0x0139, B:58:0x0150, B:60:0x0170, B:59:0x0161, B:55:0x0134, B:32:0x00e9, B:35:0x00f2, B:37:0x0100, B:43:0x010c, B:46:0x0115), top: B:75:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[Catch: Throwable -> 0x0173, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0035, B:16:0x006a, B:18:0x009d, B:22:0x00a3, B:69:0x01e7, B:64:0x01a4, B:66:0x01d1, B:68:0x01d5, B:23:0x00aa, B:25:0x00b0, B:27:0x00c9, B:29:0x00e0, B:51:0x0120, B:53:0x012e, B:56:0x0139, B:58:0x0150, B:60:0x0170, B:59:0x0161, B:55:0x0134, B:32:0x00e9, B:35:0x00f2, B:37:0x0100, B:43:0x010c, B:46:0x0115), top: B:75:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(android.content.Context r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.g.a(android.content.Context, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        k = str;
    }

    public boolean b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(boolean z) {
        b = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v c() {
        return this.c;
    }

    public String e() {
        return (this.c == null || QbSdk.a) ? "system webview get nothing..." : this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (b) {
            if (k == null) {
                return false;
            }
            int i2 = i();
            if (i2 == 0) {
                b(1);
            } else {
                int i3 = i2 + 1;
                if (i3 > i) {
                    return false;
                }
                b(i3);
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return QbSdk.useSoftWare();
    }
}
