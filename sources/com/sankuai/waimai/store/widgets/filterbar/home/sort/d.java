package com.sankuai.waimai.store.widgets.filterbar.home.sort;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends g<SortItem, c> {
    public static ChangeQuickRedirect a;
    private TextView b;
    private FrameLayout c;
    private com.sankuai.waimai.store.param.a d;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_filterbar_home_sort_dropdown_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(SortItem sortItem, int i) {
        int i2;
        final SortItem sortItem2 = sortItem;
        Object[] objArr = {sortItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e569abac7ab485f1b5482aa8d926a6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e569abac7ab485f1b5482aa8d926a6be");
        } else if (sortItem2 == null) {
            this.b.setText("");
        } else {
            this.b.setText(sortItem2.name);
            final boolean z = sortItem2.code == ((c) this.o).a();
            if (z) {
                i2 = this.d.f() ? R.color.wm_sg_color_FE4058 : R.color.wm_sg_color_FF8000;
            } else {
                i2 = R.color.wm_sg_color_575859;
            }
            this.b.setTextColor(ContextCompat.getColor(this.b.getContext(), i2));
            this.b.getPaint().setFakeBoldText(z);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.sort.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f5fcfaeb6ee092f67609e5253446fdc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f5fcfaeb6ee092f67609e5253446fdc");
                    } else if (z) {
                    } else {
                        ((c) d.this.o).a(sortItem2.code);
                    }
                }
            });
        }
    }

    public d(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b45541b7f90c64fd578cf3c4b6449f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b45541b7f90c64fd578cf3c4b6449f");
        } else {
            this.d = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a827bc0a2b939da9ca47379296e7c3b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a827bc0a2b939da9ca47379296e7c3b1");
            return;
        }
        this.b = (TextView) view.findViewById(R.id.tv_sort_dropdown_text);
        this.c = (FrameLayout) view.findViewById(R.id.fl_sort_dropdown_line);
    }
}
