package com.dianping.shield.dynamic.items.rowitems.tab;

import com.dianping.picassomodule.widget.tab.TabView;
import com.dianping.shield.component.extensions.tabs.TabRowExtension;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.cell.TabCellInfoDiff;
import com.dianping.shield.dynamic.model.cell.TabCellInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\t\u0010\u001d\u001a\u00020\fH\u0096\u0001J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\""}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabRowItem;", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "dynamicRowDiffProxy", "Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/cell/TabCellInfoDiff;)V", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "getTabView", "Lcom/dianping/picassomodule/widget/tab/TabView;", "onComputingComplete", "setComponentView", "componentView", "Lcom/dianping/shield/node/adapter/status/IElementContainerExpose;", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicTabRowItem extends TabRowItem implements DynamicDiff<TabCellInfo> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final TabCellInfoDiff dynamicRowDiffProxy;
    @NotNull
    private final DynamicChassisInterface hostChassis;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull TabCellInfo tabCellInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {tabCellInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b88ea8a5528bd7e11635b32c9e09e853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b88ea8a5528bd7e11635b32c9e09e853");
            return;
        }
        h.b(tabCellInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.dynamicRowDiffProxy.diff(tabCellInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "825cbf9956649af3bc0373db28761d65", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "825cbf9956649af3bc0373db28761d65");
        }
        h.b(str, "identifier");
        return this.dynamicRowDiffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a85fb881d33266af57573931b1174238", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a85fb881d33266af57573931b1174238") : this.dynamicRowDiffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7f813fe25db0700b0da746dd327426b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7f813fe25db0700b0da746dd327426b");
        } else {
            this.dynamicRowDiffProxy.onComputingComplete();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabRowItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DynamicTabRowItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull TabCellInfoDiff tabCellInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(tabCellInfoDiff, "dynamicRowDiffProxy");
        Object[] objArr = {dynamicChassisInterface, tabCellInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990a722144882fc20fd8b4f4b6f0480f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990a722144882fc20fd8b4f4b6f0480f");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.dynamicRowDiffProxy = tabCellInfoDiff;
        this.dynamicRowDiffProxy.setDynamicRowItem(this);
    }

    public /* synthetic */ DynamicTabRowItem(DynamicChassisInterface dynamicChassisInterface, TabCellInfoDiff tabCellInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new TabCellInfoDiff(dynamicChassisInterface) : tabCellInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(TabCellInfo tabCellInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(tabCellInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(DynamicTabRowItem.class, new TabRowExtension());
    }

    @Override // com.dianping.shield.component.extensions.common.CommonContainerRowItem
    public final void setComponentView(@Nullable IElementContainerExpose iElementContainerExpose) {
        Object[] objArr = {iElementContainerExpose};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab582e57c842cfc56e3573d1654fe946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab582e57c842cfc56e3573d1654fe946");
            return;
        }
        super.setComponentView(iElementContainerExpose);
        TabView tabView = getTabView();
        if (tabView != null) {
            tabView.setVisibility(0);
        }
    }

    private final TabView getTabView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "853b5d631265336e5834d0af14ccd1d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (TabView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "853b5d631265336e5834d0af14ccd1d8");
        }
        IElementContainerExpose containerView = getContainerView();
        if (!(containerView instanceof TabView)) {
            containerView = null;
        }
        return (TabView) containerView;
    }
}
