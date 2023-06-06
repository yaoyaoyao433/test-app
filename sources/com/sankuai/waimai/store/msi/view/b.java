package com.sankuai.waimai.store.msi.view;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.event.d;
import com.sankuai.waimai.store.util.al;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final int b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static final b a = new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9caa2d3a49bab39f7f2cfcd9e0c08c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9caa2d3a49bab39f7f2cfcd9e0c08c8");
        } else {
            this.b = R.id.tag_msc_attach_view;
        }
    }

    public static void a(Activity activity, Runnable runnable) {
        Object[] objArr = {activity, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7872cd02db956f2e1d07b9a4202165bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7872cd02db956f2e1d07b9a4202165bd");
        } else if (!al.a()) {
            al.b(runnable, com.sankuai.waimai.store.msi.listener.a.a(activity));
        } else {
            runnable.run();
        }
    }

    public ViewGroup a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3677ed228647687c77941212951dc86", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3677ed228647687c77941212951dc86");
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(activity.hashCode());
        if (viewGroup == null) {
            FrameLayout frameLayout = new FrameLayout(activity);
            frameLayout.setId(activity.hashCode());
            ((ViewGroup) activity.findViewById(16908290)).addView(frameLayout);
            return frameLayout;
        }
        return viewGroup;
    }

    public void a(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i) {
        Object[] objArr = {viewGroup, view, null, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa9787ee67dda27478c36d4def6a933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa9787ee67dda27478c36d4def6a933");
        } else if (view != null) {
            view.setTag(this.b, Integer.valueOf(i));
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                Object tag = viewGroup.getChildAt(i3).getTag(this.b);
                if ((tag instanceof Integer) && ((Integer) tag).intValue() > i) {
                    break;
                }
                i2 = i3 + 1;
            }
            viewGroup.addView(view, i2, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final View b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08b63028d21622d0103ef2975ff7cff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08b63028d21622d0103ef2975ff7cff");
        }
        Activity c = c(activity);
        ViewGroup viewGroup = (ViewGroup) c.getWindow().getDecorView().findViewById(c.hashCode());
        if (viewGroup != null) {
            return viewGroup.findViewById(10000);
        }
        return null;
    }

    public final Activity c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c502aa01fcd1086b6fdff64b41ad5a6a", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c502aa01fcd1086b6fdff64b41ad5a6a") : com.sankuai.waimai.store.shopping.cart.data.a.b(activity) ? com.sankuai.waimai.store.msi.shopcart.a.a() : activity;
    }

    public final void a(Activity activity, com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        int i = 0;
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53dfe66e2f7713c37661e2e04df7999e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53dfe66e2f7713c37661e2e04df7999e");
            return;
        }
        Activity c = c(activity);
        if (c == null) {
            return;
        }
        Map<String, Object> map = bVar.x;
        if (map != null) {
            Object obj = map.get("collect_split_flag");
            if (obj instanceof Number) {
                i = ((Number) obj).intValue();
            }
        }
        d dVar = new d(c, true, i);
        final View b = b(c);
        com.meituan.android.bus.a.a().c(dVar);
        al.b(new Runnable() { // from class: com.sankuai.waimai.store.msi.view.b.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ea91aa0b63432d36a89c575b5177e09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ea91aa0b63432d36a89c575b5177e09");
                } else {
                    b.setVisibility(0);
                }
            }
        }, com.sankuai.waimai.store.msi.listener.a.a(c));
    }
}
