package com.sankuai.waimai.store.skuchoose;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.ak;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface i {
    void a(int i, Poi poi, GoodsSpu goodsSpu);

    void a(int i, Map<String, Object> map);

    void a(Poi poi, com.sankuai.waimai.store.param.a aVar, int i);

    void a(String str, String str2, String str3, int i, int i2, String str4);

    void i();

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        public static i a(Activity activity, GoodsSpu goodsSpu) {
            Object[] objArr = {activity, goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "707fe282233528d9479744b2da63a744", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "707fe282233528d9479744b2da63a744") : a(activity, goodsSpu, false);
        }

        private static i a(Activity activity, GoodsSpu goodsSpu, boolean z) {
            Object[] objArr = {activity, goodsSpu, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d4202e138ac3d62ca088a074fff5bab", RobustBitConfig.DEFAULT_VALUE)) {
                return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d4202e138ac3d62ca088a074fff5bab");
            }
            if (goodsSpu != null && ak.a(goodsSpu)) {
                return new OptimizedSkuDialog(activity);
            }
            return new SCChooseDefaultSkuDialog(activity, false);
        }
    }
}
