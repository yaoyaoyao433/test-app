package com.dianping.gcmrnmodule.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.dianping.agentsdk.framework.ab;
import com.dianping.gcmrnmodule.mapping.a;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.fragments.DynamicModulesFragment;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.vc.ModulesVCInfo;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.lifecycle.PageLifecycleObserver;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAType;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMetricsMonitorUtil;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedMonitorUtil;
import com.facebook.react.common.d;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.views.view.f;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.mrn.container.b;
import com.meituan.android.mrn.container.g;
import com.meituan.android.mrn.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNModuleFragment extends DynamicModulesFragment {
    public static ChangeQuickRedirect a = null;
    private static boolean d = true;
    public String b;
    public boolean c;
    private ShieldGAInfo e;
    private boolean f;
    private String g;
    private b h;
    private String i;
    private PageLifecycleObserver j;

    public MRNModuleFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fddf48e0136c8a0beea3def4304d925", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fddf48e0136c8a0beea3def4304d925");
            return;
        }
        this.c = false;
        this.f = false;
        this.g = "MRNModuleFragment" + hashCode();
        ShieldMetricsData generateData = ShieldMetricsMonitorUtil.INSTANCE.generateData(this.g);
        if (!d) {
            generateData.plusValues("Shield_ColdStart", Arrays.asList(Float.valueOf(0.0f))).addTag("Shield_Start", "Hot");
            return;
        }
        generateData.plusValues("Shield_ColdStart", Arrays.asList(Float.valueOf(1.0f))).addTag("Shield_Start", "Cold");
        d = false;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(PageLifecycleObserver pageLifecycleObserver) {
        this.j = pageLifecycleObserver;
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onAttach(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d63cb8d5291182aa7acd49c64a9916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d63cb8d5291182aa7acd49c64a9916");
            return;
        }
        super.onAttach(context);
        ShieldMetricsData data = ShieldMetricsMonitorUtil.INSTANCE.getData(this.g);
        if (data != null) {
            if (this.shieldPreloadUnit != null) {
                data.plusValues("Shield_Preload", Arrays.asList(Float.valueOf(1.0f))).addTag("Shield_Preload", "True");
            } else {
                data.plusValues("Shield_Preload", Arrays.asList(Float.valueOf(0.0f))).addTag("Shield_Preload", "False");
            }
        }
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e286078ac8faafe80d92720c7c8885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e286078ac8faafe80d92720c7c8885");
            return;
        }
        super.onCreate(bundle);
        this.b = getStringParam("mrn_name");
        if (TextUtils.isEmpty(this.b) && getActivity() != null) {
            getActivity().finish();
        }
        String stringParam = getStringParam("serverip");
        String stringParam2 = getStringParam("serverport");
        if (TextUtils.isEmpty(stringParam) || TextUtils.isEmpty(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT)) {
            return;
        }
        Context context = getContext();
        d.a(context, "debug_http_host", stringParam + CommonConstant.Symbol.COLON + stringParam2);
    }

    public final void a(boolean z) {
        this.f = true;
    }

    public final void a(b bVar) {
        this.h = bVar;
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d88f280f5ad14a563a87322ef8b86ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d88f280f5ad14a563a87322ef8b86ad");
            return;
        }
        super.onActivityCreated(bundle);
        this.c = true;
        setPageName(this.g);
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment
    public ab<?> initializePageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13888a91dbe9bd8e41c7853d4271c61", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13888a91dbe9bd8e41c7853d4271c61");
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) super.initializePageContainer();
        if (commonPageContainer != null) {
            if ("staggered_grid".equals(this.i)) {
                commonPageContainer.setLayoutManagerMode(LayoutMode.STAGGERED_GRID_LAYOUT_MANAGER);
            } else {
                commonPageContainer.setLayoutManagerMode(LayoutMode.LINEAR_LAYOUT_MANAGER);
            }
            commonPageContainer.setMaxFlingVelocity(5000.0f);
            if (this.f) {
                commonPageContainer.setDidInterceptListener(new OnDidInterceptTouchListener() { // from class: com.dianping.gcmrnmodule.fragments.MRNModuleFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.shield.component.interfaces.OnDidInterceptTouchListener
                    public final void onViewDidIntercept(@NotNull View view, @NotNull MotionEvent motionEvent) {
                        Object[] objArr2 = {view, motionEvent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e66cb066fc7f6dbc06de48f0f0588c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e66cb066fc7f6dbc06de48f0f0588c6");
                        } else {
                            e.a(view, motionEvent);
                        }
                    }
                });
                commonPageContainer.setZFrameLayoutRes(R.layout.mrnmodule_zframelayout);
            }
        }
        return commonPageContainer;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.component.widgets.PageContainerRecyclerView.PageLoadFinishListener
    public void onViewHeightFinish() {
        g a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2ae6ba3a8f0a24ef7f7661901f7e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2ae6ba3a8f0a24ef7f7661901f7e4c");
            return;
        }
        super.onViewHeightFinish();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "938c75bdb32b49ccf2ac9ae30779ea51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "938c75bdb32b49ccf2ac9ae30779ea51");
        } else {
            ShieldMetricsData data = ShieldMetricsMonitorUtil.INSTANCE.getData(this.g);
            if (data != null) {
                data.addTag("Shield_AliasName", getAliasName()).cumulativeValue().cumulativeValue("Shield_TimeUse", Arrays.asList("Shield_InitVCPageView", "Shield_MountFragment", "Shield_FragmentPainting", "Shield_ModulePainting", "Shield_UpdateAgentContainer", "Shield_CreateViewHolder", "Shield_BindViewHolder")).send();
                ShieldMetricsMonitorUtil.INSTANCE.clear(this.g);
            }
        }
        if (!this.f || this.h == null || (a2 = u.a(this.h)) == null || a2.m == null) {
            return;
        }
        a2.m.b();
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d01cae105793c1226d69e331bb45984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d01cae105793c1226d69e331bb45984");
            return;
        }
        super.onStart();
        if (this.j != null) {
            this.j.onStart();
        }
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad63c6ed43f5c7e4cd66a4474afb12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad63c6ed43f5c7e4cd66a4474afb12e");
            return;
        }
        super.onResume();
        if (this.j != null) {
            this.j.onResume();
        }
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f093783b17e2083524c835859c470e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f093783b17e2083524c835859c470e");
            return;
        }
        super.onPause();
        ShieldMetricsMonitorUtil.INSTANCE.clear(this.g);
        if (this.j != null) {
            this.j.onPause();
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279d15f91f87e2f8ed808a37644337fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279d15f91f87e2f8ed808a37644337fa");
            return;
        }
        super.onStop();
        if (this.j != null) {
            this.j.onStop();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NonNull
    public String getHostName() {
        return this.b;
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment
    public DynamicMappingInterface getDynamicMapping() {
        return a.b;
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    /* renamed from: a */
    public final com.dianping.gcmrnmodule.hostwrapper.a getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db75cbaa50473e9cd5322e7986e533c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.hostwrapper.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db75cbaa50473e9cd5322e7986e533c5");
        }
        if (getDynamicExecEnvironment() == null || !(getDynamicExecEnvironment().getHost() instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
            return null;
        }
        return (com.dianping.gcmrnmodule.hostwrapper.a) getDynamicExecEnvironment().getHost();
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db811eb5ed52c6603aa189617f5f63c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db811eb5ed52c6603aa189617f5f63c5");
        }
        if (this.e == null) {
            this.e = new ShieldGAInfo(ShieldGAType.MRNMODULESVC, getAliasName());
        }
        return this.e;
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public String getAliasName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63d64aacac56c6229c93a817b5b7576", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63d64aacac56c6229c93a817b5b7576");
        }
        FragmentActivity activity = getActivity();
        Fragment parentFragment = getParentFragment();
        if (activity instanceof MRNBaseActivity) {
            MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) activity;
            if (mRNBaseActivity.k() != null && mRNBaseActivity.a() != null && mRNBaseActivity.c() != null) {
                return mRNBaseActivity.a() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + mRNBaseActivity.c();
            }
        }
        if (parentFragment instanceof MRNBaseFragment) {
            MRNBaseFragment mRNBaseFragment = (MRNBaseFragment) parentFragment;
            if (mRNBaseFragment.n() != null && mRNBaseFragment.a() != null && mRNBaseFragment.c() != null) {
                return mRNBaseFragment.a() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + mRNBaseFragment.c();
            }
        }
        return super.getAliasName();
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(ModulesVCInfo modulesVCInfo) {
        View findViewById;
        int i = 0;
        Object[] objArr = {modulesVCInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81bda2b6cb83eac6c6940e52936edf5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81bda2b6cb83eac6c6940e52936edf5d");
        } else if (getContext() == null) {
        } else {
            if (this.f) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27c51b5ac5133b6f7884d903dd553ad3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27c51b5ac5133b6f7884d903dd553ad3");
                } else if (getActivity() != null && (findViewById = getActivity().findViewById(getId())) != null && findViewById.getParent() != null && (findViewById.getParent() instanceof f)) {
                    f fVar = (f) findViewById.getParent();
                    int childCount = fVar.getChildCount();
                    View view = null;
                    while (true) {
                        if (i >= childCount) {
                            break;
                        }
                        View childAt = fVar.getChildAt(i);
                        if ((childAt instanceof f) && childAt.getHeight() > 0 && childAt.getTop() == 0) {
                            view = childAt;
                            break;
                        }
                        i++;
                    }
                    if (view != null) {
                        setAutoOffset(view.getHeight());
                    }
                }
            }
            super.painting(modulesVCInfo);
            ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.getPageKey(getAliasName(), 3));
        }
    }

    @Override // com.dianping.voyager.fragment.CommonShieldFragment
    public boolean getTitleBarOverlay() {
        View findViewById;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ae9b76c65eedd82dfa62b0e9656cad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ae9b76c65eedd82dfa62b0e9656cad")).booleanValue();
        }
        if (this.f) {
            return getActivity() != null && (findViewById = getActivity().findViewById(getId())) != null && findViewById.getHeight() > 0 && findViewById.getTop() == 0;
        }
        return super.getTitleBarOverlay();
    }

    public final String b() {
        return this.g;
    }

    @Override // com.dianping.shield.dynamic.fragments.DynamicModulesFragment, com.dianping.voyager.fragment.CommonShieldFragment, com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.portal.fragment.HoloFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23c64c922b0bd101f5358a6da1b7d8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23c64c922b0bd101f5358a6da1b7d8d");
            return;
        }
        super.onDestroy();
        this.h = null;
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.lifecycle.PageLifecycleDispatcher
    @NotNull
    public PageLifecycleObserver getPageLifecycleObserver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc9bdcd137c83f5dfcc56f7319c8732", RobustBitConfig.DEFAULT_VALUE)) {
            return (PageLifecycleObserver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc9bdcd137c83f5dfcc56f7319c8732");
        }
        if (this.j != null) {
            return this.j;
        }
        return super.getPageLifecycleObserver();
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7febc3586836cad3aee0c88dc90350", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7febc3586836cad3aee0c88dc90350");
        } else {
            onPageAppear(pageAppearType);
        }
    }

    @Override // com.dianping.agentsdk.fragment.AgentManagerFragment, com.dianping.shield.lifecycle.PageLifecycleDispatcher
    public void dispatchPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f439fa773c023f27cea131baba7c1f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f439fa773c023f27cea131baba7c1f33");
        } else {
            onPageDisappear(pageDisappearType);
        }
    }
}
