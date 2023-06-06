package com.sankuai.waimai.store.helper;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.g;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, ViewGroup viewGroup, List<com.sankuai.waimai.store.platform.domain.core.goods.a> list, int i, float f, int i2) {
        float f2;
        Object[] objArr = {context, viewGroup, list, Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        ViewGroup viewGroup2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ecd152173b9d8023caca616ba681f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ecd152173b9d8023caca616ba681f6d");
        } else if (viewGroup == null || context == null) {
        } else {
            if (list != null && !list.isEmpty()) {
                LayoutInflater from = LayoutInflater.from(context);
                viewGroup.removeAllViews();
                int i3 = 0;
                int i4 = 0;
                while (i3 < list.size()) {
                    com.sankuai.waimai.store.platform.domain.core.goods.a aVar = list.get(i3);
                    if (aVar != null && aVar.b != null && aVar.c > 0 && aVar.d > 0) {
                        if (aVar.f == i2) {
                            float f3 = aVar.c;
                            float f4 = aVar.d;
                            if (f3 <= 0.0f || !g.a(f3, f4)) {
                                f2 = f;
                            } else {
                                float a2 = h.a(context, f4);
                                f2 = context.getResources().getDimension(R.dimen.wm_sc_common_dimen_28);
                                if (a2 <= f2) {
                                    f2 = a2;
                                }
                            }
                            int i5 = (int) ((aVar.c * f2) / aVar.d);
                            i4 += i5;
                            if (i4 >= i) {
                                break;
                            }
                            View inflate = from.inflate(R.layout.wm_st_view_good_label_img, viewGroup2);
                            viewGroup.addView(inflate);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
                            layoutParams.width = i5;
                            int i6 = (int) f2;
                            layoutParams.height = i6;
                            if (aVar.e == 8) {
                                int a3 = h.a(context, -7.0f);
                                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                                layoutParams2.setMargins(a3, a3, 0, 0);
                                viewGroup.setLayoutParams(layoutParams2);
                                int a4 = h.a(context, 50.0f);
                                layoutParams.width = a4;
                                layoutParams.height = a4;
                            }
                            m.b(aVar.b, (ImageView) inflate.findViewById(R.id.img_good_label), i6);
                        }
                    }
                    i3++;
                    viewGroup2 = null;
                }
                if (viewGroup.getChildCount() > 0) {
                    viewGroup.setVisibility(0);
                    return;
                } else {
                    viewGroup.setVisibility(8);
                    return;
                }
            }
            viewGroup.setVisibility(8);
        }
    }
}
