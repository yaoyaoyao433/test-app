package com.sankuai.waimai.store.base.net.drug;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.order.prescription.model.PharmacistStatus;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface DrugApiService {
    @POST("v6/poi/drug/info")
    @FormUrlEncoded
    rx.d<BaseResponse<GoodDetailResponse>> getDrugDetail(@FieldMap Map<String, String> map);

    @POST("v1/drug/channelpage/vision")
    @FormUrlEncoded
    rx.d<BaseResponse<PoiVerticalityDataResponse>> getDrugHomeFirstVision(@Field("category_type") long j, @Field("second_category_type") String str, @Field("page_index") long j2, @Field("page_size") int i, @Field("navigate_type") long j3, @Field("sort_type") long j4, @Field("rank_trace_id") String str2, @Field("session_id") String str3, @Field("union_id") String str4, @Field("is_home_page") int i2, @Field("activity_filter_codes") String str5, @Field("pageSource") String str6, @Field("spu_filter_codes") String str7, @Field("template_code") int i3, @Field("request_type") int i4, @Field("is_partial_refresh") int i5, @Field("supplement_feed_mode") int i6, @Field("extra") String str8, @Field("new_drug_home_page") boolean z);

    @POST("v1/prescription/pharmacist/status")
    @FormUrlEncoded
    rx.d<BaseResponse<PharmacistStatus>> getPrescriptionStatus(@Field("session_id") long j, @Field("inquiry_id") String str, @Field("wm_poi_id") long j2, @Field("button_type") int i);
}
