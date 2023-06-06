package com.meituan.android.time.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.GET;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface SntpTimeService {
    @GET("group/v1/timestamp/milliseconds")
    Call<SntpNetWorkResult> getStandardNetTime();
}
