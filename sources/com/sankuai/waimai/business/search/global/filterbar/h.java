package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    final ArrayMap<String, Boolean> b;
    final g c;
    final SGCustomPriceFilter d;
    String e;
    int f;
    final Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> g;
    final PoiFilterActivityDialogFragment.b h;
    private String i;
    private PoiFilterActivityDialogFragment.a j;
    private SGCustomPriceFilter.a k;

    public h(Context context, View view, b.a aVar, PoiFilterActivityDialogFragment.b bVar, ArrayMap<String, Boolean> arrayMap) {
        b.a aVar2;
        int i;
        Object[] objArr = {context, view, aVar, bVar, arrayMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7c1c8016354f9bd3a6e8282908d36d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7c1c8016354f9bd3a6e8282908d36d");
            return;
        }
        this.e = "";
        this.f = 0;
        this.g = new HashMap();
        this.j = new PoiFilterActivityDialogFragment.a() { // from class: com.sankuai.waimai.business.search.global.filterbar.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "275e9e6c9291879ebd930f7d1a97bbfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "275e9e6c9291879ebd930f7d1a97bbfc");
                    return;
                }
                if (h.this.f == 1 && !h.this.e.equals(str)) {
                    h.this.h.a(h.this.e);
                }
                h.this.e = str;
                h.this.f = 2;
                h.this.h.a(str, 2);
                com.sankuai.waimai.platform.widget.filterbar.domain.model.g a2 = h.this.a(str);
                h.this.d.setMinPrice(a2.b);
                h.this.d.setMaxPrice(a2.c);
                h.this.d.clearFocus();
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddd90627f38297476f5ae918b1bd4303", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddd90627f38297476f5ae918b1bd4303");
                    return;
                }
                h.this.h.a(str);
                if (h.this.e.equals(str)) {
                    h.this.e = "";
                }
                h.this.g.clear();
                h.this.d.b();
                h.this.d.clearFocus();
            }
        };
        this.k = new SGCustomPriceFilter.a() { // from class: com.sankuai.waimai.business.search.global.filterbar.h.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter.a
            public final void a(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547d0548f74fbbbcaf6e594b55d67e0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547d0548f74fbbbcaf6e594b55d67e0b");
                    return;
                }
                String str = "product_PRICE_price_" + i2 + CommonConstant.Symbol.MINUS + i3;
                if (h.this.b == null) {
                    return;
                }
                if (!h.this.e.equals(str)) {
                    h.this.h.a(h.this.e);
                    h.this.e = str;
                }
                if (i2 == -1 && i3 == -1) {
                    return;
                }
                h.this.f = 1;
                if (h.this.b.containsKey(str)) {
                    return;
                }
                h.this.h.a(str, 1);
                h.this.c.notifyDataSetChanged();
            }
        };
        this.b = arrayMap;
        this.h = bVar;
        ArrayList arrayList = new ArrayList();
        if (aVar != null && aVar.c.size() > 0) {
            for (b.a.C1086a c1086a : aVar.c) {
                if (c1086a != null && !TextUtils.isEmpty(c1086a.a)) {
                    arrayList.add(c1086a);
                }
            }
        }
        this.i = "100";
        if (arrayList.size() < 2) {
            arrayList.clear();
        }
        Object[] objArr2 = {aVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36b60df954d902bb910e42d9aa6dcde2", RobustBitConfig.DEFAULT_VALUE)) {
            aVar2 = (b.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36b60df954d902bb910e42d9aa6dcde2");
        } else {
            aVar2 = new b.a();
            if (aVar != null) {
                aVar2.a = aVar.a;
                aVar2.b = aVar.b;
                aVar2.d = aVar.d;
                aVar2.c = arrayList;
            }
        }
        b.a aVar3 = aVar2;
        if (arrayMap != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayMap.size()) {
                    break;
                }
                String keyAt = arrayMap.keyAt(i2);
                com.sankuai.waimai.platform.widget.filterbar.domain.model.g a2 = a(keyAt);
                if (a2 != null) {
                    this.e = keyAt;
                    this.g.put(this.i, a2);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(((b.a.C1086a) it.next()).a, keyAt)) {
                                i = 2;
                                break;
                            }
                        } else {
                            i = 1;
                            break;
                        }
                    }
                    this.f = i;
                    bVar.a(i);
                } else {
                    i2++;
                }
            }
        }
        this.d = (SGCustomPriceFilter) view.findViewById(R.id.sg_custom_price_filter);
        if (this.g.size() > 0) {
            com.sankuai.waimai.platform.widget.filterbar.domain.model.g gVar = this.g.get(this.i);
            this.d.setMinPrice(gVar.b);
            if (gVar.c == 99999999) {
                gVar.c = -1;
            }
            this.d.setMaxPrice(gVar.c);
        }
        this.d.setOnPriceChangeListener(this.k);
        GridView gridView = (GridView) view.findViewById(R.id.gv_choose);
        gridView.setSelector(new ColorDrawable(0));
        this.c = new g(context, aVar3, this.j, arrayMap, true);
        gridView.setNumColumns(4);
        gridView.setAdapter((ListAdapter) this.c);
    }

    public final com.sankuai.waimai.platform.widget.filterbar.domain.model.g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a210f7ef2724669e9f242ae624ae8dd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.filterbar.domain.model.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a210f7ef2724669e9f242ae624ae8dd3");
        }
        Matcher matcher = Pattern.compile("product_PRICE_price_(\\d*)-(\\d*)").matcher(str);
        System.out.println(matcher.matches());
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new com.sankuai.waimai.platform.widget.filterbar.domain.model.g(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        }
        return null;
    }
}
