package com.meizu.cloud.pushsdk.c.e;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meizu.cloud.pushsdk.c.c.e;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.c.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class a {
    private static String a;

    public static k a(com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        try {
            i.a a2 = new i.a().a(bVar.b());
            a(a2, bVar);
            switch (bVar.a) {
                case 0:
                    a2 = a2.a("GET", (j) null);
                    break;
                case 1:
                    a2 = a2.a("POST", bVar.c());
                    break;
                case 2:
                    a2 = a2.a(OneIdNetworkTool.PUT, bVar.c());
                    break;
                case 3:
                    a2 = a2.a("DELETE", bVar.c());
                    break;
                case 4:
                    a2 = a2.a("HEAD", (j) null);
                    break;
                case 5:
                    a2 = a2.a("PATCH", bVar.c());
                    break;
            }
            i a3 = a2.a();
            bVar.f = new e();
            return bVar.f.a(a3);
        } catch (IOException e) {
            throw new com.meizu.cloud.pushsdk.c.b.a(e);
        }
    }

    public static k b(com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        InputStream inputStream;
        try {
            i.a a2 = new i.a().a(bVar.b());
            a(a2, bVar);
            FileOutputStream fileOutputStream = null;
            i a3 = a2.a("GET", (j) null).a();
            bVar.f = new e();
            k a4 = bVar.f.a(a3);
            String str = bVar.d;
            String str2 = bVar.e;
            byte[] bArr = new byte[2048];
            try {
                inputStream = a4.b.a().b();
                try {
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str2));
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream2.flush();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return a4;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (IOException e5) {
            try {
                File file2 = new File(bVar.d + File.separator + bVar.e);
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            throw new com.meizu.cloud.pushsdk.c.b.a(e5);
        }
    }

    public static k c(final com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        try {
            i.a a2 = new i.a().a(bVar.b());
            a(a2, bVar);
            i a3 = a2.a("POST", new b(bVar.d(), new com.meizu.cloud.pushsdk.c.d.a() { // from class: com.meizu.cloud.pushsdk.c.a.b.1
                @Override // com.meizu.cloud.pushsdk.c.d.a
                public final void a(long j, long j2) {
                    bVar.C = (int) ((100 * j) / j2);
                    if (bVar.F == null || bVar.D) {
                        return;
                    }
                    bVar.F.a(j, j2);
                }
            })).a();
            bVar.f = new e();
            return bVar.f.a(a3);
        } catch (IOException e) {
            throw new com.meizu.cloud.pushsdk.c.b.a(e);
        }
    }

    private static void a(i.a aVar, com.meizu.cloud.pushsdk.c.a.b bVar) {
        if (bVar.g != null) {
            aVar.a("User-Agent", bVar.g);
        } else if (a != null) {
            bVar.g = a;
            aVar.a("User-Agent", a);
        }
        com.meizu.cloud.pushsdk.c.c.c e = bVar.e();
        if (e != null) {
            aVar.a(e);
            if (bVar.g == null || e.a().contains("User-Agent")) {
                return;
            }
            aVar.a("User-Agent", bVar.g);
        }
    }
}
