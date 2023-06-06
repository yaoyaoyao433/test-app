package com.tencent.map.geolocation.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    private static final byte[] f = new byte[0];
    private static volatile e j;
    HandlerThread a;
    public a b;
    boolean c;
    public Context d;
    private com.tencent.map.geolocation.a.b.a g;
    private final String e = "DexAsynchHandler";
    private SimpleDateFormat h = new SimpleDateFormat("HHmmss");
    private SimpleDateFormat i = new SimpleDateFormat("yyyyMMdd-HHmmss");

    private e(Context context) {
        this.d = context.getApplicationContext();
        this.g = new com.tencent.map.geolocation.a.b.a(this.d);
    }

    public static e a(Context context) {
        if (j == null) {
            synchronized (e.class) {
                if (j == null) {
                    j = new e(context);
                }
            }
        }
        return j;
    }

    public static e a() {
        return j;
    }

    public final void a(String str, String str2) {
        if (this.d == null) {
            return;
        }
        a(10001, this.h.format(new Date()) + CommonConstant.Symbol.COMMA + str + CommonConstant.Symbol.COMMA + str2);
    }

    public final void b() {
        if (this.d == null) {
            return;
        }
        a(10003, (String) null);
    }

    public final String c() {
        try {
            return com.tencent.map.geolocation.a.b.g.a(this.d) + CommonConstant.Symbol.COMMA + (com.tencent.map.geolocation.a.b.g.c() + CommonConstant.Symbol.UNDERLINE + com.tencent.map.geolocation.a.b.g.b()) + CommonConstant.Symbol.COMMA + com.tencent.map.geolocation.a.b.g.d();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, String str) {
        a aVar = this.b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage();
            obtainMessage.obj = str;
            obtainMessage.what = i;
            com.tencent.map.geolocation.a.b.e.a(aVar, obtainMessage, 0L);
        }
    }

    public final boolean a(byte[] bArr) {
        byte[] b;
        if (bArr != null) {
            try {
                if (bArr.length != 0 && (b = b(bArr, "0PEq^X$sjtWqEqa2$dg4TG2PT^4dFEep")) != null && b.length != 0) {
                    if (com.tencent.map.geolocation.a.b.f.a("https://analytics.map.qq.com/tr?mllc", b) == null) {
                        this.g.a(b);
                    }
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return f;
        }
        byte[] a2 = com.tencent.map.geolocation.a.b.c.a(com.tencent.map.geolocation.a.b.h.b(bArr), str);
        if (a2 == null || a2.length == 0) {
            return f;
        }
        byte[] bArr2 = new byte[a2.length + 2];
        System.arraycopy(com.tencent.map.geolocation.a.b.h.a(a2.length), 0, bArr2, 0, 2);
        System.arraycopy(a2, 0, bArr2, 2, a2.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends Handler {
        private StringBuilder b;

        public a(Looper looper) {
            super(looper);
            this.b = new StringBuilder(1024);
        }

        /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e0 A[Catch: Throwable -> 0x0295, TryCatch #0 {Throwable -> 0x0295, blocks: (B:3:0x0003, B:4:0x0007, B:6:0x000c, B:8:0x0014, B:10:0x0026, B:13:0x002a, B:15:0x0032, B:16:0x0035, B:17:0x003c, B:19:0x004a, B:21:0x004f, B:23:0x0066, B:24:0x0069, B:26:0x007b, B:28:0x0081, B:31:0x0088, B:32:0x008d, B:34:0x0093, B:35:0x009d, B:37:0x00a3, B:39:0x00b3, B:41:0x00bd, B:43:0x00cb, B:51:0x00e0, B:52:0x0129, B:54:0x012f, B:56:0x0142, B:58:0x014e, B:60:0x017a, B:61:0x017e, B:63:0x01a4, B:65:0x01aa, B:68:0x01b2, B:69:0x01b6, B:71:0x01bc, B:73:0x01e8, B:75:0x01ee, B:77:0x01f3, B:79:0x01fd, B:80:0x0201, B:82:0x0207, B:84:0x021a, B:86:0x0220, B:87:0x0223, B:88:0x023c, B:90:0x024d, B:92:0x025f, B:94:0x0272, B:96:0x0276, B:98:0x028e), top: B:102:0x0003 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r13) {
            /*
                Method dump skipped, instructions count: 680
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.a.a.e.a.handleMessage(android.os.Message):void");
        }

        private void a() {
            this.b.setLength(0);
            StringBuilder sb = this.b;
            sb.append("LOC_CORE,");
            sb.append(e.this.i.format(new Date()));
            sb.append(',');
            sb.append(com.tencent.map.geolocation.a.b.g.a(e.this.d));
            sb.append(',');
            sb.append(com.tencent.map.geolocation.a.b.g.b(e.this.d));
            sb.append(',');
            sb.append(com.tencent.map.geolocation.a.b.g.a().replaceAll(CommonConstant.Symbol.COLON, "").toUpperCase());
            sb.append(',');
            sb.append("COMP$");
        }

        private void a(int i) {
            File file;
            File[] listFiles;
            com.tencent.map.geolocation.a.b.a aVar = e.this.g;
            if (aVar != null && (file = aVar.a) != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                int i2 = 0;
                for (File file2 : listFiles) {
                    if (file2.exists() && file2.getName().startsWith("d_") && file2.lastModified() - System.currentTimeMillis() <= 864000000) {
                        i2++;
                        if (i != -1 && i2 > i) {
                            return;
                        }
                        byte[] a = a(file2);
                        if (a != null && a.length > 0) {
                            if (com.tencent.map.geolocation.a.b.f.a("https://analytics.map.qq.com/tr?mllc", a) != null) {
                                file2.delete();
                            }
                        } else if (a != null && a.length == 0) {
                            file2.delete();
                        }
                    }
                }
            }
        }

        private static byte[] a(File file) {
            if (!file.exists() || file.length() == 0) {
                return new byte[0];
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedInputStream bufferedInputStream = null;
            byte[] bArr = new byte[4096];
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            a(bufferedInputStream2);
                            a(byteArrayOutputStream);
                            return byteArray;
                        }
                    } catch (Throwable unused) {
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            return new byte[0];
                        } finally {
                            a(bufferedInputStream);
                            a(byteArrayOutputStream);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }

        private static void a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
