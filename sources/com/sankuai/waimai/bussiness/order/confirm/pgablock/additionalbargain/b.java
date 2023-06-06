package com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain;

import android.app.Activity;
import android.graphics.Rect;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    public LinearLayout b;
    public TextView c;
    public TextView d;
    View e;
    boolean f;
    public Activity g;
    public AdditionalBargain h;
    public com.sankuai.waimai.bussiness.order.confirm.a i;
    public int j;
    private boolean k;
    private boolean l;
    private boolean m;

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final int d() {
        return 4;
    }

    public b(Activity activity, ObservableScrollView observableScrollView, View view) {
        Object[] objArr = {activity, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ff3780a8c83fa75750d9c6e263ade3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ff3780a8c83fa75750d9c6e263ade3");
            return;
        }
        this.f = true;
        this.k = false;
        this.l = false;
        this.m = false;
        this.g = activity;
    }

    private Spannable a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e515ee17abbfb608c3b540c70bd0ed4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spannable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e515ee17abbfb608c3b540c70bd0ed4");
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(g.a(this.g, 10.0f)), 0, 1, 33);
        return spannableString;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c979c61b6b7d4f9275b9271f4a06cf8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c979c61b6b7d4f9275b9271f4a06cf8b")).booleanValue();
        }
        return (this.h != null && !com.sankuai.waimai.foundation.utils.b.b(this.h.bargainList)) && !b();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "addaf781afe830ff3e485b85086bcb5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "addaf781afe830ff3e485b85086bcb5e")).booleanValue();
        }
        if (this.i instanceof com.sankuai.waimai.bussiness.order.confirm.a) {
            Rect rect = this.i.V.a().b;
            if (this.e == null) {
                this.e = ((LinearLayoutManager) this.i.R.a().b.getLayoutManager()).findViewByPosition(this.j);
            }
            return ah.a(this.e, rect);
        }
        return false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0f7e197059521548c2485d3ebd8dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0f7e197059521548c2485d3ebd8dfe");
        } else if (this.m || this.j > 0) {
            if (b()) {
                return;
            }
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33693a1da4251d3500f3898a9c10a171", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33693a1da4251d3500f3898a9c10a171");
            } else if (this.f) {
                if (this.h == null || com.sankuai.waimai.foundation.utils.b.b(this.h.bargainList)) {
                    this.b.setVisibility(8);
                    return;
                }
                AdditionalBargain.AdditionalBargainDetail additionalBargainDetail = this.h.bargainList.get(0);
                if (additionalBargainDetail == null || (this.k && this.j == 0)) {
                    this.b.setVisibility(8);
                    return;
                }
                this.k = true;
                String a2 = h.a(additionalBargainDetail.price);
                String a3 = h.a(additionalBargainDetail.originalPrice);
                String str = TextUtils.isEmpty(additionalBargainDetail.name) ? "" : additionalBargainDetail.name;
                this.c.setText(a(this.g.getString(R.string.wm_order_base_price_with_rmb_symbol, new Object[]{a2})));
                TextView textView = this.d;
                Activity activity = this.g;
                textView.setText(a(activity.getString(R.string.wm_order_base_price_with_rmb_symbol, new Object[]{a3 + str})));
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
        } else {
            this.l = true;
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1ebae3e4024540d60ffd41623a0260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1ebae3e4024540d60ffd41623a0260");
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(8);
        }
        if (z) {
            return;
        }
        this.f = false;
    }
}
