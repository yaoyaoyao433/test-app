package com.meituan.robust.resource.recover;

import android.content.Context;
import android.util.Log;
import com.meituan.robust.common.FileUtil;
import com.meituan.robust.common.MD5;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.resource.diff.data.APKDiffData;
import com.meituan.robust.resource.diff.data.DataUnit;
import com.meituan.robust.resource.diff.util.DiffAndRecoverUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecoverUtils {
    private RecoverUtils() {
    }

    public static boolean copyPatch(String str, String str2) {
        try {
            FileUtil.copyFile(str, str2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void cleanDir(File file) {
        if (file.exists()) {
            FileUtil.deleteAllFile(file.getAbsolutePath());
            file.mkdirs();
        }
    }

    public static boolean extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        int i = 0;
        boolean z = false;
        while (i < 3 && !z) {
            i++;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[8192];
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr, 0, read);
                }
                closeQuietly(bufferedOutputStream);
                closeQuietly(bufferedInputStream);
                z = MD5.getHashString(file).equals(str);
                if (!z) {
                    file.delete();
                }
            } catch (Throwable th) {
                closeQuietly(bufferedOutputStream);
                closeQuietly(bufferedInputStream);
                throw th;
            }
        }
        return z;
    }

    public static boolean extract(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        int i = 0;
        boolean z = false;
        while (i < 3 && !z) {
            i++;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[8192];
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr, 0, read);
                }
                closeQuietly(bufferedOutputStream);
                closeQuietly(bufferedInputStream);
                z = true;
            } catch (Throwable th) {
                closeQuietly(bufferedOutputStream);
                closeQuietly(bufferedInputStream);
                throw th;
            }
        }
        return z;
    }

    public static boolean handleDiffModSet(Context context, ZipFile zipFile, ZipFile zipFile2, ZipOutputStream zipOutputStream, File file, APKDiffData aPKDiffData) {
        ZipEntry entry;
        ZipEntry entry2;
        InputStream inputStream;
        try {
            entry = zipFile.getEntry(APKStructure.ResourcesArsc_Type);
        } catch (Throwable th) {
            new StringBuilder("RecoverUtils zipBigFile2ApkOutputStream Throwable 161 : ").append(th.toString());
        }
        if (entry == null) {
            return false;
        }
        long crc = entry.getCrc();
        if (crc != aPKDiffData.oldResourcesArscCrc) {
            Log.e("Robust", "RecoverUtils handleDiffModSet 124 arsc :" + crc + ", patch base arsc: " + aPKDiffData.oldResourcesArscCrc);
            return false;
        } else if (aPKDiffData.diffModSet.isEmpty()) {
            return true;
        } else {
            for (DataUnit dataUnit : aPKDiffData.diffModSet) {
                String str = dataUnit.name;
                File file2 = new File(file, str);
                ZipEntry entry3 = zipFile2.getEntry(str);
                if (entry3 != null && (entry2 = zipFile.getEntry(str)) != null) {
                    InputStream inputStream2 = null;
                    try {
                        inputStream = zipFile.getInputStream(entry2);
                        try {
                            InputStream inputStream3 = zipFile2.getInputStream(entry3);
                            try {
                                DiffAndRecoverUtil.recover(inputStream, inputStream3, file2);
                                closeQuietly(inputStream);
                                closeQuietly(inputStream3);
                                if (file2.exists() && MD5.getHashString(file2).equals(dataUnit.newMd5)) {
                                    new StringBuilder("RecoverUtils zipBigFile2ApkOutputStream 161 name: ").append(dataUnit.name);
                                    zipBigFile2ApkOutputStream(dataUnit.name, file2, dataUnit.newCrc, zipOutputStream);
                                    return true;
                                }
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream2 = inputStream3;
                                closeQuietly(inputStream);
                                closeQuietly(inputStream2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                }
            }
            return true;
        }
    }

    private static void zipBigFile2ApkOutputStream(String str, File file, long j, ZipOutputStream zipOutputStream) throws IOException {
        ZipEntry zipEntry = new ZipEntry(str);
        zipEntry.setMethod(0);
        zipEntry.setSize(file.length());
        zipEntry.setCompressedSize(file.length());
        zipEntry.setCrc(j);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileUtil.addZipEntry(zipOutputStream, zipEntry, fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean handleOtherSet(Context context, ZipFile zipFile, ZipFile zipFile2, ZipOutputStream zipOutputStream, File file, APKDiffData aPKDiffData) {
        if (!aPKDiffData.addSet.isEmpty()) {
            for (DataUnit dataUnit : aPKDiffData.addSet) {
                String str = dataUnit.name;
                new StringBuilder("RecoverUtils apkDiffData.addSet 205 name: ").append(str);
                ZipEntry entry = zipFile2.getEntry(str);
                if (str.startsWith(APKStructure.Lib_Type)) {
                    try {
                        extract(zipFile2, entry, new File(file, str), dataUnit.newMd5);
                    } catch (Throwable th) {
                        Log.e("Robust", "RecoverUtils apkDiffData.addSet 213 Throwable: " + th.toString());
                        th.printStackTrace();
                        return false;
                    }
                } else {
                    try {
                        FileUtil.addZipEntry(zipOutputStream, new ZipEntry(entry.getName()), zipFile2.getInputStream(entry));
                    } catch (Throwable th2) {
                        Log.e("Robust", "RecoverUtils apkDiffData.addSet 221 Throwable: " + th2.toString());
                        th2.printStackTrace();
                        return false;
                    }
                }
            }
        }
        if (aPKDiffData.modSet.isEmpty()) {
            return true;
        }
        for (DataUnit dataUnit2 : aPKDiffData.modSet) {
            String str2 = dataUnit2.name;
            new StringBuilder("RecoverUtils apkDiffData.modSet 233 name: ").append(str2);
            ZipEntry entry2 = zipFile2.getEntry(str2);
            if (str2.startsWith(APKStructure.Lib_Type)) {
                try {
                    extract(zipFile2, entry2, new File(file, str2), dataUnit2.newMd5);
                } catch (Throwable th3) {
                    Log.e("Robust", "RecoverUtils apkDiffData.modSet 240 Throwable: " + th3.toString());
                    th3.printStackTrace();
                    return false;
                }
            } else {
                try {
                    FileUtil.addZipEntry(zipOutputStream, new ZipEntry(entry2.getName()), zipFile2.getInputStream(entry2));
                } catch (Throwable th4) {
                    Log.e("Robust", "RecoverUtils apkDiffData.modSet 248 Throwable: " + th4.toString());
                    th4.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
