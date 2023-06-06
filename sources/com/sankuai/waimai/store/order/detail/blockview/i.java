package com.sankuai.waimai.store.order.detail.blockview;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ActivityEntryInfo;
import com.sankuai.waimai.store.util.m;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.meituan.android.cube.pga.view.a implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect d;
    String e;
    String f;
    ActivityEntryInfo g;
    private ImageView h;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_promotion_view;
    }

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eae8695fdad57ed5b2d3d2b887626e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eae8695fdad57ed5b2d3d2b887626e6");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98f045d26cdba5cd514a093df984bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98f045d26cdba5cd514a093df984bea");
            return;
        }
        super.b();
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        this.h = (ImageView) this.b.findViewById(R.id.iv_promotion_thumbnail);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.i.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6e76236ccc1df38d9d33e5b32c36ece", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6e76236ccc1df38d9d33e5b32c36ece");
                } else if (i.this.g == null || TextUtils.isEmpty(i.this.g.jumpUrl)) {
                } else {
                    i iVar = i.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = i.d;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "93d65ef0fbfaa33df38aa2259b9bbdf9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "93d65ef0fbfaa33df38aa2259b9bbdf9");
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a("c_hgowsqb", "b_waimai_sg_mgy5j26s_mc").a("order_id", iVar.e).a("poi_id", iVar.f).a("pageinfo", iVar.g.iconUrl).a();
                    }
                    com.sankuai.waimai.store.router.d.a(i.this.c, i.this.g.jumpUrl);
                }
            }
        });
    }

    public final void a(List<ActivityEntryInfo> list, String str, String str2, boolean z, int i) {
        Object[] objArr = {list, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aacbd2936c3d98cc5e6ec91ffb81e14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aacbd2936c3d98cc5e6ec91ffb81e14");
            return;
        }
        this.g = null;
        this.e = str2;
        this.f = str;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.g = list.get(0);
        }
        if (z && this.g != null) {
            m.b(this.g.iconUrl).a(this.h);
            a(i);
            this.b.setVisibility(0);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19d73406ac9db1e18dfdb78a0208330c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19d73406ac9db1e18dfdb78a0208330c");
                return;
            }
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("c_hgowsqb", "b_waimai_sg_mgy5j26s_mv", this.b);
            bVar.a("order_id", this.e);
            bVar.a("poi_id", this.f);
            bVar.a("pageinfo", this.g.iconUrl);
            com.sankuai.waimai.store.expose.v2.b.a().a(this, bVar);
            return;
        }
        this.b.setVisibility(8);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ed7a69c0c9b0f77c482a04f18293df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ed7a69c0c9b0f77c482a04f18293df");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 53;
            layoutParams2.topMargin = i - this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_78);
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            this.b.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final Activity bB_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dc82cd4c11f5763b0a95b804b81c8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dc82cd4c11f5763b0a95b804b81c8a");
        }
        Context context = this.b.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public void b(int i) {
        int width;
        float f;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de314f1fc2fa0ad5fda0ec42aba9325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de314f1fc2fa0ad5fda0ec42aba9325");
        } else if (this.b.getVisibility() != 8 && (width = this.b.getWidth()) > 0) {
            float min = Math.min(1.0f, i / (width * 1.0f));
            this.b.setTranslationX((int) (f * min));
            this.b.setAlpha(1.0f - min);
        }
    }
}
