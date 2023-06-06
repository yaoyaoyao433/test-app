package com.meituan.android.qianbao.mmpwidget2rn.rn;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.internal.view.SupportMenu;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.codelog.b;
import com.dianping.monitor.impl.m;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.meituan.metrics.common.Constants;
import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class QBRNViewManager extends ViewGroupManager<FrameLayout> {
    public static final String REACT_CLASS = "QBRNViewManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int COMMAND_CREATE;
    private final String TAG_FRAGMENT;
    private Map<String, Object> mmpData;
    private String mmpUrl;
    private int propHeight;
    private int propWidth;
    public ReactApplicationContext reactContext;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public QBRNViewManager(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "380d54eafaaef92a8678092397014c12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "380d54eafaaef92a8678092397014c12");
            return;
        }
        this.COMMAND_CREATE = 1;
        this.TAG_FRAGMENT = "mmp_fragment";
        this.reactContext = reactApplicationContext;
    }

    @ReactProp(name = "widgetURL")
    public void setWidgetURL(FrameLayout frameLayout, @Nullable String str) {
        this.mmpUrl = str;
    }

    @ReactProp(name = "widgetData")
    public void setWidgetData(FrameLayout frameLayout, @Nullable ReadableMap readableMap) {
        Object[] objArr = {frameLayout, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14342383387609662b0cc1951245817b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14342383387609662b0cc1951245817b");
        } else if (readableMap != null) {
            try {
                this.mmpData = readableMap.toHashMap();
                handleEmptyFragment(frameLayout);
            } catch (Exception e) {
                b.b(QBRNViewManager.class, "qianbao recreate error", e.getMessage());
            }
        }
    }

    private void handleEmptyFragment(FrameLayout frameLayout) {
        Object[] objArr = {frameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0efecb857547823903c32a98d442be64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0efecb857547823903c32a98d442be64");
            return;
        }
        MMPWidgetFragment findMMPFragment = findMMPFragment();
        if (findMMPFragment != null) {
            if (frameLayout.isAttachedToWindow() && !findMMPFragment.isAdded()) {
                getChildFragmentManager().beginTransaction().add(frameLayout.getId(), findMMPFragment, "mmp_fragment").commitNowAllowingStateLoss();
            } else {
                findMMPFragment.b(this.mmpData);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public FrameLayout createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8ce90294a1d0e669d076bc0810a23d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8ce90294a1d0e669d076bc0810a23d9");
        }
        getMonitorService().a(Constants.SPEED_METER_STEP, "createView").a();
        return (FrameLayout) LayoutInflater.from(aoVar).inflate(R.layout.layout_qianbao_mmp, (ViewGroup) null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91c7cf7dcad642d6dc68549b990665d9", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91c7cf7dcad642d6dc68549b990665d9") : c.a("create", 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@Nonnull FrameLayout frameLayout, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {frameLayout, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27a4df7a54e50471e3d21fac94db2e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27a4df7a54e50471e3d21fac94db2e39");
            return;
        }
        super.receiveCommand((QBRNViewManager) frameLayout, i, readableArray);
        readableArray.getInt(0);
        if (i != 1) {
            return;
        }
        getMonitorService().a(Constants.SPEED_METER_STEP, "onCommand").a();
        new Handler(Looper.getMainLooper()).postDelayed(new a(this, frameLayout), 300L);
    }

    @ReactPropGroup(customType = "Style", names = {"width", "height"})
    public void setStyle(FrameLayout frameLayout, int i, Integer num) {
        Object[] objArr = {frameLayout, Integer.valueOf(i), num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70561b5dc97ece5f19301460f1547e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70561b5dc97ece5f19301460f1547e05");
            return;
        }
        if (i == 0) {
            this.propWidth = num.intValue();
        }
        if (i == 1) {
            this.propHeight = num.intValue();
        }
    }

    public void createFragment(FrameLayout frameLayout) {
        Object[] objArr = {frameLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "533fd4498b57898691a6f5ae97183359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "533fd4498b57898691a6f5ae97183359");
            return;
        }
        tryInitMMP();
        if (frameLayout.isAttachedToWindow()) {
            setupLayout(frameLayout);
            if (getChildFragmentManager() != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                try {
                    if (findMMPFragment() != null) {
                        childFragmentManager.beginTransaction().remove(findMMPFragment()).commitNowAllowingStateLoss();
                    }
                } catch (Exception e) {
                    b.b(QBRNViewManager.class, "qianbao remove error", e.getMessage());
                }
                MMPWidgetFragment a2 = MMPWidgetFragment.a(Uri.parse(this.mmpUrl), (Bundle) null);
                configMMPWidgetFragment(a2);
                childFragmentManager.beginTransaction().replace(R.id.qianbao_mmp_container, a2, "mmp_fragment").commitNowAllowingStateLoss();
                getMonitorService().a(Constants.SPEED_METER_STEP, "commit").a();
            }
        }
    }

    private void tryInitMMP() {
        AbsInit absInit;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96132170fab49d01c6193647b9b96621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96132170fab49d01c6193647b9b96621");
        } else if (MMPEnvHelper.isInited() || (absInit = (AbsInit) com.sankuai.waimai.router.a.a(AbsInit.class, "WMMMPInit")) == null) {
        } else {
            absInit.performIdleInit((Application) this.reactContext.getApplicationContext());
        }
    }

    private FragmentManager getChildFragmentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a90ba3283e1eca6bae096e65d0916ba5", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a90ba3283e1eca6bae096e65d0916ba5");
        }
        Fragment findFragmentByTag = ((FragmentActivity) this.reactContext.getCurrentActivity()).getSupportFragmentManager().findFragmentByTag("4");
        if (findFragmentByTag != null) {
            return findFragmentByTag.getChildFragmentManager();
        }
        return null;
    }

    private MMPWidgetFragment findMMPFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f4089b5b2bf0d7a47fd97d2871d1b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPWidgetFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f4089b5b2bf0d7a47fd97d2871d1b3");
        }
        if (getChildFragmentManager() != null) {
            return (MMPWidgetFragment) getChildFragmentManager().findFragmentByTag("mmp_fragment");
        }
        return null;
    }

    private void configMMPWidgetFragment(MMPWidgetFragment mMPWidgetFragment) {
        Object[] objArr = {mMPWidgetFragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1add464f95b42011c682efc923a31a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1add464f95b42011c682efc923a31a6b");
            return;
        }
        mMPWidgetFragment.a(this.mmpData);
        mMPWidgetFragment.b(this.mmpData);
        mMPWidgetFragment.a(new HashSet(), new MMPWidgetFragment.a() { // from class: com.meituan.android.qianbao.mmpwidget2rn.rn.QBRNViewManager.1
        });
    }

    public void setupLayout(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f432277514f796671f1bcd61775655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f432277514f796671f1bcd61775655");
        } else {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.meituan.android.qianbao.mmpwidget2rn.rn.QBRNViewManager.2
                public static ChangeQuickRedirect a;

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6158bc7e4df340115c7bb3fa44008ee4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6158bc7e4df340115c7bb3fa44008ee4");
                        return;
                    }
                    QBRNViewManager.this.manuallyLayoutChildren(view);
                    view.getViewTreeObserver().dispatchOnGlobalLayout();
                    Choreographer.getInstance().postFrameCallback(this);
                }
            });
        }
    }

    public void manuallyLayoutChildren(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da58d55a7c18698bcf392bb1616d2757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da58d55a7c18698bcf392bb1616d2757");
            return;
        }
        int i = this.reactContext.getResources().getDisplayMetrics().widthPixels;
        if (this.propWidth > 0) {
            i = dp2px(this.propWidth);
        }
        int dp2px = dp2px(this.propHeight);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(dp2px, 1073741824));
        view.layout(0, 0, i, dp2px);
    }

    public int dp2px(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2895f22b1c572a3a13645ad38328aa1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2895f22b1c572a3a13645ad38328aa1")).intValue() : (int) ((f * this.reactContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private m getMonitorService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a726f8e4bfc803f683f79873d9fde856", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a726f8e4bfc803f683f79873d9fde856");
        }
        m mVar = new m(11, this.reactContext);
        mVar.a("wallet_mmpwidget2rn", Arrays.asList(Float.valueOf(1.0f)));
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        public WeakReference<QBRNViewManager> b;
        public WeakReference<FrameLayout> c;

        public a(QBRNViewManager qBRNViewManager, FrameLayout frameLayout) {
            Object[] objArr = {qBRNViewManager, frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6596572fdd0a161bc3e3aaccc552f0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6596572fdd0a161bc3e3aaccc552f0");
                return;
            }
            this.b = new WeakReference<>(qBRNViewManager);
            this.c = new WeakReference<>(frameLayout);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea455330b855cf3eb6a1e3220532d0fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea455330b855cf3eb6a1e3220532d0fc");
                return;
            }
            try {
                QBRNViewManager qBRNViewManager = this.b.get();
                FrameLayout frameLayout = this.c.get();
                if (qBRNViewManager == null || frameLayout == null) {
                    return;
                }
                qBRNViewManager.createFragment(frameLayout);
            } catch (Exception e) {
                b.b(QBRNViewManager.class, "qianbao create error", e.getMessage());
            }
        }
    }

    private void addDebugView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba600d49cd24a27a1b6f273dd9f8d827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba600d49cd24a27a1b6f273dd9f8d827");
            return;
        }
        View view = new View(this.reactContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(80, 80);
        layoutParams.gravity = 85;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(SupportMenu.CATEGORY_MASK);
        view.setAlpha(0.5f);
        if (findMMPFragment().getView() == null || findMMPFragment().getView().getParent() == null) {
            return;
        }
        ((ViewGroup) findMMPFragment().getView().getParent()).addView(view);
    }
}
