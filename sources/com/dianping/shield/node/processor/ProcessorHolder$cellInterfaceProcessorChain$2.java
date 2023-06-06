package com.dianping.shield.node.processor;

import com.dianping.shield.node.processor.legacy.cell.CellExposeInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellMoveStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellStatusInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.CellStatusMoreInterfaceProcessor;
import com.dianping.shield.node.processor.legacy.cell.NormalCellInterfaceProcessor;
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
public final class ProcessorHolder$cellInterfaceProcessorChain$2 extends i implements a<ProcessorChain> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ProcessorHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorHolder$cellInterfaceProcessorChain$2(ProcessorHolder processorHolder) {
        super(0);
        this.this$0 = processorHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final ProcessorChain invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b64f455cdc257b654850200b304974", RobustBitConfig.DEFAULT_VALUE) ? (ProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b64f455cdc257b654850200b304974") : new ProcessorChain(this.this$0).addProcessor(CellStatusInterfaceProcessor.class).addProcessor(NormalCellInterfaceProcessor.class).addProcessor(CellStatusMoreInterfaceProcessor.class).addProcessor(CellExposeInterfaceProcessor.class).addProcessor(CellMoveStatusInterfaceProcessor.class);
    }
}
