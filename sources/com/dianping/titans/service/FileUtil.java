package com.dianping.titans.service;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FileUtil {
    public static final String BASE_FILE_DIR = "titans";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 10240;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static File getPathInFiles(Context context, String str) {
        File parentFile;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "257dd7e22264046c00fd4ed77c9a4bc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "257dd7e22264046c00fd4ed77c9a4bc6");
        }
        File b = q.b(context, "titans", str);
        if (b == null || (parentFile = b.getParentFile()) == null) {
            return null;
        }
        if (parentFile.exists() || parentFile.mkdirs()) {
            return b;
        }
        return null;
    }

    public static String getCacheKey(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6c470e696a65351f966cb6c08394609", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6c470e696a65351f966cb6c08394609");
        }
        StringBuilder sb = new StringBuilder();
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(parse.getScheme())) {
                parse = Uri.parse("adapter://" + str);
            }
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            if (!z && parse.isHierarchical()) {
                Iterator it = new TreeSet(parse.getQueryParameterNames()).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    sb.append(str2);
                    sb.append(parse.getQueryParameter(str2));
                }
            }
        } catch (Throwable unused) {
            sb.setLength(0);
            sb.append(str);
        }
        return Util.getUrlMD5Safe(sb.toString());
    }

    public static long getFileSize(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b189a6435ba0eb5dac366a7618a2ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b189a6435ba0eb5dac366a7618a2ba8")).longValue();
        }
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j += getFileSize(file2);
        }
        return j;
    }

    public static long deleteFileForce(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69ceeaa6e104f7542f8dfb7488669dc0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69ceeaa6e104f7542f8dfb7488669dc0")).longValue() : deleteFileForce(file, true);
    }

    public static long deleteFileForce(File file, boolean z) {
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c986401e86e5def02fb044bc8fc034d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c986401e86e5def02fb044bc8fc034d3")).longValue();
        }
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            long length = file.length();
            if (file.delete()) {
                return length;
            }
            return 0L;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                j += deleteFileForce(file2, z);
            }
        }
        if (z) {
            file.delete();
        }
        return j;
    }

    public static void writeFile(File file, String str) throws IOException {
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "329ddedd694a7d834b629f635ec941e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "329ddedd694a7d834b629f635ec941e1");
            return;
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(str.getBytes());
                fileOutputStream.flush();
                Util.closeCloseable(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                Util.closeCloseable(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static void writeFileWithClose(File file, InputStream inputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {file, inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedOutputStream bufferedOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2ec1aa4d861a8038978e938a1d85718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2ec1aa4d861a8038978e938a1d85718");
            return;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    Util.closeCloseable(bufferedOutputStream);
                    Util.closeCloseable(inputStream);
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            Util.closeCloseable(bufferedOutputStream2);
            Util.closeCloseable(inputStream);
            throw th;
        }
    }

    public static String readFile(File file) throws IOException {
        InputStreamReader inputStreamReader;
        String str;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30d444e9d23c65cf748fd28856f286e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30d444e9d23c65cf748fd28856f286e8");
        }
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                int length = (int) file.length();
                if (length > 10240) {
                    char[] cArr = new char[4096];
                    StringBuilder sb = new StringBuilder(length / 2);
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (-1 == read) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                    str = sb.toString();
                } else {
                    char[] cArr2 = new char[length];
                    str = new String(cArr2, 0, inputStreamReader.read(cArr2));
                }
                Util.closeCloseable(inputStreamReader);
                return str;
            } catch (Throwable th) {
                th = th;
                Util.closeCloseable(inputStreamReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
        }
    }

    public static int readStreamAtMost(InputStream inputStream, byte[] bArr) throws IOException {
        int i = 0;
        Object[] objArr = {inputStream, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e12fbce539f7d65f6c2df78ddb35950", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e12fbce539f7d65f6c2df78ddb35950")).intValue();
        }
        int length = bArr.length;
        while (length > 0) {
            int read = inputStream.read(bArr, i, length);
            if (read == -1) {
                break;
            }
            i += read;
            length -= read;
        }
        return i;
    }

    public static void copyStreamWithClose(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0283fbdcc2631a3fa48e71201154b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0283fbdcc2631a3fa48e71201154b53");
            return;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            Util.closeCloseable(outputStream);
            Util.closeCloseable(inputStream);
        }
    }
}
