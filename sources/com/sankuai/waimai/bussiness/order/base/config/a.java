package com.sankuai.waimai.bussiness.order.base.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final HashMap<String, String> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0532bec5290c1abfb28502c798da7654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0532bec5290c1abfb28502c798da7654");
        } else {
            this.c = new HashMap<String, String>() { // from class: com.sankuai.waimai.bussiness.order.base.config.a.1
                {
                    put("wm_order_detail_ic_im_unclickable", "http://p0.meituan.net/scarlett/a6f14b61175f1072a4300325539961fe1842.png");
                    put("wm_order_detail_dailog_no_rider_confirm_icon", "http://p0.meituan.net/scarlett/23737959b6b73c5802cdbe36d1bfc9f512681.jpg");
                    put("wm_order_detail_tip_area_arrow_icon", "http://p0.meituan.net/scarlett/f627f532bd7d96ef0fbfbbce992e57f6496.png");
                    put("wm_order_ic_im_contact_rider_gray", "http://p1.meituan.net/scarlett/0114beba3850f64ebe664138412bd12d1527.png");
                    put("wm_order_ic_im_contact_poi_gray", "http://p0.meituan.net/scarlett/4d10670aeb906b4ed5e68d990532043b1500.png");
                    put("wm_order_detail_msg_icon", "http://p0.meituan.net/scarlett/8cfd4a0be99ce2e38495d8057c0eb1a51398.png");
                }
            };
        }
    }

    @NonNull
    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de7dcaf6df7363b273906976a9f4c38f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de7dcaf6df7363b273906976a9f4c38f");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Nullable
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe4687ae9cbabd5f1282b27dc82f919", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe4687ae9cbabd5f1282b27dc82f919") : this.c.get(str);
    }
}
