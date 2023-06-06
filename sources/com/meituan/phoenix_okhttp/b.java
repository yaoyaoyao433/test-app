package com.meituan.phoenix_okhttp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.u;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.phoenix.base.a<x, z> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.phoenix.base.a
    public final /* synthetic */ z a(Response response, x xVar) {
        w wVar;
        x xVar2 = xVar;
        Object[] objArr = {response, xVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdf8bcba19844702c0b82cb6e915b41", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdf8bcba19844702c0b82cb6e915b41");
        }
        if (response != null) {
            final ResponseBody body = response.body();
            String message = response.message();
            int code = response.code();
            Headers headers = response.headers();
            r.a aVar = new r.a();
            if (headers != null && headers.size() > 0) {
                for (String str : headers.names()) {
                    String str2 = headers.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        aVar.a(str, str2);
                    }
                }
            }
            z.a aVar2 = new z.a();
            z.a a = aVar2.a(aVar.a());
            a.c = code;
            a.d = message;
            Protocol protocol = response.protocol();
            Object[] objArr2 = {protocol};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c27e26acb713427a4e6087f1e13b6ad1", RobustBitConfig.DEFAULT_VALUE)) {
                switch (protocol) {
                    case HTTP_1_1:
                        wVar = w.HTTP_1_1;
                        break;
                    case HTTP_2:
                        wVar = w.HTTP_2;
                        break;
                    case HTTP_1_0:
                        wVar = w.HTTP_1_0;
                        break;
                    case SPDY_3:
                        wVar = w.SPDY_3;
                        break;
                    default:
                        wVar = null;
                        break;
                }
            } else {
                wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c27e26acb713427a4e6087f1e13b6ad1");
            }
            a.b = wVar;
            a.a = xVar2;
            a.g = new aa() { // from class: com.meituan.phoenix_okhttp.b.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.okhttp.aa
                public final u a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a760b97cb76a8ee8c25e6c4e7e65ed54", RobustBitConfig.DEFAULT_VALUE)) {
                        return (u) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a760b97cb76a8ee8c25e6c4e7e65ed54");
                    }
                    String mediaType = body.contentType().toString();
                    if (mediaType == null) {
                        return null;
                    }
                    return u.a(mediaType);
                }

                @Override // com.squareup.okhttp.aa
                public final long b() throws IOException {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4dd0dfd246ca58f27aa2dae1da703e8", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4dd0dfd246ca58f27aa2dae1da703e8")).longValue() : body.contentLength();
                }

                @Override // com.squareup.okhttp.aa
                public final okio.e c() throws IOException {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff4eb54f1b62a21ec1ae9ab7ec793b8f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (okio.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff4eb54f1b62a21ec1ae9ab7ec793b8f");
                    }
                    try {
                        return body.source();
                    } catch (Throwable unused) {
                        return new okio.c();
                    }
                }
            };
            return aVar2.a();
        }
        return null;
    }

    @Override // com.meituan.phoenix.base.a
    public final /* synthetic */ Request a(x xVar) {
        final x xVar2 = xVar;
        Object[] objArr = {xVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5770453851b6dce8b4a458053675f119", RobustBitConfig.DEFAULT_VALUE)) {
            return (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5770453851b6dce8b4a458053675f119");
        }
        RequestBody requestBody = null;
        if (xVar2 == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        if (xVar2.c != null && xVar2.c.a.length / 2 > 0) {
            r rVar = xVar2.c;
            for (String str : rVar.b()) {
                builder.add(str, rVar.a(str));
            }
        }
        if (xVar2.d != null) {
            String uVar = xVar2.d.contentType().toString();
            final MediaType parse = uVar != null ? MediaType.parse(uVar) : null;
            requestBody = new RequestBody() { // from class: com.meituan.phoenix_okhttp.b.1
                public static ChangeQuickRedirect a;

                @Override // okhttp3.RequestBody
                public final MediaType contentType() {
                    return parse;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(okio.d dVar) throws IOException {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81c5d559cf2f6160a6c7e9e39343e8e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81c5d559cf2f6160a6c7e9e39343e8e5");
                    } else {
                        xVar2.d.writeTo(dVar);
                    }
                }

                @Override // okhttp3.RequestBody
                public final long contentLength() throws IOException {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "035e593d3d97d596526c3ddab195dc59", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "035e593d3d97d596526c3ddab195dc59")).longValue() : xVar2.d.contentLength();
                }
            };
        }
        Request.Builder builder2 = new Request.Builder();
        builder2.url(xVar2.a()).headers(builder.build()).method(xVar2.b, requestBody);
        return builder2.build();
    }

    @Override // com.meituan.phoenix.base.b
    public final /* synthetic */ com.meituan.phoenix.data.e b(@NonNull Object obj) {
        z zVar = (z) obj;
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45858a9b0fc6e6930f4b4d262efa3bca", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.phoenix.data.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45858a9b0fc6e6930f4b4d262efa3bca");
        }
        com.meituan.phoenix.data.e eVar = new com.meituan.phoenix.data.e();
        eVar.b = zVar.c;
        eVar.a = zVar.c();
        return eVar;
    }

    public b(Context context, @NonNull com.meituan.phoenix.core.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62c168596f18f6e327262ed6b5ec001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62c168596f18f6e327262ed6b5ec001");
        }
    }
}
