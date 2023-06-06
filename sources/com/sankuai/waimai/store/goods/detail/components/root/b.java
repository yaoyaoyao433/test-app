package com.sankuai.waimai.store.goods.detail.components.root;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    public int b;
    public GoodsSpu c;
    public GoodsSku d;
    public boolean e;
    public boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends b {
        public com.sankuai.waimai.store.v2.detail.component.mach.a g;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.root.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1174b extends b {
        public com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d g;
        public float h;
        public int i;
        @NonNull
        public GoodDetailResponse j;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb843511b96a2e1c97e807ad7d2b6825", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb843511b96a2e1c97e807ad7d2b6825");
        }
        if (this.c == null || com.sankuai.shangou.stone.util.a.b(this.c.getSkuList())) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsSku goodsSku : this.c.getSkuList()) {
            if (goodsSku != null) {
                arrayList.add(String.valueOf(goodsSku.getSkuId()));
            }
        }
        return t.a(arrayList, CommonConstant.Symbol.COMMA);
    }
}
