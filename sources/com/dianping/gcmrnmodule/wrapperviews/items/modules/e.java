package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.dianping.agentsdk.framework.ar;
import com.dianping.gcmrnmodule.fragments.MRNModuleFragment;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMetricsMonitorUtil;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.android.mrn.event.listeners.b;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020$2\u0006\u0010&\u001a\u00020)J\n\u0010*\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010+\u001a\u00020$H\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0006\u00100\u001a\u00020$J\u0006\u00101\u001a\u00020\u0012J\u0012\u00102\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u00105\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020$2\u0006\u00105\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u00105\u001a\u00020<H\u0016J\u0006\u0010=\u001a\u00020$J\b\u0010>\u001a\u00020$H\u0016J\b\u0010?\u001a\u00020$H\u0002J\u0010\u0010@\u001a\u00020$2\b\u0010A\u001a\u0004\u0018\u00010\nJ\u0010\u0010B\u001a\u00020$2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010C\u001a\u00020$H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;", "Landroid/widget/FrameLayout;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "Lcom/meituan/android/mrn/event/listeners/IMRNContainerListener;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "attachStateChangeListener", "Landroid/view/View$OnAttachStateChangeListener;", "eventGroup", "", "hostWrapper", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleVCModeHostWrapper;", "measureAndLayout", "Ljava/lang/Runnable;", "mrnModuleFragment", "Lcom/dianping/gcmrnmodule/fragments/MRNModuleFragment;", "needRemount", "", "pageEventDelegate", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/VCPageEventDelegate;", "getPageEventDelegate", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/VCPageEventDelegate;", "rootView", "Lcom/facebook/react/ReactRootView;", KnbConstants.PARAMS_SCENE, "Lcom/meituan/android/mrn/container/IMRNScene;", "vcItem", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;", "vcPageMountStartTime", "", "vcPageMounted", "vcPageRemounted", "vcPageUniqueCode", "vcPageUrlName", "buildVCPageMetricsData", "", "dispatchPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "dispatchPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", "findRootView", "forceLayout", "getHostInterface", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getWhiteboard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "handleMRNFragment", "isMounted", "mountMRNFragment", "modulesVCItemWrapperView", "onContainerDidAppear", "eventObject", "Lcom/meituan/android/mrn/event/listeners/IMRNContainerListener$DidAppearEventObject;", "onContainerWillCreate", "Lcom/meituan/android/mrn/event/listeners/IMRNContainerListener$WillCreateEventObject;", "onContainerWillDisappear", "Lcom/meituan/android/mrn/event/listeners/IMRNContainerListener$WillDisappearEventObject;", "onContainerWillRelease", "Lcom/meituan/android/mrn/event/listeners/IMRNContainerListener$WillReleaseEventObject;", "onDestroy", "requestLayout", "sendVCPageMetricsData", "setLayoutManagerMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "setVCItem", "unMountMRNFragment", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class e extends FrameLayout implements com.dianping.gcmrnmodule.protocols.i, com.meituan.android.mrn.event.listeners.b {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final Runnable g;
    private MRNModuleFragment h;
    private com.dianping.gcmrnmodule.hostwrapper.f i;
    private com.meituan.android.mrn.container.b j;
    private ReactRootView k;
    private d l;
    private final String m;
    private boolean n;
    private long o;
    private String p;
    @NotNull
    private final i q;
    private String r;
    private boolean s;
    private final View.OnAttachStateChangeListener t;
    private ao u;

    @Override // com.meituan.android.mrn.event.listeners.b
    public final void a(@NotNull b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb801bf2e931aa25daf87ec40db0eb09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb801bf2e931aa25daf87ec40db0eb09");
        } else {
            kotlin.jvm.internal.h.b(aVar, "eventObject");
        }
    }

    @Override // com.meituan.android.mrn.event.listeners.b
    public final void a(@NotNull b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180802833b0632ab9613c1cd2e7ec876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180802833b0632ab9613c1cd2e7ec876");
        } else {
            kotlin.jvm.internal.h.b(dVar, "eventObject");
        }
    }

    @Override // com.meituan.android.mrn.event.listeners.b
    public final void a(@NotNull b.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ded460cbd847f063e859124422a26b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ded460cbd847f063e859124422a26b3");
        } else {
            kotlin.jvm.internal.h.b(eVar, "eventObject");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull ao aoVar) {
        super(aoVar);
        kotlin.jvm.internal.h.b(aoVar, "reactContext");
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9210e023d696b975c7e2f44c89a1a94b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9210e023d696b975c7e2f44c89a1a94b");
            return;
        }
        this.u = aoVar;
        this.g = new b();
        this.m = "MRNModulesVCPageView" + hashCode();
        this.q = new i(this, this.u);
        this.t = new a();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        MRNModuleFragment mRNModuleFragment = new MRNModuleFragment();
        mRNModuleFragment.a(true);
        mRNModuleFragment.a(this.q);
        this.h = mRNModuleFragment;
        MRNModuleFragment mRNModuleFragment2 = this.h;
        if (mRNModuleFragment2 == null) {
            kotlin.jvm.internal.h.a();
        }
        MRNModuleFragment mRNModuleFragment3 = mRNModuleFragment2;
        MRNModuleFragment mRNModuleFragment4 = this.h;
        if (mRNModuleFragment4 == null) {
            kotlin.jvm.internal.h.a();
        }
        com.dianping.gcmrnmodule.hostwrapper.f fVar = new com.dianping.gcmrnmodule.hostwrapper.f(mRNModuleFragment3, mRNModuleFragment4);
        UIManagerModule uIManagerModule = (UIManagerModule) this.u.getNativeModule(UIManagerModule.class);
        fVar.c = uIManagerModule != null ? uIManagerModule.getUIImplementation() : null;
        fVar.j = this;
        this.i = fVar;
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
        ShieldMetricsMonitorUtil shieldMetricsMonitorUtil = ShieldMetricsMonitorUtil.INSTANCE;
        MRNModuleFragment mRNModuleFragment5 = this.h;
        if (mRNModuleFragment5 == null) {
            kotlin.jvm.internal.h.a();
        }
        String b2 = mRNModuleFragment5.b();
        kotlin.jvm.internal.h.a((Object) b2, "mrnModuleFragment!!.uniqueCode");
        ShieldMetricsData data = shieldMetricsMonitorUtil.getData(b2);
        if (data != null) {
            data.plusValues("Shield_InitVCPageView", kotlin.collections.h.a(Float.valueOf(((float) (currentThreadTimeMillis2 - currentThreadTimeMillis)) * 1.0f)));
        }
        addOnAttachStateChangeListener(this.t);
        ShieldMetricsMonitorUtil.INSTANCE.generateData(this.m);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff7cf8b5ca4fbfb596d9cd31cc0e8f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff7cf8b5ca4fbfb596d9cd31cc0e8f4");
                return;
            }
            e.this.measure(View.MeasureSpec.makeMeasureSpec(e.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e.this.getHeight(), 1073741824));
            e.this.layout(e.this.getLeft(), e.this.getTop(), e.this.getRight(), e.this.getBottom());
        }
    }

    @NotNull
    public final i getPageEventDelegate() {
        return this.q;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView$attachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect a;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f171489d49b231f9ffd410f55108a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f171489d49b231f9ffd410f55108a0");
            } else {
                kotlin.jvm.internal.h.b(view, "v");
            }
        }

        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a791ddaeb2b4b7a0090e5ee73657e52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a791ddaeb2b4b7a0090e5ee73657e52");
                return;
            }
            kotlin.jvm.internal.h.b(view, "v");
            if (e.this.s) {
                e.this.a();
                e.this.s = false;
            }
        }
    }

    public final void setLayoutManagerMode(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88369e762bd70f46ed76d53afdb838e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88369e762bd70f46ed76d53afdb838e2");
            return;
        }
        MRNModuleFragment mRNModuleFragment = this.h;
        if (mRNModuleFragment != null) {
            mRNModuleFragment.a(str);
        }
    }

    public final void setVCItem(@Nullable d dVar) {
        String str;
        Intent intent;
        Uri data;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "150ea9c879ea6bb2532a67391fb4b398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "150ea9c879ea6bb2532a67391fb4b398");
            return;
        }
        this.l = dVar;
        com.dianping.gcmrnmodule.hostwrapper.f fVar = this.i;
        if (fVar != null) {
            fVar.a(true);
        }
        if (this.l != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4db4449a79e535a686817fcac8ec179", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4db4449a79e535a686817fcac8ec179");
                return;
            }
            this.o = System.currentTimeMillis();
            Activity currentActivity = this.u.getCurrentActivity();
            if (currentActivity == null || (intent = currentActivity.getIntent()) == null || (data = intent.getData()) == null) {
                str = null;
            } else {
                if (!TextUtils.isEmpty(data.getHost()) && !TextUtils.isEmpty(data.getPath())) {
                    str = data.getHost() + data.getPath();
                } else if (!TextUtils.isEmpty(data.getHost())) {
                    str = data.getHost();
                } else {
                    str = !TextUtils.isEmpty(data.getPath()) ? data.getPath() : "";
                }
                String queryParameter = data.getQueryParameter("mrn_entry");
                if (!TextUtils.isEmpty(queryParameter)) {
                    str = str + "?mrn_entry=" + queryParameter;
                }
                String queryParameter2 = data.getQueryParameter("mrn_component");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    str = str + "&mrn_component=" + queryParameter2;
                }
            }
            this.p = str;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b44dabcbcc9ff4eaab4b726bba1ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b44dabcbcc9ff4eaab4b726bba1ded");
        } else if (this.l == null) {
            d();
        } else {
            a(this.l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(com.dianping.gcmrnmodule.wrapperviews.items.modules.d r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.gcmrnmodule.wrapperviews.items.modules.e.a(com.dianping.gcmrnmodule.wrapperviews.items.modules.d):void");
    }

    private final ReactRootView c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58fcf3962779f0f53f26d13af8867a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactRootView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58fcf3962779f0f53f26d13af8867a59");
        }
        ViewParent viewParent = this;
        while (true) {
            View view = (View) viewParent;
            if (!(view instanceof ReactRootView)) {
                viewParent = view.getParent();
                if (!(viewParent instanceof View)) {
                    return null;
                }
            } else {
                return (ReactRootView) view;
            }
        }
    }

    private final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edcce10d48c681ae3401877ea14ff59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edcce10d48c681ae3401877ea14ff59");
            return;
        }
        this.q.b((ReadableMap) null);
        MRNModuleFragment mRNModuleFragment = this.h;
        if (mRNModuleFragment != null) {
            if (this.j instanceof MRNBaseActivity) {
                com.meituan.android.mrn.container.b bVar = this.j;
                if (bVar == null) {
                    throw new o("null cannot be cast to non-null type com.meituan.android.mrn.container.MRNBaseActivity");
                }
                ((MRNBaseActivity) bVar).getSupportFragmentManager().beginTransaction().remove(mRNModuleFragment).commitNowAllowingStateLoss();
            } else if (this.j instanceof MRNBaseFragment) {
                com.meituan.android.mrn.container.b bVar2 = this.j;
                if (bVar2 == null) {
                    throw new o("null cannot be cast to non-null type com.meituan.android.mrn.container.MRNBaseFragment");
                }
                if (((MRNBaseFragment) bVar2).isAdded()) {
                    com.meituan.android.mrn.container.b bVar3 = this.j;
                    if (bVar3 == null) {
                        throw new o("null cannot be cast to non-null type com.meituan.android.mrn.container.MRNBaseFragment");
                    }
                    ((MRNBaseFragment) bVar3).getChildFragmentManager().beginTransaction().remove(mRNModuleFragment).commitNowAllowingStateLoss();
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e625fe92746d97b78efff542310556a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e625fe92746d97b78efff542310556a");
            return;
        }
        super.requestLayout();
        post(this.g);
    }

    @Override // android.view.View
    public final void forceLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d85f1f45d15eae5f1ffdea37132de2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d85f1f45d15eae5f1ffdea37132de2");
            return;
        }
        super.forceLayout();
        post(this.g);
    }

    @Override // com.dianping.gcmrnmodule.protocols.i
    @Nullable
    public final com.dianping.gcmrnmodule.hostwrapper.a getHostInterface() {
        return this.i;
    }

    @Nullable
    public final ar getWhiteboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfffc630e785c1dd81c03240f39721c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfffc630e785c1dd81c03240f39721c9");
        }
        if (this.i == null) {
            return null;
        }
        com.dianping.gcmrnmodule.hostwrapper.f fVar = this.i;
        if (fVar == null) {
            kotlin.jvm.internal.h.a();
        }
        return fVar.getBridge().getWhiteBoard();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adfc9b5cdc2edc2fbb5670746974b06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adfc9b5cdc2edc2fbb5670746974b06d");
            return;
        }
        e();
        d();
        if (this.i != null) {
            com.dianping.gcmrnmodule.hostwrapper.f fVar = this.i;
            if (fVar != null) {
                fVar.onDestroy();
            }
            this.i = null;
            com.meituan.android.mrn.event.c.b.b(this.r, this);
        }
        this.j = null;
        this.k = null;
        this.h = null;
        removeOnAttachStateChangeListener(this.t);
    }

    private final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d3e55682fac1ca6da95e07a3936168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d3e55682fac1ca6da95e07a3936168");
            return;
        }
        ShieldMetricsData data = ShieldMetricsMonitorUtil.INSTANCE.getData(this.m);
        if (data != null) {
            Float[] fArr = new Float[1];
            fArr[0] = Float.valueOf(this.o > 0 ? (float) (System.currentTimeMillis() - this.o) : 0.0f);
            ShieldMetricsData plusValues = data.plusValues("Shield_VCPageTime", kotlin.collections.h.c(fArr));
            if (plusValues != null) {
                ShieldMetricsData addTag = plusValues.addTag("mounted", this.b ? "1" : "0");
                if (addTag != null) {
                    ShieldMetricsData addTag2 = addTag.addTag("reMounted", this.n ? "1" : "0");
                    if (addTag2 != null) {
                        ShieldMetricsData addTag3 = addTag2.addTag("hasRootView", this.k != null ? "1" : "0");
                        if (addTag3 != null) {
                            ShieldMetricsData addTag4 = addTag3.addTag("hasScene", this.j != null ? "1" : "0");
                            if (addTag4 != null) {
                                com.dianping.gcmrnmodule.hostwrapper.f fVar = this.i;
                                String str = null;
                                if (TextUtils.isEmpty(fVar != null ? fVar.i : null)) {
                                    str = "NA";
                                } else {
                                    com.dianping.gcmrnmodule.hostwrapper.f fVar2 = this.i;
                                    if (fVar2 != null) {
                                        str = fVar2.i;
                                    }
                                }
                                ShieldMetricsData addTag5 = addTag4.addTag(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, str);
                                if (addTag5 != null) {
                                    ShieldMetricsData addTag6 = addTag5.addTag("urlName", !TextUtils.isEmpty(this.p) ? this.p : "NA");
                                    if (addTag6 != null) {
                                        addTag6.send();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ShieldMetricsMonitorUtil.INSTANCE.clear(this.m);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d180ffd815fe3fda32c76870dd5a62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d180ffd815fe3fda32c76870dd5a62");
            } else {
                e.this.b();
            }
        }
    }

    @Override // com.meituan.android.mrn.event.listeners.b
    public final void a(@NotNull b.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966cea2ea9af0729a62a49feeb386c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966cea2ea9af0729a62a49feeb386c51");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, "eventObject");
        ai.a(new c());
    }

    public final void a(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc71a8ec314bc7bdf7d5787ab0bede3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc71a8ec314bc7bdf7d5787ab0bede3c");
            return;
        }
        kotlin.jvm.internal.h.b(pageAppearType, "type");
        MRNModuleFragment mRNModuleFragment = this.h;
        if (mRNModuleFragment != null) {
            mRNModuleFragment.dispatchPageAppear(pageAppearType);
        }
    }

    public final void a(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c93bff4f041e9aef4023a22c2f6edae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c93bff4f041e9aef4023a22c2f6edae");
            return;
        }
        kotlin.jvm.internal.h.b(pageDisappearType, "type");
        MRNModuleFragment mRNModuleFragment = this.h;
        if (mRNModuleFragment != null) {
            mRNModuleFragment.dispatchPageDisappear(pageDisappearType);
        }
    }
}
