package com.dianping.shield.dynamic.diff.cell;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy;
import com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy;
import com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.HoverCellInfo;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.ExposeInfo;
import com.dianping.shield.node.useritem.MoveStatusInfo;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\"H\u0002JI\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00032\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0002\u0010-J\u000e\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010!H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018`\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/HoverCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/cell/BaseCellInfoDiff;", "Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;", "Lcom/dianping/shield/node/useritem/RowItem;", "Lcom/dianping/shield/dynamic/diff/extra/ExposeInfoDiffProxy;", "Lcom/dianping/shield/dynamic/diff/extra/HoverInfoDiffProxy;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "dynamicPaintingListener", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "getDynamicPaintingListener", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "dynamicPaintingListener$delegate", "Lkotlin/Lazy;", "hoverCellScrollEventDetector", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;", "getHoverCellScrollEventDetector", "()Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;", "setHoverCellScrollEventDetector", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", "mapOnScreen", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getMapOnScreen", "()Ljava/util/HashMap;", "bindItems", "", "computingItem", "createComputingItem", "createViewItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "baseViewInfo", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;Lcom/dianping/shield/node/useritem/RowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRowViewItem", "updateProps", "info", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverCellInfoDiff extends BaseCellInfoDiff<HoverCellInfo, RowItem> implements ExposeInfoDiffProxy, HoverInfoDiffProxy {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(HoverCellInfoDiff.class), "dynamicPaintingListener", "getDynamicPaintingListener()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final d dynamicPaintingListener$delegate;
    @Nullable
    private HoverCellScrollEventDetector hoverCellScrollEventDetector;
    @NotNull
    private final HashMap<String, Long> mapOnScreen;

    private final DynamicPaitingInterface getDynamicPaintingListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicPaitingInterface) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c96cb366edb10d4ca81d3efcc09fbf3b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c96cb366edb10d4ca81d3efcc09fbf3b") : this.dynamicPaintingListener$delegate.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc7730b9972ed232d8b87edb1af6278f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc7730b9972ed232d8b87edb1af6278f");
            return;
        }
        this.mapOnScreen = new HashMap<>();
        this.dynamicPaintingListener$delegate = e.a(kotlin.i.NONE, new HoverCellInfoDiff$dynamicPaintingListener$2(this));
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((HoverCellInfo) diffableInfo, (RowItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(HoverCellInfo hoverCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2(hoverCellInfo, rowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public final ExposeInfo processExposeInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable MidasInfo midasInfo, @Nullable MGEInfo mGEInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b9fd2b6d6433c3388334d0ef58158b0", RobustBitConfig.DEFAULT_VALUE) ? (ExposeInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b9fd2b6d6433c3388334d0ef58158b0") : ExposeInfoDiffProxy.DefaultImpls.processExposeInfo(this, exposeInfo, midasInfo, mGEInfo, dynamicModuleViewItemData);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public final BottomInfo processHoverBottomInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle) {
        Object[] objArr = {hoverInfo, dividerStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e67405f73ef519903b56ea29126328c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (BottomInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e67405f73ef519903b56ea29126328c4");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverBottomInfo(this, hoverInfo, dividerStyle);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public final TopInfo processHoverTopInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle, @Nullable TopInfo.OnTopStateChangeListener onTopStateChangeListener) {
        Object[] objArr = {hoverInfo, dividerStyle, onTopStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55228eae57b7adf0fbcc2bcc95ff1f54", RobustBitConfig.DEFAULT_VALUE)) {
            return (TopInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55228eae57b7adf0fbcc2bcc95ff1f54");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverTopInfo(this, hoverInfo, dividerStyle, onTopStateChangeListener);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @Nullable
    public final MoveStatusInfo processMoveStatusInfo(@Nullable com.dianping.shield.dynamic.model.extra.ExposeInfo exposeInfo, @Nullable DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {exposeInfo, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00012d7ed605fca3084a2ff4c6949b96", RobustBitConfig.DEFAULT_VALUE) ? (MoveStatusInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00012d7ed605fca3084a2ff4c6949b96") : ExposeInfoDiffProxy.DefaultImpls.processMoveStatusInfo(this, exposeInfo, dynamicModuleViewItemData);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy
    @NotNull
    public final HashMap<String, Long> getMapOnScreen() {
        return this.mapOnScreen;
    }

    @Nullable
    public final HoverCellScrollEventDetector getHoverCellScrollEventDetector() {
        return this.hoverCellScrollEventDetector;
    }

    public final void setHoverCellScrollEventDetector(@Nullable HoverCellScrollEventDetector hoverCellScrollEventDetector) {
        this.hoverCellScrollEventDetector = hoverCellScrollEventDetector;
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final RowItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4968b94b1941f114667c57916887be7e", RobustBitConfig.DEFAULT_VALUE) ? (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4968b94b1941f114667c57916887be7e") : new RowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
        if (r2 == null) goto L21;
     */
    /* renamed from: diffChildren  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void diffChildren2(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.HoverCellInfo r17, @org.jetbrains.annotations.NotNull com.dianping.shield.node.useritem.RowItem r18, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r19, @org.jetbrains.annotations.Nullable java.lang.Integer r20, @org.jetbrains.annotations.Nullable java.lang.Integer r21) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0 = 5
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r12 = 0
            r11[r12] = r8
            r0 = 1
            r11[r0] = r9
            r0 = 2
            r11[r0] = r10
            r0 = 3
            r11[r0] = r20
            r0 = 4
            r11[r0] = r21
            com.meituan.robust.ChangeQuickRedirect r13 = com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff.changeQuickRedirect
            java.lang.String r5 = "0d7176ab84a8352e9b5e72d9e9582d79"
            r3 = 0
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r16
            r2 = r13
            r4 = r5
            r12 = r5
            r5 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L33
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r13, r0, r12)
            return
        L33:
            java.lang.String r0 = "newInfo"
            kotlin.jvm.internal.h.b(r8, r0)
            java.lang.String r0 = "computingItem"
            kotlin.jvm.internal.h.b(r9, r0)
            java.lang.String r0 = "diffResult"
            kotlin.jvm.internal.h.b(r10, r0)
            r1 = r8
            com.dianping.shield.dynamic.model.cell.CellInfo$BaseCellInfo r1 = (com.dianping.shield.dynamic.model.cell.CellInfo.BaseCellInfo) r1
            r0 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            super.diffChildren(r1, r2, r3, r4, r5)
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r0 = r16.getHostChassis()
            android.content.Context r0 = r0.getHostContext()
            com.dianping.shield.dynamic.protocols.DynamicChassisInterface r1 = r16.getHostChassis()
            int r1 = com.dianping.shield.dynamic.utils.DMViewUtils.getRecyclerWidth(r1)
            float r1 = (float) r1
            int r0 = com.dianping.agentsdk.framework.aq.b(r0, r1)
            int r1 = r16.getHorizontalMargin()
            int r0 = r0 - r1
            r1 = r8
            com.dianping.shield.dynamic.model.DiffableInfo r1 = (com.dianping.shield.dynamic.model.DiffableInfo) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r1.getIdentifier()
            r3 = 0
            if (r2 == 0) goto L9b
            java.util.HashMap r4 = r16.getViewIdMap()
            java.lang.Object r2 = r4.get(r2)
            boolean r4 = r2 instanceof com.dianping.shield.dynamic.items.viewitems.DynamicViewItem
            if (r4 != 0) goto L87
            r2 = r3
        L87:
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = (com.dianping.shield.dynamic.items.viewitems.DynamicViewItem) r2
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
            if (r2 != 0) goto L99
            r2 = r1
            com.dianping.shield.dynamic.model.view.BaseViewInfo r2 = (com.dianping.shield.dynamic.model.view.BaseViewInfo) r2
            r4 = r7
            com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff r4 = (com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff) r4
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = r4.createViewItem(r2)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
        L99:
            if (r2 != 0) goto La7
        L9b:
            r2 = r1
            com.dianping.shield.dynamic.model.view.BaseViewInfo r2 = (com.dianping.shield.dynamic.model.view.BaseViewInfo) r2
            r4 = r7
            com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff r4 = (com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff) r4
            com.dianping.shield.dynamic.items.viewitems.DynamicViewItem r2 = r4.createViewItem(r2)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
        La7:
            r2.diff(r1, r10, r0, r3)
            if (r2 == 0) goto Lb2
            com.dianping.shield.node.useritem.ViewItem r2 = (com.dianping.shield.node.useritem.ViewItem) r2
            r9.addViewItem(r2)
            return
        Lb2:
            kotlin.o r0 = new kotlin.o
            java.lang.String r1 = "null cannot be cast to non-null type com.dianping.shield.node.useritem.ViewItem"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff.diffChildren2(com.dianping.shield.dynamic.model.cell.HoverCellInfo, com.dianping.shield.node.useritem.RowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "417f9e99d9c948aee90e8729a807bdd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "417f9e99d9c948aee90e8729a807bdd6");
            return;
        }
        super.bindItems((HoverCellInfoDiff) rowItem);
        if (rowItem != null) {
            getViewIdMap().clear();
            ArrayList<ViewItem> arrayList = rowItem.viewItems;
            if (arrayList != null) {
                for (ViewItem viewItem : arrayList) {
                    if (viewItem instanceof DynamicDiff) {
                        DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
                        dynamicDiff.onComputingComplete();
                        String id = dynamicDiff.getId();
                        if (id != null) {
                            getViewIdMap().put(id, (DynamicViewItem) viewItem);
                        }
                    }
                    getDynamicRowItem().addViewItem(viewItem);
                    DynamicViewItem<?> rowViewItem = getRowViewItem();
                    if (rowViewItem != null) {
                        rowViewItem.setDynamicPaintingListener(getDynamicPaintingListener());
                    }
                }
            }
        }
    }

    private final DynamicViewItem<BaseViewInfo> createViewItem(BaseViewInfo baseViewInfo) {
        Object[] objArr = {baseViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53a59e3de74c7127e3f3e0b1dae7a348", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53a59e3de74c7127e3f3e0b1dae7a348") : new DynamicViewItem<>(new BaseViewInfoDiff(getHostChassis()));
    }

    private final DynamicViewItem<?> getRowViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad6482e943855b824ea8faa7893cfa9", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad6482e943855b824ea8faa7893cfa9");
        }
        ArrayList<ViewItem> arrayList = getDynamicRowItem().viewItems;
        if (arrayList == null || arrayList.size() <= 0 || !(arrayList.get(0) instanceof DynamicViewItem)) {
            return null;
        }
        ViewItem viewItem = arrayList.get(0);
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        return (DynamicViewItem) viewItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        if ((r2.length() > 0) != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
        if ((r2.length() > 0) != true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
        if ((r2.length() > 0) != true) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
        if ((r2.length() > 0) != true) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
        if ((r2.length() > 0) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cb, code lost:
        if (r12.hoverCellScrollEventDetector != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cd, code lost:
        r12.hoverCellScrollEventDetector = new com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector(getHostChassis());
        r0 = kotlin.r.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
        r0 = r12.hoverCellScrollEventDetector;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00de, code lost:
        com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector.bindListener$default(r0, r1, null, 2, null);
     */
    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateProps(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.HoverCellInfo r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff.updateProps(com.dianping.shield.dynamic.model.cell.HoverCellInfo):void");
    }
}
