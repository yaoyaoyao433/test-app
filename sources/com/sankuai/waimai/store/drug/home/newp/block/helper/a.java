package com.sankuai.waimai.store.drug.home.newp.block.helper;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.util.PoiListIconAnim;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final HashMap<View, C1152a> b;
    public boolean c;

    public a() {
        this(true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1df611c3b6104146032e57e656d0c49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1df611c3b6104146032e57e656d0c49");
        }
    }

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85672a0eaf7bc9c9f5debab05e7444a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85672a0eaf7bc9c9f5debab05e7444a1");
            return;
        }
        this.b = new HashMap<>();
        this.c = z;
    }

    public final void a(View view) {
        C1152a c1152a;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62c5cb6fc67dd523d528159d221ddcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62c5cb6fc67dd523d528159d221ddcf");
        } else if (view == null || (c1152a = this.b.get(view)) == null || !c1152a.b || c1152a.c == null) {
        } else {
            c1152a.b = false;
            c1152a.c.b();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.newp.block.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1152a {
        public static ChangeQuickRedirect a;
        public boolean b;
        public PoiListIconAnim c;

        public C1152a(Activity activity, View view, boolean z) {
            Object[] objArr = {activity, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdf97c481ce571ed1ba3f7b1a9f689c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdf97c481ce571ed1ba3f7b1a9f689c");
                return;
            }
            this.b = true;
            this.c = new PoiListIconAnim(view, activity, view.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_32));
            this.b = z;
        }
    }
}
