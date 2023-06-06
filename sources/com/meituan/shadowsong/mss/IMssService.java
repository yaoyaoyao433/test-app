package com.meituan.shadowsong.mss;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.PUT;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IMssService {
    @PUT
    Call<Void> putObject(@Url String str, @Body ak akVar, @HeaderMap Map<String, String> map);
}
