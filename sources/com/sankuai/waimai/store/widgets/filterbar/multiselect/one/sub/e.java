package com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends g<d, b> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_common_multiselect_style_one_viewholder;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(d dVar, final int i) {
        final d dVar2 = dVar;
        Object[] objArr = {dVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e388dee0a0e4c0955e3a2e9c366a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e388dee0a0e4c0955e3a2e9c366a8e");
        } else if (dVar2 == null || dVar2.a == null) {
        } else {
            this.b.setText(dVar2.a.text);
            this.b.setTextColor(ContextCompat.getColor(this.b.getContext(), dVar2.b ? R.color.wm_sg_color_FFA200 : R.color.wm_sg_color_666666));
            this.b.getPaint().setFakeBoldText(dVar2.b);
            this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.e.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7046c81f4ea434b6f59af94646d84e94", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7046c81f4ea434b6f59af94646d84e94");
                    } else if (dVar2.b) {
                    } else {
                        ((b) e.this.o).a(dVar2.a, i);
                    }
                }
            });
            ((b) this.o).a(this.b, dVar2.a, i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a94a1367b6db132e2219ab71f627bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a94a1367b6db132e2219ab71f627bae");
        } else {
            this.b = (TextView) view.findViewById(R.id.tv_sub_filter_text);
        }
    }
}
