package com.dianping.shield.dynamic.items.rowitems.tab;

import android.view.ViewParent;
import com.dianping.agentsdk.framework.aq;
import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.common.CommonBgMaskFrameLayout;
import com.dianping.shield.component.extensions.tabs.TabRowExtension;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff;
import com.dianping.shield.dynamic.model.module.BaseTabModuleInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.dianping.shield.node.useritem.HoverState;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001BB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\bJF\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096\u0001J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020!J\u000b\u0010%\u001a\u0004\u0018\u00010\u001dH\u0096\u0001J\b\u0010&\u001a\u0004\u0018\u00010'J\t\u0010(\u001a\u00020\u0010H\u0096\u0001J&\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00172\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015J\u0012\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u000100J\u0016\u00101\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u000206J\u001d\u00107\u001a\u00020\u00102\u0010\u00108\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u001d\u0018\u000109¢\u0006\u0002\u0010:J\u000e\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u0017J \u0010=\u001a\u00020\u00102\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010?2\u0006\u0010@\u001a\u00020'H\u0002J\u0010\u0010A\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006C"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem;", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "dynamicRowDiffProxy", "Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff;)V", "tabDataSource", "Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem$TabRowItemDataSource;", "getTabDataSource", "()Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem$TabRowItemDataSource;", "tabDataSource$delegate", "Lkotlin/Lazy;", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getDisplayIndex", "index", "getHoverOffset", "", "getHoverTabAutoOffset", "", "getHoverTabOffset", "getId", "getTabView", "Lcom/dianping/picassomodule/widget/tab/TabView;", "onComputingComplete", "reDiffByCount", "count", "setComponentView", "componentView", "Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "setHoverState", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "setSelectedIndex", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "setTabModuleClickCallback", "tabModuleClickCallback", "Lcom/dianping/shield/dynamic/diff/extra/OnTabClickCallback;", "setTabs", "tabKeys", "", "([Ljava/lang/String;)V", "setVisibility", RemoteMessageConst.Notification.VISIBILITY, "updateTabItemsVisibility", "displayIndexList", "", "tabView", "updateTabView", "TabRowItemDataSource", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicTabModuleRowItem extends TabRowItem implements DynamicDiff<BaseTabModuleInfo> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(DynamicTabModuleRowItem.class), "tabDataSource", "getTabDataSource()Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem$TabRowItemDataSource;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final BaseTabModuleInfoDiff<BaseTabModuleInfo, TabRowItem> dynamicRowDiffProxy;
    private final DynamicChassisInterface hostChassis;
    private final d tabDataSource$delegate;

    private final TabRowItemDataSource getTabDataSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (TabRowItemDataSource) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72c9a47a8cc02b58de74268ba1df32f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72c9a47a8cc02b58de74268ba1df32f") : this.tabDataSource$delegate.a());
    }

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull BaseTabModuleInfo baseTabModuleInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {baseTabModuleInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9734f7dbc33a507767085164065c288a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9734f7dbc33a507767085164065c288a");
            return;
        }
        h.b(baseTabModuleInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.dynamicRowDiffProxy.diff(baseTabModuleInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28dfb97354faad2e996d040aa34e3e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28dfb97354faad2e996d040aa34e3e7c");
        }
        h.b(str, "identifier");
        return this.dynamicRowDiffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bb87ac7b179cd9efa27aed2367fa57e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bb87ac7b179cd9efa27aed2367fa57e") : this.dynamicRowDiffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fedecd856350a130a0ce7ef3df5469f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fedecd856350a130a0ce7ef3df5469f");
        } else {
            this.dynamicRowDiffProxy.onComputingComplete();
        }
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(BaseTabModuleInfo baseTabModuleInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(baseTabModuleInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    public /* synthetic */ DynamicTabModuleRowItem(DynamicChassisInterface dynamicChassisInterface, BaseTabModuleInfoDiff baseTabModuleInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new BaseTabModuleInfoDiff(dynamicChassisInterface) : baseTabModuleInfoDiff);
    }

    public DynamicTabModuleRowItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull BaseTabModuleInfoDiff<BaseTabModuleInfo, TabRowItem> baseTabModuleInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(baseTabModuleInfoDiff, "dynamicRowDiffProxy");
        Object[] objArr = {dynamicChassisInterface, baseTabModuleInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3c53cce14d34a4dbb50d9641fcbf459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3c53cce14d34a4dbb50d9641fcbf459");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.dynamicRowDiffProxy = baseTabModuleInfoDiff;
        ExtensionsRegistry.INSTANCE.registerRowExtension(DynamicTabModuleRowItem.class, new TabRowExtension());
        this.dynamicRowDiffProxy.setDynamicRowItem(this);
        this.tabDataSource$delegate = e.a(kotlin.i.NONE, DynamicTabModuleRowItem$tabDataSource$2.INSTANCE);
    }

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRowItem
    public final void setComponentView(@Nullable IElementContainerExpose iElementContainerExpose) {
        Object[] objArr = {iElementContainerExpose};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75daa6866d19f409e5fd5912c454a9c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75daa6866d19f409e5fd5912c454a9c9");
            return;
        }
        super.setComponentView(iElementContainerExpose);
        updateTabView(getTabDataSource());
    }

    public final void setTabModuleClickCallback(@NotNull OnTabClickCallback onTabClickCallback) {
        Object[] objArr = {onTabClickCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20673eb41f07b2b2c11bfa1009fafc69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20673eb41f07b2b2c11bfa1009fafc69");
            return;
        }
        h.b(onTabClickCallback, "tabModuleClickCallback");
        this.dynamicRowDiffProxy.setTabModuleClickCallback(onTabClickCallback);
    }

    public final void setHoverState(@Nullable HoverState hoverState) {
        Object[] objArr = {hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34eb01430d0b3a7600b25812e6e4a394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34eb01430d0b3a7600b25812e6e4a394");
        } else if (hoverState != null) {
            this.dynamicRowDiffProxy.setHoverState(hoverState);
        }
    }

    public final void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac955508c651e0801cc3fd922876ed80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac955508c651e0801cc3fd922876ed80");
            return;
        }
        getTabDataSource().setVisibility(Integer.valueOf(i));
        this.dynamicRowDiffProxy.setVisibility(i);
        updateTabView(getTabDataSource());
    }

    private final void updateTabView(TabRowItemDataSource tabRowItemDataSource) {
        Integer num;
        int i = 0;
        Object[] objArr = {tabRowItemDataSource};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c328854316d93e732e1252f1a482942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c328854316d93e732e1252f1a482942");
            return;
        }
        TabView tabView = getTabView();
        ViewParent parent = tabView != null ? tabView.getParent() : null;
        if (!(parent instanceof CommonBgMaskFrameLayout)) {
            parent = null;
        }
        CommonBgMaskFrameLayout commonBgMaskFrameLayout = (CommonBgMaskFrameLayout) parent;
        if (commonBgMaskFrameLayout != null) {
            Integer visibility = tabRowItemDataSource.getVisibility();
            if (visibility != null) {
                int intValue = visibility.intValue();
                commonBgMaskFrameLayout.setVisibility(intValue);
                TabView tabView2 = getTabView();
                if (tabView2 != null) {
                    tabView2.setVisibility(intValue);
                }
            }
            tabRowItemDataSource.setVisibility(null);
        }
        TabView tabView3 = getTabView();
        if (tabView3 != null) {
            String[] tabKeys = tabRowItemDataSource.getTabKeys();
            if (tabKeys != null) {
                ArrayList arrayList = new ArrayList();
                if (true ^ (tabKeys.length == 0)) {
                    for (String str : tabKeys) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    }
                }
                ArrayList arrayList2 = arrayList;
                this.displayIndexList = arrayList2;
                updateTabItemsVisibility(arrayList2, tabView3);
                tabRowItemDataSource.setTabKeys(null);
            }
            Integer selectIndex = tabRowItemDataSource.getSelectIndex();
            if (selectIndex != null) {
                int intValue2 = selectIndex.intValue();
                List<Integer> list = this.displayIndexList;
                if (intValue2 < (list != null ? list.size() : 0)) {
                    List<Integer> list2 = this.displayIndexList;
                    if (list2 != null && (num = list2.get(intValue2)) != null) {
                        i = num.intValue();
                    }
                    tabView3.a(i, tabRowItemDataSource.getReason());
                }
                tabRowItemDataSource.setSelectIndex(null);
            }
        }
    }

    private final void updateTabItemsVisibility(List<Integer> list, TabView tabView) {
        Object[] objArr = {list, tabView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59a98fd9353dee6804362467e5c1b474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59a98fd9353dee6804362467e5c1b474");
        } else if (list != null) {
            if (!list.isEmpty()) {
                tabView.setVisibility(0);
                tabView.setTabVisibility(list);
                return;
            }
            tabView.setVisibility(8);
        } else {
            tabView.setVisibility(8);
        }
    }

    public final void setTabs(@Nullable String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a1fcb3074f7d73a53796399aee2e03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a1fcb3074f7d73a53796399aee2e03c");
            return;
        }
        getTabDataSource().setTabKeys(strArr);
        updateTabView(getTabDataSource());
    }

    public final int getDisplayIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94e36e59af097263353377b67462a956", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94e36e59af097263353377b67462a956")).intValue();
        }
        List<Integer> list = this.displayIndexList;
        if (list != null) {
            return list.indexOf(Integer.valueOf(i));
        }
        return -1;
    }

    public final boolean getHoverTabAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fbd7224c4239689609c5f4a62336856", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fbd7224c4239689609c5f4a62336856")).booleanValue() : this.dynamicRowDiffProxy.isAutoOffset();
    }

    public final float getHoverTabOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6f6fc3cb6494fd42f09a507472f3c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6f6fc3cb6494fd42f09a507472f3c8a")).floatValue();
        }
        Float hoverOffset = this.dynamicRowDiffProxy.getHoverOffset();
        float floatValue = hoverOffset != null ? hoverOffset.floatValue() : 0.0f;
        IElementContainerExpose containerView = getContainerView();
        if (!(containerView instanceof TabView)) {
            containerView = null;
        }
        TabView tabView = (TabView) containerView;
        return aq.a(this.hostChassis.getHostContext(), floatValue) + (tabView != null ? tabView.getHeight() : 0.0f);
    }

    public final float getHoverOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0a86dc0af857ccb34285610da90fae5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0a86dc0af857ccb34285610da90fae5")).floatValue();
        }
        Float hoverOffset = this.dynamicRowDiffProxy.getHoverOffset();
        return aq.a(this.hostChassis.getHostContext(), hoverOffset != null ? hoverOffset.floatValue() : 0.0f);
    }

    public final void reDiffByCount(int i, @NotNull ArrayList<ComputeUnit> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ecbccd437f562f2f71ea86ea626ab92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ecbccd437f562f2f71ea86ea626ab92");
            return;
        }
        h.b(arrayList, "diffResult");
        this.dynamicRowDiffProxy.reDiffByCount(i, arrayList);
    }

    @Nullable
    public final TabView getTabView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef4ae41174e5ef0836451d29578b4551", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef4ae41174e5ef0836451d29578b4551");
        }
        IElementContainerExpose containerView = getContainerView();
        if (!(containerView instanceof TabView)) {
            containerView = null;
        }
        return (TabView) containerView;
    }

    public final void setSelectedIndex(int i, @NotNull g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ab5c77a1dde63cdc7ef175214dcc428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ab5c77a1dde63cdc7ef175214dcc428");
            return;
        }
        h.b(gVar, "reason");
        getTabDataSource().setSelectIndex(Integer.valueOf(i));
        getTabDataSource().setReason(gVar);
        updateTabView(getTabDataSource());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem$TabRowItemDataSource;", "", "()V", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "getReason", "()Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "setReason", "(Lcom/dianping/picassomodule/widget/tab/TabSelectReason;)V", DMKeys.KEY_TAB_SELECT_INDEX, "", "getSelectIndex", "()Ljava/lang/Integer;", "setSelectIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "tabKeys", "", "", "getTabKeys", "()[Ljava/lang/String;", "setTabKeys", "([Ljava/lang/String;)V", "[Ljava/lang/String;", RemoteMessageConst.Notification.VISIBILITY, "getVisibility", "setVisibility", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class TabRowItemDataSource {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private g reason;
        @Nullable
        private Integer selectIndex;
        @Nullable
        private String[] tabKeys;
        @Nullable
        private Integer visibility;

        @Nullable
        public final Integer getVisibility() {
            return this.visibility;
        }

        public final void setVisibility(@Nullable Integer num) {
            this.visibility = num;
        }

        @Nullable
        public final Integer getSelectIndex() {
            return this.selectIndex;
        }

        public final void setSelectIndex(@Nullable Integer num) {
            this.selectIndex = num;
        }

        @Nullable
        public final g getReason() {
            return this.reason;
        }

        public final void setReason(@Nullable g gVar) {
            this.reason = gVar;
        }

        @Nullable
        public final String[] getTabKeys() {
            return this.tabKeys;
        }

        public final void setTabKeys(@Nullable String[] strArr) {
            this.tabKeys = strArr;
        }
    }
}
