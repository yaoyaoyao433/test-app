package com.meituan.android.common.unionid;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.CIPStorageManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class UnionIdStorage {
    private static final String TAG_LOG = "UnionIdStorage";
    private static final String UNION_ID_SDCARD_PATH = ".mt_dp_union_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void saveUnionIdToSdcard(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de143b8ab3388be5b6f1e6c65168f82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de143b8ab3388be5b6f1e6c65168f82b");
            return;
        }
        String unionIdFilePath = getUnionIdFilePath();
        if (TextUtils.isEmpty(unionIdFilePath)) {
            return;
        }
        createFileFolder(unionIdFilePath);
        writeFile(unionIdFilePath, str, false);
    }

    public static String getUnionIdBySdcard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f9c6cd8c1bec087d1032a66bae4ea89", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f9c6cd8c1bec087d1032a66bae4ea89") : getUnionIdBySdcard(null, null);
    }

    public static String getUnionIdBySdcard(Context context, StatUtil statUtil) {
        Object[] objArr = {context, statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c380b21846593de5b9a55819a643ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c380b21846593de5b9a55819a643ba9");
        }
        String unionIdFilePath = getUnionIdFilePath();
        if (TextUtils.isEmpty(unionIdFilePath) || !isFileExist(unionIdFilePath)) {
            return null;
        }
        String readFile = readFile(unionIdFilePath);
        if (TextUtils.isEmpty(readFile)) {
            return null;
        }
        return readFile;
    }

    public static void createFileFolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ac5510d51a596e6799c1fbf760e8bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ac5510d51a596e6799c1fbf760e8bb3");
            return;
        }
        try {
            new File(str).getParentFile().mkdirs();
        } catch (SecurityException unused) {
            Log.e(TAG_LOG, "UnionIdStorage - createFileFolder is error");
        }
    }

    public static boolean isFileExist(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49411816dd964ed05ac58b7556019a75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49411816dd964ed05ac58b7556019a75")).booleanValue();
        }
        try {
            return new File(str).exists();
        } catch (SecurityException unused) {
            Log.e(TAG_LOG, "UnionIdStorage - isFileExist is error");
            return false;
        } catch (Exception unused2) {
            Log.e(TAG_LOG, "UnionIdStorage - isFileExist is error");
            return false;
        }
    }

    public static String getUnionIdFilePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03e21f7ac4c23df65b9ff73d79530439", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03e21f7ac4c23df65b9ff73d79530439");
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            return CIPStorageManager.getFromSdcardEncryptedFile(OneIdHandler.getContext(), "Android", UNION_ID_SDCARD_PATH);
        }
        return null;
    }

    public static boolean writeFile(String str, String str2, boolean z) throws IOException {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        FileWriter fileWriter = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de50a80301233f08afd3889902ded96f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de50a80301233f08afd3889902ded96f")).booleanValue();
        }
        try {
            FileWriter fileWriter2 = new FileWriter(str, z);
            try {
                fileWriter2.write(str2);
                try {
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (IOException unused) {
                    Log.e(TAG_LOG, "UnionIdStorage - writeFile is error");
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
                        Log.e(TAG_LOG, "UnionIdStorage - writeFile is error");
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
        ?? isSupport = PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "709f54977ca5d5d0f640bace6ce93d89", RobustBitConfig.DEFAULT_VALUE);
        try {
            if (isSupport != 0) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "709f54977ca5d5d0f640bace6ce93d89");
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
                            sb.append('\n');
                        } else {
                            String sb2 = sb.toString();
                            try {
                                isSupport.close();
                                bufferedReader.close();
                                return sb2;
                            } catch (IOException unused2) {
                                Log.e(TAG_LOG, "UnionIdStorage - readFile is error");
                                return sb2;
                            }
                        }
                    } catch (Exception unused3) {
                        Log.e(TAG_LOG, "UnionIdStorage - readFile is error");
                        if (isSupport != 0) {
                            try {
                                isSupport.close();
                            } catch (IOException unused4) {
                                Log.e(TAG_LOG, "UnionIdStorage - readFile is error");
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
                        Log.e(TAG_LOG, "UnionIdStorage - readFile is error");
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
