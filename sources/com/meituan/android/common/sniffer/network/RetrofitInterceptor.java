package com.meituan.android.common.sniffer.network;

import android.support.annotation.Nullable;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RetrofitInterceptor implements Interceptor {
    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public b intercept(Interceptor.a aVar) throws IOException {
        final b a;
        aj request = aVar.request();
        String b = request.b();
        if (!NetworkProcessor.isNeedUrl(b, hashCode())) {
            return aVar.a(request);
        }
        ak i = request.i();
        byte[] bArr = null;
        if (i != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            i.writeTo(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            aj.a a2 = request.a();
            a2.a(al.a(byteArray, i.contentType()));
            a = aVar.a(a2.a());
            bArr = byteArray;
        } else {
            a = aVar.a(request);
        }
        String string = a.body().string();
        final ap body = a.body();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes());
        final ap apVar = new ap() { // from class: com.meituan.android.common.sniffer.network.RetrofitInterceptor.1
            @Override // com.sankuai.meituan.retrofit2.ap
            public String contentType() {
                return body.contentType();
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public long contentLength() {
                return body.contentLength();
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public InputStream source() {
                return byteArrayInputStream;
            }

            @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                body.close();
            }
        };
        NetworkProcessor.addNetworkInfo(b, a.code(), bArr, string);
        return new b() { // from class: com.meituan.android.common.sniffer.network.RetrofitInterceptor.2
            @Override // com.sankuai.meituan.retrofit2.raw.b
            public String url() {
                return a.url();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public int code() {
                return a.code();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public String reason() {
                return a.reason();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            @Nullable
            public List<q> headers() {
                return a.headers();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.b
            public ap body() {
                return apVar;
            }
        };
    }
}
