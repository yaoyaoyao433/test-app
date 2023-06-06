package com.sankuai.waimai.ugc.image.net;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.Path;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ImageApi {
    @POST("{path}")
    @Multipart
    Call<BaseResponse<a>> uploadImg(@Path("path") String str, @Part ae.b bVar);
}
