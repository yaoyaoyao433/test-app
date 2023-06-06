package com.dianping.shield.node.processor.legacy.row;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.CellMoveStatusInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/RowMoveStatusInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowMoveStatusInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull final af afVar, @NotNull RowItem rowItem, final int i, final int i2) {
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5cf8d176601f23459e39817be909b5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5cf8d176601f23459e39817be909b5c")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (afVar instanceof CellMoveStatusInterface) {
            MoveStatusInfo moveStatusInfo = rowItem.moveStatusInfo;
            if (moveStatusInfo == null) {
                moveStatusInfo = new MoveStatusInfo();
            }
            rowItem.moveStatusInfo = moveStatusInfo;
            rowItem.moveStatusInfo.moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.node.processor.legacy.row.RowMoveStatusInterfaceProcessor$handleRowItem$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ac5022429b3701744f1577cb289214b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ac5022429b3701744f1577cb289214b");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    ((CellMoveStatusInterface) af.this).onAppear(exposeScope, scrollDirection, nodePath != null ? nodePath.section : i, nodePath != null ? nodePath.row : i2);
                }

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4548f8b00455dcd99a078d706034557a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4548f8b00455dcd99a078d706034557a");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    ((CellMoveStatusInterface) af.this).onDisappear(exposeScope, scrollDirection, nodePath != null ? nodePath.section : i, nodePath != null ? nodePath.row : i2);
                }
            };
        }
        return false;
    }
}
