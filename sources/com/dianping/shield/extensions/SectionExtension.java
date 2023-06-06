package com.dianping.shield.extensions;

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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J2\u0010\n\u001a,\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u00060\u000bj\u0015\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0004¢\u0006\u0002\b\u00070\u0006`\fH\u0016¨\u0006\r"}, d2 = {"Lcom/dianping/shield/extensions/SectionExtension;", "Lcom/dianping/shield/extensions/ExtensionProcessorBuilder;", "()V", "createExtensionProcessor", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "processorClass", "Ljava/lang/Class;", "Lkotlin/jvm/JvmWildcard;", "createSectionNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "extensionProcessorChain", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class SectionExtension implements ExtensionProcessorBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public ShieldSection createSectionNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f44656f2c878d7ddf3873f03980a0b0", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f44656f2c878d7ddf3873f03980a0b0") : new ShieldSection();
    }

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @NotNull
    public ArrayList<Class<? extends ShieldProcessor>> extensionProcessorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca2c17f37e5feb97c77f923ee2715485", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca2c17f37e5feb97c77f923ee2715485");
        }
        ArrayList<Class<? extends ShieldProcessor>> arrayList = new ArrayList<>();
        arrayList.add(NormalSectionNodeProcessor.class);
        return arrayList;
    }

    @Override // com.dianping.shield.extensions.ExtensionProcessorBuilder
    @Nullable
    public ShieldProcessor createExtensionProcessor(@NotNull Class<? extends ShieldProcessor> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf972c46055137ffefa75553719a020", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf972c46055137ffefa75553719a020");
        }
        h.b(cls, "processorClass");
        if (h.a(cls, NormalSectionNodeProcessor.class)) {
            return new NormalSectionNodeProcessor();
        }
        return null;
    }
}
