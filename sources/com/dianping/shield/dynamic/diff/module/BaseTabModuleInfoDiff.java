package com.dianping.shield.dynamic.diff.module;

import android.graphics.drawable.GradientDrawable;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.extensions.common.CommonContainerRowItem;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.component.extensions.tabs.TabViewClickCallbackWithData;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.DynamicBaseDiff;
import com.dianping.shield.dynamic.diff.ScrollEventDiff;
import com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.dynamic.diff.extra.TabCellClickData;
import com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy;
import com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff$tabClickCallback$2;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItem;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.HoverInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.module.BaseTabModuleInfo;
import com.dianping.shield.dynamic.model.module.TabModuleConfigInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.TabInfo;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.TopInfo;
import com.dianping.shield.node.useritem.ViewItem;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001D\b\u0016\u0018\u0000 \u0080\u0001*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u0080\u0001B\r\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010W2\u0006\u0010Y\u001a\u00020QH\u0002J\u0012\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0002J\u0017\u0010]\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0002\u0010&J\u0012\u0010^\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010_\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0004H\u0002J\r\u0010`\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$JI\u0010a\u001a\u00020[2\u0006\u0010b\u001a\u00028\u00002\u0006\u0010\\\u001a\u00028\u00012\u0016\u0010c\u001a\u0012\u0012\u0004\u0012\u00020e0dj\b\u0012\u0004\u0012\u00020e`f2\b\u0010g\u001a\u0004\u0018\u00010T2\b\u0010h\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0002\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010k2\u0006\u0010l\u001a\u00020QH\u0016J\b\u0010m\u001a\u00020TH\u0016J\b\u0010n\u001a\u00020TH\u0016J8\u0010o\u001a\u0016\u0012\u0004\u0012\u00020Q\u0018\u00010dj\n\u0012\u0004\u0012\u00020Q\u0018\u0001`f2\u001a\u0010p\u001a\u0016\u0012\u0004\u0012\u00020q\u0018\u00010dj\n\u0012\u0004\u0012\u00020q\u0018\u0001`fH\u0002J\u0018\u0010r\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010W2\u0006\u0010Y\u001a\u00020QH\u0002J\u0010\u0010t\u001a\u00020[2\u0006\u0010b\u001a\u00020\u0002H\u0002J&\u0010u\u001a\u00020[2\u0006\u0010v\u001a\u00020T2\u0016\u0010c\u001a\u0012\u0012\u0004\u0012\u00020e0dj\b\u0012\u0004\u0012\u00020e`fJ\b\u0010w\u001a\u00020[H\u0016J\u0010\u0010x\u001a\u00020[2\b\u00108\u001a\u0004\u0018\u000109J\u000e\u0010y\u001a\u00020[2\u0006\u0010z\u001a\u00020TJ\u0010\u0010{\u001a\u00020[2\u0006\u0010|\u001a\u00020\u0002H\u0002J\u0015\u0010}\u001a\u00020[2\u0006\u0010~\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u007fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u00028\u0001X\u0086.¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\fR\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\u0010\u0010A\u001a\u0004\u0018\u00010BX\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010O\u001a\u001e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u00180Pj\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u0018`RX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010S\u001a\u0004\u0018\u00010TX\u0082\u000e¢\u0006\u0004\n\u0002\u0010U¨\u0006\u0081\u0001"}, d2 = {"Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "V", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "Lcom/dianping/shield/dynamic/diff/extra/TabInfoDiffProxy;", "Lcom/dianping/shield/dynamic/diff/extra/HoverInfoDiffProxy;", "Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", "computingBgItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "computingMaskItem", "computingSlideBarViewItem", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", "currentTabModuleInfo", "dynamicRowItem", "getDynamicRowItem", "()Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "setDynamicRowItem", "(Lcom/dianping/shield/component/extensions/tabs/TabRowItem;)V", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "setHostChassis", "hoverCellScrollEventDetector", "Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;", "getHoverCellScrollEventDetector", "()Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;", "setHoverCellScrollEventDetector", "(Lcom/dianping/shield/dynamic/utils/HoverCellScrollEventDetector;)V", DMKeys.KEY_HOVER_OFFSET, "", "getHoverOffset", "()Ljava/lang/Float;", "setHoverOffset", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "isAutoOffset", "()Z", "setAutoOffset", "(Z)V", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "tabClickCallback", "com/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$tabClickCallback$2$1", "getTabClickCallback", "()Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$tabClickCallback$2$1;", "tabClickCallback$delegate", "Lkotlin/Lazy;", "tabModuleClickCallback", "Lcom/dianping/shield/dynamic/diff/extra/OnTabClickCallback;", "getTabModuleClickCallback", "()Lcom/dianping/shield/dynamic/diff/extra/OnTabClickCallback;", "setTabModuleClickCallback", "(Lcom/dianping/shield/dynamic/diff/extra/OnTabClickCallback;)V", "viewIdMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "viewSuggestWidth", "", "Ljava/lang/Integer;", "bgMaskMappingFun", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/ExtraViewInfo;", "id", "bindBgMaskViewItems", "", "computingItem", "bindItems", "bindSlideBarViewItem", "bindViewItems", "createComputingItem", "diffChildren", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;Lcom/dianping/shield/component/extensions/tabs/TabRowItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getAutoLeftMargin", "getAutoRightMargin", "getTabConfigsTitle", "tabs", "Lcom/dianping/shield/dynamic/model/module/TabModuleConfigInfo;", "mappingSlideBarViewFuc", "Lcom/dianping/shield/dynamic/model/view/ViewInfo;", "prepareDiff", "reDiffByCount", "count", "resetProps", "setHoverState", "setVisibility", RemoteMessageConst.Notification.VISIBILITY, "updateContainerRowProps", "cellInfo", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;)V", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class BaseTabModuleInfoDiff<T extends BaseTabModuleInfo, V extends TabRowItem> extends DynamicBaseDiff<T, V> implements ScrollEventDiff, HoverInfoDiffProxy, TabInfoDiffProxy, DynamicModuleMarginInterface {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(BaseTabModuleInfoDiff.class), "tabClickCallback", "getTabClickCallback()Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$tabClickCallback$2$1;"))};
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_SLIDE_BAR_HEIGHT = 4;
    private static final int DEFAULT_TAB_VIEW_HEIGHT = 45;
    private static final int SELECT_INDEX_NO_EXIST = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Boolean autoContentMargin;
    @Nullable
    private Boolean autoMargin;
    private ViewItem computingBgItem;
    private ViewItem computingMaskItem;
    private ViewItem computingSlideBarViewItem;
    @Nullable
    private MarginInfo contentMarginInfo;
    private BaseTabModuleInfo currentTabModuleInfo;
    @NotNull
    public V dynamicRowItem;
    @NotNull
    private DynamicChassisInterface hostChassis;
    @Nullable
    private HoverCellScrollEventDetector hoverCellScrollEventDetector;
    @Nullable
    private Float hoverOffset;
    private HoverState hoverState;
    private boolean isAutoOffset;
    @Nullable
    private MarginInfo marginInfo;
    private NodePath path;
    private final d tabClickCallback$delegate;
    @Nullable
    private OnTabClickCallback tabModuleClickCallback;
    private final HashMap<String, ViewItem> viewIdMap;
    private Integer viewSuggestWidth;

    private final BaseTabModuleInfoDiff$tabClickCallback$2.AnonymousClass1 getTabClickCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (BaseTabModuleInfoDiff$tabClickCallback$2.AnonymousClass1) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb40e3c5b1fc358f22b2e178ac82a20a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb40e3c5b1fc358f22b2e178ac82a20a") : this.tabClickCallback$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void bindItems(Object obj) {
        bindItems((BaseTabModuleInfoDiff<T, V>) ((TabRowItem) obj));
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void bindSlideBarViewItem(@Nullable TabRowItem tabRowItem, @NotNull TabRowItem tabRowItem2) {
        Object[] objArr = {tabRowItem, tabRowItem2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d4502e0ca7ae9cedb8cd066c87da0b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d4502e0ca7ae9cedb8cd066c87da0b5");
            return;
        }
        h.b(tabRowItem2, "currentRowItem");
        TabInfoDiffProxy.DefaultImpls.bindSlideBarViewItem(this, tabRowItem, tabRowItem2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @Nullable
    public Integer calculateRecommendWidth(@NotNull TabInfo tabInfo, @Nullable Integer num, int i, boolean z) {
        Object[] objArr = {tabInfo, num, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057c86085681051600cfc5fb3a8f9895", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057c86085681051600cfc5fb3a8f9895");
        }
        h.b(tabInfo, "newInfo");
        return TabInfoDiffProxy.DefaultImpls.calculateRecommendWidth(this, tabInfo, num, i, z);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public DynamicViewItem<ExtraViewInfo> createBgMaskItem(@NotNull ExtraViewInfo extraViewInfo) {
        Object[] objArr = {extraViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bcacc02265e133a2f144a6a98e2fac6", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bcacc02265e133a2f144a6a98e2fac6");
        }
        h.b(extraViewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createBgMaskItem(this, extraViewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public DynamicDiff<TabViewInfo> createChildItem(@NotNull TabViewInfo tabViewInfo) {
        Object[] objArr = {tabViewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdb39dca981d71e7ebd36d4050da5f58", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdb39dca981d71e7ebd36d4050da5f58");
        }
        h.b(tabViewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createChildItem(this, tabViewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public TabViewClickCallbackWithData createClickCallBack(@Nullable OnTabClickCallback onTabClickCallback) {
        Object[] objArr = {onTabClickCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72818692e513cc90449b4f9a1f9eb35c", RobustBitConfig.DEFAULT_VALUE) ? (TabViewClickCallbackWithData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72818692e513cc90449b4f9a1f9eb35c") : TabInfoDiffProxy.DefaultImpls.createClickCallBack(this, onTabClickCallback);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    @Nullable
    public ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {scrollEvent, iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e22f7cd00752d427da454db859a6f860", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentScrollEventHelper.IEventDispatcherProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e22f7cd00752d427da454db859a6f860");
        }
        h.b(scrollEvent, "scrollEvent");
        return ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(this, scrollEvent, iEventDispatcherProvider);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public DynamicDiff<ViewInfo> createViewItem(@NotNull ViewInfo viewInfo) {
        Object[] objArr = {viewInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73921e294d415c7d8f13a99df2eae26", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73921e294d415c7d8f13a99df2eae26");
        }
        h.b(viewInfo, DMKeys.KEY_VIEW_INFO);
        return TabInfoDiffProxy.DefaultImpls.createViewItem(this, viewInfo);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public com.dianping.picassomodule.widget.tab.h createViewItemsWithTitle(@NotNull TabInfo tabInfo, @Nullable ArrayList<String> arrayList, int i, int i2) {
        Object[] objArr = {tabInfo, arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d43e334794f8f3954b011da50557485", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.picassomodule.widget.tab.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d43e334794f8f3954b011da50557485");
        }
        h.b(tabInfo, "info");
        return TabInfoDiffProxy.DefaultImpls.createViewItemsWithTitle(this, tabInfo, arrayList, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((BaseTabModuleInfoDiff<T, V>) ((BaseTabModuleInfo) diffableInfo), (BaseTabModuleInfo) ((TabRowItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @Nullable
    public DynamicViewItem<ViewInfo> diffSlideBarViewInfo(@Nullable ViewInfo viewInfo, @NotNull TabRowItem tabRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ViewInfo>> bVar, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {viewInfo, tabRowItem, arrayList, bVar, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a10a61fd90890dbcc6ff0cd5ca4856f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a10a61fd90890dbcc6ff0cd5ca4856f");
        }
        h.b(tabRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        h.b(bVar, "mappingFunc");
        return TabInfoDiffProxy.DefaultImpls.diffSlideBarViewInfo(this, viewInfo, tabRowItem, arrayList, bVar, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void diffTabBgViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84158b492384f51961944ce40fcee18c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84158b492384f51961944ce40fcee18c");
            return;
        }
        h.b(commonContainerRowItem, "computingItem");
        h.b(arrayList, "diffResult");
        h.b(bVar, "mappingFunc");
        h.b(bVar2, "createFunc");
        TabInfoDiffProxy.DefaultImpls.diffTabBgViewItem(this, extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void diffTabMaskViewItem(@Nullable ExtraViewInfo extraViewInfo, @NotNull CommonContainerRowItem commonContainerRowItem, @NotNull ArrayList<ComputeUnit> arrayList, @NotNull b<? super String, ? extends DynamicDiff<ExtraViewInfo>> bVar, @NotNull b<? super ExtraViewInfo, ? extends DynamicDiff<ExtraViewInfo>> bVar2, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {extraViewInfo, commonContainerRowItem, arrayList, bVar, bVar2, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ebdb13eedfb58b84584aeb194071226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ebdb13eedfb58b84584aeb194071226");
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
    public JSONObject generateCallBackJson(@Nullable NodePath nodePath, @NotNull g gVar) {
        Object[] objArr = {nodePath, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8597d98ca8aafc8d4e5dafbca224b501", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8597d98ca8aafc8d4e5dafbca224b501");
        }
        h.b(gVar, "reason");
        return TabInfoDiffProxy.DefaultImpls.generateCallBackJson(this, nodePath, gVar);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "756cdf81a855b5a126bc2645c9274add", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "756cdf81a855b5a126bc2645c9274add")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getBottomMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d0a77f0632265caf500dbb595658b93", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d0a77f0632265caf500dbb595658b93")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getBottomMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26793855aeef53063a6b831486d1c7bc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26793855aeef53063a6b831486d1c7bc")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getHorizontalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24c308e092f6d51c2ebe90c6c5f3b519", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24c308e092f6d51c2ebe90c6c5f3b519")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getHorizontalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff, com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy, com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    @NotNull
    public DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public int getHoverTabOffset(@Nullable TabView tabView, float f) {
        Object[] objArr = {tabView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "319291d27527953bc48dd38cafc618f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "319291d27527953bc48dd38cafc618f5")).intValue() : TabInfoDiffProxy.DefaultImpls.getHoverTabOffset(this, tabView, f);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f1ca0188d7b8999138817184f98a11", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f1ca0188d7b8999138817184f98a11")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f46adafa406483e7e823d7b5a794e992", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f46adafa406483e7e823d7b5a794e992")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getLeftMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84f87fcb911c34f4dd4d8dd056a72198", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84f87fcb911c34f4dd4d8dd056a72198")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36848334b63da5e112e4e0daa906c27b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36848334b63da5e112e4e0daa906c27b")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getRightMargin(this);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public int getScreenWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6cf8c853b570b044943fc3f0cbc3dd1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6cf8c853b570b044943fc3f0cbc3dd1")).intValue() : TabInfoDiffProxy.DefaultImpls.getScreenWidth(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f759a11473766b2bbbd2efa0f89dd6e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f759a11473766b2bbbd2efa0f89dd6e7")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getTopMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c1b3c5bc2872f1229382ab12d2af40", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c1b3c5bc2872f1229382ab12d2af40")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getTopMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalContentMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64a595ebdfc0e002946d3baea9ace680", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64a595ebdfc0e002946d3baea9ace680")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalContentMargin(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getVerticalMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ea1835504bd71a4a469d42a84f3c578", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ea1835504bd71a4a469d42a84f3c578")).intValue() : DynamicModuleMarginInterface.DefaultImpls.getVerticalMargin(this);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void handleClick(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull TabCellClickData tabCellClickData, @NotNull JSONObject jSONObject, @Nullable int[] iArr) {
        Object[] objArr = {dynamicChassisInterface, tabCellClickData, jSONObject, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d60d470a124a172c1816e91655b84a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d60d470a124a172c1816e91655b84a10");
            return;
        }
        h.b(dynamicChassisInterface, "hostContainer");
        h.b(tabCellClickData, "data");
        h.b(jSONObject, "extraData");
        TabInfoDiffProxy.DefaultImpls.handleClick(this, dynamicChassisInterface, tabCellClickData, jSONObject, iArr);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public BottomInfo processHoverBottomInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle) {
        Object[] objArr = {hoverInfo, dividerStyle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dfc3c15e262204a3f1fe835a8c0b376", RobustBitConfig.DEFAULT_VALUE)) {
            return (BottomInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dfc3c15e262204a3f1fe835a8c0b376");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverBottomInfo(this, hoverInfo, dividerStyle);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.HoverInfoDiffProxy
    @Nullable
    public TopInfo processHoverTopInfo(@NotNull HoverInfo hoverInfo, @Nullable DividerStyle dividerStyle, @Nullable TopInfo.OnTopStateChangeListener onTopStateChangeListener) {
        Object[] objArr = {hoverInfo, dividerStyle, onTopStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26934277880aed91c82220acfa375b85", RobustBitConfig.DEFAULT_VALUE)) {
            return (TopInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26934277880aed91c82220acfa375b85");
        }
        h.b(hoverInfo, "hoverInfo");
        return HoverInfoDiffProxy.DefaultImpls.processHoverTopInfo(this, hoverInfo, dividerStyle, onTopStateChangeListener);
    }

    public void setHostChassis(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb5a7cd1d029ea6bffa0c5399ded39cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb5a7cd1d029ea6bffa0c5399ded39cb");
            return;
        }
        h.b(dynamicChassisInterface, "<set-?>");
        this.hostChassis = dynamicChassisInterface;
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    public void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem) {
        Object[] objArr = {scrollEvent, baseScrollableRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c29b1aba9c349b196236771a4532ec02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c29b1aba9c349b196236771a4532ec02");
            return;
        }
        h.b(scrollEvent, "scrollEvent");
        h.b(baseScrollableRowItem, "baseScrollableRowItem");
        ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(this, scrollEvent, baseScrollableRowItem);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void tabSelectCallback(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
        Object[] objArr = {obj, nodePath, gVar, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f3c081de59191445007da6db3183a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f3c081de59191445007da6db3183a7");
            return;
        }
        h.b(gVar, "reason");
        TabInfoDiffProxy.DefaultImpls.tabSelectCallback(this, obj, nodePath, gVar, iArr);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void updateDataIndex(@Nullable TabRowItem tabRowItem) {
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1962d40b05e1f3c511acbfc112a8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1962d40b05e1f3c511acbfc112a8cd");
        } else {
            TabInfoDiffProxy.DefaultImpls.updateDataIndex(this, tabRowItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((BaseTabModuleInfoDiff<T, V>) ((BaseTabModuleInfo) diffableInfo));
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void updateTabDivider(@NotNull TabRowItem tabRowItem, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Object[] objArr = {tabRowItem, bool, bool2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbb20e26d5343783c318d9d35704c20b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbb20e26d5343783c318d9d35704c20b");
            return;
        }
        h.b(tabRowItem, "tabRowItem");
        TabInfoDiffProxy.DefaultImpls.updateTabDivider(this, tabRowItem, bool, bool2);
    }

    @Override // com.dianping.shield.dynamic.diff.extra.TabInfoDiffProxy
    public void updateTabInfo(@NotNull TabInfo tabInfo, @NotNull TabRowItem tabRowItem) {
        Object[] objArr = {tabInfo, tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9552b3bacf732f6a268731fbfe30f468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9552b3bacf732f6a268731fbfe30f468");
            return;
        }
        h.b(tabInfo, "info");
        h.b(tabRowItem, "dynamicRowItem");
        TabInfoDiffProxy.DefaultImpls.updateTabInfo(this, tabInfo, tabRowItem);
    }

    public BaseTabModuleInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0471255a8b8a80042e10b3b0c6f86ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0471255a8b8a80042e10b3b0c6f86ac");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.hoverState = HoverState.NORMAL;
        this.viewIdMap = new HashMap<>();
        this.tabClickCallback$delegate = e.a(new BaseTabModuleInfoDiff$tabClickCallback$2(this));
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoLeftMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b67858fd617fb5095c899eedfbfe095", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b67858fd617fb5095c899eedfbfe095")).intValue() : getHostChassis().getContainerThemePackage().getLeftMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public int getAutoRightMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54fdc02aa5490d0d56ba8f5eb69e16fe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54fdc02aa5490d0d56ba8f5eb69e16fe")).intValue() : getHostChassis().getContainerThemePackage().getRightMargin();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoMargin() {
        return this.autoMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoMargin(@Nullable Boolean bool) {
        this.autoMargin = bool;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public MarginInfo getContentMarginInfo() {
        return this.contentMarginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setContentMarginInfo(@Nullable MarginInfo marginInfo) {
        this.contentMarginInfo = marginInfo;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    @Nullable
    public Boolean getAutoContentMargin() {
        return this.autoContentMargin;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicModuleMarginInterface
    public void setAutoContentMargin(@Nullable Boolean bool) {
        this.autoContentMargin = bool;
    }

    @NotNull
    public final V getDynamicRowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b72b6c894d27bca40dbc4d375f17190", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b72b6c894d27bca40dbc4d375f17190");
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        return v;
    }

    public final void setDynamicRowItem(@NotNull V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c95a312fa122b17d1ab0f307f36724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c95a312fa122b17d1ab0f307f36724");
            return;
        }
        h.b(v, "<set-?>");
        this.dynamicRowItem = v;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$Companion;", "", "()V", "DEFAULT_SLIDE_BAR_HEIGHT", "", "DEFAULT_TAB_VIEW_HEIGHT", "SELECT_INDEX_NO_EXIST", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Nullable
    public final OnTabClickCallback getTabModuleClickCallback() {
        return this.tabModuleClickCallback;
    }

    public final void setTabModuleClickCallback(@Nullable OnTabClickCallback onTabClickCallback) {
        this.tabModuleClickCallback = onTabClickCallback;
    }

    public final boolean isAutoOffset() {
        return this.isAutoOffset;
    }

    public final void setAutoOffset(boolean z) {
        this.isAutoOffset = z;
    }

    @Nullable
    public final Float getHoverOffset() {
        return this.hoverOffset;
    }

    public final void setHoverOffset(@Nullable Float f) {
        this.hoverOffset = f;
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
    public V createComputingItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d5d45b131086ba1e253f3ff1cf42718", RobustBitConfig.DEFAULT_VALUE) ? (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d5d45b131086ba1e253f3ff1cf42718") : (V) new TabRowItem();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ba, code lost:
        if (r14 == null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void diffChildren(@org.jetbrains.annotations.NotNull T r19, @org.jetbrains.annotations.NotNull V r20, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r21, @org.jetbrains.annotations.Nullable java.lang.Integer r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff.diffChildren(com.dianping.shield.dynamic.model.module.BaseTabModuleInfo, com.dianping.shield.component.extensions.tabs.TabRowItem, java.util.ArrayList, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public void resetProps() {
        BaseTabModuleInfo baseTabModuleInfo;
        Integer selectIndex;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cc0b39b2a951c91770d8c9df2b9ffb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cc0b39b2a951c91770d8c9df2b9ffb5");
            return;
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        int i = v.selectIndex;
        BaseTabModuleInfo baseTabModuleInfo2 = (BaseTabModuleInfo) getComputingInfo();
        Integer selectIndex2 = baseTabModuleInfo2 != null ? baseTabModuleInfo2.getSelectIndex() : null;
        if ((selectIndex2 == null || i != selectIndex2.intValue()) && (baseTabModuleInfo = (BaseTabModuleInfo) getComputingInfo()) != null && (selectIndex = baseTabModuleInfo.getSelectIndex()) != null) {
            int intValue = selectIndex.intValue();
            if (intValue != -1) {
                V v2 = this.dynamicRowItem;
                if (v2 == null) {
                    h.a("dynamicRowItem");
                }
                v2.lastSelectedIndex = intValue;
            }
            V v3 = this.dynamicRowItem;
            if (v3 == null) {
                h.a("dynamicRowItem");
            }
            v3.selectIndex = intValue;
        }
        V v4 = this.dynamicRowItem;
        if (v4 == null) {
            h.a("dynamicRowItem");
        }
        v4.clear();
        this.isAutoOffset = false;
        this.hoverOffset = Float.valueOf(0.0f);
    }

    public final void reDiffByCount(int i, @NotNull ArrayList<ComputeUnit> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11bc5ea47aaf305ee6d793406d57cb14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11bc5ea47aaf305ee6d793406d57cb14");
            return;
        }
        h.b(arrayList, "diffResult");
        BaseTabModuleInfo baseTabModuleInfo = this.currentTabModuleInfo;
        if (baseTabModuleInfo != null) {
            BaseTabModuleInfo baseTabModuleInfo2 = baseTabModuleInfo;
            Integer valueOf = Integer.valueOf(i);
            int horizontalMargin = getHorizontalMargin() + getHorizontalContentMargin();
            Boolean isEqualized = baseTabModuleInfo.isEqualized();
            this.viewSuggestWidth = calculateRecommendWidth(baseTabModuleInfo2, valueOf, horizontalMargin, isEqualized != null ? isEqualized.booleanValue() : true);
            if (baseTabModuleInfo == null) {
                throw new o("null cannot be cast to non-null type T");
            }
            diff(baseTabModuleInfo, arrayList, this.viewSuggestWidth, null);
        }
    }

    private final ArrayList<String> getTabConfigsTitle(ArrayList<TabModuleConfigInfo> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df9e5618f154f713a244fd116a2c1bc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df9e5618f154f713a244fd116a2c1bc1");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            ArrayList<TabModuleConfigInfo> arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.h.a((Iterable) arrayList3, 10));
            for (TabModuleConfigInfo tabModuleConfigInfo : arrayList3) {
                String title = tabModuleConfigInfo.getTitle();
                arrayList4.add(title != null ? Boolean.valueOf(arrayList2.add(title)) : null);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicDiff<ViewInfo> mappingSlideBarViewFuc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f442eea1de66c19694d31470a7639c62", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f442eea1de66c19694d31470a7639c62");
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        ViewItem viewItem = v.slideBarViewItem;
        if (!(viewItem instanceof DynamicDiff)) {
            viewItem = null;
        }
        DynamicDiff dynamicDiff = (DynamicDiff) viewItem;
        if (dynamicDiff == null || !h.a((Object) dynamicDiff.getId(), (Object) str)) {
            return null;
        }
        V v2 = this.dynamicRowItem;
        if (v2 == null) {
            h.a("dynamicRowItem");
        }
        ViewItem viewItem2 = v2.slideBarViewItem;
        if (viewItem2 != null) {
            return (DynamicDiff) viewItem2;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.agent.node.DynamicDiff<com.dianping.shield.dynamic.model.view.ViewInfo>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DynamicDiff<ExtraViewInfo> bgMaskMappingFun(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cb12ab6ca433c461cf8b7fdf2a49cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicDiff) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cb12ab6ca433c461cf8b7fdf2a49cd3");
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        if (!(v instanceof CommonContainerRowItem)) {
            v = null;
        }
        V v2 = v;
        ViewItem backgroundViewItem = v2 != null ? v2.getBackgroundViewItem() : null;
        if (!(backgroundViewItem instanceof DynamicDiff)) {
            backgroundViewItem = null;
        }
        DynamicDiff dynamicDiff = (DynamicDiff) backgroundViewItem;
        if (h.a((Object) str, (Object) (dynamicDiff != null ? dynamicDiff.getId() : null))) {
            V v3 = this.dynamicRowItem;
            if (v3 == null) {
                h.a("dynamicRowItem");
            }
            if (!(v3 instanceof CommonContainerRowItem)) {
                v3 = null;
            }
            V v4 = v3;
            ViewItem backgroundViewItem2 = v4 != null ? v4.getBackgroundViewItem() : null;
            if (!(backgroundViewItem2 instanceof DynamicDiff)) {
                backgroundViewItem2 = null;
            }
            return (DynamicDiff) backgroundViewItem2;
        }
        V v5 = this.dynamicRowItem;
        if (v5 == null) {
            h.a("dynamicRowItem");
        }
        if (!(v5 instanceof CommonContainerRowItem)) {
            v5 = null;
        }
        V v6 = v5;
        ViewItem maskViewItem = v6 != null ? v6.getMaskViewItem() : null;
        if (!(maskViewItem instanceof DynamicDiff)) {
            maskViewItem = null;
        }
        DynamicDiff dynamicDiff2 = (DynamicDiff) maskViewItem;
        if (h.a((Object) str, (Object) (dynamicDiff2 != null ? dynamicDiff2.getId() : null))) {
            V v7 = this.dynamicRowItem;
            if (v7 == null) {
                h.a("dynamicRowItem");
            }
            if (!(v7 instanceof CommonContainerRowItem)) {
                v7 = null;
            }
            V v8 = v7;
            ViewItem maskViewItem2 = v8 != null ? v8.getMaskViewItem() : null;
            if (!(maskViewItem2 instanceof DynamicDiff)) {
                maskViewItem2 = null;
            }
            return (DynamicDiff) maskViewItem2;
        }
        return null;
    }

    public void bindItems(@Nullable V v) {
        Object[] objArr = {v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e20a9403a53948cf8ea9ae16f64c75ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e20a9403a53948cf8ea9ae16f64c75ff");
            return;
        }
        bindViewItems(v);
        bindBgMaskViewItems(v);
        bindSlideBarViewItem(v);
    }

    private final void bindBgMaskViewItems(TabRowItem tabRowItem) {
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d83c764f87533faa46d3eb44713af72a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d83c764f87533faa46d3eb44713af72a");
        } else if (tabRowItem != null) {
            ViewItem backgroundViewItem = tabRowItem.getBackgroundViewItem();
            if (!(backgroundViewItem instanceof DynamicViewItem)) {
                backgroundViewItem = null;
            }
            DynamicViewItem dynamicViewItem = (DynamicViewItem) backgroundViewItem;
            if (dynamicViewItem != null) {
                dynamicViewItem.onComputingComplete();
                V v = this.dynamicRowItem;
                if (v == null) {
                    h.a("dynamicRowItem");
                }
                v.setBackgroundViewItem(dynamicViewItem);
            }
            ViewItem maskViewItem = tabRowItem.getMaskViewItem();
            if (!(maskViewItem instanceof DynamicViewItem)) {
                maskViewItem = null;
            }
            DynamicViewItem dynamicViewItem2 = (DynamicViewItem) maskViewItem;
            if (dynamicViewItem2 != null) {
                dynamicViewItem2.onComputingComplete();
                V v2 = this.dynamicRowItem;
                if (v2 == null) {
                    h.a("dynamicRowItem");
                }
                v2.setMaskViewItem(dynamicViewItem2);
            }
        }
    }

    private final void bindViewItems(TabRowItem tabRowItem) {
        DynamicModuleViewItemData dynamicModuleViewItemData;
        int i = 0;
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8b5b9d0760a6a67b20f8c7df792453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8b5b9d0760a6a67b20f8c7df792453");
        } else if (tabRowItem != null) {
            this.viewIdMap.clear();
            ArrayList<ViewItem> arrayList = tabRowItem.viewItems;
            if (arrayList != null) {
                for (Object obj : arrayList) {
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
                            this.viewIdMap.put(id, viewItem);
                        }
                    }
                    Object obj2 = viewItem.data;
                    if (!(obj2 instanceof DynamicTabData)) {
                        obj2 = null;
                    }
                    DynamicTabData dynamicTabData = (DynamicTabData) obj2;
                    if (dynamicTabData != null && (dynamicModuleViewItemData = dynamicTabData.normalData) != null) {
                        dynamicModuleViewItemData.index = i;
                    }
                    V v = this.dynamicRowItem;
                    if (v == null) {
                        h.a("dynamicRowItem");
                    }
                    v.addViewItem(viewItem);
                    i = i2;
                }
            }
        }
    }

    private final void bindSlideBarViewItem(TabRowItem tabRowItem) {
        Object[] objArr = {tabRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1c0bcb82ff4caef844cdef3267307a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1c0bcb82ff4caef844cdef3267307a6");
        } else if (tabRowItem != null) {
            ViewItem viewItem = tabRowItem.slideBarViewItem;
            if (!(viewItem instanceof DynamicViewItem)) {
                viewItem = null;
            }
            DynamicViewItem dynamicViewItem = (DynamicViewItem) viewItem;
            if (dynamicViewItem != null) {
                dynamicViewItem.onComputingComplete();
                V v = this.dynamicRowItem;
                if (v == null) {
                    h.a("dynamicRowItem");
                }
                v.slideBarViewItem = dynamicViewItem;
            }
        }
    }

    public final void setHoverState(@Nullable HoverState hoverState) {
        HoverCellScrollEventDetector.HoverStateChangeListener hoverStateChangeListener;
        Object[] objArr = {hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76869d7bc9e431a00efeb6ccec166a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76869d7bc9e431a00efeb6ccec166a21");
        } else if (hoverState != null) {
            this.hoverState = hoverState;
            HoverCellScrollEventDetector hoverCellScrollEventDetector = this.hoverCellScrollEventDetector;
            if (hoverCellScrollEventDetector == null || (hoverStateChangeListener = hoverCellScrollEventDetector.getHoverStateChangeListener()) == null) {
                return;
            }
            hoverStateChangeListener.onTopStageChanged(null, null, 0, 0, hoverState);
        }
    }

    public final void setVisibility(int i) {
        HoverCellScrollEventDetector.HoverStateChangeListener hoverStateChangeListener;
        HoverCellScrollEventDetector.HoverStateChangeListener hoverStateChangeListener2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9077936ff41e39a67a73b5c726d1a98e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9077936ff41e39a67a73b5c726d1a98e");
        } else if (i == 8 && this.hoverState != HoverState.NORMAL) {
            this.hoverState = HoverState.END;
            HoverCellScrollEventDetector hoverCellScrollEventDetector = this.hoverCellScrollEventDetector;
            if (hoverCellScrollEventDetector == null || (hoverStateChangeListener2 = hoverCellScrollEventDetector.getHoverStateChangeListener()) == null) {
                return;
            }
            hoverStateChangeListener2.onTopStageChanged(null, null, 0, 0, HoverState.END);
        } else if (i == 0 && this.hoverState == HoverState.END) {
            HoverState hoverState = HoverState.HOVER;
            HoverCellScrollEventDetector hoverCellScrollEventDetector2 = this.hoverCellScrollEventDetector;
            if (hoverCellScrollEventDetector2 == null || (hoverStateChangeListener = hoverCellScrollEventDetector2.getHoverStateChangeListener()) == null) {
                return;
            }
            hoverStateChangeListener.onTopStageChanged(null, null, 0, 0, HoverState.HOVER);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if ((r2.length() > 0) != true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ff, code lost:
        if ((r2.length() > 0) != true) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0112, code lost:
        if ((r2.length() > 0) != true) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0125, code lost:
        if ((r2.length() > 0) != true) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
        if ((r2.length() > 0) == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013c, code lost:
        if (r12.hoverCellScrollEventDetector != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013e, code lost:
        r12.hoverCellScrollEventDetector = new com.dianping.shield.dynamic.utils.HoverCellScrollEventDetector(getHostChassis());
        r2 = kotlin.r.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
        if (r12.path != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
        r2 = new com.dianping.shield.node.cellnode.NodePath();
        r4 = new com.dianping.shield.entity.IndexPath();
        r4.section = 0;
        r4.row = 0;
        r4.index = 0;
        r5 = kotlin.r.a;
        r2.indexPath = r4;
        r4 = kotlin.r.a;
        r12.path = r2;
        r2 = kotlin.r.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
        r2 = r12.hoverCellScrollEventDetector;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
        r2.setPath(r12.path);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0172, code lost:
        r2 = r12.hoverCellScrollEventDetector;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0174, code lost:
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0176, code lost:
        r4 = r12.dynamicRowItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017a, code lost:
        kotlin.jvm.internal.h.a("dynamicRowItem");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017f, code lost:
        r2.bindListener(r3, r4.verticalScrollEventDispatcherProvider);
        r2 = kotlin.r.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0247 A[LOOP:0: B:132:0x0245->B:133:0x0247, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateProps(@org.jetbrains.annotations.NotNull final T r13) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff.updateProps(com.dianping.shield.dynamic.model.module.BaseTabModuleInfo):void");
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb0a2e5b8eb17d6ca8cf401cd22339cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb0a2e5b8eb17d6ca8cf401cd22339cb");
        }
        h.b(str, "identifier");
        ViewItem viewItem = this.viewIdMap.get(str);
        if (!(viewItem instanceof IDynamicModuleViewItem)) {
            viewItem = null;
        }
        IDynamicModuleViewItem iDynamicModuleViewItem = (IDynamicModuleViewItem) viewItem;
        if (iDynamicModuleViewItem == null) {
            V v = this.dynamicRowItem;
            if (v == null) {
                h.a("dynamicRowItem");
            }
            ViewItem backgroundViewItem = v.getBackgroundViewItem();
            if (!(backgroundViewItem instanceof DynamicViewItemsHolderInterface)) {
                backgroundViewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface = (DynamicViewItemsHolderInterface) backgroundViewItem;
            iDynamicModuleViewItem = dynamicViewItemsHolderInterface != null ? dynamicViewItemsHolderInterface.findPicassoViewItemByIdentifier(str) : null;
        }
        if (iDynamicModuleViewItem == null) {
            V v2 = this.dynamicRowItem;
            if (v2 == null) {
                h.a("dynamicRowItem");
            }
            ViewItem maskViewItem = v2.getMaskViewItem();
            if (!(maskViewItem instanceof DynamicViewItemsHolderInterface)) {
                maskViewItem = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface2 = (DynamicViewItemsHolderInterface) maskViewItem;
            iDynamicModuleViewItem = dynamicViewItemsHolderInterface2 != null ? dynamicViewItemsHolderInterface2.findPicassoViewItemByIdentifier(str) : null;
        }
        if (iDynamicModuleViewItem == null) {
            V v3 = this.dynamicRowItem;
            if (v3 == null) {
                h.a("dynamicRowItem");
            }
            ViewItem viewItem2 = v3.slideBarViewItem;
            if (!(viewItem2 instanceof DynamicViewItemsHolderInterface)) {
                viewItem2 = null;
            }
            DynamicViewItemsHolderInterface dynamicViewItemsHolderInterface3 = (DynamicViewItemsHolderInterface) viewItem2;
            if (dynamicViewItemsHolderInterface3 != null) {
                return dynamicViewItemsHolderInterface3.findPicassoViewItemByIdentifier(str);
            }
            return null;
        }
        return iDynamicModuleViewItem;
    }

    private final void prepareDiff(BaseTabModuleInfo baseTabModuleInfo) {
        Object[] objArr = {baseTabModuleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "925a6bf9d200e910f5662528d76323dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "925a6bf9d200e910f5662528d76323dd");
            return;
        }
        setMarginInfo(baseTabModuleInfo.getMarginInfo());
        Boolean autoMargin = baseTabModuleInfo.getAutoMargin();
        setAutoMargin(Boolean.valueOf(autoMargin != null ? autoMargin.booleanValue() : false));
    }

    private final void updateContainerRowProps(BaseTabModuleInfo baseTabModuleInfo) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {baseTabModuleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9283bba364a4719cdfb53477e9da187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9283bba364a4719cdfb53477e9da187");
            return;
        }
        V v = this.dynamicRowItem;
        if (v == null) {
            h.a("dynamicRowItem");
        }
        String backgroundColor = baseTabModuleInfo.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = "#FFFFFFFF";
        }
        v.setBackgroundColor(backgroundColor);
        V v2 = this.dynamicRowItem;
        if (v2 == null) {
            h.a("dynamicRowItem");
        }
        ColorUnionType.GradientColorInfo gradientBackgroundColor = baseTabModuleInfo.getGradientBackgroundColor();
        if (gradientBackgroundColor != null) {
            int parseColor = ColorUnionTypeKt.parseColor(gradientBackgroundColor.getStartColor());
            int parseColor2 = ColorUnionTypeKt.parseColor(gradientBackgroundColor.getEndColor());
            Integer orientation = gradientBackgroundColor.getOrientation();
            int intValue = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
            if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.values()[intValue], new int[]{parseColor, parseColor2});
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(0);
            }
        } else {
            gradientDrawable = null;
        }
        v2.setGradientBackgroundColor(gradientDrawable);
    }
}
