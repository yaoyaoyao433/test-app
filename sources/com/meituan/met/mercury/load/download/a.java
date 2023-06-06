package com.meituan.met.mercury.load.download;

import android.text.TextUtils;
import com.BV.LinearGradient.LinearGradientManager;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.download.b;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static long a(String str, String str2, File file, String str3, boolean z) throws Exception {
        Object[] objArr = {str, str2, file, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1213eb8dbb37eb0728896c42c8d55989", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1213eb8dbb37eb0728896c42c8d55989")).longValue();
        }
        if (TextUtils.equals(str, "mtwebview") || (com.meituan.met.mercury.load.core.c.n.size() > 0 && com.meituan.met.mercury.load.core.c.n.contains(str))) {
            return a(str2, file, str3, (b.a) null, z);
        }
        Object[] objArr2 = {str2, file, str3};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "11685861f766aa9ebcfdff08b1a372b0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "11685861f766aa9ebcfdff08b1a372b0")).longValue() : b.a(str2, file, str3, null);
    }

    private static long a(String str, File file, String str2, b.a aVar, boolean z) throws Exception {
        Call<ap> download;
        Object[] objArr = {str, file, str2, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "022528e85f13cf4f0be6765863ddbe6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "022528e85f13cf4f0be6765863ddbe6e")).longValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || file == null) {
            throw new f((short) 7, "download invalid argument");
        }
        if (file.exists()) {
            if (e.a(file, str2)) {
                return file.length();
            }
            file.delete();
        }
        if (z && !NetWorkUtils.isWifiConnected(com.meituan.met.mercury.load.core.e.b())) {
            throw new f((short) 11, "download fail, net not wifi");
        }
        File file2 = new File(file.getPath() + ".tmp");
        long length = file2.exists() ? file2.length() : 0L;
        com.meituan.met.mercury.load.retrofit.b a2 = com.meituan.met.mercury.load.retrofit.b.a();
        String str3 = "bytes=" + length + CommonConstant.Symbol.MINUS;
        Object[] objArr2 = {str, str3};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.retrofit.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6c73ce593e9bac002cfb6b759badffbd", RobustBitConfig.DEFAULT_VALUE)) {
            download = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6c73ce593e9bac002cfb6b759badffbd");
        } else {
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit download");
            bVar.a("url", str);
            bVar.a(LinearGradientManager.PROP_START_POS, str3);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            download = a2.c.download(str, str3);
        }
        try {
            Response<ap> a3 = download.a();
            if (a3 != null) {
                a3.e().contentLength();
                long a4 = a(file2, a3.e().source(), z);
                if (a4 < 0) {
                    throw new f((short) 11, "download fail, net not wifi");
                }
                file2.renameTo(file);
                if (e.a(file, str2)) {
                    return a4;
                }
                throw new f((short) 4, "下载文件md5校验不通过");
            }
            throw new f((short) 7, "response is null");
        } catch (Exception e) {
            if (e instanceof SocketTimeoutException) {
                throw new f((short) 8, "Socket Timeout Exception", (Throwable) e);
            }
            throw new f((short) 7, "download fail, message:" + e.toString(), (Throwable) e);
        }
    }

    private static long a(File file, InputStream inputStream, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {file, inputStream, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "782981153cac3408d1ccec9e3e5d7a43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "782981153cac3408d1ccec9e3e5d7a43")).longValue();
        }
        long j = 0;
        e.a(file);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                        j += read;
                        if (z && !NetWorkUtils.isWifiConnected(com.meituan.met.mercury.load.core.e.b())) {
                            e.a(bufferedOutputStream);
                            e.a((Closeable) inputStream);
                            return -1L;
                        }
                    } else {
                        e.a(bufferedOutputStream);
                        e.a((Closeable) inputStream);
                        return j;
                    }
                }
            } catch (Throwable th) {
                th = th;
                e.a(bufferedOutputStream);
                e.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
    }
}
