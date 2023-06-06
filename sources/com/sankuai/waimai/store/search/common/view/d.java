package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.SGSearchFilterDot;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.h;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public FrameLayout b;
    private Context c;
    private ImageView d;
    private TextView e;

    public d(View view, int i, int i2, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), 0, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03045b7b775f9fb31f4162e817d57322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03045b7b775f9fb31f4162e817d57322");
        } else if (view == null) {
        } else {
            this.b = (FrameLayout) LayoutInflater.from(view.getContext()).inflate(R.layout.wm_sc_global_search_red_point_layout, (ViewGroup) null).findViewById(R.id.fl_red_point_container);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.topMargin = i;
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = i3;
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            this.b.setLayoutParams(layoutParams);
            if (viewGroup != null) {
                viewGroup.removeView(view);
                viewGroup.addView(this.b);
            }
            this.b.addView(view, 0, layoutParams2);
            FrameLayout frameLayout = this.b;
            Object[] objArr2 = {frameLayout};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f58f59d050dfd8cac9794a42f1dcd653", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f58f59d050dfd8cac9794a42f1dcd653");
            } else {
                this.c = frameLayout.getContext();
                this.d = (ImageView) frameLayout.findViewById(R.id.iv_red_point_icon);
                this.e = (TextView) frameLayout.findViewById(R.id.tv_red_point_text);
            }
            a(null);
        }
    }

    public static void a(Context context, SGSearchFilterDot sGSearchFilterDot, SearchShareData searchShareData) {
        Object[] objArr = {context, sGSearchFilterDot, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "966ccd1a3eb2c7f6e6cae26f0ea40956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "966ccd1a3eb2c7f6e6cae26f0ea40956");
        } else if (context == null || sGSearchFilterDot == null || searchShareData == null) {
        } else {
            String str = sGSearchFilterDot.version;
            if (t.a(str)) {
                return;
            }
            ab b = ab.b();
            b.a(context, "key_red_point_version_" + sGSearchFilterDot.code, str);
            ab b2 = ab.b();
            b2.a(context, "key_red_point_day_" + sGSearchFilterDot.code, g.b());
            searchShareData.a(new h());
        }
    }

    public static void a(Context context, List<GuidedItem> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "887b22da3433ab1d951cfe627b625002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "887b22da3433ab1d951cfe627b625002");
            return;
        }
        for (GuidedItem guidedItem : list) {
            SGSearchFilterDot sGSearchFilterDot = guidedItem.searchFilterDot;
            if (sGSearchFilterDot == null || t.a(sGSearchFilterDot.code) || t.a(sGSearchFilterDot.version)) {
                guidedItem.searchFilterDot = null;
            } else {
                ab b = ab.b();
                String b2 = b.b(context, "key_red_point_version_" + sGSearchFilterDot.code, "");
                ab b3 = ab.b();
                String b4 = b3.b(context, "key_red_point_day_" + sGSearchFilterDot.code, "");
                if (sGSearchFilterDot.version.equals(b2) && b4.compareToIgnoreCase(g.b()) >= 0) {
                    guidedItem.searchFilterDot = null;
                }
            }
        }
    }

    public final void a(SGSearchFilterDot sGSearchFilterDot) {
        Object[] objArr = {sGSearchFilterDot};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109c935c1170830a0dd67dac66300206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109c935c1170830a0dd67dac66300206");
        } else if (sGSearchFilterDot == null || t.a(sGSearchFilterDot.code) || t.a(sGSearchFilterDot.version)) {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
        } else {
            ab b = ab.b();
            Context context = this.c;
            String b2 = b.b(context, "key_red_point_version_" + sGSearchFilterDot.code, "");
            ab b3 = ab.b();
            Context context2 = this.c;
            String b4 = b3.b(context2, "key_red_point_day_" + sGSearchFilterDot.code, "");
            if (sGSearchFilterDot.version.equals(b2) && b4.compareToIgnoreCase(g.b()) >= 0) {
                this.d.setVisibility(8);
                this.e.setVisibility(8);
                return;
            }
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            if (!t.a(sGSearchFilterDot.icon)) {
                this.d.setVisibility(0);
                Context context3 = this.d.getContext();
                b.C0608b b5 = m.b(sGSearchFilterDot.icon, (int) context3.getResources().getDimension(R.dimen.wm_sc_common_dimen_14), ImageQualityUtil.a());
                b5.b = context3;
                b5.a(this.d);
                return;
            }
            u.a(this.e, sGSearchFilterDot.text);
        }
    }
}
