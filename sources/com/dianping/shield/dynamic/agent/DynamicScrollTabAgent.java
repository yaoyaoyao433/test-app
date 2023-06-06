package com.dianping.shield.dynamic.agent;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.eunomia.c;
import com.dianping.eunomia.f;
import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.component.extensions.tabs.TabRowItem;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.components.AbstractTabInterface;
import com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent;
import com.dianping.shield.components.scrolltab.model.ScrollTabConfigModel;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.dynamic.diff.module.ScrollTabModuleInfoDiff;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.items.rowitems.tab.DynamicTabModuleRowItem;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.ColorUnionTypeKt;
import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.model.extra.MPTInfoKt;
import com.dianping.shield.dynamic.model.module.ScrollTabModuleInfo;
import com.dianping.shield.dynamic.model.module.TabModuleConfigInfo;
import com.dianping.shield.dynamic.model.vc.DragRefreshInfo;
import com.dianping.shield.dynamic.model.vc.DragRefreshInfoKt;
import com.dianping.shield.dynamic.model.vc.ModulesVCSettingInfo;
import com.dianping.shield.dynamic.model.vc.ModulesVCSettingInfoKt;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfoKt;
import com.dianping.shield.dynamic.model.vc.TabModulesVCInfo;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.dianping.shield.dynamic.protocols.DynamicTabChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.template.PaintingItemCallback;
import com.dianping.shield.dynamic.template.PaintingItemTemplate;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.node.cellnode.NodePath;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB'\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ-\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0016¢\u0006\u0002\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020$H\u0016J\u0018\u0010,\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010.\u0018\u00010-H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\n\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u000204H&J\n\u00105\u001a\u0004\u0018\u000106H\u0016J\u000e\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020 0\u0013H\u0002J\u0012\u00109\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u0011H\u0016J\b\u0010@\u001a\u00020\"H\u0016J\u0012\u0010A\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020EH\u0016J\u0012\u0010F\u001a\u00020\"2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0018\u0010L\u001a\u00020\"2\u0006\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020EH\u0016J\u001f\u0010M\u001a\u00020\"2\u0010\u0010N\u001a\f\u0012\u0006\b\u0001\u0012\u00020$\u0018\u00010&H\u0016¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020\u0011H\u0016J\n\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020VH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lcom/dianping/shield/dynamic/agent/DynamicScrollTabAgent;", "Lcom/dianping/shield/components/scrolltab/ConfigurableScrollTabAgent;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/module/ScrollTabModuleInfo;", "Lcom/dianping/shield/dynamic/protocols/ICommonHost;", "Lcom/dianping/shield/components/AbstractTabInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicViewItemsHolderInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicTabChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicRefreshInterface;", "fragment", "Landroid/support/v4/app/Fragment;", "bridgeInterface", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "currentTabCount", "", "displayIndexList", "", "execEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "getExecEnvironment", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "setExecEnvironment", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;)V", "moduleInfo", "paintingCount", "paintingItemTemplate", "Lcom/dianping/shield/dynamic/template/PaintingItemTemplate;", "tabConfigModels", "", "Lcom/dianping/shield/components/scrolltab/model/ScrollTabConfigModel;", "callMethod", "", "method", "", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getHostContext", "Landroid/content/Context;", "getPageContainer", "getTabConfigModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRefreshEnd", "refreshId", "onResume", "painting", "selectTab", "index", "reason", "Lcom/dianping/picassomodule/widget/tab/TabSelectReason;", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "setOnTabClickedListener", "onTabClickListener", "Lcom/dianping/shield/components/AbstractTabInterface$OnTabClickedListener;", "setSelected", "setTabs", "tabKeys", "([Ljava/lang/String;)V", "setVisibility", "viewVisiblity", "tabView", "Landroid/view/View;", "updateScrollTab", "tabRowItem", "Lcom/dianping/shield/dynamic/items/rowitems/tab/DynamicTabModuleRowItem;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicScrollTabAgent extends ConfigurableScrollTabAgent implements AbstractTabInterface, DynamicRefreshInterface, DynamicTabChassisInterface, DynamicViewItemsHolderInterface, ICommonHost, IDynamicPaintingCallback<ScrollTabModuleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int currentTabCount;
    private List<Integer> displayIndexList;
    @Nullable
    private DynamicExecEnvironment execEnvironment;
    private ScrollTabModuleInfo moduleInfo;
    private int paintingCount;
    private PaintingItemTemplate paintingItemTemplate;
    private List<ScrollTabConfigModel> tabConfigModels;

    @NotNull
    public abstract DynamicMappingInterface getDynamicMapping();

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setOnTabClickedListener(@Nullable AbstractTabInterface.OnTabClickedListener onTabClickedListener) {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4cd2a2a92e9392f57e8c2409130133e", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4cd2a2a92e9392f57e8c2409130133e") : DynamicTabChassisInterface.DefaultImpls.getContainerThemePackage(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59f8d746f7bb998508396ca24cf6363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59f8d746f7bb998508396ca24cf6363");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        DynamicTabChassisInterface.DefaultImpls.refreshHostViewItem(this, iDynamicModuleViewItem);
    }

    public DynamicScrollTabAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c08cd6a783e6a4ee0f8f6b422d7a4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c08cd6a783e6a4ee0f8f6b422d7a4b");
            return;
        }
        this.tabConfigModels = new ArrayList();
        DynamicMappingInterface.EnvCreator execEnvironment = getDynamicMapping().getExecEnvironment("Dynamic_Module");
        if (execEnvironment != null) {
            this.execEnvironment = execEnvironment.initExecEnvironment(this, this);
        }
        DynamicScrollTabAgent dynamicScrollTabAgent = this;
        final DynamicTabModuleRowItem dynamicTabModuleRowItem = new DynamicTabModuleRowItem(dynamicScrollTabAgent, new ScrollTabModuleInfoDiff(dynamicScrollTabAgent));
        dynamicTabModuleRowItem.setTabModuleClickCallback(new OnTabClickCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicScrollTabAgent$$special$$inlined$apply$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.diff.extra.OnTabClickCallback
            public final void tabClick(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
                IndexPath indexPath;
                int i = 0;
                Object[] objArr2 = {obj, nodePath, gVar, iArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdb5ca5f33b28193f72d5f4f2dec4425", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdb5ca5f33b28193f72d5f4f2dec4425");
                    return;
                }
                h.b(gVar, "reason");
                DynamicTabModuleRowItem dynamicTabModuleRowItem2 = DynamicTabModuleRowItem.this;
                if (nodePath != null && (indexPath = nodePath.indexPath) != null) {
                    i = indexPath.index;
                }
                int displayIndex = dynamicTabModuleRowItem2.getDisplayIndex(i);
                if (displayIndex >= 0) {
                    this.switchToPage(displayIndex);
                }
            }
        });
        dynamicTabModuleRowItem.initialSelectedIndex = 0;
        setTabRowItem(dynamicTabModuleRowItem);
        PaintingItemTemplate paintingItemTemplate = new PaintingItemTemplate();
        DynamicExecutorInterface dynamicExecutor = getDynamicExecutor();
        if (dynamicExecutor != null) {
            paintingItemTemplate.initWithExecutor(dynamicExecutor);
        }
        this.paintingItemTemplate = paintingItemTemplate;
    }

    @Nullable
    public final DynamicExecEnvironment getExecEnvironment() {
        return this.execEnvironment;
    }

    public final void setExecEnvironment(@Nullable DynamicExecEnvironment dynamicExecEnvironment) {
        this.execEnvironment = dynamicExecEnvironment;
    }

    @Override // com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f5d8d3ae1f3cefaff0e7b63b49bb323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f5d8d3ae1f3cefaff0e7b63b49bb323");
            return;
        }
        super.onCreate(bundle);
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onCreate();
        }
        setTabWidget(this);
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d1274730da9e1a04d098cc973fd42bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d1274730da9e1a04d098cc973fd42bc");
            return;
        }
        super.onResume();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onResume();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicRefreshInterface
    public void onRefreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b25fcc674d5023072c49f4f4e69219d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b25fcc674d5023072c49f4f4e69219d");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshEnd(i);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db020425b11b753a126c6ce01525281e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db020425b11b753a126c6ce01525281e");
            return;
        }
        super.onPause();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onPause();
        }
    }

    @Override // com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent, com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b5ecaae0098bf0cf712c296ceccac96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b5ecaae0098bf0cf712c296ceccac96");
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
        PaintingItemTemplate paintingItemTemplate = this.paintingItemTemplate;
        if (paintingItemTemplate != null) {
            paintingItemTemplate.destroy();
        }
        super.onDestroy();
    }

    @Override // com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent
    @Nullable
    public View tabView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7fa0dcd82acdd986b22543b7e4e38cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7fa0dcd82acdd986b22543b7e4e38cc");
        }
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        return dynamicTabModuleRowItem != null ? dynamicTabModuleRowItem.getTabView() : null;
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setTabs(@Nullable String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a65f4fd12af756ac1aaf56a2ce99d026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a65f4fd12af756ac1aaf56a2ce99d026");
            return;
        }
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setTabs(strArr);
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setSelected(int i, @NotNull g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77c4cf520f457e2a2cee6c6d9ac3a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77c4cf520f457e2a2cee6c6d9ac3a5d");
            return;
        }
        h.b(gVar, "reason");
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setSelectedIndex(i, gVar);
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38aa29ddf4ac9db2a2725501b25af1ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38aa29ddf4ac9db2a2725501b25af1ee");
            return;
        }
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setVisibility(i);
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicTabChassisInterface
    public void selectTab(int i, @NotNull g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d04e4a3aed9df2a5021483c021c85bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d04e4a3aed9df2a5021483c021c85bc");
            return;
        }
        h.b(gVar, "reason");
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            dynamicTabModuleRowItem.setSelectedIndex(i, gVar);
        }
        switchToPage(i);
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d64ab0e8386197b84b4ad81c353b9bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d64ab0e8386197b84b4ad81c353b9bef");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
        DynamicExecutorInterface dynamicExecutor;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc50af47014ca526cc1af642de64fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc50af47014ca526cc1af642de64fcf");
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

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ab<?> getPageContainer() {
        return this.pageContainer;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ced30370c5178f4add9b7310656a9d", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ced30370c5178f4add9b7310656a9d") : getContext();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b00517060b125f776cb5a734d9b1bf1", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b00517060b125f776cb5a734d9b1bf1") : getArguments();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebb68051618645503f6a805c71acf5ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebb68051618645503f6a805c71acf5ea");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bed0027a703a438e6d4a2b49f1751c10", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bed0027a703a438e6d4a2b49f1751c10");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getHost();
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable final ScrollTabModuleInfo scrollTabModuleInfo) {
        Object[] objArr = {scrollTabModuleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acfcf15ac38c15be953d7d9dfc45acb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acfcf15ac38c15be953d7d9dfc45acb6");
        } else if (getContext() == null || scrollTabModuleInfo == null) {
        } else {
            this.moduleInfo = scrollTabModuleInfo;
            Integer minShowTabCount = scrollTabModuleInfo.getMinShowTabCount();
            if (minShowTabCount != null) {
                setMinTabCount(minShowTabCount.intValue());
            }
            getTabConfigModel();
            this.paintingCount++;
            final ArrayList<? extends IDynamicModuleViewItem> arrayList = new ArrayList<>();
            TabRowItem tabRowItem = getTabRowItem();
            if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
                tabRowItem = null;
            }
            final DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
            if (dynamicTabModuleRowItem != null) {
                DynamicDiff.DefaultImpls.diff$default(dynamicTabModuleRowItem, scrollTabModuleInfo, arrayList, null, null, 12, null);
                PaintingItemTemplate paintingItemTemplate = this.paintingItemTemplate;
                if (paintingItemTemplate != null) {
                    paintingItemTemplate.painting(arrayList, new PaintingItemCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicScrollTabAgent$painting$$inlined$let$lambda$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.shield.dynamic.template.PaintingItemCallback
                        public final void onPaintingFinish(@NotNull Set<String> set) {
                            TabRowItem tabRowItem2;
                            Object[] objArr2 = {set};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "faa92f9f015b8874241b8addaf772001", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "faa92f9f015b8874241b8addaf772001");
                                return;
                            }
                            h.b(set, "errorSet");
                            DynamicTabModuleRowItem.this.onComputingComplete();
                            tabRowItem2 = this.getTabRowItem();
                            if (tabRowItem2 != null) {
                                tabRowItem2.setViewType(ConfigurableScrollTabAgent.TYPE_TAB_NEW);
                            }
                            this.updateScrollTab(DynamicTabModuleRowItem.this);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollTab(DynamicTabModuleRowItem dynamicTabModuleRowItem) {
        GradientDrawable gradientDrawable;
        Drawable drawable;
        GradientDrawable gradientDrawable2;
        GradientDrawable gradientDrawable3;
        GradientDrawable gradientDrawable4;
        Object[] objArr = {dynamicTabModuleRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87db83b5ed1ab8c0e365a0f870f8e1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87db83b5ed1ab8c0e365a0f870f8e1d8");
            return;
        }
        ScrollTabModuleInfo scrollTabModuleInfo = this.moduleInfo;
        if (scrollTabModuleInfo != null) {
            int i = dynamicTabModuleRowItem.lastSelectedIndex != -1 ? dynamicTabModuleRowItem.lastSelectedIndex : dynamicTabModuleRowItem.initialSelectedIndex;
            List<ScrollTabConfigModel> list = this.tabConfigModels;
            Boolean independentWhiteBoard = scrollTabModuleInfo.getIndependentWhiteBoard();
            boolean z = !(independentWhiteBoard != null ? independentWhiteBoard.booleanValue() : false);
            Boolean lazyLoad = scrollTabModuleInfo.getLazyLoad();
            boolean booleanValue = lazyLoad != null ? lazyLoad.booleanValue() : true;
            Integer sectionHeaderHeight = scrollTabModuleInfo.getSectionHeaderHeight();
            int intValue = sectionHeaderHeight != null ? sectionHeaderHeight.intValue() : -1;
            Integer sectionFooterHeight = scrollTabModuleInfo.getSectionFooterHeight();
            int intValue2 = sectionFooterHeight != null ? sectionFooterHeight.intValue() : -1;
            Integer bottomOffset = scrollTabModuleInfo.getBottomOffset();
            int intValue3 = bottomOffset != null ? bottomOffset.intValue() : 0;
            Boolean disableHorizontalScroll = scrollTabModuleInfo.getDisableHorizontalScroll();
            boolean booleanValue2 = disableHorizontalScroll != null ? disableHorizontalScroll.booleanValue() : false;
            ColorUnionType sectionHeaderBackgroundColor = scrollTabModuleInfo.getSectionHeaderBackgroundColor();
            if (sectionHeaderBackgroundColor == null) {
                gradientDrawable = null;
            } else if (sectionHeaderBackgroundColor instanceof ColorUnionType.StringColor) {
                gradientDrawable = new ColorDrawable(ColorUnionTypeKt.parseColor(((ColorUnionType.StringColor) sectionHeaderBackgroundColor).getColor()));
            } else if (!(sectionHeaderBackgroundColor instanceof ColorUnionType.GradientColorInfo)) {
                throw new j();
            } else {
                ColorUnionType.GradientColorInfo gradientColorInfo = (ColorUnionType.GradientColorInfo) sectionHeaderBackgroundColor;
                int parseColor = ColorUnionTypeKt.parseColor(gradientColorInfo.getStartColor());
                int parseColor2 = ColorUnionTypeKt.parseColor(gradientColorInfo.getEndColor());
                Integer orientation = gradientColorInfo.getOrientation();
                int intValue4 = orientation != null ? orientation.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
                if (parseColor != Integer.MAX_VALUE && parseColor2 != Integer.MAX_VALUE) {
                    gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.values()[intValue4], new int[]{parseColor, parseColor2});
                } else {
                    gradientDrawable4 = new GradientDrawable();
                    gradientDrawable4.setColor(0);
                }
                gradientDrawable = gradientDrawable4;
            }
            ColorUnionType sectionFooterBackgroundColor = scrollTabModuleInfo.getSectionFooterBackgroundColor();
            if (sectionFooterBackgroundColor != null) {
                if (sectionFooterBackgroundColor instanceof ColorUnionType.StringColor) {
                    gradientDrawable3 = new ColorDrawable(ColorUnionTypeKt.parseColor(((ColorUnionType.StringColor) sectionFooterBackgroundColor).getColor()));
                } else if (!(sectionFooterBackgroundColor instanceof ColorUnionType.GradientColorInfo)) {
                    throw new j();
                } else {
                    ColorUnionType.GradientColorInfo gradientColorInfo2 = (ColorUnionType.GradientColorInfo) sectionFooterBackgroundColor;
                    int parseColor3 = ColorUnionTypeKt.parseColor(gradientColorInfo2.getStartColor());
                    int parseColor4 = ColorUnionTypeKt.parseColor(gradientColorInfo2.getEndColor());
                    Integer orientation2 = gradientColorInfo2.getOrientation();
                    int intValue5 = orientation2 != null ? orientation2.intValue() : GradientDrawable.Orientation.LEFT_RIGHT.ordinal();
                    if (parseColor3 != Integer.MAX_VALUE && parseColor4 != Integer.MAX_VALUE) {
                        gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.values()[intValue5], new int[]{parseColor3, parseColor4});
                    } else {
                        gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setColor(0);
                    }
                    gradientDrawable3 = gradientDrawable2;
                }
                drawable = gradientDrawable3;
            } else {
                drawable = null;
            }
            Integer maxLoadedTabCount = scrollTabModuleInfo.getMaxLoadedTabCount();
            setTabConfigs(list, i, z, booleanValue, intValue, intValue2, intValue3, booleanValue2, gradientDrawable, drawable, maxLoadedTabCount != null ? maxLoadedTabCount.intValue() : 4, scrollTabModuleInfo.getContentBackgroundColor());
        }
    }

    private final List<ScrollTabConfigModel> getTabConfigModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e450b1541faf852934af9a9252afa32a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e450b1541faf852934af9a9252afa32a");
        }
        this.tabConfigModels = new ArrayList();
        ScrollTabModuleInfo scrollTabModuleInfo = this.moduleInfo;
        ArrayList<TabModuleConfigInfo> tabConfigs = scrollTabModuleInfo != null ? scrollTabModuleInfo.getTabConfigs() : null;
        if (tabConfigs != null && tabConfigs.size() != 0) {
            int size = tabConfigs.size();
            for (int i = 0; i < size; i++) {
                TabModuleConfigInfo tabModuleConfigInfo = tabConfigs.get(i);
                if (tabModuleConfigInfo != null) {
                    h.a((Object) tabModuleConfigInfo, "tabConfigArray[i] ?: continue");
                    String valueOf = String.valueOf(i);
                    String title = tabModuleConfigInfo.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    ScrollTabConfigModel scrollTabConfigModel = new ScrollTabConfigModel(valueOf, title);
                    String configKey = tabModuleConfigInfo.getConfigKey();
                    List<ArrayList<c>> a = !TextUtils.isEmpty(configKey) ? f.a().a(getContext(), configKey) : null;
                    if (a == null || a.isEmpty()) {
                        a = DMUtils.getModuleConfigItems(tabModuleConfigInfo.getModuleKeys());
                    }
                    ArrayList<ArrayList<c>> arrayList = new ArrayList<>();
                    if (a != null) {
                        arrayList.addAll(a);
                    }
                    scrollTabConfigModel.setModuleItemKeys(arrayList);
                    HashMap<String, Object> extraInfo = tabModuleConfigInfo.getExtraInfo();
                    if (extraInfo != null) {
                        Object fromJson = new Gson().fromJson(extraInfo.toString(), (Type) HashMap.class);
                        h.a(fromJson, "Gson().fromJson<HashMap<…g(), HashMap::class.java)");
                        scrollTabConfigModel.setArguments((HashMap) fromJson);
                    }
                    TabModulesVCInfo vcSetting = tabModuleConfigInfo.getVcSetting();
                    if (vcSetting != null) {
                        Bundle bundle = new Bundle();
                        ModulesVCSettingInfo settingInfo = vcSetting.getSettingInfo();
                        if (settingInfo != null) {
                            ModulesVCSettingInfoKt.addToBundle(settingInfo, bundle);
                        }
                        SeparatorLineInfo separatorLineInfo = vcSetting.getSeparatorLineInfo();
                        if (separatorLineInfo != null) {
                            SeparatorLineInfoKt.addToBundle(separatorLineInfo, bundle);
                        }
                        DragRefreshInfo dragRefreshInfo = vcSetting.getDragRefreshInfo();
                        if (dragRefreshInfo != null) {
                            DragRefreshInfoKt.addToBundle(dragRefreshInfo, bundle);
                        }
                        String backgroundColor = vcSetting.getBackgroundColor();
                        if (backgroundColor != null) {
                            bundle.putString("backgroundColor", backgroundColor);
                        }
                        String pageBackgroundColor = vcSetting.getPageBackgroundColor();
                        if (pageBackgroundColor != null) {
                            bundle.putString("pageBackgroundColor", pageBackgroundColor);
                        }
                        MPTInfo mptInfo = vcSetting.getMptInfo();
                        if (mptInfo != null) {
                            MPTInfoKt.addToBundle(mptInfo, bundle);
                        }
                        Integer cancelPullToRefreshThreshold = vcSetting.getCancelPullToRefreshThreshold();
                        if (cancelPullToRefreshThreshold != null) {
                            bundle.putInt(DMKeys.KEY_CANCEL_PULL_TO_REFRESH_THRESHOLD, cancelPullToRefreshThreshold.intValue());
                        }
                        Boolean enableBounce = vcSetting.getEnableBounce();
                        if (enableBounce != null) {
                            bundle.putBoolean(DMKeys.KEY_ENABLE_BOUNCE, enableBounce.booleanValue());
                        }
                        Boolean showScrollIndicator = vcSetting.getShowScrollIndicator();
                        if (showScrollIndicator != null) {
                            bundle.putBoolean(DMKeys.KEY_SHOW_SCROLL_INDICATOR, showScrollIndicator.booleanValue());
                        }
                        scrollTabConfigModel.setPageArgument(bundle);
                    }
                    scrollTabConfigModel.setTabKey(tabModuleConfigInfo.getTabKey());
                    this.tabConfigModels.add(scrollTabConfigModel);
                }
            }
        }
        return this.tabConfigModels;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ae21acc5b98077883fe73917fceaff6", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ae21acc5b98077883fe73917fceaff6");
        }
        h.b(str, "identifier");
        TabRowItem tabRowItem = getTabRowItem();
        if (!(tabRowItem instanceof DynamicTabModuleRowItem)) {
            tabRowItem = null;
        }
        DynamicTabModuleRowItem dynamicTabModuleRowItem = (DynamicTabModuleRowItem) tabRowItem;
        if (dynamicTabModuleRowItem != null) {
            return dynamicTabModuleRowItem.findPicassoViewItemByIdentifier(str);
        }
        return null;
    }
}
