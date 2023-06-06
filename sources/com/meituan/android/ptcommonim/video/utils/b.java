package com.meituan.android.ptcommonim.video.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final String b = d.c().getAbsolutePath() + File.separator + "meituan_ptim_record";

    public static boolean a(String str) {
        boolean a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eaa17768cfc3d4e89b79e7957887f33d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eaa17768cfc3d4e89b79e7957887f33d")).booleanValue();
        }
        Context a3 = com.meituan.android.singleton.b.a();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2022e8aa82e5a773f73c1a7b08c23d53", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2022e8aa82e5a773f73c1a7b08c23d53")).booleanValue() : Environment.getExternalStorageState().equals("mounted")) {
            String format = String.format("%s_%s%s", "meituan_ptim_record", Long.toHexString(new Date().getTime()), ".mp4");
            if (!new File(b).exists()) {
                d.c().mkdirs();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    a2 = a(a3, new FileInputStream(str), "video/mp4", new File(str).getName());
                } catch (FileNotFoundException unused) {
                    return false;
                }
            } else {
                File file = new File(new File(b), format);
                if (file.exists()) {
                    file.delete();
                }
                a(file);
                try {
                    a2 = a(str, file.getAbsolutePath(), "pt-4e0dc3a60c94351d");
                } catch (Throwable unused2) {
                    return false;
                }
            }
            if (a2) {
                File file2 = new File(new File(b), format);
                if (Build.VERSION.SDK_INT < 29) {
                    com.sankuai.meituan.takeoutnew.util.aop.b.a(a3, new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file2)));
                }
            }
            return a2;
        }
        return false;
    }

    private static File a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf0b063f29a92d258ec10257702896ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf0b063f29a92d258ec10257702896ac");
        }
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(@android.support.annotation.NonNull android.content.Context r24, @android.support.annotation.NonNull java.io.InputStream r25, @android.support.annotation.NonNull java.lang.String r26, @android.support.annotation.NonNull java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.video.utils.b.a(android.content.Context, java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }

    private static boolean a(InputStream inputStream, OutputStream outputStream) {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5bfd9c7b9e447361d32a5c4cf11d3d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5bfd9c7b9e447361d32a5c4cf11d3d0")).booleanValue();
        }
        if (inputStream == null || outputStream == null) {
            throw new IllegalArgumentException("srcPath and destPath can not be null");
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    a(inputStream, outputStream);
                    return true;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Exception unused) {
            a(inputStream, outputStream);
            return false;
        } catch (Throwable th) {
            a(inputStream, outputStream);
            throw th;
        }
    }

    private static boolean a(String str, String str2, String str3) {
        InputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Closeable[] closeableArr;
        byte[] bArr;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12406d5f857664f02c5e4263896c2114", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12406d5f857664f02c5e4263896c2114")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            try {
                t createContentResolver = Privacy.createContentResolver(com.meituan.android.singleton.b.a(), str3);
                fileInputStream = createContentResolver != null ? createContentResolver.b(parse) : null;
            } catch (FileNotFoundException unused) {
                return false;
            }
        } else {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return false;
                }
                fileInputStream = new FileInputStream(file);
            } catch (IOException unused2) {
                return false;
            }
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                bArr = new byte[4096];
            } catch (Exception unused3) {
                closeableArr = new Closeable[]{fileInputStream, fileOutputStream};
                a(closeableArr);
                return false;
            } catch (Throwable th) {
                th = th;
                a(fileInputStream, fileOutputStream);
                throw th;
            }
        } catch (Exception unused4) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        if (fileInputStream == null) {
            closeableArr = new Closeable[]{fileInputStream, fileOutputStream};
            a(closeableArr);
            return false;
        }
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read < 0) {
                a(fileInputStream, fileOutputStream);
                return true;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    private static void a(Closeable... closeableArr) {
        Object[] objArr = {closeableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae1ed27c09f47147f3226f85527a9a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae1ed27c09f47147f3226f85527a9a38");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Closeable closeable = closeableArr[i];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
