package com.dianping.shield.dynamic.diff.section;

import android.util.SparseArray;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.gridsection.GridSectionItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.section.GridSectionInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010&\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010'\u001a\u00020\u0003H\u0016JI\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010/J0\u00100\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-H\u0002J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u001fH\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u0002H\u0002J.\u00107\u001a\u00020$\"\b\b\u0000\u00108*\u000209\"\u0004\b\u0001\u0010:2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H:\u0018\u00010<H\u0002J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u001d\u001a.\u0012\u0004\u0012\u00020\u001f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020!0 0\u001ej\u0016\u0012\u0004\u0012\u00020\u001f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020!0 `\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/dianping/shield/dynamic/diff/section/GridSectionInfoDiff;", "Lcom/dianping/shield/dynamic/diff/section/BaseSectionDiff;", "Lcom/dianping/shield/dynamic/model/section/GridSectionInfo;", "Lcom/dianping/shield/component/extensions/gridsection/GridSectionItem;", "Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", "suggestWidth", "", "viewIdMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lkotlin/collections/HashMap;", "bindItems", "", "computingItem", "bindViewItems", "createComputingItem", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/GridSectionInfo;Lcom/dianping/shield/component/extensions/gridsection/GridSectionItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffViewItem", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getAutoLeftMargin", "getAutoRightMargin", "getSuggestWidth", "removeDiffOptionHeight", "T", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "V", "infoDiff", "Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "updateGridProps", "info", "updateProps", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridSectionInfoDiff extends BaseSectionDiff<GridSectionInfo, GridSectionItem> implements DynamicModuleMarginInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private MarginInfo contentMarginInfo;
    @Nullable
    private MarginInfo marginInfo;
    private int suggestWidth;
    private HashMap<String, DynamicViewItem<? super ReusableViewInfo>> viewIdMap;

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((GridSectionInfo) diffableInfo, (GridSectionItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final /* bridge */ /* synthetic */ void diffChildren(GridSectionInfo gridSectionInfo, GridSectionItem gridSectionItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2(gridSectionInfo, gridSectionItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getBottomContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c38a052652c0f1a4c98884bdc4c861", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c38a052652c0f1a4c98884bdc4c861")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getBottomMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0877c9a7992c5d49c869fff8d99f6f6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0877c9a7992c5d49c869fff8d99f6f6d")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getHorizontalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0e17fd5b4c93487deac2ded3257f7d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0e17fd5b4c93487deac2ded3257f7d1")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getHorizontalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73c7b13703dd4eab3dbce3a03121926", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73c7b13703dd4eab3dbce3a03121926")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getLeftContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c49d5f34a9d375c900a6a4e2fd094495", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c49d5f34a9d375c900a6a4e2fd094495")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9230fb89b2b9c82cee1b0e4517637b7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9230fb89b2b9c82cee1b0e4517637b7")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getRightContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de7aeba215d502e58f6357b40dc38c71", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de7aeba215d502e58f6357b40dc38c71")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4445a2bf8b7ce8e13408e4202a4ba291", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4445a2bf8b7ce8e13408e4202a4ba291")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getTopContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76172e0b36b6ac302c4758cb6aee329b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76172e0b36b6ac302c4758cb6aee329b")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getTopMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16d780824b5e54607af505f0a6a637ca", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16d780824b5e54607af505f0a6a637ca")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getVerticalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a30f8edff14193b5edaae3b014ce44c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a30f8edff14193b5edaae3b014ce44c")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getVerticalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25093b9bae17c63b70c0b806d392f7c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25093b9bae17c63b70c0b806d392f7c5")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalMargin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridSectionInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b28202937dbce1779da49092d7db3d60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b28202937dbce1779da49092d7db3d60");
        } else {
            this.viewIdMap = new HashMap<>();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public final MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public final Boolean getAutoMargin() {
        return this.autoMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public final MarginInfo getContentMarginInfo() {
        return this.contentMarginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final void setContentMarginInfo(@Nullable MarginInfo marginInfo) {
        this.contentMarginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public final Boolean getAutoContentMargin() {
        return this.autoContentMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final void setAutoContentMargin(@Nullable Boolean bool) {
        this.autoContentMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getAutoLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8ba16913888ccb6fac4bca2b074d17a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8ba16913888ccb6fac4bca2b074d17a")).intValue() : getHostChassis().getContainerThemePackage().getLeftMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getAutoRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96feb165994df0ca61fd35e738625291", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96feb165994df0ca61fd35e738625291")).intValue() : getHostChassis().getContainerThemePackage().getRightMargin();
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final GridSectionItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1b7b88b6a78b43ebee18e5b8d4a5df", RobustBitConfig.DEFAULT_VALUE) ? (GridSectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1b7b88b6a78b43ebee18e5b8d4a5df") : new GridSectionItem();
    }

    /* renamed from: diffChildren  reason: avoid collision after fix types in other method */
    public final void diffChildren2(@NotNull GridSectionInfo gridSectionInfo, @NotNull GridSectionItem gridSectionItem, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {gridSectionInfo, gridSectionItem, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124e23e4bd8d6f72d2edd60cda4c5acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124e23e4bd8d6f72d2edd60cda4c5acf");
            return;
        }
        h.b(gridSectionInfo, "newInfo");
        h.b(gridSectionItem, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((GridSectionInfoDiff) gridSectionInfo, (GridSectionInfo) gridSectionItem, arrayList, (Integer) 0, (Integer) 0);
        setMarginInfo(gridSectionInfo.getMarginInfo());
        setAutoMargin(gridSectionInfo.getAutoMargin());
        diffViewItem(gridSectionInfo, gridSectionItem, arrayList);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable GridSectionItem gridSectionItem) {
        Object[] objArr = {gridSectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1f7ada80a84a0fa27ae9526c40e7cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1f7ada80a84a0fa27ae9526c40e7cdb");
            return;
        }
        super.bindItems((GridSectionInfoDiff) gridSectionItem);
        bindViewItems(gridSectionItem);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final void updateProps(@NotNull GridSectionInfo gridSectionInfo) {
        Object[] objArr = {gridSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "565ce8723539fe0cca825ea7a1acc1fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "565ce8723539fe0cca825ea7a1acc1fc");
            return;
        }
        h.b(gridSectionInfo, "info");
        super.updateProps((GridSectionInfoDiff) gridSectionInfo);
        updateGridProps(gridSectionInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
        if (r3 == null) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffViewItem(com.dianping.shield.dynamic.model.section.GridSectionInfo r12, com.dianping.shield.component.extensions.gridsection.GridSectionItem r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.section.GridSectionInfoDiff.diffViewItem(com.dianping.shield.dynamic.model.section.GridSectionInfo, com.dianping.shield.component.extensions.gridsection.GridSectionItem, java.util.ArrayList):void");
    }

    private final <T extends BaseViewInfo, V> void removeDiffOptionHeight(BaseViewInfoDiff<T, V> baseViewInfoDiff) {
        Object[] objArr = {baseViewInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1126f445d44417da2830c377e430e46e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1126f445d44417da2830c377e430e46e");
        } else if (baseViewInfoDiff != null) {
            baseViewInfoDiff.setDiffOption(baseViewInfoDiff.getDiffOption() & (-3));
        }
    }

    private final int getSuggestWidth(GridSectionInfo gridSectionInfo) {
        Object[] objArr = {gridSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce67853cda7a87c235d0b2fbe1cbea81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce67853cda7a87c235d0b2fbe1cbea81")).intValue();
        }
        Integer xGap = gridSectionInfo.getXGap();
        int intValue = xGap != null ? xGap.intValue() : 0;
        int colCount = gridSectionInfo.getColCount();
        if (colCount <= 0) {
            colCount = 1;
        }
        return ((aq.b(getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(getHostChassis())) - getHorizontalMargin()) - ((colCount - 1) * intValue)) / colCount;
    }

    private final void bindViewItems(GridSectionItem gridSectionItem) {
        ArrayList<ViewItem> viewItems;
        Integer selectionStyle;
        int i = 0;
        Object[] objArr = {gridSectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2bb45395e87634e3445779c6c42a4d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2bb45395e87634e3445779c6c42a4d5");
            return;
        }
        this.viewIdMap.clear();
        if (gridSectionItem == null || (viewItems = gridSectionItem.getViewItems()) == null) {
            return;
        }
        for (Object obj : viewItems) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.h.a();
            }
            ViewItem viewItem = (ViewItem) obj;
            if (viewItem instanceof DynamicDiff) {
                DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
                dynamicDiff.onComputingComplete();
                String id = dynamicDiff.getId();
                if (id != null) {
                    this.viewIdMap.put(id, (DynamicViewItem) viewItem);
                }
                getSectionItem().addViewItem(viewItem);
                Object obj2 = viewItem.data;
                if (!(obj2 instanceof DynamicModuleViewItemData)) {
                    obj2 = null;
                }
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj2;
                if (dynamicModuleViewItemData != null) {
                    DynamicModuleViewData dynamicModuleViewData = dynamicModuleViewItemData.viewData;
                    h.a((Object) dynamicModuleViewData, "viewData");
                    dynamicModuleViewItemData.height = dynamicModuleViewData.getInputHeight();
                    SparseArray<Float> sparseArray = getSectionItem().itemHeights;
                    DynamicModuleViewData dynamicModuleViewData2 = dynamicModuleViewItemData.viewData;
                    h.a((Object) dynamicModuleViewData2, "viewData");
                    sparseArray.put(i, Float.valueOf(dynamicModuleViewData2.getInputHeight()));
                    GridSectionInfo gridSectionInfo = (GridSectionInfo) getComputingInfo();
                    dynamicModuleViewItemData.selectionStyle = (gridSectionInfo == null || (selectionStyle = gridSectionInfo.getSelectionStyle()) == null) ? DMConstant.SelectionStyle.NONE.value : selectionStyle.intValue();
                }
            }
            i = i2;
        }
    }

    private final void updateGridProps(GridSectionInfo gridSectionInfo) {
        Object[] objArr = {gridSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53517af5f56edb5ddd1ccca72ad3a066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53517af5f56edb5ddd1ccca72ad3a066");
            return;
        }
        GridSectionItem sectionItem = getSectionItem();
        Integer xGap = gridSectionInfo.getXGap();
        sectionItem.xGap = xGap != null ? xGap.intValue() : 0.0f;
        GridSectionItem sectionItem2 = getSectionItem();
        Integer yGap = gridSectionInfo.getYGap();
        sectionItem2.yGap = yGap != null ? yGap.intValue() : 0.0f;
        getSectionItem().colCount = gridSectionInfo.getColCount();
        getSectionItem().leftMargin = getLeftMargin();
        getSectionItem().rightMargin = getRightMargin();
        getSectionItem().topMargin = getTopMargin();
        getSectionItem().bottomMargin = getBottomMargin();
        getSectionItem().backgroundColor = gridSectionInfo.getBackgroundColor();
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a46bc645c43c74168bcd28cd100315cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a46bc645c43c74168bcd28cd100315cf");
        }
        h.b(str, "identifier");
        DynamicViewItem<? super ReusableViewInfo> dynamicViewItem = this.viewIdMap.get(str);
        return dynamicViewItem != null ? dynamicViewItem : super.findPicassoViewItemByIdentifier(str);
    }
}
