package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.recce.props.gens.IsShow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    View b;
    FrameLayout c;
    LinearLayout d;
    d e;

    public final void a(BaseTile<PoiVerticalityDataResponse.FloatingData, com.sankuai.waimai.store.repository.model.d> baseTile, boolean z) {
        Object[] objArr = {baseTile, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3321c9e83b33495164edf0b1431af29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3321c9e83b33495164edf0b1431af29");
        } else if (this.b == null || baseTile == null || baseTile.data == null || baseTile.data.jsonData == null || this.e == null) {
        } else {
            try {
                if (baseTile.layoutInfo != null) {
                    a(this.b, baseTile.layoutInfo.top, baseTile.layoutInfo.right, baseTile.layoutInfo.bottom, baseTile.layoutInfo.left);
                }
                if (!t.a(baseTile.sourceId)) {
                    baseTile.data.templateId = baseTile.sourceId;
                }
                this.e.b((d) baseTile.data);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private static void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbc20231e39defde7c69240fe3093dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbc20231e39defde7c69240fe3093dca");
        } else if (view == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = h.a(view.getContext(), i2);
                marginLayoutParams.topMargin = h.a(view.getContext(), i);
                marginLayoutParams.leftMargin = h.a(view.getContext(), i4);
                marginLayoutParams.bottomMargin = h.a(view.getContext(), i3);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd14bf8872ca01128fd2d28f732be32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd14bf8872ca01128fd2d28f732be32");
        } else if (this.d == null || this.d.getVisibility() == 8) {
        } else {
            a(false);
            this.d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e8cc23a80524cb1bf62025917e97516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e8cc23a80524cb1bf62025917e97516");
        } else if (this.e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(IsShow.LOWER_CASE_NAME, z ? "1" : "0");
            this.e.a("float_new_user_state_change", hashMap);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea577612652d15babcd7cfcac439055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea577612652d15babcd7cfcac439055");
        } else if (this.b != null) {
            this.b.setAlpha(z ? 0.6f : 1.0f);
        }
    }
}
