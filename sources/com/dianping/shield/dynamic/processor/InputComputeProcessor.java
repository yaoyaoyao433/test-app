package com.dianping.shield.dynamic.processor;

import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.processor.AsyncProcessor;
import com.dianping.shield.node.processor.OnAsyncProcessorFinishListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.x;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH$J-\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f\"\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/dynamic/processor/InputComputeProcessor;", "Lcom/dianping/shield/node/processor/AsyncProcessor;", "()V", "computeInput", "", "listener", "Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;", "diffViewItems", "", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "paintingErrorSet", "", "", "handleData", "obj", "", "", "(Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;[Ljava/lang/Object;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class InputComputeProcessor extends AsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void computeInput(@NotNull OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull List<? extends IDynamicModuleViewItem> list, @NotNull Set<String> set);

    @Override // com.dianping.shield.node.processor.AsyncProcessor
    public void handleData(@NotNull OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull Object... objArr) {
        Object[] objArr2 = {onAsyncProcessorFinishListener, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90736647cff3e28fa1a274d494a0820c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90736647cff3e28fa1a274d494a0820c");
            return;
        }
        h.b(onAsyncProcessorFinishListener, "listener");
        h.b(objArr, "obj");
        if (objArr.length == 2 && (objArr[0] instanceof List) && (objArr[1] instanceof Set)) {
            Object obj = objArr[0];
            if (obj == null) {
                throw new o("null cannot be cast to non-null type kotlin.collections.List<com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem>");
            }
            List<? extends IDynamicModuleViewItem> list = (List) obj;
            Object obj2 = objArr[1];
            if (obj2 == null) {
                throw new o("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
            }
            computeInput(onAsyncProcessorFinishListener, list, x.a(obj2));
        }
    }
}
