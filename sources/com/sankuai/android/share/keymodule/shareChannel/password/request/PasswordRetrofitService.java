package com.sankuai.android.share.keymodule.shareChannel.password.request;

import com.sankuai.android.share.keymodule.shareChannel.password.bean.IndexCarpetData;
import com.sankuai.android.share.keymodule.shareChannel.password.bean.PasswordBean;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface PasswordRetrofitService {
    @GET
    Call<IndexCarpetData> getIndexCarpetData(@Url String str);

    @POST("/platform/g")
    Call<PasswordBean> getPassword(@Body Map<String, Object> map);
}
