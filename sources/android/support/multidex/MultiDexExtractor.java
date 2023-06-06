package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.meituan.robust.Constants;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class MultiDexExtractor {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    private static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    private static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private static Method sApplyMethod;

    MultiDexExtractor() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<File> load(Context context, ApplicationInfo applicationInfo, File file, boolean z) throws IOException {
        List<File> performExtractions;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        sb.append(applicationInfo.sourceDir);
        sb.append(", ");
        sb.append(z);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        File file2 = new File(applicationInfo.sourceDir);
        long zipCrc = getZipCrc(file2);
        if (!z && !isModified(context, file2, zipCrc)) {
            try {
                performExtractions = loadExistingExtractions(context, file2, file);
            } catch (IOException e) {
                Log.w(TAG, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
            }
            StringBuilder sb2 = new StringBuilder("load found ");
            sb2.append(performExtractions.size());
            sb2.append(" secondary dex files");
            return performExtractions;
        }
        performExtractions = performExtractions(file2, file);
        putStoredApkInfo(context, getTimeStamp(file2), zipCrc, performExtractions.size() + 1);
        StringBuilder sb22 = new StringBuilder("load found ");
        sb22.append(performExtractions.size());
        sb22.append(" secondary dex files");
        return performExtractions;
    }

    private static List<File> loadExistingExtractions(Context context, File file, File file2) throws IOException {
        String str = file.getName() + EXTRACTED_NAME_EXT;
        int i = getMultiDexPreferences(context).getInt(KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 2; i2 <= i; i2++) {
            File file3 = new File(file2, str + i2 + ".zip");
            if (file3.isFile()) {
                arrayList.add(file3);
                if (!verifyZipFile(file3)) {
                    new StringBuilder("Invalid zip file: ").append(file3);
                    throw new IOException("Invalid ZIP file.");
                }
            } else {
                throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + CommonConstant.Symbol.SINGLE_QUOTES);
            }
        }
        return arrayList;
    }

    private static boolean isModified(Context context, File file, long j) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        return (multiDexPreferences.getLong("timestamp", -1L) == getTimeStamp(file) && multiDexPreferences.getLong(KEY_CRC, -1L) == j) ? false : true;
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(File file) throws IOException {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private static List<File> performExtractions(File file, File file2) throws IOException {
        String str = file.getName() + EXTRACTED_NAME_EXT;
        prepareDexDir(file2, str);
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            StringBuilder sb = new StringBuilder("classes");
            int i = 2;
            sb.append(2);
            sb.append(DEX_SUFFIX);
            ZipEntry entry = zipFile.getEntry(sb.toString());
            while (entry != null) {
                File file3 = new File(file2, str + i + ".zip");
                arrayList.add(file3);
                new StringBuilder("Extraction is needed for file ").append(file3);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    extract(zipFile, entry, file3, str);
                    z = verifyZipFile(file3);
                    StringBuilder sb2 = new StringBuilder("Extraction ");
                    sb2.append(z ? "success" : "failed");
                    sb2.append(" - length ");
                    sb2.append(file3.getAbsolutePath());
                    sb2.append(": ");
                    sb2.append(file3.length());
                    if (!z) {
                        file3.delete();
                        if (file3.exists()) {
                            StringBuilder sb3 = new StringBuilder("Failed to delete corrupted secondary dex '");
                            sb3.append(file3.getPath());
                            sb3.append(CommonConstant.Symbol.SINGLE_QUOTES);
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + file3.getAbsolutePath() + " for secondary dex (" + i + CommonConstant.Symbol.BRACKET_RIGHT);
                }
                i++;
                entry = zipFile.getEntry("classes" + i + DEX_SUFFIX);
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w(TAG, "Failed to close resource", e);
            }
        }
    }

    private static void putStoredApkInfo(Context context, long j, long j2, int i) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong(KEY_CRC, j2);
        edit.putInt(KEY_DEX_NUMBER, i);
        apply(edit);
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static void prepareDexDir(File file, final String str) throws IOException {
        mkdirChecked(file.getParentFile());
        mkdirChecked(file);
        File[] listFiles = file.listFiles(new FileFilter() { // from class: android.support.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return !file2.getName().startsWith(str);
            }
        });
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder("Failed to list secondary dex dir content (");
            sb.append(file.getPath());
            sb.append(").");
            return;
        }
        for (File file2 : listFiles) {
            StringBuilder sb2 = new StringBuilder("Trying to delete old file ");
            sb2.append(file2.getPath());
            sb2.append(" of size ");
            sb2.append(file2.length());
            if (!file2.delete()) {
                new StringBuilder("Failed to delete old file ").append(file2.getPath());
            } else {
                new StringBuilder("Deleted old file ").append(file2.getPath());
            }
        }
    }

    private static void mkdirChecked(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e(TAG, "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e(TAG, "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create cache directory " + file.getPath());
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(str, ".zip", file.getParentFile());
        new StringBuilder("Extracting ").append(createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry(Constants.CLASSES_DEX_NAME);
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            new StringBuilder("Renaming to ").append(file.getPath());
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + CommonConstant.Symbol.DOUBLE_QUOTES);
        } finally {
            closeQuietly(inputStream);
            createTempFile.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean verifyZipFile(File file) {
        try {
            try {
                new ZipFile(file).close();
                return true;
            } catch (IOException unused) {
                new StringBuilder("Failed to close zip file: ").append(file.getAbsolutePath());
                return false;
            }
        } catch (ZipException e) {
            Log.w(TAG, "File " + file.getAbsolutePath() + " is not a valid zip file.", e);
            return false;
        } catch (IOException e2) {
            Log.w(TAG, "Got an IOException trying to open zip file: " + file.getAbsolutePath(), e2);
            return false;
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w(TAG, "Failed to close resource", e);
        }
    }

    static {
        try {
            sApplyMethod = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException unused) {
            sApplyMethod = null;
        }
    }

    private static void apply(SharedPreferences.Editor editor) {
        if (sApplyMethod != null) {
            try {
                sApplyMethod.invoke(editor, new Object[0]);
                return;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        editor.commit();
    }
}
