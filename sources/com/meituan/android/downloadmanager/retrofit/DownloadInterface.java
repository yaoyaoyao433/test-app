package com.meituan.android.downloadmanager.retrofit;

import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HEAD;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.Streaming;
import com.sankuai.meituan.retrofit2.http.Url;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface DownloadInterface {
    @Streaming
    @GET
    Call<ap> getDownloadBody(@Url String str, @Header("Range") String str2, @HeaderMap Map<String, String> map);

    @HEAD
    Call<Void> getHeadInfo(@Url String str, @Header("Range") String str2);
}
