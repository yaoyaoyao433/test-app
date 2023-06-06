package com.sankuai.waimai.business.restaurant.base.ui;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.ui.a;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.domain.core.goods.SpuPackageItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends a {
    public static ChangeQuickRedirect d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    private ViewGroup j;

    @Override // com.sankuai.waimai.business.restaurant.base.ui.a
    public final /* bridge */ /* synthetic */ View a() {
        return super.a();
    }

    public i(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        Object[] objArr = {view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a56c5e94e4edbe473916f03443173e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a56c5e94e4edbe473916f03443173e9");
            return;
        }
        this.j = (ViewGroup) view.findViewById(R.id.wm_good_spu_package_content_container_entrance);
        this.e = (TextView) view.findViewById(R.id.wm_good_spu_package_title);
        this.f = (TextView) view.findViewById(R.id.wm_good_package_desc);
        this.h = (TextView) view.findViewById(R.id.wm_good_package_desc_soon);
        this.g = (TextView) view.findViewById(R.id.wm_good_package_price);
        this.i = (TextView) view.findViewById(R.id.wm_good_package_origin_price);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.ui.a
    public final void a(SpuPackageItem spuPackageItem, final a.InterfaceC0828a interfaceC0828a) {
        Object[] objArr = {spuPackageItem, interfaceC0828a};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0615ea689a1f678a1cd49b379b08db81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0615ea689a1f678a1cd49b379b08db81");
            return;
        }
        super.a(spuPackageItem, interfaceC0828a);
        ah.a(this.e, spuPackageItem.title);
        ah.a(this.f, spuPackageItem.description);
        this.h.setVisibility((com.sankuai.waimai.foundation.utils.d.a(spuPackageItem.productList) || spuPackageItem.productList.size() <= 2) ? 8 : 0);
        ah.a(this.g, com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_price, com.sankuai.waimai.foundation.utils.h.a(spuPackageItem.price)));
        ah.a(this.i, com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_origin_price, com.sankuai.waimai.foundation.utils.h.a(spuPackageItem.originPrice)));
        if (com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(spuPackageItem.originPrice), Double.valueOf(spuPackageItem.price))) {
            this.i.setVisibility(8);
        }
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.ui.i.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5247d4ae664a5dad4d2d402020227d57", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5247d4ae664a5dad4d2d402020227d57");
                } else if (i.this.c == null || interfaceC0828a == null) {
                } else {
                    interfaceC0828a.a(i.this.c);
                }
            }
        });
        this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.business.restaurant.base.ui.i.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b06f6eadabfd0167b6d155a176f1418e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b06f6eadabfd0167b6d155a176f1418e")).booleanValue();
                }
                TextView textView = i.this.f;
                int width = i.this.b.getWidth() - com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 92.0f);
                i iVar = i.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = i.d;
                textView.setMaxWidth(width - (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "8224635c0654ca14f184e206df801f28", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "8224635c0654ca14f184e206df801f28")).intValue() : ((iVar.a(iVar.e) + iVar.a(iVar.h)) + iVar.a(iVar.g)) + iVar.a(iVar.i)));
                i.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
    }

    int a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2d08a1e443840bebf4c899ea1740db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2d08a1e443840bebf4c899ea1740db")).intValue();
        }
        if (textView == null || textView.getVisibility() == 8) {
            return 0;
        }
        return (int) textView.getPaint().measureText(textView.getText().toString());
    }
}
