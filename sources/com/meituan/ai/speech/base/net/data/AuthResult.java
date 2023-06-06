package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/AuthResult;", "", "()V", Constants.PARAM_ACCESS_TOKEN, "", "getAccess_token", "()Ljava/lang/String;", "setAccess_token", "(Ljava/lang/String;)V", Constants.PARAM_EXPIRES_IN, "", "getExpires_in", "()J", "setExpires_in", "(J)V", "refresh_token", "getRefresh_token", "setRefresh_token", Constants.PARAM_SCOPE, "getScope", "setScope", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AuthResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @Nullable
    private String access_token;
    @Keep
    private long expires_in;
    @Keep
    @Nullable
    private String refresh_token;
    @Keep
    @Nullable
    private String scope;

    public AuthResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c1438cab3493c5601becee6ec18fb4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c1438cab3493c5601becee6ec18fb4e");
        } else {
            this.expires_in = -1L;
        }
    }

    @Nullable
    public final String getAccess_token() {
        return this.access_token;
    }

    public final void setAccess_token(@Nullable String str) {
        this.access_token = str;
    }

    public final long getExpires_in() {
        return this.expires_in;
    }

    public final void setExpires_in(long j) {
        this.expires_in = j;
    }

    @Nullable
    public final String getScope() {
        return this.scope;
    }

    public final void setScope(@Nullable String str) {
        this.scope = str;
    }

    @Nullable
    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final void setRefresh_token(@Nullable String str) {
        this.refresh_token = str;
    }
}
