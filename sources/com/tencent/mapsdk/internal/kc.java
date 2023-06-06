package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kc {
    public static final int a = 1024;
    public static final int b = 1048576;
    public static final int c = 1073741824;
    public static File d = null;
    private static final String e = "FileUtil";
    private static final ky f = new ky();

    private static File g(File file) {
        return a(file.getParentFile(), file.getName());
    }

    public static File a(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        return file2;
    }

    public static File b(File file, String str) {
        if (file == null || TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            File file2 = new File(file, str.substring(0, lastIndexOf));
            str = substring;
            file = file2;
        }
        if (!file.exists() && !file.mkdirs()) {
            if (Log.isLoggable(e, 6)) {
                Log.e(e, "create file failed with mkdirs failed:" + file.getAbsolutePath());
            }
            return null;
        }
        File file3 = new File(file, str);
        try {
            if (!file3.exists() && !file3.createNewFile() && Log.isLoggable(e, 6)) {
                Log.e(e, "create file failed:" + file3.getAbsolutePath());
            }
        } catch (IOException e2) {
            if (Log.isLoggable(e, 6)) {
                Log.e(e, "create file failed.", e2);
            }
        }
        return file3;
    }

    public static boolean a(String str) {
        return a(new File(str));
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        if (parentFile.exists() || parentFile.mkdirs()) {
            try {
                return file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private static boolean h(File file) {
        if (file != null && file.exists() && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    public static boolean b(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        Stack stack = new Stack();
        stack.push(file);
        boolean z = false;
        while (!stack.isEmpty()) {
            File file2 = (File) stack.peek();
            if (file2.isFile()) {
                z = file2.delete();
                stack.pop();
            } else if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    z = file2.delete();
                    stack.pop();
                } else {
                    for (File file3 : listFiles) {
                        stack.push(file3);
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static byte[] c(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (file != 0) {
            ?? exists = file.exists();
            try {
                try {
                    if (exists != 0) {
                        try {
                            exists = new FileInputStream((File) file);
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = exists.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                    }
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    try {
                                        byteArrayOutputStream.flush();
                                        byteArrayOutputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                    try {
                                        exists.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                    return byteArray;
                                } catch (FileNotFoundException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.flush();
                                            byteArrayOutputStream.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (exists != 0) {
                                        exists.close();
                                    }
                                    return null;
                                } catch (IOException e6) {
                                    e = e6;
                                    e.printStackTrace();
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.flush();
                                            byteArrayOutputStream.close();
                                        } catch (IOException e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                    if (exists != 0) {
                                        exists.close();
                                    }
                                    return null;
                                }
                            } catch (FileNotFoundException e8) {
                                e = e8;
                                byteArrayOutputStream = null;
                            } catch (IOException e9) {
                                e = e9;
                                byteArrayOutputStream = null;
                            } catch (Throwable th) {
                                th = th;
                                file = 0;
                                if (file != 0) {
                                    try {
                                        file.flush();
                                        file.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                if (exists != 0) {
                                    try {
                                        exists.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e12) {
                            e = e12;
                            byteArrayOutputStream = null;
                            exists = 0;
                        } catch (IOException e13) {
                            e = e13;
                            byteArrayOutputStream = null;
                            exists = 0;
                        } catch (Throwable th2) {
                            exists = 0;
                            th = th2;
                            file = 0;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable, java.io.BufferedReader] */
    public static String a(File file, int i) {
        Closeable closeable = null;
        if (file != null && file.exists()) {
            ?? r1 = -1;
            try {
                if (i != -1) {
                    try {
                        r1 = new BufferedReader(new FileReader(file));
                        int i2 = 0;
                        while (true) {
                            try {
                                String readLine = r1.readLine();
                                if (readLine == null) {
                                    break;
                                } else if (i2 == i) {
                                    kd.a((Closeable) r1);
                                    return readLine;
                                } else {
                                    i2++;
                                }
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                e.printStackTrace();
                                kd.a((Closeable) r1);
                                return null;
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                kd.a((Closeable) r1);
                                return null;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        r1 = 0;
                    } catch (IOException e5) {
                        e = e5;
                        r1 = 0;
                    } catch (Throwable th) {
                        th = th;
                        kd.a(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r1;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static List<String> d(File file) {
        BufferedReader bufferedReader;
        if (file != null) {
            ?? exists = file.exists();
            try {
                if (exists != 0) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        try {
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    arrayList.add(readLine);
                                } else {
                                    kd.a(bufferedReader);
                                    return arrayList;
                                }
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            e.printStackTrace();
                            kd.a(bufferedReader);
                            return null;
                        } catch (IOException e3) {
                            e = e3;
                            e.printStackTrace();
                            kd.a(bufferedReader);
                            return null;
                        }
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        bufferedReader = null;
                    } catch (IOException e5) {
                        e = e5;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                        exists = 0;
                        kd.a((Closeable) exists);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        boolean z = false;
        if (file == null || bArr == null || !a(file)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        try {
            fileOutputStream.write(bArr);
            z = true;
            fileOutputStream.close();
        } catch (FileNotFoundException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return z;
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        return z;
    }

    public static void c(File file, String str) {
        RandomAccessFile randomAccessFile;
        if (file == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!file.exists()) {
            a(file);
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        try {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write((str + StringUtil.CRLF_STRING).getBytes());
            kd.a(randomAccessFile);
        } catch (FileNotFoundException e4) {
            e = e4;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            kd.a(randomAccessFile2);
        } catch (IOException e5) {
            e = e5;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            kd.a(randomAccessFile2);
        } catch (Throwable th2) {
            th = th2;
            kd.a(randomAccessFile);
            throw th;
        }
    }

    public static void b(File file, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        if (file == null || bArr == null || bArr.length == 0) {
            return;
        }
        if (!file.exists()) {
            a(file);
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (IOException e3) {
            e = e3;
        }
        try {
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(bArr);
            kd.a(randomAccessFile);
        } catch (FileNotFoundException e4) {
            e = e4;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            kd.a(randomAccessFile2);
        } catch (IOException e5) {
            e = e5;
            randomAccessFile2 = randomAccessFile;
            e.printStackTrace();
            kd.a(randomAccessFile2);
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            kd.a(randomAccessFile2);
            throw th;
        }
    }

    public static void a(File file, int i, String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        if (file == null || !file.exists() || i == -1) {
            return;
        }
        RandomAccessFile randomAccessFile3 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    file = e(file);
                    try {
                        randomAccessFile2 = new RandomAccessFile(file, "rw");
                        int i2 = 0;
                        long j = 0;
                        while (true) {
                            try {
                                String readLine = randomAccessFile.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (i2 == i) {
                                    j = randomAccessFile.getFilePointer() - StringUtil.CRLF_STRING.getBytes().length;
                                } else if (i2 > i) {
                                    randomAccessFile2.write(readLine.getBytes(CommonConstant.Encoding.ISO88591));
                                }
                                i2++;
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                randomAccessFile3 = randomAccessFile;
                                e.printStackTrace();
                                kd.a(randomAccessFile3);
                                kd.a(randomAccessFile2);
                                b(file);
                            } catch (IOException e3) {
                                e = e3;
                                randomAccessFile3 = randomAccessFile;
                                e.printStackTrace();
                                kd.a(randomAccessFile3);
                                kd.a(randomAccessFile2);
                                b(file);
                            } catch (Throwable th) {
                                th = th;
                                kd.a(randomAccessFile);
                                kd.a(randomAccessFile2);
                                b(file);
                                throw th;
                            }
                        }
                        randomAccessFile.seek(j);
                        randomAccessFile.write((str + StringUtil.CRLF_STRING).getBytes());
                        randomAccessFile2.seek(0L);
                        while (true) {
                            String readLine2 = randomAccessFile2.readLine();
                            if (readLine2 == null) {
                                break;
                            }
                            randomAccessFile.write(readLine2.getBytes(CommonConstant.Encoding.ISO88591));
                        }
                        kd.a(randomAccessFile);
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        randomAccessFile2 = null;
                    } catch (IOException e5) {
                        e = e5;
                        randomAccessFile2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile2 = null;
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                    file = null;
                    randomAccessFile2 = null;
                } catch (IOException e7) {
                    e = e7;
                    file = null;
                    randomAccessFile2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    file = null;
                    randomAccessFile2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = randomAccessFile3;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
            file = null;
            randomAccessFile2 = null;
        } catch (IOException e9) {
            e = e9;
            file = null;
            randomAccessFile2 = null;
        } catch (Throwable th5) {
            th = th5;
            file = null;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
        kd.a(randomAccessFile2);
        b(file);
    }

    public static File e(File file) {
        if (file != null) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            ky kyVar = f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            sb.append(kyVar.a(sb2.toString()));
            sb.append(".tmp");
            return b(parentFile, sb.toString());
        }
        return null;
    }

    public static int d(File file, String str) {
        if (file == null || !file.exists()) {
            return -1;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            kd.a(bufferedReader2);
                            break;
                        } else if (readLine.startsWith(str)) {
                            kd.a(bufferedReader2);
                            return i;
                        } else {
                            i++;
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        kd.a(bufferedReader);
                        return -1;
                    } catch (IOException e3) {
                        e = e3;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        kd.a(bufferedReader);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        kd.a(bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            e = e5;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ae  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.io.File r7, int r8) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kc.b(java.io.File, int):void");
    }

    public static boolean a(File file, File file2) {
        if (file == null || !file.exists()) {
            return false;
        }
        b(file2);
        return file.renameTo(file2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.io.File r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kc.b(java.io.File, int, java.lang.String):void");
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.contains("../")) {
            trim = trim.replaceAll("\\.\\./", "");
        }
        while (trim.startsWith(File.separator)) {
            trim = trim.substring(1);
        }
        while (trim.endsWith(File.separator)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        return trim;
    }

    private static boolean a(String str, String str2) {
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists()) {
            f(file2);
        }
        return file.renameTo(new File(str2));
    }

    public static long f(File file) {
        return a(file, (FileFilter) null);
    }

    public static long a(File file, FileFilter fileFilter) {
        File[] listFiles;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory() && (listFiles = file.listFiles(fileFilter)) != null) {
            for (File file2 : listFiles) {
                j += a(file2, fileFilter);
            }
        }
        if (fileFilter == null || fileFilter.accept(file)) {
            long length = file.length();
            File file3 = new File(file.getAbsolutePath() + System.currentTimeMillis());
            file.renameTo(file3);
            file3.delete();
            return length;
        }
        return j;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String packageName = context.getPackageName();
            if (packageName != null && packageName.length() != 0) {
                return packageName.length() > 255 ? packageName.substring(0, 254) : packageName;
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static void b(File file, File file2) {
        if (!file2.exists()) {
            a(file2.getParentFile(), file2.getName());
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    b(file3, new File(file2, file.getName()));
                }
                return;
            }
            return;
        }
        File file4 = new File(file2, file.getName());
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.copy(file.toPath(), file4.toPath(), new CopyOption[0]);
                return;
            } catch (IOException e2) {
                e2.printStackTrace();
                return;
            }
        }
        a(file4, c(file));
    }

    public static File[] e(File file, final String str) {
        return (file == null || !file.isDirectory()) ? new File[0] : file.listFiles(new FileFilter() { // from class: com.tencent.mapsdk.internal.kc.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return Pattern.compile(str).matcher(file2.getName()).matches();
            }
        });
    }

    private static File[] b(File file, FileFilter fileFilter) {
        File[] fileArr = new File[0];
        return (file != null && file.isDirectory()) ? file.listFiles(fileFilter) : fileArr;
    }
}
