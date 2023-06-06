package com.meituan.ai.speech.sdk.net.service;

import com.meituan.ai.speech.base.net.data.BaseResult;
import com.meituan.ai.speech.base.net.data.RecogFragmentResult;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.sdk.net.data.ConfigResult;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.http.Body;
import com.sankuai.meituan.retrofit2.http.Header;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.message.bean.Message;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\fH'JR\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\fH'JJ\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'JR\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'JJ\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'JR\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'JJ\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'JR\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H'¨\u0006\u001c"}, d2 = {"Lcom/meituan/ai/speech/sdk/net/service/RecogService;", "", "config", "Lcom/sankuai/meituan/retrofit2/Call;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "Lcom/meituan/ai/speech/sdk/net/data/ConfigResult;", Message.SID, "", "token", "time", "", "map", "", "configBA", "authDate", TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION, "recog", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "params", DBSession.TABLE_NAME, "body", "Lcom/sankuai/meituan/retrofit2/RequestBody;", "recogBA", "recogFragment", "Lcom/meituan/ai/speech/base/net/data/RecogFragmentResult;", "recogFragmentBA", "recogWithVad", "recogWithVadBA", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public interface RecogService {
    @POST("/api/v2/config")
    @NotNull
    Call<BaseResult<ConfigResult>> config(@Header("asr-sid") @NotNull String str, @Header("asr-token") @NotNull String str2, @Header("request-time") long j, @QueryMap @NotNull Map<String, String> map);

    @POST("/api/v2/config")
    @NotNull
    Call<BaseResult<ConfigResult>> configBA(@Header("asr-sid") @NotNull String str, @Header("Date") @NotNull String str2, @Header("Authorization") @NotNull String str3, @Header("request-time") long j, @QueryMap @NotNull Map<String, String> map);

    @POST("/api/v2/datagram_nbest")
    @NotNull
    Call<BaseResult<RecogResult>> recog(@Header("asr-params") @NotNull String str, @Header("asr-token") @Nullable String str2, @Header("request-time") long j, @Header("asr-sid") @NotNull String str3, @Body @Nullable ak akVar);

    @POST("/api/v2/datagram_nbest")
    @NotNull
    Call<BaseResult<RecogResult>> recogBA(@Header("asr-params") @NotNull String str, @Header("Date") @NotNull String str2, @Header("Authorization") @NotNull String str3, @Header("request-time") long j, @Header("asr-sid") @NotNull String str4, @Body @Nullable ak akVar);

    @POST("/api/v2/fragment_nbest")
    @NotNull
    Call<BaseResult<RecogFragmentResult>> recogFragment(@Header("asr-params") @NotNull String str, @Header("asr-token") @Nullable String str2, @Header("request-time") long j, @Header("asr-sid") @NotNull String str3, @Body @Nullable ak akVar);

    @POST("/api/v2/fragment_nbest")
    @NotNull
    Call<BaseResult<RecogFragmentResult>> recogFragmentBA(@Header("asr-params") @NotNull String str, @Header("Date") @NotNull String str2, @Header("Authorization") @NotNull String str3, @Header("request-time") long j, @Header("asr-sid") @NotNull String str4, @Body @Nullable ak akVar);

    @POST("/api/v2/vad_datagram_nbest")
    @NotNull
    Call<BaseResult<RecogResult>> recogWithVad(@Header("asr-params") @NotNull String str, @Header("asr-token") @Nullable String str2, @Header("request-time") long j, @Header("asr-sid") @NotNull String str3, @Body @Nullable ak akVar);

    @POST("/api/v2/vad_datagram_nbest")
    @NotNull
    Call<BaseResult<RecogResult>> recogWithVadBA(@Header("asr-params") @NotNull String str, @Header("Date") @NotNull String str2, @Header("Authorization") @NotNull String str3, @Header("request-time") long j, @Header("asr-sid") @NotNull String str4, @Body @Nullable ak akVar);
}
