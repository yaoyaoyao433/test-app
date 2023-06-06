package com.sankuai.titans.widget.media.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ImageCaptureManager {
    private static final String CAPTURED_PHOTO_PATH_KEY = "mCurrentPhotoPath";
    public static final int REQUEST_TAKE_PHOTO = 1;
    public static final int REQUEST_TAKE_VIDEO = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashMap<File, Uri> mapFileAndUri = new HashMap<>();
    private Context mContext;

    public ImageCaptureManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9d28e559a17c99bef7576d571187793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9d28e559a17c99bef7576d571187793");
        } else {
            this.mContext = context;
        }
    }

    public static File createFile(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2f89abff55fb021bdf0c58fbb4e389a", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2f89abff55fb021bdf0c58fbb4e389a");
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

    private static boolean isMIUIAndQ() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c262358dd3986bd714c58f6c169155a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c262358dd3986bd714c58f6c169155a8")).booleanValue() : "xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 29;
    }

    public static Intent dispatchTakePictureIntent(Context context, File file, String str) throws IOException {
        Uri fromFile;
        Object[] objArr = {context, file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3b45501b6a1e95b910f5111dd92744b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3b45501b6a1e95b910f5111dd92744b");
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            if (isMIUIAndQ()) {
                fromFile = FileProvider.getUriForFile(context.getApplicationContext(), context.getApplicationInfo().packageName + ".titans.fileprovider", file);
            } else if (Build.VERSION.SDK_INT > 28) {
                fromFile = MediaStoreHelper.createMediaUri(context, true, file, str);
                intent.putExtra("output", fromFile);
                intent.addFlags(2);
            } else if (Build.VERSION.SDK_INT >= 24) {
                fromFile = FileProvider.getUriForFile(context.getApplicationContext(), context.getApplicationInfo().packageName + ".titans.fileprovider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            mapFileAndUri.put(file, fromFile);
            if (fromFile != null) {
                intent.putExtra("output", fromFile);
            }
        }
        return intent;
    }

    public static Intent dispatchTakeVideoIntent(Context context, File file, int i, int i2, String str) throws IOException {
        Uri fromFile;
        Object[] objArr = {context, file, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d5fdee294b6d92ff3d0e76161c4c44f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d5fdee294b6d92ff3d0e76161c4c44f");
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            if (Build.VERSION.SDK_INT > 28) {
                fromFile = MediaStoreHelper.createMediaUri(context, false, file, str);
                intent.putExtra("output", fromFile);
                intent.addFlags(2);
            } else if (Build.VERSION.SDK_INT >= 24) {
                fromFile = FileProvider.getUriForFile(context.getApplicationContext(), context.getApplicationInfo().packageName + ".titans.fileprovider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            mapFileAndUri.put(file, fromFile);
            if (fromFile != null) {
                intent.putExtra("output", fromFile);
                intent.putExtra("android.intent.extra.videoQuality", i);
                if (i2 > 0) {
                    intent.putExtra("android.intent.extra.durationLimit", i2);
                }
            }
        }
        return intent;
    }

    public static Uri popUriByFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c32511f3e5ae696111f8d05e4fb6730", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c32511f3e5ae696111f8d05e4fb6730") : mapFileAndUri.remove(file);
    }

    public void galleryAddPic(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f49281d1f77403f4d9cac739308e0ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f49281d1f77403f4d9cac739308e0ec");
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        intent.setData(Uri.fromFile(new File(str)));
        b.a(this.mContext, intent);
    }
}
