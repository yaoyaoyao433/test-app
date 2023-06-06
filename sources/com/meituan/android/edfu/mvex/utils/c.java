package com.meituan.android.edfu.mvex.utils;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @SuppressLint({"NewApi"})
    public static String a(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "413ff89be98d9ff152cc0ab45317ca74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "413ff89be98d9ff152cc0ab45317ca74");
        }
        if (uri == null) {
            return "";
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf5dc8e2a98a39a211f889ee75ff6929", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf5dc8e2a98a39a211f889ee75ff6929")).booleanValue() : TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(CommonConstant.Symbol.COLON)[1]});
            }
            Object[] objArr3 = {uri};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3a85ee4736dbfc13b9ee0c4828bd92d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3a85ee4736dbfc13b9ee0c4828bd92d7")).booleanValue() : TextUtils.equals("com.android.providers.downloads.documents", uri.getAuthority())) {
                try {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                } catch (Exception unused) {
                    return "";
                }
            }
            return null;
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            return a(context, uri, null, null);
        } else {
            if (TextUtils.equals("file", uri.getScheme())) {
                return uri.getPath();
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r2 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r13, android.net.Uri r14, java.lang.String r15, java.lang.String[] r16) {
        /*
            r0 = r13
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r9 = 0
            r1[r9] = r0
            r10 = 1
            r1[r10] = r14
            r2 = 2
            r1[r2] = r15
            r2 = 3
            r1[r2] = r16
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.edfu.mvex.utils.c.a
            java.lang.String r12 = "6b7f7b8004090541016d9ec29721e3c3"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r1
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            r8 = 0
            if (r2 == 0) goto L29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r8, r11, r10, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L29:
            java.lang.String r1 = "_data"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = com.meituan.android.edfu.mvex.constants.a.b()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L65
            com.meituan.android.privacy.interfaces.t r2 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r13, r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L65
            r7 = 0
            r3 = r14
            r4 = r1
            r5 = r15
            r6 = r16
            android.database.Cursor r2 = r2.a(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L65
            if (r2 == 0) goto L57
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L66
            if (r0 == 0) goto L57
            r0 = r1[r9]     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L66
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L66
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L66
            r8 = r0
            goto L57
        L55:
            r0 = move-exception
            goto L5f
        L57:
            if (r2 == 0) goto L69
        L59:
            r2.close()
            goto L69
        L5d:
            r0 = move-exception
            r2 = r8
        L5f:
            if (r2 == 0) goto L64
            r2.close()
        L64:
            throw r0
        L65:
            r2 = r8
        L66:
            if (r2 == 0) goto L69
            goto L59
        L69:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.mvex.utils.c.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static Bitmap a(String str) {
        Bitmap a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f1f996929913f9c179ac90db6a9c07d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f1f996929913f9c179ac90db6a9c07d");
        }
        try {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "77be27a78c793688a1200b1c33826925", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "77be27a78c793688a1200b1c33826925");
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.sankuai.waimai.launcher.util.image.a.a(str, options);
                options.inSampleSize = a(options, 500, 500);
                options.inJustDecodeBounds = false;
                a2 = com.sankuai.waimai.launcher.util.image.a.a(str, options);
            }
            return a(b(str), a2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {options, 500, 500};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "464f1d9febd1650d3ea48fece23460db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "464f1d9febd1650d3ea48fece23460db")).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > 500 || i5 > 500) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > 500 && i7 / i3 > 500) {
                i3 *= 2;
            }
        }
        return i3;
    }

    private static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b413eead3c3382063c5ef84049d18822", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b413eead3c3382063c5ef84049d18822")).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    return attributeInt != 8 ? 0 : 270;
                }
                return 90;
            }
            return TXLiveConstants.RENDER_ROTATION_180;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static Bitmap a(int i, Bitmap bitmap) {
        Bitmap bitmap2;
        Object[] objArr = {Integer.valueOf(i), bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a9f445abf46d8aa99563a7abaf3d750", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a9f445abf46d8aa99563a7abaf3d750");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            bitmap2 = bitmap;
        }
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }
}
