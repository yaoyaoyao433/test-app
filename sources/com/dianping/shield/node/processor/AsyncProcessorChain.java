package com.dianping.shield.node.processor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ-\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0010\"\u0004\u0018\u00010\nH\u0014¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/node/processor/AsyncProcessorChain;", "Lcom/dianping/shield/node/processor/AsyncProcessor;", "processorHolder", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "(Lcom/dianping/shield/node/processor/AbstractProcessorHolder;)V", "processorList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addProcessor", "processorKey", "", "handleData", "", "listener", "Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;", "obj", "", "(Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;[Ljava/lang/Object;)V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class AsyncProcessorChain extends AsyncProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbstractProcessorHolder<AsyncProcessor> processorHolder;
    private ArrayList<AsyncProcessor> processorList;

    public AsyncProcessorChain(@NotNull AbstractProcessorHolder<AsyncProcessor> abstractProcessorHolder) {
        h.b(abstractProcessorHolder, "processorHolder");
        Object[] objArr = {abstractProcessorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "809933ea6b118b27945570482120d46c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "809933ea6b118b27945570482120d46c");
            return;
        }
        this.processorHolder = abstractProcessorHolder;
        this.processorList = new ArrayList<>();
    }

    @NotNull
    public final AsyncProcessorChain addProcessor(@NotNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad6a177c2a88bdeef2a708729595553d", RobustBitConfig.DEFAULT_VALUE)) {
            return (AsyncProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad6a177c2a88bdeef2a708729595553d");
        }
        h.b(obj, "processorKey");
        AsyncProcessor processor = this.processorHolder.getProcessor(obj);
        if (processor != null) {
            this.processorList.add(processor);
        }
        return this;
    }

    @Override // com.dianping.shield.node.processor.AsyncProcessor
    public final void handleData(@NotNull OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull Object... objArr) {
        int i = 0;
        Object[] objArr2 = {onAsyncProcessorFinishListener, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df5f9b5cdc6d4f6e48e1830a04608095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df5f9b5cdc6d4f6e48e1830a04608095");
            return;
        }
        h.b(onAsyncProcessorFinishListener, "listener");
        h.b(objArr, "obj");
        if (!this.processorList.isEmpty()) {
            AsyncProcessor asyncProcessor = this.processorList.get(0);
            h.a((Object) asyncProcessor, "processorList[0]");
            AsyncProcessor asyncProcessor2 = asyncProcessor;
            for (AsyncProcessor asyncProcessor3 : this.processorList) {
                if (i < this.processorList.size() - 1) {
                    asyncProcessor3.nextProcessor = this.processorList.get(i + 1);
                }
                i++;
            }
            asyncProcessor2.startProcessor(onAsyncProcessorFinishListener, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
