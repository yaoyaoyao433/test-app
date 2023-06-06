package com.meituan.ai.speech.base.utils;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001b\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\u0087\b¨\u0006\t"}, d2 = {"getExceptionMessage", "", "", "e", "Ljava/lang/Exception;", DMKeys.KEY_IS_EMPTY, "", "T", "", "speech-base_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class OtherUtilsKt {
    public static ChangeQuickRedirect a;

    @Keep
    public static final <T> boolean isEmpty(@Nullable Collection<? extends T> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2cf97de8376a608a67c8f7ca33caba3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2cf97de8376a608a67c8f7ca33caba3")).booleanValue() : collection == null || collection.isEmpty();
    }

    @Keep
    @NotNull
    public static final String getExceptionMessage(@NotNull Object obj, @NotNull Exception exc) {
        StackTraceElement[] stackTrace;
        Object[] objArr = {obj, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93c93e1ca0d84634c4b8857366b2dfab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93c93e1ca0d84634c4b8857366b2dfab");
        }
        h.b(obj, "receiver$0");
        h.b(exc, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(exc.toString() + "\n");
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        String sb2 = sb.toString();
        h.a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
