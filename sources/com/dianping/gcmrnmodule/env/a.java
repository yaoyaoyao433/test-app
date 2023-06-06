package com.dianping.gcmrnmodule.env;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ab;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.env.DynamicAgentHostReloadCallback;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.node.processor.AsyncProcessor;
import com.dianping.shield.node.processor.AsyncProcessorChain;
import com.facebook.react.ReactRootView;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.mrn.config.p;
import com.meituan.android.mrn.container.g;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001` H\u0016J\b\u0010!\u001a\u00020\fH\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010)\u001a\u0004\u0018\u00010#H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u00020\u001cH\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\u0016\u00105\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000707H\u0016J\b\u00108\u001a\u00020\u001cH\u0016J\b\u00109\u001a\u00020\u001cH\u0016J\b\u0010:\u001a\u00020\u001aH\u0016J\u0018\u0010;\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0012\u0010@\u001a\u00020\u001c2\b\u0010A\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010D\u001a\u00020\u001cH\u0016J\b\u0010E\u001a\u00020\u001cH\u0016J\b\u0010F\u001a\u00020\u001cH\u0016J\b\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020\u001aH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/dianping/gcmrnmodule/env/MRNExecutor;", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "Lcom/meituan/android/mrn/container/IMRNScene;", "mrnChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "bizName", "", Constants.ModelBeanConstants.KEY_BUNDLE_NAME, "compatDelegate", "Lcom/meituan/android/mrn/container/MRNSceneCompatDelegate;", "defaultHardwareBackBtnHandler", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "entryName", "hostReloadCallback", "Lcom/dianping/shield/dynamic/env/DynamicAgentHostReloadCallback;", "minVersion", "moduleKey", "moduleName", "processorHolder", "Lcom/dianping/gcmrnmodule/processor/MRNComputeProcessorHolder;", "rootContentView", "Lcom/dianping/gcmrnmodule/contentview/MRNModuleBaseRootView;", "buildUri", "Landroid/net/Uri;", "isDebug", "", "constructRootView", "", "getComputeProcessors", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/processor/AsyncProcessor;", "Lkotlin/collections/ArrayList;", "getDefaultHardwareBackBtnHandler", "getErrorView", "Landroid/view/View;", "getJSBundleName", "getLaunchOptions", "Landroid/os/Bundle;", "getMainComponentName", "getMinVersion", "getProgressView", "getReactRootView", "Lcom/facebook/react/ReactRootView;", "getRegistPackages", "", "Lcom/facebook/react/ReactPackage;", "initScript", "loadBundle", "onChassisCreate", "onChassisDestory", "onChassisPause", "onChassisResume", "onMonitorPaintingEnd", "errorSet", "", "onMonitorPaintingStart", "refreshScript", "renderApplicationImmediately", "sendEvent", "viewItem", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "viewSendEventInfo", "Lorg/json/JSONObject;", "setReloadHostCallback", "callback", "setUpEmbeddedMode", "setUpStandardMode", "showErrorView", "showLoadingView", "showRootView", "unmountReactApplicationDelayMillisWhenHidden", "", "unmountReactApplicationWhenHidden", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a implements DynamicExecutorInterface, com.meituan.android.mrn.container.b {
    public static ChangeQuickRedirect a;
    public static final C0062a b = new C0062a(null);
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private com.dianping.gcmrnmodule.contentview.a i;
    private g j;
    private DynamicAgentHostReloadCallback k;
    private com.dianping.gcmrnmodule.processor.b l;
    private final com.facebook.react.modules.core.b m;
    private final DynamicChassisInterface n;

    @Override // com.meituan.android.mrn.container.b
    public final void e() {
    }

    @Override // com.meituan.android.mrn.container.b
    public final void f() {
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final View g() {
        return null;
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final Bundle h() {
        return null;
    }

    @Override // com.meituan.android.mrn.container.b
    public final void i() {
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onChassisCreate() {
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onMonitorPaintingEnd(@NotNull Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd6c27924418269d26108b69c5c3bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd6c27924418269d26108b69c5c3bc0");
        } else {
            h.b(set, "errorSet");
        }
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onMonitorPaintingStart() {
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void refreshScript() {
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void sendEvent(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem, @NotNull JSONObject jSONObject) {
        Object[] objArr = {iDynamicModuleViewItem, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004010ef81d369ae57229b0c8ddbc3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004010ef81d369ae57229b0c8ddbc3b2");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        h.b(jSONObject, "viewSendEventInfo");
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/dianping/gcmrnmodule/contentview/MRNModuleBaseRootView;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b extends i implements kotlin.jvm.functions.b<com.dianping.gcmrnmodule.contentview.a, r> {
        public static ChangeQuickRedirect a;

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ r invoke(com.dianping.gcmrnmodule.contentview.a aVar) {
            com.dianping.gcmrnmodule.contentview.a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f8e063c09829ce542eb815150dbb93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f8e063c09829ce542eb815150dbb93");
            } else {
                h.b(aVar2, AdvanceSetting.NETWORK_TYPE);
                DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback = a.this.k;
                if (dynamicAgentHostReloadCallback != null) {
                    dynamicAgentHostReloadCallback.reloadHost(aVar2, a.this.g, a.this.d);
                }
            }
            return r.a;
        }
    }

    public a(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "mrnChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c7f150dc233a4aac9c5cbc2ddf9e20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c7f150dc233a4aac9c5cbc2ddf9e20");
            return;
        }
        this.n = dynamicChassisInterface;
        this.l = new com.dianping.gcmrnmodule.processor.b(this.n);
        this.m = new c();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/env/MRNExecutor$Companion;", "", "()V", "DEBUG_BUNDLE", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.env.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0062a {
        public C0062a() {
        }

        public /* synthetic */ C0062a(f fVar) {
            this();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invokeDefaultOnBackPressed"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class c implements com.facebook.react.modules.core.b {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.facebook.react.modules.core.b
        public final void r_() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31bddffd753eaa7121d5c1e6388f785", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31bddffd753eaa7121d5c1e6388f785");
                return;
            }
            FragmentActivity activity = a.this.n.getHostFragment().getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void setReloadHostCallback(@Nullable DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback) {
        this.k = dynamicAgentHostReloadCallback;
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onChassisResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "389ebdf0bd1669f20c0f6ec80bca3c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "389ebdf0bd1669f20c0f6ec80bca3c8f");
            return;
        }
        g gVar = this.j;
        if (gVar != null) {
            gVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void initScript() {
        PageContainerThemePackage pageContainerThemePackage;
        ?? r9;
        String str;
        Uri build;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6284a5b89ce7a2a4c297220d0ce631c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6284a5b89ce7a2a4c297220d0ce631c8");
            return;
        }
        this.c = DMUtils.getModuleKeyByHostName(this.n.getHostName());
        String str2 = this.c;
        if (str2 != null) {
            String str3 = str2;
            kotlin.text.f fVar = new kotlin.text.f("#");
            h.b(str3, TensorConfig.KEY_INPUT_ARRAY);
            if (fVar.a.matcher(str3).find()) {
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c0b35301cf1896064ae807a955eb367", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c0b35301cf1896064ae807a955eb367");
                    return;
                }
                List<String> a2 = new kotlin.text.f("#").a(str3, 0);
                if (a2.size() == 2) {
                    List<String> a3 = new kotlin.text.f("__").a(a2.get(1), 0);
                    if (a3.size() == 2) {
                        String str4 = a3.get(0);
                        String str5 = a3.get(1);
                        DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback = this.k;
                        if (dynamicAgentHostReloadCallback != null) {
                            dynamicAgentHostReloadCallback.reloadHost(str4, str5);
                            return;
                        }
                        return;
                    } else if (a3.size() == 1) {
                        String str6 = a3.get(0);
                        DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback2 = this.k;
                        if (dynamicAgentHostReloadCallback2 != null) {
                            dynamicAgentHostReloadCallback2.reloadHost(str6);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13119b18706c17742d85a789f56b4d46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13119b18706c17742d85a789f56b4d46");
                return;
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2fec978789935f899a219e0a2e440bac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2fec978789935f899a219e0a2e440bac");
            } else {
                ab<?> pageContainer = this.n.getPageContainer();
                if (!(pageContainer instanceof CommonPageContainer)) {
                    pageContainer = null;
                }
                CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
                if (commonPageContainer == null || (pageContainerThemePackage = commonPageContainer.getThemePackage()) == null) {
                    pageContainerThemePackage = new PageContainerThemePackage();
                }
                Context hostContext = this.n.getHostContext();
                if (hostContext == null) {
                    h.a();
                }
                this.i = new com.dianping.gcmrnmodule.contentview.a(hostContext, pageContainerThemePackage, new b());
            }
            List<String> a4 = new kotlin.text.f("/").a(str3, 0);
            if (a4.size() == 1) {
                this.d = a4.get(0);
                this.g = "mrnmodule_debug";
                r9 = 1;
            } else {
                if (a4.size() == 3) {
                    this.e = a4.get(0);
                    this.f = a4.get(1);
                    this.d = a4.get(2);
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5ed6fa20b18333de0ded522cb74853e0", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5ed6fa20b18333de0ded522cb74853e0");
                    } else {
                        HashMap<String, Serializable> chassisArguments = this.n.getChassisArguments();
                        String str7 = this.f;
                        if (chassisArguments != null) {
                            if (chassisArguments.get("mrn_min_version") instanceof String) {
                                Serializable serializable = chassisArguments.get("mrn_min_version");
                                if (serializable == null) {
                                    throw new o("null cannot be cast to non-null type kotlin.String");
                                }
                                str = (String) serializable;
                            } else if (str7 != null && (chassisArguments.get(str7) instanceof String)) {
                                Serializable serializable2 = chassisArguments.get(str7);
                                if (serializable2 == null) {
                                    throw new o("null cannot be cast to non-null type kotlin.String");
                                }
                                str = (String) serializable2;
                            }
                        }
                        str = null;
                    }
                    this.h = str;
                    this.g = "rn_" + this.e + '_' + this.f;
                }
                r9 = 0;
            }
            Object[] objArr6 = {Byte.valueOf((byte) r9)};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3c0257ce8bfd06dd2a2788ccd5a82460", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3c0257ce8bfd06dd2a2788ccd5a82460");
                return;
            }
            FragmentActivity activity = this.n.getHostFragment().getActivity();
            if (activity != null) {
                g gVar = new g(activity, this);
                Object[] objArr7 = {Byte.valueOf((byte) r9)};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "af9906e5f5c4300c55d7070f03e5dc65", RobustBitConfig.DEFAULT_VALUE)) {
                    build = (Uri) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "af9906e5f5c4300c55d7070f03e5dc65");
                } else {
                    Uri.Builder builder = new Uri.Builder();
                    builder.appendQueryParameter("mrn_biz", this.e);
                    builder.appendQueryParameter("mrn_entry", this.f);
                    builder.appendQueryParameter("mrn_component", this.d);
                    builder.appendQueryParameter("mrn_debug", String.valueOf((boolean) r9));
                    if (!TextUtils.isEmpty(this.h)) {
                        builder.appendQueryParameter("mrn_min_version", this.h);
                    }
                    build = builder.build();
                    h.a((Object) build, "builder.build()");
                }
                gVar.a(build);
                gVar.a((Bundle) null);
                this.j = gVar;
            }
        }
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onChassisPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e960e881573ffdb349a3be63f670ead7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e960e881573ffdb349a3be63f670ead7");
            return;
        }
        g gVar = this.j;
        if (gVar != null) {
            gVar.g();
        }
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    public final void onChassisDestory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2211a4db43b518783069a8289d1152d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2211a4db43b518783069a8289d1152d");
            return;
        }
        g gVar = this.j;
        if (gVar != null) {
            gVar.j();
        }
    }

    @Override // com.dianping.shield.dynamic.env.DynamicExecutorInterface
    @Nullable
    public final ArrayList<AsyncProcessor> getComputeProcessors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e2b634e4d69e2754b8d1a1d9d5fe8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e2b634e4d69e2754b8d1a1d9d5fe8a");
        }
        ArrayList<AsyncProcessor> arrayList = new ArrayList<>();
        com.dianping.gcmrnmodule.processor.b bVar = this.l;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.processor.b.a;
        arrayList.add((AsyncProcessorChain) (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7213a519fcd8046e0e6382e56c0d6bcd", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7213a519fcd8046e0e6382e56c0d6bcd") : bVar.c.a()));
        return arrayList;
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final String a() {
        return this.g;
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final ReactRootView b() {
        return this.i;
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final String c() {
        return this.d;
    }

    @Override // com.meituan.android.mrn.container.b
    @Nullable
    public final List<com.facebook.react.i> d() {
        List a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c566c9c74e90c5ca784a498c9db8ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c566c9c74e90c5ca784a498c9db8ac");
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.f)) {
                if (com.sankuai.meituan.serviceloader.b.a() && (a2 = com.sankuai.meituan.serviceloader.b.a(MRNReactPackageInterface.class, this.f, new Object[0])) != null && (!a2.isEmpty()) && a2.get(0) != null) {
                    Object obj = a2.get(0);
                    h.a(obj, "modulePackageList[0]");
                    arrayList.addAll(((MRNReactPackageInterface) obj).a());
                }
                List<com.facebook.react.i> a3 = p.a(this.e, this.f);
                if (a3 != null) {
                    arrayList.addAll(a3);
                }
            }
        } catch (Exception e) {
            ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(a.class, e.getMessage(), "MRNModuleRegistPackageFail");
        }
        return arrayList;
    }

    @Override // com.meituan.android.mrn.container.b
    @NotNull
    public final com.facebook.react.modules.core.b j() {
        return this.m;
    }
}
