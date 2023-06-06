package com.dianping.shield.node.processor.impl.row;

import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.AppearanceEvent;
import com.dianping.shield.node.cellnode.MoveStatusEventListener;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.processor.impl.row.RowNodeMoveStatusProcessor;
import com.dianping.shield.node.useritem.MoveStatusInfo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/row/RowNodeMoveStatusProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowNodeMoveStatusProcessor extends RowNodeProcessor {
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

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        ShieldViewCell shieldViewCell;
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1e925707df1d575fddc3e2493ee7a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1e925707df1d575fddc3e2493ee7a7")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        shieldRow.moveStatusInfo = rowItem.moveStatusInfo;
        ShieldSection shieldSection = shieldRow.sectionParent;
        shieldRow.setExposeComputeMode((shieldSection == null || (shieldViewCell = shieldSection.cellParent) == null) ? null : shieldViewCell.exposeComputeMode);
        if (shieldRow.moveStatusEventListenerList == null) {
            shieldRow.moveStatusEventListenerList = new ArrayList<>();
        }
        ArrayList<MoveStatusEventListener<ShieldRow>> arrayList = shieldRow.moveStatusEventListenerList;
        if (arrayList != null) {
            arrayList.add(new MoveStatusEventListener<ShieldRow>() { // from class: com.dianping.shield.node.processor.impl.row.RowNodeMoveStatusProcessor$handleRowItem$1$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void reset(@Nullable ShieldRow shieldRow2) {
                }

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void onAppeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
                    MoveStatusCallback moveStatusCallback;
                    MoveStatusCallback moveStatusCallback2;
                    Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b3f591c40202e47d0428ced06e20469", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b3f591c40202e47d0428ced06e20469");
                        return;
                    }
                    h.b(appearanceEvent, "appearEvent");
                    h.b(appearanceDispatchData, "dispatchData");
                    NodePath path = appearanceDispatchData.element.getPath();
                    switch (RowNodeMoveStatusProcessor.WhenMappings.$EnumSwitchMapping$0[appearanceEvent.ordinal()]) {
                        case 1:
                            MoveStatusInfo moveStatusInfo = appearanceDispatchData.element.moveStatusInfo;
                            if (moveStatusInfo == null || (moveStatusCallback = moveStatusInfo.moveStatusCallback) == null) {
                                return;
                            }
                            ExposeScope exposeScope = ExposeScope.PX;
                            ScrollDirection scrollDirection = appearanceDispatchData.scrollDirection;
                            MoveStatusInfo moveStatusInfo2 = appearanceDispatchData.element.moveStatusInfo;
                            moveStatusCallback.onAppear(exposeScope, scrollDirection, moveStatusInfo2 != null ? moveStatusInfo2.data : null, path, appearanceDispatchData.viewExtraInfo);
                            return;
                        case 2:
                            MoveStatusInfo moveStatusInfo3 = appearanceDispatchData.element.moveStatusInfo;
                            if (moveStatusInfo3 == null || (moveStatusCallback2 = moveStatusInfo3.moveStatusCallback) == null) {
                                return;
                            }
                            ExposeScope exposeScope2 = ExposeScope.COMPLETE;
                            ScrollDirection scrollDirection2 = appearanceDispatchData.scrollDirection;
                            MoveStatusInfo moveStatusInfo4 = appearanceDispatchData.element.moveStatusInfo;
                            moveStatusCallback2.onAppear(exposeScope2, scrollDirection2, moveStatusInfo4 != null ? moveStatusInfo4.data : null, path, appearanceDispatchData.viewExtraInfo);
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.dianping.shield.node.cellnode.MoveStatusEventListener
                public final void onDisappeared(@NotNull AppearanceEvent appearanceEvent, @NotNull AppearanceDispatchData<ShieldRow> appearanceDispatchData) {
                    NodePath path;
                    MoveStatusCallback moveStatusCallback;
                    MoveStatusCallback moveStatusCallback2;
                    ShieldDisplayNode shieldDisplayNode;
                    Object[] objArr2 = {appearanceEvent, appearanceDispatchData};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aaf6af947fa60cd1c297ad997c7c750e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aaf6af947fa60cd1c297ad997c7c750e");
                        return;
                    }
                    h.b(appearanceEvent, "appearEvent");
                    h.b(appearanceDispatchData, "dispatchData");
                    ArrayList<ShieldDisplayNode> arrayList2 = appearanceDispatchData.element.shieldDisplayNodes;
                    if (arrayList2 == null || (shieldDisplayNode = arrayList2.get(0)) == null || (path = shieldDisplayNode.getPath()) == null) {
                        path = appearanceDispatchData.element.getPath();
                    }
                    NodePath nodePath = path;
                    switch (RowNodeMoveStatusProcessor.WhenMappings.$EnumSwitchMapping$1[appearanceEvent.ordinal()]) {
                        case 1:
                            MoveStatusInfo moveStatusInfo = appearanceDispatchData.element.moveStatusInfo;
                            if (moveStatusInfo == null || (moveStatusCallback = moveStatusInfo.moveStatusCallback) == null) {
                                return;
                            }
                            ExposeScope exposeScope = ExposeScope.PX;
                            ScrollDirection scrollDirection = appearanceDispatchData.scrollDirection;
                            MoveStatusInfo moveStatusInfo2 = appearanceDispatchData.element.moveStatusInfo;
                            moveStatusCallback.onDisappear(exposeScope, scrollDirection, moveStatusInfo2 != null ? moveStatusInfo2.data : null, nodePath, appearanceDispatchData.viewExtraInfo);
                            return;
                        case 2:
                            MoveStatusInfo moveStatusInfo3 = appearanceDispatchData.element.moveStatusInfo;
                            if (moveStatusInfo3 == null || (moveStatusCallback2 = moveStatusInfo3.moveStatusCallback) == null) {
                                return;
                            }
                            ExposeScope exposeScope2 = ExposeScope.COMPLETE;
                            ScrollDirection scrollDirection2 = appearanceDispatchData.scrollDirection;
                            MoveStatusInfo moveStatusInfo4 = appearanceDispatchData.element.moveStatusInfo;
                            moveStatusCallback2.onDisappear(exposeScope2, scrollDirection2, moveStatusInfo4 != null ? moveStatusInfo4.data : null, nodePath, appearanceDispatchData.viewExtraInfo);
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
