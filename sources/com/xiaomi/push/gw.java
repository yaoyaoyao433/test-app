package com.xiaomi.push;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class gw {
    private static boolean a = false;

    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        private Context a;
        private gz b;

        public a(Context context, gz gzVar) {
            this.b = gzVar;
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            gw.b(this.a, this.b);
        }
    }

    public static void a(Context context, gz gzVar) {
        m.a(context).a(new a(context, gzVar), 0);
    }

    private static void a(Context context, gz gzVar, File file, byte[] bArr) {
        BufferedInputStream bufferedInputStream;
        String str;
        int a2;
        ArrayList arrayList = new ArrayList();
        int i = 4;
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream.read(bArr2);
                        if (read != -1) {
                            if (read == i) {
                                a2 = f.a(bArr2);
                                if (a2 <= 0 || a2 > 10240) {
                                    break;
                                }
                                byte[] bArr3 = new byte[a2];
                                int read2 = bufferedInputStream.read(bArr3);
                                if (read2 != a2) {
                                    str = "TinyData read from cache file failed cause buffer size not equal length. size:" + read2 + "__length:" + a2;
                                    break;
                                }
                                byte[] a3 = ge.a(bArr, bArr3);
                                if (a3 != null && a3.length != 0) {
                                    he heVar = new he();
                                    ik.a(heVar, a3);
                                    String valueOf = String.valueOf(a3.length);
                                    if (heVar.j == null) {
                                        heVar.j = new HashMap();
                                    }
                                    heVar.j.put("item_size", valueOf);
                                    arrayList.add(heVar);
                                    i2++;
                                    i3 += a3.length;
                                    if (i2 >= 8 || i3 >= 10240) {
                                        gx.a(context, gzVar, arrayList);
                                        arrayList.clear();
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                    i = 4;
                                }
                                com.xiaomi.channel.commonutils.logger.c.d("TinyData read from cache file failed cause decrypt fail");
                                i = 4;
                            } else {
                                str = "TinyData read from cache file failed cause lengthBuffer error. size:" + read;
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream2 = bufferedInputStream;
                        com.xiaomi.channel.commonutils.logger.c.a(e);
                        b.a(bufferedInputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        b.a(bufferedInputStream);
                        throw th;
                    }
                }
                str = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a2;
                com.xiaomi.channel.commonutils.logger.c.d(str);
                gx.a(context, gzVar, arrayList);
                if (file.exists() && !file.delete()) {
                    com.xiaomi.channel.commonutils.logger.c.a("TinyData delete reading temp file failed");
                }
                b.a(bufferedInputStream);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void b(android.content.Context r7, com.xiaomi.push.gz r8) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gw.b(android.content.Context, com.xiaomi.push.gz):void");
    }
}
