package com.meituan.uuid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.common.unionid.oneid.util.TransferUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UUIDHelper {
    private static final long CHECK_WRTIE_PERMISSION_PERIOD = 60000;
    public static final String DES_KEY = "hqNc7zdG";
    public static final String EXTEND_UUID_PREFIX = "0000000000000";
    public static final String GLOBAL_READ_ONLY_FILE_NAME = "IU.ud";
    public static final String HIVE_NULL_VALUE = "\\N";
    private static final String PREFIX_REGISTER_UUID_NAME = "register_uuid_";
    public static final String REGEX_OLD_UUID = "[A-F0-9]{64}";
    public static final String SCHEME = "content://";
    public static final String SHARE_FILE_NAME = "share_uuid";
    public static final String SHARE_KEY = "uuid";
    private static final String SP_FILE_NAME_UUID_STATUS = "uuid_status";
    private static final String SP_KEY_HAS_SKIP = "has_skip";
    private static final String SP_KEY_LOAD_FROM_CONTENT_PROVIDER_FAILED = "load_from_content_provider_failed";
    public static final int TYPE_GET_UUID = 0;
    public static final int TYPE_GET_UUID_NEW = 6;
    public static final int TYPE_QUERY_UUID = 1;
    public static final int TYPE_REGISTER_UUID = 5;
    public static final int TYPE_SAVE_UUID = 2;
    public static final int TYPE_SAVE_UUID_TOALL = 4;
    public static final int TYPE_SAVE_UUID_TOSELF = 3;
    public static final int TYPE_UUID_DELEGATE = 10;
    private static final String UUID_DIR_TYPE = "id";
    public static final String UUID_PP_SDCARD_PATH2 = ".e6D8V9FAfm0";
    public static final String UUID_SDCARD_PATH2 = ".7qC6FDBVeo4";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static UUIDHelper instance;
    private static x sCIPStorageSPAdapter;
    private UUIDEventLogProvider eventLogProvider;
    private static final Object registerServerLock = new Object();
    private static boolean IS_WRITE_PERMITTED = false;
    private static long LAST_CHECK_PERMISSION_TIME_STAMP = 0;
    private static volatile String imei = null;
    private static volatile String wlanMac = null;
    private static volatile boolean isSync = false;
    private static boolean isReportNoPermission = false;
    private static volatile boolean canGetImei = true;

    public static boolean saveToOtherApps(Context context, String str) {
        return false;
    }

    private static boolean saveToSelfByContentProvider(Context context, String str) {
        return false;
    }

    public UUIDHelper(UUIDEventLogProvider uUIDEventLogProvider) {
        Object[] objArr = {uUIDEventLogProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d318ecebf6c03dbba89ec411838f4119", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d318ecebf6c03dbba89ec411838f4119");
        } else {
            this.eventLogProvider = uUIDEventLogProvider;
        }
    }

    public static synchronized UUIDHelper getInstance() {
        synchronized (UUIDHelper.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "628f8526045d50fa0441a2f0eb04b723", 6917529027641081856L)) {
                return (UUIDHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "628f8526045d50fa0441a2f0eb04b723");
            }
            if (instance == null) {
                instance = new UUIDHelper(new DefaultUUIDEventLogProvider());
            }
            return instance;
        }
    }

    public static void verifyUuidInSdcard(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36339ed6b74cafd762eab9981c9eff70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36339ed6b74cafd762eab9981c9eff70");
        } else if (TextUtils.equals(str, getFromSdcardEncrypted(context))) {
        } else {
            saveToSdcardEncrypted(context, str);
        }
    }

    public static void tryToSaveToSelf(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ddb5aaefe0781b17f0a6b491b0611fdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ddb5aaefe0781b17f0a6b491b0611fdc");
        } else if (context == null || TextUtils.isEmpty(str) || saveToSelfByContentProvider(context, str)) {
        } else {
            saveToSelf(context, str);
        }
    }

    public static boolean saveToSelf(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f0e519fddebd97ae2e5f99ec33b1ec3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f0e519fddebd97ae2e5f99ec33b1ec3")).booleanValue();
        }
        try {
            return saveToGlobalReadOnlyFile(context, str) && saveToPreference(context, str);
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            return false;
        }
    }

    public static void saveToAll(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6d6abfba29dba9e5b7c21ebfe28ec8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6d6abfba29dba9e5b7c21ebfe28ec8f");
            return;
        }
        saveToSelf(context, str);
        saveToPublic(context, str);
        saveToOtherApps(context, str);
    }

    public static void saveToPublic(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5e1735e2cdd0af62439a86b4893ca7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5e1735e2cdd0af62439a86b4893ca7f");
        } else {
            saveToSdcardEncrypted(context, str);
        }
    }

    public static boolean saveToPreference(Context context, String str) {
        boolean z;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f808d9432ed439a5a8df00a146731b66", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f808d9432ed439a5a8df00a146731b66")).booleanValue();
        }
        MonitorManager.addEvent("uuid", 139, true, MonitorManager.getMsg(str));
        sCIPStorageSPAdapter = CIPStorageManager.getApdater(context);
        if (sCIPStorageSPAdapter != null) {
            z = sCIPStorageSPAdapter.a("uuid", str, "share_uuid");
            if (!isSync && z && sCIPStorageSPAdapter.b != null) {
                sCIPStorageSPAdapter.b.j();
                isSync = true;
            }
        } else {
            z = false;
        }
        if (z) {
            MonitorManager.addEvent("uuid", 139, false, (JSONObject) null);
        } else {
            MonitorManager.addEvent("uuid", 139, false, MonitorManager.getExceptionMsg("unkonwn"));
        }
        if (TextUtils.isEmpty(str)) {
            UUIDUtils.logReport(context, UUIDHelper.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"saveToPreference_empty_uuid"});
        }
        return true;
    }

    public static String getFromPreference(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d50d9b2296566707670aba3af6bdc08", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d50d9b2296566707670aba3af6bdc08");
        }
        x apdater = CIPStorageManager.getApdater(context);
        sCIPStorageSPAdapter = apdater;
        return apdater.b("uuid", "", "share_uuid");
    }

    public static boolean saveToSdcardEncrypted(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3da4d68fafa8666807c8dd1054fe25ee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3da4d68fafa8666807c8dd1054fe25ee")).booleanValue();
        }
        try {
            MonitorManager.addEvent("uuid", 140, true, MonitorManager.getMsg(str));
            if (TextUtils.isEmpty(str)) {
                UUIDUtils.logReport(context, UUIDHelper.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"saveToSdcardEncrypted_uuid_empty"});
                MonitorManager.addEvent("uuid", 140, false, MonitorManager.getExceptionMsg("empty"));
            }
            String encrypt = encrypt(str);
            if (!TextUtils.isEmpty(encrypt)) {
                String deviceId = deviceId(context);
                writeFile(CIPStorageManager.getFromSdcardEncryptedFile(context, "Android", UUID_SDCARD_PATH2 + deviceId), encrypt);
                writeFile(CIPStorageManager.getFromSdcardEncryptedFile(context, "Android", UUID_PP_SDCARD_PATH2 + deviceId), TomDigest.getStringMd5(encrypt));
                MonitorManager.addEvent("uuid", 140, false, (JSONObject) null);
                return true;
            }
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            MonitorManager.addEvent("uuid", 140, false, MonitorManager.getExceptionMsg(th.getMessage()));
        }
        return false;
    }

    public static boolean checkSdcardEncryptedExist(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7ed61c3d29e08e47ded17eab1b5890e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7ed61c3d29e08e47ded17eab1b5890e")).booleanValue();
        }
        try {
            String deviceId = deviceId(context);
            File fromSdcardEncryptedFile = CIPStorageManager.getFromSdcardEncryptedFile(context, "Android", UUID_SDCARD_PATH2 + deviceId);
            if (fromSdcardEncryptedFile.exists()) {
                if (fromSdcardEncryptedFile.length() > 0) {
                    return true;
                }
            }
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
        }
        return false;
    }

    public static String getFromSdcardEncrypted(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d323c73a475855c0cf1abd009fe74fc8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d323c73a475855c0cf1abd009fe74fc8");
        }
        try {
            String deviceId = deviceId(context);
            String readFile = readFile(CIPStorageManager.getFromSdcardEncryptedFile(context, "Android", UUID_SDCARD_PATH2 + deviceId));
            String readFile2 = readFile(CIPStorageManager.getFromSdcardEncryptedFile(context, "Android", UUID_PP_SDCARD_PATH2 + deviceId));
            if (readFile != null && readFile2 != null && readFile2.trim().equals(TomDigest.getStringMd5(readFile).trim())) {
                str = readFile.trim();
            }
            return decrypt(str);
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            return "";
        }
    }

    public static boolean saveToGlobalReadOnlyFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e566e7beae81d843cf49c981b7cf81d8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e566e7beae81d843cf49c981b7cf81d8")).booleanValue();
        }
        MonitorManager.addEvent("uuid", 141, true, MonitorManager.getMsg(str));
        if (!checkUUIDValid(str)) {
            MonitorManager.addEvent("uuid", 141, false, MonitorManager.getExceptionMsg("not valid"));
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            UUIDUtils.logReport(context, UUIDHelper.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"saveToGlobalReadOnlyFile_empty_uuid"});
            MonitorManager.addEvent("uuid", 141, false, MonitorManager.getExceptionMsg("empty"));
        }
        File requestFilePath = CIPStorageManager.requestFilePath(context, GLOBAL_READ_ONLY_FILE_NAME);
        String encrypt = encrypt(str);
        if (TextUtils.isEmpty(encrypt)) {
            MonitorManager.addEvent("uuid", 141, false, MonitorManager.getExceptionMsg("encrypt failed"));
            return false;
        }
        if (requestFilePath != null) {
            try {
                if (!requestFilePath.exists()) {
                    requestFilePath.getParentFile().mkdirs();
                }
            } catch (Exception e) {
                getInstance().getEventLogProvider().throwableReport(e);
                MonitorManager.addEvent("uuid", 141, false, MonitorManager.getExceptionMsg(e.getMessage()));
            }
        }
        try {
            writeFile(requestFilePath, encrypt);
            Runtime runtime = Runtime.getRuntime();
            if (runtime.exec("chmod 644 " + requestFilePath.getAbsolutePath()).waitFor() == 0) {
                MonitorManager.addEvent("uuid", 141, false, (JSONObject) null);
                return true;
            }
        } catch (Exception e2) {
            getInstance().getEventLogProvider().throwableReport(e2);
            MonitorManager.addEvent("uuid", 141, false, MonitorManager.getExceptionMsg(e2.getMessage()));
        }
        return false;
    }

    public static Pair<String, String> getFromGlobalReadOnlyFiles(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d893a9dd0f523d6c9df45d8b038c1fd5", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d893a9dd0f523d6c9df45d8b038c1fd5");
        }
        try {
            String fromGlobalReadOnlyFile = getFromGlobalReadOnlyFile(context.getPackageName());
            if (checkUUIDValid(fromGlobalReadOnlyFile)) {
                return new Pair<>(fromGlobalReadOnlyFile, context.getPackageName());
            }
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
        }
        return new Pair<>("", "");
    }

    @SuppressLint({"SdCardPath"})
    public static String getFromGlobalReadOnlyFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9efa00ddbdc555c40d57e48af6bcc31", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9efa00ddbdc555c40d57e48af6bcc31");
        }
        File file = new File("/data/data/" + str + "/files/IU.ud");
        if (!file.exists()) {
            file = new File("/data/data/" + str + "/files/cips/common/oneid_shared_oneid/assets/IU.ud");
        }
        return decrypt(readFile(file));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static String readFile(File file) {
        BufferedReader bufferedReader;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6be4586bf147519e18cfe166bda98173", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6be4586bf147519e18cfe166bda98173");
        }
        try {
            if (!file.exists()) {
                return "";
            }
            try {
                StringBuilder sb = new StringBuilder();
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append('\n');
                        } else {
                            String sb2 = sb.toString();
                            try {
                                bufferedReader.close();
                                return sb2;
                            } catch (IOException e) {
                                getInstance().getEventLogProvider().throwableReport(e);
                                return sb2;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        getInstance().getEventLogProvider().throwableReport(e);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                getInstance().getEventLogProvider().throwableReport(e3);
                            }
                        }
                        return null;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                file = 0;
                if (file != 0) {
                    try {
                        file.close();
                    } catch (IOException e5) {
                        getInstance().getEventLogProvider().throwableReport(e5);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void writeFile(File file, String str) throws IOException {
        FileWriter fileWriter;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileWriter fileWriter2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cade03d4f95c8920f9948893c2ed91da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cade03d4f95c8920f9948893c2ed91da");
                return;
            }
            try {
                fileWriter = new FileWriter(file);
            } catch (IOException e) {
                e = e;
            }
            try {
                fileWriter.write(str);
                fileWriter.close();
            } catch (IOException e2) {
                e = e2;
                getInstance().getEventLogProvider().throwableReport(e);
                throw e;
            } catch (Throwable th) {
                th = th;
                fileWriter2 = fileWriter;
                if (fileWriter2 != null) {
                    fileWriter2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String deviceId(Context context) {
        MessageDigest messageDigest;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87ef512e045606323565b38d8ca942e9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87ef512e045606323565b38d8ca942e9");
        }
        try {
            imei = "";
            String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
            String androidId = AppUtil.getAndroidId(context);
            if (TextUtils.isEmpty(wlanMac)) {
                wlanMac = "";
            }
            String str2 = imei + str + androidId + wlanMac + ((String) null);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                getInstance().getEventLogProvider().throwableReport(e);
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
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            return "DeviceId0";
        }
    }

    public static Pair<String, Integer> registerFromServer(Context context, String str, DeviceInfo deviceInfo, Pair<String, Integer> pair, StatUtil statUtil) {
        Object[] objArr = {context, str, deviceInfo, pair, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "59d925d06a58e1678698b2118689f8db", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "59d925d06a58e1678698b2118689f8db");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (statUtil != null) {
                jSONObject.put("isFromProvider", false);
            } else {
                jSONObject.put("isFromProvider", true);
            }
            MonitorManager.addEvent(statUtil, "uuid", 138, true, jSONObject);
        } catch (Throwable unused) {
        }
        try {
            synchronized (registerServerLock) {
                String str2 = GetUUID.sUUID;
                if (checkUUIDValid(str2) && !isOverdue(context)) {
                    return new Pair<>(str2, 0);
                }
                OneIdHandler.getInstance(context).init();
                MonitorManager.addEvent(statUtil, "uuid", 138, false, jSONObject);
                Pair<Boolean, String> oneIdByUuid = OneIdHandler.getInstance(context).getOneIdByUuid(deviceInfo, str, pair, statUtil);
                if (TextUtils.isEmpty((CharSequence) oneIdByUuid.second)) {
                    UUIDUtils.logReport(context, UUIDHelper.class.getSimpleName(), UUIDUtils.getCurrentLineNumber(), new String[]{"uuid_from_network_empty"});
                }
                if (checkUUIDValid((String) oneIdByUuid.second)) {
                    GetUUID.sUUID = (String) oneIdByUuid.second;
                    if (pair == null || !TextUtils.equals((CharSequence) pair.first, (CharSequence) oneIdByUuid.second)) {
                        UUIDSaveManager.getInstance().saveToCurrentApp(context, (String) oneIdByUuid.second);
                    }
                    setUuidUpdateTime(context);
                    MonitorManager.addEvent(deviceInfo.stat, "uuid", 145, true, null);
                    if (!((Boolean) oneIdByUuid.first).booleanValue() && !OneIdPrivacyHelper.isPrivateChain(deviceInfo)) {
                        boolean localUuidTransferInfo = OneIdSharePref.getInstance(context).setLocalUuidTransferInfo(AppUtil.getNewTransferInfo(context));
                        TransferUtils.setLocalUuidTransferV2(context, 3, deviceInfo.androidId, deviceInfo.newTransferInfoCustomAccessNanoTime);
                        JSONObject jSONObject2 = new JSONObject();
                        if (localUuidTransferInfo) {
                            try {
                                jSONObject2.put("saveUuidTransferInfo", "success");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                jSONObject2.put("saveUuidTransferInfo", "fail");
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                        MonitorManager.addEvent(deviceInfo.stat, "uuid", 145, false, jSONObject2);
                    }
                    if (!((Boolean) oneIdByUuid.first).booleanValue()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AppUtil.getFirstInstallTime(context));
                        TransferUtils.setLocalUuidTransferV2(context, 2, sb.toString(), deviceInfo.newTransferInfoCustomAccessNanoTime);
                    }
                }
                return new Pair<>(oneIdByUuid.second, 0);
            }
        } catch (Exception e3) {
            getInstance().getEventLogProvider().throwableReport(e3);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("uuidException", e3.getMessage());
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            MonitorManager.addEvent(statUtil, "uuid", 12, false, jSONObject3);
            return null;
        }
    }

    public static String encrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2446b4b26a9124e6cb01690f3667bc42", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2446b4b26a9124e6cb01690f3667bc42") : TextUtils.isEmpty(str) ? "" : DESHelper.encrypt(str, "hqNc7zdG");
    }

    public static String decrypt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c6e8879e987579e506228241eb5abb2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c6e8879e987579e506228241eb5abb2") : TextUtils.isEmpty(str) ? "" : DESHelper.decrypt(str, "hqNc7zdG");
    }

    public static boolean isUUID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "785e1be3f64d9cdf11070fff0b6552da", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "785e1be3f64d9cdf11070fff0b6552da")).booleanValue() : !isUuidComplementedByUnionId(str);
    }

    public static boolean isUuidComplementedByUnionId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3bab8f2ad71e2638e8e9e4c9ef83d97", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3bab8f2ad71e2638e8e9e4c9ef83d97")).booleanValue();
        }
        return Pattern.compile("[0]{13}[A-F0-9]{51}").matcher(str.toUpperCase()).matches() || Pattern.compile("[A-F0-9]{51}").matcher(str.toUpperCase()).matches();
    }

    public static boolean isOverdue(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc013e5046d90a1e4a25330e149ead91", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc013e5046d90a1e4a25330e149ead91")).booleanValue() : AppUtil.checkOverdue(OneIdSharePref.getInstance(context).getUuidLastSyncTime());
    }

    public static void setUuidUpdateTime(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63c157c8f190503bbfd74931a1902150", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63c157c8f190503bbfd74931a1902150");
        } else {
            OneIdSharePref.getInstance(context).setUuidLastSyncTime(System.currentTimeMillis());
        }
    }

    public static String getUUIDFromLocal(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dd0c68fe295a375e1c70cdcacc08ac2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dd0c68fe295a375e1c70cdcacc08ac2");
        }
        try {
            String fromPreference = getFromPreference(context);
            if (!TextUtils.isEmpty(fromPreference)) {
                if (GetUUID.getInstance().isNeedVerifyUuidInSdcard) {
                    verifyUuidInSdcard(context, fromPreference);
                    GetUUID.getInstance().isNeedVerifyUuidInSdcard = false;
                }
                return fromPreference;
            }
            String fromGlobalReadOnlyFile = getFromGlobalReadOnlyFile(context.getPackageName());
            if (TextUtils.isEmpty(fromGlobalReadOnlyFile)) {
                return "";
            }
            if (GetUUID.getInstance().isNeedVerifyUuidInSdcard) {
                verifyUuidInSdcard(context, fromGlobalReadOnlyFile);
                GetUUID.getInstance().isNeedVerifyUuidInSdcard = false;
            }
            saveToPreference(context, fromGlobalReadOnlyFile);
            return fromGlobalReadOnlyFile;
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            return "";
        }
    }

    public static String getUUIDFromSelf(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5867de7e0c91c2ad73c68bb53e770911", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5867de7e0c91c2ad73c68bb53e770911");
        }
        try {
            String fromPreference = getFromPreference(context);
            if (checkUUIDValid(fromPreference)) {
                if (GetUUID.getInstance().isNeedVerifyUuidInSdcard) {
                    verifyUuidInSdcard(context, fromPreference);
                    GetUUID.getInstance().isNeedVerifyUuidInSdcard = false;
                }
                return fromPreference;
            }
            String fromGlobalReadOnlyFile = getFromGlobalReadOnlyFile(context.getPackageName());
            if (checkUUIDValid(fromGlobalReadOnlyFile)) {
                if (GetUUID.getInstance().isNeedVerifyUuidInSdcard) {
                    verifyUuidInSdcard(context, fromGlobalReadOnlyFile);
                    GetUUID.getInstance().isNeedVerifyUuidInSdcard = false;
                }
                saveToPreference(context, fromGlobalReadOnlyFile);
                return fromGlobalReadOnlyFile;
            }
            String fromSdcardEncrypted = getFromSdcardEncrypted(context);
            if (checkUUIDValid(fromSdcardEncrypted)) {
                saveToSelf(context, fromSdcardEncrypted);
                return fromSdcardEncrypted;
            }
            return "";
        } catch (Throwable th) {
            getInstance().getEventLogProvider().throwableReport(th);
            return "";
        }
    }

    public UUIDEventLogProvider getEventLogProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21a26a1b3d5c05d45cbe1c4852ac809d", 6917529027641081856L)) {
            return (UUIDEventLogProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21a26a1b3d5c05d45cbe1c4852ac809d");
        }
        if (this.eventLogProvider == null) {
            this.eventLogProvider = new DefaultUUIDEventLogProvider();
        }
        return this.eventLogProvider;
    }

    public void setEventLogProvider(UUIDEventLogProvider uUIDEventLogProvider) {
        Object[] objArr = {uUIDEventLogProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "050cb768fca5bcc8f7eb6c23ed61be30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "050cb768fca5bcc8f7eb6c23ed61be30");
        } else if (uUIDEventLogProvider == null) {
        } else {
            if (this.eventLogProvider == null) {
                this.eventLogProvider = uUIDEventLogProvider;
            } else if (uUIDEventLogProvider instanceof DefaultUUIDEventLogProvider) {
            } else {
                this.eventLogProvider = uUIDEventLogProvider;
            }
        }
    }

    public static boolean checkUUIDValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03e6ae14226abae41a808be0448eca85", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03e6ae14226abae41a808be0448eca85")).booleanValue() : isOldUuid(str) || isUnionIDAsUUID(str);
    }

    private static boolean isOldUuid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d464498161b567fa4197dee67b4a6da7", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d464498161b567fa4197dee67b4a6da7")).booleanValue() : notEmpty(str) && Pattern.matches("[A-F0-9]{64}", str);
    }

    private static boolean isUnionIDAsUUID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af119cd1e9e73f31fc2a7a85c8fd46c0", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af119cd1e9e73f31fc2a7a85c8fd46c0")).booleanValue() : notEmpty(str) && str.startsWith("0000000000000");
    }

    private static boolean notEmpty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dac5b6cac1541b0f3aea00c688f5373", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dac5b6cac1541b0f3aea00c688f5373")).booleanValue() : !TextUtils.isEmpty(str) || "\\N".equals(str);
    }

    public static boolean isUuidTransfer(DeviceInfo deviceInfo) {
        Object[] objArr = {deviceInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0546245c3b7e531ff9032e420d1fef84", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0546245c3b7e531ff9032e420d1fef84")).booleanValue();
        }
        if (deviceInfo != null) {
            return deviceInfo.uuidTransfer || deviceInfo.uuidTransferV2 || deviceInfo.uuidTransferV3;
        }
        return false;
    }
}
