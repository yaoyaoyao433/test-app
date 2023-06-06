package com.sankuai.waimai.foundation.location.geo;

import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.foundation.location.model.WholeRegeoResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface LocationMafApi {
    @GET("regeo")
    d<WholeRegeoResponse> getWholeRegeoInfo(@Query("key") String str, @Query("location") String str2, @Query("uuid") String str3, @Query("scenario") String str4);
}
