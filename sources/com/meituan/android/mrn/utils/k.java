package com.meituan.android.mrn.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "869c61a34c834c1c7ad78a8cff507621", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "869c61a34c834c1c7ad78a8cff507621")).booleanValue();
        }
        if (file.exists()) {
            if (g(file)) {
                return file.delete();
            }
            return false;
        }
        return true;
    }

    private static boolean g(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d5faf2aa11a03be53ddda21c1b26658", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d5faf2aa11a03be53ddda21c1b26658")).booleanValue() : a(file, (FileFilter) null);
    }

    private static boolean a(File file, FileFilter fileFilter) {
        Object[] objArr = {file, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1e440cc68b54a746e048beee5d02c59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1e440cc68b54a746e048beee5d02c59")).booleanValue();
        }
        File[] h = h(file);
        if (h == null || h.length == 0) {
            return true;
        }
        for (File file2 : h) {
            if (!b(file2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43ed6faf9737c7359512da967ee74c09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43ed6faf9737c7359512da967ee74c09")).booleanValue();
        }
        if (file.isDirectory()) {
            return a(file);
        }
        return file.delete();
    }

    private static File[] h(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f6fa74cd6396f11293578e8c3251c31", RobustBitConfig.DEFAULT_VALUE)) {
            return (File[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f6fa74cd6396f11293578e8c3251c31");
        }
        if (file.exists() && file.isDirectory()) {
            return file.listFiles();
        }
        return null;
    }

    public static boolean c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2990653ff57bcbe4008397394d715d45", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2990653ff57bcbe4008397394d715d45")).booleanValue();
        }
        try {
            d(file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void d(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a1de85f58e96239e01dffb28eef12a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a1de85f58e96239e01dffb28eef12a3");
        } else if (file == null || !file.exists()) {
        } else {
            if (file.isFile()) {
                if (file.delete()) {
                    return;
                }
                throw new IOException("delete file " + file + " failed.");
            } else if (file.isDirectory()) {
                a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.File r27, java.io.File r28, java.io.FileFilter r29, boolean r30, boolean r31, int r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.utils.k.a(java.io.File, java.io.File, java.io.FileFilter, boolean, boolean, int):void");
    }

    public static void a(File file, File file2) throws FileNotFoundException {
        Object[] objArr = {file, file2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e22c6d9439ec73c585e34089c371f36b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e22c6d9439ec73c585e34089c371f36b");
        } else if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else {
            if (file2 == null) {
                throw new NullPointerException("Destination must not be null");
            }
            if (file.exists()) {
                return;
            }
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    private static void a(File file, File file2, FileFilter fileFilter, boolean z, List<String> list, int i) throws IOException {
        Object[] objArr = {file, file2, fileFilter, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bc63b29fd71d87d778842ee35c01695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bc63b29fd71d87d778842ee35c01695");
            return;
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    a(file3, file4, fileFilter, z, list, i);
                } else {
                    a(file3, file4, z, i);
                }
            }
        }
        if (z) {
            file2.setLastModified(file.lastModified());
        }
    }

    public static void a(File file, File file2, boolean z, int i) throws IOException {
        int i2;
        int i3 = 0;
        Object[] objArr = {file, file2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8bafb10c18a46d0969c8dec4652c959e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8bafb10c18a46d0969c8dec4652c959e");
            return;
        }
        while (i3 < i) {
            try {
                a(file, file2, z);
                return;
            } finally {
                if (i3 != i2) {
                }
            }
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        Object[] objArr = {file, file2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfb1f748c1ad7b1733476238d8050c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfb1f748c1ad7b1733476238d8050c21");
            return;
        }
        if (file2.exists()) {
            if (file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is a directory");
            }
            file2.delete();
        }
        file2.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        FileChannel channel2 = fileOutputStream.getChannel();
        try {
            long size = channel.size();
            long j = 0;
            while (j < size) {
                long j2 = size - j;
                long transferFrom = channel2.transferFrom(channel, j, j2 > 31457280 ? 31457280L : j2);
                if (transferFrom == 0) {
                    break;
                }
                j += transferFrom;
            }
            channel2.force(true);
            n.a(channel2);
            n.a(fileOutputStream);
            n.a(channel);
            n.a(fileInputStream);
            long length = file.length();
            long length2 = file2.length();
            if (length == length2) {
                if (z) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
        } catch (Throwable th) {
            n.a(channel2);
            n.a(fileOutputStream);
            n.a(channel);
            n.a(fileInputStream);
            throw th;
        }
    }

    public static String a(Context context, String str, boolean z) {
        InputStream inputStream;
        byte[] bArr;
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c47389da7a1d09de9549bdbd7c2eafc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c47389da7a1d09de9549bdbd7c2eafc5");
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                inputStream = context.getResources().getAssets().open(str);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            inputStream.read(new byte[inputStream.available()]);
            String str2 = "" + new String(bArr) + "\n";
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return str2;
                } catch (IOException e2) {
                    c.a("[FileUtil@getContentFromAssets]", e2);
                    return str2;
                }
            }
            return str2;
        } catch (Exception e3) {
            e = e3;
            inputStream2 = inputStream;
            if (z) {
                c.a("[FileUtil@getContentFromAssets]", e);
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e4) {
                    c.a("[FileUtil@getContentFromAssets]", e4);
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    c.a("[FileUtil@getContentFromAssets]", e5);
                }
            }
            throw th;
        }
    }

    public static String a(DioFile dioFile) {
        InputStream inputStream;
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57fc8c61942b0d8dc22b70b72c517110", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57fc8c61942b0d8dc22b70b72c517110");
        }
        try {
            inputStream = dioFile.b();
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        String a2 = a(inputStream);
        n.a(inputStream);
        return a2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String a(java.io.InputStream r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.mrn.utils.k.a
            java.lang.String r11 = "1513cac6247a6661c86e127c82b116f2"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            if (r12 != 0) goto L21
            return r2
        L21:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L43
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L43
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L3e
        L2f:
            int r3 = r1.read(r12)     // Catch: java.lang.Throwable -> L3e
            r4 = -1
            if (r3 == r4) goto L3a
            r0.write(r12, r9, r3)     // Catch: java.lang.Throwable -> L3e
            goto L2f
        L3a:
            r0.flush()     // Catch: java.lang.Throwable -> L3e
            goto L53
        L3e:
            r12 = move-exception
            goto L4d
        L40:
            r12 = move-exception
            r1 = r2
            goto L62
        L43:
            r12 = move-exception
            r1 = r2
            goto L4d
        L46:
            r12 = move-exception
            r0 = r2
            r1 = r0
            goto L62
        L4a:
            r12 = move-exception
            r0 = r2
            r1 = r0
        L4d:
            java.lang.String r3 = "mrn_readAllText_error"
            com.meituan.android.mrn.utils.c.a(r3, r12)     // Catch: java.lang.Throwable -> L61
        L53:
            com.meituan.android.mrn.utils.n.a(r1)
            com.meituan.android.mrn.utils.n.a(r0)
            if (r0 != 0) goto L5c
            return r2
        L5c:
            java.lang.String r12 = r0.toString()
            return r12
        L61:
            r12 = move-exception
        L62:
            com.meituan.android.mrn.utils.n.a(r1)
            com.meituan.android.mrn.utils.n.a(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.utils.k.a(java.io.InputStream):java.lang.String");
    }

    public static long e(File file) throws Exception {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a7a192d8593dd333d29894fd867032e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a7a192d8593dd333d29894fd867032e")).longValue();
        }
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            return i(file);
        }
        return j(file);
    }

    private static long i(File file) throws Exception {
        long j;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11ea6021bd679922a09a515ce4af0010", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11ea6021bd679922a09a515ce4af0010")).longValue();
        }
        long j2 = 0;
        if (file == null) {
            return 0L;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i] != null && listFiles[i].isDirectory()) {
                j = i(listFiles[i]);
            } else {
                j = j(listFiles[i]);
            }
            j2 += j;
        }
        return j2;
    }

    private static long j(File file) throws Exception {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6dcc57370788d90f5e9495545704274", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6dcc57370788d90f5e9495545704274")).longValue();
        }
        if (file != null && file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            long available = fileInputStream.available();
            fileInputStream.close();
            return available;
        }
        return 0L;
    }

    public static long f(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77f295dca975825000eb7bfa565ff0df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77f295dca975825000eb7bfa565ff0df")).longValue();
        }
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                j += f(file2);
            }
            return j;
        }
        return 0L;
    }
}
