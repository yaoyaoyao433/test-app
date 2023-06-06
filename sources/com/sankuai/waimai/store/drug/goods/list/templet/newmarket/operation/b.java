package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
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
    private final h c;

    public b(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29990313529fb5de114590d6e25983d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29990313529fb5de114590d6e25983d1");
        } else {
            this.c = hVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf875e46fb6bbe46eabc5c90ca5378ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf875e46fb6bbe46eabc5c90ca5378ce");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f9df2b39524c59c3528f052c98bb54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f9df2b39524c59c3528f052c98bb54");
        } else if (!com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            a(false);
        } else {
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ccf2158fd63366fa68c9e50719f6f6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ccf2158fd63366fa68c9e50719f6f6d");
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                if (this.b.d()) {
                    a(true);
                }
                this.b.a(list, new OperationBannerAdapter(this.mContext, list, new BannerPagerAdapter.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.view.banner.BannerPagerAdapter.a
                    public final int a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c428dcd3b41d51fb25bf0b4f49515de2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c428dcd3b41d51fb25bf0b4f49515de2")).intValue() : com.sankuai.shangou.stone.util.h.a(b.this.mContext, 4.0f);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886a22a80c296e53281c563040088319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886a22a80c296e53281c563040088319");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f181aca07f7b197ba7367e0f9a98d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f181aca07f7b197ba7367e0f9a98d1c");
            return;
        }
        super.onDestroy();
        this.b.c();
    }
}
