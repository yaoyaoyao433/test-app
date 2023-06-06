package com.meituan.android.paycommon.lib.retrofit;

import com.google.gson.JsonObject;
import com.meituan.android.paybase.fingerprint.bean.SoterVerifyInfo;
import com.meituan.android.paycommon.lib.model.bean.MemberIdBean;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.Field;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Path;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface PayCommonRequestService {
    @POST("/api/mpm/member/getorcreatemember")
    @FormUrlEncoded
    Call<MemberIdBean> getMemberId(@Field("payUserID") String str);

    @POST("{path}")
    @FormUrlEncoded
    Call<JsonObject> startCouponRequest(@Path(encoded = true, value = "path") String str, @FieldMap HashMap<String, String> hashMap);

    @POST("/api/wallet/verify-soter-info")
    @FormUrlEncoded
    Call<SoterVerifyInfo> verifySoterInfo(@FieldMap HashMap<String, String> hashMap, @Field("nb_fingerprint") String str);
}
