package com.meituan.android.mrn.module.msi;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.arch.lifecycle.g;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.router.f;
import com.meituan.android.mrn.utils.ai;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.context.b;
import com.meituan.msi.context.h;
import com.meituan.msi.page.IPage;
import com.meituan.msi.page.c;
import com.meituan.msi.page.e;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
@ReactModule(name = MSIBridgeModule.TAG)
/* loaded from: classes2.dex */
public class MSIBridgeModule extends ReactContextBaseJavaModule implements f, com.facebook.react.turbomodule.core.interfaces.a, IPage {
    public static final String TAG = "MSIModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<Activity, b> resultCallBackMap = new WeakHashMap();
    private ActivityEventListener activityEventListener;
    private ApiPortal apiPortal;
    private LifecycleEventListener lifecycleEventListener;
    private g mLifecycleRegistry;
    private com.meituan.android.mrn.router.f mPageRouter;
    public a mrnPageContext;

    @Override // com.meituan.msi.page.IPage
    public View getAndCreateView(int i, String str, com.meituan.msi.page.f fVar) {
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public c getKeyBoard() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return TAG;
    }

    @Override // com.meituan.msi.page.IPage
    public String getPagePath() {
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public e getViewGroup() {
        return null;
    }

    public MSIBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "661f4a6b89f09ac2a585fc165b54f0de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "661f4a6b89f09ac2a585fc165b54f0de");
            return;
        }
        this.mLifecycleRegistry = null;
        this.mrnPageContext = null;
        this.lifecycleEventListener = new LifecycleEventListener() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostResume() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d9a50e08dff776186d5c62f2174fdba4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d9a50e08dff776186d5c62f2174fdba4");
                    return;
                }
                if (MSIBridgeModule.this.mLifecycleRegistry != null) {
                    MSIBridgeModule.this.mLifecycleRegistry.a(d.a.ON_RESUME);
                }
                if (MSIBridgeModule.this.apiPortal != null) {
                    MSIBridgeModule.this.apiPortal.b.b();
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostPause() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "66ea22d8ba9519bb07112b56cf98e195", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "66ea22d8ba9519bb07112b56cf98e195");
                    return;
                }
                if (MSIBridgeModule.this.mLifecycleRegistry != null) {
                    MSIBridgeModule.this.mLifecycleRegistry.a(d.a.ON_PAUSE);
                }
                if (MSIBridgeModule.this.apiPortal != null) {
                    MSIBridgeModule.this.apiPortal.b.c();
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public final void onHostDestroy() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d5810832f9d2d7476eb3f93f83a8ea8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d5810832f9d2d7476eb3f93f83a8ea8b");
                    return;
                }
                if (MSIBridgeModule.this.mLifecycleRegistry != null) {
                    MSIBridgeModule.this.mLifecycleRegistry.a(d.a.ON_DESTROY);
                }
                if (MSIBridgeModule.this.apiPortal != null) {
                    MSIBridgeModule.this.apiPortal.b.d();
                }
            }
        };
        this.activityEventListener = new ActivityEventListener() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.2
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.ActivityEventListener
            public final void onNewIntent(Intent intent) {
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                Object[] objArr2 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fcdd606339795f611af2c477a631bc5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fcdd606339795f611af2c477a631bc5c");
                    return;
                }
                b bVar = (b) MSIBridgeModule.resultCallBackMap.get(activity);
                if (bVar != null) {
                    bVar.onActivityResult(i2, intent);
                }
            }
        };
        this.mLifecycleRegistry = new g(this);
        this.mrnPageContext = new a(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cd143f42df18bc0d6af8916bec72a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cd143f42df18bc0d6af8916bec72a1d");
        } else {
            initApiPortal();
        }
    }

    private synchronized void initApiPortal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2205c51ddc6c26b0c74c61576300b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2205c51ddc6c26b0c74c61576300b1c");
        } else if (this.apiPortal != null) {
        } else {
            getReactApplicationContext().addLifecycleEventListener(this.lifecycleEventListener);
            getReactApplicationContext().addActivityEventListener(this.activityEventListener);
            ApiPortal.a aVar = new ApiPortal.a();
            aVar.a(new com.meituan.msi.context.d() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.context.d
                public final ContainerInfo a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "221afbd94ec00c1b0424f6ae8627efde", RobustBitConfig.DEFAULT_VALUE) ? (ContainerInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "221afbd94ec00c1b0424f6ae8627efde") : new ContainerInfo(com.meituan.android.base.a.d, "mrn", com.meituan.android.mrn.config.c.a().e());
                }
            });
            aVar.a(new com.meituan.msi.context.a() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.context.a
                public final Activity a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64d6d4ba0364f0bb2c28774726b5ac56", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64d6d4ba0364f0bb2c28774726b5ac56") : MSIBridgeModule.this.getCurrentActivity();
                }

                @Override // com.meituan.msi.context.a
                public final Context b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f3913a424f863b7ef7f121da88cbff18", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f3913a424f863b7ef7f121da88cbff18") : MSIBridgeModule.this.getReactApplicationContext();
                }

                @Override // com.meituan.msi.context.a
                public final d.b c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67c077bd1a711a77d7247d00f2f3aee3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (d.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67c077bd1a711a77d7247d00f2f3aee3");
                    }
                    if (MSIBridgeModule.this.mLifecycleRegistry == null) {
                        return null;
                    }
                    return MSIBridgeModule.this.mLifecycleRegistry.a;
                }

                @Override // com.meituan.msi.context.a
                public final void a(int i, Intent intent, b bVar) {
                    Object[] objArr2 = {Integer.valueOf(i), intent, bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a917d1ac496d6ba884d613fbd6d03ec5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a917d1ac496d6ba884d613fbd6d03ec5");
                    } else if (MSIBridgeModule.this.getCurrentActivity() != null) {
                        MSIBridgeModule.resultCallBackMap.put(MSIBridgeModule.this.getCurrentActivity(), bVar);
                        MSIBridgeModule.this.getCurrentActivity().startActivityForResult(intent, i);
                    } else {
                        bVar.onFail(0, "current activity is null");
                    }
                }
            });
            aVar.e = new com.meituan.msi.dispather.d() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.dispather.d
                public final void a(EventType eventType, String str, String str2, BroadcastEvent broadcastEvent) {
                    Object[] objArr2 = {eventType, str, str2, broadcastEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad27ea66c9ee3c2257e00c156d72f2b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad27ea66c9ee3c2257e00c156d72f2b2");
                    } else {
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) MSIBridgeModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("msi.event", str2);
                    }
                }

                @Override // com.meituan.msi.dispather.d
                public final void a(String str, String str2) {
                    Object[] objArr2 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "905a391ed8d8f92753e7523a479142ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "905a391ed8d8f92753e7523a479142ea");
                    } else if (TextUtils.equals(str, EventHandler.EVENT_JUMP_LINK_INNER)) {
                        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.5.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "062bfe18f242318d917210a984ef2075", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "062bfe18f242318d917210a984ef2075");
                                } else if (MSIBridgeModule.this.mPageRouter != null) {
                                    try {
                                        MSIBridgeModule.this.mPageRouter.a(null);
                                    } catch (f.a unused) {
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                }
            };
            aVar.c = new Executor() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.6
                public static ChangeQuickRedirect a;

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b281bb74f7bf1401f583b412e276b6d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b281bb74f7bf1401f583b412e276b6d2");
                    } else {
                        runnable.run();
                    }
                }
            };
            aVar.a(this.mrnPageContext);
            this.mPageRouter = new com.meituan.android.mrn.router.f(getCurrentActivity());
            this.apiPortal = aVar.a();
            this.apiPortal.b.a();
        }
    }

    @Override // com.meituan.msi.page.IPage
    public void showView(int i, final View view, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abddad123e6d4a006113276a1986158f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abddad123e6d4a006113276a1986158f");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4841cd0b98d6765ab0debb7cf3e71b39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4841cd0b98d6765ab0debb7cf3e71b39");
                        return;
                    }
                    Activity currentActivity = MSIBridgeModule.this.getCurrentActivity();
                    if (currentActivity != null && (currentActivity instanceof MRNBaseActivity)) {
                        MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) currentActivity;
                        ToastView toastView = mRNBaseActivity.c;
                        if (toastView == null) {
                            toastView = (ToastView) view;
                            mRNBaseActivity.c = (ToastView) view;
                            toastView.setVisibility(8);
                        }
                        if (toastView.getParent() == null) {
                            mRNBaseActivity.h.addView(view);
                        }
                        toastView.setVisibility(0);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msi.page.IPage
    public View findView(int i, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "663cc59a4a985728a39510308409238f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "663cc59a4a985728a39510308409238f");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (currentActivity instanceof MRNBaseActivity)) {
            return ((MRNBaseActivity) currentActivity).c;
        }
        return null;
    }

    @Override // com.meituan.msi.page.IPage
    public void hideView(int i, View view, IPage.a aVar) {
        Object[] objArr = {Integer.valueOf(i), view, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e32bf3fd0ebfabaf5b06ffd9581192b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e32bf3fd0ebfabaf5b06ffd9581192b");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ea6c101bde4d1e514f13e75a2876801", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ea6c101bde4d1e514f13e75a2876801");
                        return;
                    }
                    Activity currentActivity = MSIBridgeModule.this.getCurrentActivity();
                    if (currentActivity != null && (currentActivity instanceof MRNBaseActivity)) {
                        MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) currentActivity;
                        ToastView toastView = mRNBaseActivity.c;
                        if (toastView != null) {
                            toastView.setVisibility(8);
                        }
                        mRNBaseActivity.c = null;
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements h {
        public static ChangeQuickRedirect a;
        public ReactApplicationContext b;

        @Override // com.meituan.msi.context.h
        public final IPage a(int i) {
            return null;
        }

        @Override // com.meituan.msi.context.h
        public final String b() {
            return null;
        }

        public a(ReactApplicationContext reactApplicationContext) {
            Object[] objArr = {MSIBridgeModule.this, reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c562ff5d9caf9578c0ae791e3304231", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c562ff5d9caf9578c0ae791e3304231");
            } else {
                this.b = reactApplicationContext;
            }
        }

        @Override // com.meituan.msi.context.h
        public final IPage a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ced2c0de481386f59916171d9cc253f", RobustBitConfig.DEFAULT_VALUE) ? (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ced2c0de481386f59916171d9cc253f") : new MSIBridgeModule(this.b);
        }
    }

    @ReactMethod
    public void invoke(String str, final Callback callback, final Callback callback2) {
        Object[] objArr = {str, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2d55e4878d841a41c921ed6826e5b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2d55e4878d841a41c921ed6826e5b4c");
            return;
        }
        if (this.apiPortal == null) {
            initApiPortal();
        }
        this.apiPortal.a(new StringRequestData.Builder().nativeStartTime(System.currentTimeMillis()).requestData(str).build(), new com.meituan.msi.api.c<String>() { // from class: com.meituan.android.mrn.module.msi.MSIBridgeModule.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void a(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "46b589f47906ad751993bd24cf632104", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "46b589f47906ad751993bd24cf632104");
                } else if (callback2 != null) {
                    callback2.invoke(str3);
                }
            }

            @Override // com.meituan.msi.api.c
            public final /* synthetic */ void b(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c4d42416f17872131f057adafd2f980", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c4d42416f17872131f057adafd2f980");
                } else if (callback != null) {
                    callback.invoke(str3);
                }
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String invokeSync(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6e058ea32fd43332ba82ea75c9f183a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6e058ea32fd43332ba82ea75c9f183a");
        }
        if (this.apiPortal == null) {
            initApiPortal();
        }
        return this.apiPortal.a(new StringRequestData.Builder().nativeStartTime(System.currentTimeMillis()).requestData(str).build());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3248185b3a1eb0a17d4d1592feff225d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3248185b3a1eb0a17d4d1592feff225d");
            return;
        }
        if (this.lifecycleEventListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.lifecycleEventListener);
        }
        if (this.activityEventListener != null) {
            getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        }
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    public d getLifecycle() {
        return this.mLifecycleRegistry;
    }
}
