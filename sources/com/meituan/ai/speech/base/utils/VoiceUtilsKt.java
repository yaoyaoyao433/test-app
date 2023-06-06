package com.meituan.ai.speech.base.utils;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0017\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"handleVoiceDB", "", "audioData", "", "speech-base_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class VoiceUtilsKt {
    public static ChangeQuickRedirect a;

    @Keep
    public static final float handleVoiceDB(@NotNull short[] sArr) {
        Object[] objArr = {sArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fe3e8a40c1c616f9824fd083b5aec9f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fe3e8a40c1c616f9824fd083b5aec9f")).floatValue();
        }
        h.b(sArr, "audioData");
        long j = 0;
        if (true ^ (sArr.length == 0)) {
            for (int i = 0; i < sArr.length; i++) {
                j += sArr[i] * sArr[i];
            }
            double length = j / sArr.length;
            if (length > 0.0d) {
                return (float) (Math.log10(length) * 10.0d);
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
