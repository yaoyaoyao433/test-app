package com.dianping.shield.node.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H$¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/Processor;", "", "()V", "nextProcessor", "handleData", "", "obj", "", "([Ljava/lang/Object;)Z", "startProcessor", "", "([Ljava/lang/Object;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class Processor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public Processor nextProcessor;

    public abstract boolean handleData(@NotNull Object... objArr);

    public final void startProcessor(@NotNull Object... objArr) {
        Processor processor;
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddd8d9bbb81d81f6635b52272fb09b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddd8d9bbb81d81f6635b52272fb09b82");
            return;
        }
        h.b(objArr, "obj");
        if (handleData(Arrays.copyOf(objArr, objArr.length)) || (processor = this.nextProcessor) == null) {
            return;
        }
        processor.startProcessor(Arrays.copyOf(objArr, objArr.length));
    }
}
