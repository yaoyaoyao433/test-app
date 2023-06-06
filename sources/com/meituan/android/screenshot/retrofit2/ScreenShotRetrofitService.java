package com.meituan.android.screenshot.retrofit2;

import com.meituan.android.screenshot.bean.ShortProtocol;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.POST;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ScreenShotRetrofitService {
    @POST("/platform/share/short")
    Call<ShortProtocol> getShortProtocol(@Body ak akVar);
}
