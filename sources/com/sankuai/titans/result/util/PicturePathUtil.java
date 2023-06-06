package com.sankuai.titans.result.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PicturePathUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getRealPath(Context context, Uri uri, String str) {
        Object[] objArr = {context, uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Uri uri2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1635539c8dc9db09820627503cdace81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1635539c8dc9db09820627503cdace81");
        }
        if (context == null) {
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri) && isMediaDocument(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(CommonConstant.Symbol.COLON);
            String str2 = split[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(context, uri2, "_id=?", new String[]{split[1]}, str);
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (isGooglePhotosUri(uri)) {
                return uri.getLastPathSegment();
            }
            return getDataColumn(context, uri, null, null, str);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr, String str2) {
        Cursor cursor;
        Object[] objArr = {context, uri, str, strArr, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd8af2b4583c30fd2d046b55feb1a5fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd8af2b4583c30fd2d046b55feb1a5fa");
        }
        String[] strArr2 = {"_data"};
        try {
            cursor = ContentResolverProvider.getContentResolver(context, str2).a(uri, strArr2, str, strArr, null);
            try {
                cursor.moveToFirst();
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr2[0]));
                if (cursor != null) {
                    cursor.close();
                    return string;
                }
                return string;
            } catch (Exception unused) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    private static boolean isMediaDocument(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aef6d3bc39ca62d7aa309c3d5feb33de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aef6d3bc39ca62d7aa309c3d5feb33de")).booleanValue() : "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6052ce3ca93fbbf39333628292cddebd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6052ce3ca93fbbf39333628292cddebd")).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isMIUIAndQ() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb993a91aa16d8e127c51493dbed026e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb993a91aa16d8e127c51493dbed026e")).booleanValue() : "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 29;
    }

    public static Uri createMediaUri(Context context, boolean z, File file, String str) {
        Uri uri;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1198c0a2963839ed53ebc3408e3c2ecb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1198c0a2963839ed53ebc3408e3c2ecb");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", file.getAbsolutePath());
        contentValues.put("_display_name", file.getName());
        if (z) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        return ContentResolverProvider.getContentResolver(context, str).a(uri, contentValues);
    }

    public static File createFile(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1432d393c21c203f6ed58171575c2fca", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1432d393c21c203f6ed58171575c2fca");
        }
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date());
        String str2 = "";
        if (TextUtils.equals(Environment.DIRECTORY_PICTURES, str)) {
            str2 = ".jpg";
        } else if (TextUtils.equals(Environment.DIRECTORY_MOVIES, str)) {
            str2 = ".mp4";
        }
        String str3 = "TITANS_" + format + str2;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
        if ((!externalStoragePublicDirectory.exists() || !externalStoragePublicDirectory.isDirectory()) && !externalStoragePublicDirectory.mkdir()) {
            Log.e("TAG", "Throwing Errors....");
            throw new IOException("storageDir mkdir return false");
        }
        return new File(externalStoragePublicDirectory, str3);
    }
}
