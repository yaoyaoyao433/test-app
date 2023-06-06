package com.sankuai.waimai.business.page.homepage;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.popup.WMStartUpPopup;
import com.sankuai.waimai.router.method.Func0;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CurrentHomepageHolder implements Func0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static WeakReference<MainActivity> homepageRef;

    @Override // com.sankuai.waimai.router.method.Func0
    public Object call() {
        MainActivity mainActivity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83d82571e31e4bfc2988dbc0e35b01c0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83d82571e31e4bfc2988dbc0e35b01c0");
        }
        if (homepageRef != null && (mainActivity = homepageRef.get()) != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MainActivity.c;
            if (PatchProxy.isSupport(objArr2, mainActivity, changeQuickRedirect3, false, "3e86751e1bbe622018d211e3f861e895", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mainActivity, changeQuickRedirect3, false, "3e86751e1bbe622018d211e3f861e895");
            } else {
                mainActivity.p();
                if (mainActivity.d != null) {
                    ViewParent parent = mainActivity.d.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mainActivity.d);
                        mainActivity.d = null;
                    }
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = MainActivity.c;
            if (PatchProxy.isSupport(objArr3, mainActivity, changeQuickRedirect4, false, "f309c8418e7d89e40bbc96de75b4304f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, mainActivity, changeQuickRedirect4, false, "f309c8418e7d89e40bbc96de75b4304f");
            } else if (WMStartUpPopup.getInstance() != null) {
                WMStartUpPopup.getInstance().clearSplash();
            }
        }
        return null;
    }
}
