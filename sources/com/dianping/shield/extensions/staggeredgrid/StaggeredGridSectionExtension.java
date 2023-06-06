package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.extensions.SectionExtension;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.dianping.shield.node.processor.impl.section.NormalSectionNodeProcessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00060\nj\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006`\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSectionExtension;", "Lcom/dianping/shield/extensions/SectionExtension;", "()V", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "createSectionNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridSectionExtension extends SectionExtension {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.extensions.SectionExtension
    @NotNull
    public final ShieldSection createSectionNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c716efe0d8afb43a69a8371f26d6b5d4", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c716efe0d8afb43a69a8371f26d6b5d4") : new StaggeredGridSection();
    }

    @Override // com.dianping.shield.extensions.SectionExtension, com.dianping.shield.extensions.ExtensionProcessorBuilder
    @NotNull
    public final ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11ce5220f967c9663cf6d8e294efcb18", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11ce5220f967c9663cf6d8e294efcb18");
        }
        ArrayList<Class<? extends ShieldProcessor>> arrayList = new ArrayList<>();
        arrayList.add(StaggeredGridSectionNodeProcessor.class);
        arrayList.add(NormalSectionNodeProcessor.class);
        return arrayList;
    }

    @Override // com.dianping.shield.extensions.SectionExtension, com.dianping.shield.extensions.ExtensionProcessorBuilder
    @Nullable
    public final ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d3d56fa7d2bc1640e41caa7755b2f66", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d3d56fa7d2bc1640e41caa7755b2f66");
        }
        h.b(cls, "processorClass");
        return h.a(cls, StaggeredGridSectionNodeProcessor.class) ? new StaggeredGridSectionNodeProcessor() : super.createExtensionProcessor(cls);
    }
}
