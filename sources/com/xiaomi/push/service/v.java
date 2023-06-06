package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.xiaomi.push.jw;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes6.dex */
public final class v {
    private static long a;

    /* loaded from: classes6.dex */
    public static class a {
        byte[] a;
        int b;

        public a(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public Bitmap a = null;
        public long b = 0;

        public b(Bitmap bitmap, long j) {
        }
    }

    private static int a(Context context, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.c.a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 48.0f);
        if (options.outWidth <= round || options.outHeight <= round) {
            return 1;
        }
        return Math.min(options.outWidth / round, options.outHeight / round);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static Bitmap a(Context context, String str) {
        InputStream inputStream;
        InputStream inputStream2;
        Uri parse = Uri.parse(str);
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(parse);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            inputStream2 = null;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            context = 0;
            inputStream = null;
        }
        try {
            int a2 = a((Context) context, inputStream);
            inputStream2 = context.getContentResolver().openInputStream(parse);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a2;
                Bitmap a3 = com.sankuai.waimai.launcher.util.image.a.a(inputStream2, (Rect) null, options);
                com.xiaomi.push.b.a(inputStream2);
                com.xiaomi.push.b.a(inputStream);
                return a3;
            } catch (IOException e2) {
                e = e2;
                com.xiaomi.channel.commonutils.logger.c.a(e);
                com.xiaomi.push.b.a(inputStream2);
                com.xiaomi.push.b.a(inputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            context = 0;
            com.xiaomi.push.b.a((Closeable) context);
            com.xiaomi.push.b.a(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r1.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00fb: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:63:0x00fb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.v.a a(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.v.a(java.lang.String, boolean):com.xiaomi.push.service.v$a");
    }

    private static void a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (a == 0) {
                a = jw.a(file);
            }
            if (a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (!listFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i].lastModified()) > 1209600) {
                            listFiles[i].delete();
                        }
                    }
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                }
                a = 0L;
            }
        }
    }

    private static Bitmap b(Context context, String str) {
        Bitmap bitmap;
        FileInputStream fileInputStream;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", com.xiaomi.push.ar.a(str));
        FileInputStream fileInputStream2 = null;
        try {
            if (file.exists()) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            bitmap = com.sankuai.waimai.launcher.util.image.a.a(fileInputStream);
                        } catch (Exception e) {
                            bitmap = null;
                            fileInputStream2 = fileInputStream;
                            e = e;
                        }
                    } catch (Throwable th) {
                        fileInputStream2 = fileInputStream;
                        th = th;
                        com.xiaomi.push.b.a(fileInputStream2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bitmap = null;
                }
                try {
                    file.setLastModified(System.currentTimeMillis());
                    com.xiaomi.push.b.a(fileInputStream);
                } catch (Exception e3) {
                    fileInputStream2 = fileInputStream;
                    e = e3;
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    com.xiaomi.push.b.a(fileInputStream2);
                    return bitmap;
                }
                return bitmap;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0109, Exception -> 0x010b, TryCatch #8 {Exception -> 0x010b, all -> 0x0109, blocks: (B:15:0x002c, B:19:0x0047, B:21:0x004b, B:22:0x0052, B:24:0x007e, B:25:0x0081, B:32:0x00a3, B:48:0x00c7, B:50:0x00cd, B:54:0x0102, B:55:0x0108, B:47:0x00c1), top: B:78:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x0109, Exception -> 0x010b, TryCatch #8 {Exception -> 0x010b, all -> 0x0109, blocks: (B:15:0x002c, B:19:0x0047, B:21:0x004b, B:22:0x0052, B:24:0x007e, B:25:0x0081, B:32:0x00a3, B:48:0x00c7, B:50:0x00cd, B:54:0x0102, B:55:0x0108, B:47:0x00c1), top: B:78:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd A[Catch: all -> 0x0109, Exception -> 0x010b, TRY_LEAVE, TryCatch #8 {Exception -> 0x010b, all -> 0x0109, blocks: (B:15:0x002c, B:19:0x0047, B:21:0x004b, B:22:0x0052, B:24:0x007e, B:25:0x0081, B:32:0x00a3, B:48:0x00c7, B:50:0x00cd, B:54:0x0102, B:55:0x0108, B:47:0x00c1), top: B:78:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.xiaomi.push.service.v.b a(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.v.a(android.content.Context, java.lang.String, boolean):com.xiaomi.push.service.v$b");
    }
}
