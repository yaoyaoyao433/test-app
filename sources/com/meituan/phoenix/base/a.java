package com.meituan.phoenix.base;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<SrcRequest, SrcResponse> extends b<SrcRequest, OkHttpClient, SrcResponse> {
    public static ChangeQuickRedirect a;
    private final OkHttpClient c;

    public abstract SrcResponse a(Response response, SrcRequest srcrequest);

    public abstract Request a(SrcRequest srcrequest);

    @Override // com.meituan.phoenix.base.b
    public final /* synthetic */ Object a(@NonNull Object obj, String str, OkHttpClient okHttpClient) throws IOException {
        Object[] objArr = {obj, str, okHttpClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85570365a90c1946df1bcc5ee5ab4065", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85570365a90c1946df1bcc5ee5ab4065");
        }
        Request a2 = a(obj);
        Request build = a2.newBuilder().url(a2.url().newBuilder().host(str).build()).build();
        if (com.meituan.phoenix.a.a) {
            com.meituan.phoenix.util.b.a("Phoenix", "======> SrcRequest: " + obj.getClass(), new Object[0]);
        }
        return a(this.c.newCall(build).execute(), obj);
    }

    public a(Context context, @NonNull com.meituan.phoenix.core.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c0796ef0242e240f86fd244f501c5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c0796ef0242e240f86fd244f501c5b");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        if (aVar instanceof com.meituan.phoenix.core.b) {
            com.meituan.phoenix.core.b bVar = (com.meituan.phoenix.core.b) aVar;
            if (bVar.g != null) {
                builder.dns(bVar.g);
            }
            if (bVar.h != -1) {
                builder.connectTimeout(bVar.h, TimeUnit.SECONDS);
            } else {
                builder.connectTimeout(10L, TimeUnit.SECONDS);
            }
            if (bVar.i != -1) {
                builder.readTimeout(bVar.i, TimeUnit.SECONDS);
            } else {
                builder.readTimeout(10L, TimeUnit.SECONDS);
            }
            if (bVar.j != -1) {
                builder.writeTimeout(bVar.j, TimeUnit.SECONDS);
            } else {
                builder.writeTimeout(10L, TimeUnit.SECONDS);
            }
        }
        builder.connectionPool(new ConnectionPool(0, 1L, TimeUnit.SECONDS));
        this.c = builder.build();
    }
}
