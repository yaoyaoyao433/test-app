package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.d;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends a implements d.a {
    public static ChangeQuickRedirect u;
    private ViewGroup v;

    public k(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7874ab81273558a6213fdb8758dc81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7874ab81273558a6213fdb8758dc81");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563bb3a9fd73ef0a984835039a4286a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563bb3a9fd73ef0a984835039a4286a6");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_order_detail_feed_back_single_choice_block, viewGroup, false);
        super.a(inflate);
        this.v = (ViewGroup) inflate.findViewById(R.id.comment_container);
        return inflate;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.a
    public final void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb77391c7cff57158ecb51a31540c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb77391c7cff57158ecb51a31540c30");
            return;
        }
        super.a(bVar);
        this.v.removeAllViews();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ca4087c51019d11f8fcf600a4b30a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ca4087c51019d11f8fcf600a4b30a4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb45483b44e6a66439f10de6f016ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb45483b44e6a66439f10de6f016ebe");
        } else if (bVar == null || TextUtils.isEmpty(bVar.b)) {
        } else {
            this.f.setText(bVar.b);
        }
    }

    private d b(c.C0753c c0753c) {
        Object[] objArr = {c0753c};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4d6f6e9d97d2d34a86ed7ccc580668", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4d6f6e9d97d2d34a86ed7ccc580668");
        }
        d dVar = new d(f());
        dVar.a(this.v);
        dVar.a(c0753c);
        this.v.addView(dVar.h());
        dVar.b = this;
        return dVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.d.a
    public final void a(c.C0753c c0753c) {
        Object[] objArr = {c0753c};
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9e92e81e98576d00008bfcaa341ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9e92e81e98576d00008bfcaa341ad9");
            return;
        }
        this.k = c0753c.a;
        a();
    }
}
