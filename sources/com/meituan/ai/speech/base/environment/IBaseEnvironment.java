package com.meituan.ai.speech.base.environment;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/meituan/ai/speech/base/environment/IBaseEnvironment;", "", "()V", "getAppId", "", "getAppKey", "", "getAsrBaseUrl", "getLogLevel", "Lcom/meituan/ai/speech/base/log/SPLogLevel;", "getSecretKey", "getUUID", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public abstract class IBaseEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract int getAppId();

    @NotNull
    public abstract String getAppKey();

    @NotNull
    public String getAsrBaseUrl() {
        return "";
    }

    @NotNull
    public abstract String getSecretKey();

    @NotNull
    public abstract String getUUID();

    @NotNull
    public SPLogLevel getLogLevel() {
        return SPLogLevel.NONE;
    }
}
