package com.dianping.shield.node.processor.legacy.cell;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.ExposedInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/CellExposeInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "()V", "handleSectionCellInterface", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellExposeInterfaceProcessor extends CellInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor
    public final boolean handleSectionCellInterface(@NotNull final af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {afVar, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e34699107976c79aeb495aeb4a39d52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e34699107976c79aeb495aeb4a39d52")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(shieldSectionCellItem, "sectionCellItem");
        if (afVar instanceof ExposedInterface) {
            if (shieldSectionCellItem.exposeInfo == null) {
                shieldSectionCellItem.exposeInfo = new ArrayList<>();
            }
            ExposeInfo exposeInfo = new ExposeInfo();
            ExposedInterface exposedInterface = (ExposedInterface) afVar;
            exposeInfo.exposeScope = exposedInterface.getExposeScope();
            exposeInfo.exposeDuration = exposedInterface.exposeDuration();
            exposeInfo.stayDuration = exposedInterface.stayDuration();
            exposeInfo.maxExposeCount = exposedInterface.maxExposeCount();
            exposeInfo.agentExposeCallback = new ExposeCallback() { // from class: com.dianping.shield.node.processor.legacy.cell.CellExposeInterfaceProcessor$handleSectionCellInterface$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ExposeCallback
                public final void onExpose(@Nullable Object obj, int i, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {obj, Integer.valueOf(i), nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b9566a27e1fc875dbaca6eb0dc6ce074", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b9566a27e1fc875dbaca6eb0dc6ce074");
                    } else {
                        ((ExposedInterface) af.this).onExposed(i);
                    }
                }
            };
            shieldSectionCellItem.exposeInfo.add(exposeInfo);
        }
        return false;
    }
}
