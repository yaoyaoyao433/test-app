package com.sankuai.waimai.store.poi.list.newp.block.helper;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.poilist.PoiListIconAnim;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final HashMap<View, C1271a> b;
    private boolean c;

    public a() {
        this(true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9e3482436a620732559cbf3db37320", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9e3482436a620732559cbf3db37320");
        }
    }

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3d84eb819f1655bb362f4d030cc0ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3d84eb819f1655bb362f4d030cc0ea");
            return;
        }
        this.b = new HashMap<>();
        this.c = z;
    }

    public final void a(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3ae6bd0fd251c9288ef559fd36952e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3ae6bd0fd251c9288ef559fd36952e");
        } else if (view == null) {
        } else {
            this.b.put(view, new C1271a(activity, view, this.c));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6637f527436090e8945e4ea2db1587d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6637f527436090e8945e4ea2db1587d");
        } else {
            this.b.clear();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ce5966c8202168fb11f20837926f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ce5966c8202168fb11f20837926f54");
            return;
        }
        for (View view : this.b.keySet()) {
            C1271a c1271a = this.b.get(view);
            if (!c1271a.b && c1271a.c != null) {
                c1271a.b = true;
                c1271a.c.a();
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253f27b7556b77e086be62a9fb274d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253f27b7556b77e086be62a9fb274d5c");
            return;
        }
        for (View view : this.b.keySet()) {
            C1271a c1271a = this.b.get(view);
            if (c1271a.b && c1271a.c != null) {
                c1271a.b = false;
                c1271a.c.b();
            }
        }
    }

    public final void a(View view) {
        C1271a c1271a;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffddc7d1c22b7d8036c39790e06204a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffddc7d1c22b7d8036c39790e06204a7");
        } else if (view == null || (c1271a = this.b.get(view)) == null || c1271a.b || c1271a.c == null) {
        } else {
            c1271a.b = true;
            c1271a.c.a();
        }
    }

    public final void b(View view) {
        C1271a c1271a;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adafe26fd260c96945bd5baa32110077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adafe26fd260c96945bd5baa32110077");
        } else if (view == null || (c1271a = this.b.get(view)) == null || !c1271a.b || c1271a.c == null) {
        } else {
            c1271a.b = false;
            c1271a.c.b();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.block.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1271a {
        public static ChangeQuickRedirect a;
        boolean b;
        PoiListIconAnim c;

        public C1271a(Activity activity, View view, boolean z) {
            Object[] objArr = {activity, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ffc61a8bb1be6c6720d8509faf79db", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ffc61a8bb1be6c6720d8509faf79db");
                return;
            }
            this.b = true;
            this.c = new PoiListIconAnim(view, activity, view.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_32));
            this.b = z;
        }
    }
}
