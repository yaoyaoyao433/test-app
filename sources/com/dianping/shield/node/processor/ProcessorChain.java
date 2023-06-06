package com.dianping.shield.node.processor;

import com.dianping.shield.extensions.ExtensionProcessorBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001J\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000fJ%\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0002\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00010\bj\b\u0012\u0004\u0012\u00020\u0001`\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/node/processor/ProcessorChain;", "Lcom/dianping/shield/node/processor/Processor;", "processorHolder", "Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "(Lcom/dianping/shield/node/processor/AbstractProcessorHolder;)V", "getProcessorHolder", "()Lcom/dianping/shield/node/processor/AbstractProcessorHolder;", "processorList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addProcessor", "builder", "Lcom/dianping/shield/extensions/ExtensionProcessorBuilder;", "processor", "processorClass", "Ljava/lang/Class;", "handleData", "", "obj", "", "", "([Ljava/lang/Object;)Z", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class ProcessorChain extends Processor {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final AbstractProcessorHolder<Processor> processorHolder;
    private ArrayList<Processor> processorList;

    public ProcessorChain(@NotNull AbstractProcessorHolder<Processor> abstractProcessorHolder) {
        h.b(abstractProcessorHolder, "processorHolder");
        Object[] objArr = {abstractProcessorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "065b0705dab9be2dbb4ac810589a5a0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "065b0705dab9be2dbb4ac810589a5a0c");
            return;
        }
        this.processorHolder = abstractProcessorHolder;
        this.processorList = new ArrayList<>();
    }

    @NotNull
    public final AbstractProcessorHolder<Processor> getProcessorHolder() {
        return this.processorHolder;
    }

    @NotNull
    public final ProcessorChain addProcessor(@NotNull Processor processor) {
        Object[] objArr = {processor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bd1f1cf99a768bfb845cbcdca170a71", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bd1f1cf99a768bfb845cbcdca170a71");
        }
        h.b(processor, "processor");
        this.processorList.add(processor);
        return this;
    }

    @NotNull
    public final ProcessorChain addProcessor(@NotNull Class<? extends Processor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6b1ec376c57097de28e98b00cd0b1c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6b1ec376c57097de28e98b00cd0b1c2");
        }
        h.b(cls, "processorClass");
        Processor processor = this.processorHolder.getProcessor(cls);
        if (processor != null) {
            this.processorList.add(processor);
        }
        return this;
    }

    @NotNull
    public final ProcessorChain addProcessor(@NotNull ExtensionProcessorBuilder extensionProcessorBuilder) {
        Object[] objArr = {extensionProcessorBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50867573557b6f3c0fe2cc797303c9ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProcessorChain) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50867573557b6f3c0fe2cc797303c9ed");
        }
        h.b(extensionProcessorBuilder, "builder");
        for (Class<? extends ShieldProcessor> cls : extensionProcessorBuilder.extensionProcessorChain()) {
            Processor processor = this.processorHolder.getProcessor(cls);
            if (processor != null) {
                this.processorList.add(processor);
            } else {
                ShieldProcessor createExtensionProcessor = extensionProcessorBuilder.createExtensionProcessor(cls);
                if (createExtensionProcessor != null) {
                    this.processorHolder.addProcessor(cls, createExtensionProcessor);
                    this.processorList.add(createExtensionProcessor);
                }
            }
        }
        return this;
    }

    @Override // com.dianping.shield.node.processor.Processor
    public boolean handleData(@NotNull Object... objArr) {
        int i = 0;
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf48b75390c15aa4e2ad5d630a99af16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf48b75390c15aa4e2ad5d630a99af16")).booleanValue();
        }
        h.b(objArr, "obj");
        if (!this.processorList.isEmpty()) {
            Processor processor = this.processorList.get(0);
            h.a((Object) processor, "processorList[0]");
            Processor processor2 = processor;
            for (Processor processor3 : this.processorList) {
                if (i < this.processorList.size() - 1) {
                    processor3.nextProcessor = this.processorList.get(i + 1);
                }
                i++;
            }
            processor2.startProcessor(Arrays.copyOf(objArr, objArr.length));
        }
        return true;
    }
}
