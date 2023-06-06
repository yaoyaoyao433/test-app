package com.sankuai.waimai.business.page.home.list.future.mach;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorProductBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<AnimatorFrameLayout> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.page.common.list.animate.a b;
    private AnimatorFrameLayout c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df187946baf5fbae27ee566804c86ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df187946baf5fbae27ee566804c86ec");
        } else {
            this.b = new com.sankuai.waimai.business.page.common.list.animate.a();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(AnimatorFrameLayout animatorFrameLayout) {
        AnimatorFrameLayout animatorFrameLayout2 = animatorFrameLayout;
        Object[] objArr = {animatorFrameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7630d884b790dc9e954f7e22231294d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7630d884b790dc9e954f7e22231294d");
            return;
        }
        super.a((a) animatorFrameLayout2);
        if (animatorFrameLayout2 != null) {
            com.sankuai.waimai.business.page.common.list.animate.a aVar = this.b;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = AnimatorFrameLayout.a;
            if (PatchProxy.isSupport(objArr2, animatorFrameLayout2, changeQuickRedirect2, false, "b1fa5e72d77ca1a05b4ebe1129d1f690", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, animatorFrameLayout2, changeQuickRedirect2, false, "b1fa5e72d77ca1a05b4ebe1129d1f690");
            } else if (aVar != null) {
                animatorFrameLayout2.i = aVar;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = AnimatorFrameLayout.a;
                if (PatchProxy.isSupport(objArr3, animatorFrameLayout2, changeQuickRedirect3, false, "b450c4fc4a4fbb5c12e79c312cca9776", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, animatorFrameLayout2, changeQuickRedirect3, false, "b450c4fc4a4fbb5c12e79c312cca9776");
                } else if (animatorFrameLayout2.i != null) {
                    animatorFrameLayout2.e = 0;
                    animatorFrameLayout2.f = 0;
                    String str = null;
                    if (animatorFrameLayout2.i.b == 6) {
                        str = animatorFrameLayout2.a(animatorFrameLayout2.i, 1);
                    } else if (animatorFrameLayout2.i.b == 7 || animatorFrameLayout2.i.b == 8) {
                        str = animatorFrameLayout2.i.d;
                    }
                    animatorFrameLayout2.a(animatorFrameLayout2.h, animatorFrameLayout2.a(animatorFrameLayout2.i, 0), true);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    animatorFrameLayout2.a((ImageView) animatorFrameLayout2.g, str, false);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ AnimatorFrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea658684235552b6c9e5830e65072c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorFrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea658684235552b6c9e5830e65072c7");
        }
        this.c = new AnimatorFrameLayout(context);
        return this.c;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        List<AnimatorProductBean> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e33bc3064667f8e323b82183c69b41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e33bc3064667f8e323b82183c69b41b");
            return;
        }
        Map<String, Object> k = k();
        if (k == null || !k.containsKey("data")) {
            return;
        }
        Map<String, Object> map = (Map) k.get("data");
        Number number = (Number) a(map, "img_type", Number.class);
        Number number2 = (Number) a(map, "img_style", Number.class);
        String str = (String) a(map, "poi_pic", String.class);
        this.b.b = number == null ? 0 : number.intValue();
        this.b.c = number2 == null ? 0 : number2.intValue();
        this.b.d = str;
        if (map.containsKey("animate_products")) {
            List<Map<String, Object>> list2 = (List) map.get("animate_products");
            if (com.sankuai.waimai.foundation.utils.d.a(list2)) {
                return;
            }
            for (Map<String, Object> map2 : list2) {
                if (map2 != null) {
                    AnimatorProductBean animatorProductBean = new AnimatorProductBean();
                    animatorProductBean.skuId = ((Long) a(map2, "sku_id", Long.class)).longValue();
                    animatorProductBean.picture = (String) a(map2, "picture", String.class);
                    animatorProductBean.picInfo = (String) a(map2, "pic_info", String.class);
                    animatorProductBean.animateConf = (String) a(map2, "animate_conf", String.class);
                    animatorProductBean.scheme = (String) a(map2, NetLogConstants.Details.SCHEME, String.class);
                    com.sankuai.waimai.business.page.common.list.animate.a aVar = this.b;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.common.list.animate.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5069a0098d188a6ada471c6dd47b2ad3", RobustBitConfig.DEFAULT_VALUE)) {
                        list = (List) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5069a0098d188a6ada471c6dd47b2ad3");
                    } else {
                        if (aVar.e == null) {
                            aVar.e = new ArrayList();
                        }
                        list = aVar.e;
                    }
                    list.add(animatorProductBean);
                }
            }
        }
    }

    private <T> T a(Map<String, Object> map, String str, Class<T> cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ca060c273cdb4c196aad8a3a1b30daf", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ca060c273cdb4c196aad8a3a1b30daf");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if ((obj instanceof Number) || (obj instanceof String)) {
            return cls.cast(map.get(str));
        }
        return null;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10993c483c8d2c1c143fa573d36ea38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10993c483c8d2c1c143fa573d36ea38");
            return;
        }
        super.b();
        if (this.c != null) {
            AnimatorFrameLayout animatorFrameLayout = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = AnimatorFrameLayout.a;
            if (PatchProxy.isSupport(objArr2, animatorFrameLayout, changeQuickRedirect2, false, "e58f05607b25350e8f8b2eca69bdfdf5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, animatorFrameLayout, changeQuickRedirect2, false, "e58f05607b25350e8f8b2eca69bdfdf5");
                return;
            }
            if (animatorFrameLayout.k != null) {
                animatorFrameLayout.k.cancel();
            }
            if (animatorFrameLayout.c != null) {
                animatorFrameLayout.c.clear();
            }
            if (AnimatorFrameLayout.b != null) {
                AnimatorFrameLayout.b.clear();
            }
        }
    }
}
