package com.meituan.android.quickpass.uptsm.common.retrofit;

import com.meituan.android.quickpass.uptsm.model.TsmUpdateInfo;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface RetrofitService {
    @GET
    d<TsmUpdateInfo> getTsmUpdateInfo(@Url String str, @QueryMap Map<String, String> map);
}
