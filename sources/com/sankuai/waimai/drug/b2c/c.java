package com.sankuai.waimai.drug.b2c;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.drug.l;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.ar;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends j {
    public static ChangeQuickRedirect h;
    private ImageView i;
    private TextView j;
    private GoodsSpu k;
    private l l;

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "037b486801473839f338df4ad47d5877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "037b486801473839f338df4ad47d5877");
        } else if (cVar.l == null || cVar.c()) {
        } else {
            l lVar = cVar.l;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = l.a;
            if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "44748813466135fd95c3b57ca511d1f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "44748813466135fd95c3b57ca511d1f1");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "ca88b4f6283156b210c65158e6807b42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "ca88b4f6283156b210c65158e6807b42");
                } else {
                    lVar.b(lVar.h, true);
                    lVar.b(lVar.h, false);
                }
                int[] iArr = new int[2];
                lVar.f.getLocationOnScreen(iArr);
                lVar.d.measure(0, 0);
                int measuredWidth = lVar.d.getMeasuredWidth();
                int measuredHeight = lVar.d.getMeasuredHeight();
                int a = h.a(lVar.b, 2.0f);
                int a2 = h.a(lVar.b, 15.0f);
                int a3 = h.a(lVar.b, 10.0f);
                int i = measuredWidth / 2;
                if (iArr[0] - i >= 0) {
                    a = (iArr[0] - i) + a3;
                }
                ar.a(lVar.c, lVar.f, 0, a, (iArr[1] - measuredHeight) - a2);
                lVar.e.a((iArr[0] + a3) - a, 80);
            }
            com.sankuai.waimai.store.manager.judas.b.a(cVar.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) cVar.mContext), "b_waimai_yxkta9if_mc").a("poi_id", cVar.c.d()).a("spu_id", Long.valueOf(cVar.d())).a();
        }
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "45ea3df388948ec99a8470f5b62caec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "45ea3df388948ec99a8470f5b62caec1");
            return;
        }
        com.sankuai.waimai.drug.util.a.a(cVar.d, cVar.c, cVar.k, cVar.e, cVar.f);
        com.sankuai.waimai.store.manager.judas.b.a(cVar.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) cVar.mContext), "b_waimai_9xjdmcx3_mc").a("poi_id", cVar.c.d()).a("spu_id", Long.valueOf(cVar.d())).a("stid", cVar.g).a();
    }

    public c(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodsSpu goodsSpu) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129cfcb9153ba41f22558eae44fff955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129cfcb9153ba41f22558eae44fff955");
        } else {
            this.k = goodsSpu;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eed12392cb75cc718e5d6e94875e1e2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eed12392cb75cc718e5d6e94875e1e2") : layoutInflater.inflate(R.layout.wm_sc_shopcart_b2c_im, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b740f33a2f64dbbad7943dc5581bd42a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b740f33a2f64dbbad7943dc5581bd42a");
            return;
        }
        super.onViewCreated();
        this.i = (ImageView) this.mView.findViewById(R.id.b2c_im_top_img);
        this.j = (TextView) this.mView.findViewById(R.id.b2c_im_bottom_tv);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "053c6338c8547de7c952e769739b4e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "053c6338c8547de7c952e769739b4e0d");
        } else if (this.c.E()) {
            this.l = new l(this.d, this.i, this.b, this.k);
            l lVar = this.l;
            com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = this.c;
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = l.a;
            if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "a6f763c4d879ce98441c8b16be940a04", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "a6f763c4d879ce98441c8b16be940a04");
            } else {
                lVar.h = aVar;
                lVar.g.removeAllViews();
                int a = h.a(lVar.b, 27.0f);
                lVar.g.setMinimumWidth(h.a(lVar.b, 148.0f));
                lVar.a(aVar, false);
                Space space = new Space(lVar.b);
                space.setLayoutParams(new ViewGroup.LayoutParams(-2, a));
                lVar.g.addView(space);
                lVar.a(aVar, true);
            }
        }
        this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.b2c.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "84adaf3072ad031faa7111da3d49dd98", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "84adaf3072ad031faa7111da3d49dd98");
                } else if (c.this.c == null) {
                } else {
                    if (c.this.c.E()) {
                        c.c(c.this);
                    } else {
                        c.d(c.this);
                    }
                }
            }
        });
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea880395b34a2078e59a8582c7d241f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea880395b34a2078e59a8582c7d241f");
        } else if (this.c.E()) {
            com.sankuai.waimai.store.manager.judas.b.b(this.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext), "b_waimai_yxkta9if_mv").a("poi_id", this.c.d()).a("spu_id", Long.valueOf(d())).a();
        }
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666d98e927025ef9f420ceabadbfdd02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666d98e927025ef9f420ceabadbfdd02");
        } else if (this.c == null) {
        } else {
            boolean E = this.c.E();
            int i = R.color.wm_sg_color_575859;
            if (E) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9df848d6bd1e7e79a8029d183c6787cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9df848d6bd1e7e79a8029d183c6787cd");
                    return;
                }
                Drawable a = com.sankuai.waimai.store.util.e.a(this.mContext, (int) R.drawable.wm_sc_drug_im_self, com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_BCBCBD));
                boolean c = c();
                ImageView imageView = this.i;
                if (!c) {
                    a = com.sankuai.waimai.store.util.b.d(this.mContext, R.drawable.wm_sc_drug_im_self);
                }
                imageView.setImageDrawable(a);
                TextView textView = this.j;
                Context context = this.mContext;
                if (c) {
                    i = R.color.wm_sg_color_BCBCBD;
                }
                textView.setTextColor(com.sankuai.waimai.store.util.b.b(context, i));
                this.j.setText(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_contact_right_now));
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b52c31ada935e56d328ef2f07fc4a27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b52c31ada935e56d328ef2f07fc4a27");
            } else if (this.c.D()) {
                this.j.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_575859));
                if (this.c.G() == 11) {
                    this.i.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_busy);
                } else {
                    this.i.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_enable);
                }
            } else {
                this.i.setImageResource(R.drawable.wm_sc_shop_cart_b2c_im_unable);
                this.j.setTextColor(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_BCBCBD));
            }
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8210e912bf5c6792aba01353d6e9f10f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8210e912bf5c6792aba01353d6e9f10f")).booleanValue();
        }
        if (this.c.D()) {
            return false;
        }
        return this.c.F() == null || this.c.F().h == null;
    }

    private long d() {
        if (this.k != null) {
            return this.k.id;
        }
        return -999L;
    }
}
