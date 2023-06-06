package com.meituan.ai.speech.sdk.net.a;

import android.content.Context;
import com.meituan.ai.speech.base.log.CatMonitor;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.base.BaseRequest;
import com.meituan.ai.speech.base.net.data.BaseResult;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.utils.BasicAuthUtils;
import com.meituan.ai.speech.sdk.net.service.RecogService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.al;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0011H\u0014J&\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0014J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0002H\u0014JD\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0014\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b\u0018\u00010\u001a2\u0014\u0010)\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b\u0018\u00010*2\u0006\u0010\u001f\u001a\u00020\u0011H\u0014J \u0010+\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\nR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006,"}, d2 = {"Lcom/meituan/ai/speech/sdk/net/request/RecogRequest;", "Lcom/meituan/ai/speech/base/net/base/BaseRequest;", "Lcom/meituan/ai/speech/sdk/net/service/RecogService;", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "context", "Landroid/content/Context;", "isLast", "", "(Landroid/content/Context;Z)V", "data", "", "getData", "()[B", "setData", "([B)V", "()Z", "params", "", "getParams", "()Ljava/lang/String;", "setParams", "(Ljava/lang/String;)V", "sessionId", "getSessionId", "setSessionId", "initCall", "Lcom/sankuai/meituan/retrofit2/Call;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "token", "initCallBA", "appKey", "secretKey", "initCatSampleRate", "", "initRequestName", "initService", "postPrivateMonitor", "", "requestTime", "", "call", "response", "Lcom/sankuai/meituan/retrofit2/Response;", "setRecogParams", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class c extends BaseRequest<RecogService, RecogResult> {
    public static ChangeQuickRedirect a;
    @NotNull
    public String b;
    @NotNull
    public String c;
    @Nullable
    public byte[] d;
    private final boolean e;

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    public final int initCatSampleRate() {
        return 10;
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @NotNull
    public final String initRequestName() {
        return "recog-nbest-request";
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    public final /* synthetic */ RecogService initService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b28cc0ebf892c764837448ec75e0afc1", RobustBitConfig.DEFAULT_VALUE) ? (RecogService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b28cc0ebf892c764837448ec75e0afc1") : (RecogService) NetCreator.INSTANCE.getRetrofit().a(RecogService.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, boolean z) {
        super(context);
        h.b(context, "context");
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c89e56282e60046a84aa4e48e4970c4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c89e56282e60046a84aa4e48e4970c4c");
        } else {
            this.e = z;
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    public final void postPrivateMonitor(long j, @Nullable Call<BaseResult<RecogResult>> call, @Nullable Response<BaseResult<RecogResult>> response, @NotNull String str) {
        Object[] objArr = {new Long(j), call, response, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d7768d4d5768f896fe04fe0ddd3a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d7768d4d5768f896fe04fe0ddd3a92");
            return;
        }
        h.b(str, "secretKey");
        if (this.e) {
            CatMonitor.INSTANCE.uploadCustomIndicator(getContext(), kotlin.collections.h.a(new k("last-response-time", kotlin.collections.h.a(Float.valueOf((float) (System.currentTimeMillis() - j))))), kotlin.collections.h.a((Object[]) new k[]{new k("requestName", getRequestName()), new k("secretKey", str), new k("networkType", "http")}));
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @Nullable
    public final Call<BaseResult<RecogResult>> initCall(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9952599a5e4e6ea259105e5a7b068d12", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9952599a5e4e6ea259105e5a7b068d12");
        }
        h.b(str, "token");
        if (this.d == null) {
            RecogService service = getService();
            if (service != null) {
                String str2 = this.b;
                if (str2 == null) {
                    h.a("params");
                }
                long currentTimeMillis = System.currentTimeMillis();
                String str3 = this.c;
                if (str3 == null) {
                    h.a("sessionId");
                }
                return service.recog(str2, str, currentTimeMillis, str3, null);
            }
            return null;
        }
        RecogService service2 = getService();
        if (service2 != null) {
            String str4 = this.b;
            if (str4 == null) {
                h.a("params");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String str5 = this.c;
            if (str5 == null) {
                h.a("sessionId");
            }
            byte[] bArr = this.d;
            if (bArr == null) {
                h.a();
            }
            return service2.recog(str4, str, currentTimeMillis2, str5, al.a(bArr, "application/octet-stream"));
        }
        return null;
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @Nullable
    public final Call<BaseResult<RecogResult>> initCallBA(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961ee596d6be18752abfb9d37aa6dff7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961ee596d6be18752abfb9d37aa6dff7");
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        String basicAuthDate = BasicAuthUtils.INSTANCE.getBasicAuthDate();
        String basicAuthorization = BasicAuthUtils.INSTANCE.getBasicAuthorization(str, str2, "POST", "/api/v2/datagram_nbest", basicAuthDate);
        if (this.d == null) {
            RecogService service = getService();
            if (service != null) {
                String str3 = this.b;
                if (str3 == null) {
                    h.a("params");
                }
                long currentTimeMillis = System.currentTimeMillis();
                String str4 = this.c;
                if (str4 == null) {
                    h.a("sessionId");
                }
                return service.recogBA(str3, basicAuthDate, basicAuthorization, currentTimeMillis, str4, null);
            }
            return null;
        }
        RecogService service2 = getService();
        if (service2 != null) {
            String str5 = this.b;
            if (str5 == null) {
                h.a("params");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String str6 = this.c;
            if (str6 == null) {
                h.a("sessionId");
            }
            byte[] bArr = this.d;
            if (bArr == null) {
                h.a();
            }
            return service2.recogBA(str5, basicAuthDate, basicAuthorization, currentTimeMillis2, str6, al.a(bArr, "application/octet-stream"));
        }
        return null;
    }
}
