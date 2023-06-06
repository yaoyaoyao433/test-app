package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.d;
import com.tencent.open.utils.k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static final void a(final Context context, final String str, final d dVar) {
        SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage()");
        if (TextUtils.isEmpty(str)) {
            dVar.a(1, (String) null);
        } else if (!k.a()) {
            dVar.a(2, (String) null);
        } else {
            final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    switch (message.what) {
                        case 101:
                            dVar.a(0, (ArrayList) message.obj);
                            return;
                        case 102:
                            dVar.a(message.arg1, (String) null);
                            return;
                        default:
                            super.handleMessage(message);
                            return;
                    }
                }
            };
            new Thread(new Runnable() { // from class: com.tencent.connect.share.a.2
                /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00e5 A[Catch: Exception -> 0x0175, TryCatch #0 {Exception -> 0x0175, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x0015, B:13:0x0086, B:15:0x00a9, B:20:0x00c4, B:29:0x011f, B:31:0x012b, B:33:0x0133, B:35:0x0139, B:23:0x00e5, B:25:0x00eb, B:16:0x00b1, B:8:0x0036, B:10:0x003c, B:12:0x0051), top: B:41:0x0002 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 403
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.share.a.AnonymousClass2.run():void");
                }
            }).start();
        }
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = i / width;
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    protected static final String a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append(str2);
        String stringBuffer2 = stringBuffer.toString();
        File file2 = new File(stringBuffer2);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                bitmap.recycle();
                return stringBuffer2;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            com.sankuai.waimai.launcher.util.image.a.a(str, options);
        } catch (OutOfMemoryError e) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "isBitMapNeedToCompress exception:", e);
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        SLog.d("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i5 > i2 || i3 > i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap a(java.lang.String r6, int r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r2 = 1
            r0.inJustDecodeBounds = r2
            com.sankuai.waimai.launcher.util.image.a.a(r6, r0)     // Catch: java.lang.OutOfMemoryError -> L14
            goto L1c
        L14:
            r2 = move-exception
            java.lang.String r3 = "openSDK_LOG.AsynScaleCompressImage"
            java.lang.String r4 = "scaleBitmap exception1:"
            com.tencent.open.log.SLog.e(r3, r4, r2)
        L1c:
            int r2 = r0.outWidth
            int r3 = r0.outHeight
            boolean r4 = r0.mCancel
            if (r4 != 0) goto L73
            int r4 = r0.outWidth
            r5 = -1
            if (r4 == r5) goto L73
            int r4 = r0.outHeight
            if (r4 != r5) goto L2e
            goto L73
        L2e:
            if (r2 <= r3) goto L31
            goto L32
        L31:
            r2 = r3
        L32:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r3
            if (r2 <= r7) goto L40
            int r2 = r7 * r7
            int r2 = a(r0, r5, r2)
            r0.inSampleSize = r2
        L40:
            r2 = 0
            r0.inJustDecodeBounds = r2
            android.graphics.Bitmap r6 = com.sankuai.waimai.launcher.util.image.a.a(r6, r0)     // Catch: java.lang.OutOfMemoryError -> L48 java.lang.Exception -> L51
            goto L5a
        L48:
            r6 = move-exception
            java.lang.String r2 = "openSDK_LOG.AsynScaleCompressImage"
            java.lang.String r3 = "scaleBitmap OutOfMemoryError:"
            com.tencent.open.log.SLog.e(r2, r3, r6)
            goto L59
        L51:
            r6 = move-exception
            java.lang.String r2 = "openSDK_LOG.AsynScaleCompressImage"
            java.lang.String r3 = "scaleBitmap exception2:"
            com.tencent.open.log.SLog.e(r2, r3, r6)
        L59:
            r6 = r1
        L5a:
            if (r6 != 0) goto L64
            java.lang.String r6 = "openSDK_LOG.AsynScaleCompressImage"
            java.lang.String r7 = "scaleBitmap return null"
            com.tencent.open.log.SLog.e(r6, r7)
            return r1
        L64:
            int r1 = r0.outWidth
            int r0 = r0.outHeight
            if (r1 <= r0) goto L6b
            r0 = r1
        L6b:
            if (r0 <= r7) goto L72
            android.graphics.Bitmap r6 = a(r6, r7)
            return r6
        L72:
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.share.a.a(java.lang.String, int):android.graphics.Bitmap");
    }

    public static final int a(BitmapFactory.Options options, int i, int i2) {
        int b = b(options, i, i2);
        if (b <= 8) {
            int i3 = 1;
            while (i3 < b) {
                i3 <<= 1;
            }
            return i3;
        }
        return ((b + 7) / 8) * 8;
    }

    private static int b(BitmapFactory.Options options, int i, int i2) {
        int min;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / i2));
        if (i == -1) {
            min = 128;
        } else {
            double d3 = i;
            min = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (min < ceil) {
            return ceil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i == -1 ? ceil : min;
    }
}
