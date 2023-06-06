package com.meituan.banma.jarvis.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static int b = 1024;

    public static boolean a(File file, String str, boolean z) {
        BufferedWriter bufferedWriter;
        Object[] objArr = {file, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedWriter bufferedWriter2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb01be0c7740b0b2aa4654c9493013f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb01be0c7740b0b2aa4654c9493013f3")).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            if (!b(file)) {
                Log.e("FileUtils", "create file <" + file + "> failed.");
                return false;
            }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            } catch (IOException e) {
                e = e;
            }
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                e.printStackTrace();
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ca4d799bef17024f4ffa3643e34c4c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ca4d799bef17024f4ffa3643e34c4c") : a(file, null);
    }

    private static String a(File file, String str) {
        Object[] objArr = {file, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e24f56e190bc45b8a417526790207318", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e24f56e190bc45b8a417526790207318");
        }
        byte[] d = d(file);
        if (d == null) {
            return null;
        }
        if (TextUtils.isEmpty(null)) {
            return new String(d);
        }
        try {
            return new String(d, (String) null);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r12v5 */
    private static byte[] d(File file) {
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56f8ebbbbcca3196ce69e3ab552166d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56f8ebbbbcca3196ce69e3ab552166d2");
        }
        ?? exists = file.exists();
        if (exists == 0) {
            return null;
        }
        try {
            try {
                exists = new BufferedInputStream(new FileInputStream(file), b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[b];
                    while (true) {
                        int read = exists.read(bArr, 0, b);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        exists.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return byteArray;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    try {
                        exists.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e6) {
                e = e6;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                file = 0;
                try {
                    exists.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                if (file != 0) {
                    try {
                        file.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static boolean b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2824ea10155955388f4114e278dd5a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2824ea10155955388f4114e278dd5a9")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (c(file.getParentFile())) {
            try {
                return file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0221296a7ffafad850e12e15df1081da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0221296a7ffafad850e12e15df1081da")).booleanValue() : file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }
}
