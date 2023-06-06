package com.sankuai.waimai.addrsdk.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.addrsdk.mvp.bean.CitySearchListBean;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface CitySearchApi {
    @POST("/v1/city/list")
    @FormUrlEncoded
    d<BaseResponse<CityListBean>> list(@Field("fingerprint") String str);

    @POST("/v1/city/search")
    @FormUrlEncoded
    d<BaseResponse<CitySearchListBean>> recommend(@Field("data") String str, @Field("fingerprint") String str2);
}
