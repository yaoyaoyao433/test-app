package com.meituan.android.mrn.component;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.component.Touchable.MTouchableOpacityManager;
import com.meituan.android.mrn.component.alert.AlertModule;
import com.meituan.android.mrn.component.blurview.BlurViewManager;
import com.meituan.android.mrn.component.cardview.MRNCardViewManager;
import com.meituan.android.mrn.component.list.MListViewManager;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.android.mrn.component.list.item.MListViewFooterManager;
import com.meituan.android.mrn.component.list.item.MListViewHeaderManager;
import com.meituan.android.mrn.component.list.item.MListViewItemManager;
import com.meituan.android.mrn.component.list.turbo.view.TurboListViewManager;
import com.meituan.android.mrn.component.mrnwebview.MRNTitansWebViewManager;
import com.meituan.android.mrn.component.mrnwebview.MRNWebViewModule;
import com.meituan.android.mrn.component.shadowview.MRNShadowViewManager;
import com.meituan.android.mrn.component.skeleton.MrnSkeletonViewManager;
import com.meituan.android.mrn.component.video.MRNVideoPlayerViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.reactnativecommunity.cameraroll.CameraRollModule;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c8500fcae42fb048ea25281767ac544", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c8500fcae42fb048ea25281767ac544") : Arrays.asList(new AlertModule(reactApplicationContext), new MRNWebViewModule(reactApplicationContext), new CameraRollModule(reactApplicationContext));
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38fb90d80449eadfe30bfdf4a74c2a1f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38fb90d80449eadfe30bfdf4a74c2a1f") : Arrays.asList(new BlurViewManager(), new MRNCardViewManager(), new MRNShadowViewManager(), new MrnSkeletonViewManager(), new TurboListViewManager(), new MListViewManager(), new MListViewHeaderManager(), new MListViewFooterManager(), new MListViewItemManager(), new MListExpressionManager(), new MTouchableOpacityManager(), new MRNVideoPlayerViewManager(), new MRNTitansWebViewManager());
    }
}
