package com.tencent.tencentmap.io;

import android.content.Context;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QStorageManager {
    public static final String DATA = "data/";
    private static QStorageManager mInstance;

    public void clearOldConfig(Context context, String str) {
    }

    public String getAssetsDynamicPath() {
        return null;
    }

    public String getAssetsLoadPath(String str) {
        return null;
    }

    public File getCacheDir() {
        return null;
    }

    public String getConfigPath(String str) {
        return null;
    }

    public String getConfigTempPath(String str) {
        return null;
    }

    public File getDataDir() {
        return null;
    }

    public String getMapPath() {
        return null;
    }

    public String getRouteBlockPath() {
        return null;
    }

    public String getSatPath() {
        return null;
    }

    public static QStorageManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new QStorageManager(context);
        }
        return mInstance;
    }

    private QStorageManager(Context context) {
    }
}
