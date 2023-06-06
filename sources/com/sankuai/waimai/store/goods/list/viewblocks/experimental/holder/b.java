package com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder;

import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.SCMeasureHeightViewPager;
import com.sankuai.waimai.store.goods.list.viewblocks.header.widget.ViewPagerOfGridViewAdapter;
import com.sankuai.waimai.store.newwidgets.NoScrollGridView;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import com.sankuai.waimai.store.view.banner.ScSimplePageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.store.repository.model.g, com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a> {
    public static ChangeQuickRedirect a;
    private RelativeLayout b;
    private SCMeasureHeightViewPager c;
    private ScSimplePageIndicator d;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_goods_list_layout_list_header_b_kingkong;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.g gVar, int i) {
        com.sankuai.waimai.store.repository.model.g gVar2 = gVar;
        ?? r11 = 0;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7514bac01b62c344c4ec6049bbc5a4a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7514bac01b62c344c4ec6049bbc5a4a9");
        } else if (gVar2 == null) {
            u.c(this.b);
        } else {
            List<RestMenuResponse.NavigateItem> list = gVar2.k;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                u.c(this.b);
                return;
            }
            u.a(this.b);
            int c = com.sankuai.shangou.stone.util.a.c(list);
            Object[] objArr2 = {Integer.valueOf(c)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26b1990463b1efc4b9697f1aa385eea1", RobustBitConfig.DEFAULT_VALUE)) {
                c = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26b1990463b1efc4b9697f1aa385eea1")).intValue();
            } else if (c == 5 || c > 8) {
                c = 5;
            } else if (c > 5 && c <= 8) {
                c = 4;
            }
            int i2 = c * 2;
            int ceil = (int) Math.ceil((list.size() * 1.0d) / i2);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < ceil) {
                NoScrollGridView noScrollGridView = new NoScrollGridView(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j());
                noScrollGridView.setLayoutParams(layoutParams);
                noScrollGridView.setGravity(17);
                noScrollGridView.setClipChildren(r11);
                noScrollGridView.setVerticalSpacing(com.sankuai.shangou.stone.util.h.a(((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o).j(), 12.0f));
                noScrollGridView.setNumColumns(c);
                noScrollGridView.setSelector(new ColorDrawable(r11));
                int i4 = i3 * c * 2;
                int min = i3 != ceil + (-1) ? (i3 + 1) * c * 2 : Math.min((i3 + 1) * c * 2, list.size());
                if (min > com.sankuai.shangou.stone.util.a.c(list)) {
                    try {
                        HashMap hashMap = new HashMap();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ceil);
                        hashMap.put("page", sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i3);
                        hashMap.put("i", sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(com.sankuai.shangou.stone.util.a.c(list));
                        hashMap.put("dataList", sb3.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(min);
                        hashMap.put("toIndex", sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(c);
                        hashMap.put("columnNumber", sb5.toString());
                        com.sankuai.waimai.store.util.monitor.c.a(StoreException.UserManagerMultiException, "errorData", com.sankuai.waimai.store.util.i.a(hashMap));
                    } catch (Exception unused) {
                    }
                }
                noScrollGridView.setAdapter((ListAdapter) new com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter.a((com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a) this.o, com.sankuai.shangou.stone.util.a.a(list, i4, min), i3, i2, c));
                arrayList.add(noScrollGridView);
                i3++;
                r11 = 0;
            }
            this.c.setAdapter(new ViewPagerOfGridViewAdapter(arrayList));
            if (ceil <= 0) {
                u.c(this.d);
                return;
            }
            u.a(this.d);
            this.d.a(3, false);
            this.d.a(ceil, 0);
            this.c.addOnPageChangeListener(this.d);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28123e537b1e003ee7f7f4b0057a69a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28123e537b1e003ee7f7f4b0057a69a");
            return;
        }
        this.b = (RelativeLayout) view.findViewById(R.id.rl_category);
        this.c = (SCMeasureHeightViewPager) view.findViewById(R.id.wv_major_category);
        this.c.setNestedScrollingEnabled(false);
        this.d = (ScSimplePageIndicator) view.findViewById(R.id.si_king_kong_indicator);
    }
}
