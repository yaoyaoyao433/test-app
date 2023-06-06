package com.sankuai.waimai.business.search.ui.result.categoryfilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.ResultFragment;
import com.sankuai.waimai.business.search.ui.result.categoryfilter.c;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.business.search.ui.result.a<CategoryFilterData> {
    public static ChangeQuickRedirect c;
    final ResultFragment d;
    private c e;

    @Override // com.sankuai.waimai.business.search.ui.result.a
    public final int a() {
        return 0;
    }

    public d(@NonNull Context context, ResultFragment resultFragment) {
        super(context);
        Object[] objArr = {context, resultFragment};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85afd92563ec573aba481e2e24ffc3a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85afd92563ec573aba481e2e24ffc3a9");
        } else {
            this.d = resultFragment;
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.result.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e3abb251f90ad2b626b255307ad0ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e3abb251f90ad2b626b255307ad0ef");
            return;
        }
        this.b = view;
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(f(), 0, false));
        final b bVar = new b(recyclerView, null, null);
        this.e = new c(bVar, SearchShareData.a(f()), c.b.VERSION_1);
        this.e.f = new c.a() { // from class: com.sankuai.waimai.business.search.ui.result.categoryfilter.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.ui.result.categoryfilter.c.a
            public final void a(CategoryFilterData.a aVar, int i) {
                Object[] objArr2 = {aVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d4191031d9e5f51f5333bd0d143b561", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d4191031d9e5f51f5333bd0d143b561");
                    return;
                }
                bVar.a(i);
                d.this.d.a(aVar, i);
            }
        };
        recyclerView.setAdapter(this.e);
    }

    @Override // com.sankuai.waimai.business.search.ui.result.a, com.sankuai.waimai.platform.base.a
    public final void a(int i, @NonNull CategoryFilterData categoryFilterData) {
        Object[] objArr = {Integer.valueOf(i), categoryFilterData};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91227922470dcc994358224dd6b52f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91227922470dcc994358224dd6b52f82");
            return;
        }
        super.a(i, (int) categoryFilterData);
        if (!com.sankuai.waimai.foundation.utils.d.a(categoryFilterData.categoryFilterList)) {
            int i2 = 0;
            while (true) {
                if (i2 >= categoryFilterData.categoryFilterList.size()) {
                    i2 = 0;
                    break;
                } else if (TextUtils.equals(this.d.s, categoryFilterData.categoryFilterList.get(i2).a)) {
                    break;
                } else {
                    i2++;
                }
            }
            this.b.setVisibility(0);
            c cVar = this.e;
            List<CategoryFilterData.a> list = categoryFilterData.categoryFilterList;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "68d17963dd5bedfa5e69baa8f43d684d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "68d17963dd5bedfa5e69baa8f43d684d");
            } else {
                cVar.c.clear();
                cVar.c.addAll(list);
            }
            if (TextUtils.isEmpty(this.d.s)) {
                this.e.d.b.scrollToPosition(0);
            }
            this.e.notifyDataSetChanged();
            this.e.d.a(i2);
            return;
        }
        this.b.setVisibility(8);
    }

    @Override // com.sankuai.waimai.business.search.ui.result.a, com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c63e24cb79798cfa4b99946187ba20", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c63e24cb79798cfa4b99946187ba20");
        }
        RecyclerView recyclerView = new RecyclerView(f());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setPadding(0, g.a(this.y, 4.0f), 0, g.a(this.y, 10.0f));
        a((View) recyclerView);
        return recyclerView;
    }
}
