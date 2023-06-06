package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends com.meituan.mtwebkit.internal.task.a<ar> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ ar b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04bcf028aaebb5e3fb055a721691343", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04bcf028aaebb5e3fb055a721691343");
        }
        String f = com.meituan.mtwebkit.internal.h.f();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        return new ar.a().a(f).a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.connectTimeout(LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS).readTimeout(20000L, TimeUnit.MILLISECONDS).build())).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
    }
}
