package com.tencent.rtmp;

import android.content.Context;
import android.util.Log;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.f;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXLiveBase {
    private static final String FILE_MD5_FFMPEG_ARM = "___md5_libtxffmpeg_arm_md5______";
    private static final String FILE_MD5_FFMPEG_V64 = "___md5_libtxffmpeg_v64_md5______";
    private static final String FILE_MD5_FFMPEG_V7A = "___md5_libtxffmpeg_v7a_md5______";
    private static final String FILE_MD5_LITEAV_ARM = "___md5_libliteavsdk_arm_md5_____";
    private static final String FILE_MD5_LITEAV_V64 = "___md5_libliteavsdk_v64_md5_____";
    private static final String FILE_MD5_LITEAV_V7A = "___md5_libliteavsdk_v7a_md5_____";
    private static final String FILE_MD5_SATURN_ARM = "___md5_libsaturn_arm_md5________";
    private static final String FILE_MD5_SATURN_V64 = "___md5_libsaturn_v64_md5________";
    private static final String FILE_MD5_SATURN_V7A = "___md5_libsaturn_v7a_md5________";
    private static final String FILE_MD5_TRAE_ARM = "___md5_libtraeimp_arm_md5_______";
    private static final String FILE_MD5_TRAE_V64 = "___md5_libtraeimp_v64_md5_______";
    private static final String FILE_MD5_TRAE_V7A = "___md5_libtraeimp_v7a_md5_______";
    private static final String TAG = "TXLiveBase";
    private static TXLiveBase instance = new TXLiveBase();
    private static ITXLiveBaseListener listener;

    private TXLiveBase() {
    }

    public static TXLiveBase getInstance() {
        return instance;
    }

    public void setLicence(Context context, String str, String str2) {
        LicenceCheck.a().b(context, str, str2);
    }

    public String getLicenceInfo(Context context) {
        f fVar = new f();
        LicenceCheck.a().b(fVar, context);
        return fVar.a;
    }

    public static void setListener(ITXLiveBaseListener iTXLiveBaseListener) {
        TXCLog.setListener(new a());
        listener = iTXLiveBaseListener;
    }

    public static void setLogLevel(int i) {
        TXCLog.setLevel(i);
    }

    public static void setConsoleEnabled(boolean z) {
        TXCLog.setConsoleEnabled(z);
    }

    public static void setAppVersion(String str) {
        TXCDRApi.txSetAppVersion(str);
        TXCCommonUtil.setAppVersion(str);
    }

    public static void setLibraryPath(String str) {
        new StringBuilder("setLibraryPath ").append(str);
        g.b(str);
    }

    public static boolean isLibraryPathValid(String str) {
        String fileMD5 = getFileMD5(str, "libliteavsdk.so");
        String fileMD52 = getFileMD5(str, "libsaturn.so");
        String fileMD53 = getFileMD5(str, "libtxffmpeg.so");
        String fileMD54 = getFileMD5(str, "libtraeimp-rtmp.so");
        Log.e(TAG, "MD5-CHECK-V64 libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V64 = ___md5_libliteavsdk_v64_md5_____");
        Log.e(TAG, "MD5-CHECK-V64 libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V64 = ___md5_libsaturn_v64_md5________");
        Log.e(TAG, "MD5-CHECK-V64 libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V64 = ___md5_libtxffmpeg_v64_md5______");
        Log.e(TAG, "MD5-CHECK-V64 libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V64   = ___md5_libtraeimp_v64_md5_______");
        if (fileMD5 == null || !fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V64) || fileMD52 == null || !fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V64) || fileMD53 == null || !fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V64) || fileMD54 == null || !fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V64)) {
            Log.e(TAG, "MD5-CHECK-V7A libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_V7A = ___md5_libliteavsdk_v7a_md5_____");
            Log.e(TAG, "MD5-CHECK-V7A libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_V7A = ___md5_libsaturn_v7a_md5________");
            Log.e(TAG, "MD5-CHECK-V7A libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_V7A = ___md5_libtxffmpeg_v7a_md5______");
            Log.e(TAG, "MD5-CHECK-V7A libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_V7A   = ___md5_libtraeimp_v7a_md5_______");
            if (fileMD5 == null || !fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_V7A) || fileMD52 == null || !fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_V7A) || fileMD53 == null || !fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_V7A) || fileMD54 == null || !fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_V7A)) {
                Log.e(TAG, "MD5-CHECK-ARM libliteavsdk = " + fileMD5 + " FILE_MD5_LITEAV_ARM = ___md5_libliteavsdk_arm_md5_____");
                Log.e(TAG, "MD5-CHECK-ARM libsaturn    = " + fileMD52 + " FILE_MD5_SATURN_ARM = ___md5_libsaturn_arm_md5________");
                Log.e(TAG, "MD5-CHECK-ARM libtxffmpeg  = " + fileMD53 + " FILE_MD5_FFMPEG_ARM = ___md5_libtxffmpeg_arm_md5______");
                Log.e(TAG, "MD5-CHECK-ARM libtraeimpl  = " + fileMD54 + " FILE_MD5_TRAE_ARM   = ___md5_libtraeimp_arm_md5_______");
                return fileMD5 != null && fileMD5.equalsIgnoreCase(FILE_MD5_LITEAV_ARM) && fileMD52 != null && fileMD52.equalsIgnoreCase(FILE_MD5_SATURN_ARM) && fileMD53 != null && fileMD53.equalsIgnoreCase(FILE_MD5_FFMPEG_ARM) && fileMD54 != null && fileMD54.equalsIgnoreCase(FILE_MD5_TRAE_ARM);
            }
            return true;
        }
        return true;
    }

    public static String getSDKVersionStr() {
        return TXCCommonUtil.getSDKVersionStr();
    }

    public static void setPituLicencePath(String str) {
        TXCCommonUtil.setPituLicencePath(str);
    }

    public static String getPituSDKVersion() {
        return v.a();
    }

    public static void setAppID(String str) {
        TXCCommonUtil.setAppID(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements TXCLog.a {
        private a() {
        }

        @Override // com.tencent.liteav.basic.log.TXCLog.a
        public void a(int i, String str, String str2) {
            if (TXLiveBase.listener != null) {
                TXLiveBase.listener.OnLog(i, str, str2);
            }
        }
    }

    private static String getFileMD5(String str, String str2) {
        MessageDigest messageDigest;
        File file = new File(str, str2);
        if (file.exists() && file.isFile()) {
            byte[] bArr = new byte[1024];
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (FileNotFoundException e) {
                e = e;
                messageDigest = null;
            } catch (IOException e2) {
                e = e2;
                messageDigest = null;
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                messageDigest = null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream.close();
            } catch (FileNotFoundException e4) {
                e = e4;
                e.printStackTrace();
                return new BigInteger(1, messageDigest.digest()).toString(16);
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
                return new BigInteger(1, messageDigest.digest()).toString(16);
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                e.printStackTrace();
                return new BigInteger(1, messageDigest.digest()).toString(16);
            }
            return new BigInteger(1, messageDigest.digest()).toString(16);
        }
        return null;
    }

    public static void setUserId(String str) {
        TXCCommonUtil.setUserId(str);
    }
}
