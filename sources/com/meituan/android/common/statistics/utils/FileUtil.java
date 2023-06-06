package com.meituan.android.common.statistics.utils;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FileUtil {
    private static final String LXSDK_CIPSTORAGE_FILE_CHANNEL = "lxsdk_lxfiles";
    private static final String LX_FILE_DIR = "lxfiles";
    public static final String QR_CONFIG_FILE_NAME = "quick";
    private static final String TAG = "FileUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String readFile(Context context, String str) {
        FileReader fileReader;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f4baca23abe1d8c21b2edd0baf65dc5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f4baca23abe1d8c21b2edd0baf65dc5");
        }
        if (context == null) {
            return null;
        }
        File a = q.a(context, LXSDK_CIPSTORAGE_FILE_CHANNEL, str, u.f);
        if (a == null || !a.exists()) {
            return "";
        }
        try {
            fileReader = new FileReader(a);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                try {
                    fileReader.close();
                } catch (Exception unused) {
                }
                return sb2;
            } catch (Exception unused2) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
            fileReader = null;
        }
    }

    public static long getFileLength(Context context, String str) {
        File a;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a54f3e488b55e799610d2bd986bccdf4", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a54f3e488b55e799610d2bd986bccdf4")).longValue();
        }
        if (context != null && (a = q.a(context, LXSDK_CIPSTORAGE_FILE_CHANNEL, str, u.f)) != null && a.exists() && a.isFile()) {
            return a.length();
        }
        return 0L;
    }

    public static boolean hasFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f942aa6bcb8f60d4e0d55fe62584d716", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f942aa6bcb8f60d4e0d55fe62584d716")).booleanValue() : getFileLength(context, str) > 0;
    }

    public static boolean removeFile(Context context, String str) {
        File a;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8679c409970bbcf945219952e644407a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8679c409970bbcf945219952e644407a")).booleanValue();
        }
        if (context != null && (a = q.a(context, LXSDK_CIPSTORAGE_FILE_CHANNEL, str, u.f)) != null && a.exists() && a.isFile()) {
            return a.delete();
        }
        return false;
    }
}
