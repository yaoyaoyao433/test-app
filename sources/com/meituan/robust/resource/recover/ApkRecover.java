package com.meituan.robust.resource.recover;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.FileUtil;
import com.meituan.robust.common.MD5;
import com.meituan.robust.common.ResourceConstant;
import com.meituan.robust.common.TxtFileReaderAndWriter;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.resource.diff.ApkDiffDataReaderAndWriter;
import com.meituan.robust.resource.diff.data.APKDiffData;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApkRecover {
    public static final String ROBUST_PATCH_TEMP = "patch_temp.apk";
    public static final String ROBUST_RESOURCES_APK = "robust_resources.apk";
    public static final String ROBUST_RESOURCES_APK_MD5 = "robust_resources_apk.md5";
    public static final String ROBUST_RESOURCE_DIR = "merge_dir";

    public static String getResourceDirPathString(Context context, String str, String str2) {
        return context.getFilesDir().getAbsolutePath() + File.separator + "patch" + File.separator + "robust" + File.separator + "resource" + File.separator + str + CommonConstant.Symbol.UNDERLINE + str2;
    }

    private static boolean isRecovered(String str, String str2) {
        File file = new File(str2);
        File file2 = new File(str);
        if (file2.exists() && file.exists()) {
            try {
            } catch (IOException e) {
                e.printStackTrace();
            }
            return TxtFileReaderAndWriter.readFileAsString(file).startsWith(MD5.getHashString(file2));
        }
        return false;
    }

    public static boolean isRecovered(Context context, String str, String str2) {
        String resourceDirPathString = getResourceDirPathString(context, str, str2);
        String str3 = resourceDirPathString + File.separator + ROBUST_RESOURCES_APK;
        StringBuilder sb = new StringBuilder();
        sb.append(resourceDirPathString);
        sb.append(File.separator);
        sb.append(ROBUST_RESOURCES_APK_MD5);
        return isRecovered(str3, sb.toString());
    }

    public static String getRobustResourcesApkPath(Context context, String str, String str2) {
        String resourceDirPathString = getResourceDirPathString(context, str, str2);
        return resourceDirPathString + File.separator + ROBUST_RESOURCES_APK;
    }

    public static File getRobustResourcesMergeDirLibFile(Context context, String str, String str2) {
        String resourceDirPathString = getResourceDirPathString(context, str, str2);
        return new File(new File(resourceDirPathString + File.separator + ROBUST_RESOURCE_DIR), APKStructure.Lib_Type);
    }

    public static String copyPatch2TmpPath(Context context, String str, String str2, String str3) {
        String str4 = getResourceDirPathString(context, str, str2) + File.separator + ROBUST_PATCH_TEMP;
        if (RecoverUtils.copyPatch(str3, str4)) {
            return str4;
        }
        return null;
    }

    public static synchronized boolean recover(Context context, String str, String str2, String str3) {
        ZipFile zipFile;
        String zipFileComment;
        synchronized (ApkRecover.class) {
            String resourceDirPathString = getResourceDirPathString(context, str, str2);
            String str4 = resourceDirPathString + File.separator + ROBUST_RESOURCES_APK;
            String str5 = resourceDirPathString + File.separator + ROBUST_RESOURCES_APK_MD5;
            boolean isRecovered = isRecovered(str4, str5);
            if (isRecovered) {
                new StringBuilder("recover isRecovered 112:").append(isRecovered);
                return true;
            }
            String str6 = resourceDirPathString + File.separator + ROBUST_RESOURCE_DIR;
            File file = new File(str6);
            new StringBuilder("recover cleanDir 118:").append(file);
            RecoverUtils.cleanDir(file);
            File file2 = new File(str6, APKDiffData.ROBUST_RESOURCES_DIFF_RELATIVE_PATH);
            FileUtil.createFile(file2.getAbsolutePath());
            try {
                ZipFile zipFile2 = new ZipFile(str3);
                new StringBuilder("recover diffApkZipFile 126:").append(str3);
                ZipEntry entry = zipFile2.getEntry(APKDiffData.ROBUST_RESOURCES_DIFF_RELATIVE_PATH);
                new StringBuilder("recover apkDiffDataEntry 129:").append(entry.getName());
                RecoverUtils.extract(zipFile2, entry, file2);
                if (!file2.exists()) {
                    new StringBuilder("recover apkDiffDataFile exists 138:").append(file2.exists());
                    return false;
                }
                APKDiffData readDiffData = ApkDiffDataReaderAndWriter.readDiffData(file2);
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    return false;
                }
                String str7 = applicationInfo.sourceDir;
                if (TextUtils.isEmpty(str7)) {
                    Log.e("robust", "recover baseApkFilePath  is isEmpty 152");
                    return false;
                }
                new StringBuilder("recover baseApkFilePath  155:").append(str7);
                if (readDiffData == null || readDiffData.isEmpty()) {
                    Log.e("Robust", "apkDiffData is blank");
                    return false;
                }
                try {
                    zipFile = new ZipFile(str7);
                } catch (IOException e) {
                    Log.e("Robust", "baseApkZipFile 167 IOException: " + e.toString());
                    e.printStackTrace();
                    zipFile = null;
                }
                File file3 = new File(str4);
                if (file3.exists()) {
                    file3.delete();
                }
                FileUtil.createFile(file3.getAbsolutePath());
                try {
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file3)));
                    boolean handleDiffModSet = RecoverUtils.handleDiffModSet(context, zipFile, zipFile2, zipOutputStream, file, readDiffData);
                    new StringBuilder("handleDiffModSet 190 resultDiffModSet: ").append(handleDiffModSet);
                    if (handleDiffModSet) {
                        boolean handleOtherSet = RecoverUtils.handleOtherSet(context, zipFile, zipFile2, zipOutputStream, file, readDiffData);
                        new StringBuilder("handleOtherSet 197 resultModSet: ").append(handleOtherSet);
                        if (handleOtherSet) {
                            ZipEntry entry2 = zipFile2.getEntry(ResourceConstant.ROBUST_RESOURCES_DIFF_RELATIVE_PATH);
                            FileUtil.addZipEntry(zipOutputStream, new ZipEntry(entry2.getName()), zipFile2.getInputStream(entry2));
                            Enumeration<? extends ZipEntry> entries = zipFile.entries();
                            while (entries.hasMoreElements()) {
                                ZipEntry nextElement = entries.nextElement();
                                if (nextElement == null) {
                                    return false;
                                }
                                String name = nextElement.getName();
                                if (!name.contains("../") && !name.startsWith(APKStructure.Dex_Type) && !readDiffData.isContains(name)) {
                                    new StringBuilder("FileUtil.addZipEntry to resources apk 228 : ").append(name);
                                    FileUtil.addZipEntry(zipOutputStream, new ZipEntry(nextElement.getName()), zipFile.getInputStream(nextElement));
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 19) {
                                zipFileComment = zipFile.getComment();
                            } else {
                                zipFileComment = ZipCommentUtil.getZipFileComment(str7);
                            }
                            if (!TextUtils.isEmpty(zipFileComment)) {
                                zipOutputStream.setComment(zipFileComment);
                            }
                            closeQuietly(zipOutputStream);
                            closeZip(zipFile);
                            closeZip(zipFile2);
                            try {
                                String hashString = MD5.getHashString(file3);
                                new StringBuilder("MD5.getHashString(robustResourcesApkFile) 258 : ").append(hashString);
                                if (TextUtils.isEmpty(hashString)) {
                                    return true;
                                }
                                File file4 = new File(str5);
                                new StringBuilder("writeFile(robustResourcesApkMd5File, robustResourcesApkZipFileMd5) 261 : ").append(hashString);
                                TxtFileReaderAndWriter.writeFile(file4, hashString);
                                return true;
                            } catch (IOException e2) {
                                Log.e("Robust", "write Md5 IOException 266 :  " + e2.toString());
                                e2.printStackTrace();
                                return false;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (FileNotFoundException e3) {
                    Log.e("Robust", "FileNotFoundException 183 FileNotFoundException: " + e3.toString());
                    e3.printStackTrace();
                    return false;
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return false;
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void closeZip(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
