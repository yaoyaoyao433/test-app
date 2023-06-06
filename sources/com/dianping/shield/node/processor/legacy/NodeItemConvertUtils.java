package com.dianping.shield.node.processor.legacy;

import android.content.Context;
import com.dianping.agentsdk.framework.af;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/NodeItemConvertUtils;", "", "()V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NodeItemConvertUtils {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    @JvmStatic
    @NotNull
    public static final ShieldSectionCellItem convertInterfaceToItem(@NotNull af afVar, @NotNull Context context, @NotNull ProcessorHolder processorHolder) {
        Object[] objArr = {afVar, context, processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09a036c215011b802332c17bf3f3704f", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09a036c215011b802332c17bf3f3704f") : Companion.convertInterfaceToItem(afVar, context, processorHolder);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/NodeItemConvertUtils$Companion;", "", "()V", "convertInterfaceToItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "legacyInterface", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "context", "Landroid/content/Context;", "holder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ShieldSectionCellItem convertInterfaceToItem(@NotNull af afVar, @NotNull Context context, @NotNull ProcessorHolder processorHolder) {
            Object[] objArr = {afVar, context, processorHolder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "507c9df06e7219f65c02a2e8e6b9262f", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "507c9df06e7219f65c02a2e8e6b9262f");
            }
            h.b(afVar, "legacyInterface");
            h.b(context, "context");
            h.b(processorHolder, "holder");
            ShieldSectionCellItem shieldSectionCellItem = new ShieldSectionCellItem(NodeCreator.Companion.geneLegacyCellId(afVar));
            processorHolder.getCellInterfaceProcessorChain().startProcessor(afVar, shieldSectionCellItem);
            return shieldSectionCellItem;
        }
    }
}
