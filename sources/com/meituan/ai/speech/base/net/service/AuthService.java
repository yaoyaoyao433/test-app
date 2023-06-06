package com.meituan.ai.speech.base.net.service;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.net.data.AuthResult;
import com.meituan.ai.speech.base.net.data.BaseResult;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/meituan/ai/speech/base/net/service/AuthService;", "", "getToken", "Lcom/sankuai/meituan/retrofit2/Call;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "Lcom/meituan/ai/speech/base/net/data/AuthResult;", "params", "", "", "requestTime", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface AuthService {
    @POST("/oauth/v2/token")
    @Keep
    @FormUrlEncoded
    @NotNull
    Call<BaseResult<AuthResult>> getToken(@FieldMap @NotNull Map<String, String> map, @Header("Request-Time") long j);
}
