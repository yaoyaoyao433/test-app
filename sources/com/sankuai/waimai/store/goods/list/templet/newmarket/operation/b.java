package com.sankuai.waimai.store.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.view.banner.AutoScrollPagerView;
import com.sankuai.waimai.store.view.banner.BannerPagerAdapter;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private AutoScrollPagerView b;
    @NonNull
    private final e c;

    public b(@NonNull Context context, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee5f5f17ceffaae7394397ecdc2a2c6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee5f5f17ceffaae7394397ecdc2a2c6e");
        } else {
            this.c = eVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf27ff50abbb6e31c81a10e3578b187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf27ff50abbb6e31c81a10e3578b187");
            return;
        }
        super.onViewCreated();
        this.b = (AutoScrollPagerView) findView(R.id.shop_content_operation_view);
        this.b.setFocusableInTouchMode(false);
        this.b.a();
    }

    public final void a(List<PoiOperationItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3048044d9538e11ca60fbd313761f150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3048044d9538e11ca60fbd313761f150");
        } else if (!com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            a(false);
        } else {
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "543a377c70541bbf3b2f827a5208c108", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "543a377c70541bbf3b2f827a5208c108");
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                if (this.b.d()) {
                    a(true);
                }
                this.b.a(list, new OperationBannerAdapter(this.mContext, list, new BannerPagerAdapter.a() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.operation.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    public final int a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec53e5e510786a70c9274fef4cbcf64c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec53e5e510786a70c9274fef4cbcf64c")).intValue() : h.a(b.this.mContext, 4.0f);
                    }

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    @NonNull
                    public final ImageView.ScaleType b() {
                        return ImageView.ScaleType.FIT_XY;
                    }
                }, this.c));
                if (list.size() > 1) {
                    this.b.b();
                }
            } else {
                this.b.c();
                if (this.b.d()) {
                    a(false);
                }
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe641659e6b0cda5fa3fe4aa7325e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe641659e6b0cda5fa3fe4aa7325e1d");
        } else if (this.b.d()) {
            if (z) {
                this.b.setVisibility(0);
                this.b.f();
                return;
            }
            this.b.setVisibility(8);
            this.b.e();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbea1def9b237e84625e8ef02786bd37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbea1def9b237e84625e8ef02786bd37");
            return;
        }
        super.onDestroy();
        this.b.c();
    }
}
