package com.meituan.robust.assistant;

import com.meituan.robust.assistant.process.ProcessSafeDeleteFile;
import com.meituan.robust.assistant.process.ProcessSafeDownloadFile;
import com.meituan.robust.assistant.process.ProcessSafeReadFile;
import com.meituan.robust.assistant.process.ProcessSafeWriteFile;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessSafeOperateUtils {
    ProcessSafeOperateUtils() {
    }

    private static boolean writeFileSafe(File file, String str, String str2) throws IOException {
        return new ProcessSafeWriteFile(file, str, str2).perform().booleanValue();
    }

    private static String readFileSafe(File file, String str) throws IOException {
        return new ProcessSafeReadFile(file, str).perform();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean writePatchListLocal(File file, String str, String str2) throws IOException {
        return writeFileSafe(file, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String readPatchListLocal(File file, String str) throws IOException {
        return readFileSafe(file, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean deletePatchSafe(File file, String str) throws IOException {
        return new ProcessSafeDeleteFile(file, str).perform().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean downLoadPatchSafe(String str, File file, String str2) throws IOException {
        return new ProcessSafeDownloadFile(str, file, str2).perform().booleanValue();
    }
}
