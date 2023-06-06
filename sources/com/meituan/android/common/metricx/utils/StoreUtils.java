package com.meituan.android.common.metricx.utils;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StoreUtils {
    private static final String Channel = "mtplatform";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void moveFileToStore(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ef98346b4576ab0b5a1b241076669d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ef98346b4576ab0b5a1b241076669d3");
        } else if (new File(context.getFilesDir(), str).exists() && x.a(context, Channel, u.e, str)) {
            deleteOldFile(context, str);
        }
    }

    public static void deleteOldFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7522928ed9b83b352a82b1fd62503b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7522928ed9b83b352a82b1fd62503b37");
        } else {
            deleteFileOrDirectory(new File(context.getFilesDir(), str));
        }
    }

    public static void deleteOldCache(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bd6ada51401c547ddbf081dbff97a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bd6ada51401c547ddbf081dbff97a04");
        } else {
            deleteFileOrDirectory(new File(context.getCacheDir(), str));
        }
    }

    public static File getFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "379acf8ed89a1613457c33c380e308ec", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "379acf8ed89a1613457c33c380e308ec") : q.a(context, Channel, str, u.e);
    }

    public static File getCache(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a0f67d2dfcf92bf32de6b3633fc5466", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a0f67d2dfcf92bf32de6b3633fc5466") : q.a(context, Channel, str, u.b);
    }

    public static File getExternalFile(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e3e0e2f89d52f61779735c6978ae0c9", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e3e0e2f89d52f61779735c6978ae0c9") : q.b(context, Channel, str, u.e);
    }

    public static File getExternalCache(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1501681b288b0afbd4d51adc7a2264fe", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1501681b288b0afbd4d51adc7a2264fe") : q.b(context, Channel, str, u.b);
    }

    private static void deleteFileOrDirectory(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcfe1935cc24de7f232a94858a4723d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcfe1935cc24de7f232a94858a4723d8");
        } else if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    deleteFileOrDirectory(file2);
                }
            }
            file.delete();
        }
    }

    public static void removeCIPStorageObject(q qVar, Context context, String str) {
        Object[] objArr = {qVar, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30734be95c3e296d8224fd0d7cdd751a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30734be95c3e296d8224fd0d7cdd751a");
            return;
        }
        qVar.d();
        File a = q.a(context, str, (String) null);
        if (a != null) {
            deleteFileOrDirectory(a.getParentFile());
        }
    }
}
