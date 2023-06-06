package com.sankuai.waimai.alita.core.datadownload.net;

import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.waimai.alita.core.base.net.AlitaResponse;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AlitaDataDownloadApi {
    @POST("api/edgedata/v1/feature/fetch")
    @FormUrlEncoded
    d<AlitaResponse<a>> downloadFile(@Field("alita_biz_name") String str, @Field("alita_extra") String str2, @FieldMap Map<String, String> map);
}
