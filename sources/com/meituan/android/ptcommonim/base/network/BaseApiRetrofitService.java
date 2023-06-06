package com.meituan.android.ptcommonim.base.network;

import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.cardrender.model.MachData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitData;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface BaseApiRetrofitService {
    @GET("/platform_im/business/template_engines")
    Call<MachData> getMachInfo(@QueryMap Map<String, Object> map);

    @POST("/im/getFloatingLayer")
    Call<BaseDataEntity<PTFloatInfo>> getPTFloatInfo(@QueryMap Map<String, Object> map, @Body Map<String, Object> map2, @HeaderMap Map<String, Object> map3);

    @POST("/im/singlechat/getInfo")
    Call<BaseDataEntity<PTSessionInfo>> getPTSessionInfo(@QueryMap Map<String, Object> map, @Body Map<String, Object> map2, @HeaderMap Map<String, Object> map3);

    @POST("/im/singlechat/serviceEvaluation/getQuestions")
    Call<BaseDataEntity<PTQuestionData>> getQuestions(@QueryMap Map<String, Object> map, @Body Map<String, Object> map2, @HeaderMap Map<String, Object> map3);

    @POST("/platform_im/msg_withdraw/withdrawV2")
    Call<BaseDataEntity> recallMessage(@HeaderMap Map<String, Object> map, @Body Map<String, Object> map2);

    @POST("/platform_im/msg_reject/save_status")
    Call<BaseDataEntity> saveRefuseStatus(@QueryMap Map<String, Object> map, @Body Map<String, Object> map2);

    @POST("/im/singlechat/serviceEvaluation/submit")
    Call<BaseDataEntity<PTQuestionSubmitData>> submitEvalution(@QueryMap Map<String, Object> map, @Body Map<String, Object> map2, @HeaderMap Map<String, Object> map3);
}
