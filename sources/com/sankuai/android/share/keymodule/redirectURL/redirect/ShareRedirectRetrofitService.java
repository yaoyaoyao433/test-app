package com.sankuai.android.share.keymodule.redirectURL.redirect;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ShareRedirectRetrofitService {
    @POST("/share")
    Call<ShareRedirectBean> getShareRedirectUrl(@Body Map<String, Object> map);
}
