package com.sankuai.waimai.popup;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.CurrentHomepageHolder;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.platform.popup.WMBasePopup;
import com.sankuai.waimai.platform.popup.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMStartUpPopup extends WMBasePopup {
    public static final String SPLASH_AD_INTENT = "splash_ad_intent";
    public static final String SPLASH_COVER_DRAWABLE = "splash_cover_drawable";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ai<WMStartUpPopup> mInstance = new ai<>();
    private boolean canSendToNext;
    private Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private ImageView splashCover;

    public WMStartUpPopup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84a802de6af916319ed6dde314e5b006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84a802de6af916319ed6dde314e5b006");
            return;
        }
        this.canSendToNext = false;
        this.lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.popup.WMStartUpPopup.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                Object[] objArr2 = {activity, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "800dddcb353186912678d450e784c43a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "800dddcb353186912678d450e784c43a");
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7557cfcd9792881c92519bfbe0222200", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7557cfcd9792881c92519bfbe0222200");
                } else if (activity instanceof MainActivity) {
                    if (WMStartUpPopup.this.splashCover == null) {
                        WMStartUpPopup.this.canSendToNext = true;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "onActivity Resume canSendToNext, " + WMStartUpPopup.this.canSendToNext, new Object[0]);
                    com.sankuai.waimai.platform.popup.d a2 = com.sankuai.waimai.platform.popup.d.a();
                    a2.b("onActivity Pause canSendToNext, " + WMStartUpPopup.this.canSendToNext);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9517d263439212dcace2c4c84e8e7783", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9517d263439212dcace2c4c84e8e7783");
                } else if (activity instanceof MainActivity) {
                    if (WMStartUpPopup.this.splashCover == null || WMStartUpPopup.this.splashCover.getParent() == null) {
                        WMStartUpPopup.this.canSendToNext = true;
                    } else {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.popup.WMStartUpPopup.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cd90b32fc8fb82d2b738328ffab82f75", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cd90b32fc8fb82d2b738328ffab82f75");
                                } else if (WMStartUpPopup.this.splashCover == null) {
                                } else {
                                    ViewParent parent = WMStartUpPopup.this.splashCover.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup) parent).removeView(WMStartUpPopup.this.splashCover);
                                        WMStartUpPopup.this.splashCover = null;
                                    }
                                }
                            }
                        }, 1000L);
                        WMStartUpPopup.this.canSendToNext = false;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("WMPopup", "onActivity Pause canSendToNext, " + WMStartUpPopup.this.canSendToNext, new Object[0]);
                    com.sankuai.waimai.platform.popup.d a2 = com.sankuai.waimai.platform.popup.d.a();
                    a2.b("onActivity Pause canSendToNext, " + WMStartUpPopup.this.canSendToNext);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldHandle(WMBasePopup.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c7b9edc7bf16661833f2a233e5920b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c7b9edc7bf16661833f2a233e5920b1")).booleanValue();
        }
        com.sankuai.waimai.platform.popup.d.a().b(bVar.d.toString());
        if (e.a(bVar) == null) {
            this.canSendToNext = true;
            return false;
        }
        return true;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void prepareToShow(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb6a0da8525d0db583dd31a56de9fd89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb6a0da8525d0db583dd31a56de9fd89");
        } else {
            interfaceC1075b.a(true, bVar);
        }
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void preparePopupData(WMBasePopup.b bVar, b.InterfaceC1075b interfaceC1075b) {
        Object[] objArr = {bVar, interfaceC1075b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94171c4dbd674a21661263070d869c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94171c4dbd674a21661263070d869c93");
            return;
        }
        mInstance.a(this);
        Activity activity = getContext().a.get();
        if (activity instanceof MainActivity) {
            CurrentHomepageHolder.homepageRef = new WeakReference<>((MainActivity) activity);
        }
        if (CurrentHomepageHolder.homepageRef.get() != null) {
            CurrentHomepageHolder.homepageRef.get().getApplication().registerActivityLifecycleCallbacks(this.lifecycleCallbacks);
            HashMap hashMap = new HashMap();
            hashMap.put(SPLASH_AD_INTENT, (Intent) CurrentHomepageHolder.homepageRef.get().getIntent().getParcelableExtra(SPLASH_AD_INTENT));
            bVar.d = hashMap;
            interfaceC1075b.a(true, bVar);
            return;
        }
        interfaceC1075b.a(false, bVar);
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public boolean shouldSendToNext(WMBasePopup.b bVar) {
        return this.canSendToNext;
    }

    @Override // com.sankuai.waimai.platform.popup.WMBasePopup
    public void show(WMBasePopup.b bVar, b.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05da3fc54c213975d669b120d1bf4bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05da3fc54c213975d669b120d1bf4bfe");
            return;
        }
        MainActivity mainActivity = CurrentHomepageHolder.homepageRef.get();
        if (mainActivity != null && !mainActivity.isDestroyed()) {
            Intent a = e.a(bVar);
            if (a != null) {
                mainActivity.startActivity(a);
                mainActivity.overridePendingTransition(0, 0);
                this.splashCover = new ImageView(mainActivity);
                this.splashCover.setImageResource(com.sankuai.waimai.platform.utils.f.a(mainActivity.getIntent(), SPLASH_COVER_DRAWABLE, 0));
                this.splashCover.setScaleType(ImageView.ScaleType.FIT_XY);
                ((ViewGroup) mainActivity.getWindow().getDecorView()).addView(this.splashCover, -1, -1);
                if (bVar.d != null) {
                    bVar.d.remove(SPLASH_AD_INTENT);
                }
                aVar.a(true);
                return;
            }
            aVar.a(false);
            return;
        }
        aVar.a(false);
    }

    public static WMStartUpPopup getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c77db529783435169d12718b332d1d1b", RobustBitConfig.DEFAULT_VALUE) ? (WMStartUpPopup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c77db529783435169d12718b332d1d1b") : mInstance.a();
    }

    public void unregisterActivityLifecycleCallbacks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c917126f653a579cad22be30738b587c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c917126f653a579cad22be30738b587c");
        } else if (CurrentHomepageHolder.homepageRef.get() != null) {
            CurrentHomepageHolder.homepageRef.get().getApplication().unregisterActivityLifecycleCallbacks(this.lifecycleCallbacks);
        }
    }

    public void clearSplash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8df4063247c961c83bf5e5aa269a203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8df4063247c961c83bf5e5aa269a203");
        } else if (this.splashCover == null) {
        } else {
            ViewParent parent = this.splashCover.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.splashCover);
                this.splashCover = null;
            }
        }
    }
}
