package com.dianping.shield.dynamic.diff.section;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.section.WaterfallSectionInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.cellnode.NodePath;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010&\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010'\u001a\u00020\u0003H\u0016JI\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\b\u0010.\u001a\u0004\u0018\u00010\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u00100J0\u00101\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00032\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-H\u0002J\b\u00102\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u00020\u001cH\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u0002H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R:\u0010\u001d\u001a.\u0012\u0004\u0012\u00020\u001f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020!0 0\u001ej\u0016\u0012\u0004\u0012\u00020\u001f\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020!0 `\"X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/dianping/shield/dynamic/diff/section/WaterfallSectionInfoDiff;", "Lcom/dianping/shield/dynamic/diff/section/BaseSectionDiff;", "Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;", "Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSectionItem;", "Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", DMKeys.KEY_SELECTION_STYLE, "", "viewIdMap", "Ljava/util/HashMap;", "", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ReusableViewInfo;", "Lkotlin/collections/HashMap;", "bindItems", "", "computingItem", "bindViewItems", "createComputingItem", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/WaterfallSectionInfo;Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSectionItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffViewItem", "getAutoLeftMargin", "getAutoRightMargin", "getSuggestViewWidth", "sectionInfo", "updateProps", "info", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class WaterfallSectionInfoDiff extends BaseSectionDiff<WaterfallSectionInfo, StaggeredGridSectionItem> implements DynamicModuleMarginInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoMargin;
    @Nullable
    private MarginInfo contentMarginInfo;
    @Nullable
    private MarginInfo marginInfo;
    private int selectionStyle;
    private HashMap<String, DynamicViewItem<? super ReusableViewInfo>> viewIdMap;

    public static final /* synthetic */ WaterfallSectionInfo access$getComputingInfo$p(WaterfallSectionInfoDiff waterfallSectionInfoDiff) {
        return (WaterfallSectionInfo) waterfallSectionInfoDiff.getComputingInfo();
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((WaterfallSectionInfo) diffableInfo, (StaggeredGridSectionItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final /* bridge */ /* synthetic */ void diffChildren(WaterfallSectionInfo waterfallSectionInfo, StaggeredGridSectionItem staggeredGridSectionItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2(waterfallSectionInfo, staggeredGridSectionItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getBottomContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0ee866b8b24b39f1e2f962dc8f8f5ec", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0ee866b8b24b39f1e2f962dc8f8f5ec")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getBottomMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92a68a03ac299f0125810a088666b38f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92a68a03ac299f0125810a088666b38f")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getHorizontalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b9e94d9d3f09c59393c53c5f381a0c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b9e94d9d3f09c59393c53c5f381a0c")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getHorizontalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9c5ffb213d2a4f06872d54f4b6c6e17", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9c5ffb213d2a4f06872d54f4b6c6e17")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getLeftContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfa18c4de68168c6a8f77614c896e3bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfa18c4de68168c6a8f77614c896e3bd")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfd674d3ea9bce4519927ab5491ac933", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfd674d3ea9bce4519927ab5491ac933")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getRightContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "517c1b41fdcecf3f9aa98ddaad5681f0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "517c1b41fdcecf3f9aa98ddaad5681f0")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7062af4bfff0ce0cdedace72633c37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7062af4bfff0ce0cdedace72633c37")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getTopContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c69c18c7d1c38943298459461c7c7d9a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c69c18c7d1c38943298459461c7c7d9a")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getTopMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5d4136c92f21e00e15c186ed428b63b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5d4136c92f21e00e15c186ed428b63b")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getVerticalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b17d0a01e7f49c21a6a64aaba15416", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b17d0a01e7f49c21a6a64aaba15416")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getVerticalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6852844da843a100420dc7323782377a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6852844da843a100420dc7323782377a")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalMargin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaterfallSectionInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7494ca12a5a9b1c06c8d672cffedd15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7494ca12a5a9b1c06c8d672cffedd15d");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a436efbc957a4996bf58a85500831b95", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a436efbc957a4996bf58a85500831b95")).intValue() : getHostChassis().getContainerThemePackage().getLeftMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public final int getAutoRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c86c57cafd462eb75350f9d91acf87", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c86c57cafd462eb75350f9d91acf87")).intValue() : getHostChassis().getContainerThemePackage().getRightMargin();
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final StaggeredGridSectionItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff1562870a69d084525c504cbb8d6337", RobustBitConfig.DEFAULT_VALUE) ? (StaggeredGridSectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff1562870a69d084525c504cbb8d6337") : new StaggeredGridSectionItem();
    }

    /* renamed from: diffChildren  reason: avoid collision after fix types in other method */
    public final void diffChildren2(@NotNull WaterfallSectionInfo waterfallSectionInfo, @NotNull StaggeredGridSectionItem staggeredGridSectionItem, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {waterfallSectionInfo, staggeredGridSectionItem, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427077054c28007279322b2d664ec5fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427077054c28007279322b2d664ec5fa");
            return;
        }
        h.b(waterfallSectionInfo, "newInfo");
        h.b(staggeredGridSectionItem, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((WaterfallSectionInfoDiff) waterfallSectionInfo, (WaterfallSectionInfo) staggeredGridSectionItem, arrayList, num, num2);
        setMarginInfo(waterfallSectionInfo.getMarginInfo());
        setAutoMargin(waterfallSectionInfo.getAutoMargin());
        diffViewItem(waterfallSectionInfo, staggeredGridSectionItem, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
        if (r4 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffViewItem(com.dianping.shield.dynamic.model.section.WaterfallSectionInfo r12, com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem r13, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.section.WaterfallSectionInfoDiff.diffViewItem(com.dianping.shield.dynamic.model.section.WaterfallSectionInfo, com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem, java.util.ArrayList):void");
    }

    private final int getSuggestViewWidth(WaterfallSectionInfo waterfallSectionInfo) {
        Object[] objArr = {waterfallSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a80e30a81543573be475ff0b1012f72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a80e30a81543573be475ff0b1012f72")).intValue();
        }
        int colCount = waterfallSectionInfo.getColCount();
        int i = colCount > 0 ? colCount : 1;
        Integer xGap = waterfallSectionInfo.getXGap();
        return (aq.b(getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(getHostChassis())) - (((xGap != null ? xGap.intValue() : 0) * (i - 1)) + getHorizontalMargin())) / i;
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable StaggeredGridSectionItem staggeredGridSectionItem) {
        Object[] objArr = {staggeredGridSectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04dc421f9564221f9013a2912837efb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04dc421f9564221f9013a2912837efb0");
            return;
        }
        super.bindItems((WaterfallSectionInfoDiff) staggeredGridSectionItem);
        bindViewItems(staggeredGridSectionItem);
    }

    private final void bindViewItems(StaggeredGridSectionItem staggeredGridSectionItem) {
        ArrayList<ViewItem> arrayList;
        Integer selectionStyle;
        Object[] objArr = {staggeredGridSectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7cde9706a0adf94e786c64191da8117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7cde9706a0adf94e786c64191da8117");
            return;
        }
        this.viewIdMap.clear();
        if (staggeredGridSectionItem == null || (arrayList = staggeredGridSectionItem.viewItems) == null) {
            return;
        }
        for (ViewItem viewItem : arrayList) {
            if (viewItem instanceof DynamicDiff) {
                DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
                dynamicDiff.onComputingComplete();
                String id = dynamicDiff.getId();
                if (id != null) {
                    this.viewIdMap.put(id, (DynamicViewItem) viewItem);
                }
                viewItem.viewPaintingCallback = new DynamicViewPaintingCallback(getHostChassis(), new DynamicPaitingInterface() { // from class: com.dianping.shield.dynamic.diff.section.WaterfallSectionInfoDiff$bindViewItems$$inlined$forEach$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface
                    public final void onPaintingInputComplete(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
                        int i;
                        Object[] objArr2 = {shieldViewHolder, obj, nodePath};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8a82db8afcde3f9aa9ea50b920da17c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8a82db8afcde3f9aa9ea50b920da17c");
                            return;
                        }
                        h.b(shieldViewHolder, "viewHolder");
                        try {
                            WaterfallSectionInfo access$getComputingInfo$p = WaterfallSectionInfoDiff.access$getComputingInfo$p(WaterfallSectionInfoDiff.this);
                            i = Color.parseColor((access$getComputingInfo$p == null || (r11 = access$getComputingInfo$p.getBackgroundColor()) == null) ? "#00000000" : "#00000000");
                        } catch (IllegalArgumentException unused) {
                            i = 0;
                        }
                        ViewParent parent = shieldViewHolder.itemView.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).setBackground(new ColorDrawable(i));
                        }
                    }
                }, false, 4, null);
                getSectionItem().addViewItem(viewItem);
                Object obj = viewItem.data;
                if (!(obj instanceof DynamicModuleViewItemData)) {
                    obj = null;
                }
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                if (dynamicModuleViewItemData != null) {
                    WaterfallSectionInfo waterfallSectionInfo = (WaterfallSectionInfo) getComputingInfo();
                    dynamicModuleViewItemData.selectionStyle = (waterfallSectionInfo == null || (selectionStyle = waterfallSectionInfo.getSelectionStyle()) == null) ? DMConstant.SelectionStyle.NONE.value : selectionStyle.intValue();
                }
            }
        }
    }

    @Override // com.dianping.shield.dynamic.diff.section.BaseSectionDiff
    public final void updateProps(@NotNull WaterfallSectionInfo waterfallSectionInfo) {
        Object[] objArr = {waterfallSectionInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fa4fb77d0daeb459440dc0e0fd41cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fa4fb77d0daeb459440dc0e0fd41cb0");
            return;
        }
        h.b(waterfallSectionInfo, "info");
        super.updateProps((WaterfallSectionInfoDiff) waterfallSectionInfo);
        getSectionItem().spanCount = waterfallSectionInfo.getColCount();
        StaggeredGridSectionItem sectionItem = getSectionItem();
        Context hostContext = getHostChassis().getHostContext();
        Integer xGap = waterfallSectionInfo.getXGap();
        sectionItem.xStaggeredGridGap = aq.a(hostContext, xGap != null ? xGap.intValue() : 0.0f);
        StaggeredGridSectionItem sectionItem2 = getSectionItem();
        Context hostContext2 = getHostChassis().getHostContext();
        Integer yGap = waterfallSectionInfo.getYGap();
        sectionItem2.yStaggeredGridGap = aq.a(hostContext2, yGap != null ? yGap.intValue() : 0.0f);
        getSectionItem().staggeredTopPadding = aq.a(getHostChassis().getHostContext(), getTopMargin());
        getSectionItem().staggeredBottomPadding = aq.a(getHostChassis().getHostContext(), getBottomMargin());
        getSectionItem().staggeredRightMargin = aq.a(getHostChassis().getHostContext(), getRightMargin());
        getSectionItem().staggeredLeftMargin = aq.a(getHostChassis().getHostContext(), getLeftMargin());
        StaggeredGridSectionItem sectionItem3 = getSectionItem();
        String backgroundColor = waterfallSectionInfo.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = "#00000000";
        }
        sectionItem3.backgroundColor = ColorUnionTypeKt.parseColor(backgroundColor);
        StaggeredGridSectionItem sectionItem4 = getSectionItem();
        Boolean enableLayoutAnimation = waterfallSectionInfo.getEnableLayoutAnimation();
        sectionItem4.enableLayoutAnimation = enableLayoutAnimation != null ? enableLayoutAnimation.booleanValue() : false;
        StaggeredGridSectionItem sectionItem5 = getSectionItem();
        AnimationType insertAnimationType = waterfallSectionInfo.getInsertAnimationType();
        if (insertAnimationType == null) {
            insertAnimationType = AnimationType.NONE;
        }
        sectionItem5.insertAnimationType = insertAnimationType;
        StaggeredGridSectionItem sectionItem6 = getSectionItem();
        AnimationType deleteAnimationType = waterfallSectionInfo.getDeleteAnimationType();
        if (deleteAnimationType == null) {
            deleteAnimationType = AnimationType.NONE;
        }
        sectionItem6.deleteAnimationType = deleteAnimationType;
    }
}
