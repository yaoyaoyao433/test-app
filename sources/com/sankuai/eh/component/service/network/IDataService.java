package com.sankuai.eh.component.service.network;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IDataService {
    @GET
    Call<ap> callData(@Url String str, @QueryMap Map<String, Object> map);
}
