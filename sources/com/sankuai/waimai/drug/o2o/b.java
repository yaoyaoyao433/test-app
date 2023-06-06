package com.sankuai.waimai.drug.o2o;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends j {
    public static ChangeQuickRedirect h;
    private ImageView i;
    private TextView j;
    private ViewGroup k;
    private GoodsSpu l;

    public b(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodsSpu goodsSpu) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar, null};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2758406fec59ac7be65103af8de6abfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2758406fec59ac7be65103af8de6abfd");
        } else {
            this.l = null;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6bfc78a4106ae6ce55d22d55489f6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6bfc78a4106ae6ce55d22d55489f6a");
        }
        this.k = viewGroup;
        return layoutInflater.inflate(R.layout.wm_sc_shopcart_o2o_im, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b36ef123b39735ca76cbf044eaddc8fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b36ef123b39735ca76cbf044eaddc8fa");
            return;
        }
        super.onViewCreated();
        this.i = (ImageView) this.mView.findViewById(R.id.im_top_img);
        this.j = (TextView) this.mView.findViewById(R.id.im_bottom_tv);
        this.mView.setOnClickListener(c.a(this));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63e861641d0e8a5e4b3da12abc3d898e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63e861641d0e8a5e4b3da12abc3d898e");
        } else if (this.c != null) {
            com.sankuai.waimai.store.manager.judas.b.b(this.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.d), "b_waimai_b1h3jsh5_mv").a("poi_id", this.c.d()).a("status", Integer.valueOf(this.c.G())).a("poi_status", Integer.valueOf(this.c.r())).a("tip", c()).a("stid", b()).a("spu_id", Long.valueOf(this.l != null ? this.l.id : -999L)).a();
        }
    }

    public static /* synthetic */ void a(b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d00596bd02d233d1cc3a6a95b87bc551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d00596bd02d233d1cc3a6a95b87bc551");
        } else if (bVar.c == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2a3b8275445600158b47edb628942599", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2a3b8275445600158b47edb628942599");
                return;
            }
            com.sankuai.waimai.store.shopping.cart.util.d.a(bVar.d, bVar.c, bVar.e, bVar.f);
            com.sankuai.waimai.store.manager.judas.b.a(bVar.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) bVar.mContext), "b_waimai_b1h3jsh5_mc").a("poi_id", bVar.c.d()).a("status", Integer.valueOf(bVar.c.G())).a("poi_status", Integer.valueOf(bVar.c.r())).a("tip", bVar.c()).a("stid", bVar.b()).a("spu_id", Long.valueOf(bVar.l != null ? bVar.l.id : -999L)).a();
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c311c3204b1ba0aaad2bab4f1049c368", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c311c3204b1ba0aaad2bab4f1049c368") : (this.c == null || this.c.b == null || this.c.b.abExpInfo == null) ? "-999" : this.c.b.abExpInfo;
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ee017b7a7f1c93685a0fb3ed125bc0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ee017b7a7f1c93685a0fb3ed125bc0") : (this.c == null || this.c.b == null || this.c.b.bottomPoiImInfo == null || this.c.b.bottomPoiImInfo.g == null || TextUtils.isEmpty(this.c.b.bottomPoiImInfo.g.shopCartIMPopTip)) ? "-999" : this.c.b.bottomPoiImInfo.g.shopCartIMPopTip;
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92762d07a861a1e7804b9d29afbec890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92762d07a861a1e7804b9d29afbec890");
        } else if (this.c == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b2fdfc65ffafe40304012104ab89935", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b2fdfc65ffafe40304012104ab89935");
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

    @Override // com.sankuai.waimai.drug.j
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ce20dede101ae7a552c3032196aa17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ce20dede101ae7a552c3032196aa17");
        } else if (this.k == null) {
        } else {
            this.k.setVisibility(z ? 8 : 0);
        }
    }
}
