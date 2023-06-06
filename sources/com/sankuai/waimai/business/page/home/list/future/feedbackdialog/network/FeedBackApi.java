package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionnaireBeanResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface FeedBackApi {
    @POST("get/questionnaire")
    @FormUrlEncoded
    d<QuestionnaireBeanResponse> questionnaire(@Field("uuid") String str, @Field("questionnaireId") long j, @Field("questionnaireUuid") String str2);

    @POST("submit/questionnaire")
    @FormUrlEncoded
    d<BaseResponse> submit(@FieldMap Map<String, Object> map);
}
