package com.dianping.shield.dynamic.fragments;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.v;
import com.dianping.eunomia.c;
import com.dianping.eunomia.debug.a;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.config.HornFallbackSwitch;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.vc.BaseModulesVCInfoDiff;
import com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.items.vc.DynamicModulesVCItem;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.extra.ColorUnionType;
import com.dianping.shield.dynamic.model.extra.MPTInfo;
import com.dianping.shield.dynamic.model.vc.DragRefreshInfo;
import com.dianping.shield.dynamic.model.vc.ModulesVCInfo;
import com.dianping.shield.dynamic.model.vc.ModulesVCSettingInfo;
import com.dianping.shield.dynamic.model.vc.SeparatorLineInfo;
import com.dianping.shield.dynamic.model.vc.TitleBarInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.template.PaintingItemCallback;
import com.dianping.shield.dynamic.template.PaintingItemTemplate;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.PageAgentsPersistenceParams;
import com.dianping.shield.entity.PageDividerThemeParams;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.dianping.shield.preload.ShieldPreloadUnit;
import com.dianping.voyager.fragment.CommonShieldFragment;
import com.dianping.voyager.widgets.container.LoadErrorEmptyView;
import com.dianping.voyager.widgets.container.a;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.functions.b;
import rx.functions.g;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u0090\u00012\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006:\u0004\u0090\u0001\u0091\u0001B\u0005¢\u0006\u0002\u0010\u0007J-\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00172\u0016\u0010@\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0A\"\u0004\u0018\u00010%H\u0016¢\u0006\u0002\u0010BJ\u000e\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020EJ\b\u0010F\u001a\u00020\u0017H\u0016J\b\u0010G\u001a\u00020HH\u0016J\u0018\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010K\u0018\u00010JH\u0016J\n\u0010L\u001a\u0004\u0018\u00010MH\u0016J\n\u0010N\u001a\u0004\u0018\u00010OH\u0016J\n\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u00020SH\u0016J\f\u0010T\u001a\u0006\u0012\u0002\b\u00030UH\u0016J\b\u0010V\u001a\u00020>H\u0002J\u000e\u0010W\u001a\b\u0012\u0002\b\u0003\u0018\u00010XH\u0016J\b\u0010Y\u001a\u00020>H\u0014J\u0012\u0010Z\u001a\u00020>2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u0010\u0010]\u001a\u00020>2\b\u0010-\u001a\u0004\u0018\u00010.J\u0012\u0010^\u001a\u00020>2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010_\u001a\u00020>H\u0016J\u0010\u0010`\u001a\u00020>2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020>2\u0006\u0010a\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020>H\u0016J\u0010\u0010f\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010gH\u0016J\u0010\u0010h\u001a\u00020>2\u0006\u0010i\u001a\u00020*H\u0016J\b\u0010j\u001a\u00020>H\u0016J\u0012\u0010k\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010m\u001a\u00020>H\u0004J\b\u0010n\u001a\u00020>H\u0002J\u0012\u0010o\u001a\u00020>2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\u000e\u0010r\u001a\u00020>2\u0006\u0010;\u001a\u00020<J\b\u0010s\u001a\u00020>H\u0002J\b\u0010t\u001a\u00020>H\u0002J\u0012\u0010u\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010u\u001a\u00020>2\b\u0010v\u001a\u0004\u0018\u00010\u0017H\u0002J\u0017\u0010w\u001a\u00020>2\b\u0010x\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010yJ\u0012\u0010z\u001a\u00020>2\b\u0010{\u001a\u0004\u0018\u00010|H\u0002J\u0012\u0010}\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0004J\u0012\u0010~\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u007f\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0002J\u0013\u0010\u0080\u0001\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010\u0081\u0001\u001a\u00020>2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0002J\u0019\u0010\u0084\u0001\u001a\u00020>2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010yJ\u0015\u0010\u0086\u0001\u001a\u00020>2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0002J\u0015\u0010\u0089\u0001\u001a\u00020>2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0002J\u0015\u0010\u008c\u0001\u001a\u00020>2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002J\u0013\u0010\u008f\u0001\u001a\u00020>2\b\u0010l\u001a\u0004\u0018\u00010\u0005H\u0002R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020*X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0092\u0001"}, d2 = {"Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment;", "Lcom/dianping/voyager/fragment/CommonShieldFragment;", "Lcom/dianping/shield/dynamic/protocols/ICommonHost;", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/vc/ModulesVCInfo;", "Lcom/dianping/shield/dynamic/protocols/DynamicRefreshInterface;", "()V", "commonPageContainer", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "getCommonPageContainer", "()Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "dynamicExecEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "getDynamicExecEnvironment", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "setDynamicExecEnvironment", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;)V", "dynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getDynamicMapping", "()Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "handleId", "", "isFirstResumed", "", "isFirstResumed$shieldDynamic_release", "()Z", "setFirstResumed$shieldDynamic_release", "(Z)V", "isPaint", "isPaint$shieldDynamic_release", "setPaint$shieldDynamic_release", "isStatisticsByRemote", "setStatisticsByRemote", "labMap", "", "", "mBackgroundColorSubscription", "Lrx/Subscription;", "mRefreshSubscription", "needsLoginStatus", "", "nestscroll", "pageInfoKey", "pageItem", "Lcom/dianping/shield/dynamic/items/vc/DynamicModulesVCItem;", "paintingCount", "getPaintingCount", "()I", "setPaintingCount", "(I)V", "paintingTemplate", "Lcom/dianping/shield/dynamic/template/PaintingItemTemplate;", "recyclerViewOnFlingListener", "Landroid/support/v7/widget/RecyclerView$OnFlingListener;", "sakstCategory", "sakstCid", "shieldType", "statisticsListener", "Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment$OnStatisticsListener;", "callMethod", "", "method", "params", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "disableAutoStatistics", PushConstants.INTENT_ACTIVITY_NAME, "Landroid/app/Activity;", "getAliasName", "getBridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "getHostContext", "Landroid/content/Context;", "getHostFragment", "Landroid/support/v4/app/Fragment;", "initCellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "initStatistics", "initializePageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "loadPageInfo", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onComputingComplete", "onCreate", "onDestroy", "onPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "onPause", d.p, "Lrx/Observable;", "onRefreshEnd", "refreshId", "onResume", "painting", "modulesVCInfo", "refreshPage", "removeFlingListener", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "setStatisticsListener", "statisticsPageDisappear", "statisticsPageView", "updateBackgroundColor", "colorStr", "updateDisableFling", "disableFling", "(Ljava/lang/Boolean;)V", "updateDragRefreshInfo", DMKeys.KEY_VC_INFO_DRAG_REFRESH_INFO, "Lcom/dianping/shield/dynamic/model/vc/DragRefreshInfo;", "updateExtraView", "updateFrozenInfo", "updateLoadingStatus", "updateModulesConfig", "updateMptInfo", DMKeys.KEY_VC_INFO_MPT_INFO, "Lcom/dianping/shield/dynamic/model/extra/MPTInfo;", "updateScrollEnabledInfo", "scrollEnabled", "updateSeparatorLineInfo", "separatorLineInfo", "Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "updateSettingInfo", DMKeys.KEY_VC_INFO_SETTING_INFO, "Lcom/dianping/shield/dynamic/model/vc/ModulesVCSettingInfo;", "updateTitleBarInfo", DMKeys.KEY_VC_INFO_TITLE_BAR_INFO, "Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;", "updateVCInfo", "Companion", "OnStatisticsListener", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicModulesFragment extends CommonShieldFragment implements DynamicChassisInterface, DynamicRefreshInterface, ICommonHost, IDynamicPaintingCallback<ModulesVCInfo> {
    public static final Companion Companion = new Companion(null);
    private static final int NEED_LOGIN = 1;
    private static final int SHIELD_DATA = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    @Nullable
    private DynamicExecEnvironment dynamicExecEnvironment;
    private String handleId;
    private boolean isFirstResumed;
    private boolean isPaint;
    private boolean isStatisticsByRemote;
    private Map<String, ? extends Object> labMap;
    private k mBackgroundColorSubscription;
    private k mRefreshSubscription;
    private int needsLoginStatus;
    private boolean nestscroll;
    private String pageInfoKey;
    private DynamicModulesVCItem pageItem;
    private int paintingCount;
    private PaintingItemTemplate paintingTemplate;
    private RecyclerView.i recyclerViewOnFlingListener;
    private String sakstCategory;
    private String sakstCid;
    private int shieldType;
    private OnStatisticsListener statisticsListener;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment$OnStatisticsListener;", "", "onPageStatistics", "", DMKeys.KEY_VC_INFO_MPT_INFO, "Lorg/json/JSONObject;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface OnStatisticsListener {
        void onPageStatistics(@NotNull JSONObject jSONObject);
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    @NotNull
    public abstract DynamicMappingInterface getDynamicMapping();

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a538ff38c80f5286ea78f08ab2652ec", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a538ff38c80f5286ea78f08ab2652ec") : DynamicChassisInterface.DefaultImpls.getContainerThemePackage(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42be269edd72f743c6eed3e91691ff72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42be269edd72f743c6eed3e91691ff72");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        DynamicChassisInterface.DefaultImpls.refreshHostViewItem(this, iDynamicModuleViewItem);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dianping/shield/dynamic/fragments/DynamicModulesFragment$Companion;", "", "()V", "NEED_LOGIN", "", "getNEED_LOGIN", "()I", "SHIELD_DATA", "getSHIELD_DATA", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getNEED_LOGIN() {
            return DynamicModulesFragment.NEED_LOGIN;
        }

        public final int getSHIELD_DATA() {
            return DynamicModulesFragment.SHIELD_DATA;
        }
    }

    public final boolean isStatisticsByRemote() {
        return this.isStatisticsByRemote;
    }

    public final void setStatisticsByRemote(boolean z) {
        this.isStatisticsByRemote = z;
    }

    @Nullable
    public final DynamicExecEnvironment getDynamicExecEnvironment() {
        return this.dynamicExecEnvironment;
    }

    public final void setDynamicExecEnvironment(@Nullable DynamicExecEnvironment dynamicExecEnvironment) {
        this.dynamicExecEnvironment = dynamicExecEnvironment;
    }

    public final int getPaintingCount() {
        return this.paintingCount;
    }

    public final void setPaintingCount(int i) {
        this.paintingCount = i;
    }

    public final boolean isPaint$shieldDynamic_release() {
        return this.isPaint;
    }

    public final void setPaint$shieldDynamic_release(boolean z) {
        this.isPaint = z;
    }

    public final boolean isFirstResumed$shieldDynamic_release() {
        return this.isFirstResumed;
    }

    public final void setFirstResumed$shieldDynamic_release(boolean z) {
        this.isFirstResumed = z;
    }

    @Nullable
    public final CommonPageContainer getCommonPageContainer() {
        CommonPageContainer commonPageContainer = this.pageContainer;
        if (commonPageContainer == null) {
            return null;
        }
        return commonPageContainer;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public v getBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "825b1be60a4a0bf2fe682ea4d2def207", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "825b1be60a4a0bf2fe682ea4d2def207") : getShieldLifeCycler();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31b0ada0f685f6a637fbd2666a0b0b02", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31b0ada0f685f6a637fbd2666a0b0b02") : getContext();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd35ba60715618d0e5a2343d08a83c93", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd35ba60715618d0e5a2343d08a83c93") : getShieldArguments();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc79a03f26ceff8b85907b190205206d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc79a03f26ceff8b85907b190205206d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f15d9c6aafb0cdc9c0511fde7551220", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f15d9c6aafb0cdc9c0511fde7551220");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getHost();
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public Fragment getHostFragment() {
        return this;
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment
    @Nullable
    public ab<?> initializePageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10dd1c4fa8bc04be7b8e3ce4a21add71", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10dd1c4fa8bc04be7b8e3ce4a21add71");
        }
        this.pageContainer = (CommonPageContainer) super.initializePageContainer();
        if (this.pageContainer != null && !this.nestscroll) {
            CommonPageContainer commonPageContainer = this.pageContainer;
            h.a((Object) commonPageContainer, "pageContainer");
            ViewGroup agentContainerView = commonPageContainer.getAgentContainerView();
            if (agentContainerView instanceof RecyclerView) {
                ((RecyclerView) agentContainerView).setNestedScrollingEnabled(false);
            }
        }
        if (SHIELD_DATA == this.shieldType) {
            this.pageContainer.setLayoutManagerMode(LayoutMode.STAGGERED_GRID_LAYOUT_MANAGER);
        }
        return this.pageContainer;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    @NotNull
    public j<?> initCellManager() {
        j<ViewGroup> cellManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096d379d66ee016dab7b525cac2467a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096d379d66ee016dab7b525cac2467a9");
        }
        ShieldPreloadUnit shieldPreloadUnit = this.shieldPreloadUnit;
        if (shieldPreloadUnit == null || (cellManager = shieldPreloadUnit.getCellManager()) == null) {
            Context context = getContext();
            if (context == null) {
                h.a();
            }
            return new ShieldNodeCellManager(context);
        }
        return cellManager;
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75a00d7917281f1d232125d69bd5315a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75a00d7917281f1d232125d69bd5315a");
            return;
        }
        super.onCreate(bundle);
        this.isFirstResumed = false;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            disableAutoStatistics(activity);
        }
        this.needsLoginStatus = getIntParam("needslogin", 0);
        this.shieldType = getIntParam("shieldtype", SHIELD_DATA);
        this.nestscroll = getBooleanParam("nestscroll", true);
        initStatistics();
    }

    public final void refreshPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9be0fef16b1e6cac1fca16eadc5ab36f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9be0fef16b1e6cac1fca16eadc5ab36f");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshHost();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment
    @Nullable
    public rx.d<Object> onRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1174444ac8579f14315d602374cdcbfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1174444ac8579f14315d602374cdcbfe");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "466ff3a6e401c79bfdd4f33e0c384cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "466ff3a6e401c79bfdd4f33e0c384cb0");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshEnd(i);
        }
    }

    public void loadPageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82b523aabc30177246711fe4d4aecb9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82b523aabc30177246711fe4d4aecb9a");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onCreate();
        }
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        rx.d b;
        rx.d b2;
        PaintingItemTemplate paintingItemTemplate;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd392290a613970565984c58506495ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd392290a613970565984c58506495ee");
            return;
        }
        super.onActivityCreated(bundle);
        DynamicMappingInterface.EnvCreator execEnvironment = getDynamicMapping().getExecEnvironment("Dynamic_PAGE");
        if (execEnvironment != null) {
            this.dynamicExecEnvironment = execEnvironment.initExecEnvironment(this, this);
            DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
            if (dynamicExecEnvironment != null) {
                dynamicExecEnvironment.setHostReloadCallback(new DynamicAgentHostReloadCallback() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback
                    public final void reloadHost(Object[] objArr2) {
                        Object[] objArr3 = {objArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f96c22629f742337576d6e7fec9690f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f96c22629f742337576d6e7fec9690f");
                        } else {
                            DynamicModulesFragment.this.pageItem = new DynamicModulesVCItem(new BaseModulesVCInfoDiff(DynamicModulesFragment.this));
                        }
                    }
                });
            }
        }
        this.paintingTemplate = new PaintingItemTemplate();
        DynamicExecutorInterface dynamicExecutor = getDynamicExecutor();
        if (dynamicExecutor != null && (paintingItemTemplate = this.paintingTemplate) != null) {
            paintingItemTemplate.initWithExecutor(dynamicExecutor);
        }
        ar whiteBoard = getWhiteBoard();
        this.mBackgroundColorSubscription = (whiteBoard == null || (b = whiteBoard.b("pageBackgroundColor")) == null || (b2 = b.b((g) new g<Object, Boolean>() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public final /* synthetic */ Boolean call(Object obj) {
                return Boolean.valueOf(call2(obj));
            }

            /* renamed from: call  reason: avoid collision after fix types in other method */
            public final boolean call2(Object obj) {
                return obj instanceof String;
            }
        })) == null) ? null : b2.c(new b<Object>() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final void call(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6a5b012f23585716062c69f1e58ef14", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6a5b012f23585716062c69f1e58ef14");
                } else if (obj != null) {
                    DynamicModulesFragment.this.updateBackgroundColor((String) obj);
                } else {
                    throw new o("null cannot be cast to non-null type kotlin.String");
                }
            }
        });
        if (this.needsLoginStatus == NEED_LOGIN) {
            if (isLogin()) {
                loadPageInfo();
                return;
            }
            gotoLogin();
            ar whiteBoard2 = getWhiteBoard();
            this.handleId = whiteBoard2 != null ? whiteBoard2.a(DMConstant.LOGIN_KEY, new ar.a() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.agentsdk.framework.ar.a
                @Nullable
                public final Void handleMessage(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a13863931dfc6ebdc3ddce2f861b1e45", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a13863931dfc6ebdc3ddce2f861b1e45");
                    }
                    if (obj instanceof Boolean) {
                        if (((Boolean) obj).booleanValue()) {
                            DynamicModulesFragment.this.loadPageInfo();
                        } else {
                            FragmentActivity activity = DynamicModulesFragment.this.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        }
                        FragmentActivity activity2 = DynamicModulesFragment.this.getActivity();
                        if (activity2 != null) {
                            activity2.runOnUiThread(new Runnable() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$5.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str;
                                    ar whiteBoard3;
                                    String str2;
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "54a2580a8313e93254eaaa3020a9379e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "54a2580a8313e93254eaaa3020a9379e");
                                        return;
                                    }
                                    str = DynamicModulesFragment.this.handleId;
                                    if (TextUtils.isEmpty(str) || (whiteBoard3 = DynamicModulesFragment.this.getWhiteBoard()) == null) {
                                        return;
                                    }
                                    str2 = DynamicModulesFragment.this.handleId;
                                    if (str2 == null) {
                                        h.a();
                                    }
                                    whiteBoard3.a(str2);
                                }
                            });
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            }) : null;
        } else {
            loadPageInfo();
        }
        this.pageContainer.setLoadRetryListener(new LoadErrorEmptyView.b() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$onActivityCreated$6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.voyager.widgets.container.LoadErrorEmptyView.b
            public final void loadRetry(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b71c46318c7357a9a634de725c068d02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b71c46318c7357a9a634de725c068d02");
                } else {
                    DynamicModulesFragment.this.refreshPage();
                }
            }
        });
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.portal.fragment.HoloFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25130e9e59a44425a735b5b1d9c3a055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25130e9e59a44425a735b5b1d9c3a055");
            return;
        }
        k kVar = this.mBackgroundColorSubscription;
        if (kVar != null) {
            kVar.unsubscribe();
        }
        this.mBackgroundColorSubscription = null;
        PaintingItemTemplate paintingItemTemplate = this.paintingTemplate;
        if (paintingItemTemplate != null) {
            paintingItemTemplate.destroy();
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onDestroy();
        }
        this.dynamicExecEnvironment = null;
        k kVar2 = this.mRefreshSubscription;
        if (kVar2 != null) {
            kVar2.unsubscribe();
        }
        this.mRefreshSubscription = null;
        removeFlingListener();
        ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
        List<Float> asList = Arrays.asList(Float.valueOf(this.paintingCount * 1.0f));
        h.a((Object) asList, "Arrays.asList(paintingCount * 1f)");
        obtain.addValues(ShieldMonitorKey.MFDynamicModuleVCPaint, asList).addTag(ShieldMonitorKey.TAG_BUSINESS, getShieldGAInfo().getBusiness()).addTag("type", getShieldGAInfo().getType().getType()).send();
        super.onDestroy();
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable ModulesVCInfo modulesVCInfo) {
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4c913ba60092dc3009a78202bd36cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4c913ba60092dc3009a78202bd36cf");
        } else if (getContext() == null) {
        } else {
            ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.Companion.getPageKey(getAliasName(), 3));
            this.paintingCount++;
            updateVCInfo(modulesVCInfo);
            resetAgents();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80183425cd4862e7cf20a503bc43ba4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80183425cd4862e7cf20a503bc43ba4e");
            return;
        }
        h.b(pageAppearType, "type");
        DynamicHostInterface dynamicHost = getDynamicHost();
        if (dynamicHost != null) {
            dynamicHost.onPageAppear(pageAppearType);
        }
        super.onPageAppear(pageAppearType);
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b523a53c94b022bfc593229bfb26ccb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b523a53c94b022bfc593229bfb26ccb2");
            return;
        }
        h.b(pageDisappearType, "type");
        DynamicHostInterface dynamicHost = getDynamicHost();
        if (dynamicHost != null) {
            dynamicHost.onPageDisappear(pageDisappearType);
        }
        super.onPageDisappear(pageDisappearType);
    }

    private final void updateVCInfo(ModulesVCInfo modulesVCInfo) {
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d479cbab0907ccf5a33729fe7d2c856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d479cbab0907ccf5a33729fe7d2c856");
            return;
        }
        ShieldGlobalFeatureInterface feature = getFeature();
        if (feature != null) {
            PageDividerThemeParams needFirstHeader = PageDividerThemeParams.needFirstHeader(true);
            h.a((Object) needFirstHeader, "PageDividerThemeParams.needFirstHeader(true)");
            feature.setPageDividerTheme(needFirstHeader);
        }
        updateModulesConfig(modulesVCInfo);
        updateExtraView(modulesVCInfo);
        updateSeparatorLineInfo(modulesVCInfo != null ? modulesVCInfo.getSeparatorLineInfo() : null);
        updateSettingInfo(modulesVCInfo != null ? modulesVCInfo.getSettingInfo() : null);
        updateScrollEnabledInfo(modulesVCInfo != null ? modulesVCInfo.getScrollEnabled() : null);
        updateDragRefreshInfo(modulesVCInfo != null ? modulesVCInfo.getDragRefreshInfo() : null);
        updateTitleBarInfo(modulesVCInfo != null ? modulesVCInfo.getTitleBarInfo() : null);
        updateLoadingStatus(modulesVCInfo);
        updateBackgroundColor(modulesVCInfo);
        updateMptInfo(modulesVCInfo != null ? modulesVCInfo.getMptInfo() : null);
        updateFrozenInfo(modulesVCInfo);
        setDelayForAutoExpose(modulesVCInfo != null ? modulesVCInfo.getDelayForAutoExpose() : null);
        updateDisableFling(modulesVCInfo != null ? modulesVCInfo.getDisableFling() : null);
    }

    public final void updateExtraView(@Nullable final ModulesVCInfo modulesVCInfo) {
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f564fb20a4cfb9449af5b82e23669ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f564fb20a4cfb9449af5b82e23669ea");
            return;
        }
        ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.Companion.getPageKey(getAliasName(), 3), ShieldSpeedStep.MF_STEP_COMPUTE_START.getStep());
        if (modulesVCInfo != null) {
            final ArrayList<? extends IDynamicModuleViewItem> arrayList = new ArrayList<>();
            final DynamicModulesVCItem dynamicModulesVCItem = this.pageItem;
            if (dynamicModulesVCItem != null) {
                DynamicDiff.DefaultImpls.diff$default(dynamicModulesVCItem, modulesVCInfo, arrayList, null, null, 12, null);
                PaintingItemTemplate paintingItemTemplate = this.paintingTemplate;
                if (paintingItemTemplate != null) {
                    paintingItemTemplate.painting(arrayList, new PaintingItemCallback() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$updateExtraView$$inlined$let$lambda$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.shield.dynamic.template.PaintingItemCallback
                        public final void onPaintingFinish(@NotNull Set<String> set) {
                            DynamicModulesVCItem dynamicModulesVCItem2;
                            DynamicModulesVCItem dynamicModulesVCItem3;
                            Object[] objArr2 = {set};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30de4375eedb99d7ca7cfdb42ce1fdf5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30de4375eedb99d7ca7cfdb42ce1fdf5");
                                return;
                            }
                            h.b(set, "errorSet");
                            DynamicModulesVCItem.this.onComputingComplete();
                            dynamicModulesVCItem2 = this.pageItem;
                            if (dynamicModulesVCItem2 != null) {
                                DynamicModulesFragment dynamicModulesFragment = this;
                                dynamicModulesVCItem3 = this.pageItem;
                                dynamicModulesFragment.onComputingComplete(dynamicModulesVCItem3);
                            }
                            ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.Companion.getPageKey(this.getAliasName(), 3), ShieldSpeedStep.MF_STEP_PAINTING_END.getStep());
                            ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.Companion.getPageKey(this.getAliasName(), 3));
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComputingComplete(@org.jetbrains.annotations.Nullable com.dianping.shield.dynamic.items.vc.DynamicModulesVCItem r12) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.fragments.DynamicModulesFragment.onComputingComplete(com.dianping.shield.dynamic.items.vc.DynamicModulesVCItem):void");
    }

    private final void updateModulesConfig(ModulesVCInfo modulesVCInfo) {
        List<ArrayList<c>> list;
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13fedc39b86cafa53d9b32ff667c1878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13fedc39b86cafa53d9b32ff667c1878");
        } else if (modulesVCInfo == null) {
        } else {
            String[] configKeys = modulesVCInfo.getConfigKeys();
            HashMap hashMap = null;
            if (configKeys == null || configKeys.length <= 0) {
                list = null;
            } else {
                com.dianping.eunomia.f a = com.dianping.eunomia.f.a();
                Object[] objArr2 = {getContext(), configKeys};
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.eunomia.f.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "bbe3378a77e89bb5ee3fb90b7925cb3a", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "bbe3378a77e89bb5ee3fb90b7925cb3a");
                } else {
                    a.a(configKeys != null ? kotlin.collections.b.a(configKeys, "&", "", "", -1, "...", null) : null);
                    list = com.dianping.eunomia.j.b.a(configKeys);
                }
            }
            String configKey = modulesVCInfo.getConfigKey();
            if ((list == null || list.isEmpty()) && !TextUtils.isEmpty(configKey)) {
                list = com.dianping.eunomia.f.a().a(getContext(), configKey);
            }
            if (list == null || list.isEmpty()) {
                list = DMUtils.getModuleConfigItems(modulesVCInfo.getModuleKeys());
            }
            ar whiteBoard = getWhiteBoard();
            if ((whiteBoard != null ? whiteBoard.e("dr_abTestInfo") : null) != null) {
                ar whiteBoard2 = getWhiteBoard();
                Serializable e = whiteBoard2 != null ? whiteBoard2.e("dr_abTestInfo") : null;
                if (e == null) {
                    throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                }
                hashMap = (HashMap) e;
            }
            setShieldConfigInfo(AgentConfigParser.getShieldConfigInfo(list, hashMap));
        }
    }

    private final void updateSeparatorLineInfo(SeparatorLineInfo separatorLineInfo) {
        ColorDrawable parseColorDrawable;
        ShieldGlobalFeatureInterface feature;
        ColorDrawable parseColorDrawable2;
        ShieldGlobalFeatureInterface feature2;
        ColorDrawable parseColorDrawable3;
        ShieldGlobalFeatureInterface feature3;
        Object[] objArr = {separatorLineInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a90e7522f5326485e67f78222ecde20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a90e7522f5326485e67f78222ecde20");
        } else if (separatorLineInfo == null) {
        } else {
            if (separatorLineInfo.getLeftSeparatorMargin() != null) {
                Integer leftSeparatorMargin = separatorLineInfo.getLeftSeparatorMargin();
                if (leftSeparatorMargin == null) {
                    h.a();
                }
                int intValue = leftSeparatorMargin.intValue();
                ShieldGlobalFeatureInterface feature4 = getFeature();
                if (feature4 != null) {
                    PageDividerThemeParams dividerLeftOffset = PageDividerThemeParams.dividerLeftOffset(intValue);
                    h.a((Object) dividerLeftOffset, "PageDividerThemeParams.d…derLeftOffset(leftMargin)");
                    feature4.setPageDividerTheme(dividerLeftOffset);
                }
            }
            if (separatorLineInfo.getRightSeparatorMargin() != null) {
                Integer rightSeparatorMargin = separatorLineInfo.getRightSeparatorMargin();
                if (rightSeparatorMargin == null) {
                    h.a();
                }
                int intValue2 = rightSeparatorMargin.intValue();
                ShieldGlobalFeatureInterface feature5 = getFeature();
                if (feature5 != null) {
                    PageDividerThemeParams dividerRightOffset = PageDividerThemeParams.dividerRightOffset(intValue2);
                    h.a((Object) dividerRightOffset, "PageDividerThemeParams.d…rRightOffset(rightMargin)");
                    feature5.setPageDividerTheme(dividerRightOffset);
                }
            }
            if (separatorLineInfo.getTopLineColor() != null && (parseColorDrawable3 = DMUtils.parseColorDrawable(separatorLineInfo.getTopLineColor())) != null && (feature3 = getFeature()) != null) {
                PageDividerThemeParams sectionTopDivider = PageDividerThemeParams.sectionTopDivider(parseColorDrawable3);
                h.a((Object) sectionTopDivider, "PageDividerThemeParams.s…TopDivider(colorDrawable)");
                feature3.setPageDividerTheme(sectionTopDivider);
            }
            if (separatorLineInfo.getMiddleLineColor() != null && (parseColorDrawable2 = DMUtils.parseColorDrawable(separatorLineInfo.getMiddleLineColor())) != null && (feature2 = getFeature()) != null) {
                PageDividerThemeParams dividerDrawable = PageDividerThemeParams.dividerDrawable(parseColorDrawable2);
                h.a((Object) dividerDrawable, "PageDividerThemeParams.d…erDrawable(colorDrawable)");
                feature2.setPageDividerTheme(dividerDrawable);
            }
            if (separatorLineInfo.getBottomLineColor() == null || (parseColorDrawable = DMUtils.parseColorDrawable(separatorLineInfo.getBottomLineColor())) == null || (feature = getFeature()) == null) {
                return;
            }
            PageDividerThemeParams sectionBottomDivider = PageDividerThemeParams.sectionBottomDivider(parseColorDrawable);
            h.a((Object) sectionBottomDivider, "PageDividerThemeParams.s…tomDivider(colorDrawable)");
            feature.setPageDividerTheme(sectionBottomDivider);
        }
    }

    private final void updateSettingInfo(ModulesVCSettingInfo modulesVCSettingInfo) {
        Object[] objArr = {modulesVCSettingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf2a119d987afeeaf200c974e165b2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf2a119d987afeeaf200c974e165b2bd");
        } else if (modulesVCSettingInfo == null) {
        } else {
            if (modulesVCSettingInfo.getLeftMargin() != null) {
                CommonPageContainer commonPageContainer = this.pageContainer;
                h.a((Object) commonPageContainer, "pageContainer");
                PageContainerThemePackage themePackage = commonPageContainer.getThemePackage();
                Integer leftMargin = modulesVCSettingInfo.getLeftMargin();
                if (leftMargin == null) {
                    h.a();
                }
                themePackage.setLeftMargin(leftMargin.intValue());
            }
            if (modulesVCSettingInfo.getRightMargin() != null) {
                CommonPageContainer commonPageContainer2 = this.pageContainer;
                h.a((Object) commonPageContainer2, "pageContainer");
                PageContainerThemePackage themePackage2 = commonPageContainer2.getThemePackage();
                Integer rightMargin = modulesVCSettingInfo.getRightMargin();
                if (rightMargin == null) {
                    h.a();
                }
                themePackage2.setRightMargin(rightMargin.intValue());
            }
            if (modulesVCSettingInfo.getSectionHeaderHeight() != null) {
                Integer sectionHeaderHeight = modulesVCSettingInfo.getSectionHeaderHeight();
                if (sectionHeaderHeight == null) {
                    h.a();
                }
                int intValue = sectionHeaderHeight.intValue();
                ShieldGlobalFeatureInterface feature = getFeature();
                if (feature != null) {
                    PageDividerThemeParams headerHeight = PageDividerThemeParams.headerHeight(intValue);
                    h.a((Object) headerHeight, "PageDividerThemeParams.h…ight(sectionHeaderHeight)");
                    feature.setPageDividerTheme(headerHeight);
                }
            }
            if (modulesVCSettingInfo.getSectionFooterHeight() != null) {
                Integer sectionFooterHeight = modulesVCSettingInfo.getSectionFooterHeight();
                if (sectionFooterHeight == null) {
                    h.a();
                }
                int intValue2 = sectionFooterHeight.intValue();
                ShieldGlobalFeatureInterface feature2 = getFeature();
                if (feature2 != null) {
                    PageDividerThemeParams footerHeight = PageDividerThemeParams.footerHeight(intValue2);
                    h.a((Object) footerHeight, "PageDividerThemeParams.f…ight(sectionFooterHeight)");
                    feature2.setPageDividerTheme(footerHeight);
                }
            }
            if (modulesVCSettingInfo.getHeightForExtraFirstSectionHeader() != null) {
                Integer heightForExtraFirstSectionHeader = modulesVCSettingInfo.getHeightForExtraFirstSectionHeader();
                if (heightForExtraFirstSectionHeader == null) {
                    h.a();
                }
                int intValue3 = heightForExtraFirstSectionHeader.intValue();
                ShieldGlobalFeatureInterface feature3 = getFeature();
                if (feature3 != null) {
                    PageDividerThemeParams firstHeaderExtraHeight = PageDividerThemeParams.firstHeaderExtraHeight(intValue3);
                    h.a((Object) firstHeaderExtraHeight, "PageDividerThemeParams.f…rExtraFirstSectionHeader)");
                    feature3.setPageDividerTheme(firstHeaderExtraHeight);
                }
            }
            if (modulesVCSettingInfo.getHeightForExtraLastSectionFooter() != null) {
                Integer heightForExtraLastSectionFooter = modulesVCSettingInfo.getHeightForExtraLastSectionFooter();
                if (heightForExtraLastSectionFooter == null) {
                    h.a();
                }
                int intValue4 = heightForExtraLastSectionFooter.intValue();
                ShieldGlobalFeatureInterface feature4 = getFeature();
                if (feature4 != null) {
                    PageDividerThemeParams lastFooterExtraHeight = PageDividerThemeParams.lastFooterExtraHeight(intValue4);
                    h.a((Object) lastFooterExtraHeight, "PageDividerThemeParams.l…orExtraLastSectionFooter)");
                    feature4.setPageDividerTheme(lastFooterExtraHeight);
                }
            }
            if (modulesVCSettingInfo.getReserveUnUsedModule() != null) {
                Boolean reserveUnUsedModule = modulesVCSettingInfo.getReserveUnUsedModule();
                if (reserveUnUsedModule == null) {
                    h.a();
                }
                boolean booleanValue = reserveUnUsedModule.booleanValue();
                ShieldGlobalFeatureInterface feature5 = getFeature();
                if (feature5 != null) {
                    PageAgentsPersistenceParams build = new PageAgentsPersistenceParams.Builder().reserveUnUsedModule(booleanValue).build();
                    h.a((Object) build, "PageAgentsPersistencePar…erveUnUsedModule).build()");
                    feature5.setPageAgentsPersistenceInfo(build);
                }
            }
            if (modulesVCSettingInfo.getAutoExposeViewType() != null) {
                Integer autoExposeViewType = modulesVCSettingInfo.getAutoExposeViewType();
                if (autoExposeViewType == null) {
                    h.a();
                }
                int intValue5 = autoExposeViewType.intValue();
                ShieldGlobalFeatureInterface feature6 = getFeature();
                if (feature6 != null) {
                    feature6.setExposeComputeMode(com.dianping.agentsdk.framework.f.b.a(intValue5));
                }
            }
            if (modulesVCSettingInfo.getAutoTopHoverOffset() != null) {
                Integer autoTopHoverOffset = modulesVCSettingInfo.getAutoTopHoverOffset();
                if (autoTopHoverOffset == null) {
                    h.a();
                }
                setAutoOffset(com.dianping.util.j.a(getContext(), autoTopHoverOffset.intValue()));
            }
            if (modulesVCSettingInfo.getExtraInfo() != null) {
                setArguments(modulesVCSettingInfo.getExtraInfo());
            }
            if (modulesVCSettingInfo.getSectionHeaderBackgroundColor() != null) {
                ColorUnionType sectionHeaderBackgroundColor = modulesVCSettingInfo.getSectionHeaderBackgroundColor();
                if (sectionHeaderBackgroundColor == null) {
                    h.a();
                }
                Drawable headerFooterBackgroundColor = DMUtils.getHeaderFooterBackgroundColor(sectionHeaderBackgroundColor);
                ShieldGlobalFeatureInterface feature7 = getFeature();
                if (feature7 != null) {
                    PageDividerThemeParams headerDrawable = PageDividerThemeParams.headerDrawable(headerFooterBackgroundColor);
                    h.a((Object) headerDrawable, "PageDividerThemeParams.h…ionHeaderBackgroundColor)");
                    feature7.setPageDividerTheme(headerDrawable);
                }
            }
            if (modulesVCSettingInfo.getSectionFooterBackgroundColor() != null) {
                ColorUnionType sectionFooterBackgroundColor = modulesVCSettingInfo.getSectionFooterBackgroundColor();
                if (sectionFooterBackgroundColor == null) {
                    h.a();
                }
                Drawable headerFooterBackgroundColor2 = DMUtils.getHeaderFooterBackgroundColor(sectionFooterBackgroundColor);
                ShieldGlobalFeatureInterface feature8 = getFeature();
                if (feature8 != null) {
                    PageDividerThemeParams footerDrawable = PageDividerThemeParams.footerDrawable(headerFooterBackgroundColor2);
                    h.a((Object) footerDrawable, "PageDividerThemeParams.f…ionFooterBackgroundColor)");
                    feature8.setPageDividerTheme(footerDrawable);
                }
            }
        }
    }

    private final void updateScrollEnabledInfo(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5523f1011d32524b3b00e0744e243a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5523f1011d32524b3b00e0744e243a08");
            return;
        }
        ShieldGlobalFeatureInterface feature = getFeature();
        if (feature != null) {
            feature.setScrollEnabled(bool != null ? bool.booleanValue() : true);
        }
    }

    private final void updateDragRefreshInfo(DragRefreshInfo dragRefreshInfo) {
        Object[] objArr = {dragRefreshInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93f41a0b9bd4af241d5a965f93bb6237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93f41a0b9bd4af241d5a965f93bb6237");
        } else if (dragRefreshInfo == null) {
            this.pageContainer.setMode(a.EnumC0139a.DISABLED);
        } else {
            if (dragRefreshInfo.getHasDragRefresh() != null) {
                Boolean hasDragRefresh = dragRefreshInfo.getHasDragRefresh();
                if (hasDragRefresh == null) {
                    h.a();
                }
                if (hasDragRefresh.booleanValue()) {
                    this.pageContainer.setMode(a.EnumC0139a.PULL_DOWN_TO_REFRESH);
                } else {
                    this.pageContainer.setMode(a.EnumC0139a.DISABLED);
                }
            }
            if (dragRefreshInfo.getOffset() != null) {
                CommonPageContainer commonPageContainer = this.pageContainer;
                Context context = getContext();
                Integer offset = dragRefreshInfo.getOffset();
                if (offset == null) {
                    h.a();
                }
                commonPageContainer.setPullToRefreshViewOffset(com.dianping.util.j.a(context, offset.intValue()));
            }
        }
    }

    private final void updateTitleBarInfo(TitleBarInfo titleBarInfo) {
        Object[] objArr = {titleBarInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "092f67d89928fcea3d2fae8c10ceacda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "092f67d89928fcea3d2fae8c10ceacda");
        } else if (titleBarInfo == null) {
        } else {
            if (titleBarInfo.getBarColor() != null) {
                setTitlebarBackground(DMUtils.parseColorDrawable(titleBarInfo.getBarColor()));
            }
            if (titleBarInfo.getStyle() != null) {
                Integer style = titleBarInfo.getStyle();
                if (style == null) {
                    h.a();
                }
                int intValue = style.intValue();
                if (intValue == DMConstant.TitleBarStyle.Normal.ordinal()) {
                    showTitlebar();
                    setIsTransparentTitleBar(false);
                } else if (intValue == DMConstant.TitleBarStyle.Hidden.ordinal()) {
                    hideTitlebar();
                    setIsTransparentTitleBar(false);
                } else if (intValue == DMConstant.TitleBarStyle.Transparent.ordinal()) {
                    showTitlebar();
                    setIsTransparentTitleBar(true);
                }
            }
            if (titleBarInfo.getBarAlphaThreshold() == null || getScTitleBar() == null) {
                return;
            }
            Integer barAlphaThreshold = titleBarInfo.getBarAlphaThreshold();
            if (barAlphaThreshold == null) {
                h.a();
            }
            getScTitleBar().setAlphaThreshold(barAlphaThreshold.intValue());
        }
    }

    private final void updateLoadingStatus(ModulesVCInfo modulesVCInfo) {
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "521c5e2fb98212f3a6b24a0750d46dcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "521c5e2fb98212f3a6b24a0750d46dcb");
            return;
        }
        if ((modulesVCInfo != null ? modulesVCInfo.getLoadingStatus() : null) == null) {
            this.pageContainer.setSuccess();
            return;
        }
        Integer loadingStatus = modulesVCInfo.getLoadingStatus();
        int ordinal = DMConstant.LoadingStatus.Loading.ordinal();
        if (loadingStatus != null && loadingStatus.intValue() == ordinal) {
            this.pageContainer.setLoading();
            return;
        }
        int ordinal2 = DMConstant.LoadingStatus.Fail.ordinal();
        if (loadingStatus != null && loadingStatus.intValue() == ordinal2) {
            this.pageContainer.setError();
        } else {
            this.pageContainer.setSuccess();
        }
    }

    private final void updateBackgroundColor(ModulesVCInfo modulesVCInfo) {
        int parseColor;
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54da8f7131df7d8ddaa2737fca65c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54da8f7131df7d8ddaa2737fca65c8f");
            return;
        }
        if ((modulesVCInfo != null ? modulesVCInfo.getBackgroundColor() : null) != null) {
            updateBackgroundColor(modulesVCInfo.getBackgroundColor());
        }
        if ((modulesVCInfo != null ? modulesVCInfo.getPageBackgroundColor() : null) == null || (parseColor = DMUtils.parseColor(modulesVCInfo.getPageBackgroundColor())) == Integer.MAX_VALUE) {
            return;
        }
        this.pageContainer.setPageBackgroundColor(parseColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackgroundColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24be6f328a582917ddd4c145211a6d3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24be6f328a582917ddd4c145211a6d3c");
            return;
        }
        int parseColor = DMUtils.parseColor(str);
        if (parseColor != Integer.MAX_VALUE) {
            this.pageContainer.setRvBackgroundColor(parseColor);
        }
    }

    private final void updateMptInfo(MPTInfo mPTInfo) {
        Object[] objArr = {mPTInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7894dedd1e61226158ef127551204c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7894dedd1e61226158ef127551204c63");
        } else if (mPTInfo != null && !this.isPaint) {
            if (this.statisticsListener != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cid", mPTInfo.getCid());
                    jSONObject.put("category", mPTInfo.getCategory());
                    HashMap<String, Object> labs = mPTInfo.getLabs();
                    if (labs != null && labs.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : labs.keySet()) {
                            jSONObject2.put(str, labs.get(str));
                        }
                        jSONObject.put("labs", jSONObject2);
                    }
                } catch (Exception unused) {
                }
                OnStatisticsListener onStatisticsListener = this.statisticsListener;
                if (onStatisticsListener == null) {
                    h.a();
                }
                onStatisticsListener.onPageStatistics(jSONObject);
            } else {
                if (mPTInfo.getCid() != null) {
                    this.sakstCid = mPTInfo.getCid();
                }
                if (mPTInfo.getCategory() != null) {
                    this.sakstCategory = mPTInfo.getCategory();
                }
                if (mPTInfo.getLabs() != null) {
                    this.labMap = mPTInfo.getLabs();
                }
                statisticsPageView();
            }
            this.isPaint = true;
        }
    }

    private final void updateFrozenInfo(ModulesVCInfo modulesVCInfo) {
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77a5292785a7c245314d0cefe75b980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77a5292785a7c245314d0cefe75b980");
            return;
        }
        Boolean enableFrozen = modulesVCInfo != null ? modulesVCInfo.getEnableFrozen() : null;
        if (enableFrozen != null) {
            this.pageContainer.setFrozenEnabled(enableFrozen.booleanValue());
            String frozenModuleKey = modulesVCInfo != null ? modulesVCInfo.getFrozenModuleKey() : null;
            ShieldGlobalFeatureInterface feature = getFeature();
            if (feature != null) {
                feature.setFrozenInfo(enableFrozen, frozenModuleKey);
            }
        }
    }

    private final void updateDisableFling(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80a89d5b2dfda21049579ec76a1c093e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80a89d5b2dfda21049579ec76a1c093e");
            return;
        }
        removeFlingListener();
        if (h.a(bool, Boolean.TRUE)) {
            this.recyclerViewOnFlingListener = new RecyclerView.i() { // from class: com.dianping.shield.dynamic.fragments.DynamicModulesFragment$updateDisableFling$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.support.v7.widget.RecyclerView.i
                public final boolean onFling(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f0d572be0221f2b3e470d8b4044483d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f0d572be0221f2b3e470d8b4044483d")).booleanValue() : HornFallbackSwitch.getInstance().isSwitchOn("flingSwitch");
                }
            };
            this.pageContainer.addFlingListener(this.recyclerViewOnFlingListener);
        }
    }

    private final void removeFlingListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d52ce6fb508a04d774fc59497ba7749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d52ce6fb508a04d774fc59497ba7749");
        } else if (this.recyclerViewOnFlingListener != null) {
            CommonPageContainer commonPageContainer = this.pageContainer;
            if (commonPageContainer != null) {
                commonPageContainer.removeFlingListener(this.recyclerViewOnFlingListener);
            }
            this.recyclerViewOnFlingListener = null;
        }
    }

    public final void disableAutoStatistics(@NotNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b215b1dd30a487e85caf3b5d9c794e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b215b1dd30a487e85caf3b5d9c794e9");
            return;
        }
        h.b(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.pageInfoKey = AppUtil.generatePageInfoKey(activity);
        String str = this.pageInfoKey;
        if (str == null) {
            h.a();
        }
        Statistics.disableAutoPVPD(str);
    }

    private final void initStatistics() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7a1bf1737f19ce38bc7a03861196812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7a1bf1737f19ce38bc7a03861196812");
            return;
        }
        this.sakstCid = getStringParam("sakst_cid");
        this.sakstCategory = getStringParam("sakst_category");
        String stringParam = getStringParam("sakst_lab");
        try {
            if (TextUtils.isEmpty(stringParam)) {
                return;
            }
            this.labMap = DMUtils.getLabMap(new JSONObject(stringParam));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void statisticsPageView() {
        Channel channel;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0d449a971845a9d0f20123ae4fd664b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0d449a971845a9d0f20123ae4fd664b");
            return;
        }
        if (TextUtils.isEmpty(this.sakstCategory)) {
            channel = Statistics.getChannel();
            h.a((Object) channel, "Statistics.getChannel()");
        } else {
            channel = Statistics.getChannel(this.sakstCategory);
            h.a((Object) channel, "Statistics.getChannel(sakstCategory)");
        }
        if (this.labMap == null) {
            this.labMap = new HashMap();
        }
        if (TextUtils.isEmpty(this.pageInfoKey) || TextUtils.isEmpty(this.sakstCid)) {
            return;
        }
        String str = this.pageInfoKey;
        if (str == null) {
            h.a();
        }
        String str2 = this.sakstCid;
        if (str2 == null) {
            h.a();
        }
        channel.writePageView(str, str2, this.labMap);
    }

    private final void statisticsPageDisappear() {
        Channel channel;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460e2132c18579f2ea41a49316e10db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460e2132c18579f2ea41a49316e10db9");
            return;
        }
        if (TextUtils.isEmpty(this.sakstCategory)) {
            channel = Statistics.getChannel();
            h.a((Object) channel, "Statistics.getChannel()");
        } else {
            channel = Statistics.getChannel(this.sakstCategory);
            h.a((Object) channel, "Statistics.getChannel(sakstCategory)");
        }
        if (this.labMap == null) {
            this.labMap = new HashMap();
        }
        if (TextUtils.isEmpty(this.pageInfoKey) || TextUtils.isEmpty(this.sakstCid)) {
            return;
        }
        String str = this.pageInfoKey;
        if (str == null) {
            h.a();
        }
        channel.writePageDisappear(str, this.sakstCid, this.labMap);
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c55974946c1662efd39b8b393104873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c55974946c1662efd39b8b393104873");
            return;
        }
        super.onResume();
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onResume();
        }
        if (this.statisticsListener == null && !this.isStatisticsByRemote && this.isFirstResumed) {
            statisticsPageView();
        }
        this.isFirstResumed = true;
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90638deeb21ff41a8a7c8a6262ac4b12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90638deeb21ff41a8a7c8a6262ac4b12");
            return;
        }
        super.onPause();
        if (this.dynamicExecEnvironment != null) {
            DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
            if (dynamicExecEnvironment == null) {
                h.a();
            }
            dynamicExecEnvironment.onPause();
        }
        if (this.statisticsListener == null) {
            statisticsPageDisappear();
        }
    }

    public final void setStatisticsListener(@NotNull OnStatisticsListener onStatisticsListener) {
        Object[] objArr = {onStatisticsListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50373547368d071b48e4b35aa4cb3123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50373547368d071b48e4b35aa4cb3123");
            return;
        }
        h.b(onStatisticsListener, "statisticsListener");
        this.statisticsListener = onStatisticsListener;
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2644be68e47b6d0226df7af77fbea94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2644be68e47b6d0226df7af77fbea94");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicExecEnvironment dynamicExecEnvironment = this.dynamicExecEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @NotNull
    public String getAliasName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e6451d65cce30c23705620ef8aca96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e6451d65cce30c23705620ef8aca96");
        }
        if (getHostName() == null) {
            String name = getClass().getName();
            h.a((Object) name, "this.javaClass.name");
            return name;
        }
        return getHostName();
    }
}
