package com.meituan.android.mrn.shell;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.image.RCTImageManager;
import com.facebook.react.views.text.glidesupport.GlideBasedReactTextInlineImageViewManager;
import com.meituan.android.mrn.component.pullrefresh.PullRefreshManager;
import com.meituan.android.mrn.config.k;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.config.z;
import com.meituan.android.mrn.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.reactnativecommunity.art.ARTRenderableViewManager;
import com.reactnativecommunity.art.ARTSurfaceViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends n {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.n
    public final NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {str, reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7353e1cb21fd5b4152e14cd9c4df901", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7353e1cb21fd5b4152e14cd9c4df901");
        }
        char c = 65535;
        if (str.hashCode() == -657277650 && str.equals(ImageLoaderModule.NAME)) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        return new ImageLoaderModule(reactApplicationContext);
    }

    @Override // com.facebook.react.n, com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da99f0be55ec1171b7af319424172287", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da99f0be55ec1171b7af319424172287");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ARTRenderableViewManager.createARTGroupViewManager());
        arrayList.add(ARTRenderableViewManager.createARTShapeViewManager());
        arrayList.add(ARTRenderableViewManager.createARTTextViewManager());
        arrayList.add(new ARTSurfaceViewManager());
        arrayList.add(new GlideBasedReactTextInlineImageViewManager(reactApplicationContext));
        k a2 = k.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = k.a;
        boolean booleanValue = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8314e44322b22e00f2550cf8e6c0ca77", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8314e44322b22e00f2550cf8e6c0ca77")).booleanValue() : ((Boolean) t.b.a("Image.enableShrink")).booleanValue();
        float b = k.a().b();
        k a3 = k.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = k.a;
        boolean booleanValue2 = PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "ae14a73b4ad6a619c01f17b0eb4309ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "ae14a73b4ad6a619c01f17b0eb4309ac")).booleanValue() : ((Boolean) t.b.a("Image.shrinkGif")).booleanValue();
        k a4 = k.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = k.a;
        arrayList.add(new RCTImageManager(reactApplicationContext, booleanValue, b, booleanValue2, PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "f23acf951b3f376df5cf16574edfea99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "f23acf951b3f376df5cf16574edfea99")).booleanValue() : ((Boolean) t.b.a("Image.transformToWebp")).booleanValue()));
        arrayList.add(new PullRefreshManager() { // from class: com.meituan.android.mrn.shell.MRNReplaceReactPackage$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.mrn.component.pullrefresh.PullRefreshManager, com.facebook.react.uimanager.ViewManager
            public com.meituan.android.mrn.component.pullrefresh.b createViewInstance(ao aoVar) {
                Object[] objArr5 = {aoVar};
                ChangeQuickRedirect changeQuickRedirect5 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "18b1e3e26c2b2701fc4f1f578ea4906a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.android.mrn.component.pullrefresh.b) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "18b1e3e26c2b2701fc4f1f578ea4906a");
                }
                z.a();
                return super.createViewInstance(aoVar);
            }
        });
        return arrayList;
    }

    @Override // com.facebook.react.n
    public final com.facebook.react.module.model.a getReactModuleInfoProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10cdf43dda1e496d0b96779056a7a9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.facebook.react.module.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10cdf43dda1e496d0b96779056a7a9e");
        }
        Class[] clsArr = {ImageLoaderModule.class};
        Object[] objArr2 = {clsArr};
        ChangeQuickRedirect changeQuickRedirect2 = x.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64eee3e6bdeae8236bceec9671a19506", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.facebook.react.module.model.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64eee3e6bdeae8236bceec9671a19506");
        }
        final HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            Class cls = clsArr[0];
            ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
            hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
        }
        return new com.facebook.react.module.model.a() { // from class: com.meituan.android.mrn.utils.x.1
            @Override // com.facebook.react.module.model.a
            public final Map<String, ReactModuleInfo> a() {
                return hashMap;
            }
        };
    }
}
