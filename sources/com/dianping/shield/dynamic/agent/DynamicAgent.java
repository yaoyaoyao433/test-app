package com.dianping.shield.dynamic.agent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.v;
import com.dianping.picassomodule.widget.normal.a;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.IPageContainerFunc;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.diff.module.ModuleInfoDiff;
import com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.items.viewcell.DynamicViewCellItem;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.template.PaintingItemCallback;
import com.dianping.shield.dynamic.template.PaintingItemTemplate;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.widget.DMDialog;
import com.dianping.shield.feature.HotZoneItemStatusInterface;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
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
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007B'\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u000e\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020K2\u0006\u0010N\u001a\u00020QJ\u0006\u0010R\u001a\u00020KJ-\u0010S\u001a\u00020K2\u0006\u0010T\u001a\u00020\u001e2\u0016\u0010U\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010W0V\"\u0004\u0018\u00010WH\u0016¢\u0006\u0002\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\u001eH\u0016J\u0018\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010^\u0018\u00010]H\u0016J\n\u0010_\u001a\u0004\u0018\u00010`H\u0016J\n\u0010a\u001a\u0004\u0018\u00010bH\u0016J\b\u0010c\u001a\u00020dH$J\n\u0010e\u001a\u0004\u0018\u00010fH\u0016J\u000e\u0010g\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016J\n\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u0006\u0010j\u001a\u00020KJ\b\u0010k\u001a\u00020KH\u0002J\u0012\u0010l\u001a\u00020K2\b\u0010m\u001a\u0004\u0018\u00010nH\u0016J\b\u0010o\u001a\u00020KH\u0016J\u0010\u0010p\u001a\u00020K2\u0006\u0010N\u001a\u00020qH\u0016J\u0010\u0010r\u001a\u00020K2\u0006\u0010N\u001a\u00020sH\u0016J\b\u0010t\u001a\u00020KH\u0004J\b\u0010u\u001a\u00020KH\u0016J\u0010\u0010v\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020K2\u0006\u0010y\u001a\u00020)H\u0016J\b\u0010z\u001a\u00020KH\u0016J\u0012\u0010{\u001a\u00020K2\b\u0010|\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010}\u001a\u00020KH\u0002J\u0013\u0010~\u001a\u00020K2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0004\u0018\u00010\u001eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010;\u001a\u0004\u0018\u00010:2\b\u00109\u001a\u0004\u0018\u00010:@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020)X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010+\"\u0004\bD\u0010-R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010+\"\u0004\bI\u0010-¨\u0006\u0081\u0001"}, d2 = {"Lcom/dianping/shield/dynamic/agent/DynamicAgent;", "Lcom/dianping/agentsdk/agent/HoloAgent;", "Lcom/dianping/shield/dynamic/protocols/ICommonHost;", "Lcom/dianping/shield/dynamic/protocols/DynamicViewItemsHolderInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/module/ModuleInfo;", "Lcom/dianping/shield/dynamic/protocols/DynamicRefreshInterface;", "fragment", "Landroid/support/v4/app/Fragment;", "featureBridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "dmDialog", "Lcom/dianping/shield/dynamic/widget/DMDialog;", "dynamicExecEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "getDynamicExecEnvironment", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "setDynamicExecEnvironment", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;)V", "dynamicViewCellItem", "Lcom/dianping/shield/dynamic/items/viewcell/DynamicViewCellItem;", "getDynamicViewCellItem", "()Lcom/dianping/shield/dynamic/items/viewcell/DynamicViewCellItem;", "setDynamicViewCellItem", "(Lcom/dianping/shield/dynamic/items/viewcell/DynamicViewCellItem;)V", "fragmentGABusiness", "", "getFragmentGABusiness", "()Ljava/lang/String;", "setFragmentGABusiness", "(Ljava/lang/String;)V", "isAddListener", "", "()Z", "setAddListener", "(Z)V", "leftCellMargin", "", "getLeftCellMargin", "()I", "setLeftCellMargin", "(I)V", "mRefreshSubscription", "Lrx/Subscription;", "moduleKey", "getModuleKey", "setModuleKey", "newTabListener", "Lcom/dianping/shield/feature/HotZoneItemStatusInterface;", "getNewTabListener", "()Lcom/dianping/shield/feature/HotZoneItemStatusInterface;", "setNewTabListener", "(Lcom/dianping/shield/feature/HotZoneItemStatusInterface;)V", "value", "Lcom/dianping/picassomodule/widget/normal/NormalView;", "normalView", "getNormalView", "()Lcom/dianping/picassomodule/widget/normal/NormalView;", "setNormalView", "(Lcom/dianping/picassomodule/widget/normal/NormalView;)V", "normalViewHideListener", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "paintingCount", "getPaintingCount", "setPaintingCount", "paintingItemTemplate", "Lcom/dianping/shield/dynamic/template/PaintingItemTemplate;", "rightCellMargin", "getRightCellMargin", "setRightCellMargin", "addTabAnchorListener", "", "callHostNeedLoadMore", "callHostOnAppear", "type", "Lcom/dianping/shield/dynamic/utils/DMConstant$ModuleOnAppearType;", "callHostOnDisappear", "Lcom/dianping/shield/dynamic/utils/DMConstant$ModuleOnDisappearType;", "callHostRetryForLoadingFail", "callMethod", "method", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getHostContext", "Landroid/content/Context;", "getPageContainer", "getSectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "gotoLogin", "initCurrentModuleStruct", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPageAppear", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "onPaintSuccess", "onPause", d.p, "Lrx/Observable;", "onRefreshEnd", "refreshId", "onResume", "painting", "moduleInfo", "removeTabAnchorListener", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicAgent extends HoloAgent implements DynamicChassisInterface, DynamicRefreshInterface, DynamicViewItemsHolderInterface, ICommonHost, IDynamicPaintingCallback<ModuleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public DMDialog dmDialog;
    @Nullable
    private DynamicExecEnvironment dynamicExecEnvironment;
    @Nullable
    private DynamicViewCellItem dynamicViewCellItem;
    @NotNull
    private String fragmentGABusiness;
    private boolean isAddListener;
    private int leftCellMargin;
    private k mRefreshSubscription;
    @Nullable
    private String moduleKey;
    @Nullable
    private HotZoneItemStatusInterface newTabListener;
    @Nullable
    private a normalView;
    private RecyclerView.k normalViewHideListener;
    private int paintingCount;
    private PaintingItemTemplate paintingItemTemplate;
    private int rightCellMargin;

    @NotNull
    public abstract DynamicMappingInterface getDynamicMapping();

    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58e574a5c46b13cdefbe92e5c12ee661", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58e574a5c46b13cdefbe92e5c12ee661") : DynamicChassisInterface.DefaultImpls.getContainerThemePackage(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da4a4bd742a820a665e77af0349eef7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da4a4bd742a820a665e77af0349eef7a");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        DynamicChassisInterface.DefaultImpls.refreshHostViewItem(this, iDynamicModuleViewItem);
    }

    public DynamicAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8085a3dc2a482392deb427087dd07c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8085a3dc2a482392deb427087dd07c3");
            return;
        }
        this.fragmentGABusiness = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        DynamicMappingInterface.EnvCreator execEnvironment = getDynamicMapping().getExecEnvironment("Dynamic_Module");
        if (execEnvironment != null) {
            this.dynamicExecEnvironment = execEnvironment.initExecEnvironment(this, this);
            DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
            if (dynamicExecEnvironment != null) {
                dynamicExecEnvironment.setHostReloadCallback(new DynamicAgentHostReloadCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicAgent.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback
                    public final void reloadHost(Object[] objArr2) {
                        Object[] objArr3 = {objArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f769aba5cde8599df061e635a57311b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f769aba5cde8599df061e635a57311b0");
                        } else {
                            DynamicAgent.this.initCurrentModuleStruct();
                        }
                    }
                });
            }
        }
    }

    @Nullable
    public final a getNormalView() {
        return this.normalView;
    }

    public final void setNormalView(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42ca7ed625dfc609576c60de39654d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42ca7ed625dfc609576c60de39654d74");
            return;
        }
        if (this.normalView == null && (getPageContainer() instanceof IPageContainerFunc)) {
            this.normalViewHideListener = new RecyclerView.k() { // from class: com.dianping.shield.dynamic.agent.DynamicAgent$normalView$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(@Nullable RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82d3393345ef384d812196fc5824c29f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82d3393345ef384d812196fc5824c29f");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    a normalView = DynamicAgent.this.getNormalView();
                    if (normalView != null) {
                        normalView.a();
                    }
                }
            };
            ab<?> pageContainer = getPageContainer();
            if (pageContainer == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.container.IPageContainerFunc");
            }
            ((IPageContainerFunc) pageContainer).addScrollListener(this.normalViewHideListener);
        }
        this.normalView = aVar;
    }

    public final int getLeftCellMargin() {
        return this.leftCellMargin;
    }

    public final void setLeftCellMargin(int i) {
        this.leftCellMargin = i;
    }

    public final int getRightCellMargin() {
        return this.rightCellMargin;
    }

    public final void setRightCellMargin(int i) {
        this.rightCellMargin = i;
    }

    @Nullable
    public final HotZoneItemStatusInterface getNewTabListener() {
        return this.newTabListener;
    }

    public final void setNewTabListener(@Nullable HotZoneItemStatusInterface hotZoneItemStatusInterface) {
        this.newTabListener = hotZoneItemStatusInterface;
    }

    public final boolean isAddListener() {
        return this.isAddListener;
    }

    public final void setAddListener(boolean z) {
        this.isAddListener = z;
    }

    @Nullable
    public final DynamicExecEnvironment getDynamicExecEnvironment() {
        return this.dynamicExecEnvironment;
    }

    public final void setDynamicExecEnvironment(@Nullable DynamicExecEnvironment dynamicExecEnvironment) {
        this.dynamicExecEnvironment = dynamicExecEnvironment;
    }

    @Nullable
    public final String getModuleKey() {
        return this.moduleKey;
    }

    public final void setModuleKey(@Nullable String str) {
        this.moduleKey = str;
    }

    @Nullable
    public final DynamicViewCellItem getDynamicViewCellItem() {
        return this.dynamicViewCellItem;
    }

    public final void setDynamicViewCellItem(@Nullable DynamicViewCellItem dynamicViewCellItem) {
        this.dynamicViewCellItem = dynamicViewCellItem;
    }

    public final int getPaintingCount() {
        return this.paintingCount;
    }

    public final void setPaintingCount(int i) {
        this.paintingCount = i;
    }

    @NotNull
    public final String getFragmentGABusiness() {
        return this.fragmentGABusiness;
    }

    public final void setFragmentGABusiness(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "700cee63c3800af27e227f964e100248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "700cee63c3800af27e227f964e100248");
            return;
        }
        h.b(str, "<set-?>");
        this.fragmentGABusiness = str;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "201930c0ed29f8bae0f74825ca0514d6", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "201930c0ed29f8bae0f74825ca0514d6") : getContext();
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0750611e37473ead8fcc9e85d79e2057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0750611e37473ead8fcc9e85d79e2057");
            return;
        }
        h.b(pageAppearType, "type");
        super.onPageAppear(pageAppearType);
        DynamicHostInterface dynamicHost = getDynamicHost();
        if (dynamicHost != null) {
            dynamicHost.onPageAppear(pageAppearType);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7cca01e47d6e41cd126d07aa661c061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7cca01e47d6e41cd126d07aa661c061");
            return;
        }
        h.b(pageDisappearType, "type");
        super.onPageDisappear(pageDisappearType);
        DynamicHostInterface dynamicHost = getDynamicHost();
        if (dynamicHost != null) {
            dynamicHost.onPageDisappear(pageDisappearType);
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3c85f255ce01a842431eb7d4a9bf60e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3c85f255ce01a842431eb7d4a9bf60e");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getExecutor();
        }
        return null;
    }

    @Nullable
    public DynamicHostInterface getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44054b008969916e8593a9dd1c6b65ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44054b008969916e8593a9dd1c6b65ab");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getHost();
        }
        return null;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(@Nullable Bundle bundle) {
        PaintingItemTemplate paintingItemTemplate;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6ea836dc03f52a2c8cff37aec369420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6ea836dc03f52a2c8cff37aec369420");
            return;
        }
        super.onCreate(bundle);
        if (this.fragment instanceof ShieldGAInterface) {
            Fragment fragment = this.fragment;
            if (fragment == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.monitor.ShieldGAInterface");
            }
            this.fragmentGABusiness = ((ShieldGAInterface) fragment).getShieldGAInfo().getBusiness();
        }
        this.dynamicViewCellItem = new DynamicViewCellItem(new ModuleInfoDiff(this));
        this.paintingItemTemplate = new PaintingItemTemplate();
        DynamicExecutorInterface dynamicExecutor = getDynamicExecutor();
        if (dynamicExecutor != null && (paintingItemTemplate = this.paintingItemTemplate) != null) {
            paintingItemTemplate.initWithExecutor(dynamicExecutor);
        }
        this.leftCellMargin = getContainerThemePackage().getLeftMargin();
        this.rightCellMargin = getContainerThemePackage().getRightMargin();
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onCreate();
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public rx.d<Object> onRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7da966ba4f9b88f900ed0b19352f67f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7da966ba4f9b88f900ed0b19352f67f5");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.refreshHost();
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicRefreshInterface
    public void onRefreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15efae939df1ad6fd10f229bb7f70db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15efae939df1ad6fd10f229bb7f70db2");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshEnd(i);
        }
    }

    public final void addTabAnchorListener() {
        HotZoneItemStatusInterface hotZoneItemStatusInterface;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8af2fd28541aeeb709c555c1771f4817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8af2fd28541aeeb709c555c1771f4817");
        } else if (!(getHostCellManager() instanceof ShieldNodeCellManager) || this.isAddListener || (hotZoneItemStatusInterface = this.newTabListener) == null) {
        } else {
            j hostCellManager = getHostCellManager();
            if (hostCellManager == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
            }
            ((ShieldNodeCellManager) hostCellManager).addHotZoneItemStatusObserver(hotZoneItemStatusInterface, true, true);
            this.isAddListener = true;
        }
    }

    private final void removeTabAnchorListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "236fafdd3e3d9aabda821ba48c5d5fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "236fafdd3e3d9aabda821ba48c5d5fa0");
            return;
        }
        HotZoneItemStatusInterface hotZoneItemStatusInterface = this.newTabListener;
        if (hotZoneItemStatusInterface == null || !(getHostCellManager() instanceof ShieldNodeCellManager)) {
            return;
        }
        j hostCellManager = getHostCellManager();
        if (hostCellManager == null) {
            throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
        }
        ((ShieldNodeCellManager) hostCellManager).removeHotZoneItemStatusObserver(hotZoneItemStatusInterface);
        this.isAddListener = false;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d5d0c0d04d02a65e21557e46391bf57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d5d0c0d04d02a65e21557e46391bf57");
            return;
        }
        super.onResume();
        addTabAnchorListener();
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onResume();
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a8356c3e93cb5798722c368cdab88c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a8356c3e93cb5798722c368cdab88c8");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onPause();
        }
        removeTabAnchorListener();
        super.onPause();
    }

    @Override // com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a20192703007e10fa9a16453ebe36b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a20192703007e10fa9a16453ebe36b8");
            return;
        }
        ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
        List<Float> asList = Arrays.asList(Float.valueOf(this.paintingCount * 1.0f));
        h.a((Object) asList, "Arrays.asList(paintingCount * 1f)");
        obtain.addValues(ShieldMonitorKey.MFDynamicModulePaint, asList).addTag("type", getShieldGAInfo().getType().getType()).addTag(ShieldMonitorKey.TAG_BUSINESS, getShieldGAInfo().getBusiness()).send();
        DMDialog dMDialog = this.dmDialog;
        if (dMDialog != null) {
            dMDialog.destroy();
        }
        this.dmDialog = null;
        k kVar = this.mRefreshSubscription;
        if (kVar != null) {
            kVar.unsubscribe();
        }
        this.mRefreshSubscription = null;
        PaintingItemTemplate paintingItemTemplate = this.paintingItemTemplate;
        if (paintingItemTemplate != null) {
            paintingItemTemplate.destroy();
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onDestroy();
        }
        this.dynamicExecEnvironment = null;
        if (getPageContainer() instanceof IPageContainerFunc) {
            ab<?> pageContainer = getPageContainer();
            if (pageContainer == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.container.IPageContainerFunc");
            }
            ((IPageContainerFunc) pageContainer).removeScrollListener(this.normalViewHideListener);
        }
        this.pageContainer = null;
        super.onDestroy();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a5404871c81bc19193079c9a066ee5", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a5404871c81bc19193079c9a066ee5");
        }
        h.b(str, "identifier");
        DynamicViewCellItem dynamicViewCellItem = this.dynamicViewCellItem;
        if (dynamicViewCellItem != null) {
            return dynamicViewCellItem.findPicassoViewItemByIdentifier(str);
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable ModuleInfo moduleInfo) {
        Object[] objArr = {moduleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3423d84d9c98a53e17f2c373ac8a0238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3423d84d9c98a53e17f2c373ac8a0238");
        } else if (getContext() == null || this.dynamicExecEnvironment == null) {
        } else {
            this.paintingCount++;
            DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
            if (dynamicExecEnvironment != null) {
                dynamicExecEnvironment.onMonitorPaintingStart();
            }
            if (this.paintingItemTemplate == null || this.dynamicViewCellItem == null || moduleInfo == null) {
                return;
            }
            ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.Companion.getModuleKey(this.fragmentGABusiness, getShieldGAInfo().getBusiness(), 3));
            ArrayList<ComputeUnit> arrayList = new ArrayList<>();
            DynamicViewCellItem dynamicViewCellItem = this.dynamicViewCellItem;
            if (dynamicViewCellItem != null) {
                dynamicViewCellItem.diff2(moduleInfo, arrayList, (Integer) 0, (Integer) 0);
            }
            ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.Companion.getModuleKey(this.fragmentGABusiness, getShieldGAInfo().getBusiness(), 3), ShieldSpeedStep.MF_STEP_COMPUTE_START.getStep());
            PaintingItemTemplate paintingItemTemplate = this.paintingItemTemplate;
            if (paintingItemTemplate != null) {
                paintingItemTemplate.painting(arrayList, new PaintingItemCallback() { // from class: com.dianping.shield.dynamic.agent.DynamicAgent$painting$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.template.PaintingItemCallback
                    public final void onPaintingFinish(@NotNull Set<String> set) {
                        Object[] objArr2 = {set};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6cc10d2b4cc0a7eb8baf6367aa89af26", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6cc10d2b4cc0a7eb8baf6367aa89af26");
                            return;
                        }
                        h.b(set, "errorSet");
                        ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.Companion.getModuleKey(DynamicAgent.this.getFragmentGABusiness(), DynamicAgent.this.getShieldGAInfo().getBusiness(), 3), ShieldSpeedStep.MF_STEP_PAINTING_END.getStep());
                        ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.Companion.getModuleKey(DynamicAgent.this.getFragmentGABusiness(), DynamicAgent.this.getShieldGAInfo().getBusiness(), 3));
                        DynamicViewCellItem dynamicViewCellItem2 = DynamicAgent.this.getDynamicViewCellItem();
                        if (dynamicViewCellItem2 != null) {
                            dynamicViewCellItem2.onComputingComplete();
                        }
                        DynamicAgent.this.addTabAnchorListener();
                        DynamicAgent.this.updateAgentCell();
                        if (DynamicAgent.this.getDynamicExecEnvironment() != null) {
                            DynamicExecEnvironment dynamicExecEnvironment2 = DynamicAgent.this.getDynamicExecEnvironment();
                            if (dynamicExecEnvironment2 != null) {
                                dynamicExecEnvironment2.onMonitorPaintingEnd(set);
                            }
                            DynamicAgent.this.onPaintSuccess();
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
        DynamicExecutorInterface dynamicExecutor;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a73ceccf99577745740c8118cd0396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a73ceccf99577745740c8118cd0396");
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
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90f0fab0b40c03cd105f441d188b584e", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90f0fab0b40c03cd105f441d188b584e") : getArguments();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initCurrentModuleStruct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497ac2066c9379ac8f9e05c4efdf8551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497ac2066c9379ac8f9e05c4efdf8551");
        } else {
            this.dynamicViewCellItem = new DynamicViewCellItem(new ModuleInfoDiff(this));
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    @Nullable
    public ShieldSectionCellItem getSectionCellItem() {
        return this.dynamicViewCellItem;
    }

    public final void gotoLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f14a9e29c343a91fb7c3c82063b3dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f14a9e29c343a91fb7c3c82063b3dd1");
        } else {
            this.bridge.gotoLogin();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ab<?> getPageContainer() {
        return this.pageContainer;
    }

    public final void onPaintSuccess() {
        DynamicHostInterface host;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ff7cbf57022a6af584f20b94cfa4eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ff7cbf57022a6af584f20b94cfa4eb7");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment == null || (host = dynamicExecEnvironment.getHost()) == null) {
            return;
        }
        host.onPaintingSucess();
    }

    public final void callHostRetryForLoadingFail() {
        DynamicHostInterface host;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bff8adbe142635c2837818571afa597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bff8adbe142635c2837818571afa597");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment == null || (host = dynamicExecEnvironment.getHost()) == null) {
            return;
        }
        host.onRetryForLoadingFail();
    }

    public final void callHostNeedLoadMore() {
        DynamicHostInterface host;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e8b1dc0493c9ffd8ba96fc92dbacdfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e8b1dc0493c9ffd8ba96fc92dbacdfa");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment == null || (host = dynamicExecEnvironment.getHost()) == null) {
            return;
        }
        host.onNeedLoadMore();
    }

    public final void callHostOnAppear(@NotNull DMConstant.ModuleOnAppearType moduleOnAppearType) {
        DynamicHostInterface host;
        Object[] objArr = {moduleOnAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8569fe79d4291c20c8344ccca8582457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8569fe79d4291c20c8344ccca8582457");
            return;
        }
        h.b(moduleOnAppearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", moduleOnAppearType.getId());
        } catch (JSONException unused) {
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment == null || (host = dynamicExecEnvironment.getHost()) == null) {
            return;
        }
        host.onAppear(jSONObject);
    }

    public final void callHostOnDisappear(@NotNull DMConstant.ModuleOnDisappearType moduleOnDisappearType) {
        DynamicHostInterface host;
        Object[] objArr = {moduleOnDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f04ba182bdad58a02a161efe2d3db5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f04ba182bdad58a02a161efe2d3db5ce");
            return;
        }
        h.b(moduleOnDisappearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", moduleOnDisappearType.getId());
        } catch (JSONException unused) {
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment == null || (host = dynamicExecEnvironment.getHost()) == null) {
            return;
        }
        host.onDisappear(jSONObject);
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "637c425b5304b8ca03298322ed5e0267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "637c425b5304b8ca03298322ed5e0267");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
