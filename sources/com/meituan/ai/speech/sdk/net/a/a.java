package com.meituan.ai.speech.sdk.net.a;

import android.content.Context;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.base.BaseRequest;
import com.meituan.ai.speech.base.net.data.BaseResult;
import com.meituan.ai.speech.base.utils.BasicAuthUtils;
import com.meituan.ai.speech.sdk.net.data.ConfigResult;
import com.meituan.ai.speech.sdk.net.service.RecogService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\tH\u0014J&\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\tR*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/meituan/ai/speech/sdk/net/request/ConfigRequest;", "Lcom/meituan/ai/speech/base/net/base/BaseRequest;", "Lcom/meituan/ai/speech/sdk/net/service/RecogService;", "Lcom/meituan/ai/speech/sdk/net/data/ConfigResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "requestParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "uuid", "initCall", "Lcom/sankuai/meituan/retrofit2/Call;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "token", "initCallBA", "appKey", "secretKey", "initRequestName", "initService", "setParams", "", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class a extends BaseRequest<RecogService, ConfigResult> {
    public static ChangeQuickRedirect a;
    public String b;
    private final HashMap<String, String> c;

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @NotNull
    public final String initRequestName() {
        return "config-request-v1.2";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e3c3ea1f03413b15b3c6ad835f84c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e3c3ea1f03413b15b3c6ad835f84c8");
        } else {
            this.c = new HashMap<>();
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    public final /* synthetic */ RecogService initService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330f6b77be12e15e9172af1d76170c5a", RobustBitConfig.DEFAULT_VALUE) ? (RecogService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330f6b77be12e15e9172af1d76170c5a") : (RecogService) NetCreator.INSTANCE.getRetrofit().a(RecogService.class);
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @Nullable
    public final Call<BaseResult<ConfigResult>> initCall(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142dd7e156459d07b0d1fc3250ae99ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142dd7e156459d07b0d1fc3250ae99ff");
        }
        h.b(str, "token");
        RecogService service = getService();
        if (service != null) {
            String str2 = this.b;
            if (str2 == null) {
                h.a("uuid");
            }
            return service.config(str2, str, System.currentTimeMillis(), this.c);
        }
        return null;
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseRequest
    @Nullable
    public final Call<BaseResult<ConfigResult>> initCallBA(@NotNull String str, @NotNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e338c2276e45d7fe61bfe4c599c3f18f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e338c2276e45d7fe61bfe4c599c3f18f");
        }
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        String basicAuthDate = BasicAuthUtils.INSTANCE.getBasicAuthDate();
        String basicAuthorization = BasicAuthUtils.INSTANCE.getBasicAuthorization(str, str2, "POST", "/api/v2/config", basicAuthDate);
        RecogService service = getService();
        if (service != null) {
            String str3 = this.b;
            if (str3 == null) {
                h.a("uuid");
            }
            return service.configBA(str3, basicAuthDate, basicAuthorization, System.currentTimeMillis(), this.c);
        }
        return null;
    }
}
