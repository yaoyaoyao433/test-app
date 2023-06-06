package com.dianping.shield.node.processor.legacy.cell;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.feature.MoveStatusInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/CellMoveStatusInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "()V", "handleSectionCellInterface", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellMoveStatusInterfaceProcessor extends CellInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor
    public final boolean handleSectionCellInterface(@NotNull final af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {afVar, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8abebf7b26ec4b77aae87bbef6a88294", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8abebf7b26ec4b77aae87bbef6a88294")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(shieldSectionCellItem, "sectionCellItem");
        if (afVar instanceof MoveStatusInterface) {
            shieldSectionCellItem.moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.node.processor.legacy.cell.CellMoveStatusInterfaceProcessor$handleSectionCellInterface$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d5415e979c0a3898e81cedb9374e4bad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d5415e979c0a3898e81cedb9374e4bad");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    ((MoveStatusInterface) af.this).onAppear(exposeScope, scrollDirection);
                }

                @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
                public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                    Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b9f53174ae9b29b350d5f037ae37facf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b9f53174ae9b29b350d5f037ae37facf");
                        return;
                    }
                    h.b(exposeScope, Constants.PARAM_SCOPE);
                    h.b(scrollDirection, "direction");
                    ((MoveStatusInterface) af.this).onDisappear(exposeScope, scrollDirection);
                }
            };
        }
        return false;
    }
}
