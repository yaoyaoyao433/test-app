package com.meituan.mmp.lib.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.DecodeFormat;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private static Method b;
    private static Field c;
    private static Field d;
    private static Object e;
    private static final Charset f = Charset.forName("UTF-8");

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a = 0;
        public long b = 0;
    }

    public static boolean a(String str, String str2) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e285005b817518949e404b68d7bbb35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e285005b817518949e404b68d7bbb35")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        DioFile dioFile = new DioFile(str);
        if (!dioFile.c()) {
            return false;
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            inputStream = dioFile.b();
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            x.a(inputStream, fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Exception e2) {
                    e = e2;
                    inputStream2 = inputStream;
                    try {
                        Log.d("FileUtil", "copyAll file exception", e);
                        x.a(inputStream2, fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        x.a(inputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    x.a(inputStream, fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            fileOutputStream = null;
        }
    }

    public static boolean a(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {inputStream, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e953db4bdb262c0d98ead7ecae73edaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e953db4bdb262c0d98ead7ecae73edaa")).booleanValue();
        }
        if (inputStream == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            com.meituan.mmp.lib.trace.b.e(str + " can't delete");
            return false;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    x.a(inputStream, fileOutputStream);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            com.meituan.mmp.lib.trace.b.a(e);
            x.a(inputStream, fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            x.a(inputStream, fileOutputStream);
            throw th;
        }
    }

    private static boolean a(InputStream inputStream, OutputStream outputStream) {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e201c0a683621beb346bc5ea76db335", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e201c0a683621beb346bc5ea76db335")).booleanValue();
        }
        if (inputStream == null || outputStream == null) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        x.a(inputStream, outputStream);
                        return true;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } catch (Exception e2) {
                Log.d("FileUtil", "copyAll file exception", e2);
                x.a(inputStream, outputStream);
                return false;
            }
        } catch (Throwable th) {
            x.a(inputStream, outputStream);
            throw th;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8167c7c40bf0b0916ae37d5c325d47f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8167c7c40bf0b0916ae37d5c325d47f")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                return file.delete();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return file.delete();
            }
            boolean z = true;
            for (File file2 : listFiles) {
                z = !file2.isFile() ? !(a(file2.getAbsolutePath()) && z) : !(file2.delete() && z);
            }
            return file.delete() && z;
        }
        return true;
    }

    public static String a(DioFile dioFile) throws IOException {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "660f2d5a28b113f30e3c56371df7d158", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "660f2d5a28b113f30e3c56371df7d158");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        com.meituan.mmp.main.ab.a("DioFile readContent " + dioFile.e() + ", " + r.a(dioFile.l()));
        try {
            if (dioFile.l() > 1048576) {
                return c(dioFile);
            }
            return b(dioFile);
        } finally {
            com.meituan.mmp.main.ab.a();
        }
    }

    private static String b(DioFile dioFile) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a03eed1916b7efebb4a1b8d4f3e472d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a03eed1916b7efebb4a1b8d4f3e472d");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = dioFile.b();
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read >= 0) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            String str = new String(byteArrayOutputStream.toByteArray());
                            x.a(byteArrayOutputStream, inputStream);
                            return str;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    x.a(byteArrayOutputStream, inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    private static String c(DioFile dioFile) throws IOException {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e60feebbc9ee464a92d89377f26620a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e60feebbc9ee464a92d89377f26620a");
        }
        if (dioFile == null || !dioFile.c()) {
            return "";
        }
        try {
            return new String(dioFile.a(true));
        } catch (Exception unused) {
            return b(dioFile);
        }
    }

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef862c13143d154aa17bb7d5aa637375", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef862c13143d154aa17bb7d5aa637375");
        }
        if (file == null || !file.exists()) {
            return "";
        }
        if (file.length() > 1048576) {
            return f(file);
        }
        return e(file);
    }

    private static String e(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        RandomAccessFile randomAccessFile;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27022b7c105bb4404d35ed54d7889bdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27022b7c105bb4404d35ed54d7889bdd");
        }
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                randomAccessFile = new RandomAccessFile(file, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
            } catch (Exception e2) {
                e = e2;
                randomAccessFile = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray());
                    x.a(byteArrayOutputStream, randomAccessFile);
                    return str;
                }
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            try {
                Log.e("FileUtil", "read file content exception", e);
                x.a(byteArrayOutputStream2, randomAccessFile);
                return "";
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                x.a(byteArrayOutputStream, randomAccessFile);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            x.a(byteArrayOutputStream, randomAccessFile);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String f(java.io.File r17) {
        /*
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r10 = 0
            r0[r10] = r17
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.mmp.lib.utils.s.a
            java.lang.String r12 = "1514ec2b6ae09745c9ea9d1bc69d7c25"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r0
            r5 = r11
            r7 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L1e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r4, r11, r2, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1e:
            if (r17 == 0) goto L84
            boolean r0 = r17.exists()
            if (r0 != 0) goto L27
            goto L84
        L27:
            r3 = 2
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L68
            java.io.File r0 = r17.getAbsoluteFile()     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "r"
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L68
            java.nio.channels.FileChannel r6 = r5.getChannel()     // Catch: java.lang.Throwable -> L60
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L5b
            r13 = 0
            long r15 = r17.length()     // Catch: java.lang.Throwable -> L5b
            r11 = r6
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch: java.lang.Throwable -> L5b
            java.nio.charset.Charset r4 = com.meituan.mmp.lib.utils.s.f     // Catch: java.lang.Throwable -> L5b
            java.nio.CharBuffer r0 = r4.decode(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5b
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r10] = r5
            r1[r2] = r6
        L55:
            com.meituan.mmp.lib.utils.x.a(r1)
            return r0
        L59:
            r0 = move-exception
            goto L7a
        L5b:
            r0 = move-exception
            goto L62
        L5d:
            r0 = move-exception
            r6 = r4
            goto L7a
        L60:
            r0 = move-exception
            r6 = r4
        L62:
            r4 = r5
            goto L6a
        L64:
            r0 = move-exception
            r5 = r4
            r6 = r5
            goto L7a
        L68:
            r0 = move-exception
            r6 = r4
        L6a:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = e(r17)     // Catch: java.lang.Throwable -> L78
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r10] = r4
            r1[r2] = r6
            goto L55
        L78:
            r0 = move-exception
            r5 = r4
        L7a:
            java.io.Closeable[] r1 = new java.io.Closeable[r3]
            r1[r10] = r5
            r1[r2] = r6
            com.meituan.mmp.lib.utils.x.a(r1)
            throw r0
        L84:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.s.f(java.io.File):java.lang.String");
    }

    public static String a(Context context, String str) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "135b79752ff31d9d8dd4b806951f9adb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "135b79752ff31d9d8dd4b806951f9adb");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStream = context.getAssets().open(str);
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    x.a(byteArrayOutputStream, inputStream);
                    return str2;
                }
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            try {
                Log.e("FileUtil", "read assets file content exception", e);
                x.a(byteArrayOutputStream2, inputStream);
                return "";
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                x.a(byteArrayOutputStream, inputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            x.a(byteArrayOutputStream, inputStream);
            throw th;
        }
    }

    public static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51e4e774f26f9d2c6dde750eb833c440", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51e4e774f26f9d2c6dde750eb833c440");
        }
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[4096];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    return a(messageDigest.digest());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cda5787e45589835842cda359268a1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cda5787e45589835842cda359268a1d");
        }
        if (!file.isFile()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(map);
                String a2 = a(messageDigest.digest());
                x.a(fileInputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    String g = g(file);
                    x.a(fileInputStream);
                    return g;
                } catch (Throwable th3) {
                    x.a(fileInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    private static String g(File file) {
        FileInputStream fileInputStream;
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[4096];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read >= 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String a2 = a(messageDigest.digest());
                            x.a(fileInputStream);
                            return a2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        x.a(fileInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                x.a(null);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            x.a(null);
            throw th;
        }
    }

    public static String b(String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c170bb2c8ee9b5040b19d52e01960f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c170bb2c8ee9b5040b19d52e01960f7");
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[4096];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                int i = 0;
                while (i != -1) {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                }
                String a2 = a(messageDigest.digest());
                x.a(fileInputStream);
                return a2;
            } catch (Exception unused) {
                x.a(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                x.a(fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15d951a5190181fb513494690ecd12c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15d951a5190181fb513494690ecd12c9");
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd247438b4038bfe7d00055ad11efdb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd247438b4038bfe7d00055ad11efdb3");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf(CommonConstant.Symbol.DOT);
        return (lastIndexOf2 == -1 || lastIndexOf2 < lastIndexOf) ? "" : str.substring(lastIndexOf2);
    }

    public static long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a3ac0f11480ec3e6137624c819b2eee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a3ac0f11480ec3e6137624c819b2eee")).longValue();
        }
        if (str == null || str.trim().length() == 0) {
            return -1L;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return -1L;
    }

    private static String d(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e10aba98d09c756ee0ac3b1c4756759", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e10aba98d09c756ee0ac3b1c4756759");
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        String c2 = aVar.c(context);
        if (str.startsWith("wdfile://")) {
            return new File(c2, str.substring(9)).getAbsolutePath();
        }
        DioFile a2 = aVar.a(context, str);
        if (q.a(a2, aVar.e(context))) {
            return a2.h();
        }
        return null;
    }

    public static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb4e345f63b98c518a5882d67203c0f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb4e345f63b98c518a5882d67203c0f7");
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private static String e(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc2684ef658d1994a405985699d18a00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc2684ef658d1994a405985699d18a00");
        }
        if (str.startsWith("wdfile://")) {
            if (str.startsWith("wdfile://usr/")) {
                String substring = str.substring(str.indexOf("//") + 2);
                if (substring.startsWith("usr")) {
                    String substring2 = substring.substring(3);
                    return aVar.b(context) + substring2;
                }
                return null;
            } else if (str.startsWith("wdfile://store/")) {
                String substring3 = str.substring(str.indexOf("//") + 2 + 6);
                return aVar.a(context) + File.separator + substring3;
            } else if (str.startsWith("wdfile://store_")) {
                String substring4 = str.substring(str.indexOf("//") + 2);
                return aVar.a(context) + substring4;
            }
        }
        return str;
    }

    private static String f(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0de5aa13afecbd73670024c83e17b69", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0de5aa13afecbd73670024c83e17b69");
        }
        String e2 = e(context, str, aVar);
        return !TextUtils.equals(e2, str) ? e2 : d(context, str, aVar);
    }

    public static String a(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        File file = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3535d93a79fbe602e92f6c741e6b175", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3535d93a79fbe602e92f6c741e6b175");
        }
        String e2 = e(context, str, aVar);
        if (TextUtils.equals(e2, str)) {
            String d2 = d(context, str, aVar);
            if (d2 == null) {
                return null;
            }
            DioFile dioFile = new DioFile(d2);
            if (dioFile.o()) {
                File file2 = new File(aVar.c(context), str);
                if (!file2.exists()) {
                    try {
                        dioFile.a(file2);
                    } catch (IOException e3) {
                        a(aVar.h, dioFile.g(), e3, null, aVar.c());
                        e3.printStackTrace();
                    }
                }
                file = file2;
            }
            return file == null ? d2 : file.getPath();
        }
        return e2;
    }

    public static InputStream b(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "866db807775610a0e17c45fd835912a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "866db807775610a0e17c45fd835912a7");
        }
        if (URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String f2 = f(context, str, aVar);
        if (!q.a(f2, aVar.e(context))) {
            com.meituan.mmp.lib.trace.b.d("file scope failed!");
            return null;
        } else if (f2 == null || !new DioFile(f2).c()) {
            return null;
        } else {
            try {
                return new DioFile(f2).b();
            } catch (IOException e2) {
                a(aVar.h, new DioFile(f2).g(), e2, null, aVar.c());
                e2.printStackTrace();
                x.a(null);
                return null;
            }
        }
    }

    public static RequestCreator c(Context context, String str, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {context, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "278e6c6a95cbdcad66ddfa2af1dc8e42", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "278e6c6a95cbdcad66ddfa2af1dc8e42");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (URLUtil.isNetworkUrl(str)) {
            return Picasso.g(context).d(str).g().a(DecodeFormat.PREFER_ARGB_8888);
        }
        String f2 = f(context, str, aVar);
        if (q.a(f2, aVar.e(context))) {
            return Picasso.g(context).a(new DioFile(f2)).g().a(DecodeFormat.PREFER_ARGB_8888);
        }
        return null;
    }

    public static void a(String str, HashSet<File> hashSet, boolean z, boolean z2) {
        Object[] objArr = {str, hashSet, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf9df4c9bbd65bbdbaf3a3b672781402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf9df4c9bbd65bbdbaf3a3b672781402");
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                hashSet.add(file);
                return;
            }
            if (z2) {
                hashSet.add(file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory() && z) {
                    if (z2) {
                        hashSet.add(file2);
                    }
                    a(file2.getAbsolutePath(), hashSet, z, z2);
                } else {
                    hashSet.add(file2);
                }
            }
        }
    }

    public static a f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4a29dd1352f37dc0d1a117ae21803d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4a29dd1352f37dc0d1a117ae21803d3");
        }
        a aVar = new a();
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                StructStat lstat = Os.lstat(str);
                aVar.b = lstat.st_atime;
                aVar.a = lstat.st_mode;
                return aVar;
            } catch (Exception e2) {
                com.meituan.mmp.lib.trace.b.a(e2);
            }
        } else {
            if (e == null) {
                try {
                    Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField("os");
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(null);
                    e = obj;
                    Method method = obj.getClass().getMethod("lstat", String.class);
                    b = method;
                    d = method.getClass().getDeclaredField("st_atime");
                    c = b.getClass().getDeclaredField("st_mode");
                    if (!d.isAccessible()) {
                        d.setAccessible(true);
                    }
                    if (!c.isAccessible()) {
                        d.setAccessible(true);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            try {
                Object invoke = b.invoke(e, str);
                aVar.a = c.getInt(invoke);
                aVar.b = d.getLong(invoke);
                return aVar;
            } catch (Exception e4) {
                com.meituan.mmp.lib.trace.b.a(e4);
            }
        }
        return aVar;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc76c2ec906118ab9e2bb1d52b952eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc76c2ec906118ab9e2bb1d52b952eb")).booleanValue() : Environment.getExternalStorageState().equals("mounted");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.support.annotation.RequiresApi(api = 29)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@android.support.annotation.NonNull android.content.Context r25, @android.support.annotation.NonNull java.io.InputStream r26, @android.support.annotation.NonNull java.lang.String r27, @android.support.annotation.NonNull java.lang.String r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.s.a(android.content.Context, java.io.InputStream, java.lang.String, java.lang.String, boolean, java.lang.String):boolean");
    }

    public static File c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57c107dcaccf94c69795b50b262da68e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57c107dcaccf94c69795b50b262da68e");
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return file;
    }

    public static File d(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc6bb82affbcbe729136e8326fd56699", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc6bb82affbcbe729136e8326fd56699");
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String a(com.meituan.mmp.lib.config.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f312d36c9269bee0a458a14369b18d94", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f312d36c9269bee0a458a14369b18d94") : aVar.c(context);
    }

    public static String b(com.meituan.mmp.lib.config.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08693ebf4a9bde65e9da6c958503df23", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08693ebf4a9bde65e9da6c958503df23") : aVar.a(context);
    }

    public static String c(com.meituan.mmp.lib.config.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a43ebae6dfc4466e7380c37447cdf87", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a43ebae6dfc4466e7380c37447cdf87") : aVar.b(context);
    }

    public static File a(String str, String str2, String str3) {
        File file;
        do {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0201598c41673c86e1d6913501d53f72", RobustBitConfig.DEFAULT_VALUE)) {
                return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0201598c41673c86e1d6913501d53f72");
            }
            file = new File(str, "tmp_" + UUID.randomUUID().toString() + str2 + str3);
        } while (file.exists());
        return file;
    }

    public static String g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "468ac6fc8b4d547d1f90610dc29cbb22", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "468ac6fc8b4d547d1f90610dc29cbb22");
        }
        try {
            CRC32 crc32 = new CRC32();
            crc32.update(str.getBytes());
            return Long.toHexString(crc32.getValue());
        } catch (Exception unused) {
            return "";
        }
    }

    public static void a(com.meituan.mmp.lib.trace.h hVar, String str, Exception exc, String str2, String str3) {
        Object[] objArr = {hVar, str, exc, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a706ae436df5df4a370c2e464685a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a706ae436df5df4a370c2e464685a09");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TbsReaderView.KEY_FILE_PATH, str);
        StringBuilder sb = new StringBuilder();
        if (exc != null) {
            sb.append(exc.toString());
            if (exc.getCause() != null) {
                sb.append(StringUtil.SPACE);
                sb.append(exc.getCause().toString());
            }
        }
        hashMap.put("errorMsg", sb.toString());
        hashMap.put("errorDetail", exc != null ? exc.getStackTrace() : null);
        hashMap.put("page.path", str2);
        hashMap.put("mmp.id", str3);
        if (hVar != null) {
            hVar.b("mmp.file.read.failed", (Map<String, Object>) hashMap);
        } else {
            MMPEnvHelper.getLogger().log("mmp.file.read.failed", null, hashMap);
        }
    }
}
