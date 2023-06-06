package com.meituan.android.uptodate.service;

import com.meituan.android.uptodate.model.VersionInfoBean;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HEAD;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface UpdateInfoService {
    @Streaming
    @GET
    Call<ap> getApk(@Url String str, @Header("Range") String str2);

    @HEAD
    Call<Void> getHeadInfo(@Url String str, @Header("Range") String str2);

    @GET
    Call<VersionInfoBean> getVersionInfo(@Url String str, @QueryMap Map<String, String> map);
}
