package com.sankuai.waimai.drug.b2c;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.drug.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends j {
    public static ChangeQuickRedirect h;
    GoodsSpu i;
    private ImageView j;
    private TextView k;

    public f(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar, GoodsSpu goodsSpu) {
        super(activity, aVar);
        Object[] objArr = {activity, aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924c7c2a1a1dc70f67de45c4b5bffefa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924c7c2a1a1dc70f67de45c4b5bffefa");
        } else {
            this.i = goodsSpu;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed81241935733eb0a56a7ada0cd049e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed81241935733eb0a56a7ada0cd049e") : layoutInflater.inflate(R.layout.wm_sc_shopcart_b2c_poi_entry, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6622019485250da4d308445a837f86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6622019485250da4d308445a837f86c");
            return;
        }
        super.onViewCreated();
        this.j = (ImageView) this.mView.findViewById(R.id.b2c_poi_top_img);
        this.k = (TextView) this.mView.findViewById(R.id.b2c_poi_bottom_tv);
        this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.b2c.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97a4e652626fdf138729a9ed55d6491f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97a4e652626fdf138729a9ed55d6491f");
                } else if (t.a(f.this.b())) {
                } else {
                    com.sankuai.waimai.store.router.d.a(f.this.getContext(), f.this.b());
                    com.sankuai.waimai.store.manager.judas.b.a(f.this.e.d, com.sankuai.waimai.store.manager.judas.b.a((Object) f.this.mContext), "b_waimai_ssach3vx_mc").a("poi_id", f.this.c.d()).a("spu_id", Long.valueOf(f.this.i != null ? f.this.i.id : -999L)).a("stid", f.this.g).a();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.drug.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178417912d92bbb93845e322a4998247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178417912d92bbb93845e322a4998247");
        } else if (this.c == null) {
        } else {
            if (!t.a(b())) {
                this.mView.setEnabled(true);
                this.k.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_575859));
                this.j.setColorFilter(this.mContext.getResources().getColor(R.color.wm_sg_color_575859));
                return;
            }
            this.mView.setEnabled(false);
            this.k.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_BCBCBD));
            this.j.setColorFilter(this.mContext.getResources().getColor(R.color.wm_sg_color_BCBCBD));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1938ccf2443a223bba94bf585b116ed0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1938ccf2443a223bba94bf585b116ed0");
        }
        if (this.c == null || this.c.b == null) {
            return null;
        }
        return this.c.b.restaurantScheme;
    }
}
