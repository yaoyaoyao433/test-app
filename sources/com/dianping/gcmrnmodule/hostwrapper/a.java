package com.dianping.gcmrnmodule.hostwrapper;

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.View;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.fragments.MRNModuleFragment;
import com.dianping.gcmrnmodule.wrapperviews.events.j;
import com.dianping.gcmrnmodule.wrapperviews.events.x;
import com.dianping.gcmrnmodule.wrapperviews.events.y;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.DynamicContainerAgent;
import com.dianping.shield.dynamic.agent.DynamicScrollTabAgent;
import com.dianping.shield.dynamic.agent.DynamicTabAgent;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.fragments.DynamicModulesFragment;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.module.ContainerModuleInfo;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.model.module.ScrollTabModuleInfo;
import com.dianping.shield.dynamic.model.module.TabModuleInfo;
import com.dianping.shield.dynamic.model.vc.ModuleKeyUnionType;
import com.dianping.shield.dynamic.model.vc.ModulesVCInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.HostDestroyCallback;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMetricsMonitorUtil;
import com.facebook.react.uimanager.as;
import com.meituan.android.common.aidata.jsengine.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.o;
import kotlin.r;
import kotlin.reflect.i;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 q2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001qB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\bJ\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u00103\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000105H\u0016J-\u00106\u001a\u0002012\u0006\u00107\u001a\u00020\u000b2\u0016\u00108\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0016¢\u0006\u0002\u0010;J\u0018\u0010<\u001a\u0004\u0018\u00010&2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010=H\u0002J\t\u0010>\u001a\u00020\u000bH\u0096\u0001J\t\u0010?\u001a\u00020@H\u0096\u0001J\u0019\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010C\u0018\u00010BH\u0096\u0001J\t\u0010D\u001a\u00020EH\u0096\u0001J\b\u0010F\u001a\u00020\u0001H\u0016J\u000b\u0010G\u001a\u0004\u0018\u00010HH\u0096\u0001J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004H\u0096\u0001J\u000b\u0010J\u001a\u0004\u0018\u00010KH\u0096\u0001J\n\u0010L\u001a\u0004\u0018\u00010MH\u0017J\u000b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0001J\t\u0010P\u001a\u00020QH\u0096\u0001J\t\u0010R\u001a\u00020\u000bH\u0096\u0001J\u000f\u0010S\u001a\b\u0012\u0002\b\u0003\u0018\u00010TH\u0096\u0001J\t\u0010U\u001a\u00020VH\u0096\u0001J%\u0010W\u001a\u0002012\u0016\u00108\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0016¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u000201H\u0016J\b\u0010Z\u001a\u000201H\u0016J\b\u0010[\u001a\u000201H\u0016J%\u0010\\\u001a\u0002012\u0016\u00108\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0016¢\u0006\u0002\u0010XJ\b\u0010]\u001a\u000201H\u0016J\b\u0010^\u001a\u000201H\u0016J\u0010\u0010_\u001a\u0002012\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u0002012\u0006\u0010`\u001a\u00020cH\u0016J\b\u0010d\u001a\u000201H\u0016J%\u0010e\u001a\u00020 2\u0016\u00108\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0016¢\u0006\u0002\u0010fJ\b\u0010g\u001a\u000201H\u0016J\u0013\u0010h\u001a\u0002012\b\u0010i\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\u0011\u0010j\u001a\u0002012\u0006\u0010k\u001a\u00020lH\u0096\u0001J\u0013\u0010m\u001a\u0002012\b\u0010n\u001a\u0004\u0018\u00010oH\u0096\u0001J\b\u0010p\u001a\u000201H\u0016R'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0015\u001a\u0004\u0018\u00010&8F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006r"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "Lcom/dianping/gcmrnmodule/protocols/IMRNPaintingCallback;", "dynamicChassis", "paintingCallback", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;)V", "childHosts", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getChildHosts", "()Ljava/util/concurrent/ConcurrentHashMap;", "childHosts$delegate", "Lkotlin/Lazy;", "destroyHookList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/protocols/HostDestroyCallback;", "frameCallback", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleUpdateFrameCallback;", "<set-?>", "hostId", "getHostId", "()Ljava/lang/String;", "hostWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "getHostWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "setHostWrapperView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;)V", "value", "", "needUpdate", "getNeedUpdate", "()Z", "setNeedUpdate", "(Z)V", "Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView;", "reuseContainerWrapperView", "getReuseContainerWrapperView", "()Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewsContainerWrapperView;", "uiImplementation", "Lcom/facebook/react/uimanager/UIImplementation;", "getUiImplementation", "()Lcom/facebook/react/uimanager/UIImplementation;", "setUiImplementation", "(Lcom/facebook/react/uimanager/UIImplementation;)V", "addHostDestroyHook", "", "callback", "addSubscription", "subscription", "Lrx/Subscription;", "callMethod", "method", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "findReuseContainerWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "getAliasName", "getBridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getContainerThemePackage", "Lcom/dianping/shield/component/utils/PageContainerThemePackage;", "getDynamicChassis", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", Constants.Func.GET_FEATURE, "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "getHoloAgent", "Lcom/dianping/agentsdk/agent/HoloAgent;", "getHostContext", "Landroid/content/Context;", "getHostFragment", "Landroid/support/v4/app/Fragment;", "getHostName", "getPageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "getShieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "onAppear", "([Ljava/lang/Object;)V", "onChassisAppear", "onChassisDisappear", "onDestroy", "onDisappear", "onLoad", "onNeedLoadMore", "onPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "onPaintingSucess", com.alipay.sdk.widget.d.p, "([Ljava/lang/Object;)Z", "onRetryForLoadingFail", "painting", "moduleInfo", "refreshHostViewItem", "viewItem", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "update", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public class a implements com.dianping.gcmrnmodule.protocols.a, DynamicChassisInterface, DynamicHostInterface, IDynamicPaintingCallback<DiffableInfo> {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(a.class), "childHosts", "getChildHosts()Ljava/util/concurrent/ConcurrentHashMap;"))};
    public static final C0063a g = new C0063a(null);
    @NotNull
    private static AtomicInteger n = new AtomicInteger();
    @Nullable
    public as c;
    boolean d;
    @NotNull
    public String e;
    @NotNull
    final kotlin.d f;
    @Nullable
    private com.dianping.gcmrnmodule.wrapperviews.a<?> h;
    private ArrayList<HostDestroyCallback> i;
    private final e j;
    @Nullable
    private com.dianping.gcmrnmodule.wrapperviews.reuse.b k;
    private final DynamicChassisInterface l;
    private final IDynamicPaintingCallback<DiffableInfo> m;

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public String getAliasName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c877f97b227e0dbf2ec75d7725a8ea62", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c877f97b227e0dbf2ec75d7725a8ea62") : this.l.getAliasName();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public v getBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f4f03eaa3334fbb1652aa28b54b6aa", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f4f03eaa3334fbb1652aa28b54b6aa") : this.l.getBridge();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081dd497db4edd7ba94d1c5e176aa691", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081dd497db4edd7ba94d1c5e176aa691") : this.l.getChassisArguments();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec64ebb44b4369bf9bb79312d338ff13", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec64ebb44b4369bf9bb79312d338ff13") : this.l.getContainerThemePackage();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a364e8bae23dabc9a2c04b1bacfa23f", RobustBitConfig.DEFAULT_VALUE) ? (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a364e8bae23dabc9a2c04b1bacfa23f") : this.l.getDynamicExecutor();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicHostInterface getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06109e3798159167e87cada889782b1", RobustBitConfig.DEFAULT_VALUE) ? (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06109e3798159167e87cada889782b1") : this.l.getDynamicHost();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ShieldGlobalFeatureInterface getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef80c44fc5f638511d326ce7548e5889", RobustBitConfig.DEFAULT_VALUE) ? (ShieldGlobalFeatureInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef80c44fc5f638511d326ce7548e5889") : this.l.getFeature();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a030445c24b15e897a03b3899aa5464", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a030445c24b15e897a03b3899aa5464") : this.l.getHostContext();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public Fragment getHostFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea15fc777208c8d5f6d51d1c61faaa3", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea15fc777208c8d5f6d51d1c61faaa3") : this.l.getHostFragment();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public String getHostName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3631150e9fcf0e8b84a0793b964dceb6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3631150e9fcf0e8b84a0793b964dceb6") : this.l.getHostName();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ab<?> getPageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8442d341813486c2ea0efe95b9dc96", RobustBitConfig.DEFAULT_VALUE) ? (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8442d341813486c2ea0efe95b9dc96") : this.l.getPageContainer();
    }

    @Override // com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639cddc31b50b1254cd103896d5dec96", RobustBitConfig.DEFAULT_VALUE) ? (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639cddc31b50b1254cd103896d5dec96") : this.l.getShieldGAInfo();
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onChassisAppear() {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onChassisDisappear() {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onLoad() {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onPaintingSucess() {
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable DiffableInfo diffableInfo) {
        Object[] objArr = {diffableInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a69ded84a6ff12ed9988bb5bfdc2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a69ded84a6ff12ed9988bb5bfdc2ec");
        } else {
            this.m.painting(diffableInfo);
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256a8114dae1b80359257635395440fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256a8114dae1b80359257635395440fb");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        this.l.refreshHostViewItem(iDynamicModuleViewItem);
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47d93269c6fc923bdefbba9d219484b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47d93269c6fc923bdefbba9d219484b");
        } else {
            this.m.sendEvent(jSONObject);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ConcurrentHashMap<String, a>> {
        public static ChangeQuickRedirect a;
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ConcurrentHashMap<String, a> invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72bc75626855d95fa520065ae3d8eda5", RobustBitConfig.DEFAULT_VALUE) ? (ConcurrentHashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72bc75626855d95fa520065ae3d8eda5") : new ConcurrentHashMap<>();
        }
    }

    public a(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback) {
        h.b(dynamicChassisInterface, "dynamicChassis");
        h.b(iDynamicPaintingCallback, "paintingCallback");
        Object[] objArr = {dynamicChassisInterface, iDynamicPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05058f5d577fd87c6eacef8c8101149", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05058f5d577fd87c6eacef8c8101149");
            return;
        }
        this.l = dynamicChassisInterface;
        this.m = iDynamicPaintingCallback;
        this.i = new ArrayList<>();
        this.j = new e(this);
        this.f = kotlin.e.a(kotlin.i.NONE, c.b);
        this.e = "mrnhost" + n.getAndIncrement();
        com.dianping.gcmrnmodule.hostwrapper.c cVar = com.dianping.gcmrnmodule.hostwrapper.c.c;
        String str = this.e;
        Object[] objArr2 = {str, this};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.hostwrapper.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "206f5c4af1635ebf733dc172db1afb14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "206f5c4af1635ebf733dc172db1afb14");
            return;
        }
        h.b(str, "hostId");
        h.b(this, "host");
        com.dianping.gcmrnmodule.hostwrapper.c.b.put(str, this);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1009956793029802cc8e8c8c4a84088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1009956793029802cc8e8c8c4a84088");
            return;
        }
        h.b(pageAppearType, "type");
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            a2.a(pageAppearType);
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b9b1d4a781e7a69bd10fb5f42e558b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b9b1d4a781e7a69bd10fb5f42e558b");
            return;
        }
        h.b(pageDisappearType, "type");
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            a2.a(pageDisappearType);
        }
    }

    @Nullable
    public com.dianping.gcmrnmodule.wrapperviews.a<?> a() {
        return this.h;
    }

    public void a(@Nullable com.dianping.gcmrnmodule.wrapperviews.a<?> aVar) {
        this.h = aVar;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c570b59711ef60598a0feb34be59b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c570b59711ef60598a0feb34be59b8");
            return;
        }
        if (z) {
            com.facebook.react.modules.core.a.a().b(this.j);
            com.facebook.react.modules.core.a.a().a(this.j, 0L);
        }
        this.d = z;
    }

    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.reuse.b b() {
        com.dianping.gcmrnmodule.wrapperviews.reuse.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e48c77052c80a8c4ca9d0ccd52eb356", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.reuse.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e48c77052c80a8c4ca9d0ccd52eb356");
        }
        if (this.k == null) {
            com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e09862ad245feeab9bd06b53adb13f6", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (com.dianping.gcmrnmodule.wrapperviews.reuse.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e09862ad245feeab9bd06b53adb13f6");
            } else {
                if (a2 != null) {
                    int childCount = a2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = a2.getChildAt(i);
                        if (childAt instanceof com.dianping.gcmrnmodule.wrapperviews.reuse.b) {
                            bVar = (com.dianping.gcmrnmodule.wrapperviews.reuse.b) childAt;
                            break;
                        }
                    }
                }
                bVar = null;
            }
            this.k = bVar;
        }
        return this.k;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper$Companion;", "", "()V", "pageId", "Ljava/util/concurrent/atomic/AtomicInteger;", "getPageId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setPageId", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.hostwrapper.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0063a {
        public C0063a() {
        }

        public /* synthetic */ C0063a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }

    public void c() {
        ShieldMetricsData shieldMetricsData;
        String str;
        ModulesVCInfo modulesVCInfo;
        List<List<ModuleKeyUnionType>> moduleKeys;
        String str2;
        List<List<ModuleKeyUnionType>> moduleKeys2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6b432b464cf3386309668f04014b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6b432b464cf3386309668f04014b8f");
            return;
        }
        if (this.l.getHostFragment() instanceof MRNModuleFragment) {
            ShieldMetricsMonitorUtil shieldMetricsMonitorUtil = ShieldMetricsMonitorUtil.INSTANCE;
            Fragment hostFragment = this.l.getHostFragment();
            if (hostFragment == null) {
                throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.fragments.MRNModuleFragment");
            }
            String b2 = ((MRNModuleFragment) hostFragment).b();
            h.a((Object) b2, "(dynamicChassis.getHostF…oduleFragment).uniqueCode");
            shieldMetricsData = shieldMetricsMonitorUtil.getData(b2);
        } else {
            shieldMetricsData = null;
        }
        float cumulativeValue = (!(this.l instanceof MRNModuleFragment) || shieldMetricsData == null) ? 0.0f : shieldMetricsData.getCumulativeValue("Shield_ModulePainting");
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            a2.h();
            if ((a2.getInfo() instanceof ModulesVCInfo) && !(this.m instanceof DynamicModulesFragment)) {
                Object info = a2.getInfo();
                if (!(info instanceof ModulesVCInfo)) {
                    info = null;
                }
                ModulesVCInfo modulesVCInfo2 = (ModulesVCInfo) info;
                String obj = (modulesVCInfo2 == null || (moduleKeys2 = modulesVCInfo2.getModuleKeys()) == null) ? null : moduleKeys2.toString();
                IDynamicPaintingCallback<DiffableInfo> iDynamicPaintingCallback = this.m;
                if (iDynamicPaintingCallback instanceof DynamicAgent) {
                    StringBuilder sb = new StringBuilder("DynamicAgent-hostWrapperView#id#");
                    sb.append(a2.getId());
                    sb.append("-moduleKeys#");
                    sb.append(obj);
                    sb.append("-paintingCallback#hostName#");
                    DynamicHostInterface dynamicHost = ((DynamicAgent) this.m).getDynamicHost();
                    sb.append(dynamicHost != null ? dynamicHost.getHostName() : null);
                    str2 = sb.toString();
                } else if (iDynamicPaintingCallback instanceof DynamicContainerAgent) {
                    StringBuilder sb2 = new StringBuilder("DynamicContainerAgent-hostWrapperView#id#");
                    sb2.append(a2.getId());
                    sb2.append("-moduleKeys#");
                    sb2.append(obj);
                    sb2.append("-paintingCallback#hostName#");
                    DynamicHostInterface dynamicHost2 = ((DynamicContainerAgent) this.m).getDynamicHost();
                    sb2.append(dynamicHost2 != null ? dynamicHost2.getHostName() : null);
                    str2 = sb2.toString();
                } else if (iDynamicPaintingCallback instanceof DynamicTabAgent) {
                    StringBuilder sb3 = new StringBuilder("DynamicTabAgent-hostWrapperView#id#");
                    sb3.append(a2.getId());
                    sb3.append("-moduleKeys#");
                    sb3.append(obj);
                    sb3.append("-paintingCallback#hostName#");
                    DynamicHostInterface dynamicHost3 = ((DynamicTabAgent) this.m).getDynamicHost();
                    sb3.append(dynamicHost3 != null ? dynamicHost3.getHostName() : null);
                    str2 = sb3.toString();
                } else if (iDynamicPaintingCallback instanceof DynamicScrollTabAgent) {
                    StringBuilder sb4 = new StringBuilder("DynamicScrollTabAgent-hostWrapperView#id#");
                    sb4.append(a2.getId());
                    sb4.append("-moduleKeys#");
                    sb4.append(obj);
                    sb4.append("-paintingCallback#hostName#");
                    DynamicHostInterface dynamicHost4 = ((DynamicScrollTabAgent) this.m).getDynamicHost();
                    sb4.append(dynamicHost4 != null ? dynamicHost4.getHostName() : null);
                    str2 = sb4.toString();
                } else {
                    str2 = "";
                }
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), str2, "Shield_ClassCast");
            } else if (!(a2.getInfo() instanceof ModulesVCInfo) && (this.m instanceof MRNModuleFragment)) {
                a hostInterfaceField = a2.getHostInterfaceField();
                if (!(hostInterfaceField instanceof com.dianping.gcmrnmodule.hostwrapper.b)) {
                    hostInterfaceField = null;
                }
                com.dianping.gcmrnmodule.hostwrapper.b bVar = (com.dianping.gcmrnmodule.hostwrapper.b) hostInterfaceField;
                com.dianping.gcmrnmodule.wrapperviews.a<?> a3 = bVar != null ? bVar.a() : null;
                if (!(a3 instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.d)) {
                    a3 = null;
                }
                com.dianping.gcmrnmodule.wrapperviews.items.modules.d dVar = (com.dianping.gcmrnmodule.wrapperviews.items.modules.d) a3;
                String obj2 = (dVar == null || (modulesVCInfo = (ModulesVCInfo) dVar.getInfo()) == null || (moduleKeys = modulesVCInfo.getModuleKeys()) == null) ? null : moduleKeys.toString();
                DiffableInfo diffableInfo = (DiffableInfo) a2.getInfo();
                if (diffableInfo instanceof ModuleInfo) {
                    StringBuilder sb5 = new StringBuilder("DynamicAgent-hostWrapperView#id#");
                    sb5.append(a2.getId());
                    sb5.append("-moduleKeys#");
                    sb5.append(obj2);
                    sb5.append("-paintingCallback#hostName#");
                    a dynamicHost5 = ((MRNModuleFragment) this.m).getDynamicHost();
                    sb5.append(dynamicHost5 != null ? dynamicHost5.getHostName() : null);
                    str = sb5.toString();
                } else if (diffableInfo instanceof ContainerModuleInfo) {
                    StringBuilder sb6 = new StringBuilder("DynamicContainerAgent-hostWrapperView#id#");
                    sb6.append(a2.getId());
                    sb6.append("-moduleKeys#");
                    sb6.append(obj2);
                    sb6.append("-paintingCallback#hostName#");
                    a dynamicHost6 = ((MRNModuleFragment) this.m).getDynamicHost();
                    sb6.append(dynamicHost6 != null ? dynamicHost6.getHostName() : null);
                    str = sb6.toString();
                } else if (diffableInfo instanceof TabModuleInfo) {
                    StringBuilder sb7 = new StringBuilder("DynamicTabAgent-hostWrapperView#id#");
                    sb7.append(a2.getId());
                    sb7.append("-moduleKeys#");
                    sb7.append(obj2);
                    sb7.append("-paintingCallback#hostName#");
                    a dynamicHost7 = ((MRNModuleFragment) this.m).getDynamicHost();
                    sb7.append(dynamicHost7 != null ? dynamicHost7.getHostName() : null);
                    str = sb7.toString();
                } else if (diffableInfo instanceof ScrollTabModuleInfo) {
                    StringBuilder sb8 = new StringBuilder("DynamicScrollTabAgent-hostWrapperView#id#");
                    sb8.append(a2.getId());
                    sb8.append("-moduleKeys#");
                    sb8.append(obj2);
                    sb8.append("-paintingCallback#hostName#");
                    a dynamicHost8 = ((MRNModuleFragment) this.m).getDynamicHost();
                    sb8.append(dynamicHost8 != null ? dynamicHost8.getHostName() : null);
                    str = sb8.toString();
                } else {
                    str = "";
                }
                ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(getClass(), str, "Shield_ClassCast_Reverse");
            } else if ((!(a2.getInfo() instanceof ModuleInfo) || (this.m instanceof DynamicAgent)) && (((a2.getInfo() instanceof ModuleInfo) || !(this.m instanceof DynamicAgent)) && ((!(a2.getInfo() instanceof ContainerModuleInfo) || (this.m instanceof DynamicContainerAgent)) && ((a2.getInfo() instanceof ContainerModuleInfo) || !(this.m instanceof DynamicContainerAgent))))) {
                painting((DiffableInfo) a2.getInfo());
            }
        }
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        if (!(this.l instanceof MRNModuleFragment)) {
            if (shieldMetricsData != null) {
                shieldMetricsData.plusValue("Shield_ModulePainting", kotlin.collections.h.a(Float.valueOf((float) (currentThreadTimeMillis2 - currentThreadTimeMillis))), "Shield_MountFragment");
                return;
            }
            return;
        }
        float cumulativeValue2 = ((float) (currentThreadTimeMillis2 - currentThreadTimeMillis)) - ((shieldMetricsData != null ? shieldMetricsData.getCumulativeValue("Shield_ModulePainting") : 0.0f) - cumulativeValue);
        if (shieldMetricsData != null) {
            shieldMetricsData.plusValue("Shield_FragmentPainting", kotlin.collections.h.a(Float.valueOf(cumulativeValue2)), "Shield_MountFragment");
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    @Deprecated(message = "use #{getDynamicChassis} instead")
    @Nullable
    public HoloAgent getHoloAgent() {
        if (this.l instanceof HoloAgent) {
            return (HoloAgent) this.l;
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    @NotNull
    public DynamicChassisInterface getDynamicChassis() {
        return this.l;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper$addSubscription$1$1", "Lcom/dianping/shield/dynamic/protocols/HostDestroyCallback;", "onDestroy", "", "host", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b implements HostDestroyCallback {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ k b;

        public b(k kVar) {
            this.b = kVar;
        }

        @Override // com.dianping.shield.dynamic.protocols.HostDestroyCallback
        public final void onDestroy(@NotNull DynamicHostInterface dynamicHostInterface) {
            Object[] objArr = {dynamicHostInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8273470ad9c4506a7a90f94f076d476b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8273470ad9c4506a7a90f94f076d476b");
                return;
            }
            h.b(dynamicHostInterface, "host");
            this.b.unsubscribe();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void addSubscription(@Nullable k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd9991a9dff776a9a042bed26ab3a8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd9991a9dff776a9a042bed26ab3a8b0");
        } else if (kVar != null) {
            addHostDestroyHook(new b(kVar));
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void addHostDestroyHook(@Nullable HostDestroyCallback hostDestroyCallback) {
        Object[] objArr = {hostDestroyCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26005945ca056c30910c6bcedef795d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26005945ca056c30910c6bcedef795d");
        } else if (hostDestroyCallback != null) {
            this.i.add(hostDestroyCallback);
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        JSONObject jSONObject;
        t tVar;
        boolean z;
        t tVar2;
        boolean z2;
        t tVar3;
        boolean z3;
        t tVar4;
        boolean z4;
        t tVar5;
        boolean z5;
        t tVar6;
        boolean z6;
        t tVar7;
        boolean z7;
        t tVar8;
        boolean z8;
        t tVar9;
        boolean z9;
        t tVar10;
        boolean z10;
        t tVar11;
        boolean z11;
        t tVar12;
        boolean z12;
        t tVar13;
        boolean z13;
        t tVar14;
        boolean z14;
        t tVar15;
        boolean z15;
        t tVar16;
        boolean z16;
        t tVar17;
        boolean z17;
        t tVar18;
        boolean z18;
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "85b69ff29d5a14f77e12a1c42e99016f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "85b69ff29d5a14f77e12a1c42e99016f");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        if (!(objArr.length == 0)) {
            Object obj = objArr[0];
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        as asVar = this.c;
        if (asVar != null) {
            if (g.b(str, "gdm_didSelectCallback:", false)) {
                View j = asVar.j(Integer.parseInt(new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0).get(1)));
                if (!(j instanceof com.dianping.gcmrnmodule.protocols.h)) {
                    j = null;
                }
                com.dianping.gcmrnmodule.protocols.h hVar = (com.dianping.gcmrnmodule.protocols.h) j;
                if (hVar != null) {
                    hVar.d(jSONObject);
                    r rVar = r.a;
                }
            } else if (g.b(str, "gdm_exposeCallback:", false)) {
                List<String> a2 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a2.isEmpty()) {
                    ListIterator<String> listIterator = a2.listIterator(a2.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() == 0) {
                            z18 = true;
                            continue;
                        } else {
                            z18 = false;
                            continue;
                        }
                        if (!z18) {
                            tVar18 = kotlin.collections.h.b(a2, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar18 = t.a;
                Object[] array = tVar18.toArray(new String[0]);
                if (array != null) {
                    View j2 = asVar.j(Integer.parseInt(((String[]) array)[1]));
                    if (!(j2 instanceof com.dianping.gcmrnmodule.protocols.e)) {
                        j2 = null;
                    }
                    com.dianping.gcmrnmodule.protocols.e eVar = (com.dianping.gcmrnmodule.protocols.e) j2;
                    if (eVar != null) {
                        eVar.c(jSONObject);
                        r rVar2 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_appearCallback:", false)) {
                List<String> a3 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a3.isEmpty()) {
                    ListIterator<String> listIterator2 = a3.listIterator(a3.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() == 0) {
                            z17 = true;
                            continue;
                        } else {
                            z17 = false;
                            continue;
                        }
                        if (!z17) {
                            tVar17 = kotlin.collections.h.b(a3, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar17 = t.a;
                Object[] array2 = tVar17.toArray(new String[0]);
                if (array2 != null) {
                    View j3 = asVar.j(Integer.parseInt(((String[]) array2)[1]));
                    if (!(j3 instanceof com.dianping.gcmrnmodule.protocols.c)) {
                        j3 = null;
                    }
                    com.dianping.gcmrnmodule.protocols.c cVar = (com.dianping.gcmrnmodule.protocols.c) j3;
                    if (cVar != null) {
                        cVar.a(jSONObject);
                        r rVar3 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_disappearCallback:", false)) {
                List<String> a4 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a4.isEmpty()) {
                    ListIterator<String> listIterator3 = a4.listIterator(a4.size());
                    while (listIterator3.hasPrevious()) {
                        if (listIterator3.previous().length() == 0) {
                            z16 = true;
                            continue;
                        } else {
                            z16 = false;
                            continue;
                        }
                        if (!z16) {
                            tVar16 = kotlin.collections.h.b(a4, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar16 = t.a;
                Object[] array3 = tVar16.toArray(new String[0]);
                if (array3 != null) {
                    View j4 = asVar.j(Integer.parseInt(((String[]) array3)[1]));
                    if (!(j4 instanceof com.dianping.gcmrnmodule.protocols.d)) {
                        j4 = null;
                    }
                    com.dianping.gcmrnmodule.protocols.d dVar = (com.dianping.gcmrnmodule.protocols.d) j4;
                    if (dVar != null) {
                        dVar.b(jSONObject);
                        r rVar4 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_tapMaskCallback:", false)) {
                List<String> a5 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a5.isEmpty()) {
                    ListIterator<String> listIterator4 = a5.listIterator(a5.size());
                    while (listIterator4.hasPrevious()) {
                        if (listIterator4.previous().length() == 0) {
                            z15 = true;
                            continue;
                        } else {
                            z15 = false;
                            continue;
                        }
                        if (!z15) {
                            tVar15 = kotlin.collections.h.b(a5, listIterator4.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar15 = t.a;
                Object[] array4 = tVar15.toArray(new String[0]);
                if (array4 != null) {
                    View j5 = asVar.j(Integer.parseInt(((String[]) array4)[1]));
                    if (!(j5 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a)) {
                        j5 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a) j5;
                    if (aVar != null) {
                        Object[] objArr3 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a.h;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect2, false, "c991256a91fd520459781a59c7373fae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect2, false, "c991256a91fd520459781a59c7373fae");
                        } else {
                            aVar.a(new y(aVar.getId(), jSONObject));
                        }
                        r rVar5 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_dismissCallback:", false)) {
                List<String> a6 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a6.isEmpty()) {
                    ListIterator<String> listIterator5 = a6.listIterator(a6.size());
                    while (listIterator5.hasPrevious()) {
                        if (listIterator5.previous().length() == 0) {
                            z14 = true;
                            continue;
                        } else {
                            z14 = false;
                            continue;
                        }
                        if (!z14) {
                            tVar14 = kotlin.collections.h.b(a6, listIterator5.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar14 = t.a;
                Object[] array5 = tVar14.toArray(new String[0]);
                if (array5 != null) {
                    View j6 = asVar.j(Integer.parseInt(((String[]) array5)[1]));
                    if (!(j6 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a)) {
                        j6 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a aVar2 = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a) j6;
                    if (aVar2 != null) {
                        Object[] objArr4 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.a.h;
                        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect3, false, "5c2f3ff75043492af0cd6ae29f0ea915", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect3, false, "5c2f3ff75043492af0cd6ae29f0ea915");
                        } else {
                            aVar2.a(new com.dianping.gcmrnmodule.wrapperviews.events.h(aVar2.getId(), jSONObject));
                        }
                        r rVar6 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_pageChangedCallBack:", false)) {
                List<String> a7 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a7.isEmpty()) {
                    ListIterator<String> listIterator6 = a7.listIterator(a7.size());
                    while (listIterator6.hasPrevious()) {
                        if (listIterator6.previous().length() == 0) {
                            z13 = true;
                            continue;
                        } else {
                            z13 = false;
                            continue;
                        }
                        if (!z13) {
                            tVar13 = kotlin.collections.h.b(a7, listIterator6.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar13 = t.a;
                Object[] array6 = tVar13.toArray(new String[0]);
                if (array6 != null) {
                    View j7 = asVar.j(Integer.parseInt(((String[]) array6)[1]));
                    if (!(j7 instanceof com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a)) {
                        j7 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar3 = (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a) j7;
                    if (aVar3 != null) {
                        Object[] objArr5 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect4 = com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a.g;
                        if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect4, false, "1bc062899a95931ede604cbf87c311f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect4, false, "1bc062899a95931ede604cbf87c311f2");
                        } else {
                            aVar3.a(new com.dianping.gcmrnmodule.wrapperviews.events.o(aVar3.getId(), jSONObject));
                        }
                        r rVar7 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_attachTriggeredCallBack:", false)) {
                List<String> a8 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a8.isEmpty()) {
                    ListIterator<String> listIterator7 = a8.listIterator(a8.size());
                    while (listIterator7.hasPrevious()) {
                        if (listIterator7.previous().length() == 0) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (!z12) {
                            tVar12 = kotlin.collections.h.b(a8, listIterator7.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar12 = t.a;
                Object[] array7 = tVar12.toArray(new String[0]);
                if (array7 != null) {
                    View j8 = asVar.j(Integer.parseInt(((String[]) array7)[1]));
                    if (!(j8 instanceof com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a)) {
                        j8 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a aVar4 = (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a) j8;
                    if (aVar4 != null) {
                        Object[] objArr6 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect5 = com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.a.g;
                        if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect5, false, "24123f58130697a29a0d8f419256bea7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect5, false, "24123f58130697a29a0d8f419256bea7");
                        } else {
                            aVar4.a(new com.dianping.gcmrnmodule.wrapperviews.events.e(aVar4.getId(), jSONObject));
                        }
                        r rVar8 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_attachStatusChangedCallback:", false)) {
                List<String> a9 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a9.isEmpty()) {
                    ListIterator<String> listIterator8 = a9.listIterator(a9.size());
                    while (listIterator8.hasPrevious()) {
                        if (listIterator8.previous().length() == 0) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (!z11) {
                            tVar11 = kotlin.collections.h.b(a9, listIterator8.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar11 = t.a;
                Object[] array8 = tVar11.toArray(new String[0]);
                if (array8 != null) {
                    View j9 = asVar.j(Integer.parseInt(((String[]) array8)[1]));
                    if (!(j9 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a)) {
                        j9 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a aVar5 = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a) j9;
                    if (aVar5 != null) {
                        Object[] objArr7 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect6 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a.a;
                        if (PatchProxy.isSupport(objArr7, aVar5, changeQuickRedirect6, false, "34e1e743558743046fa85ba33e39d4df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, aVar5, changeQuickRedirect6, false, "34e1e743558743046fa85ba33e39d4df");
                        } else {
                            aVar5.a(new com.dianping.gcmrnmodule.wrapperviews.events.d(aVar5.getId(), jSONObject));
                        }
                        r rVar9 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_tabSelectedStatusChangedCallback:", false)) {
                List<String> a10 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a10.isEmpty()) {
                    ListIterator<String> listIterator9 = a10.listIterator(a10.size());
                    while (listIterator9.hasPrevious()) {
                        if (listIterator9.previous().length() == 0) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
                            tVar10 = kotlin.collections.h.b(a10, listIterator9.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar10 = t.a;
                Object[] array9 = tVar10.toArray(new String[0]);
                if (array9 != null) {
                    View j10 = asVar.j(Integer.parseInt(((String[]) array9)[1]));
                    if (!(j10 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a)) {
                        j10 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a aVar6 = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a) j10;
                    if (aVar6 != null) {
                        Object[] objArr8 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect7 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.a.a;
                        if (PatchProxy.isSupport(objArr8, aVar6, changeQuickRedirect7, false, "c15d84b0c9eeed273da7ec5828560ce5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, aVar6, changeQuickRedirect7, false, "c15d84b0c9eeed273da7ec5828560ce5");
                        } else {
                            aVar6.a(new x(aVar6.getId(), jSONObject));
                        }
                        r rVar10 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_onScrollBeginDragCallback:", false)) {
                List<String> a11 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a11.isEmpty()) {
                    ListIterator<String> listIterator10 = a11.listIterator(a11.size());
                    while (listIterator10.hasPrevious()) {
                        if (listIterator10.previous().length() == 0) {
                            z9 = true;
                            continue;
                        } else {
                            z9 = false;
                            continue;
                        }
                        if (!z9) {
                            tVar9 = kotlin.collections.h.b(a11, listIterator10.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar9 = t.a;
                Object[] array10 = tVar9.toArray(new String[0]);
                if (array10 != null) {
                    View j11 = asVar.j(Integer.parseInt(((String[]) array10)[1]));
                    com.dianping.gcmrnmodule.wrapperviews.b<?> bVar = (com.dianping.gcmrnmodule.wrapperviews.b) (!(j11 instanceof com.dianping.gcmrnmodule.wrapperviews.b) ? null : j11);
                    if (bVar != null) {
                        if (!(j11 instanceof com.dianping.gcmrnmodule.protocols.g)) {
                            j11 = null;
                        }
                        com.dianping.gcmrnmodule.protocols.g gVar = (com.dianping.gcmrnmodule.protocols.g) j11;
                        if (gVar != null) {
                            gVar.a(objArr[0], bVar);
                            r rVar11 = r.a;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_onScrollEndDragCallback:", false)) {
                List<String> a12 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a12.isEmpty()) {
                    ListIterator<String> listIterator11 = a12.listIterator(a12.size());
                    while (listIterator11.hasPrevious()) {
                        if (listIterator11.previous().length() == 0) {
                            z8 = true;
                            continue;
                        } else {
                            z8 = false;
                            continue;
                        }
                        if (!z8) {
                            tVar8 = kotlin.collections.h.b(a12, listIterator11.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar8 = t.a;
                Object[] array11 = tVar8.toArray(new String[0]);
                if (array11 != null) {
                    View j12 = asVar.j(Integer.parseInt(((String[]) array11)[1]));
                    com.dianping.gcmrnmodule.wrapperviews.b<?> bVar2 = (com.dianping.gcmrnmodule.wrapperviews.b) (!(j12 instanceof com.dianping.gcmrnmodule.wrapperviews.b) ? null : j12);
                    if (bVar2 != null) {
                        if (!(j12 instanceof com.dianping.gcmrnmodule.protocols.g)) {
                            j12 = null;
                        }
                        com.dianping.gcmrnmodule.protocols.g gVar2 = (com.dianping.gcmrnmodule.protocols.g) j12;
                        if (gVar2 != null) {
                            gVar2.b(objArr[0], bVar2);
                            r rVar12 = r.a;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_onScrollCallback:", false)) {
                List<String> a13 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a13.isEmpty()) {
                    ListIterator<String> listIterator12 = a13.listIterator(a13.size());
                    while (listIterator12.hasPrevious()) {
                        if (listIterator12.previous().length() == 0) {
                            z7 = true;
                            continue;
                        } else {
                            z7 = false;
                            continue;
                        }
                        if (!z7) {
                            tVar7 = kotlin.collections.h.b(a13, listIterator12.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar7 = t.a;
                Object[] array12 = tVar7.toArray(new String[0]);
                if (array12 != null) {
                    View j13 = asVar.j(Integer.parseInt(((String[]) array12)[1]));
                    com.dianping.gcmrnmodule.wrapperviews.b<?> bVar3 = (com.dianping.gcmrnmodule.wrapperviews.b) (!(j13 instanceof com.dianping.gcmrnmodule.wrapperviews.b) ? null : j13);
                    if (bVar3 != null) {
                        if (!(j13 instanceof com.dianping.gcmrnmodule.protocols.g)) {
                            j13 = null;
                        }
                        com.dianping.gcmrnmodule.protocols.g gVar3 = (com.dianping.gcmrnmodule.protocols.g) j13;
                        if (gVar3 != null) {
                            gVar3.c(objArr[0], bVar3);
                            r rVar13 = r.a;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_onMomentumScrollBeginCallback:", false)) {
                List<String> a14 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a14.isEmpty()) {
                    ListIterator<String> listIterator13 = a14.listIterator(a14.size());
                    while (listIterator13.hasPrevious()) {
                        if (listIterator13.previous().length() == 0) {
                            z6 = true;
                            continue;
                        } else {
                            z6 = false;
                            continue;
                        }
                        if (!z6) {
                            tVar6 = kotlin.collections.h.b(a14, listIterator13.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar6 = t.a;
                Object[] array13 = tVar6.toArray(new String[0]);
                if (array13 != null) {
                    View j14 = asVar.j(Integer.parseInt(((String[]) array13)[1]));
                    com.dianping.gcmrnmodule.wrapperviews.b<?> bVar4 = (com.dianping.gcmrnmodule.wrapperviews.b) (!(j14 instanceof com.dianping.gcmrnmodule.wrapperviews.b) ? null : j14);
                    if (bVar4 != null) {
                        if (!(j14 instanceof com.dianping.gcmrnmodule.protocols.g)) {
                            j14 = null;
                        }
                        com.dianping.gcmrnmodule.protocols.g gVar4 = (com.dianping.gcmrnmodule.protocols.g) j14;
                        if (gVar4 != null) {
                            gVar4.d(objArr[0], bVar4);
                            r rVar14 = r.a;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_onMomentumScrollEndCallback:", false)) {
                List<String> a15 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a15.isEmpty()) {
                    ListIterator<String> listIterator14 = a15.listIterator(a15.size());
                    while (listIterator14.hasPrevious()) {
                        if (listIterator14.previous().length() == 0) {
                            z5 = true;
                            continue;
                        } else {
                            z5 = false;
                            continue;
                        }
                        if (!z5) {
                            tVar5 = kotlin.collections.h.b(a15, listIterator14.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar5 = t.a;
                Object[] array14 = tVar5.toArray(new String[0]);
                if (array14 != null) {
                    View j15 = asVar.j(Integer.parseInt(((String[]) array14)[1]));
                    com.dianping.gcmrnmodule.wrapperviews.b<?> bVar5 = (com.dianping.gcmrnmodule.wrapperviews.b) (!(j15 instanceof com.dianping.gcmrnmodule.wrapperviews.b) ? null : j15);
                    if (bVar5 != null) {
                        if (!(j15 instanceof com.dianping.gcmrnmodule.protocols.g)) {
                            j15 = null;
                        }
                        com.dianping.gcmrnmodule.protocols.g gVar5 = (com.dianping.gcmrnmodule.protocols.g) j15;
                        if (gVar5 != null) {
                            gVar5.e(objArr[0], bVar5);
                            r rVar15 = r.a;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_hoverStatusChangedCallBack:", false)) {
                List<String> a16 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a16.isEmpty()) {
                    ListIterator<String> listIterator15 = a16.listIterator(a16.size());
                    while (listIterator15.hasPrevious()) {
                        if (listIterator15.previous().length() == 0) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (!z4) {
                            tVar4 = kotlin.collections.h.b(a16, listIterator15.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar4 = t.a;
                Object[] array15 = tVar4.toArray(new String[0]);
                if (array15 != null) {
                    View j16 = asVar.j(Integer.parseInt(((String[]) array15)[1]));
                    if (!(j16 instanceof com.dianping.gcmrnmodule.protocols.f)) {
                        j16 = null;
                    }
                    com.dianping.gcmrnmodule.protocols.f fVar = (com.dianping.gcmrnmodule.protocols.f) j16;
                    if (fVar != null) {
                        fVar.a_(jSONObject);
                        r rVar16 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_contextualActionCallBack:", false)) {
                List<String> a17 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a17.isEmpty()) {
                    ListIterator<String> listIterator16 = a17.listIterator(a17.size());
                    while (listIterator16.hasPrevious()) {
                        if (listIterator16.previous().length() == 0) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (!z3) {
                            tVar3 = kotlin.collections.h.b(a17, listIterator16.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar3 = t.a;
                Object[] array16 = tVar3.toArray(new String[0]);
                if (array16 != null) {
                    View j17 = asVar.j(Integer.parseInt(((String[]) array16)[1]));
                    if (!(j17 instanceof com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a)) {
                        j17 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar7 = (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a) j17;
                    if (aVar7 != null) {
                        Object[] objArr9 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect8 = com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a.g;
                        if (PatchProxy.isSupport(objArr9, aVar7, changeQuickRedirect8, false, "1e1363811de25eb1658518258216dfb9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, aVar7, changeQuickRedirect8, false, "1e1363811de25eb1658518258216dfb9");
                        } else {
                            aVar7.a(new com.dianping.gcmrnmodule.wrapperviews.events.f(aVar7.getId(), jSONObject));
                        }
                        r rVar17 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_dragRefreshStatusChangedCallback:", false)) {
                List<String> a18 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a18.isEmpty()) {
                    ListIterator<String> listIterator17 = a18.listIterator(a18.size());
                    while (listIterator17.hasPrevious()) {
                        if (listIterator17.previous().length() == 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (!z2) {
                            tVar2 = kotlin.collections.h.b(a18, listIterator17.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar2 = t.a;
                Object[] array17 = tVar2.toArray(new String[0]);
                if (array17 != null) {
                    View j18 = asVar.j(Integer.parseInt(((String[]) array17)[1]));
                    if (!(j18 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a)) {
                        j18 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar8 = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) j18;
                    if (aVar8 != null) {
                        Object[] objArr10 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect9 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a.a;
                        if (PatchProxy.isSupport(objArr10, aVar8, changeQuickRedirect9, false, "6b1be39f01db20858691540429fdee6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, aVar8, changeQuickRedirect9, false, "6b1be39f01db20858691540429fdee6c");
                        } else {
                            aVar8.a(new j(aVar8.getId(), jSONObject));
                        }
                        r rVar18 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (g.b(str, "gdm_refreshSuccessCallback:", false)) {
                List<String> a19 = new kotlin.text.f(CommonConstant.Symbol.COLON).a(str, 0);
                if (!a19.isEmpty()) {
                    ListIterator<String> listIterator18 = a19.listIterator(a19.size());
                    while (listIterator18.hasPrevious()) {
                        if (listIterator18.previous().length() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            tVar = kotlin.collections.h.b(a19, listIterator18.nextIndex() + 1);
                            break;
                        }
                    }
                }
                tVar = t.a;
                Object[] array18 = tVar.toArray(new String[0]);
                if (array18 != null) {
                    View j19 = asVar.j(Integer.parseInt(((String[]) array18)[1]));
                    if (!(j19 instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a)) {
                        j19 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar9 = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) j19;
                    if (aVar9 != null) {
                        Object[] objArr11 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect10 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a.a;
                        if (PatchProxy.isSupport(objArr11, aVar9, changeQuickRedirect10, false, "d00d3219f9499f3a030b51e691c30bc8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, aVar9, changeQuickRedirect10, false, "d00d3219f9499f3a030b51e691c30bc8");
                        } else {
                            aVar9.a(new com.dianping.gcmrnmodule.wrapperviews.events.s(aVar9.getId(), jSONObject));
                        }
                        r rVar19 = r.a;
                        return;
                    }
                    return;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<T>");
            } else {
                r rVar20 = r.a;
            }
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public boolean onRefresh(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "65d600e7a197baea136096a314dc192d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "65d600e7a197baea136096a314dc192d")).booleanValue();
        }
        h.b(objArr, "params");
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            return a2.a(Arrays.copyOf(objArr, objArr.length));
        }
        return false;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153fe52ed08989da855c85d72a30da9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153fe52ed08989da855c85d72a30da9d");
            return;
        }
        for (HostDestroyCallback hostDestroyCallback : this.i) {
            hostDestroyCallback.onDestroy(this);
        }
        this.i.clear();
        com.dianping.gcmrnmodule.wrapperviews.reuse.b b2 = b();
        if (b2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.reuse.b.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "4f2e390e15a5a48d3b4e71547cdebd89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "4f2e390e15a5a48d3b4e71547cdebd89");
            } else {
                com.dianping.gcmrnmodule.monitor.a performanceMonitor = b2.getPerformanceMonitor();
                if (performanceMonitor != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.monitor.a.a;
                    if (PatchProxy.isSupport(objArr3, performanceMonitor, changeQuickRedirect3, false, "2633b160a8686635dd2c086a79be7b39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, performanceMonitor, changeQuickRedirect3, false, "2633b160a8686635dd2c086a79be7b39");
                    } else if (performanceMonitor.e.get() != 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Float.valueOf(performanceMonitor.f.get()));
                        ShieldMetricsData.Companion.obtain().addValues("MRNModuleWhiteCount", arrayList).addTag("AliasName", performanceMonitor.h.getAliasName()).send();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Float.valueOf((float) ((performanceMonitor.f.get() / performanceMonitor.e.get()) * 100.0d)));
                        ShieldMetricsData.Companion.obtain().addValues("MRNModuleWhiteRate", arrayList2).addTag("AliasName", performanceMonitor.h.getAliasName()).send();
                        ArrayList arrayList3 = new ArrayList();
                        if (performanceMonitor.f.get() > 0) {
                            arrayList3.add(Float.valueOf((float) (performanceMonitor.g / performanceMonitor.f.get())));
                            ShieldMetricsData.Companion.obtain().addValues("MRNModuleWhiteTime", arrayList3).addTag("AliasName", performanceMonitor.h.getAliasName()).send();
                        }
                    }
                }
            }
        }
        com.dianping.gcmrnmodule.hostwrapper.c cVar = com.dianping.gcmrnmodule.hostwrapper.c.c;
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.dianping.gcmrnmodule.hostwrapper.c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "98336ee4f3a65335fee9169ff1f31554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "98336ee4f3a65335fee9169ff1f31554");
        } else {
            h.b(this, "host");
            com.dianping.gcmrnmodule.hostwrapper.c.b.remove(this.e);
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.dianping.gcmrnmodule.wrapperviews.a.a;
            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "04a06f7043b57da32c997506d808c03d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "04a06f7043b57da32c997506d808c03d");
            } else {
                a2.setHostInterface(null);
            }
        }
        com.facebook.react.modules.core.a.a().b(this.j);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onDisappear(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "f52e55154677a4cc4ed5aebbd3abee5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "f52e55154677a4cc4ed5aebbd3abee5b");
            return;
        }
        h.b(objArr, "params");
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Object[] objArr3 = {copyOf};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect2, false, "61235300750fa762826885406b45ff10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect2, false, "61235300750fa762826885406b45ff10");
                return;
            }
            h.b(copyOf, "params");
            JSONObject jSONObject = null;
            if ((true ^ (copyOf.length == 0)) && (copyOf[0] instanceof JSONObject)) {
                Object obj = copyOf[0];
                if (obj == null) {
                    throw new o("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            a2.a(new com.dianping.gcmrnmodule.wrapperviews.events.g(a2.getId(), jSONObject));
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onNeedLoadMore() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa60a27a2620ecde34bc05dd981d113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa60a27a2620ecde34bc05dd981d113");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            a2.b();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onRetryForLoadingFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebfdf3471b327710a92a1b01cc8d790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebfdf3471b327710a92a1b01cc8d790");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            a2.a();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicHostInterface
    public void onAppear(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "bf9c0215f0dcd75123030cf145a8c7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "bf9c0215f0dcd75123030cf145a8c7cd");
            return;
        }
        h.b(objArr, "params");
        com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = a();
        if (a2 != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Object[] objArr3 = {copyOf};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect2, false, "1ffbaf5a29201db2b52213bda68b7496", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect2, false, "1ffbaf5a29201db2b52213bda68b7496");
                return;
            }
            h.b(copyOf, "params");
            JSONObject jSONObject = null;
            if ((true ^ (copyOf.length == 0)) && (copyOf[0] instanceof JSONObject)) {
                Object obj = copyOf[0];
                if (obj == null) {
                    throw new o("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            a2.a(new com.dianping.gcmrnmodule.wrapperviews.events.c(a2.getId(), jSONObject));
        }
    }
}
