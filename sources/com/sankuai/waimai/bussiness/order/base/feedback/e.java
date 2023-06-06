package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.d;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends a implements d.a {
    public static ChangeQuickRedirect u;
    private ViewGroup A;
    private ImageView v;
    private TextView w;

    public e(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee6577e2c14d2d334ed8b3314e855db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee6577e2c14d2d334ed8b3314e855db");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2a3d100f8c6748a10cae247094d35e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2a3d100f8c6748a10cae247094d35e");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_food_question_block, viewGroup, false);
        super.a(inflate);
        this.v = (ImageView) inflate.findViewById(R.id.food_img);
        this.w = (TextView) inflate.findViewById(R.id.food_des);
        this.A = (ViewGroup) inflate.findViewById(R.id.comment_container);
        return inflate;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7932295d1d0c5385ce78a9b0cb509e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7932295d1d0c5385ce78a9b0cb509e27");
            return;
        }
        super.a(bVar);
        c.a aVar = bVar.g;
        if (aVar != null) {
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = f();
            c.c = aVar.a;
            c.j = R.drawable.wm_common_poi_default_icon;
            c.i = R.drawable.wm_common_poi_default_icon;
            c.a(this.v);
            this.w.setText(aVar.b);
        }
        this.A.removeAllViews();
        List<c.C0753c> list = bVar.f;
        if (list.size() == 2) {
            b(list.get(0)).a(false);
            b(list.get(1)).a(true);
        } else if (list.size() >= 3) {
            b(list.get(0)).b(false);
            b(list.get(1)).b(true);
            b(list.get(2)).b(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void b(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e00d8971def8c822216479700c3743c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e00d8971def8c822216479700c3743c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1feb31366da8cb59d17cf94847767562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1feb31366da8cb59d17cf94847767562");
        } else if (bVar != null && !com.sankuai.waimai.foundation.utils.d.a(bVar.i)) {
            StringBuilder sb = new StringBuilder();
            List<c.d> list = bVar.i;
            for (c.d dVar : list) {
                sb.append(dVar.a);
            }
            SpannableString spannableString = new SpannableString(sb.toString());
            for (c.d dVar2 : list) {
                if (dVar2.b) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFA200")), dVar2.c, dVar2.c + dVar2.a.length(), 17);
                }
            }
            this.f.setText(spannableString);
        }
    }

    private d b(c.C0753c c0753c) {
        Object[] objArr = {c0753c};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6d9fdcf711a07a4863f83476b9059a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6d9fdcf711a07a4863f83476b9059a");
        }
        d dVar = new d(f());
        dVar.a(this.A);
        dVar.a(c0753c);
        this.A.addView(dVar.h());
        dVar.b = this;
        return dVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.d.a
    public final void a(c.C0753c c0753c) {
        Object[] objArr = {c0753c};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf86dab75c02261e5b438e089eaf78c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf86dab75c02261e5b438e089eaf78c");
            return;
        }
        this.k = c0753c.a;
        a();
    }
}
