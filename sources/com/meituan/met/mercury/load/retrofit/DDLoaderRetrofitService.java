package com.meituan.met.mercury.load.retrofit;

import com.meituan.met.mercury.load.bean.BaseResponse;
import com.meituan.met.mercury.load.bean.BundleData;
import com.meituan.met.mercury.load.bean.CheckListData;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Query;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface DDLoaderRetrofitService {
    @POST
    Call<BaseResponse<CheckListData>> checkList(@Url String str, @Body Map<String, Object> map, @Query("bundleNames") String str2);

    @Streaming
    @GET
    Call<ap> download(@Url String str);

    @POST
    Call<BaseResponse<BundleData>> getBundle(@Url String str, @Body Map<String, Object> map);

    @POST
    Call<BaseResponse<List<BundleData>>> getBundles(@Url String str, @Body Map<String, Object> map);

    @POST
    Call<ap> getMSCBundleInfo(@Url String str, @Body Map<String, Object> map);

    @GET
    Call<ap> getMSCBundleInfoTest(@Url String str);

    @GET
    Call<ap> getStoreThresholdInfo(@Url String str);
}
