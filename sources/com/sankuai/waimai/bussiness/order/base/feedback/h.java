package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.layout.EqualSplitComponentLayout;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends a {
    public static ChangeQuickRedirect u;
    private EqualSplitComponentLayout v;

    public h(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897b0120515d02e7afaa0881fd09216e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897b0120515d02e7afaa0881fd09216e");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df3525af00eb9349e5e4b823752a3a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df3525af00eb9349e5e4b823752a3a0");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_nps_single_choice, viewGroup, false);
        this.v = (EqualSplitComponentLayout) inflate.findViewById(R.id.single_container);
        super.a(inflate);
        return inflate;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434e12e3e46c62e217baf4491f998d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434e12e3e46c62e217baf4491f998d2f");
            return;
        }
        super.a(bVar);
        this.v.removeAllViews();
        List<c.C0753c> list = bVar.f;
        for (int i = 0; i < list.size(); i++) {
            final c.C0753c c0753c = list.get(i);
            View inflate = LayoutInflater.from(f()).inflate(R.layout.wm_order_satisfaction_degree_item, (ViewGroup) this.v, false);
            int a = com.sankuai.waimai.foundation.utils.g.a(f(), 32.0f);
            int a2 = com.sankuai.waimai.foundation.utils.g.a(f(), 32.0f);
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = f();
            b.C0608b a4 = a3.a(a, a2);
            a4.c = c0753c.e;
            a4.a((ImageView) inflate.findViewById(R.id.image_satisfaction_degree));
            ((AppCompatTextView) inflate.findViewById(R.id.tv_satisfaction_degree)).setText(c0753c.b);
            this.v.addView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.h.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d9610dcc5037fa56c008ddcc63d744d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d9610dcc5037fa56c008ddcc63d744d");
                        return;
                    }
                    h.this.k = c0753c.a;
                    h.this.a();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void b(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f78037b5c04fd3e3b0e04c2e182c01d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f78037b5c04fd3e3b0e04c2e182c01d");
        } else if (this.e == null || this.t == null || !this.t.a()) {
        } else {
            String str = "";
            if (this.r.size() > 1) {
                SpannableString spannableString = new SpannableString(String.format(Locale.CHINESE, "%d/%d", Integer.valueOf(this.q[0]), Integer.valueOf(this.q[1])));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#999999")), 1, 3, 17);
                str = spannableString;
            }
            this.e.setText(str);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void c(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55763bd855499300beac340d738fde5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55763bd855499300beac340d738fde5b");
        } else if (bVar == null || TextUtils.isEmpty(bVar.b)) {
        } else {
            this.f.setText(bVar.b);
        }
    }
}
