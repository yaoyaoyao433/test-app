package com.meituan.android.common.unionid.oneid.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.android.common.unionid.TomDigest;
import com.meituan.android.common.unionid.oneid.cache.CIPStorageManager;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UuidHelper {
    public static final String DES_KEY = "hqNc7zdG";
    public static final String EXTEND_UUID_PREFIX = "0000000000000";
    private static final String GLOBAL_READ_ONLY_FILE_NAME = "IU.ud";
    public static final String HIVE_NULL_VALUE = "\\N";
    public static final String REGEX_OLD_UUID = "[A-F0-9]{64}";
    private static final String SHARE_FILE_NAME = "share_uuid";
    private static final String SHARE_KEY = "uuid";
    private static final String UUID_PP_SDCARD_PATH2 = ".e6D8V9FAfm0";
    private static final String UUID_SDCARD_PATH2 = ".7qC6FDBVeo4";
    private static volatile boolean canGetImei = true;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String imei;
    private static String wlanMac;

    public static String getUUIDFromLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f4be015b33b07f9d968f7eb87ee3194", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f4be015b33b07f9d968f7eb87ee3194") : getUUIDFromLocal(context, null);
    }

    public static String getUUIDFromLocal(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86a4b78a824efb4331c30b9fc743bb47", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86a4b78a824efb4331c30b9fc743bb47");
        }
        if (context == null) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 11);
                return "";
            }
            return "";
        }
        Context appContext = AppUtil.getAppContext(context);
        String uUIDFromCP = OneIdSharePref.getInstance(context).getUUIDFromCP(context);
        if (checkUUIDValid(uUIDFromCP)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 130);
            }
            return uUIDFromCP;
        }
        if (!TextUtils.isEmpty(uUIDFromCP) && statUtil != null) {
            statUtil.markStat("uuid", 14);
        }
        String fromGlobalReadOnlyFile = getFromGlobalReadOnlyFile(appContext.getPackageName());
        if (checkUUIDValid(fromGlobalReadOnlyFile)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 130);
            }
            return fromGlobalReadOnlyFile;
        }
        if (!TextUtils.isEmpty(fromGlobalReadOnlyFile) && TextUtils.isEmpty(uUIDFromCP)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 15);
            }
            uUIDFromCP = fromGlobalReadOnlyFile;
        }
        String fromSdcardEncrypted = getFromSdcardEncrypted(appContext);
        if (checkUUIDValid(fromSdcardEncrypted)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 131);
            }
            return fromSdcardEncrypted;
        }
        if (!TextUtils.isEmpty(fromSdcardEncrypted) && TextUtils.isEmpty(uUIDFromCP)) {
            if (statUtil != null) {
                statUtil.markStat("uuid", 16);
            }
            uUIDFromCP = fromSdcardEncrypted;
        }
        if (TextUtils.isEmpty(uUIDFromCP) && statUtil != null) {
            statUtil.markStat("uuid", 9);
        }
        return uUIDFromCP;
    }

    @SuppressLint({"SdCardPath"})
    private static String getFromGlobalReadOnlyFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7536b68e370a487124db5bbbc5d4ab7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7536b68e370a487124db5bbbc5d4ab7c");
        }
        return DESHelper.decrypt(readFile(new File("/data/data/" + str + "/files/IU.ud")), "hqNc7zdG");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[Catch: IOException -> 0x006b, TRY_LEAVE, TryCatch #6 {IOException -> 0x006b, blocks: (B:30:0x0063, B:32:0x0068), top: B:51:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String readFile(java.io.File r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.unionid.oneid.util.UuidHelper.changeQuickRedirect
            java.lang.String r10 = "2b8283787c4cb4fb30766419674f9be1"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            boolean r0 = r11.exists()
            if (r0 != 0) goto L27
            java.lang.String r11 = ""
            return r11
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r0.<init>()     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            r1.<init>(r11)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L52
        L36:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L5f
            if (r3 == 0) goto L45
            r0.append(r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L5f
            r3 = 10
            r0.append(r3)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L5f
            goto L36
        L45:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L5f
            r11.close()     // Catch: java.io.IOException -> L77
            r1.close()     // Catch: java.io.IOException -> L77
            goto L77
        L50:
            r0 = move-exception
            goto L61
        L52:
            r11 = r2
            goto L59
        L54:
            r0 = move-exception
            r1 = r2
            goto L61
        L57:
            r11 = r2
            r1 = r11
        L59:
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L6c
            goto L6c
        L5f:
            r0 = move-exception
            r2 = r11
        L61:
            if (r2 == 0) goto L66
            r2.close()     // Catch: java.io.IOException -> L6b
        L66:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L6b
        L6b:
            throw r0
        L6c:
            if (r11 == 0) goto L71
            r11.close()     // Catch: java.io.IOException -> L76
        L71:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.io.IOException -> L76
        L76:
            r0 = r2
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.util.UuidHelper.readFile(java.io.File):java.lang.String");
    }

    private static String getFromSdcardEncrypted(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf805768dd9918e92c52e4958e2efb70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf805768dd9918e92c52e4958e2efb70");
        }
        try {
            String deviceId = deviceId(context);
            String readFile = readFile(CIPStorageManager.getUUIDFromSdcardEncryptedFile(context, "Android", ".7qC6FDBVeo4" + deviceId));
            String readFile2 = readFile(CIPStorageManager.getUUIDFromSdcardEncryptedFile(context, "Android", ".e6D8V9FAfm0" + deviceId));
            if (readFile != null && readFile2 != null && readFile2.trim().equals(TomDigest.getStringMd5(readFile).trim())) {
                str = readFile.trim();
            }
            return decrypt(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String decrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08eddac56ebcd25c5846c3bfa01b0ce1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08eddac56ebcd25c5846c3bfa01b0ce1") : TextUtils.isEmpty(str) ? "" : DESHelper.decrypt(str, "hqNc7zdG");
    }

    private static String deviceId(Context context) {
        MessageDigest messageDigest;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da5cdda7bf77e276187b54079804e30e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da5cdda7bf77e276187b54079804e30e");
        }
        try {
            if (canGetImei && TextUtils.isEmpty(imei) && ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                imei = "";
                if (!TextUtils.isEmpty("")) {
                    return imei.trim();
                }
                canGetImei = false;
            }
            String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
            String androidId = AppUtil.getAndroidId(context);
            if (TextUtils.isEmpty(wlanMac)) {
                wlanMac = "";
            }
            String str2 = imei + str + androidId + wlanMac + ((String) null);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
                messageDigest = null;
            }
            messageDigest.update(str2.getBytes(), 0, str2.length());
            byte[] digest = messageDigest.digest();
            String str3 = "";
            for (byte b : digest) {
                if ((b & 255) <= 15) {
                    str3 = str3 + "0";
                }
                str3 = str3 + Integer.toHexString(i);
            }
            String upperCase = str3.toUpperCase();
            if (upperCase.length() > 15) {
                upperCase = upperCase.substring(0, 15);
            }
            return upperCase.trim();
        } catch (Throwable unused2) {
            return "DeviceId0";
        }
    }

    public static boolean checkUUIDValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57070c57a2edcd2dec5779cb0bbd0105", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57070c57a2edcd2dec5779cb0bbd0105")).booleanValue() : isOldUuid(str) || isUnionIDAsUUID(str);
    }

    private static boolean isOldUuid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0c56c7a11a652df1d29b43c335f0e0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0c56c7a11a652df1d29b43c335f0e0d")).booleanValue() : notEmpty(str) && Pattern.matches("[A-F0-9]{64}", str);
    }

    private static boolean isUnionIDAsUUID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "def8f49817821c123eba04f01a5c5521", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "def8f49817821c123eba04f01a5c5521")).booleanValue() : notEmpty(str) && str.startsWith("0000000000000");
    }

    private static boolean notEmpty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd59b6c59785e12a8b6058379de26bed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd59b6c59785e12a8b6058379de26bed")).booleanValue() : !TextUtils.isEmpty(str) || "\\N".equals(str);
    }
}
