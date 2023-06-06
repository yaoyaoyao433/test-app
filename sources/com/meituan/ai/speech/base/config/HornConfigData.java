package com.meituan.ai.speech.base.config;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meituan/ai/speech/base/config/HornConfigData;", "", "()V", "isUseWebsocket", "", "()Z", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class HornConfigData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean isUseWebsocket;

    public final boolean isUseWebsocket() {
        return this.isUseWebsocket;
    }
}
