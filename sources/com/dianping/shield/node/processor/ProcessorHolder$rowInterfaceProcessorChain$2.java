package com.dianping.shield.node.processor;

import com.dianping.shield.node.processor.legacy.row.DividerInfoInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.DividerInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.NormalRowInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.RowExposeProcessor;
import com.dianping.shield.node.processor.legacy.row.RowMoveStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.SetBottomInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.row.SetTopInterfaceProcessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/dianping/shield/node/processor/ProcessorChain;", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ProcessorHolder$rowInterfaceProcessorChain$2 extends i implements a<ProcessorChain> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ProcessorHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorHolder$rowInterfaceProcessorChain$2(ProcessorHolder processorHolder) {
        super(0);
        this.this$0 = processorHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final ProcessorChain invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a71342e03d6ed589fe22ad481d48bf13", RobustBitConfig.DEFAULT_VALUE) ? (ProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a71342e03d6ed589fe22ad481d48bf13") : new ProcessorChain(this.this$0).addProcessor(NormalRowInterfaceProcessor.class).addProcessor(DividerInterfaceProcessor.class).addProcessor(DividerInfoInterfaceProcessor.class).addProcessor(RowExposeProcessor.class).addProcessor(SetTopInterfaceProcessor.class).addProcessor(SetBottomInterfaceProcessor.class).addProcessor(RowMoveStatusInterfaceProcessor.class);
    }
}
