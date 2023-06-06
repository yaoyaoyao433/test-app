package com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog;

import android.app.Activity;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.TitansXWebView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c h;
    public String b;
    public double c;
    public double d;
    Map<Activity, TitansXWebView> e;
    Map<Activity, a> f;
    Map<Activity, PaymentDialogFragment.a> g;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1333216b2b20621f62448ee963a42d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1333216b2b20621f62448ee963a42d9");
            return;
        }
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
    }

    public static synchronized c a() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fad38447b237729dc4a48c959c3da3ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fad38447b237729dc4a48c959c3da3ba");
            }
            if (h == null) {
                h = new c();
            }
            return h;
        }
    }

    public final a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab4e24529ff2b3164ec2169e203d462", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab4e24529ff2b3164ec2169e203d462") : this.f.get(activity);
    }

    public final void a(Activity activity, TitansXWebView titansXWebView) {
        Object[] objArr = {activity, titansXWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a1aaf341cbe0e454a3393e7da4a4b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a1aaf341cbe0e454a3393e7da4a4b3");
        } else {
            this.e.put(activity, titansXWebView);
        }
    }

    public final PaymentDialogFragment.a b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f47e63709fb83c0f9c3b883635aacc", RobustBitConfig.DEFAULT_VALUE) ? (PaymentDialogFragment.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f47e63709fb83c0f9c3b883635aacc") : this.g.get(activity);
    }
}
