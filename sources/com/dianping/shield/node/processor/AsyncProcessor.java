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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001H$¢\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\t\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/AsyncProcessor;", "", "()V", "nextProcessor", "handleData", "", "listener", "Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;", "obj", "", "(Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;[Ljava/lang/Object;)V", "startProcessor", "inputListener", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class AsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public AsyncProcessor nextProcessor;

    public abstract void handleData(@NotNull OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull Object... objArr);

    public final void startProcessor(@NotNull final OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull final Object... objArr) {
        Object[] objArr2 = {onAsyncProcessorFinishListener, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ea290faed67920aa5b79757969544ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ea290faed67920aa5b79757969544ee");
            return;
        }
        h.b(onAsyncProcessorFinishListener, "inputListener");
        h.b(objArr, "obj");
        handleData(new OnAsyncProcessorFinishListener() { // from class: com.dianping.shield.node.processor.AsyncProcessor$startProcessor$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.processor.OnAsyncProcessorFinishListener
            public final void onDataHandleComplete(boolean z) {
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "daa0ce48860eb14cf5d2d549419a69a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "daa0ce48860eb14cf5d2d549419a69a3");
                } else if (!z) {
                    AsyncProcessor asyncProcessor = AsyncProcessor.this.nextProcessor;
                    if (asyncProcessor == null) {
                        onAsyncProcessorFinishListener.onDataHandleComplete(z);
                        return;
                    }
                    OnAsyncProcessorFinishListener onAsyncProcessorFinishListener2 = onAsyncProcessorFinishListener;
                    Object[] objArr4 = objArr;
                    asyncProcessor.startProcessor(onAsyncProcessorFinishListener2, Arrays.copyOf(objArr4, objArr4.length));
                } else {
                    onAsyncProcessorFinishListener.onDataHandleComplete(z);
                }
            }
        }, Arrays.copyOf(objArr, objArr.length));
    }
}
