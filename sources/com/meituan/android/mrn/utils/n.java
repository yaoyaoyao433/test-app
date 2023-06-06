package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static boolean a(InputStream inputStream, File file) {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {inputStream, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedOutputStream bufferedOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cc202ae7caae407571d0e52cc400335", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cc202ae7caae407571d0e52cc400335")).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                        bufferedOutputStream.flush();
                    } else {
                        a(bufferedInputStream);
                        a(bufferedOutputStream);
                        return true;
                    }
                }
            } catch (Exception unused2) {
                bufferedOutputStream2 = bufferedOutputStream;
                a(bufferedInputStream);
                a(bufferedOutputStream2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                a(bufferedInputStream);
                a(bufferedOutputStream2);
                throw th;
            }
        } catch (Exception unused3) {
            bufferedInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1063771df9c1dd50b0d88f890b712dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1063771df9c1dd50b0d88f890b712dd9");
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
