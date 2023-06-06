package com.dianping.shield.node.processor.legacy.row;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.CellExposedInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ExposeCallback;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/RowExposeProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowExposeProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull final af afVar, @NotNull RowItem rowItem, int i, int i2) {
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "368fd43a82be93b1194d18cb68978565", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "368fd43a82be93b1194d18cb68978565")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (afVar instanceof CellExposedInterface) {
            if (rowItem.exposeInfoArray == null) {
                rowItem.exposeInfoArray = new ArrayList<>();
            }
            ExposeInfo exposeInfo = new ExposeInfo();
            CellExposedInterface cellExposedInterface = (CellExposedInterface) afVar;
            exposeInfo.exposeScope = cellExposedInterface.getExposeScope(i, i2);
            exposeInfo.exposeDuration = cellExposedInterface.exposeDuration(i, i2);
            exposeInfo.stayDuration = cellExposedInterface.stayDuration(i, i2);
            exposeInfo.maxExposeCount = cellExposedInterface.maxExposeCount(i, i2);
            exposeInfo.agentExposeCallback = new ExposeCallback() { // from class: com.dianping.shield.node.processor.legacy.row.RowExposeProcessor$handleRowItem$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ExposeCallback
                public final void onExpose(@Nullable Object obj, int i3, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {obj, Integer.valueOf(i3), nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "760b0773babb8cd25759fbff3178e2b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "760b0773babb8cd25759fbff3178e2b2");
                    } else if (nodePath != null) {
                        ((CellExposedInterface) af.this).onExposed(nodePath.section, nodePath.row, i3);
                    }
                }
            };
            rowItem.exposeInfoArray.add(exposeInfo);
        }
        return false;
    }
}
