package com.sankuai.waimai.platform.domain.manager.location.geo;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.SaveCategoryResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface UserAddressAPI {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface AddressType {
    }

    @POST("v7/user/address/getaddr")
    d<NewHistoryAddressResponse> fetchNewHistoryAddress(@Query("type") String str, @Query("wm_poi_id") String str2);

    @POST("v7/user/address/getaddr")
    d<NewHistoryAddressResponse> fetchNewHistoryAddress(@Query("type") String str, @Query("wm_poi_id") String str2, @Query("wm_poi_ids") String str3, @Query("biz_page") String str4, @Query("biz_id") int i, @Query("address_mode") int i2, @Query("address_using_type") int i3, @Query("need_recommend_pickup_cabinet") int i4, @Query("user_locate_address") String str5, @Query("scene") int i5, @Query("preview_order_callback_info") String str6);

    @POST("/api/v8/order/preview/address")
    @FormUrlEncoded
    d<NewHistoryAddressResponse> fetchNewHistoryAddressNew(@Field("type") String str, @Field("wm_poi_id") String str2, @Field("poi_id_str") String str3, @Field("wm_poi_ids") String str4, @Field("wm_poi_id_str_list") String str5, @Field("biz_page") String str6, @Field("biz_id") int i, @Field("address_mode") int i2, @Field("address_using_type") int i3, @Field("need_recommend_pickup_cabinet") int i4, @Field("user_locate_address") String str7, @Field("scene") int i5, @Field("preview_order_callback_info") String str8);

    @POST("v7/user/home/address/getaddr")
    d<NewHistoryAddressResponse> fetchNewHistoryAddressWithBizPage(@Query("type") String str, @Query("wm_poi_id") String str2, @Query("biz_page") String str3);

    @POST("v6/user/address/savecategory")
    d<SaveCategoryResponse> saveCategory(@Query("address_id") long j, @Query("address_category") int i, @Query("override_address_category") int i2);
}
