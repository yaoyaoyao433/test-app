package com.dianping.shield.dynamic.agent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.v;
import com.dianping.agentsdk.framework.z;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.eunomia.c;
import com.dianping.eunomia.f;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.components.AbstractTabInterface;
import com.dianping.shield.components.ConfigurableTabAgent;
import com.dianping.shield.components.model.TabConfigModel;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.items.rowitems.tab.DynamicTabModuleRowItem;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.module.TabModuleConfigInfo;
import com.dianping.shield.dynamic.model.module.TabModuleInfo;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.dianping.shield.dynamic.protocols.DynamicTabChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.template.PaintingItemCallback;
import com.dianping.shield.dynamic.template.PaintingItemTemplate;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.useritem.HoverState;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001pB'\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\b\u0010'\u001a\u00020(H\u0002J-\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010.0-\"\u0004\u0018\u00010.H\u0016¢\u0006\u0002\u0010/J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020+H\u0016J\u0018\u00106\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u000107H\u0016J\n\u00109\u001a\u0004\u0018\u00010:H\u0016J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020>H&J\n\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u001aH\u0002J\b\u0010D\u001a\u00020BH\u0002J\u000e\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016J\n\u0010F\u001a\u0004\u0018\u00010GH\u0016J\n\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020K0 H\u0002J\b\u0010L\u001a\u0004\u0018\u00010MJ\b\u0010N\u001a\u00020\u0012H\u0016J\b\u0010O\u001a\u00020\u0012H\u0016J\u0012\u0010P\u001a\u00020(2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010S\u001a\u00020(H\u0016J\b\u0010T\u001a\u00020(H\u0016J\u0010\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020\u0012H\u0016J\b\u0010W\u001a\u00020(H\u0016J\u0012\u0010X\u001a\u00020(2\b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u0016J\u001d\u0010Z\u001a\u00020(2\u000e\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0-H\u0014¢\u0006\u0002\u0010\\J\u0018\u0010]\u001a\u00020(2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020`H\u0016J\u0012\u0010a\u001a\u00020(2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0012\u0010d\u001a\u00020(2\b\u0010e\u001a\u0004\u0018\u00010fH\u0016J\u0018\u0010g\u001a\u00020(2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020`H\u0016J\u001f\u0010h\u001a\u00020(2\u0010\u0010[\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010-H\u0016¢\u0006\u0002\u0010\\J\u0012\u0010i\u001a\u00020(2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\u0010\u0010l\u001a\u00020(2\u0006\u0010m\u001a\u00020\u0012H\u0016J\u0006\u0010n\u001a\u00020\u001aJ\u0006\u0010o\u001a\u00020(R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0018\u00010&R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006q"}, d2 = {"Lcom/dianping/shield/dynamic/agent/DynamicTabAgent;", "Lcom/dianping/shield/components/ConfigurableTabAgent;", "Lcom/dianping/shield/components/AbstractTabInterface;", "Lcom/dianping/shield/dynamic/protocols/ICommonHost;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/module/TabModuleInfo;", "Lcom/dianping/shield/dynamic/protocols/DynamicViewItemsHolderInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicTabChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicRefreshInterface;", "Lcom/dianping/shield/component/utils/ComponentScrollEventHelper$IScrollRange;", "fragment", "Landroid/support/v4/app/Fragment;", "bridgeInterface", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "tabPageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "currentTabCount", "", "execEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "getExecEnvironment", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "setExecEnvironment", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;)V", "isAddHotZone", "", "isFirstInit", "paintingCount", "paintingTemplate", "Lcom/dianping/shield/dynamic/template/PaintingItemTemplate;", "result", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "tabModuleInfo", "tabRowItem", "Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem;", "tabViewCellItem", "Lcom/dianping/shield/dynamic/agent/DynamicTabAgent$TabViewCellItem;", "buildTabViewCellItem", "", "callMethod", "method", "", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "defineHotZone", "Lcom/dianping/shield/entity/HotZoneYRange;", "defineStatusHotZone", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getHostContext", "Landroid/content/Context;", "getHoverOffset", "", "getHoverTabAutoOffset", "getHoverTabOffset", "getPageContainer", "getSectionCellInterface", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "getSectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "getTabConfigModel", "Lcom/dianping/shield/components/model/TabConfigModel;", "getTabView", "Landroid/view/View;", "getTotalHorizontalScrollRange", "getTotalVerticalScrollRange", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRefreshEnd", "refreshId", "onResume", "painting", "moduleInfo", "repaintByCount", "tabKeys", "([Ljava/lang/String;)V", "selectTab", "index", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "setOnTabClickedListener", "onTabClickListener", "Lcom/dianping/shield/components/AbstractTabInterface$OnTabClickedListener;", "setSelected", "setTabs", "setTopState", "hoverState", "Lcom/dianping/shield/node/useritem/HoverState;", "setVisibility", "viewVisibility", "showTab", "updateTabs", "TabViewCellItem", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicTabAgent extends ConfigurableTabAgent implements ComponentScrollEventHelper.IScrollRange, AbstractTabInterface, DynamicRefreshInterface, DynamicTabChassisInterface, DynamicViewItemsHolderInterface, ICommonHost, IDynamicPaintingCallback<TabModuleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final v bridgeInterface;
    private int currentTabCount;
    @Nullable
    private DynamicExecEnvironment execEnvironment;
    private final Fragment fragment;
    private boolean isAddHotZone;
    private boolean isFirstInit;
    private int paintingCount;
    private PaintingItemTemplate paintingTemplate;
    private ArrayList<ComputeUnit> result;
    private TabModuleInfo tabModuleInfo;
    private final ab<?> tabPageContainer;
    private DynamicTabModuleRowItem tabRowItem;
    private TabViewCellItem tabViewCellItem;

    @NotNull
    public abstract DynamicMappingInterface getDynamicMapping();

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    @Nullable
    public af getSectionCellInterface() {
        return null;
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setOnTabClickedListener(@Nullable AbstractTabInterface.OnTabClickedListener onTabClickedListener) {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abd9ef0a9c2a1af5eb9d38386a3e3c52", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abd9ef0a9c2a1af5eb9d38386a3e3c52") : DynamicTabChassisInterface.DefaultImpls.getContainerThemePackage(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5be8c3f8f65ef9c7fc9ca9ab9dc5cb62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5be8c3f8f65ef9c7fc9ca9ab9dc5cb62");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        DynamicTabChassisInterface.DefaultImpls.refreshHostViewItem(this, iDynamicModuleViewItem);
    }

    public DynamicTabAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03aaa297aaac0f721f7a00073eb84a5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03aaa297aaac0f721f7a00073eb84a5b");
            return;
        }
        this.fragment = fragment;
        this.bridgeInterface = vVar;
        this.tabPageContainer = abVar;
        this.result = new ArrayList<>();
        DynamicMappingInterface.EnvCreator execEnvironment = getDynamicMapping().getExecEnvironment("Dynamic_Module");
        if (execEnvironment != null) {
            this.execEnvironment = execEnvironment.initExecEnvironment(this, this);
        }
        PaintingItemTemplate paintingItemTemplate = new PaintingItemTemplate();
        DynamicExecutorInterface dynamicExecutor = getDynamicExecutor();
        if (dynamicExecutor != null) {
            paintingItemTemplate.initWithExecutor(dynamicExecutor);
        }
        this.paintingTemplate = paintingItemTemplate;
        this.tabViewCellItem = new TabViewCellItem();
        final DynamicTabModuleRowItem dynamicTabModuleRowItem = new DynamicTabModuleRowItem(this, null, 2, null);
        dynamicTabModuleRowItem.setTabModuleClickCallback(new OnTabClickCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicTabAgent$$special$$inlined$apply$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.diff.extra.OnTabClickCallback
            public final void tabClick(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
                IndexPath indexPath;
                int i = 0;
                Object[] objArr2 = {obj, nodePath, gVar, iArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c47fa792bb58025be110db513ac1aa7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c47fa792bb58025be110db513ac1aa7e");
                    return;
                }
                h.b(gVar, "reason");
                DynamicTabModuleRowItem dynamicTabModuleRowItem2 = DynamicTabModuleRowItem.this;
                if (nodePath != null && (indexPath = nodePath.indexPath) != null) {
                    i = indexPath.index;
                }
                int displayIndex = dynamicTabModuleRowItem2.getDisplayIndex(i);
                if (displayIndex >= 0) {
                    this.setNeedAutoOffset(DynamicTabModuleRowItem.this.getHoverTabAutoOffset());
                    this.scrollToFirstAgent(displayIndex);
                }
            }
        });
        dynamicTabModuleRowItem.initialSelectedIndex = 0;
        this.tabRowItem = dynamicTabModuleRowItem;
    }

    @Nullable
    public final DynamicExecEnvironment getExecEnvironment() {
        return this.execEnvironment;
    }

    public final void setExecEnvironment(@Nullable DynamicExecEnvironment dynamicExecEnvironment) {
        this.execEnvironment = dynamicExecEnvironment;
    }

    @Override // com.dianping.shield.components.AbstractTabAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5bdf249accbf4b91921b89cb40a407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5bdf249accbf4b91921b89cb40a407");
            return;
        }
        super.onCreate(bundle);
        setTabWidgets(this);
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onCreate();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicRefreshInterface
    public void onRefreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e5586fcd5712337dfb3a84174fe3bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e5586fcd5712337dfb3a84174fe3bd2");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshEnd(i);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb70b81bc5f832a5547010efd31239ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb70b81bc5f832a5547010efd31239ae");
            return;
        }
        super.onResume();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onResume();
        }
        if (this.isAddHotZone || !this.isFirstInit) {
            return;
        }
        startObserver();
        this.isAddHotZone = true;
    }

    @Nullable
    public final View getTabView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89fcb542ae7bbb41e5ea8c3c809ec333", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89fcb542ae7bbb41e5ea8c3c809ec333");
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        return dynamicTabModuleRowItem != null ? dynamicTabModuleRowItem.getTabView() : null;
    }

    public final void updateTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efef90b233cbf6dca41097331fe7414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efef90b233cbf6dca41097331fe7414");
        } else {
            setTabs();
        }
    }

    public final boolean showTab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "258fdb63f1dda253e9bfc0d84e2f89bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "258fdb63f1dda253e9bfc0d84e2f89bb")).booleanValue() : this.tabStrArray.size() < this.minTabCount;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aaa1084dd48c0bf9ddb4171c3af314c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aaa1084dd48c0bf9ddb4171c3af314c");
            return;
        }
        super.onPause();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onPause();
        }
        this.isAddHotZone = false;
        stopObserver();
    }

    @Override // com.dianping.shield.components.AbstractTabAgent, com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e550a49c78212bd5b4a6854b84c6023e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e550a49c78212bd5b4a6854b84c6023e");
            return;
        }
        ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
        List<Float> asList = Arrays.asList(Float.valueOf(this.paintingCount));
        h.a((Object) asList, "Arrays.asList(paintingCount.toFloat())");
        obtain.addValues(ShieldMonitorKey.MFDynamicModulePaint, asList).addTag("type", getShieldGAInfo().getType().getType()).addTag(ShieldMonitorKey.TAG_BUSINESS, getShieldGAInfo().getBusiness()).send();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onDestroy();
        }
        PaintingItemTemplate paintingItemTemplate = this.paintingTemplate;
        if (paintingItemTemplate != null) {
            paintingItemTemplate.destroy();
        }
        super.onDestroy();
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb58143f856fad66b44f292342a41ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb58143f856fad66b44f292342a41ae3");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ab<?> getPageContainer() {
        return this.pageContainer;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicTabChassisInterface
    public void selectTab(int i, @NotNull g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d693acc89baf2af6c6d8e3c12b0fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d693acc89baf2af6c6d8e3c12b0fe8");
            return;
        }
        h.b(gVar, "reason");
        setSelected(i, gVar);
        scrollToFirstAgent(i);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7894d45e451f86762e216624774c4f7", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7894d45e451f86762e216624774c4f7") : getContext();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d3a2b79eea1a5fbe54ec2c7228f1598", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d3a2b79eea1a5fbe54ec2c7228f1598") : getArguments();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a8b06742d999e4a030d9f91abb3216", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a8b06742d999e4a030d9f91abb3216");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getExecutor();
        }
        return null;
    }

    @Nullable
    public DynamicHostInterface getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a50c7254243604f778849076404118dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a50c7254243604f778849076404118dd");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getHost();
        }
        return null;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff718f7d5475070b77bb78d9c57124e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff718f7d5475070b77bb78d9c57124e7")).intValue();
        }
        ab abVar = this.pageContainer;
        if (!(abVar instanceof CommonPageContainer)) {
            abVar = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
        ViewGroup agentContainerView = commonPageContainer != null ? commonPageContainer.getAgentContainerView() : null;
        if (!(agentContainerView instanceof RecyclerView)) {
            agentContainerView = null;
        }
        RecyclerView recyclerView = (RecyclerView) agentContainerView;
        if (recyclerView != null) {
            return recyclerView.computeVerticalScrollRange();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        ViewGroup agentContainerView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7d192d9f9b6ced93bbe719d849934f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7d192d9f9b6ced93bbe719d849934f1")).intValue();
        }
        ab abVar = this.pageContainer;
        if (!(abVar instanceof CommonPageContainer)) {
            abVar = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) abVar;
        if (commonPageContainer == null || (agentContainerView = commonPageContainer.getAgentContainerView()) == null) {
            return 0;
        }
        return agentContainerView.getWidth();
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
        DynamicExecutorInterface dynamicExecutor;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c8d98b264656dfc2c903f9d92752c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c8d98b264656dfc2c903f9d92752c13");
        } else if (jSONObject == null) {
        } else {
            String optString = jSONObject.optString("identifier");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            h.a((Object) optString, "identify");
            IDynamicModuleViewItem findPicassoViewItemByIdentifier = findPicassoViewItemByIdentifier(optString);
            if (findPicassoViewItemByIdentifier == null || (dynamicExecutor = getDynamicExecutor()) == null) {
                return;
            }
            dynamicExecutor.sendEvent(findPicassoViewItemByIdentifier, jSONObject);
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setTabs(@Nullable String[] strArr) {
        int length;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407907dafc1b90bf82db5bf30f16b004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407907dafc1b90bf82db5bf30f16b004");
        } else if (strArr != null) {
            if (!(true ^ (strArr.length == 0)) || this.currentTabCount == (length = strArr.length)) {
                return;
            }
            repaintByCount(strArr);
            this.currentTabCount = length;
        }
    }

    public void repaintByCount(@NotNull final String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0e007df31260e8ad2de5db2be2f8661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0e007df31260e8ad2de5db2be2f8661");
            return;
        }
        h.b(strArr, "tabKeys");
        final DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            ArrayList<ComputeUnit> arrayList = new ArrayList<>();
            dynamicTabModuleRowItem.reDiffByCount(strArr.length, arrayList);
            PaintingItemTemplate paintingItemTemplate = this.paintingTemplate;
            if (paintingItemTemplate != null) {
                paintingItemTemplate.painting(arrayList, new PaintingItemCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicTabAgent$repaintByCount$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.template.PaintingItemCallback
                    public final void onPaintingFinish(@NotNull Set<String> set) {
                        DynamicTabModuleRowItem dynamicTabModuleRowItem2;
                        Object[] objArr2 = {set};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b1247adb7175088caa05515a46eb0202", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b1247adb7175088caa05515a46eb0202");
                            return;
                        }
                        h.b(set, "errorSet");
                        DynamicTabModuleRowItem.this.onComputingComplete();
                        dynamicTabModuleRowItem2 = this.tabRowItem;
                        if (dynamicTabModuleRowItem2 != null) {
                            dynamicTabModuleRowItem2.setTabs(strArr);
                        }
                        this.buildTabViewCellItem();
                        this.updateAgentCell();
                    }
                });
            }
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setSelected(int i, @NotNull g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8f3c55b8a88ac62c0ac5dc8358b0e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8f3c55b8a88ac62c0ac5dc8358b0e94");
            return;
        }
        h.b(gVar, "reason");
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setSelectedIndex(i, gVar);
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869d539639f14c63b32a1b460666dd21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869d539639f14c63b32a1b460666dd21");
            return;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setVisibility(i);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    @Nullable
    public ShieldSectionCellItem getSectionCellItem() {
        return this.tabViewCellItem;
    }

    @Override // com.dianping.shield.components.AbstractTabAgent, com.dianping.shield.feature.HotZoneObserverInterface
    @NotNull
    public HotZoneYRange defineHotZone() {
        Boolean autoOffset;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc5967a85ac7eda04c3ad34fcb19533", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneYRange) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc5967a85ac7eda04c3ad34fcb19533");
        }
        float hoverTabOffset = getHoverTabOffset() + aq.a(getContext(), 10.0f);
        TabModuleInfo tabModuleInfo = this.tabModuleInfo;
        if (((tabModuleInfo == null || (autoOffset = tabModuleInfo.getAutoOffset()) == null) ? false : autoOffset.booleanValue()) && (this.tabPageContainer instanceof e)) {
            ab abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.agentsdk.pagecontainer.SetAutoOffsetInterface");
            }
            i = ((e) abVar).getAutoOffset();
            hoverTabOffset += i;
        }
        int i2 = (int) hoverTabOffset;
        if (i2 != this.hotZoneYRange.endY) {
            return new HotZoneYRange(i, i2);
        }
        HotZoneYRange hotZoneYRange = this.hotZoneYRange;
        h.a((Object) hotZoneYRange, "hotZoneYRange");
        return hotZoneYRange;
    }

    @Override // com.dianping.shield.components.AbstractTabAgent, com.dianping.shield.feature.HotZoneStatusInterface
    @NotNull
    public HotZoneYRange defineStatusHotZone() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73a6d7c8a4f39e9432a02c7dfb76b184", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneYRange) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73a6d7c8a4f39e9432a02c7dfb76b184");
        }
        float hoverTabOffset = getHoverTabOffset();
        if (getHoverTabAutoOffset() && (this.tabPageContainer instanceof e)) {
            ab abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.agentsdk.pagecontainer.SetAutoOffsetInterface");
            }
            i = ((e) abVar).getAutoOffset();
            hoverTabOffset += i;
        }
        int i2 = (int) hoverTabOffset;
        if (i2 != this.hotZoneYRange.endY) {
            return new HotZoneYRange(i + ((int) getHoverOffset()), i2);
        }
        HotZoneYRange hotZoneYRange = this.hotZoneYRange;
        h.a((Object) hotZoneYRange, "hotZoneYRange");
        return hotZoneYRange;
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable final TabModuleInfo tabModuleInfo) {
        Object[] objArr = {tabModuleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e5ba6302f86ebd73e15c836ae1b48d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e5ba6302f86ebd73e15c836ae1b48d9");
        } else if (getContext() != null) {
            if (tabModuleInfo != null) {
                this.tabModuleInfo = tabModuleInfo;
                Integer minShowTabCount = tabModuleInfo.getMinShowTabCount();
                if (minShowTabCount != null) {
                    setMinTabCount(minShowTabCount.intValue());
                }
                this.paintingCount++;
                this.tabModuleInfo = tabModuleInfo;
                this.result.clear();
                final DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
                if (dynamicTabModuleRowItem != null) {
                    DynamicDiff.DefaultImpls.diff$default(dynamicTabModuleRowItem, tabModuleInfo, this.result, null, null, 12, null);
                    PaintingItemTemplate paintingItemTemplate = this.paintingTemplate;
                    if (paintingItemTemplate != null) {
                        paintingItemTemplate.painting(this.result, new PaintingItemCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicTabAgent$painting$$inlined$let$lambda$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.dianping.shield.dynamic.template.PaintingItemCallback
                            public final void onPaintingFinish(@NotNull Set<String> set) {
                                ArrayList<TabConfigModel> tabConfigModel;
                                Object[] objArr2 = {set};
                                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b8a501a395c36b4251139805d8b5447", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b8a501a395c36b4251139805d8b5447");
                                    return;
                                }
                                h.b(set, "errorSet");
                                DynamicTabModuleRowItem.this.onComputingComplete();
                                this.buildTabViewCellItem();
                                this.updateAgentCell();
                                DynamicTabAgent dynamicTabAgent = this;
                                tabConfigModel = this.getTabConfigModel();
                                dynamicTabAgent.resetTabConfig(tabConfigModel);
                            }
                        });
                    }
                }
            }
            if (this.isAddHotZone) {
                return;
            }
            this.isAddHotZone = true;
            this.isFirstInit = true;
        }
    }

    @Override // com.dianping.shield.components.AbstractTabAgent
    public void setTopState(@Nullable HoverState hoverState) {
        DynamicTabModuleRowItem dynamicTabModuleRowItem;
        Object[] objArr = {hoverState};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43d00b0ed8f2ea5ffaa6146537e6d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43d00b0ed8f2ea5ffaa6146537e6d37");
            return;
        }
        super.setTopState(hoverState);
        if (hoverState == null || (dynamicTabModuleRowItem = this.tabRowItem) == null) {
            return;
        }
        dynamicTabModuleRowItem.setHoverState(hoverState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<TabConfigModel> getTabConfigModel() {
        ArrayList<TabModuleConfigInfo> tabConfigs;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d648a4934d0f40a6e20a0f91d6651b8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d648a4934d0f40a6e20a0f91d6651b8c");
        }
        ArrayList<TabConfigModel> arrayList = new ArrayList<>();
        TabModuleInfo tabModuleInfo = this.tabModuleInfo;
        if (tabModuleInfo != null && (tabConfigs = tabModuleInfo.getTabConfigs()) != null && tabConfigs.size() != 0) {
            int size = tabConfigs.size();
            for (int i = 0; i < size; i++) {
                TabConfigModel tabConfigModel = new TabConfigModel(String.valueOf(i));
                TabModuleConfigInfo tabModuleConfigInfo = tabConfigs.get(i);
                if (tabModuleConfigInfo != null) {
                    h.a((Object) tabModuleConfigInfo, "tabConfigArray[i] ?: continue");
                    String configKey = tabModuleConfigInfo.getConfigKey();
                    List<ArrayList<c>> a = !TextUtils.isEmpty(configKey) ? f.a().a(getContext(), configKey) : null;
                    if (a == null || a.isEmpty()) {
                        a = DMUtils.getModuleConfigItems(tabModuleConfigInfo.getModuleKeys());
                    }
                    String extraConfigKey = tabModuleConfigInfo.getExtraConfigKey();
                    List<ArrayList<c>> a2 = TextUtils.isEmpty(extraConfigKey) ? null : f.a().a(getContext(), extraConfigKey);
                    if (a2 == null || a2.isEmpty()) {
                        a2 = DMUtils.getModuleConfigItems(tabModuleConfigInfo.getExtraModuleKeys());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (a == null) {
                        h.a();
                    }
                    arrayList2.addAll(a);
                    if (a2 == null) {
                        h.a();
                    }
                    arrayList2.addAll(a2);
                    tabConfigModel.configModuleKeys = arrayList2;
                    tabConfigModel.tabRelatedAgentKeys = DMUtils.modules2Strings(a);
                    arrayList.add(tabConfigModel);
                }
            }
        }
        return arrayList;
    }

    private final float getHoverTabOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1c5b17c06f11994434a3e93448bfcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1c5b17c06f11994434a3e93448bfcc")).floatValue();
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            return dynamicTabModuleRowItem.getHoverTabOffset();
        }
        return 0.0f;
    }

    private final float getHoverOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "895b8a1b36af3a74fa443cfe9992580a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "895b8a1b36af3a74fa443cfe9992580a")).floatValue();
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            return dynamicTabModuleRowItem.getHoverOffset();
        }
        return 0.0f;
    }

    private final boolean getHoverTabAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97d90543436cae2a811e2ff9f0422129", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97d90543436cae2a811e2ff9f0422129")).booleanValue();
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            return dynamicTabModuleRowItem.getHoverTabAutoOffset();
        }
        return false;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af23a6e104534dedce570747c17ebb69", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af23a6e104534dedce570747c17ebb69");
        }
        h.b(str, "identifier");
        DynamicTabModuleRowItem dynamicTabModuleRowItem = this.tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            return dynamicTabModuleRowItem.findPicassoViewItemByIdentifier(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildTabViewCellItem() {
        ColorUnionType sectionHeaderBackgroundColor;
        Integer sectionHeaderHeight;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07f2279627b708e17e41b84fe3902ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07f2279627b708e17e41b84fe3902ca8");
            return;
        }
        TabViewCellItem tabViewCellItem = this.tabViewCellItem;
        if (tabViewCellItem != null) {
            tabViewCellItem.sectionItems = new ArrayList<>();
            ArrayList<SectionItem> arrayList = tabViewCellItem.sectionItems;
            SectionItem sectionItem = new SectionItem();
            sectionItem.addRowItem(this.tabRowItem);
            arrayList.add(sectionItem);
            TabModuleInfo tabModuleInfo = this.tabModuleInfo;
            if (tabModuleInfo != null && (sectionHeaderHeight = tabModuleInfo.getSectionHeaderHeight()) != null) {
                tabViewCellItem.sectionHeaderGapHeight = sectionHeaderHeight.intValue();
            }
            TabModuleInfo tabModuleInfo2 = this.tabModuleInfo;
            if (tabModuleInfo2 != null && (sectionHeaderBackgroundColor = tabModuleInfo2.getSectionHeaderBackgroundColor()) != null) {
                tabViewCellItem.sectionHeaderGapDrawable = DMUtils.getHeaderFooterBackgroundColor(sectionHeaderBackgroundColor);
            }
            tabViewCellItem.sectionFooterGapHeight = 0;
            TabModuleInfo tabModuleInfo3 = this.tabModuleInfo;
            if (h.a(tabModuleInfo3 != null ? tabModuleInfo3.getDisableLinkNextForTab() : null, Boolean.TRUE)) {
                tabViewCellItem.nextLinkType = z.a.DISABLE_LINK_TO_NEXT;
            } else {
                tabViewCellItem.nextLinkType = z.a.LINK_TO_NEXT;
            }
        }
        this.hoverOffset = (int) getHoverOffset();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/agent/DynamicTabAgent$TabViewCellItem;", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "(Lcom/dianping/shield/dynamic/agent/DynamicTabAgent;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final class TabViewCellItem extends ShieldSectionCellItem {
        public static ChangeQuickRedirect changeQuickRedirect;

        public TabViewCellItem() {
        }
    }
}
