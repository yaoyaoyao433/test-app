package com.meituan.android.sdkmanager;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface SDKInfoService {
    @GET("/connor")
    Call<a> getSDKManageResult(@QueryMap Map<String, Object> map);
}
