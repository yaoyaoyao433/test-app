package com.sankuai.xm.imui.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.theme.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BaseFragment extends Fragment implements c.a {
    public static ChangeQuickRedirect n;
    public static int o;
    protected Handler p;

    public void a(com.sankuai.xm.imui.theme.b bVar) {
    }

    public BaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2ee90445f3a1ac7f164fcf9647a272", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2ee90445f3a1ac7f164fcf9647a272");
        } else {
            this.p = null;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feecf95d9b7a8c3e13e3a15f58c6c377", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feecf95d9b7a8c3e13e3a15f58c6c377");
            return;
        }
        super.onAttach(context);
        if (context == null) {
            return;
        }
        o = k.b(context);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c65078094e68811d6293cbc278ff84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c65078094e68811d6293cbc278ff84");
            return;
        }
        super.onCreate(bundle);
        if (!IMUIManager.a().p() && getActivity() != null) {
            getActivity().finish();
        }
        this.p = new Handler();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab7d284863dfc9fdf4394e9453643344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab7d284863dfc9fdf4394e9453643344");
            return;
        }
        super.onDestroy();
        this.p.removeCallbacksAndMessages(null);
        c.a().b(this);
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88082364255f06f2c6102158aaca9cbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88082364255f06f2c6102158aaca9cbc");
        } else if (this.p != null) {
            this.p.post(runnable);
        }
    }

    public final void a(Runnable runnable, int i) {
        Object[] objArr = {runnable, 5000};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2b8a97adbec956da0e386fee7da457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2b8a97adbec956da0e386fee7da457");
        } else if (this.p != null) {
            this.p.postDelayed(runnable, MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    public final void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a5ea76ab01f9d1e652ab578a03ad43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a5ea76ab01f9d1e652ab578a03ad43");
        } else if (this.p != null) {
            this.p.removeCallbacks(runnable);
        }
    }

    public final short t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03bc198f0403892ae09b1324f1359620", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03bc198f0403892ae09b1324f1359620")).shortValue() : com.sankuai.xm.imui.b.a().f().g;
    }
}
