package com.sankuai.waimai.addrsdk.api;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressDetailBean;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressListResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressSaveResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.CabinetAddressList;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AddressApi {
    @POST("/v1/address/delete")
    @FormUrlEncoded
    d<BaseResponse> delete(@Field("data") String str, @Field("fingerprint") String str2);

    @POST("/v1/address/list")
    @FormUrlEncoded
    d<BaseResponse<AddressListResponse>> fetchAddressList(@Query("biz_page") String str, @Field("data") String str2, @Field("fingerprint") String str3);

    @POST("/v1/address/detail")
    @FormUrlEncoded
    d<BaseResponse<AddressDetailBean>> getAddressDetail(@Field("data") String str, @Field("fingerprint") String str2);

    @POST("/v1/address/configuration")
    d<BaseResponse<AddressConfig>> getConfig();

    @POST("/v1/pickup_cabinet/sug")
    @FormUrlEncoded
    d<BaseResponse<CabinetAddressList>> listCabinetAddress(@Field("data") String str, @Field("fingerprint") String str2);

    @POST("/v1/address/save")
    @FormUrlEncoded
    d<BaseResponse<AddressSaveResponse>> save(@Field("data") String str, @Field("fingerprint") String str2);

    @POST("/v1/address/update")
    @FormUrlEncoded
    d<BaseResponse<AddressSaveResponse>> update(@Field("data") String str, @Field("fingerprint") String str2);
}
