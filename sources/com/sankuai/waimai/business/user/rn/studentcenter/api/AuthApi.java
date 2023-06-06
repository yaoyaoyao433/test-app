package com.sankuai.waimai.business.user.rn.studentcenter.api;

import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.waimai.business.user.rn.studentcenter.bean.AuthBean;
import com.sankuai.waimai.business.user.rn.studentcenter.bean.UploadImgBean;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AuthApi {
    @POST("/campus/member/ocr")
    @FormUrlEncoded
    d<BaseResponse<AuthBean>> ocrAuth(@Field("secret") String str, @Field("osType") int i);

    @POST("/campus/member/uploadImg")
    @Multipart
    d<BaseResponse<UploadImgBean>> uploadImg(@Part ae.b bVar, @Part("signature") String str);
}
