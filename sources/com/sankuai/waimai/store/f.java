package com.sankuai.waimai.store;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.indicator.TabInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f b;

    public static int a(Context context, int i, boolean z) {
        return i;
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d963797139a217c8c72463b3992ee9b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d963797139a217c8c72463b3992ee9b8");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public final int a(TabInfo tabInfo, boolean z) {
        Object[] objArr = {tabInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbdbc5a2666fa94acdd4fcb7ff928f0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbdbc5a2666fa94acdd4fcb7ff928f0")).intValue() : z ? (tabInfo == null || !tabInfo.g) ? R.drawable.wm_sc_new_poi_selected : R.drawable.wm_sc_poi_up : (tabInfo == null || !tabInfo.g) ? R.drawable.wm_sc_poi_selected : R.drawable.wm_sc_poi_up;
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a4317947477f77577a12aa23563c87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a4317947477f77577a12aa23563c87");
        } else {
            u.c(view);
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6741ba086d5c43a4035333a635214989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6741ba086d5c43a4035333a635214989");
        } else {
            u.a(view);
        }
    }

    public final void a(Context context, ImageView imageView, boolean z) {
        Object[] objArr = {context, imageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1c0eb0a28705afa58576b66778c6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1c0eb0a28705afa58576b66778c6e1");
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.wm_sc_poi_channel_arrow_right);
        if (imageView == null || drawable == null) {
            return;
        }
        imageView.setImageDrawable(com.sankuai.waimai.store.util.e.a(drawable, z ? 1713513510 : -1711276033));
    }
}
