package com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    public TextView c;
    public ImageView d;
    public boolean e;
    com.sankuai.waimai.bussiness.order.confirm.a f;
    public com.sankuai.waimai.bussiness.order.confirm.model.b g;
    public Activity h;
    Context i;
    public boolean j;
    public int k;
    private boolean l;
    private boolean m;
    private boolean n;

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final int d() {
        return 2;
    }

    public a(Activity activity, Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {activity, context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41f2b3be0a9e8d7b03afdf6957a7c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41f2b3be0a9e8d7b03afdf6957a7c61");
            return;
        }
        this.l = false;
        this.m = false;
        this.n = false;
        this.h = activity;
        this.f = aVar;
        this.i = context;
        this.n = false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5039cf7ce16d18c738623e5798955b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5039cf7ce16d18c738623e5798955b3")).booleanValue();
        }
        if (a(this.g)) {
            if (i()) {
                return this.m || com.sankuai.waimai.bussiness.order.confirm.helper.c.b(this.h, "order_confirm_vip_float_day_show_count") < this.g.c;
            }
            return a(this.g) && !b() && (!com.sankuai.waimai.bussiness.order.confirm.helper.c.a(this.h) || this.m);
        }
        return false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923a787a6f3f28134765036d4acfdfbd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923a787a6f3f28134765036d4acfdfbd")).booleanValue();
        }
        if (this.f instanceof com.sankuai.waimai.bussiness.order.confirm.a) {
            Rect rect = this.f.V.a().b;
            if (this.k > 0) {
                RecyclerView recyclerView = this.f.R.a().b;
                return ah.a(recyclerView.getChildAt(this.k - ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition()), rect);
            }
            return false;
        }
        return false;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2dbf24accbadc47f1840a5cf2364146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2dbf24accbadc47f1840a5cf2364146");
        } else if (a(this.g)) {
            if (i()) {
                int b = com.sankuai.waimai.bussiness.order.confirm.helper.c.b(this.h, "order_confirm_vip_float_day_show_count");
                int i = this.g.c;
                if (!this.l && (b < i || this.m)) {
                    g();
                    e();
                    h();
                    return;
                }
                a(true);
                return;
            }
            boolean a2 = a(this.g);
            boolean a3 = com.sankuai.waimai.bussiness.order.confirm.helper.c.a(this.h);
            if (!this.l && a2 && (!a3 || this.m)) {
                g();
                e();
                h();
                return;
            }
            a(true);
        }
    }

    private void g() {
        String replace;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4176773c3e3c5553ee175bb4ec262e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4176773c3e3c5553ee175bb4ec262e");
        } else if (!a(this.g) || this.b.getVisibility() == 0) {
        } else {
            if (!this.e) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
            String str = this.g.b;
            if (this.g.k == 13) {
                replace = str.replace("<highlight>", "<b><font color=\"#FFDD00\">").replace("</highlight>", "</font></b>");
            } else {
                replace = str.replace("<highlight>", "<font color=\"#FF4A26\">").replace("</highlight>", "</font>");
            }
            this.c.setText(Html.fromHtml(replace));
            if (!TextUtils.isEmpty(this.g.d)) {
                this.d.setVisibility(0);
                b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                c.b = this.i;
                c.c = this.g.d;
                c.a(this.d);
            } else {
                this.d.setVisibility(8);
            }
            if (this.j) {
                this.b.setVisibility(8);
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.helper.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea14dfc5b55669689e3b332c859cfbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea14dfc5b55669689e3b332c859cfbb");
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(8);
        }
        if (i() || z) {
            return;
        }
        e();
        this.l = true;
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b526d9217df61c2be626e6e5f5cffc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b526d9217df61c2be626e6e5f5cffc1");
        } else if (i()) {
            if (!this.m && this.e) {
                com.sankuai.waimai.bussiness.order.confirm.helper.c.a(this.h, "order_confirm_vip_float_day_show_count");
            }
            this.m = true;
        } else {
            this.m = true;
            com.sankuai.waimai.bussiness.order.confirm.helper.c.b(this.h);
        }
    }

    private boolean a(com.sankuai.waimai.bussiness.order.confirm.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169e3424411849166f961ab7fc7b3af0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169e3424411849166f961ab7fc7b3af0")).booleanValue() : (bVar == null || TextUtils.isEmpty(bVar.b)) ? false : true;
    }

    private boolean i() {
        return (this.g == null || this.g.c == 0) ? false : true;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f76df3b5ca9c561bbf4a8b3fa71da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f76df3b5ca9c561bbf4a8b3fa71da2");
        } else if (i()) {
            this.l = true;
            this.b.setVisibility(8);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9663b5b93abb6869b1f098eb528c350a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9663b5b93abb6869b1f098eb528c350a");
        } else if (this.n || this.g == null || !this.g.g) {
        } else {
            JudasManualManager.b("b_waimai_kpdab643_mv").a("user_buy_status", this.g.i).a("intelligent_doc", this.g.b).a("cate_id", this.g.k == 31 ? 2 : this.g.k == 13 ? 4 : 1).a("c_ykhs39e").a(this.i).a();
            this.n = true;
        }
    }
}
