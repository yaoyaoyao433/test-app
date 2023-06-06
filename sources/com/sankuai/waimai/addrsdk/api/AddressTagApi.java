package com.sankuai.waimai.addrsdk.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.TagBean;
import com.sankuai.waimai.addrsdk.mvp.bean.TagListData;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AddressTagApi {
    @POST("/v1/tag/list")
    @FormUrlEncoded
    d<BaseResponse<TagListData>> list(@Field("fingerprint") String str);

    @POST("/v1/tag/recommend")
    @FormUrlEncoded
    d<BaseResponse<TagBean>> recommend(@Field("data") String str, @Field("fingerprint") String str2);

    @POST("/v1/address/tag/save")
    @FormUrlEncoded
    d<BaseResponse> save(@Field("data") String str, @Field("fingerprint") String str2);
}
