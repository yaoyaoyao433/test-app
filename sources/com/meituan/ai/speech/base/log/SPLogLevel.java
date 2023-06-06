package com.meituan.ai.speech.base.log;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/meituan/ai/speech/base/log/SPLogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "ERROR", "WARN", "DEBUG", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public enum SPLogLevel {
    NONE(0),
    ERROR(1),
    WARN(2),
    DEBUG(3);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;

    public static SPLogLevel valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (SPLogLevel) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc4a49d0aec0caccb8b6feca2e1a1dd9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc4a49d0aec0caccb8b6feca2e1a1dd9") : Enum.valueOf(SPLogLevel.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SPLogLevel[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (SPLogLevel[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a70854e60cd8fa526eed816f22ef1e11", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a70854e60cd8fa526eed816f22ef1e11") : values().clone());
    }

    SPLogLevel(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "317b8e06a46c1bc355bade531dbb83df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "317b8e06a46c1bc355bade531dbb83df");
        } else {
            this.value = i;
        }
    }

    public final int getValue() {
        return this.value;
    }
}
