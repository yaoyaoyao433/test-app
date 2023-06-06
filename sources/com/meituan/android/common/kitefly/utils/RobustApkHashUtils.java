package com.meituan.android.common.kitefly.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class RobustApkHashUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String robustApkHashValue;

    public static String readRobustApkHash(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9ae3f92ad62e9943b17586f67168ef6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9ae3f92ad62e9943b17586f67168ef6");
        }
        if (TextUtils.isEmpty(robustApkHashValue)) {
            robustApkHashValue = readRobustApkHashFile(context);
        }
        return robustApkHashValue;
    }

    private static String readRobustApkHashFile(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b59a45bcf7d306a3a24d3d5bf56875c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b59a45bcf7d306a3a24d3d5bf56875c");
        }
        if (context == null) {
            return "";
        }
        try {
            return readFirstLine(context, Constants.ROBUST_APK_HASH_FILE_NAME);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String readFirstLine(Context context, String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fc75e4ed1145b021b5b318e61486e07", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fc75e4ed1145b021b5b318e61486e07");
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return readLine;
        } catch (IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }
}
