package com.sankuai.waimai.business.page.mine;

import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.business.page.mine.model.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WaimaiMineService {
    @POST("v10/user/functions/list")
    d<BaseResponse<b>> getFunctionList();
}
