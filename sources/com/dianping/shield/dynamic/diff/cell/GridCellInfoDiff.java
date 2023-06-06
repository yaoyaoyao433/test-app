package com.dianping.shield.dynamic.diff.cell;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.cssgrid.c;
import com.dianping.picassomodule.widget.cssgrid.d;
import com.dianping.picassomodule.widget.cssgrid.e;
import com.dianping.picassomodule.widget.cssgrid.g;
import com.dianping.picassomodule.widget.cssgrid.i;
import com.dianping.shield.component.extensions.grid.GridRowItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom;
import com.dianping.shield.dynamic.diff.extra.ExposeInfoDiffProxy;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.GridCellInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.view.GridItemInfo;
import com.dianping.shield.dynamic.model.view.GridItemViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.t;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001&B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016JI\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u001b\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0002H\u0016J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/GridCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/CommonContainerInfoDiffCustom;", "Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;", "Lcom/dianping/shield/component/extensions/grid/GridRowItem;", "Lcom/dianping/shield/dynamic/diff/extra/ExposeInfoDiffProxy;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computingBgItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "computingMaskItem", "diffComputeUnits", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "bindItems", "", "computingItem", "createComputingItem", "diffChildren", "newInfo", "diffResult", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;Lcom/dianping/shield/component/extensions/grid/GridRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "computingRowItem", "diffGridDrawInfo", "gridCellInfo", "getIndexForRecommendHeight", "drawInfosFirstStep", "", "Lcom/dianping/picassomodule/widget/cssgrid/GridItemDrawInfo;", "([Lcom/dianping/picassomodule/widget/cssgrid/GridItemDrawInfo;)I", "getScreenWidth", "updateProps", "info", "updateViewDataRecommend", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridCellInfoDiff extends CommonContainerInfoDiffCustom<GridCellInfo, GridRowItem> implements ExposeInfoDiffProxy {
    public static final Companion Companion = new Companion(null);
    private static final String PERCENT = "%";
    private static final String WEIGHT_FR = "fr";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewItem computingBgItem;
    private ViewItem computingMaskItem;
    private ArrayList<ComputeUnit> diffComputeUnits;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/GridCellInfoDiff$Companion;", "", "()V", "PERCENT", "", "WEIGHT_FR", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f920aef1104f1ae39061604ed098180", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f920aef1104f1ae39061604ed098180");
        } else {
            this.diffComputeUnits = new ArrayList<>();
        }
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((GridCellInfo) diffableInfo, (GridRowItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(CellInfo.BaseCellInfo baseCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((GridCellInfo) baseCellInfo, (GridRowItem) rowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final GridRowItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51577e63eb0fbf6f1ab019085742c279", RobustBitConfig.DEFAULT_VALUE) ? (GridRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51577e63eb0fbf6f1ab019085742c279") : new GridRowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0246, code lost:
        if (r3 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
        if (r3 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01dd, code lost:
        if (r3 == null) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void diffChildren(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.GridCellInfo r11, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.grid.GridRowItem r12, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r13, @org.jetbrains.annotations.Nullable java.lang.Integer r14, @org.jetbrains.annotations.Nullable java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.GridCellInfoDiff.diffChildren(com.dianping.shield.dynamic.model.cell.GridCellInfo, com.dianping.shield.component.extensions.grid.GridRowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    private final int getScreenWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e3d5594109968fe2483eefd9bbf6d4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e3d5594109968fe2483eefd9bbf6d4")).intValue() : aq.b(getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(getHostChassis()));
    }

    private final void diffComputeUnits(final GridRowItem gridRowItem, final GridCellInfo gridCellInfo) {
        com.dianping.picassomodule.widget.cssgrid.f[] fVarArr;
        final int indexForRecommendHeight;
        com.dianping.picassomodule.widget.cssgrid.f[] fVarArr2;
        d dVar;
        ViewItem viewItem;
        Object[] objArr = {gridRowItem, gridCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d7aac60fd9dc124725f7b6224811706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d7aac60fd9dc124725f7b6224811706");
            return;
        }
        if (this.diffComputeUnits.size() == 0) {
            d dVar2 = gridRowItem.gridDrawInfo;
            if (dVar2 == null || (fVarArr2 = dVar2.i) == null) {
                return;
            }
            int indexForRecommendHeight2 = getIndexForRecommendHeight(fVarArr2);
            ArrayList<ViewItem> arrayList = gridRowItem.viewItems;
            if (indexForRecommendHeight2 < (arrayList != null ? arrayList.size() : 0) && indexForRecommendHeight2 != -1 && (dVar = gridRowItem.gridDrawInfo) != null) {
                Context hostContext = getHostChassis().getHostContext();
                ArrayList<ViewItem> arrayList2 = gridRowItem.viewItems;
                Object obj = (arrayList2 == null || (viewItem = arrayList2.get(indexForRecommendHeight2)) == null) ? null : viewItem.data;
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) (obj instanceof DynamicModuleViewItemData ? obj : null);
                dVar.a(indexForRecommendHeight2, j.a(hostContext, dynamicModuleViewItemData != null ? dynamicModuleViewItemData.height : 0.0f));
            }
            updateViewDataRecommend(gridRowItem, gridCellInfo);
            return;
        }
        updateViewDataRecommend(gridRowItem, gridCellInfo);
        d dVar3 = gridRowItem.gridDrawInfo;
        if (dVar3 == null || (fVarArr = dVar3.i) == null || (indexForRecommendHeight = getIndexForRecommendHeight(fVarArr)) == -1) {
            return;
        }
        int i = 0;
        for (Object obj2 : this.diffComputeUnits) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            ComputeUnit computeUnit = (ComputeUnit) obj2;
            if (i > indexForRecommendHeight) {
                computeUnit.getData().computePriority = DMConstant.VCViewComputeStep.Second.ordinal();
            }
            i = i2;
        }
        final t.a aVar = new t.a();
        aVar.a = indexForRecommendHeight;
        ArrayList<ViewItem> arrayList3 = gridRowItem.viewItems;
        if (arrayList3 != null && aVar.a < arrayList3.size()) {
            r2 = (ViewItem) arrayList3.get(aVar.a);
        }
        if (r2 != null) {
            int size = this.diffComputeUnits.size();
            while (true) {
                if (r10 >= size) {
                    break;
                } else if (h.a(r2, this.diffComputeUnits.get(r10).getOwner())) {
                    aVar.a = r10;
                    break;
                } else {
                    r10++;
                }
            }
        }
        if (aVar.a < 0 || aVar.a >= this.diffComputeUnits.size()) {
            return;
        }
        this.diffComputeUnits.get(aVar.a).setComputeViewInputListener(new ComputeViewInputListener() { // from class: com.dianping.shield.dynamic.diff.cell.GridCellInfoDiff$diffComputeUnits$$inlined$let$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.protocols.ComputeViewInputListener
            public final void onComputeViewInputSuccess(@NotNull DynamicModuleViewItemData dynamicModuleViewItemData2) {
                ArrayList arrayList4;
                ArrayList arrayList5;
                Object[] objArr2 = {dynamicModuleViewItemData2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6313930e217b52512b770beeb8f2b954", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6313930e217b52512b770beeb8f2b954");
                    return;
                }
                h.b(dynamicModuleViewItemData2, AdvanceSetting.NETWORK_TYPE);
                int i3 = t.a.this.a;
                arrayList4 = this.diffComputeUnits;
                if (i3 < arrayList4.size()) {
                    d dVar4 = gridRowItem.gridDrawInfo;
                    if (dVar4 != null) {
                        int i4 = indexForRecommendHeight;
                        Context hostContext2 = this.getHostChassis().getHostContext();
                        arrayList5 = this.diffComputeUnits;
                        DynamicModuleViewData dynamicModuleViewData = ((ComputeUnit) arrayList5.get(t.a.this.a)).getData().viewData;
                        h.a((Object) dynamicModuleViewData, "diffComputeUnits[unitIndex].data.viewData");
                        dVar4.a(i4, j.a(hostContext2, dynamicModuleViewData.getInputHeight()));
                    }
                    this.updateViewDataRecommend(gridRowItem, gridCellInfo);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewDataRecommend(GridRowItem gridRowItem, GridCellInfo gridCellInfo) {
        com.dianping.picassomodule.widget.cssgrid.f[] fVarArr;
        com.dianping.picassomodule.widget.cssgrid.f[] fVarArr2;
        int i = 0;
        Object[] objArr = {gridRowItem, gridCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b11bfcabde0a918b2d83d9abe1e47f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b11bfcabde0a918b2d83d9abe1e47f8");
            return;
        }
        ArrayList<ViewItem> arrayList = gridRowItem.viewItems;
        if (arrayList != null) {
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.h.a();
                }
                ViewItem viewItem = (ViewItem) obj;
                if (viewItem != null) {
                    DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
                    Context hostContext = getHostChassis().getHostContext();
                    d dVar = gridRowItem.gridDrawInfo;
                    dynamicViewItem.setComputingSuggestWidth(Integer.valueOf(j.b(hostContext, (dVar == null || (fVarArr2 = dVar.i) == null || i >= fVarArr2.length) ? 0.0f : fVarArr2[i].l)));
                    Context hostContext2 = getHostChassis().getHostContext();
                    d dVar2 = gridRowItem.gridDrawInfo;
                    dynamicViewItem.setComputingSuggestHeight(Integer.valueOf(j.b(hostContext2, (dVar2 == null || (fVarArr = dVar2.i) == null || i >= fVarArr.length) ? 0.0f : fVarArr[i].m)));
                    i = i2;
                } else {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.items.viewitems.DynamicViewItem<*>");
                }
            }
        }
        Context hostContext3 = getHostChassis().getHostContext();
        d dVar3 = gridRowItem.gridDrawInfo;
        int verticalMargin = getVerticalMargin() + (j.b(hostContext3, dVar3 != null ? dVar3.a() : 0.0f) * (gridCellInfo.getColCount() > 0 ? gridCellInfo.getColCount() : 1));
        ViewItem viewItem2 = this.computingBgItem;
        if (!(viewItem2 instanceof DynamicViewItem)) {
            viewItem2 = null;
        }
        DynamicViewItem dynamicViewItem2 = (DynamicViewItem) viewItem2;
        if (dynamicViewItem2 != null) {
            dynamicViewItem2.setComputingSuggestHeight(Integer.valueOf(verticalMargin));
        }
        ViewItem viewItem3 = this.computingMaskItem;
        if (!(viewItem3 instanceof DynamicViewItem)) {
            viewItem3 = null;
        }
        DynamicViewItem dynamicViewItem3 = (DynamicViewItem) viewItem3;
        if (dynamicViewItem3 != null) {
            dynamicViewItem3.setComputingSuggestHeight(Integer.valueOf(verticalMargin));
        }
    }

    private final void diffGridDrawInfo(GridCellInfo gridCellInfo, GridRowItem gridRowItem) {
        Integer gridHeight;
        Integer xGap;
        Integer yGap;
        com.dianping.picassomodule.widget.cssgrid.f[] fVarArr;
        d dVar;
        String data;
        e eVar;
        Integer bottomMargin;
        Integer rightMargin;
        Integer topMargin;
        Integer leftMargin;
        Integer bottomMargin2;
        Integer rightMargin2;
        Integer topMargin2;
        Integer leftMargin2;
        int i = 0;
        Object[] objArr = {gridCellInfo, gridRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1159c153194a8d0743663650eeee1189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1159c153194a8d0743663650eeee1189");
            return;
        }
        c cVar = new c();
        cVar.g = DMViewUtils.getRecyclerWidth(getHostChassis());
        if (gridCellInfo.getGridHeight() != null) {
            cVar.f = j.a(getHostChassis().getHostContext(), gridHeight.intValue());
            r rVar = r.a;
        }
        cVar.b = gridCellInfo.getXGap() != null ? j.a(getHostChassis().getHostContext(), xGap.intValue()) : 0.0f;
        cVar.c = gridCellInfo.getYGap() != null ? j.a(getHostChassis().getHostContext(), yGap.intValue()) : 0.0f;
        cVar.j = j.a(getHostChassis().getHostContext(), getLeftMargin());
        cVar.k = j.a(getHostChassis().getHostContext(), getRightMargin());
        cVar.h = j.a(getHostChassis().getHostContext(), getTopMargin());
        cVar.i = j.a(getHostChassis().getHostContext(), getBottomMargin());
        int colCount = gridCellInfo.getColCount();
        if (colCount <= 0) {
            colCount = 1;
        }
        cVar.e = colCount;
        Integer rowCount = gridCellInfo.getRowCount();
        cVar.d = rowCount != null ? rowCount.intValue() : 0;
        String gridSeparatorLineColor = gridCellInfo.getGridSeparatorLineColor();
        if (gridSeparatorLineColor == null) {
            gridSeparatorLineColor = "";
        }
        g.a[] valuesCustom = g.a.valuesCustom();
        Integer gridSeparatorLineStyle = gridCellInfo.getGridSeparatorLineStyle();
        cVar.o = new g(gridSeparatorLineColor, valuesCustom[gridSeparatorLineStyle != null ? gridSeparatorLineStyle.intValue() : 0]);
        ArrayList<? super GridItemViewInfo> children = gridCellInfo.getChildren();
        if (children != null) {
            int i2 = 0;
            for (Object obj : children) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.h.a();
                }
                if (obj instanceof GridItemViewInfo) {
                    ArrayList<e> arrayList = cVar.l;
                    GridItemInfo gridItemInfo = ((GridItemViewInfo) obj).getGridItemInfo();
                    if (gridItemInfo != null) {
                        String gridAreaTag = gridItemInfo.getGridAreaTag();
                        MarginInfo marginInfo = gridItemInfo.getMarginInfo();
                        if (TextUtils.isEmpty(gridAreaTag)) {
                            Integer rowStart = gridItemInfo.getRowStart();
                            int intValue = rowStart != null ? rowStart.intValue() : -1;
                            Integer colStart = gridItemInfo.getColStart();
                            int intValue2 = colStart != null ? colStart.intValue() : -1;
                            Integer rowSpan = gridItemInfo.getRowSpan();
                            int intValue3 = rowSpan != null ? rowSpan.intValue() : 1;
                            Integer colSpan = gridItemInfo.getColSpan();
                            eVar = new e(intValue, intValue2, intValue3, colSpan != null ? colSpan.intValue() : 1, j.a(getHostChassis().getHostContext(), (marginInfo == null || (leftMargin2 = marginInfo.getLeftMargin()) == null) ? 0 : leftMargin2.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (topMargin2 = marginInfo.getTopMargin()) == null) ? 0 : topMargin2.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (rightMargin2 = marginInfo.getRightMargin()) == null) ? 0 : rightMargin2.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (bottomMargin2 = marginInfo.getBottomMargin()) == null) ? 0 : bottomMargin2.intValue()));
                        } else {
                            Integer rowStart2 = gridItemInfo.getRowStart();
                            int intValue4 = rowStart2 != null ? rowStart2.intValue() : -1;
                            Integer colStart2 = gridItemInfo.getColStart();
                            int intValue5 = colStart2 != null ? colStart2.intValue() : -1;
                            Integer rowSpan2 = gridItemInfo.getRowSpan();
                            int intValue6 = rowSpan2 != null ? rowSpan2.intValue() : 1;
                            Integer colSpan2 = gridItemInfo.getColSpan();
                            eVar = new e(gridAreaTag, intValue4, intValue5, intValue6, colSpan2 != null ? colSpan2.intValue() : 1, j.a(getHostChassis().getHostContext(), (marginInfo == null || (leftMargin = marginInfo.getLeftMargin()) == null) ? 0 : leftMargin.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (topMargin = marginInfo.getTopMargin()) == null) ? 0 : topMargin.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (rightMargin = marginInfo.getRightMargin()) == null) ? 0 : rightMargin.intValue()), j.a(getHostChassis().getHostContext(), (marginInfo == null || (bottomMargin = marginInfo.getBottomMargin()) == null) ? 0 : bottomMargin.intValue()));
                        }
                    } else {
                        eVar = new e();
                    }
                    arrayList.add(eVar);
                }
                i2 = i3;
            }
            r rVar2 = r.a;
        }
        ArrayList<String> gridColWidths = gridCellInfo.getGridColWidths();
        if (gridColWidths != null) {
            for (String str : gridColWidths) {
                String str2 = str;
                if (kotlin.text.g.a((CharSequence) str2, (CharSequence) PERCENT, false)) {
                    ArrayList<i> arrayList2 = cVar.m;
                    i.a aVar = i.a.GRID_TEMPLATE_STYLE_PERCENTAGE;
                    int a = kotlin.text.g.a((CharSequence) str2, PERCENT, 0, false, 6, (Object) null);
                    if (str != null) {
                        String substring = str.substring(0, a);
                        h.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList2.add(new i(aVar, Float.parseFloat(substring)));
                    } else {
                        throw new o("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (kotlin.text.g.a((CharSequence) str2, (CharSequence) WEIGHT_FR, false)) {
                    ArrayList<i> arrayList3 = cVar.m;
                    i.a aVar2 = i.a.GRID_TEMPLATE_STYLE_WEIGHT;
                    int a2 = kotlin.text.g.a((CharSequence) str2, WEIGHT_FR, 0, false, 6, (Object) null);
                    if (str != null) {
                        String substring2 = str.substring(0, a2);
                        h.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList3.add(new i(aVar2, Float.parseFloat(substring2)));
                    } else {
                        throw new o("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    cVar.m.add(new i(i.a.GRID_TEMPLATE_STYLE_PIXEL, j.a(getHostChassis().getHostContext(), Float.parseFloat(str))));
                }
            }
            r rVar3 = r.a;
        }
        ArrayList<String> gridRowHeights = gridCellInfo.getGridRowHeights();
        if (gridRowHeights != null) {
            for (String str3 : gridRowHeights) {
                String str4 = str3;
                if (kotlin.text.g.a((CharSequence) str4, (CharSequence) PERCENT, false)) {
                    ArrayList<i> arrayList4 = cVar.n;
                    i.a aVar3 = i.a.GRID_TEMPLATE_STYLE_PERCENTAGE;
                    int a3 = kotlin.text.g.a((CharSequence) str4, PERCENT, 0, false, 6, (Object) null);
                    if (str3 != null) {
                        String substring3 = str3.substring(0, a3);
                        h.a((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList4.add(new i(aVar3, Float.parseFloat(substring3)));
                    } else {
                        throw new o("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (kotlin.text.g.a((CharSequence) str4, (CharSequence) WEIGHT_FR, false)) {
                    ArrayList<i> arrayList5 = cVar.n;
                    i.a aVar4 = i.a.GRID_TEMPLATE_STYLE_WEIGHT;
                    int a4 = kotlin.text.g.a((CharSequence) str4, WEIGHT_FR, 0, false, 6, (Object) null);
                    if (str3 != null) {
                        String substring4 = str3.substring(0, a4);
                        h.a((Object) substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList5.add(new i(aVar4, Float.parseFloat(substring4)));
                    } else {
                        throw new o("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    cVar.n.add(new i(i.a.GRID_TEMPLATE_STYLE_PIXEL, j.a(getHostChassis().getHostContext(), Float.parseFloat(str3))));
                }
            }
            r rVar4 = r.a;
        }
        ArrayList<ArrayList<String>> gridAreas = gridCellInfo.getGridAreas();
        if (gridAreas != null) {
            String[][] strArr = new String[gridAreas.size()];
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                String[] strArr2 = new String[gridAreas.get(i4).size()];
                int length2 = strArr2.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    strArr2[i5] = gridAreas.get(i4).get(i5);
                }
                strArr[i4] = strArr2;
            }
            cVar.p = strArr;
            r rVar5 = r.a;
        }
        r rVar6 = r.a;
        gridRowItem.gridDrawInfo = new d(cVar);
        d dVar2 = gridRowItem.gridDrawInfo;
        if (dVar2 == null || (fVarArr = dVar2.i) == null) {
            return;
        }
        int indexForRecommendHeight = getIndexForRecommendHeight(fVarArr);
        if (indexForRecommendHeight != -1) {
            ArrayList<? super GridItemViewInfo> children2 = gridCellInfo.getChildren();
            if (indexForRecommendHeight < (children2 != null ? children2.size() : 0)) {
                ArrayList<? super GridItemViewInfo> children3 = gridCellInfo.getChildren();
                GridItemViewInfo gridItemViewInfo = children3 != null ? children3.get(indexForRecommendHeight) : null;
                if (!(gridItemViewInfo instanceof ViewInfo)) {
                    gridItemViewInfo = null;
                }
                GridItemViewInfo gridItemViewInfo2 = gridItemViewInfo;
                if (gridItemViewInfo2 != null && (data = gridItemViewInfo2.getData()) != null) {
                    try {
                        i = new JSONObject(data).optInt(DMKeys.KEY_VIEW_HEIGHT, 0);
                    } catch (Exception unused) {
                    }
                }
                if (i > 0 && (dVar = gridRowItem.gridDrawInfo) != null) {
                    dVar.a(indexForRecommendHeight, i);
                    r rVar7 = r.a;
                }
            }
        }
        r rVar8 = r.a;
    }

    private final int getIndexForRecommendHeight(com.dianping.picassomodule.widget.cssgrid.f[] fVarArr) {
        Object[] objArr = {fVarArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea50d6ee4ad05aae6c274fce550e6603", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea50d6ee4ad05aae6c274fce550e6603")).intValue();
        }
        int length = fVarArr.length;
        for (int i = 0; i < length; i++) {
            if (fVarArr[i].m == 0.0f) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable GridRowItem gridRowItem) {
        Object[] objArr = {gridRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec4b238b356e83ee68ea930ecfb1f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec4b238b356e83ee68ea930ecfb1f05");
            return;
        }
        super.bindItems((GridCellInfoDiff) gridRowItem);
        this.diffComputeUnits.clear();
        if (gridRowItem != null) {
            ((GridRowItem) getDynamicRowItem()).gridDrawInfo = gridRowItem.gridDrawInfo;
        }
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final void updateProps(@NotNull GridCellInfo gridCellInfo) {
        Object[] objArr = {gridCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "255c9af833d2492b517ae4a57a06bfe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "255c9af833d2492b517ae4a57a06bfe9");
            return;
        }
        h.b(gridCellInfo, "info");
        GridCellInfo gridCellInfo2 = gridCellInfo;
        super.updateProps((GridCellInfoDiff) gridCellInfo2);
        updateExposeProps(gridCellInfo2, gridCellInfo, null);
        ((GridRowItem) getDynamicRowItem()).setViewType(gridCellInfo.getReuseIdentifier());
        ArrayList<ViewItem> arrayList = ((GridRowItem) getDynamicRowItem()).viewItems;
        if (arrayList != null) {
            for (ViewItem viewItem : arrayList) {
                Integer gridSelectionStyle = gridCellInfo.getGridSelectionStyle();
                if (gridSelectionStyle != null) {
                    int intValue = gridSelectionStyle.intValue();
                    Object obj = viewItem.data;
                    if (!(obj instanceof DynamicModuleViewItemData)) {
                        obj = null;
                    }
                    DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                    if (dynamicModuleViewItemData != null) {
                        dynamicModuleViewItemData.selectionStyle = intValue;
                    }
                }
                if (viewItem.viewType == null) {
                    Object obj2 = viewItem.data;
                    if (!(obj2 instanceof DynamicModuleViewItemData)) {
                        obj2 = null;
                    }
                    DynamicModuleViewItemData dynamicModuleViewItemData2 = (DynamicModuleViewItemData) obj2;
                    viewItem.viewType = dynamicModuleViewItemData2 != null ? dynamicModuleViewItemData2.jsName : null;
                }
            }
        }
    }
}
