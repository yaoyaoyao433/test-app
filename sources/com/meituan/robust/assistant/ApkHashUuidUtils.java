package com.meituan.robust.assistant;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.assistant.process.FileUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApkHashUuidUtils {
    private static String APKHASH = "apkhash";
    private static String UUID = "uuid";
    private static String APKHASH_UUID = APKHASH + CommonConstant.Symbol.DOT + UUID;
    private static boolean isNeedCheck = true;

    ApkHashUuidUtils() {
    }

    public static void check(Context context, String str, String str2, RobustCallBack robustCallBack, String str3) {
        if (!isNeedCheck || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!bothSame(context, str, str2)) {
            if (updateCache(context, str, str2)) {
                isNeedCheck = false;
                return;
            }
            return;
        }
        isNeedCheck = false;
    }

    private static boolean updateCache(Context context, String str, String str2) {
        try {
            File file = new File(PatchManipulateImpl.getPatchDirPath(context), APKHASH_UUID);
            if (file.exists()) {
                file.delete();
            }
            FileUtils.writeFile(file, formateCombineContent(str, str2).trim());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean bothSame(Context context, String str, String str2) {
        File file = new File(PatchManipulateImpl.getPatchDirPath(context), APKHASH_UUID);
        if (file.exists()) {
            String formateCombineContent = formateCombineContent(str, str2);
            String readFile = FileUtils.readFile(file);
            if (!TextUtils.isEmpty(formateCombineContent) && !TextUtils.isEmpty(readFile) && TextUtils.equals(formateCombineContent, readFile)) {
                return true;
            }
        }
        return false;
    }

    private static String formateCombineContent(String str, String str2) {
        return APKHASH_UUID.replace(APKHASH, str).replace(UUID, str2);
    }
}
