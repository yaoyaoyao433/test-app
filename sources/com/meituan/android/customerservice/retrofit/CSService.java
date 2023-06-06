package com.meituan.android.customerservice.retrofit;

import com.meituan.android.customerservice.retrofit.bean.FloatingInfoBean;
import com.meituan.android.customerservice.retrofit.bean.HttpResult;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.HashMap;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CSService {
    @POST("/api/portal/chat/status")
    d<HttpResult<FloatingInfoBean>> queryCSChatStatus(@Header("CSC-VisitId") String str, @Header("CSC-UserToken") String str2, @Body HashMap<String, Object> hashMap);

    @POST("/api/clientLog")
    @FormUrlEncoded
    d<ap> sendCSLog(@FieldMap Map<String, Object> map);
}
