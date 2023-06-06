package com.meituan.ai.speech.base.log;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/meituan/ai/speech/base/log/SPLog;", "", "()V", "LOG_BASE", "", "logLevel", "Lcom/meituan/ai/speech/base/log/SPLogLevel;", "getLogLevel", "()Lcom/meituan/ai/speech/base/log/SPLogLevel;", "setLogLevel", "(Lcom/meituan/ai/speech/base/log/SPLogLevel;)V", "level", "", "logConfig", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class SPLog {
    @NotNull
    public static final String LOG_BASE = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final SPLog INSTANCE = new SPLog();
    @NotNull
    private static SPLogLevel logLevel = SPLogLevel.NONE;

    @NotNull
    public final SPLogLevel getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(@NotNull SPLogLevel sPLogLevel) {
        Object[] objArr = {sPLogLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e44ec466827e6e341d0852679b0e3f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e44ec466827e6e341d0852679b0e3f98");
            return;
        }
        h.b(sPLogLevel, "<set-?>");
        logLevel = sPLogLevel;
    }

    @Keep
    public final void logConfig(@NotNull SPLogLevel sPLogLevel) {
        Object[] objArr = {sPLogLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e1fd8e738bfa39e0d452334eca4a6c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e1fd8e738bfa39e0d452334eca4a6c4");
            return;
        }
        h.b(sPLogLevel, "level");
        logLevel = sPLogLevel;
    }

    @Keep
    @NotNull
    public final SPLogLevel getLogLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f20d291113f45828ebcc8e771518eee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (SPLogLevel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f20d291113f45828ebcc8e771518eee1");
        }
        switch (i) {
            case 0:
                return SPLogLevel.NONE;
            case 1:
                return SPLogLevel.ERROR;
            case 2:
                return SPLogLevel.WARN;
            case 3:
                return SPLogLevel.DEBUG;
            default:
                return SPLogLevel.NONE;
        }
    }
}
