package com.meituan.android.customerservice.channel.retrofit;

import com.meituan.android.customerservice.channel.retrofit.bean.CaseUploadVoucherSyncRequest;
import com.meituan.android.customerservice.channel.retrofit.bean.UploadFileResultEntity;
import com.meituan.android.customerservice.retrofit.bean.HttpResult;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Part;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import java.util.List;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface UploadService {
    @POST("/api/collect/case/submit/batch")
    d<HttpResult> submitProofs(@QueryMap Map<String, Object> map, @Body CaseUploadVoucherSyncRequest caseUploadVoucherSyncRequest);

    @POST("/api/file/burstUpload")
    @Multipart
    d<HttpResult<UploadFileResultEntity>> uploadFile(@Part List<ae.b> list, @QueryMap Map<String, Object> map);
}
