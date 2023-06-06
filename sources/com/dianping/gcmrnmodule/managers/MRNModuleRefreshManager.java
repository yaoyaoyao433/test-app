package com.dianping.gcmrnmodule.managers;

import android.view.View;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleRefreshManager.NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\u000e"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleRefreshManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", WhiteBoardKeyConsts.REFRESH_COMPLETE, "", "param", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleRefreshManager extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    @NotNull
    public static final String NAME = "MRNModuleRefreshManager";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/managers/MRNModuleRefreshManager$Companion;", "", "()V", "NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRNModuleRefreshManager(@NotNull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        h.b(reactApplicationContext, "reactContext");
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a14feb1266af2d0750ac1d1fd03cd3ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a14feb1266af2d0750ac1d1fd03cd3ee");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "nativeViewHierarchyManager", "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;", "kotlin.jvm.PlatformType", "execute"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b implements ar {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ ReadableMap b;

        public b(ReadableMap readableMap) {
            this.b = readableMap;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da02c46c1c1198824e1af31002f0424", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da02c46c1c1198824e1af31002f0424");
                return;
            }
            View d = nativeViewHierarchyManager.d(this.b.getInt("gdm_reactTag"));
            String string = this.b.getString("refreshId");
            if (string != null) {
                if (d instanceof i) {
                    com.dianping.gcmrnmodule.hostwrapper.a hostInterface = ((i) d).getHostInterface();
                    if (hostInterface != null) {
                        DynamicChassisInterface dynamicChassis = hostInterface.getDynamicChassis();
                        if (!(dynamicChassis instanceof DynamicRefreshInterface)) {
                            dynamicChassis = null;
                        }
                        DynamicRefreshInterface dynamicRefreshInterface = (DynamicRefreshInterface) dynamicChassis;
                        if (dynamicRefreshInterface != null) {
                            h.a((Object) string, AdvanceSetting.NETWORK_TYPE);
                            dynamicRefreshInterface.onRefreshEnd(Integer.parseInt(string));
                        }
                    }
                } else if (d instanceof com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) {
                    com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a aVar = (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a) d;
                    h.a((Object) string, AdvanceSetting.NETWORK_TYPE);
                    int parseInt = Integer.parseInt(string);
                    Object[] objArr2 = {Integer.valueOf(parseInt)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4a15ba90da48acab90cd697d27f18b63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4a15ba90da48acab90cd697d27f18b63");
                    } else {
                        aVar.getRefreshSuccessDelegate().onRefreshEnd(parseInt);
                    }
                }
            }
        }
    }

    @ReactMethod
    public final void refreshComplete(@Nullable ReadableMap readableMap, @Nullable Promise promise) {
        UIManagerModule uIManagerModule;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5c0d9e87b4d898127927af97cf31ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5c0d9e87b4d898127927af97cf31ea");
        } else if (readableMap == null || (uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)) == null) {
        } else {
            uIManagerModule.addUIBlock(new b(readableMap));
        }
    }
}
