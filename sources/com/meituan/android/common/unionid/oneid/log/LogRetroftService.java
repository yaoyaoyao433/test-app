package com.meituan.android.common.unionid.oneid.log;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface LogRetroftService {
    @POST("/")
    Call<ap> sendLog(@Body ak akVar);
}
