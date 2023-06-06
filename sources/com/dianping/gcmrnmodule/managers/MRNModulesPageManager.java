package com.dianping.gcmrnmodule.managers;

import android.os.Handler;
import android.view.View;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.e;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.h;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.i;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.j;
import com.dianping.shield.lifecycle.AppObserver;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ad;
import com.facebook.react.uimanager.ar;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.jvm.internal.t;
/* compiled from: ProGuard */
@ReactModule(name = MRNModulesPageManager.MODULE_NAME)
/* loaded from: classes.dex */
public class MRNModulesPageManager extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNModulesVCPageManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    @ReactMethod
    public void containerWillAppear(ReadableMap readableMap) {
    }

    @ReactMethod
    public void containerWillDisappear(ReadableMap readableMap) {
    }

    @ReactMethod
    public void didBlur(int i, Promise promise) {
    }

    @ReactMethod
    public void didFocus(int i, Promise promise) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void willBlur(int i, Promise promise) {
    }

    @ReactMethod
    public void willFocus(int i, Promise promise) {
    }

    public MRNModulesPageManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de775f4892bbabc9807bb7c61e0b6f10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de775f4892bbabc9807bb7c61e0b6f10");
        }
    }

    @ReactMethod
    public void willAppear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f07f53ea2f278f948933ca7c14a0963f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f07f53ea2f278f948933ca7c14a0963f");
        } else {
            callbackPageEvent(a.WILL_APPEAR, readableMap);
        }
    }

    @ReactMethod
    public void didAppear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2810eef9412a94c4c922edea0db83fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2810eef9412a94c4c922edea0db83fd4");
        } else {
            callbackPageEvent(a.DID_APPEAR, readableMap);
        }
    }

    @ReactMethod
    public void willDisappear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d07ed37c733f8568b240b85cd49cbb7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d07ed37c733f8568b240b85cd49cbb7a");
        } else {
            callbackPageEvent(a.WILL_DISAPPEAR, readableMap);
        }
    }

    @ReactMethod
    public void didDisappear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d45f78d56c95262c769625d04a181d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d45f78d56c95262c769625d04a181d2");
        } else {
            callbackPageEvent(a.DID_DISAPPEAR, readableMap);
        }
    }

    @ReactMethod
    public void containerDidAppear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2de28ab786e58bfc8cfe28080f565cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2de28ab786e58bfc8cfe28080f565cf5");
        } else {
            callbackPageEvent(a.CONTAINER_APPEAR, readableMap);
        }
    }

    @ReactMethod
    public void containerDidDisappear(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b41422e3d1954a11cf9b4befea5b9ddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b41422e3d1954a11cf9b4befea5b9ddb");
        } else {
            callbackPageEvent(a.CONTAINER_DISAPPEAR, readableMap);
        }
    }

    private void callbackPageEvent(final a aVar, final ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9e7e77625e7cb3fa6c374b6d0f7152b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9e7e77625e7cb3fa6c374b6d0f7152b");
            return;
        }
        final int i = (int) readableMap.getDouble("reactTag");
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new ar() { // from class: com.dianping.gcmrnmodule.managers.MRNModulesPageManager.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v53, types: [com.dianping.shield.lifecycle.PageDisappearType, T] */
            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                PageDisappearType pageDisappearType;
                PageAppearType pageAppearType;
                Object[] objArr2 = {nativeViewHierarchyManager};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8d41672f0db078d8c24b45ae66513fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8d41672f0db078d8c24b45ae66513fe");
                    return;
                }
                View d = nativeViewHierarchyManager.d(i);
                if (d instanceof e) {
                    i pageEventDelegate = ((e) d).getPageEventDelegate();
                    switch (AnonymousClass2.a[aVar.ordinal()]) {
                        case 1:
                            pageEventDelegate.a(readableMap.getMap("payload"));
                            return;
                        case 2:
                            ReadableMap map = readableMap.getMap("payload");
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr3, pageEventDelegate, changeQuickRedirect4, false, "1f7406eeed64b29311118a26c3b38bac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, pageEventDelegate, changeQuickRedirect4, false, "1f7406eeed64b29311118a26c3b38bac");
                                return;
                            }
                            StringBuilder sb = new StringBuilder("didAppear ");
                            sb.append(pageEventDelegate.d.getId());
                            sb.append(Constants.SPACE);
                            sb.append(pageEventDelegate.c(map));
                            sb.append(Constants.SPACE);
                            sb.append(map == null ? "fromNative" : "");
                            pageEventDelegate.a(AppearanceModule.NAME, sb.toString());
                            pageEventDelegate.c = AppObserver.INSTANCE.getActivityCount();
                            if (pageEventDelegate.b == h.Appear || !pageEventDelegate.d.b) {
                                return;
                            }
                            String c = pageEventDelegate.c(map);
                            PageAppearType pageAppearType2 = PageAppearType.APPEAR;
                            if (pageEventDelegate.b == h.Disappear) {
                                pageAppearType2 = PageAppearType.PAGE_BACK;
                            }
                            StringBuilder sb2 = new StringBuilder("didAppear ");
                            sb2.append(pageEventDelegate.d.getId());
                            sb2.append(Constants.SPACE);
                            sb2.append(c);
                            sb2.append(Constants.SPACE);
                            sb2.append(pageAppearType2);
                            sb2.append(Constants.SPACE);
                            sb2.append(map == null ? "fromNative" : "");
                            pageEventDelegate.a("AppearanceEvent", sb2.toString());
                            pageEventDelegate.b = h.Appear;
                            pageEventDelegate.d.a(pageAppearType2);
                            return;
                        case 3:
                            pageEventDelegate.b(readableMap.getMap("payload"));
                            return;
                        case 4:
                            ReadableMap map2 = readableMap.getMap("payload");
                            Object[] objArr4 = {map2};
                            ChangeQuickRedirect changeQuickRedirect5 = i.a;
                            if (PatchProxy.isSupport(objArr4, pageEventDelegate, changeQuickRedirect5, false, "4840ed8bd9850046a00b6c0be33ff57e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, pageEventDelegate, changeQuickRedirect5, false, "4840ed8bd9850046a00b6c0be33ff57e");
                                return;
                            }
                            StringBuilder sb3 = new StringBuilder("didDisappear ");
                            sb3.append(pageEventDelegate.d.getId());
                            sb3.append(Constants.SPACE);
                            sb3.append(pageEventDelegate.c(map2));
                            sb3.append(Constants.SPACE);
                            sb3.append(map2 == null ? "fromNative" : "");
                            pageEventDelegate.a(AppearanceModule.NAME, sb3.toString());
                            pageEventDelegate.c = AppObserver.INSTANCE.getActivityCount();
                            if (pageEventDelegate.b != h.Disappear) {
                                String c2 = pageEventDelegate.c(map2);
                                if (kotlin.jvm.internal.h.a((Object) c2, (Object) "Navigation/PUSH") || kotlin.jvm.internal.h.a((Object) c2, (Object) "Navigation/NAVIGATE") || kotlin.jvm.internal.h.a((Object) c2, (Object) "Navigation/INIT")) {
                                    pageDisappearType = PageDisappearType.GO_AHEAD;
                                } else {
                                    pageDisappearType = PageDisappearType.GO_BACK;
                                }
                                pageEventDelegate.a("AppearanceEvent", "didDisappear " + pageEventDelegate.d.getId() + Constants.SPACE + c2 + Constants.SPACE + pageDisappearType);
                                pageEventDelegate.b = h.Disappear;
                                pageEventDelegate.d.a(pageDisappearType);
                                return;
                            }
                            return;
                        case 5:
                            int i2 = (int) readableMap.getDouble("rootTag");
                            Object[] objArr5 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect6 = i.a;
                            if (PatchProxy.isSupport(objArr5, pageEventDelegate, changeQuickRedirect6, false, "dd2b2a89d3f88793a32a64936e2340b4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, pageEventDelegate, changeQuickRedirect6, false, "dd2b2a89d3f88793a32a64936e2340b4");
                                return;
                            }
                            ad a2 = pageEventDelegate.e.a();
                            kotlin.jvm.internal.h.a((Object) a2, "reactContext.reactRoot");
                            int rootViewTag = a2.getRootViewTag();
                            pageEventDelegate.a(AppearanceModule.NAME, "containerDidAppear " + pageEventDelegate.d.getId() + Constants.SPACE + i2 + Constants.SPACE + rootViewTag);
                            if (rootViewTag == i2 && pageEventDelegate.d.b) {
                                if (AppObserver.INSTANCE.isForeground()) {
                                    switch (j.a[pageEventDelegate.b.ordinal()]) {
                                        case 1:
                                            pageAppearType = PageAppearType.BECOME_ACTIVE;
                                            break;
                                        case 2:
                                            pageAppearType = PageAppearType.APPEAR;
                                            break;
                                        default:
                                            pageAppearType = PageAppearType.PAGE_BACK;
                                            break;
                                    }
                                } else {
                                    pageAppearType = PageAppearType.BECOME_ACTIVE;
                                }
                                pageEventDelegate.b = h.Appear;
                                pageEventDelegate.a("AppearanceEvent", "containerDidAppear " + pageEventDelegate.d.getId() + Constants.SPACE + pageAppearType + " true " + AppObserver.INSTANCE.isForeground());
                                pageEventDelegate.d.a(pageAppearType);
                                return;
                            }
                            return;
                        case 6:
                            int i3 = (int) readableMap.getDouble("rootTag");
                            Object[] objArr6 = {Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect7 = i.a;
                            if (PatchProxy.isSupport(objArr6, pageEventDelegate, changeQuickRedirect7, false, "5543ef4b77cb13bcbf42ef56e35fabe8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, pageEventDelegate, changeQuickRedirect7, false, "5543ef4b77cb13bcbf42ef56e35fabe8");
                                return;
                            }
                            ad a3 = pageEventDelegate.e.a();
                            kotlin.jvm.internal.h.a((Object) a3, "reactContext.reactRoot");
                            int rootViewTag2 = a3.getRootViewTag();
                            pageEventDelegate.a(AppearanceModule.NAME, "containerDidDisappear, reactTag=" + pageEventDelegate.d.getId() + " rootTag=" + i3 + " realRootTag=" + rootViewTag2);
                            if (rootViewTag2 == i3) {
                                t.b bVar = new t.b();
                                if (!AppObserver.INSTANCE.isForeground()) {
                                    pageEventDelegate.b = h.ActiveChanged;
                                    bVar.a = PageDisappearType.RESIGN_ACTIVE;
                                    pageEventDelegate.a("AppearanceEvent", "containerDidDisappear " + pageEventDelegate.d.getId() + Constants.SPACE + ((PageDisappearType) bVar.a) + Constants.SPACE + AppObserver.INSTANCE.isForeground());
                                    pageEventDelegate.d.a((PageDisappearType) bVar.a);
                                    return;
                                }
                                new Handler().post(new i.a(bVar));
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.gcmrnmodule.managers.MRNModulesPageManager$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a = new int[a.valuesCustom().length];

        static {
            try {
                a[a.WILL_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.DID_APPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.WILL_DISAPPEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.DID_DISAPPEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.CONTAINER_APPEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.CONTAINER_DISAPPEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        WILL_APPEAR,
        DID_APPEAR,
        WILL_DISAPPEAR,
        DID_DISAPPEAR,
        CONTAINER_APPEAR,
        CONTAINER_DISAPPEAR;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be741a8acb8388675c6fe0c7ff405bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be741a8acb8388675c6fe0c7ff405bd");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b325e2fd41d46aa74e5c4866e7e914c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b325e2fd41d46aa74e5c4866e7e914c") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41c5b03e67e9de95c483b1fb7e355330", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41c5b03e67e9de95c483b1fb7e355330") : (a[]) values().clone();
        }
    }
}
