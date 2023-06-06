package com.meituan.ai.speech.base.environment;

import android.support.annotation.Keep;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.processor.config.IVadConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/meituan/ai/speech/base/environment/IAsrEnvironment;", "Lcom/meituan/ai/speech/base/environment/IBaseEnvironment;", "()V", "vadCallback", "Lcom/meituan/ai/speech/base/processor/callback/IVadCallback;", "vadConfig", "Lcom/meituan/ai/speech/base/processor/config/IVadConfig;", "getVadCallback", "getVadConfig", "useVad", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public abstract class IAsrEnvironment extends IBaseEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IVadCallback vadCallback;
    private IVadConfig vadConfig;

    public void useVad(@NotNull IVadConfig iVadConfig, @NotNull IVadCallback iVadCallback) {
        Object[] objArr = {iVadConfig, iVadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6f7f34c4a15a64496d1afe681198faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6f7f34c4a15a64496d1afe681198faf");
            return;
        }
        h.b(iVadConfig, "vadConfig");
        h.b(iVadCallback, "vadCallback");
        this.vadConfig = iVadConfig;
        this.vadCallback = iVadCallback;
    }

    @Nullable
    public final IVadConfig getVadConfig() {
        return this.vadConfig;
    }

    @Nullable
    public final IVadCallback getVadCallback() {
        return this.vadCallback;
    }
}
