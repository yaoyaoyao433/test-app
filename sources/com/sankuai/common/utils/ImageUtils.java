package com.sankuai.common.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ExifInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ImageUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Bitmap getRoundCornerBitmap(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0afb75e6a9cf83b811ae964a1088701", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0afb75e6a9cf83b811ae964a1088701");
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        float f = i2;
        RectF rectF = new RectF(f, f, bitmap.getWidth() - i2, bitmap.getHeight() - i2);
        float f2 = i;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        return createBitmap;
    }

    @Deprecated
    public static String getPathFromUri(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9f2587cd042f335056dbd094fd60922", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9f2587cd042f335056dbd094fd60922") : getPathFromUri("", context, uri);
    }

    public static String getPathFromUri(String str, Context context, Uri uri) {
        Cursor a;
        Object[] objArr = {str, context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3bd38615a87c59b05509f3b3744e4c02", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3bd38615a87c59b05509f3b3744e4c02");
        }
        String scheme = uri.getScheme();
        if (scheme.equals("file")) {
            return uri.getSchemeSpecificPart();
        }
        if (scheme.equals("content")) {
            String[] strArr = {"_data"};
            t createContentResolver = Privacy.createContentResolver(context, str);
            if (createContentResolver == null || (a = createContentResolver.a(uri, strArr, null, null, null)) == null) {
                return null;
            }
            String string = a.moveToFirst() ? a.getString(0) : null;
            a.close();
            return string;
        }
        return null;
    }

    @Deprecated
    public static final Bitmap getBitmapAsLargeAsPossible(Context context, Uri uri, int i, int i2) {
        Object[] objArr = {context, uri, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba37565cd2a98406990ecf24673e7536", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba37565cd2a98406990ecf24673e7536") : getBitmapAsLargeAsPossible("", context, uri, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x00a0->B:34:0x00a0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getBitmapAsLargeAsPossible(java.lang.String r15, android.content.Context r16, android.net.Uri r17, int r18, int r19) {
        /*
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r15
            r10 = 1
            r0[r10] = r16
            r1 = 2
            r0[r1] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r2 = 3
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.common.utils.ImageUtils.changeQuickRedirect
            java.lang.String r14 = "e94843497bef8a5a71201479a1ca6f08"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r13
            r5 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r13, r10, r14)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L32:
            java.lang.String r1 = getPathFromUri(r15, r16, r17)
            boolean r0 = com.sankuai.common.utils.FileUtils.isFileExist(r1)
            if (r0 == 0) goto La7
            android.graphics.BitmapFactory$Options r3 = getBoundOptionByUri(r15, r16, r17)
            r3.inJustDecodeBounds = r8
            r3.inPurgeable = r10
            r3.inInputShareable = r10
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r3.inPreferredConfig = r0
            r4 = r18
            r5 = r2
        L4d:
            r3.inSampleSize = r4
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L86 java.lang.OutOfMemoryError -> L89 java.io.FileNotFoundException -> L8f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L86 java.lang.OutOfMemoryError -> L89 java.io.FileNotFoundException -> L8f
            android.graphics.Bitmap r0 = com.sankuai.waimai.launcher.util.image.a.a(r6, r2, r3)     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            int r7 = getExifOrientation(r1)     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            if (r0 == 0) goto L7d
            if (r7 == 0) goto L7d
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r12.<init>()     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            float r7 = (float) r7     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r12.postRotate(r7)     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r8 = 0
            r9 = 0
            int r10 = r0.getWidth()     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            int r11 = r0.getHeight()     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r13 = 1
            r7 = r0
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r0.recycle()     // Catch: java.lang.OutOfMemoryError -> L82 java.io.FileNotFoundException -> L84 java.lang.Throwable -> La2
            r0 = r7
        L7d:
            com.sankuai.common.utils.IOUtils.close(r6)
            r5 = r0
            goto L97
        L82:
            r0 = move-exception
            goto L8b
        L84:
            r0 = move-exception
            goto L91
        L86:
            r0 = move-exception
            r6 = r2
            goto La3
        L89:
            r0 = move-exception
            r6 = r2
        L8b:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> La2
            goto L94
        L8f:
            r0 = move-exception
            r6 = r2
        L91:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> La2
        L94:
            com.sankuai.common.utils.IOUtils.close(r6)
        L97:
            if (r5 != 0) goto La0
            r6 = r19
            if (r4 >= r6) goto La0
            int r4 = r4 * 2
            goto L4d
        La0:
            r2 = r5
            goto La7
        La2:
            r0 = move-exception
        La3:
            com.sankuai.common.utils.IOUtils.close(r6)
            throw r0
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.ImageUtils.getBitmapAsLargeAsPossible(java.lang.String, android.content.Context, android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static final int findSampleSizeSmallerThanDesire(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae662296ad974d635bff2db2a11238dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae662296ad974d635bff2db2a11238dd")).intValue();
        }
        double max = Math.max(i / i3, i2 / i4);
        float f = 1.0f;
        while (f < max) {
            f *= 2.0f;
        }
        return (int) f;
    }

    @Deprecated
    public static final Bitmap getCompressBitmapByUri(Context context, Uri uri, int i, int i2) {
        Object[] objArr = {context, uri, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "745f8441f75c387138572b72c0c62f71", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "745f8441f75c387138572b72c0c62f71") : getCompressBitmapByUri("", context, uri, i, i2);
    }

    public static final Bitmap getCompressBitmapByUri(String str, Context context, Uri uri, int i, int i2) {
        Object[] objArr = {str, context, uri, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1dc6bead402c89f685a1829383307c1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1dc6bead402c89f685a1829383307c1f");
        }
        BitmapFactory.Options boundOptionByUri = getBoundOptionByUri(str, context, uri);
        return getBitmapByUri(str, context, uri, boundOptionByUri, findSampleSizeSmallerThanDesire(boundOptionByUri.outWidth, boundOptionByUri.outHeight, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    private static Bitmap getBitmapByUri(String str, Context context, Uri uri, BitmapFactory.Options options, int i) {
        FileInputStream fileInputStream;
        Object[] objArr = {str, context, uri, options, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "284ab1eaf369d156abdd307ad6cd3573", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "284ab1eaf369d156abdd307ad6cd3573");
        }
        String pathFromUri = getPathFromUri(str, context, uri);
        if (FileUtils.isFileExist(pathFromUri)) {
            ?? r2 = i;
            try {
                try {
                    options.inSampleSize = r2;
                    options.inJustDecodeBounds = false;
                    options.inPurgeable = true;
                    options.inInputShareable = true;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    fileInputStream = new FileInputStream(pathFromUri);
                    try {
                        Bitmap a = a.a(fileInputStream, (Rect) null, options);
                        int exifOrientation = getExifOrientation(pathFromUri);
                        if (a == null || exifOrientation == 0) {
                            bitmap = a;
                            r2 = fileInputStream;
                        } else {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(exifOrientation);
                            Bitmap createBitmap = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                            a.recycle();
                            bitmap = createBitmap;
                            r2 = fileInputStream;
                        }
                    } catch (FileNotFoundException e) {
                        e = e;
                        e.printStackTrace();
                        r2 = fileInputStream;
                        IOUtils.close((Closeable) r2);
                        return bitmap;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        e.printStackTrace();
                        r2 = fileInputStream;
                        IOUtils.close((Closeable) r2);
                        return bitmap;
                    }
                } catch (Throwable th) {
                    th = th;
                    IOUtils.close((Closeable) r2);
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                fileInputStream = null;
            } catch (OutOfMemoryError e4) {
                e = e4;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r2 = 0;
                IOUtils.close((Closeable) r2);
                throw th;
            }
            IOUtils.close((Closeable) r2);
        }
        return bitmap;
    }

    @Deprecated
    public static final BitmapFactory.Options getBoundOptionByUri(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82f6fc7f76a113da866e28e41d88dd4d", RobustBitConfig.DEFAULT_VALUE) ? (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82f6fc7f76a113da866e28e41d88dd4d") : getBoundOptionByUri("", context, uri);
    }

    public static final BitmapFactory.Options getBoundOptionByUri(String str, Context context, Uri uri) {
        t createContentResolver;
        Object[] objArr = {str, context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e86f40906f9ad4ace7d4a3b45d4e00a", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e86f40906f9ad4ace7d4a3b45d4e00a");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            try {
                createContentResolver = Privacy.createContentResolver(context, str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        }
        if (createContentResolver != null) {
            InputStream b = createContentResolver.b(uri);
            try {
                a.a(b, (Rect) null, options);
                IOUtils.close(b);
            } catch (FileNotFoundException e2) {
                e = e2;
                inputStream = b;
                e.printStackTrace();
                IOUtils.close(inputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                inputStream = b;
                IOUtils.close(inputStream);
                throw th;
            }
            return options;
        }
        IOUtils.close((Closeable) null);
        return options;
    }

    public static int getExifOrientation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f4daf44eb76522cd19e94be4f78612a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f4daf44eb76522cd19e94be4f78612a")).intValue();
        }
        try {
            String attribute = new ExifInterface(str).getAttribute("Orientation");
            if (TextUtils.isEmpty(attribute)) {
                return 0;
            }
            int parseInt = Integer.parseInt(attribute);
            if (parseInt != 1) {
                if (parseInt != 3) {
                    if (parseInt != 6) {
                        return parseInt != 8 ? 0 : 270;
                    }
                    return 90;
                }
                return TXLiveConstants.RENDER_ROTATION_180;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int pack(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = 1;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38be9e59362c59ce514115069336e4e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38be9e59362c59ce514115069336e4e9")).intValue();
        }
        if (z) {
            i += i2 - 1;
            i4 = -1;
        }
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[i] & 255);
            i += i4;
            i2 = i5;
        }
    }

    public static String getImageMimeType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63395ad8b1738b97331ec3a688259322", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63395ad8b1738b97331ec3a688259322");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            a.a(str, options);
            String str2 = options.outMimeType;
            try {
                return TextUtils.isEmpty(str2) ? "" : str2;
            } catch (Throwable unused) {
                return str2;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }
}
