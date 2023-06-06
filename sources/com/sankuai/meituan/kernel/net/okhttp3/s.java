package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.tunnel.c;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        long j;
        String valueOf;
        int i = 0;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d727a8eeb3d0522e948f24a8cdb95e24", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d727a8eeb3d0522e948f24a8cdb95e24");
        }
        Request request = chain.request();
        if (!TextUtils.isEmpty(request.header("M-TraceId"))) {
            return chain.proceed(request);
        }
        c.a aVar = com.sankuai.meituan.kernel.net.tunnel.c.c;
        if (aVar != null && aVar.a && aVar.b != null && !aVar.b.isEmpty()) {
            HttpUrl url = request.url();
            for (String str : aVar.b) {
                if (str.equals(url.host())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return chain.proceed(request);
        }
        Request.Builder newBuilder = request.newBuilder();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1fbeb43946ea37dfd80f004d07d3e1a9", RobustBitConfig.DEFAULT_VALUE)) {
            valueOf = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1fbeb43946ea37dfd80f004d07d3e1a9");
        } else {
            String uuid = UUID.randomUUID().toString();
            Object[] objArr3 = {uuid};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            long j2 = 0;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b375a39ce7b5fe3b49ce89775d87e9f7", RobustBitConfig.DEFAULT_VALUE)) {
                j2 = ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b375a39ce7b5fe3b49ce89775d87e9f7")).longValue();
            } else {
                int length = uuid.length();
                if (36 == length) {
                    long j3 = 0;
                    long j4 = 0;
                    while (true) {
                        if (i >= length) {
                            j2 = j3 ^ j4;
                            break;
                        }
                        char charAt = uuid.charAt(i);
                        if (i != 8 && i != 13 && i != 18 && i != 23) {
                            if (charAt >= 'A' && charAt <= 'F') {
                                j = (charAt - 'A') + 10;
                            } else if (charAt >= 'a' && charAt <= 'f') {
                                j = (charAt - 'a') + 10;
                            } else if (charAt < '0' || charAt > '9') {
                                break;
                            } else {
                                j = charAt - '0';
                            }
                            if (i < 18) {
                                j3 = (j3 << 4) + j;
                            } else {
                                j4 = (j4 << 4) + j;
                            }
                            i++;
                        } else if (charAt != '-') {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (com.sankuai.meituan.kernel.net.base.c.b()) {
                System.out.println("generateTraceId: " + j2);
            }
            valueOf = String.valueOf(j2);
        }
        newBuilder.addHeader("M-TraceId", valueOf);
        return chain.proceed(newBuilder.build());
    }
}
