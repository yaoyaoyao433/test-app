package com.sankuai.waimai.platform.net.netdiagnosis;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface IBizApi {
    @POST
    Call<ap> getLoadInfo(@Url String str);
}
