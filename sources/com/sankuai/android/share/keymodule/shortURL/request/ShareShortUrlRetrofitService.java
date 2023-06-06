package com.sankuai.android.share.keymodule.shortURL.request;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ShareShortUrlRetrofitService {
    @POST("/platform/s")
    Call<ShareShortUrlBean> getShareShortUrl(@Body Map<String, Object> map);
}
