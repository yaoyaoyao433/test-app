package com.sankuai.waimai.restaurant.shopcart.ui;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.restaurant.shopcart.ui.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class k {
    public static ChangeQuickRedirect a;
    a b;
    View c;
    private final com.sankuai.waimai.business.restaurant.base.manager.order.g d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@NonNull View view);

        void aW_();

        void b();

        boolean d();
    }

    public abstract List<com.sankuai.waimai.business.restaurant.base.shopcart.g> b();

    public k(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60790923f1a59370d9bc4bda1bfab0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60790923f1a59370d9bc4bda1bfab0d");
        } else {
            this.d = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        OrderedFood orderedFood;
        GoodsSpu goodsSpu;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460d19af15935b93e41f78da710a7e83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460d19af15935b93e41f78da710a7e83")).booleanValue();
        }
        List<com.sankuai.waimai.business.restaurant.base.shopcart.g> b = b();
        if (com.sankuai.waimai.foundation.utils.b.a(b)) {
            for (com.sankuai.waimai.business.restaurant.base.shopcart.g gVar : b) {
                ShopCartItem shopCartItem = gVar.h;
                if (shopCartItem != null && (orderedFood = shopCartItem.food) != null && (goodsSpu = orderedFood.spu) != null && (goodsSpu.getActivityType() == 1 || goodsSpu.getActivityType() == 2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.restaurant.shopcart.ui.k$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[f.a.valuesCustom().length];

        static {
            try {
                a[f.a.HAS_DISCOUNT_GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.STRATEGY_A_REPEAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.a.STRATEGY_C_NOT_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a4e76030f9dc5df0a8a1e3ef944995c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a4e76030f9dc5df0a8a1e3ef944995c");
        }
        return "<font color='#FFDB69'>" + com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_highlight_reduce, com.sankuai.waimai.foundation.utils.h.a(d)) + "</font>";
    }
}
