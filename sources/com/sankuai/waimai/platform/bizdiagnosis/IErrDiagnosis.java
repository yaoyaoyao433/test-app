package com.sankuai.waimai.platform.bizdiagnosis;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface IErrDiagnosis {
    @GET
    Call<ap> check(@Url String str);
}
