package com.sankuai.waimai.foundation.core.service.globalcart;

import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {
    void a(GlobalCart globalCart);

    void a(String str);

    void a(String str, CartProduct cartProduct);

    void a(String str, List<OrderedFood> list);

    void b();

    void b(String str);

    void b(String str, CartProduct cartProduct);

    void b(String str, List<Map<String, Object>> list);

    int c();

    List<WmOrderedFood> c(String str);

    void c(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list);

    List<com.sankuai.waimai.globalcart.model.a> d();

    List<OrderedFood> d(String str);

    void d(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list);

    void e();

    void e(String str, List<GlobalCart.g> list);

    int i(String str);

    int j(String str);
}
