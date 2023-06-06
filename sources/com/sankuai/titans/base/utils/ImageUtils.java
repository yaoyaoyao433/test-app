package com.sankuai.titans.base.utils;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.URLUtil;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.utils.CacheDirUtil;
import com.sankuai.waimai.launcher.util.image.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ImageUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Bitmap getBitmapByImageUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Bitmap bitmap = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "721830e27b52a95f67187a9ce1e43c4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "721830e27b52a95f67187a9ce1e43c4c");
        }
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str)) {
            if (str.contains("base64")) {
                int indexOf = str.indexOf("base64,");
                if (indexOf >= 0) {
                    str = str.substring(indexOf + 7);
                }
                byte[] decode = Base64.decode(str, 0);
                return a.a(decode, 0, decode.length);
            }
            return bitmap;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        Bitmap a = a.a(httpURLConnection.getInputStream());
        try {
            httpURLConnection.disconnect();
            return a;
        } catch (Throwable th2) {
            th = th2;
            bitmap = a;
            Titans.serviceManager().getStatisticsService().reportClassError("ImageUtils", "getBitmapByImageUrl", th);
            return bitmap;
        }
    }

    public static Bitmap.CompressFormat getFormatFromBase64Url(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc0cbc2c76c868c4b8d4df14ce980c19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap.CompressFormat) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc0cbc2c76c868c4b8d4df14ce980c19");
        }
        try {
            if (!TextUtils.isEmpty(str) && str.contains("base64")) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                int indexOf = str.indexOf("base64,");
                if (indexOf > 0) {
                    if (str.substring(0, indexOf).contains("image/jpeg")) {
                        return Bitmap.CompressFormat.JPEG;
                    }
                    return str.substring(0, indexOf).contains("image/webp") ? Bitmap.CompressFormat.WEBP : compressFormat;
                }
                return compressFormat;
            }
            return null;
        } catch (Throwable th) {
            Titans.serviceManager().getStatisticsService().reportClassError("ImageUtils", "getFormatFromBase64Url", th);
            return null;
        }
    }

    public static Uri saveBitmapToPublicDirectory(t tVar, String str, Bitmap.CompressFormat compressFormat, Bitmap bitmap) throws IOException {
        Object[] objArr = {tVar, str, compressFormat, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc6fa03c6abcbcfc5b9495272c51fd84", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc6fa03c6abcbcfc5b9495272c51fd84");
        }
        String str2 = "image/jpeg";
        String str3 = ".jpg";
        if (compressFormat != null) {
            if (compressFormat == Bitmap.CompressFormat.PNG) {
                str2 = "image/png";
                str3 = ".png";
            } else if (compressFormat == Bitmap.CompressFormat.WEBP) {
                str2 = "image/webp";
                str3 = ".webp";
            }
        } else if (bitmap.hasAlpha()) {
            compressFormat = Bitmap.CompressFormat.PNG;
            str2 = "image/png";
            str3 = ".png";
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        String str4 = str2;
        return saveBitmapToPublicDirectory(tVar, str, "pic_" + System.currentTimeMillis() + str3, 100, compressFormat2, str4, bitmap);
    }

    public static Uri saveBitmapToPublicDirectory(t tVar, String str, String str2, int i, Bitmap.CompressFormat compressFormat, String str3, Bitmap bitmap) throws IOException {
        Object[] objArr = {tVar, str, str2, Integer.valueOf(i), compressFormat, str3, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1706dafa6a7ac311414895347b5c20a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1706dafa6a7ac311414895347b5c20a4");
        }
        if (androidCompatQ()) {
            ContentValues contentValues = new ContentValues(4);
            contentValues.put("title", str2);
            contentValues.put("_display_name", str2);
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("mime_type", str3);
            Uri a = tVar.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (a == null) {
                throw new IOException("insert error");
            }
            bitmap.compress(compressFormat, i, new FileOutputStream(tVar.a(a, "w").getFileDescriptor()));
            return a;
        }
        File file = new File(CacheDirUtil.getExternalStorageDir(), str);
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
        Cursor a2 = tVar.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data=?", new String[]{file2.getAbsolutePath()}, null);
        if (a2.moveToFirst()) {
            long j = a2.getLong(a2.getColumnIndex("_id"));
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            tVar.a(Uri.withAppendedPath(uri, sb.toString()), contentValues2, (String) null, (String[]) null);
        } else {
            tVar.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
        }
        a2.close();
        return Uri.fromFile(file2);
    }

    private static int getSDKVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f7db1ee0d41bb642992fb89bcc4f1a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f7db1ee0d41bb642992fb89bcc4f1a6")).intValue();
        }
        if (Build.VERSION.CODENAME.charAt(0) == 'Q') {
            return 29;
        }
        return Build.VERSION.SDK_INT;
    }

    private static boolean androidCompatQ() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acf81a00c9501b5e6262012e4975d3df", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acf81a00c9501b5e6262012e4975d3df")).booleanValue() : getSDKVersion() >= 29;
    }
}
