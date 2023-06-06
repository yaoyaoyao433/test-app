package com.tencent.tencentmap.mapsdk.maps.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.mapsdk.internal.hb;
import com.tencent.mapsdk.internal.kc;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class StorageManager {
    private static final String ROOT_DIR = "/tencentmapsdk/";
    private static StorageManager mInstance;
    private String mAppRootDir;
    private Context mContext;
    private String mCustomCacheRootPath;

    public static StorageManager getInstance(Context context, String str) {
        if (mInstance == null) {
            mInstance = new StorageManager(context, str);
        }
        return mInstance;
    }

    private StorageManager(Context context, String str) {
        if (context == null) {
            throw new Error("context can not be null");
        }
        this.mContext = context.getApplicationContext();
        this.mCustomCacheRootPath = str;
        updatePublicPath();
    }

    public static void clearMapCache(Context context, String str) {
        kc.f(getInstance(context, str).getCacheDir());
    }

    public File getCacheDir() {
        return new File(this.mAppRootDir);
    }

    private void updatePublicPath() {
        String storageRootPath = getStorageRootPath();
        String a = kc.a(this.mContext);
        if (hb.a(a)) {
            this.mAppRootDir = storageRootPath + ROOT_DIR;
            return;
        }
        this.mAppRootDir = storageRootPath + ROOT_DIR + a;
    }

    private String getStorageRootPath() {
        if (!TextUtils.isEmpty(this.mCustomCacheRootPath)) {
            return this.mCustomCacheRootPath;
        }
        Context context = this.mContext;
        String externalStoragePath = getExternalStoragePath(context);
        if (getAvailableStorageSize(externalStoragePath) < 5) {
            String path = context.getFilesDir().getPath();
            return getAvailableStorageSize(path) < 5 ? getExternalStoragePath(context) : path;
        }
        return externalStoragePath;
    }

    private static String getExternalStoragePath(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return context.getFilesDir().getPath();
    }

    @SuppressLint({"NewApi"})
    private static long getAvailableStorageSize(String str) {
        long blockSizeLong;
        long availableBlocksLong;
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT < 18) {
                blockSizeLong = statFs.getBlockSize();
                availableBlocksLong = statFs.getAvailableBlocks();
            } else {
                blockSizeLong = statFs.getBlockSizeLong();
                availableBlocksLong = statFs.getAvailableBlocksLong();
            }
            return ((blockSizeLong * availableBlocksLong) / 1024) / 1024;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
