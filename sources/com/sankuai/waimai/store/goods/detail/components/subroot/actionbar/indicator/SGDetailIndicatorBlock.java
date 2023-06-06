package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.j;
import java.util.List;
/* compiled from: ProGuard */
@Cube(events = {b.class})
/* loaded from: classes5.dex */
public class SGDetailIndicatorBlock extends j {
    public static ChangeQuickRedirect g;
    private TextView h;
    private LinearLayout i;
    private int j;
    private boolean k;

    public SGDetailIndicatorBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43892a7131fcc92497092d7be5fa2001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43892a7131fcc92497092d7be5fa2001");
            return;
        }
        this.j = -1;
        this.k = false;
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf53b37a5e500496c63d1ae290695786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf53b37a5e500496c63d1ae290695786");
            return;
        }
        super.a_(view);
        this.h = (TextView) a(R.id.tv_indicator_default_title);
        this.i = (LinearLayout) a(R.id.ll_indicator_group);
    }

    public final void a(final long j, final long j2, final String str, List<a> list, boolean z, boolean z2) {
        int i;
        boolean z3 = false;
        Object[] objArr = {new Long(j), new Long(j2), str, list, (byte) 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618a249a2c5ac75be0aa014671b8a06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618a249a2c5ac75be0aa014671b8a06f");
            return;
        }
        i().setVisibility(0);
        if (com.sankuai.shangou.stone.util.a.a((List) list) <= 1) {
            this.h.setVisibility(0);
            this.i.setVisibility(8);
            return;
        }
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        this.i.setPadding(0, 0, 0, 0);
        layoutParams.width = -2;
        this.i.setLayoutParams(layoutParams);
        this.i.removeAllViews();
        int i2 = 0;
        while (i2 < list.size()) {
            final a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
            if (aVar != null) {
                View inflate = LayoutInflater.from(l()).inflate(R.layout.wm_sc_view_detail_action_bar_indicator_item, this.i, z3);
                i = i2;
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b400448099a5cab9d8d79da91e2040d4", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b400448099a5cab9d8d79da91e2040d4");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(SGDetailIndicatorBlock.this.l(), "b_53a3hsah").a("poi_id", Long.valueOf(j)).a("spu_id", Long.valueOf(j2)).a("stid", str).a("title", aVar.a).a("tab_code", Integer.valueOf(aVar.c)).a();
                        SGDetailIndicatorBlock.this.a(new b(aVar.b));
                    }
                });
                TextView textView = (TextView) inflate.findViewById(R.id.tv_tab_indicator_text);
                textView.setTextSize(2, 14.0f);
                textView.setText(aVar.a);
                this.i.addView(inflate, new LinearLayout.LayoutParams(-2, -2));
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_uzspj8k0", inflate, "ScrollIndicator-" + aVar.c);
                bVar.a("poi_id", Long.valueOf(j)).a("spu_id", Long.valueOf(j2)).a("tab_code", Integer.valueOf(aVar.c));
                com.sankuai.waimai.store.expose.v2.b.a().a(l(), bVar);
            } else {
                i = i2;
            }
            i2 = i + 1;
            z3 = false;
        }
        if (this.j < 0) {
            a(0, false);
            return;
        }
        int i3 = this.j;
        this.j = -1;
        a(i3, this.k);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab4e92de0e4f75148796a8a59011430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab4e92de0e4f75148796a8a59011430");
        } else if (this.i != null && this.i.getChildCount() != 0) {
            for (int i = 0; i < this.i.getChildCount(); i++) {
                this.i.getChildAt(i).setClickable(z);
            }
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2657aba95f71dff1dafd09ebd944ac9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2657aba95f71dff1dafd09ebd944ac9f");
        } else if (i < 0 || this.i == null || this.i.getChildCount() == 0) {
        } else {
            this.k = z;
            if (z) {
                i = this.i.getChildCount() - 1;
            }
            if (this.j == i) {
                return;
            }
            this.j = i;
            int i2 = 0;
            while (i2 < this.i.getChildCount()) {
                View childAt = this.i.getChildAt(i2);
                TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_indicator_text);
                textView.setSelected(i2 == i);
                textView.getPaint().setFakeBoldText(i2 == i);
                childAt.findViewById(R.id.v_tab_indicator_line).setVisibility(i2 == i ? 0 : 4);
                i2++;
            }
        }
    }
}
