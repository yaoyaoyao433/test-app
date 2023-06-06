package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.layout.EqualSplitComponentLayout;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends a {
    public static ChangeQuickRedirect u;
    private TextView A;
    private EqualSplitComponentLayout v;
    private TextView w;

    public g(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a69b82606174e4f5ffe5d2d8b8cac3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a69b82606174e4f5ffe5d2d8b8cac3f");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafd34b634f46c90e482850ed0adb475", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafd34b634f46c90e482850ed0adb475");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_nps_score_block, viewGroup, false);
        super.a(inflate);
        this.v = (EqualSplitComponentLayout) inflate.findViewById(R.id.score_panel);
        this.w = (TextView) inflate.findViewById(R.id.satisfaction_low_prompt);
        this.A = (TextView) inflate.findViewById(R.id.satisfaction_high_prompt);
        return inflate;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa9f917b8ba90dad03477a12281bf55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa9f917b8ba90dad03477a12281bf55");
            return;
        }
        super.a(bVar);
        if (this.t == null || !this.t.a()) {
            return;
        }
        String[] strArr = new String[bVar.f.size()];
        List<c.C0753c> list = bVar.f;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = u;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cf0ce186538591a8db1defdafcc6378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cf0ce186538591a8db1defdafcc6378");
        } else {
            this.v.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                Button button = (Button) LayoutInflater.from(this.y).inflate(R.layout.wm_order_nps_score_satisfaction_degree_item, (ViewGroup) this.v, false);
                final String str = list.get(i).a;
                button.setTypeface(com.sankuai.waimai.bussiness.order.base.utils.e.a());
                button.setText(str);
                button.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.g.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "720227b3ca7d1ccf9bca0e0d0d97c238", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "720227b3ca7d1ccf9bca0e0d0d97c238");
                            return;
                        }
                        g.this.k = str;
                        g.this.a();
                    }
                });
                this.v.addView(button);
            }
        }
        for (int i2 = 0; i2 < bVar.f.size(); i2++) {
            strArr[i2] = bVar.f.get(i2).b;
        }
        if (this.w != null) {
            this.w.setText(strArr[0]);
        }
        if (this.A != null) {
            this.A.setText(strArr[strArr.length - 1]);
        }
    }
}
