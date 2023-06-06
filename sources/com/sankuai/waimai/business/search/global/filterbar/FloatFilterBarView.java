package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatFilterBarView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    FilterBarView b;
    FragmentManager c;
    PoiFilterActivityDialogFragment d;
    b.a e;
    private Context f;

    public FloatFilterBarView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9773765eef1e2e6c68035c3a6a401eb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9773765eef1e2e6c68035c3a6a401eb9");
        } else {
            a(context);
        }
    }

    public FloatFilterBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb713cf90fc2e8e91072f9badfd7622", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb713cf90fc2e8e91072f9badfd7622");
        } else {
            a(context);
        }
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73edb533ad1459fe527dd02e697571ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73edb533ad1459fe527dd02e697571ff");
            return;
        }
        this.f = context;
        LayoutInflater.from(this.f).inflate(R.layout.wm_nox_search_float_filter_bar_view, (ViewGroup) this, true);
        this.b = (FilterBarView) findViewById(R.id.filter_bar_tab);
    }

    public void setOnTabSortClickListener(b.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0fb29afd1ca02be56336df53a5556a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0fb29afd1ca02be56336df53a5556a");
        } else {
            this.b.setOnTabSortClickListener(gVar);
        }
    }

    public void setOnTabFilterClickListener(b.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0417a91f5989554240ea2e50374467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0417a91f5989554240ea2e50374467");
        } else {
            this.b.setOnTabFilterClickListener(fVar);
        }
    }

    public void setOnTabSortItemClickListener(b.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ab3e4e2006f036b6f650952aaffb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ab3e4e2006f036b6f650952aaffb7b");
        } else {
            this.b.setOnTabSortItemClickListener(hVar);
        }
    }

    public void setOnDialogSortItemClickListener(b.a aVar) {
        this.e = aVar;
    }

    public int getFilterBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efab4e658d6e50908b6efd53129726e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efab4e658d6e50908b6efd53129726e6")).intValue();
        }
        if (this.b.isShown()) {
            return this.b.getHeight();
        }
        return 0;
    }
}
