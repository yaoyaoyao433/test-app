package com.sankuai.waimai.store.im.poi.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public List<OrderedFood> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5668f3e79a62fc239f9988ffcbd3386f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5668f3e79a62fc239f9988ffcbd3386f");
            return;
        }
        this.b = false;
        this.c = new ArrayList();
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ce67622bdac1b43831cdda1ff84ca26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ce67622bdac1b43831cdda1ff84ca26")).booleanValue();
        }
        if (c()) {
            return k.c() || k.d();
        }
        return false;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7808d627bb58a38ab56d167117d0703", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7808d627bb58a38ab56d167117d0703")).booleanValue() : i.h().a("sg_im_user/block_expose", true);
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "285a706eea2ec76f1c4d0408bdf06896", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "285a706eea2ec76f1c4d0408bdf06896")).booleanValue() : i.h().a("sg_im_user/upload_shop_cart_skus", true);
    }
}
