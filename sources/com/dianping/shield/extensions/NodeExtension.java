package com.dianping.shield.extensions;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0013\u0010\u0007\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\t0\bH\u0016J2\u0010\n\u001a,\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\t0\b0\u000bj\u0015\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\t0\b`\fH\u0016¨\u0006\r"}, d2 = {"Lcom/dianping/shield/extensions/NodeExtension;", "Lcom/dianping/shield/extensions/ExtensionProcessorBuilder;", "()V", "createDisplayNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "Lkotlin/jvm/JvmWildcard;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class NodeExtension implements ExtensionProcessorBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @Nullable
    public ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ec4a3bbbc3515944557e77471a0daa", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ec4a3bbbc3515944557e77471a0daa");
        }
        h.b(cls, "processorClass");
        return null;
    }

    @NotNull
    public ShieldDisplayNode createDisplayNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d234f9fcab6a87bb3aaf400de1c9932f", RobustBitConfig.DEFAULT_VALUE) ? (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d234f9fcab6a87bb3aaf400de1c9932f") : new ShieldDisplayNode();
    }

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @NotNull
    public ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be53b9067363ea731c3c321af8903bc3", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be53b9067363ea731c3c321af8903bc3") : new ArrayList<>();
    }
}
