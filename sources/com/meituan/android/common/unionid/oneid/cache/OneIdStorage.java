package com.meituan.android.common.unionid.oneid.cache;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.PermissionUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdStorage {
    public static final String APPID_SDCARD_PATH = ".appid";
    public static final String DPID_SDCARD_PATH = ".mt_dpid";
    public static final String LOCAL_ID_SDCARD_PATH = ".mt_localid";
    public static final String ONE_ID_SDCARD_PATH = ".mt_oneid";
    private static final String TAG_LOG = "OneIdStorage";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void saveOneIdToSdcard(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e49217991c578e886511f86f34c6d954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e49217991c578e886511f86f34c6d954");
            return;
        }
        String filePath = getFilePath(ONE_ID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath)) {
            return;
        }
        createFileFolder(filePath);
        writeFile(filePath, str, false);
    }

    public static void saveAppIdToSdcard(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a6786d07e62c54e82882ec1f0a019bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a6786d07e62c54e82882ec1f0a019bd");
            return;
        }
        String filePath = getFilePath(APPID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath)) {
            return;
        }
        createFileFolder(filePath);
        writeFile(filePath, str, false);
    }

    public static String getOneIdBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffe50a3a83134b06fa59343eedd52036", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffe50a3a83134b06fa59343eedd52036");
        }
        String filePath = getFilePath(ONE_ID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath) || !isFileExist(filePath)) {
            return null;
        }
        String readFile = readFile(filePath);
        if (TextUtils.isEmpty(readFile)) {
            return null;
        }
        return readFile;
    }

    public static String getAppIdBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25cef99b747e9aab9464dce8a64293fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25cef99b747e9aab9464dce8a64293fe") : getAppIdBySdcard(null, null);
    }

    public static String getAppIdBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87a0d6a80fdc2f06a06a98c1575128b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87a0d6a80fdc2f06a06a98c1575128b2");
        }
        String filePath = getFilePath(APPID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath) || isFileExist(filePath)) {
            String readFile = readFile(filePath);
            if (TextUtils.isEmpty(readFile)) {
                return null;
            }
            return readFile;
        }
        return null;
    }

    public static void saveLocalIdToSdcard(Context context, String str) throws IOException {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8760af3a65dfbc7f1b1c2ab038230b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8760af3a65dfbc7f1b1c2ab038230b90");
        } else if (PermissionUtil.checkWriteSdCardPermission(context)) {
            String filePath = getFilePath(LOCAL_ID_SDCARD_PATH);
            if (TextUtils.isEmpty(filePath)) {
                return;
            }
            createFileFolder(filePath);
            writeFile(filePath, str, false);
        }
    }

    public static String getLocalIdBySdcard(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73c0088e0d14285945a17c909af3e7f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73c0088e0d14285945a17c909af3e7f0") : getLocalIdBySdcard(context, null);
    }

    public static String getLocalIdBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9c8a8b13476113a447122d2b814d4f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9c8a8b13476113a447122d2b814d4f7");
        }
        if (!PermissionUtil.checkReadSdCardPermission(context)) {
            String filePath = getFilePath(LOCAL_ID_SDCARD_PATH);
            if (!TextUtils.isEmpty(filePath) && isFileExist(filePath) && statUtil != null) {
                statUtil.markStat(DeviceInfo.LOCAL_ID, 4);
            }
            return null;
        }
        String filePath2 = getFilePath(LOCAL_ID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath2) || !isFileExist(filePath2)) {
            return null;
        }
        String readFile = readFile(filePath2);
        if (TextUtils.isEmpty(readFile)) {
            return null;
        }
        return readFile;
    }

    public static void saveDpidToSdcard(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3247619b46218d1338a2a2d6cea975c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3247619b46218d1338a2a2d6cea975c7");
            return;
        }
        String filePath = getFilePath(DPID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath)) {
            return;
        }
        createFileFolder(filePath);
        writeFile(filePath, str, false);
    }

    public static String getDpidBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f7fa7a87259a57f5d2b433af854e376", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f7fa7a87259a57f5d2b433af854e376") : getDpidBySdcard(null, null);
    }

    public static String getDpidBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fb60d9e6bd93897ae0d48d31157545d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fb60d9e6bd93897ae0d48d31157545d");
        }
        String filePath = getFilePath(DPID_SDCARD_PATH);
        if (TextUtils.isEmpty(filePath) || !isFileExist(filePath)) {
            return null;
        }
        String readFile = readFile(filePath);
        if (TextUtils.isEmpty(readFile)) {
            return null;
        }
        return readFile;
    }

    public static boolean createFileFolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e96ae6d0f9d9592c0827dbb0f016bf3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e96ae6d0f9d9592c0827dbb0f016bf3")).booleanValue();
        }
        try {
            return new File(str).getParentFile().mkdirs();
        } catch (SecurityException unused) {
            Log.e(TAG_LOG, "OneIdStorage - createFileFolder is error");
            return false;
        }
    }

    public static boolean isFileExist(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fffd32a54e3b057fac9b87ff1f58b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fffd32a54e3b057fac9b87ff1f58b9a")).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (SecurityException unused) {
            Log.e(TAG_LOG, "OneIdStorage - isFileExist is error");
            return false;
        } catch (Exception unused2) {
            Log.e(TAG_LOG, "OneIdStorage - isFileExist is error");
            return false;
        }
    }

    public static String getFilePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a058a622394c315ef89b4d09121a844f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a058a622394c315ef89b4d09121a844f");
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState()) ? CIPStorageManager.getFromSdcardEncryptedFile(OneIdHandler.getContext(), "Android", str) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean writeFile(String str, String str2, boolean z) throws IOException {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileWriter fileWriter = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccd5dac7e1fa4233db5dd70a41dc8eaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccd5dac7e1fa4233db5dd70a41dc8eaf")).booleanValue();
        }
        try {
            FileWriter fileWriter2 = new FileWriter(str, z);
            try {
                fileWriter2.write(str2);
                try {
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (IOException unused) {
                    Log.e(TAG_LOG, "OneIdStorage - writeFile is error");
                }
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    try {
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException unused2) {
                        Log.e(TAG_LOG, "OneIdStorage - writeFile is error");
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileReader] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileReader] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.FileReader, java.io.Reader] */
    public static String readFile(String str) {
        BufferedReader bufferedReader;
        StringBuilder sb;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ?? isSupport = PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03e9b65bfc36f41dcdd5f08b03ce9198", RobustBitConfig.DEFAULT_VALUE);
        try {
            if (isSupport != 0) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03e9b65bfc36f41dcdd5f08b03ce9198");
            }
            try {
                sb = new StringBuilder();
                isSupport = new FileReader(str);
            } catch (Exception unused) {
                bufferedReader = null;
                isSupport = 0;
            } catch (Throwable th) {
                th = th;
                str = 0;
                isSupport = 0;
            }
            try {
                bufferedReader = new BufferedReader(isSupport);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            String sb2 = sb.toString();
                            try {
                                isSupport.close();
                                bufferedReader.close();
                                return sb2;
                            } catch (IOException unused2) {
                                Log.e(TAG_LOG, "oneIdStorage - readFile is error");
                                return sb2;
                            }
                        }
                    } catch (Exception unused3) {
                        Log.e(TAG_LOG, "oneIdStorage - readFile is error");
                        if (isSupport != 0) {
                            try {
                                isSupport.close();
                            } catch (IOException unused4) {
                                Log.e(TAG_LOG, "oneIdStorage - readFile is error");
                                return null;
                            }
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return null;
                    }
                }
            } catch (Exception unused5) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
                if (isSupport != 0) {
                    try {
                        isSupport.close();
                    } catch (IOException unused6) {
                        Log.e(TAG_LOG, "oneIdStorage - readFile is error");
                        throw th;
                    }
                }
                if (str != 0) {
                    str.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
