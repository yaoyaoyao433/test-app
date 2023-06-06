package com.meituan.android.mrn.update;

import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IMRNCheckUpdate {
    @POST("config/mrn/checkListV4")
    @Headers({"post-fail-over:true"})
    rx.d<MRNCheckUpdateResponse> checkUpdate(@Query("ci") long j, @QueryMap Map<String, String> map, @Body MRNCheckUpdateRequest mRNCheckUpdateRequest);
}
