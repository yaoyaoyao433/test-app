package com.meituan.ai.speech.base.net.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/meituan/ai/speech/base/net/data/AuthParams;", "", "()V", "appKey", "", "getAppKey", "()Ljava/lang/String;", "setAppKey", "(Ljava/lang/String;)V", "isNetWebSocket", "", "()Z", "setNetWebSocket", "(Z)V", "secretKey", "getSecretKey", "setSecretKey", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class AuthParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @NotNull
    public String appKey;
    @Keep
    private boolean isNetWebSocket;
    @Keep
    @NotNull
    public String secretKey;

    @NotNull
    public final String getAppKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c97294229426f49146ca32b1d2a59cd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c97294229426f49146ca32b1d2a59cd1");
        }
        String str = this.appKey;
        if (str == null) {
            h.a("appKey");
        }
        return str;
    }

    public final void setAppKey(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f66a4f806c7d3f1402242656915f164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f66a4f806c7d3f1402242656915f164");
            return;
        }
        h.b(str, "<set-?>");
        this.appKey = str;
    }

    @NotNull
    public final String getSecretKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c77a4de5974d44f1f80ddf95567fba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c77a4de5974d44f1f80ddf95567fba");
        }
        String str = this.secretKey;
        if (str == null) {
            h.a("secretKey");
        }
        return str;
    }

    public final void setSecretKey(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afda55849b1ae9ba0fab6273336c5dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afda55849b1ae9ba0fab6273336c5dff");
            return;
        }
        h.b(str, "<set-?>");
        this.secretKey = str;
    }

    public final boolean isNetWebSocket() {
        return this.isNetWebSocket;
    }

    public final void setNetWebSocket(boolean z) {
        this.isNetWebSocket = z;
    }
}
