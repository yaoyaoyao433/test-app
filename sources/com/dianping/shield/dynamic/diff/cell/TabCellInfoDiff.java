package com.dianping.shield.dynamic.diff.cell;

import android.support.v7.widget.RecyclerView;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.widgets.container.IPageContainerFunc;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom;
import com.dianping.shield.dynamic.diff.ScrollEventDiff;
import com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$tabClickCallback$2;
import com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.dynamic.diff.extra.TabCellClickData;
import com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy;
import com.dianping.shield.dynamic.diff.view.TabViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicTabViewItem;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.dianping.shield.dynamic.model.cell.TabCellInfo;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.TabInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.AgentScrollerParams;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.node.adapter.hotzone.CellHotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.functions.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0011\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u00017B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016JI\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00032\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#2\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016J,\u0010+\u001a\u00020\u00172\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020-\u0018\u00010!j\n\u0012\u0004\u0012\u00020-\u0018\u0001`#2\u0006\u0010.\u001a\u00020-H\u0002J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\u0006\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u0002H\u0002J\u0010\u00106\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u0002H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019¨\u00068"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff;", "Lcom/dianping/shield/dynamic/diff/CommonContainerInfoDiffCustom;", "Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/dynamic/diff/extra/TabInfoDiffProxy;", "Lcom/dianping/shield/dynamic/diff/extra/HoverInfoDiffProxy;", "Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computingBgItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "computingMaskItem", "computingSlideBarViewItem", "isAutoOffset", "", "tabClickCallback", "com/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$tabClickCallback$2$1", "getTabClickCallback", "()Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$tabClickCallback$2$1;", "tabClickCallback$delegate", "Lkotlin/Lazy;", "viewSuggestHeight", "", "viewSuggestWidth", "Ljava/lang/Integer;", "bindItems", "", "computingItem", "createComputingItem", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;Lcom/dianping/shield/component/extensions/tabs/TabRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getSelectTab", "targetCellList", "Lcom/dianping/shield/entity/CellInfo;", "cellInfo", "mappingSlideBarViewFuc", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "id", "resetProps", "updateAnchorMap", "info", "updateProps", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabCellInfoDiff extends CommonContainerInfoDiffCustom<TabCellInfo, TabRowItem> implements ScrollEventDiff, HoverInfoDiffProxy, TabInfoDiffProxy {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(TabCellInfoDiff.class), "tabClickCallback", "getTabClickCallback()Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$tabClickCallback$2$1;"))};
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SLIDE_BAR_HEIGHT = 4;
    private static final int DEFAULT_TAB_VIEW_HEIGHT = 45;
    private static final int INITIAL_SELECT_INDEX_NO_EXIST = -1;
    private static final int ROW_FOOTER = -2;
    private static final int ROW_HEADER = -1;
    private static final int SELECT_INDEX_NO_EXIST = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean disableAutoScroll;
    private static RecyclerView.k fixScrollListener;
    private static boolean hasScrollToFirst;
    private ViewItem computingBgItem;
    private ViewItem computingMaskItem;
    private ViewItem computingSlideBarViewItem;
    private boolean isAutoOffset;
    private final d tabClickCallback$delegate;
    private int viewSuggestHeight;
    private Integer viewSuggestWidth;

    private final TabCellInfoDiff$tabClickCallback$2.AnonymousClass1 getTabClickCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (TabCellInfoDiff$tabClickCallback$2.AnonymousClass1) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a73bf743ba45836cbb68c0b5541ced84", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a73bf743ba45836cbb68c0b5541ced84") : this.tabClickCallback$delegate.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff$Companion;", "", "()V", "DEFAULT_SLIDE_BAR_HEIGHT", "", "DEFAULT_TAB_VIEW_HEIGHT", "INITIAL_SELECT_INDEX_NO_EXIST", "ROW_FOOTER", "ROW_HEADER", "SELECT_INDEX_NO_EXIST", "disableAutoScroll", "", "fixScrollListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "hasScrollToFirst", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
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
    public TabCellInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "500d513a0dfc5f936865fe528b11a6c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "500d513a0dfc5f936865fe528b11a6c1");
            return;
        }
        this.viewSuggestHeight = 45;
        this.tabClickCallback$delegate = e.a(new TabCellInfoDiff$tabClickCallback$2(this));
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void bindSlideBarViewItem(@Nullable TabRowItem tabRowItem, @NotNull TabRowItem tabRowItem2) {
        Object[] objArr = {tabRowItem, tabRowItem2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f40f85d77862f7639200a9386aa8c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f40f85d77862f7639200a9386aa8c6f");
            return;
        }
        h.b(tabRowItem2, "currentRowItem");
        TabInfoDiffProxy.DefaultImpls.bindSlideBarViewItem(this, tabRowItem, tabRowItem2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @Nullable
    public final Integer calculateRecommendWidth(@NotNull TabInfo tabInfo, @Nullable Integer num, int i, boolean z) {
        Object[] objArr = {tabInfo, num, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ccf3b5c0afb2746358eef7c08ac9285", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ccf3b5c0afb2746358eef7c08ac9285");
        }
        h.b(tabInfo, "newInfo");
        return TabInfoDiffProxy.DefaultImpls.calculateRecommendWidth(this, tabInfo, num, i, z);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final DynamicViewItem<ExtraViewInfo> createBgMaskItem(@NotNull ExtraViewInfo extraViewInfo) {
        Object[] objArr = {extraViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0513a1e683943d7ebfd2ae6fa77420d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0513a1e683943d7ebfd2ae6fa77420d2");
        }
        h.b(extraViewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createBgMaskItem(this, extraViewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final DynamicDiff<TabViewInfo> createChildItem(@NotNull TabViewInfo tabViewInfo) {
        Object[] objArr = {tabViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb945cd457ec781f861c0a2ef998faf", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb945cd457ec781f861c0a2ef998faf");
        }
        h.b(tabViewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createChildItem(this, tabViewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final TabViewClickCallbackWithData createClickCallBack(@Nullable OnTabClickCallback onTabClickCallback) {
        Object[] objArr = {onTabClickCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62a8e1329b930e5f78f8316ddc2413c3", RobustBitConfig.DEFAULT_VALUE) ? (TabViewClickCallbackWithData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62a8e1329b930e5f78f8316ddc2413c3") : TabInfoDiffProxy.DefaultImpls.createClickCallBack(this, onTabClickCallback);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    @Nullable
    public final ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {scrollEvent, iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a17fcf2467a5ebd2dd2ebed0f937f76", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentScrollEventHelper.IEventDispatcherProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a17fcf2467a5ebd2dd2ebed0f937f76");
        }
        h.b(scrollEvent, "scrollEvent");
        return ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(this, scrollEvent, iEventDispatcherProvider);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final DynamicDiff<ViewInfo> createViewItem(@NotNull ViewInfo viewInfo) {
        Object[] objArr = {viewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241de0c2569b0f93cc1645ab03630cef", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241de0c2569b0f93cc1645ab03630cef");
        }
        h.b(viewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createViewItem(this, viewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final com.dianping.picassomodule.widget.tab.h createViewItemsWithTitle(@NotNull TabInfo tabInfo, @Nullable ArrayList<String> arrayList, int i, int i2) {
        Object[] objArr = {tabInfo, arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf85debb9bd0710f8d12c8d81e414357", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.picassomodule.widget.tab.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf85debb9bd0710f8d12c8d81e414357");
        }
        h.b(tabInfo, "info");
        return TabInfoDiffProxy.DefaultImpls.createViewItemsWithTitle(this, tabInfo, arrayList, i, i2);
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((TabCellInfo) diffableInfo, (TabRowItem) obj, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(CellInfo.BaseCellInfo baseCellInfo, RowItem rowItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((TabCellInfo) baseCellInfo, (TabRowItem) rowItem, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @Nullable
    public final DynamicViewItem<ViewInfo> diffSlideBarViewInfo(@Nullable ViewInfo viewInfo, @NotNull TabRowItem tabRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ViewInfo>> bVar, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {viewInfo, tabRowItem, arrayList, bVar, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efaac915fde213bf187313ba8e83e9ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efaac915fde213bf187313ba8e83e9ab");
        }
        h.b(tabRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        h.b(bVar, "mappingFunc");
        return TabInfoDiffProxy.DefaultImpls.diffSlideBarViewInfo(this, viewInfo, tabRowItem, arrayList, bVar, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void diffTabBgViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c09d09459dcd5054e1c911e4c847d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c09d09459dcd5054e1c911e4c847d1");
            return;
        }
        h.b(commonContainerRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        h.b(bVar, "mappingFunc");
        h.b(bVar2, "createFunc");
        TabInfoDiffProxy.DefaultImpls.diffTabBgViewItem(this, extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void diffTabMaskViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a423f67c39794eba2ea491d3fda1b21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a423f67c39794eba2ea491d3fda1b21");
            return;
        }
        h.b(commonContainerRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        h.b(bVar, "mappingFunc");
        h.b(bVar2, "createFunc");
        TabInfoDiffProxy.DefaultImpls.diffTabMaskViewItem(this, extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public final JSONObject generateCallBackJson(@Nullable NodePath nodePath, @NotNull g gVar) {
        Object[] objArr = {nodePath, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "148cdc3e47cce3bb70ef5a6c40d9a544", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "148cdc3e47cce3bb70ef5a6c40d9a544");
        }
        h.b(gVar, "reason");
        return TabInfoDiffProxy.DefaultImpls.generateCallBackJson(this, nodePath, gVar);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final int getHoverTabOffset(@Nullable TabView tabView, float f) {
        Object[] objArr = {tabView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d855d6ca812ef9a96cb8c6066931ebea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d855d6ca812ef9a96cb8c6066931ebea")).intValue() : TabInfoDiffProxy.DefaultImpls.getHoverTabOffset(this, tabView, f);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final int getScreenWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86f9815e132e2e01a4a78fbc5f5c2df8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86f9815e132e2e01a4a78fbc5f5c2df8")).intValue() : TabInfoDiffProxy.DefaultImpls.getScreenWidth(this);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void handleClick(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull TabCellClickData tabCellClickData, @NotNull JSONObject jSONObject, @Nullable int[] iArr) {
        Object[] objArr = {dynamicChassisInterface, tabCellClickData, jSONObject, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2bf402e70f977453c888cff1631811b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2bf402e70f977453c888cff1631811b");
            return;
        }
        h.b(dynamicChassisInterface, "hostContainer");
        h.b(tabCellClickData, "data");
        h.b(jSONObject, "extraData");
        TabInfoDiffProxy.DefaultImpls.handleClick(this, dynamicChassisInterface, tabCellClickData, jSONObject, iArr);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public final BottomInfo processHoverBottomInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle) {
        Object[] objArr = {hoverInfo, dividerStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42c54a2b802c633e8ed3721e23d333b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (BottomInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42c54a2b802c633e8ed3721e23d333b1");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverBottomInfo(this, hoverInfo, dividerStyle);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public final TopInfo processHoverTopInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle, @Nullable TopInfo.OnTopStateChangeListener onTopStateChangeListener) {
        Object[] objArr = {hoverInfo, dividerStyle, onTopStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6871c4177328baa0867b2cb649534ab3", RobustBitConfig.DEFAULT_VALUE)) {
            return (TopInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6871c4177328baa0867b2cb649534ab3");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverTopInfo(this, hoverInfo, dividerStyle, onTopStateChangeListener);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    public final void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem) {
        Object[] objArr = {scrollEvent, baseScrollableRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "088d33fb237e08c6fd9d7d4357ac3618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "088d33fb237e08c6fd9d7d4357ac3618");
            return;
        }
        h.b(scrollEvent, "scrollEvent");
        h.b(baseScrollableRowItem, "baseScrollableRowItem");
        ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(this, scrollEvent, baseScrollableRowItem);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void tabSelectCallback(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
        Object[] objArr = {obj, nodePath, gVar, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7dd0a16867248cde401ffd2bb73afb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7dd0a16867248cde401ffd2bb73afb8");
            return;
        }
        h.b(gVar, "reason");
        TabInfoDiffProxy.DefaultImpls.tabSelectCallback(this, obj, nodePath, gVar, iArr);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void updateDataIndex(@Nullable TabRowItem tabRowItem) {
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7789471f0e9ffc2c390a697231d57c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7789471f0e9ffc2c390a697231d57c8a");
        } else {
            TabInfoDiffProxy.DefaultImpls.updateDataIndex(this, tabRowItem);
        }
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void updateTabDivider(@NotNull TabRowItem tabRowItem, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Object[] objArr = {tabRowItem, bool, bool2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e62f364f160761d8bfd78fe688b1df17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e62f364f160761d8bfd78fe688b1df17");
            return;
        }
        h.b(tabRowItem, "tabRowItem");
        TabInfoDiffProxy.DefaultImpls.updateTabDivider(this, tabRowItem, bool, bool2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public final void updateTabInfo(@NotNull TabInfo tabInfo, @NotNull TabRowItem tabRowItem) {
        Object[] objArr = {tabInfo, tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d638fafb25c7610c224883ca364c9788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d638fafb25c7610c224883ca364c9788");
            return;
        }
        h.b(tabInfo, "info");
        h.b(tabRowItem, "dynamicRowItem");
        TabInfoDiffProxy.DefaultImpls.updateTabInfo(this, tabInfo, tabRowItem);
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    @NotNull
    public final TabRowItem createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da66518bdd7cc865415a7c1da719f58", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da66518bdd7cc865415a7c1da719f58");
        }
        fixScrollListener = new RecyclerView.k() { // from class: com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$createComputingItem$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(@Nullable RecyclerView recyclerView, int i) {
                boolean z;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88718dc789257b3b55eedc1c759c50ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88718dc789257b3b55eedc1c759c50ca");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    TabCellInfoDiff.disableAutoScroll = false;
                    TabCellInfoDiff.hasScrollToFirst = false;
                    return;
                }
                z = TabCellInfoDiff.hasScrollToFirst;
                TabCellInfoDiff.disableAutoScroll = z;
            }
        };
        return new TabRowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01be, code lost:
        if (r4 == null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void diffChildren(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.cell.TabCellInfo r18, @org.jetbrains.annotations.NotNull com.dianping.shield.component.extensions.tabs.TabRowItem r19, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r20, @org.jetbrains.annotations.Nullable java.lang.Integer r21, @org.jetbrains.annotations.Nullable java.lang.Integer r22) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff.diffChildren(com.dianping.shield.dynamic.model.cell.TabCellInfo, com.dianping.shield.component.extensions.tabs.TabRowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void bindItems(@Nullable TabRowItem tabRowItem) {
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36645579edb5de82abdf67a401e50d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36645579edb5de82abdf67a401e50d01");
            return;
        }
        super.bindItems((TabCellInfoDiff) tabRowItem);
        updateDataIndex(tabRowItem);
        bindSlideBarViewItem(tabRowItem, (TabRowItem) getDynamicRowItem());
    }

    @Override // com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final void resetProps() {
        TabCellInfo tabCellInfo;
        Integer selectIndex;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0d6e447c8373980d6bd6188ae4914d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0d6e447c8373980d6bd6188ae4914d8");
            return;
        }
        super.resetProps();
        int i = ((TabRowItem) getDynamicRowItem()).selectIndex;
        TabCellInfo tabCellInfo2 = (TabCellInfo) getComputingInfo();
        Integer selectIndex2 = tabCellInfo2 != null ? tabCellInfo2.getSelectIndex() : null;
        if ((selectIndex2 == null || i != selectIndex2.intValue()) && (tabCellInfo = (TabCellInfo) getComputingInfo()) != null && (selectIndex = tabCellInfo.getSelectIndex()) != null) {
            int intValue = selectIndex.intValue();
            if (intValue != -1) {
                ((TabRowItem) getDynamicRowItem()).lastSelectedIndex = intValue;
            }
            ((TabRowItem) getDynamicRowItem()).selectIndex = intValue;
        }
        disableAutoScroll = false;
        hasScrollToFirst = false;
        this.isAutoOffset = false;
        DynamicChassisInterface hostChassis = getHostChassis();
        if (!(hostChassis instanceof DynamicAgent)) {
            hostChassis = null;
        }
        DynamicAgent dynamicAgent = (DynamicAgent) hostChassis;
        if (dynamicAgent != null) {
            dynamicAgent.setNewTabListener(null);
        }
        DynamicChassisInterface hostChassis2 = getHostChassis();
        if (!(hostChassis2 instanceof DynamicAgent)) {
            hostChassis2 = null;
        }
        DynamicAgent dynamicAgent2 = (DynamicAgent) hostChassis2;
        ab<?> pageContainer = dynamicAgent2 != null ? dynamicAgent2.getPageContainer() : null;
        if (!(pageContainer instanceof IPageContainerFunc)) {
            pageContainer = null;
        }
        IPageContainerFunc iPageContainerFunc = (IPageContainerFunc) pageContainer;
        if (iPageContainerFunc != null) {
            iPageContainerFunc.removeScrollListener(fixScrollListener);
        }
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff
    public final void updateProps(@NotNull TabCellInfo tabCellInfo) {
        int size;
        Object[] objArr = {tabCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a10d7ab21c0f75e9a7599e0cf001e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a10d7ab21c0f75e9a7599e0cf001e94");
            return;
        }
        h.b(tabCellInfo, "info");
        TabCellInfo tabCellInfo2 = tabCellInfo;
        super.updateProps((TabCellInfoDiff) tabCellInfo2);
        TabCellInfo tabCellInfo3 = tabCellInfo;
        ((TabRowItem) getDynamicRowItem()).tabTitleInfo = createViewItemsWithTitle(tabCellInfo3, tabCellInfo.getButtonTitles(), getLeftMargin(), getRightMargin());
        ((TabRowItem) getDynamicRowItem()).viewClickCallBack = createClickCallBack(getTabClickCallback());
        TabCellClickData tabCellClickData = new TabCellClickData();
        tabCellClickData.setClickMgeInfo(tabCellInfo.getClickMgeInfo());
        tabCellClickData.setDidSelectCallback(tabCellInfo.getOnSelect());
        tabCellClickData.setMidasInfo(tabCellInfo.getMidasInfo());
        tabCellClickData.setButtonTitles(tabCellInfo.getButtonTitles());
        ((TabRowItem) getDynamicRowItem()).data = tabCellClickData;
        updateTabInfo(tabCellInfo3, (TabRowItem) getDynamicRowItem());
        updateExposeProps(tabCellInfo2, tabCellInfo, null);
        setScrollEventDispatcher(tabCellInfo, (BaseScrollableRowItem) getDynamicRowItem());
        if (((TabRowItem) getDynamicRowItem()).initialSelectedIndex == -1) {
            TabRowItem tabRowItem = (TabRowItem) getDynamicRowItem();
            Integer initialSelectedIndex = tabCellInfo.getInitialSelectedIndex();
            tabRowItem.initialSelectedIndex = initialSelectedIndex != null ? initialSelectedIndex.intValue() : -1;
        }
        ((TabRowItem) getDynamicRowItem()).marginLeft = getLeftMargin();
        ((TabRowItem) getDynamicRowItem()).marginRight = getRightMargin();
        ((TabRowItem) getDynamicRowItem()).marginBottom = getBottomMargin();
        ((TabRowItem) getDynamicRowItem()).marginTop = getTopMargin();
        ((TabRowItem) getDynamicRowItem()).extraMarginRight = getRightContentMargin();
        ((TabRowItem) getDynamicRowItem()).extraMarginLeft = getLeftContentMargin();
        tabCellInfo.setHoverTop(tabCellInfo.getEnableHover());
        ((TabRowItem) getDynamicRowItem()).topInfo = HoverInfoDiffProxy.DefaultImpls.processHoverTopInfo$default(this, tabCellInfo, ((TabRowItem) getDynamicRowItem()).dividerStyle, null, 4, null);
        Boolean autoOffset = tabCellInfo.getAutoOffset();
        this.isAutoOffset = autoOffset != null ? autoOffset.booleanValue() : false;
        updateAnchorMap(tabCellInfo);
        if (tabCellInfo.getChildren() == null) {
            ArrayList<String> buttonTitles = tabCellInfo.getButtonTitles();
            if (buttonTitles != null) {
                size = buttonTitles.size();
            }
            size = 0;
        } else {
            ArrayList arrayList = ((TabRowItem) getDynamicRowItem()).viewItems;
            if (arrayList != null || (arrayList = tabCellInfo.getButtonTitles()) != null) {
                size = arrayList.size();
            }
            size = 0;
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        ((TabRowItem) getDynamicRowItem()).displayIndexList = arrayList2;
        updateTabDivider((TabRowItem) getDynamicRowItem(), tabCellInfo.getShowTopLine(), tabCellInfo.getShowBottomLine());
    }

    @Override // com.dianping.shield.dynamic.diff.CommonContainerInfoDiffCustom, com.dianping.shield.dynamic.diff.cell.BaseCellInfoDiff, com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9f0ae8ef4f921ca62fb69a4600b7a43", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9f0ae8ef4f921ca62fb69a4600b7a43");
        }
        h.b(str, "identifier");
        IDynamicModuleViewItem findPicassoViewItemByIdentifier = super.findPicassoViewItemByIdentifier(str);
        if (findPicassoViewItemByIdentifier == null) {
            ViewItem viewItem = ((TabRowItem) getDynamicRowItem()).slideBarViewItem;
            if (!(viewItem instanceof DynamicViewItemsHolderInterface)) {
                viewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) viewItem;
            if (dynamicViewItemsHolderInterface != null) {
                return dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str);
            }
            return null;
        }
        return findPicassoViewItemByIdentifier;
    }

    private final void updateAnchorMap(final TabCellInfo tabCellInfo) {
        IndexPath anchorIndexPath;
        CellType cellType;
        Object[] objArr = {tabCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18dd8a3da011465b4afe328c8a28dd95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18dd8a3da011465b4afe328c8a28dd95");
        } else if (getHostChassis() instanceof DynamicAgent) {
            final ArrayList arrayList = new ArrayList();
            ArrayList<? super TabViewInfo> children = tabCellInfo.getChildren();
            if (children != null) {
                int size = children.size();
                for (final int i = 0; i < size; i++) {
                    TabViewInfo tabViewInfo = children.get(i);
                    if (!(tabViewInfo instanceof TabViewInfo)) {
                        tabViewInfo = null;
                    }
                    TabViewInfo tabViewInfo2 = tabViewInfo;
                    if (tabViewInfo2 != null && (anchorIndexPath = tabViewInfo2.getAnchorIndexPath()) != null) {
                        switch (anchorIndexPath.row) {
                            case -2:
                                cellType = CellType.FOOTER;
                                break;
                            case -1:
                                cellType = CellType.HEADER;
                                break;
                            default:
                                cellType = CellType.NORMAL;
                                break;
                        }
                        arrayList.add(new com.dianping.shield.entity.CellInfo(anchorIndexPath.section, anchorIndexPath.row, cellType));
                        ViewItem viewItem = ((TabRowItem) getDynamicRowItem()).viewItems.get(i);
                        if (!(viewItem instanceof DynamicTabViewItem)) {
                            viewItem = null;
                        }
                        DynamicTabViewItem dynamicTabViewItem = (DynamicTabViewItem) viewItem;
                        if (dynamicTabViewItem != null) {
                            dynamicTabViewItem.setAnchorIndexPathClickCallback(new TabViewInfoDiff.AnchorIndexPathClickCallback() { // from class: com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$updateAnchorMap$$inlined$let$lambda$1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.dianping.shield.dynamic.diff.view.TabViewInfoDiff.AnchorIndexPathClickCallback
                                public final void anchorIndexPathClick(@NotNull IndexPath indexPath) {
                                    ShieldGlobalFeatureInterface feature;
                                    boolean z;
                                    Object[] objArr2 = {indexPath};
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9236add4faefed210eac3c40b9581bc7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9236add4faefed210eac3c40b9581bc7");
                                        return;
                                    }
                                    h.b(indexPath, DMKeys.KEY_TAB_ANCHOR_INDEX_PATH);
                                    if (!(this.getHostChassis() instanceof AgentInterface) || (feature = this.getHostChassis().getFeature()) == null) {
                                        return;
                                    }
                                    DynamicChassisInterface hostChassis = this.getHostChassis();
                                    if (hostChassis == null) {
                                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.framework.AgentInterface");
                                    }
                                    AgentScrollerParams row = AgentScrollerParams.toRow((AgentInterface) hostChassis, indexPath.section, indexPath.row);
                                    z = this.isAutoOffset;
                                    AgentScrollerParams needAutoOffset = row.setNeedAutoOffset(z);
                                    TabCellInfoDiff tabCellInfoDiff = this;
                                    IElementContainerExpose containerView = ((TabRowItem) this.getDynamicRowItem()).getContainerView();
                                    if (!(containerView instanceof TabView)) {
                                        containerView = null;
                                    }
                                    TabView tabView = (TabView) containerView;
                                    Float hoverOffset = tabCellInfo.getHoverOffset();
                                    AgentScrollerParams offset = needAutoOffset.setOffset(tabCellInfoDiff.getHoverTabOffset(tabView, hoverOffset != null ? hoverOffset.floatValue() : 0.0f));
                                    h.a((Object) offset, "AgentScrollerParams.toRo…                  ?: 0f))");
                                    feature.scrollToNode(offset);
                                }
                            });
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                DynamicChassisInterface hostChassis = getHostChassis();
                if (!(hostChassis instanceof DynamicAgent)) {
                    hostChassis = null;
                }
                DynamicAgent dynamicAgent = (DynamicAgent) hostChassis;
                if (dynamicAgent != null) {
                    dynamicAgent.setNewTabListener(new HotZoneItemStatusInterface() { // from class: com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff$updateAnchorMap$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.shield.feature.HotZoneItemStatusInterface
                        @NotNull
                        public final HotZoneYRange defineHotZone() {
                            boolean z;
                            int i2 = 0;
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25ccc15cb9cc0250add0caf7df1264ea", RobustBitConfig.DEFAULT_VALUE)) {
                                return (HotZoneYRange) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25ccc15cb9cc0250add0caf7df1264ea");
                            }
                            TabCellInfoDiff tabCellInfoDiff = TabCellInfoDiff.this;
                            IElementContainerExpose containerView = ((TabRowItem) TabCellInfoDiff.this.getDynamicRowItem()).getContainerView();
                            if (!(containerView instanceof TabView)) {
                                containerView = null;
                            }
                            TabView tabView = (TabView) containerView;
                            Float hoverOffset = tabCellInfo.getHoverOffset();
                            int hoverTabOffset = tabCellInfoDiff.getHoverTabOffset(tabView, hoverOffset != null ? hoverOffset.floatValue() : 0.0f);
                            z = TabCellInfoDiff.this.isAutoOffset;
                            if (z) {
                                DynamicChassisInterface hostChassis2 = TabCellInfoDiff.this.getHostChassis();
                                if (!(hostChassis2 instanceof DynamicAgent)) {
                                    hostChassis2 = null;
                                }
                                DynamicAgent dynamicAgent2 = (DynamicAgent) hostChassis2;
                                if ((dynamicAgent2 != null ? dynamicAgent2.getPageContainer() : null) instanceof com.dianping.agentsdk.pagecontainer.e) {
                                    DynamicChassisInterface hostChassis3 = TabCellInfoDiff.this.getHostChassis();
                                    if (!(hostChassis3 instanceof DynamicAgent)) {
                                        hostChassis3 = null;
                                    }
                                    DynamicAgent dynamicAgent3 = (DynamicAgent) hostChassis3;
                                    ab<?> pageContainer = dynamicAgent3 != null ? dynamicAgent3.getPageContainer() : null;
                                    if (pageContainer == null) {
                                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.pagecontainer.SetAutoOffsetInterface");
                                    }
                                    i2 = ((com.dianping.agentsdk.pagecontainer.e) pageContainer).getAutoOffset();
                                    hoverTabOffset += i2;
                                }
                            }
                            return new HotZoneYRange(i2, hoverTabOffset);
                        }

                        @Override // com.dianping.shield.feature.HotZoneItemStatusInterface
                        @Nullable
                        public final ArrayList<com.dianping.shield.entity.CellInfo> targetCells() {
                            return arrayList;
                        }

                        @Override // com.dianping.shield.feature.HotZoneItemStatusInterface
                        public final void onHotZoneLocationChanged(@NotNull ArrayList<CellHotZoneInfo> arrayList2, @NotNull ScrollDirection scrollDirection) {
                            int selectTab;
                            boolean z;
                            Object[] objArr2 = {arrayList2, scrollDirection};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5b74dfcb210f71d220ca440c0b74aa64", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5b74dfcb210f71d220ca440c0b74aa64");
                                return;
                            }
                            h.b(arrayList2, "locationList");
                            h.b(scrollDirection, DMKeys.KEY_SCROLL_DIRECTION);
                            Iterator<CellHotZoneInfo> it = arrayList2.iterator();
                            while (it.hasNext()) {
                                CellHotZoneInfo next = it.next();
                                if (next.hotZoneLocation != HotZoneLocation.US_US && next.hotZoneLocation != HotZoneLocation.BE_BE) {
                                    TabCellInfoDiff tabCellInfoDiff = TabCellInfoDiff.this;
                                    ArrayList arrayList3 = arrayList;
                                    com.dianping.shield.entity.CellInfo cellInfo = next.cellInfo;
                                    h.a((Object) cellInfo, "cellHotZoneInfo.cellInfo");
                                    selectTab = tabCellInfoDiff.getSelectTab(arrayList3, cellInfo);
                                    if (selectTab == ((TabRowItem) TabCellInfoDiff.this.getDynamicRowItem()).lastSelectedIndex || selectTab < 0) {
                                        return;
                                    }
                                    z = TabCellInfoDiff.disableAutoScroll;
                                    if (z) {
                                        return;
                                    }
                                    IElementContainerExpose containerView = ((TabRowItem) TabCellInfoDiff.this.getDynamicRowItem()).getContainerView();
                                    if (!(containerView instanceof TabView)) {
                                        containerView = null;
                                    }
                                    TabView tabView = (TabView) containerView;
                                    if (tabView != null) {
                                        tabView.a(selectTab, g.USER_SCROLL);
                                    }
                                    TabCellInfoDiff.hasScrollToFirst = false;
                                    return;
                                }
                            }
                        }
                    });
                }
                DynamicChassisInterface hostChassis2 = getHostChassis();
                if (!(hostChassis2 instanceof DynamicAgent)) {
                    hostChassis2 = null;
                }
                DynamicAgent dynamicAgent2 = (DynamicAgent) hostChassis2;
                if (dynamicAgent2 != null) {
                    dynamicAgent2.setAddListener(false);
                }
                DynamicChassisInterface hostChassis3 = getHostChassis();
                if (!(hostChassis3 instanceof DynamicAgent)) {
                    hostChassis3 = null;
                }
                DynamicAgent dynamicAgent3 = (DynamicAgent) hostChassis3;
                ab<?> pageContainer = dynamicAgent3 != null ? dynamicAgent3.getPageContainer() : null;
                if (!(pageContainer instanceof IPageContainerFunc)) {
                    pageContainer = null;
                }
                IPageContainerFunc iPageContainerFunc = (IPageContainerFunc) pageContainer;
                if (iPageContainerFunc != null) {
                    iPageContainerFunc.addScrollListener(fixScrollListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectTab(ArrayList<com.dianping.shield.entity.CellInfo> arrayList, com.dianping.shield.entity.CellInfo cellInfo) {
        int i = 0;
        Object[] objArr = {arrayList, cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b7a9f0c76cdad4ccf3f3841d031920", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b7a9f0c76cdad4ccf3f3841d031920")).intValue();
        }
        if (arrayList != null) {
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.h.a();
                }
                com.dianping.shield.entity.CellInfo cellInfo2 = (com.dianping.shield.entity.CellInfo) obj;
                if (cellInfo.section >= cellInfo2.section && cellInfo.section <= cellInfo2.section && cellInfo.row >= cellInfo2.row && cellInfo.row <= cellInfo.row) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicDiff<ViewInfo> mappingSlideBarViewFuc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c175fa3a9a650498c865703ee6814b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c175fa3a9a650498c865703ee6814b1");
        }
        ViewItem viewItem = ((TabRowItem) getDynamicRowItem()).slideBarViewItem;
        if (!(viewItem instanceof DynamicDiff)) {
            viewItem = null;
        }
        DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
        if (dynamicDiff == null || !h.a((Object) dynamicDiff.getId(), (Object) str)) {
            return null;
        }
        ViewItem viewItem2 = ((TabRowItem) getDynamicRowItem()).slideBarViewItem;
        if (viewItem2 != null) {
            return (DynamicDiff) viewItem2;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ViewInfo>");
    }
}
