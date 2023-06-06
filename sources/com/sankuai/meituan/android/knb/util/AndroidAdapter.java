package com.sankuai.meituan.android.knb.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.dianping.titans.utils.ContentResolverProvider;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AndroidAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Context context;

    public static void init(Context context2) {
        context = context2;
    }

    public static int getSDKVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "540c850fe0b96c0387162c2f9043d8bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "540c850fe0b96c0387162c2f9043d8bb")).intValue();
        }
        if (Build.VERSION.CODENAME.charAt(0) == 'Q') {
            return 29;
        }
        return Build.VERSION.SDK_INT;
    }

    public static boolean androidCompatQ() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2c7ac7f912a98ef7e42bf043718405a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2c7ac7f912a98ef7e42bf043718405a")).booleanValue() : getSDKVersion() >= 29;
    }

    public static Uri saveBitmapToPublicDirectory(Context context2, String str, String str2, int i, Bitmap.CompressFormat compressFormat, String str3, Bitmap bitmap) throws IOException {
        Object[] objArr = {context2, str, str2, Integer.valueOf(i), compressFormat, str3, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17b5863cc508874448c8778e9374793a", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17b5863cc508874448c8778e9374793a") : saveBitmapToPublicDirectory(context2, str, str2, i, compressFormat, str3, bitmap, "");
    }

    public static Uri saveBitmapToPublicDirectory(Context context2, String str, String str2, int i, Bitmap.CompressFormat compressFormat, String str3, Bitmap bitmap, String str4) throws IOException {
        Cursor cursor;
        Object[] objArr = {context2, str, str2, Integer.valueOf(i), compressFormat, str3, bitmap, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Cursor cursor2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1f5c1ecca16402378638baff7658db3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1f5c1ecca16402378638baff7658db3");
        }
        if (androidCompatQ()) {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("title", str2);
            contentValues.put("_display_name", str2);
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("mime_type", str3);
            t contentResolver = ContentResolverProvider.getContentResolver(context2, str4);
            Uri a = contentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (a == null) {
                throw new IOException("insert error");
            }
            bitmap.compress(compressFormat, 100, new FileOutputStream(contentResolver.a(a, "w").getFileDescriptor()));
            return a;
        }
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("file error");
        }
        File file2 = new File(file, str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        bitmap.compress(compressFormat, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        ContentValues contentValues2 = new ContentValues(7);
        contentValues2.put("title", str2);
        contentValues2.put("_display_name", str2);
        contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues2.put("mime_type", str3);
        contentValues2.put("_data", file2.getAbsolutePath());
        t contentResolver2 = ContentResolverProvider.getContentResolver(context2, str4);
        try {
            cursor = contentResolver2.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data=?", new String[]{file2.getAbsolutePath()}, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(cursor.getColumnIndex("_id"));
                        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        StringBuilder sb = new StringBuilder();
                        sb.append(j);
                        contentResolver2.a(Uri.withAppendedPath(uri, sb.toString()), contentValues2, (String) null, (String[]) null);
                    } else {
                        contentResolver2.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
                    }
                } catch (Exception unused) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return Uri.fromFile(file2);
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return Uri.fromFile(file2);
    }

    public static Uri saveBitmapToPublicDirectory(Context context2, String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap) throws IOException {
        Object[] objArr = {context2, str, compressFormat, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f7dbc0d6e3f1efc1e970fe4817a9195", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f7dbc0d6e3f1efc1e970fe4817a9195") : saveBitmapToPublicDirectory(context2, str, compressFormat, bitmap, "");
    }

    public static Uri saveBitmapToPublicDirectory(Context context2, String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap, String str2) throws IOException {
        Object[] objArr = {context2, str, compressFormat, bitmap, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "815b27797120ce68f0a7fdcddbdcf040", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "815b27797120ce68f0a7fdcddbdcf040");
        }
        String str3 = "image/jpeg";
        String str4 = ".jpg";
        if (compressFormat != null) {
            if (compressFormat == Bitmap.CompressFormat.PNG) {
                str3 = "image/png";
                str4 = ".png";
            } else if (compressFormat == Bitmap.CompressFormat.WEBP) {
                str3 = "image/webp";
                str4 = ".webp";
            }
        } else if (bitmap.hasAlpha()) {
            compressFormat = Bitmap.CompressFormat.PNG;
            str3 = "image/png";
            str4 = ".png";
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        String str5 = str3;
        return saveBitmapToPublicDirectory(context2, str, "pic_" + System.currentTimeMillis() + str4, 100, compressFormat2, str5, bitmap, str2);
    }
}
