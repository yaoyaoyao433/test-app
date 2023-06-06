package com.dianping.shield.dynamic.diff.cell;

import android.content.Context;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.scroll.ScrollView;
import com.dianping.picassomodule.widget.scroll.e;
import com.dianping.picassomodule.widget.scroll.pager.b;
import com.dianping.picassomodule.widget.scroll.pager.c;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.extensions.scroll.ScrollRowItem;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.BaseScrollableRowInfoDiffCustom;
import com.dianping.shield.dynamic.diff.ScrollEventDiff;
import com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff;
import com.dianping.shield.dynamic.diff.view.ScrollCellAttachViewDiff;
import com.dianping.shield.dynamic.diff.view.ViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.ScrollCellInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00162\u0006\u0010\u0018\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010\u0018\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0016J2\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00032\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#H\u0002JI\u0010$\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\b\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0016J \u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0002J\b\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0002H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00103\u001a\u00020\u0002H\u0002J\u0010\u00106\u001a\u0002052\u0006\u00103\u001a\u00020\u0002H\u0002J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\"\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010>\u001a\u000205H\u0002J\u0010\u0010?\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0002H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006@"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/ScrollCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/BaseScrollableRowInfoDiffCustom;", "Lcom/dianping/shield/dynamic/model/cell/ScrollCellInfo;", "Lcom/dianping/shield/component/extensions/scroll/ScrollRowItem;", "Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computingBgItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "computingMaskItem", "computingNormalItem", "computingTriggerItem", "viewSuggestWidth", "", "Ljava/lang/Integer;", "bindItems", "", "computingItem", "calculateRecommendWidth", "newInfo", "createAttachItem", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", DMKeys.KEY_VIEW_INFO, "createBgMaskItem", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "createChildItem", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "createComputingItem", "diffAttachView", "scrollCellAttachViewInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "diffChildren", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/ScrollCellInfo;Lcom/dianping/shield/component/extensions/scroll/ScrollRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getPageCount", "totalCount", DMKeys.KEY_ROWCOUNT, DMKeys.KEY_COLCOUNT, "getRecyclerViewWidth", "getScrollMode", "Lcom/dianping/picassomodule/widget/scroll/ScrollStyleHelper$ScrollStyle;", "info", "isGalleryMode", "", "isLoopMode", "mappingTriggerViewFun", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "id", "", "needTriggerViewItem", "setAttachViewTriggered", "viewItem", "isTriggered", "updateProps", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollCellInfoDiff extends BaseScrollableRowInfoDiffCustom<ScrollCellInfo, ScrollRowItem> implements ScrollEventDiff {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewItem computingBgItem;
    private ViewItem computingMaskItem;
    private ViewItem computingNormalItem;
    private ViewItem computingTriggerItem;
    private Integer viewSuggestWidth;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[DMConstant.DynamicModuleViewType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DMConstant.DynamicModuleViewType.PicassoVCImportedView.ordinal()] = 1;
            $EnumSwitchMapping$0[DMConstant.DynamicModuleViewType.MRNView.ordinal()] = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "853a8ecb3a5d7c01848cbe438ed8e3f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "853a8ecb3a5d7c01848cbe438ed8e3f3");
        }
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    @Nullable
    public final ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {scrollEvent, iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88b71bb58e87dba651a3093ac1d4e38e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentScrollEventHelper.IEventDispatcherProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88b71bb58e87dba651a3093ac1d4e38e");
        }
        h.b(scrollEvent, "scrollEvent");
        return ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(this, scrollEvent, iEventDispatcherProvider);
    }

    @Override // com.dianping.shield.dynamic.diff.BaseScrollableRowInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((ScrollCellInfo) diffableInfo, (ScrollRowItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.BaseScrollableRowInfoDiffCustom
    public final /* bridge */ /* synthetic */ void diffChildren(ScrollCellInfo scrollCellInfo, ScrollRowItem scrollRowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2(scrollCellInfo, scrollRowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.BaseScrollableRowInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(CellInfo.BaseCellInfo baseCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren2((ScrollCellInfo) baseCellInfo, (ScrollRowItem) rowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    public final void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem) {
        Object[] objArr = {scrollEvent, baseScrollableRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a714d4b7b41809c8757ed7033bfeb92e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a714d4b7b41809c8757ed7033bfeb92e");
            return;
        }
        h.b(scrollEvent, "scrollEvent");
        h.b(baseScrollableRowItem, "baseScrollableRowItem");
        ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(this, scrollEvent, baseScrollableRowItem);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final ScrollRowItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66334ecf7f33e1c57e482cd100022653", RobustBitConfig.DEFAULT_VALUE) ? (ScrollRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66334ecf7f33e1c57e482cd100022653") : new ScrollRowItem();
    }

    /* renamed from: diffChildren  reason: avoid collision after fix types in other method */
    public final void diffChildren2(@NotNull final ScrollCellInfo scrollCellInfo, @NotNull ScrollRowItem scrollRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        ExtraReusableViewInfo value;
        ExtraReusableViewInfo value2;
        Object[] objArr = {scrollCellInfo, scrollRowItem, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8ea4a802f59a978f08b0aea88a2e413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8ea4a802f59a978f08b0aea88a2e413");
            return;
        }
        h.b(scrollCellInfo, "newInfo");
        h.b(scrollRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((ScrollCellInfoDiff) scrollCellInfo, (ScrollCellInfo) scrollRowItem, arrayList, num, num2);
        setAutoContentMargin(scrollCellInfo.getAutoContentMargin());
        setContentMarginInfo(scrollCellInfo.getContentMarginInfo());
        calculateRecommendWidth(scrollCellInfo);
        ExtraViewUnionType.ExtraViewInfo backgroundView = scrollCellInfo.getBackgroundView();
        if (backgroundView != null) {
            ExtraViewUnionType.ExtraViewInfo extraViewInfo = backgroundView;
            if (extraViewInfo instanceof ExtraViewUnionType.ExtraReusableViewInfo) {
                value2 = ((ExtraViewUnionType.ExtraReusableViewInfo) extraViewInfo).getValue();
            } else if (!(extraViewInfo instanceof ExtraViewUnionType.ExtraViewInfo)) {
                throw new j();
            } else {
                value2 = extraViewInfo.getValue();
            }
            diffBgViewItem(value2, scrollRowItem, arrayList, new ScrollCellInfoDiff$diffChildren$1$1(this), Integer.valueOf(getRecyclerViewWidth()), null);
        }
        this.computingBgItem = scrollRowItem.getBackgroundViewItem();
        ExtraViewUnionType.ExtraViewInfo maskView = scrollCellInfo.getMaskView();
        if (maskView != null) {
            ExtraViewUnionType.ExtraViewInfo extraViewInfo2 = maskView;
            if (extraViewInfo2 instanceof ExtraViewUnionType.ExtraReusableViewInfo) {
                value = ((ExtraViewUnionType.ExtraReusableViewInfo) extraViewInfo2).getValue();
            } else if (!(extraViewInfo2 instanceof ExtraViewUnionType.ExtraViewInfo)) {
                throw new j();
            } else {
                value = extraViewInfo2.getValue();
            }
            diffMaskViewItem(value, scrollRowItem, arrayList, new ScrollCellInfoDiff$diffChildren$2$1(this), Integer.valueOf(getRecyclerViewWidth()), null);
        }
        this.computingMaskItem = scrollRowItem.getMaskViewItem();
        diffAttachView(scrollCellInfo.getAttachView(), scrollRowItem, arrayList);
        this.computingNormalItem = scrollRowItem.normalAttachView;
        this.computingTriggerItem = scrollRowItem.triggeredAttachView;
        diffViewInfos(scrollCellInfo.getChildren(), scrollRowItem, arrayList, new ScrollCellInfoDiff$diffChildren$3(this), this.viewSuggestWidth, null);
        ArrayList<ViewItem> arrayList2 = scrollRowItem.viewItems;
        ViewItem viewItem = arrayList2 != null ? (ViewItem) kotlin.collections.h.f(arrayList2) : null;
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
        if (dynamicViewItem != null) {
            dynamicViewItem.setComputingViewInputListener(new ComputeViewInputListener() { // from class: com.dianping.shield.dynamic.diff.cell.ScrollCellInfoDiff$diffChildren$4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.dynamic.protocols.ComputeViewInputListener
                public final void onComputeViewInputSuccess(@NotNull DynamicModuleViewItemData dynamicModuleViewItemData) {
                    ViewItem viewItem2;
                    ViewItem viewItem3;
                    ViewItem viewItem4;
                    ViewItem viewItem5;
                    Object[] objArr2 = {dynamicModuleViewItemData};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06397280190da0c9338ae0d6a31e7de7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06397280190da0c9338ae0d6a31e7de7");
                        return;
                    }
                    h.b(dynamicModuleViewItemData, AdvanceSetting.NETWORK_TYPE);
                    Integer rowCount = scrollCellInfo.getRowCount();
                    int intValue = rowCount != null ? rowCount.intValue() : 1;
                    Integer yGap = scrollCellInfo.getYGap();
                    int intValue2 = yGap != null ? yGap.intValue() : 0;
                    DynamicModuleViewData dynamicModuleViewData = dynamicModuleViewItemData.viewData;
                    h.a((Object) dynamicModuleViewData, "it.viewData");
                    int inputHeight = (dynamicModuleViewData.getInputHeight() * intValue) + (intValue2 * Math.max(intValue - 1, 0)) + ScrollCellInfoDiff.this.getVerticalMargin() + ScrollCellInfoDiff.this.getVerticalContentMargin();
                    viewItem2 = ScrollCellInfoDiff.this.computingNormalItem;
                    if (!(viewItem2 instanceof DynamicViewItem)) {
                        viewItem2 = null;
                    }
                    DynamicViewItem dynamicViewItem2 = (DynamicViewItem) viewItem2;
                    if (dynamicViewItem2 != null) {
                        DynamicModuleViewData dynamicModuleViewData2 = dynamicModuleViewItemData.viewData;
                        h.a((Object) dynamicModuleViewData2, "it.viewData");
                        dynamicViewItem2.setComputingSuggestHeight(Integer.valueOf(dynamicModuleViewData2.getInputHeight()));
                    }
                    viewItem3 = ScrollCellInfoDiff.this.computingTriggerItem;
                    if (!(viewItem3 instanceof DynamicViewItem)) {
                        viewItem3 = null;
                    }
                    DynamicViewItem dynamicViewItem3 = (DynamicViewItem) viewItem3;
                    if (dynamicViewItem3 != null) {
                        DynamicModuleViewData dynamicModuleViewData3 = dynamicModuleViewItemData.viewData;
                        h.a((Object) dynamicModuleViewData3, "it.viewData");
                        dynamicViewItem3.setComputingSuggestHeight(Integer.valueOf(dynamicModuleViewData3.getInputHeight()));
                    }
                    viewItem4 = ScrollCellInfoDiff.this.computingBgItem;
                    if (!(viewItem4 instanceof DynamicViewItem)) {
                        viewItem4 = null;
                    }
                    DynamicViewItem dynamicViewItem4 = (DynamicViewItem) viewItem4;
                    if (dynamicViewItem4 != null) {
                        dynamicViewItem4.setComputingSuggestHeight(Integer.valueOf(inputHeight));
                    }
                    viewItem5 = ScrollCellInfoDiff.this.computingMaskItem;
                    if (!(viewItem5 instanceof DynamicViewItem)) {
                        viewItem5 = null;
                    }
                    DynamicViewItem dynamicViewItem5 = (DynamicViewItem) viewItem5;
                    if (dynamicViewItem5 != null) {
                        dynamicViewItem5.setComputingSuggestHeight(Integer.valueOf(inputHeight));
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable ScrollRowItem scrollRowItem) {
        Object[] objArr = {scrollRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4455ba33d74880def2d0b768189e9c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4455ba33d74880def2d0b768189e9c43");
            return;
        }
        super.bindItems((ScrollCellInfoDiff) scrollRowItem);
        if (scrollRowItem != null) {
            ViewItem viewItem = scrollRowItem.normalAttachView;
            if (viewItem != null && (viewItem instanceof DynamicViewItem)) {
                ((DynamicViewItem) viewItem).onComputingComplete();
                ((ScrollRowItem) getDynamicRowItem()).normalAttachView = viewItem;
            }
            ViewItem viewItem2 = scrollRowItem.triggeredAttachView;
            if (viewItem2 == null || !(viewItem2 instanceof DynamicViewItem)) {
                return;
            }
            ((DynamicViewItem) viewItem2).onComputingComplete();
            ((ScrollRowItem) getDynamicRowItem()).triggeredAttachView = viewItem2;
        }
    }

    @Override // com.dianping.shield.dynamic.diff.BaseScrollableRowInfoDiffCustom, com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final void updateProps(@NotNull final ScrollCellInfo scrollCellInfo) {
        Integer xGap;
        Integer yGap;
        Integer galleryGap;
        DynamicModuleViewData dynamicModuleViewData;
        boolean z = true;
        Object[] objArr = {scrollCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dfa76b8feeb8cd00f0f25afb70df954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dfa76b8feeb8cd00f0f25afb70df954");
            return;
        }
        h.b(scrollCellInfo, "info");
        ScrollCellInfo scrollCellInfo2 = scrollCellInfo;
        super.updateProps((ScrollCellInfoDiff) scrollCellInfo2);
        ((ScrollRowItem) getDynamicRowItem()).scrollMode = getScrollMode(scrollCellInfo);
        updateExposeProps(scrollCellInfo2, scrollCellInfo, null);
        setScrollEventDispatcher(scrollCellInfo, (BaseScrollableRowItem) getDynamicRowItem());
        ScrollRowItem scrollRowItem = (ScrollRowItem) getDynamicRowItem();
        scrollRowItem.marginTop = getTopMargin();
        scrollRowItem.marginRight = getRightMargin();
        scrollRowItem.marginBottom = getBottomMargin();
        scrollRowItem.marginLeft = getLeftMargin();
        scrollRowItem.extraMarginTop = getTopContentMargin();
        scrollRowItem.extraMarginRight = getRightContentMargin();
        scrollRowItem.extraMarginBottom = getBottomContentMargin();
        scrollRowItem.extraMarginLeft = getLeftContentMargin();
        scrollRowItem.xGap = scrollCellInfo.getXGap() != null ? xGap.intValue() : 0.0f;
        scrollRowItem.yGap = scrollCellInfo.getYGap() != null ? yGap.intValue() : 0.0f;
        Integer attachTriggerDistance = scrollCellInfo.getAttachTriggerDistance();
        scrollRowItem.attachTriggerDistance = attachTriggerDistance != null ? attachTriggerDistance.intValue() : -1;
        Boolean scrollEnabled = scrollCellInfo.getScrollEnabled();
        scrollRowItem.scrollEnabled = scrollEnabled != null ? scrollEnabled.booleanValue() : true;
        Integer pageIndex = scrollCellInfo.getPageIndex();
        scrollRowItem.pageIndex = pageIndex != null ? pageIndex.intValue() : -1;
        scrollRowItem.isLoop = isLoopMode(scrollCellInfo);
        Integer scrollDirection = scrollCellInfo.getScrollDirection();
        scrollRowItem.isVertical = scrollDirection != null && scrollDirection.intValue() == DMConstant.ScrollDirection.Vertical.ordinal();
        scrollRowItem.isGallery = isGalleryMode(scrollCellInfo);
        scrollRowItem.galleryGap = scrollCellInfo.getGalleryGap() != null ? galleryGap.intValue() : 0.0f;
        Integer rowCount = scrollCellInfo.getRowCount();
        scrollRowItem.rowCount = rowCount != null ? rowCount.intValue() : 1;
        Integer colCount = scrollCellInfo.getColCount();
        scrollRowItem.colCount = colCount != null ? colCount.intValue() : 1;
        Integer autoLoopInterval = scrollCellInfo.getAutoLoopInterval();
        scrollRowItem.autoLoopInterval = autoLoopInterval != null ? autoLoopInterval.intValue() : 0;
        Boolean enableAdaptiveCellHeight = scrollCellInfo.getEnableAdaptiveCellHeight();
        scrollRowItem.autoHeight = enableAdaptiveCellHeight != null ? enableAdaptiveCellHeight.booleanValue() : false;
        ArrayList<ViewItem> arrayList = scrollRowItem.viewItems;
        if (arrayList != null) {
            ((ScrollRowItem) getDynamicRowItem()).heightList.clear();
            int verticalMargin = getVerticalMargin() + getVerticalContentMargin();
            for (ViewItem viewItem : arrayList) {
                List<Integer> list = ((ScrollRowItem) getDynamicRowItem()).heightList;
                Context hostContext = getHostChassis().getHostContext();
                Object obj = viewItem.data;
                if (!(obj instanceof DynamicModuleViewItemData)) {
                    obj = null;
                }
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                list.add(Integer.valueOf(aq.a(hostContext, ((dynamicModuleViewItemData == null || (dynamicModuleViewData = dynamicModuleViewItemData.viewData) == null) ? 0 : dynamicModuleViewData.getInputHeight()) + verticalMargin)));
            }
        }
        final String onAttachTriggered = scrollCellInfo.getOnAttachTriggered();
        ScrollCellAttachViewInfo attachView = scrollCellInfo.getAttachView();
        String onAttachStatusChanged = attachView != null ? attachView.getOnAttachStatusChanged() : null;
        if (!(onAttachStatusChanged == null || g.a((CharSequence) onAttachStatusChanged))) {
            ((ScrollRowItem) getDynamicRowItem()).attachedStatusChangedListener = new ScrollView.c() { // from class: com.dianping.shield.dynamic.diff.cell.ScrollCellInfoDiff$updateProps$2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picassomodule.widget.scroll.ScrollView.c
                public final void attachedStatusChanged(boolean z2) {
                    String onAttachStatusChanged2;
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42d82a63cf39981252ff43f07b3bfcd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42d82a63cf39981252ff43f07b3bfcd5");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("triggered", z2);
                    } catch (JSONException unused) {
                    }
                    ScrollCellAttachViewInfo attachView2 = scrollCellInfo.getAttachView();
                    if (attachView2 == null || (onAttachStatusChanged2 = attachView2.getOnAttachStatusChanged()) == null) {
                        return;
                    }
                    DynamicChassisInterface hostChassis = ScrollCellInfoDiff.this.getHostChassis();
                    if (!(hostChassis instanceof ICommonHost)) {
                        hostChassis = null;
                    }
                    ICommonHost iCommonHost = (ICommonHost) hostChassis;
                    if (iCommonHost != null) {
                        iCommonHost.callMethod(onAttachStatusChanged2, jSONObject);
                    }
                }
            };
        }
        String str = onAttachTriggered;
        if (!(str == null || g.a((CharSequence) str))) {
            ((ScrollRowItem) getDynamicRowItem()).onFooterActionListener = new ScrollView.d() { // from class: com.dianping.shield.dynamic.diff.cell.ScrollCellInfoDiff$updateProps$3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picassomodule.widget.scroll.ScrollView.d
                public final void footerAction() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4fcbc98f19c066196e2632815b9ffa10", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4fcbc98f19c066196e2632815b9ffa10");
                        return;
                    }
                    String str2 = onAttachTriggered;
                    if (str2 == null || str2.length() == 0) {
                        return;
                    }
                    DynamicChassisInterface hostChassis = ScrollCellInfoDiff.this.getHostChassis();
                    if (!(hostChassis instanceof ICommonHost)) {
                        hostChassis = null;
                    }
                    ICommonHost iCommonHost = (ICommonHost) hostChassis;
                    if (iCommonHost != null) {
                        iCommonHost.callMethod(onAttachTriggered, new JSONObject());
                    }
                }
            };
        }
        final String onPageChanged = scrollCellInfo.getOnPageChanged();
        String str2 = onPageChanged;
        if (str2 != null && !g.a((CharSequence) str2)) {
            z = false;
        }
        if (z) {
            return;
        }
        ((ScrollRowItem) getDynamicRowItem()).onPageSelectedListener = new b() { // from class: com.dianping.shield.dynamic.diff.cell.ScrollCellInfoDiff$updateProps$4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picassomodule.widget.scroll.pager.b
            public final void onPageSelected(int i, @NotNull c cVar) {
                int pageCount;
                Object[] objArr2 = {Integer.valueOf(i), cVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9744fb3db652a516149ad90d01ed2080", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9744fb3db652a516149ad90d01ed2080");
                    return;
                }
                h.b(cVar, "reason");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("current", i);
                    ScrollCellInfoDiff scrollCellInfoDiff = ScrollCellInfoDiff.this;
                    ArrayList<ViewItem> arrayList2 = ((ScrollRowItem) ScrollCellInfoDiff.this.getDynamicRowItem()).viewItems;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    Integer rowCount2 = scrollCellInfo.getRowCount();
                    int intValue = rowCount2 != null ? rowCount2.intValue() : 1;
                    Integer colCount2 = scrollCellInfo.getColCount();
                    pageCount = scrollCellInfoDiff.getPageCount(size, intValue, colCount2 != null ? colCount2.intValue() : 1);
                    jSONObject.put("total", pageCount);
                    jSONObject.put("reason", cVar.ordinal());
                } catch (JSONException unused) {
                }
                DynamicChassisInterface hostChassis = ScrollCellInfoDiff.this.getHostChassis();
                if (!(hostChassis instanceof ICommonHost)) {
                    hostChassis = null;
                }
                ICommonHost iCommonHost = (ICommonHost) hostChassis;
                if (iCommonHost != null) {
                    iCommonHost.callMethod(onPageChanged, jSONObject);
                }
            }
        };
    }

    private final e.a getScrollMode(ScrollCellInfo scrollCellInfo) {
        Integer scrollStyle;
        Object[] objArr = {scrollCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "438f22ad6881866e8c329e7c6bda56d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "438f22ad6881866e8c329e7c6bda56d4");
        }
        if (scrollCellInfo.getScrollStyle() == null || ((scrollStyle = scrollCellInfo.getScrollStyle()) != null && scrollStyle.intValue() == 0)) {
            return e.a.NORMAL;
        }
        return e.a.PAGE;
    }

    private final boolean isLoopMode(ScrollCellInfo scrollCellInfo) {
        Object[] objArr = {scrollCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "332247d3f96271850c800f5decdbf4a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "332247d3f96271850c800f5decdbf4a4")).booleanValue();
        }
        Integer scrollStyle = scrollCellInfo.getScrollStyle();
        if (scrollStyle != null) {
            int intValue = scrollStyle.intValue();
            return intValue == DMConstant.ScrollStyle.LoopPage.ordinal() || intValue == DMConstant.ScrollStyle.GalleryLoopPage.ordinal();
        }
        return false;
    }

    private final boolean isGalleryMode(ScrollCellInfo scrollCellInfo) {
        Object[] objArr = {scrollCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4bcd8465bc7078e31b5b4f93e908cca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4bcd8465bc7078e31b5b4f93e908cca")).booleanValue();
        }
        Integer scrollStyle = scrollCellInfo.getScrollStyle();
        if (scrollStyle != null) {
            int intValue = scrollStyle.intValue();
            return intValue == DMConstant.ScrollStyle.GalleryPage.ordinal() || intValue == DMConstant.ScrollStyle.GalleryLoopPage.ordinal();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPageCount(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "838996dd018ca29dbe90019ba7ce6cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "838996dd018ca29dbe90019ba7ce6cd9")).intValue();
        }
        int i4 = i2 * i3;
        if (i % i4 == 0) {
            return i / i4;
        }
        return (i / i4) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicViewItem<ViewInfo> createChildItem(ViewInfo viewInfo) {
        Object[] objArr = {viewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "489e8bd719410eea85a64b6a38db66ef", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "489e8bd719410eea85a64b6a38db66ef") : new DynamicViewItem<>(new ViewInfoDiff(getHostChassis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicViewItem<ExtraViewInfo> createBgMaskItem(ExtraViewInfo extraViewInfo) {
        Object[] objArr = {extraViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b03dd5243dbd1b8a074c978fc7efaf62", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b03dd5243dbd1b8a074c978fc7efaf62") : new DynamicViewItem<>(new ExtraViewInfoDiff(getHostChassis(), null, 2, null));
    }

    private final DynamicViewItem<ScrollCellAttachViewInfo> createAttachItem(ScrollCellAttachViewInfo scrollCellAttachViewInfo) {
        Object[] objArr = {scrollCellAttachViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76f3cbca4c9ebac5f648adb1840b8b45", RobustBitConfig.DEFAULT_VALUE) ? (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76f3cbca4c9ebac5f648adb1840b8b45") : new DynamicViewItem<>(new ScrollCellAttachViewDiff(getHostChassis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (r2 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void diffAttachView(com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo r13, com.dianping.shield.component.extensions.scroll.ScrollRowItem r14, java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.ScrollCellInfoDiff.diffAttachView(com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo, com.dianping.shield.component.extensions.scroll.ScrollRowItem, java.util.ArrayList):void");
    }

    private final void setAttachViewTriggered(ViewItem viewItem, ScrollCellAttachViewInfo scrollCellAttachViewInfo, boolean z) {
        BaseViewInfoDiff viewDiffProxy;
        DynamicModuleViewItemData computingViewItemData;
        JSONObject jSONObject;
        Object[] objArr = {viewItem, scrollCellAttachViewInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "750b199326e06a192a9788e09fde137d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "750b199326e06a192a9788e09fde137d");
            return;
        }
        JSONObject context = scrollCellAttachViewInfo.getContext();
        try {
            if (context == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(context.toString());
            }
            context = jSONObject;
            context.put("triggered", z);
            context.put("subViewWidth", this.viewSuggestWidth);
        } catch (JSONException unused) {
        }
        if (!(viewItem instanceof DynamicViewItem)) {
            viewItem = null;
        }
        DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
        if (dynamicViewItem == null || (viewDiffProxy = dynamicViewItem.getViewDiffProxy()) == null || (computingViewItemData = viewDiffProxy.getComputingViewItemData()) == null) {
            return;
        }
        computingViewItemData.jsContextInject = context;
    }

    private final boolean needTriggerViewItem(ScrollCellAttachViewInfo scrollCellAttachViewInfo) {
        Object[] objArr = {scrollCellAttachViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706f2a6b1f0e11ba081cc67f5bb8b0a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706f2a6b1f0e11ba081cc67f5bb8b0a9")).booleanValue();
        }
        DMConstant.DynamicModuleViewType[] valuesCustom = DMConstant.DynamicModuleViewType.valuesCustom();
        Integer viewType = scrollCellAttachViewInfo.getViewType();
        switch (WhenMappings.$EnumSwitchMapping$0[valuesCustom[viewType != null ? viewType.intValue() : 3].ordinal()]) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }

    private final void calculateRecommendWidth(ScrollCellInfo scrollCellInfo) {
        Object[] objArr = {scrollCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "389ea6d9b509d185a1933bb387bc7a82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "389ea6d9b509d185a1933bb387bc7a82");
            return;
        }
        Integer xGap = scrollCellInfo.getXGap();
        int intValue = xGap != null ? xGap.intValue() : 0;
        Integer colCount = scrollCellInfo.getColCount();
        int intValue2 = colCount != null ? colCount.intValue() : 1;
        if (intValue2 <= 0) {
            intValue2 = 1;
        }
        this.viewSuggestWidth = Integer.valueOf((getRecyclerViewWidth() - ((getHorizontalMargin() + getHorizontalContentMargin()) + ((intValue2 - 1) * intValue))) / intValue2);
    }

    private final int getRecyclerViewWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "883924ece9b3b654fcb479995413cfa1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "883924ece9b3b654fcb479995413cfa1")).intValue() : aq.b(getHostChassis().getHostContext(), DMViewUtils.getRecyclerWidth(getHostChassis()));
    }

    private final DynamicDiff<ScrollCellAttachViewInfo> mappingTriggerViewFun(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c38ac7a0e2ba49a11cd5c408010b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c38ac7a0e2ba49a11cd5c408010b2c");
        }
        ViewItem viewItem = ((ScrollRowItem) getDynamicRowItem()).normalAttachView;
        if (!(viewItem instanceof DynamicDiff)) {
            viewItem = null;
        }
        DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
        if (h.a((Object) charSequence, (Object) (dynamicDiff != null ? dynamicDiff.getId() : null))) {
            ViewItem viewItem2 = ((ScrollRowItem) getDynamicRowItem()).normalAttachView;
            if (!(viewItem2 instanceof DynamicDiff)) {
                viewItem2 = null;
            }
            return (DynamicDiff) viewItem2;
        }
        ViewItem viewItem3 = ((ScrollRowItem) getDynamicRowItem()).triggeredAttachView;
        if (!(viewItem3 instanceof DynamicDiff)) {
            viewItem3 = null;
        }
        DynamicDiff dynamicDiff2 = (DynamicDiff) viewItem3;
        if (h.a((Object) charSequence, (Object) (dynamicDiff2 != null ? dynamicDiff2.getId() : null))) {
            ViewItem viewItem4 = ((ScrollRowItem) getDynamicRowItem()).triggeredAttachView;
            if (!(viewItem4 instanceof DynamicDiff)) {
                viewItem4 = null;
            }
            return (DynamicDiff) viewItem4;
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "380ca8526bcba2306e9c7072c637c723", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "380ca8526bcba2306e9c7072c637c723");
        }
        h.b(str, "identifier");
        IDynamicModuleViewItem findPicassoViewItemByIdentifier = super.findPicassoViewItemByIdentifier(str);
        if (findPicassoViewItemByIdentifier == null) {
            ViewItem viewItem = ((ScrollRowItem) getDynamicRowItem()).normalAttachView;
            if (!(viewItem instanceof DynamicViewItemsHolderInterface)) {
                viewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) viewItem;
            findPicassoViewItemByIdentifier = dynamicViewItemsHolderInterface != null ? dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str) : null;
        }
        if (findPicassoViewItemByIdentifier == null) {
            ViewItem viewItem2 = ((ScrollRowItem) getDynamicRowItem()).triggeredAttachView;
            if (!(viewItem2 instanceof DynamicViewItemsHolderInterface)) {
                viewItem2 = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface2 = (DynamicViewItemsHolderInterface) viewItem2;
            if (dynamicViewItemsHolderInterface2 != null) {
                return dynamicViewItemsHolderInterface2.findPicassoViewItemByIdentifier(str);
            }
            return null;
        }
        return findPicassoViewItemByIdentifier;
    }
}
