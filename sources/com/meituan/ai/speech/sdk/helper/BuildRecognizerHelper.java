package com.meituan.ai.speech.sdk.helper;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.ai.speech.base.environment.IBaseEnvironment;
import com.meituan.ai.speech.base.sdk.ISpeechRecognizer;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/meituan/ai/speech/sdk/helper/BuildRecognizerHelper;", "", "()V", "buildSpeechRecognizer", "Lcom/meituan/ai/speech/base/sdk/ISpeechRecognizer;", "context", "Landroid/content/Context;", "asrEnvironment", "Lcom/meituan/ai/speech/base/environment/IBaseEnvironment;", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class BuildRecognizerHelper {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final ISpeechRecognizer buildSpeechRecognizer(@NotNull Context context, @NotNull IBaseEnvironment iBaseEnvironment) {
        Object[] objArr = {context, iBaseEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81b8b40ce3d0be59bb9df469b42e1e3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISpeechRecognizer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81b8b40ce3d0be59bb9df469b42e1e3f");
        }
        h.b(context, "context");
        h.b(iBaseEnvironment, "asrEnvironment");
        SpeechRecognizer.Builder builder = new SpeechRecognizer.Builder();
        builder.setCatAppId(iBaseEnvironment.getAppId());
        builder.setUUID(iBaseEnvironment.getUUID());
        builder.setLog(iBaseEnvironment.getLogLevel());
        builder.setBaseUrl(iBaseEnvironment.getAsrBaseUrl());
        SpeechRecognizer.Companion.setInstance(builder.build(context));
        SpeechRecognizer.Companion.getInstance().appendAuthParams(iBaseEnvironment.getAppKey(), iBaseEnvironment.getSecretKey());
        SpeechRecognizer.Companion.getInstance().register(context, iBaseEnvironment.getUUID(), iBaseEnvironment.getAppKey());
        return SpeechRecognizer.Companion.getInstance();
    }
}
