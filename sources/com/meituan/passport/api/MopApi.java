package com.meituan.passport.api;

import android.support.annotation.RestrictTo;
import com.meituan.passport.pojo.Mop;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface MopApi {
    @GET("mop/entry/{entryKey}")
    @Headers({"retrofit-mt-request-timeout:5000"})
    Call<Mop> getMop(@Path("entryKey") String str, @QueryMap Map<String, Object> map);
}
