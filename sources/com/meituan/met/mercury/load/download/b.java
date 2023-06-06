package com.meituan.met.mercury.load.download;

import android.text.TextUtils;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.utils.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.io.File;
import java.net.SocketTimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public static long a(String str, File file, String str2, a aVar) throws Exception {
        Call<ap> download;
        Object[] objArr = {str, file, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a5a548a28cd7cc3a46466dff149735", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a5a548a28cd7cc3a46466dff149735")).longValue();
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
        com.meituan.met.mercury.load.retrofit.b a2 = com.meituan.met.mercury.load.retrofit.b.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.met.mercury.load.retrofit.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "dc9eaa248e9bbb618ee45e9f8f09406a", RobustBitConfig.DEFAULT_VALUE)) {
            download = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "dc9eaa248e9bbb618ee45e9f8f09406a");
        } else {
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDLoaderRetrofit download");
            bVar.a("url", str);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            download = a2.c.download(str);
        }
        try {
            Response<ap> a3 = download.a();
            if (a3 != null) {
                a3.e().contentLength();
                long a4 = e.a(file, a3.e().source());
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
}
