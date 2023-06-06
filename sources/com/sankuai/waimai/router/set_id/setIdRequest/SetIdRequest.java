package com.sankuai.waimai.router.set_id.setIdRequest;

import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.router.set_id.model.a;
import com.sankuai.waimai.router.set_id.model.b;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SetIdRequest {
    @POST("v6/set/info")
    d<a<b>> getSetId();
}
