package com.dianping.shield.dynamic.processor;

import com.dianping.shield.node.processor.AbstractProcessorHolder;
import com.dianping.shield.node.processor.ObserverAsyncProcessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/processor/DynamicProcessorHolder;", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "Lcom/dianping/shield/node/processor/ObserverAsyncProcessor;", "()V", "initProcessor", "key", "", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicProcessorHolder extends AbstractProcessorHolder<ObserverAsyncProcessor> {
    public static final DynamicProcessorHolder INSTANCE = new DynamicProcessorHolder();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.dianping.shield.node.processor.AbstractProcessorHolder
    @Nullable
    public final ObserverAsyncProcessor initProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2bb7d4fef66c48bb03c9f245b182db3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObserverAsyncProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2bb7d4fef66c48bb03c9f245b182db3");
        }
        h.b(obj, "key");
        if (obj instanceof String) {
            String str = (String) obj;
            if (g.b(str, "StepComputeProcessor", false)) {
                h.b(str, "$this$substringAfter");
                h.b(CommonConstant.Symbol.UNDERLINE, "delimiter");
                h.b(str, "missingDelimiterValue");
                int a = g.a((CharSequence) str, CommonConstant.Symbol.UNDERLINE, 0, false, 6, (Object) null);
                if (a != -1) {
                    str = str.substring(a + CommonConstant.Symbol.UNDERLINE.length(), str.length());
                    h.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                return new StepComputeProcessor(Integer.parseInt(str));
            }
            return null;
        }
        return null;
    }
}
