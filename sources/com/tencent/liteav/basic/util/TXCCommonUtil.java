package com.tencent.liteav.basic.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCCommonUtil {
    private static final String TAG = "TXCCommonUtil";
    private static String mAppID = "";
    private static String mStrAppVersion = "";
    private static String mUserId = "";
    public static String pituLicencePath = "YTFaceSDK.licence";
    private static Context sApplicationContext;

    private static native String nativeGetConfigCenterKey();

    private static native int nativeGetSDKID();

    private static native String nativeGetSDKVersion();

    static {
        g.f();
    }

    public static int[] getSDKVersion() {
        String[] split = nativeGetSDKVersion().split("\\.");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                iArr[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException e) {
                TXCLog.e(TAG, "parse version failed.", e);
                iArr[i] = 0;
            }
        }
        return iArr;
    }

    public static String getSDKVersionStr() {
        return nativeGetSDKVersion();
    }

    public static int getSDKID() {
        return nativeGetSDKID();
    }

    public static String getConfigCenterKey() {
        return nativeGetConfigCenterKey();
    }

    public static String getFileExtension(String str) {
        int lastIndexOf;
        if (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void setAppContext(Context context) {
        if (context == null) {
            return;
        }
        sApplicationContext = context.getApplicationContext();
    }

    public static Context getAppContext() {
        return sApplicationContext;
    }

    public static void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException unused) {
        }
    }

    public static String getStreamIDByStreamUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf2 = str.indexOf(CommonConstant.Symbol.DOT);
        if (indexOf2 != -1) {
            str = str.substring(0, indexOf2);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static String getAppNameByStreamUrl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            str = str.substring(0, lastIndexOf);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        int lastIndexOf2 = str.lastIndexOf("/");
        if (lastIndexOf2 != -1) {
            str = str.substring(lastIndexOf2 + 1);
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static void setAppVersion(String str) {
        mStrAppVersion = str;
    }

    public static void setPituLicencePath(String str) {
        pituLicencePath = str;
    }

    public static String getAppVersion() {
        return mStrAppVersion;
    }

    public static void setAppID(String str) {
        mAppID = str;
    }

    public static String getAppID() {
        return mAppID;
    }

    public static String getUserId() {
        return mUserId;
    }

    public static void setUserId(String str) {
        mUserId = str;
    }

    public static String getMD5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void saveString(String str, String str2) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e) {
            TXCLog.e(TAG, "save string failed", e);
        }
    }

    public static String loadString(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getString(str, "");
        } catch (Exception e) {
            TXCLog.e(TAG, "load string failed.", e);
            return "";
        }
    }

    public static void saveUInt64(String str, long j) {
        Context context = sApplicationContext;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("TXCCommonConfig", 0).edit();
            edit.putLong(str, j);
            edit.commit();
        } catch (Exception e) {
            TXCLog.e(TAG, "save uint64 failed.", e);
        }
    }

    public static long loadUInt64(String str) {
        Context context = sApplicationContext;
        if (context == null) {
            return 0L;
        }
        try {
            return context.getSharedPreferences("TXCCommonConfig", 0).getLong(str, 0L);
        } catch (Exception e) {
            TXCLog.e(TAG, "load uint64 failed.", e);
            return 0L;
        }
    }

    public static void zip(ArrayList<String> arrayList, String str) {
        ZipOutputStream zipOutputStream;
        FileInputStream fileInputStream;
        Exception e;
        byte[] bArr;
        File file = new File(str);
        ZipOutputStream zipOutputStream2 = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                try {
                    try {
                        zipOutputStream.setComment("LiteAV log");
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file2 = new File(it.next());
                            try {
                            } catch (Exception e2) {
                                fileInputStream = fileInputStream2;
                                e = e2;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                            }
                            if (file2.length() != 0 && file2.length() <= 8388608) {
                                fileInputStream = new FileInputStream(file2);
                                try {
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                                        bArr = new byte[8192];
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception unused) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    TXCLog.e(TAG, "zip failed.", e);
                                    try {
                                        break;
                                        fileInputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    fileInputStream2 = fileInputStream;
                                }
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read != -1) {
                                        zipOutputStream.write(bArr, 0, read);
                                    }
                                    break;
                                }
                                fileInputStream.close();
                                fileInputStream2 = fileInputStream;
                            }
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused3) {
                            }
                        }
                        try {
                            zipOutputStream.close();
                        } catch (Exception unused4) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            zipOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused6) {
                    zipOutputStream2 = zipOutputStream;
                    TXCLog.w(TAG, "zip log error");
                    try {
                        zipOutputStream2.close();
                    } catch (Exception unused7) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zipOutputStream = null;
            }
        } catch (FileNotFoundException unused8) {
        }
    }

    public static String getLogUploadPath() {
        File externalFilesDir;
        if (sApplicationContext == null || (externalFilesDir = sApplicationContext.getExternalFilesDir(null)) == null) {
            return "";
        }
        return externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
    }

    public static int getGateway() {
        if (sApplicationContext == null) {
            return 0;
        }
        try {
            return ((WifiManager) sApplicationContext.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Exception e) {
            TXCLog.e(TAG, "getGateway error ", e);
            return 0;
        }
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String getAppPackageName() {
        return g.c(sApplicationContext);
    }

    public static String getAppFilePath() {
        String absolutePath = sApplicationContext != null ? sApplicationContext.getFilesDir().getAbsolutePath() : "/sdcard/liteav";
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return absolutePath;
    }

    public static final String getDeviceInfo() {
        try {
            return Build.BRAND + CommonConstant.Symbol.UNDERLINE + Build.MODEL + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "unknown_device";
        }
    }
}
