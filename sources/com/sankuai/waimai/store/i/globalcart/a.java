package com.sankuai.waimai.store.i.globalcart;

import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    int a(String str);

    List<com.sankuai.waimai.globalcart.model.a> a();

    void a(GlobalCart globalCart);

    void a(String str, CartProduct cartProduct);

    void a(String str, String str2);

    void a(String str, List<GlobalCart.g> list);

    void b();

    void b(String str);

    void b(String str, CartProduct cartProduct);

    void b(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list);

    int c();

    void c(String str);

    void c(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list);

    List<WmOrderedFood> d(String str);

    void d();

    List<OrderedFood> e(String str);
}
