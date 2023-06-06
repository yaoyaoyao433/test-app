package com.dianping.shield.node.processor.impl.cell;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldCellGroup;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.processor.impl.cell.CellMoveStatusNodeProcessor;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0014¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellMoveStatusNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "()V", "handleShieldViewCell", "", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellMoveStatusNodeProcessor extends CellNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AppearanceEvent.PARTLY_APPEAR.ordinal()] = 1;
            $EnumSwitchMapping$0[AppearanceEvent.FULLY_APPEAR.ordinal()] = 2;
            int[] iArr2 = new int[AppearanceEvent.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[AppearanceEvent.PARTLY_DISAPPEAR.ordinal()] = 1;
            $EnumSwitchMapping$1[AppearanceEvent.FULLY_DISAPPEAR.ordinal()] = 2;
        }
    }

    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    public final boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {shieldSectionCellItem, shieldViewCell, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4a4894c02e9cd7a8d576c38b141759", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4a4894c02e9cd7a8d576c38b141759")).booleanValue();
        }
        h.b(shieldSectionCellItem, "cellItem");
        h.b(shieldViewCell, "shieldViewCell");
        h.b(arrayList, "addList");
        shieldViewCell.moveStatusCallback = shieldSectionCellItem.moveStatusCallback;
        if (shieldViewCell.moveStatusEventListenerList == null) {
            shieldViewCell.moveStatusEventListenerList = new ArrayList<>();
        }
        ArrayList<MoveStatusEventListener<ShieldViewCell>> arrayList2 = shieldViewCell.moveStatusEventListenerList;
        if (arrayList2 != null) {
            arrayList2.add(new MoveStatusEventListener<ShieldViewCell>() { // from class: com.dianping.shield.node.processor.impl.cell.CellMoveStatusNodeProcessor$handleShieldViewCell$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void reset(@Nullable ShieldViewCell shieldViewCell2) {
                }

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void onAppeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<ShieldViewCell> appearanceDispatchData) {
                    Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9e9a969e0afd99367d894143cadff666", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9e9a969e0afd99367d894143cadff666");
                        return;
                    }
                    h.b(appearanceEvent, "appearEvent");
                    h.b(appearanceDispatchData, "dispatchData");
                    NodePath nodePath = new NodePath();
                    ShieldCellGroup shieldCellGroup = appearanceDispatchData.element.groupParent;
                    nodePath.group = shieldCellGroup != null ? shieldCellGroup.groupIndex : -1;
                    nodePath.cell = appearanceDispatchData.element.viewCellIndex;
                    switch (CellMoveStatusNodeProcessor.WhenMappings.$EnumSwitchMapping$0[appearanceEvent.ordinal()]) {
                        case 1:
                            MoveStatusCallback moveStatusCallback = appearanceDispatchData.element.moveStatusCallback;
                            if (moveStatusCallback != null) {
                                moveStatusCallback.onAppear(ExposeScope.PX, appearanceDispatchData.scrollDirection, null, nodePath, appearanceDispatchData.viewExtraInfo);
                                return;
                            }
                            return;
                        case 2:
                            MoveStatusCallback moveStatusCallback2 = appearanceDispatchData.element.moveStatusCallback;
                            if (moveStatusCallback2 != null) {
                                moveStatusCallback2.onAppear(ExposeScope.COMPLETE, appearanceDispatchData.scrollDirection, null, nodePath, appearanceDispatchData.viewExtraInfo);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void onDisappeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<ShieldViewCell> appearanceDispatchData) {
                    Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "84be9faea6ad377ff1679f7e9e1c6a74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "84be9faea6ad377ff1679f7e9e1c6a74");
                        return;
                    }
                    h.b(appearanceEvent, "appearEvent");
                    h.b(appearanceDispatchData, "dispatchData");
                    NodePath nodePath = new NodePath();
                    ShieldCellGroup shieldCellGroup = appearanceDispatchData.element.groupParent;
                    nodePath.group = shieldCellGroup != null ? shieldCellGroup.groupIndex : -1;
                    nodePath.cell = appearanceDispatchData.element.viewCellIndex;
                    switch (CellMoveStatusNodeProcessor.WhenMappings.$EnumSwitchMapping$1[appearanceEvent.ordinal()]) {
                        case 1:
                            MoveStatusCallback moveStatusCallback = appearanceDispatchData.element.moveStatusCallback;
                            if (moveStatusCallback != null) {
                                moveStatusCallback.onDisappear(ExposeScope.PX, appearanceDispatchData.scrollDirection, null, nodePath, appearanceDispatchData.viewExtraInfo);
                                return;
                            }
                            return;
                        case 2:
                            MoveStatusCallback moveStatusCallback2 = appearanceDispatchData.element.moveStatusCallback;
                            if (moveStatusCallback2 != null) {
                                moveStatusCallback2.onDisappear(ExposeScope.COMPLETE, appearanceDispatchData.scrollDirection, null, nodePath, appearanceDispatchData.viewExtraInfo);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            });
        }
        return false;
    }
}
