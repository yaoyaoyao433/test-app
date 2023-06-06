package com.sankuai.waimai.ad;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<T extends PouchDynamicAd> extends com.meituan.android.cube.pga.viewmodel.a<T> {
    public static ChangeQuickRedirect o;
    public static com.sankuai.waimai.mach.recycler.b p = new com.sankuai.waimai.mach.recycler.b("waimai");
    public com.sankuai.waimai.pouch.a q;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba394ff6a2544571c11bd80cc100036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba394ff6a2544571c11bd80cc100036");
            return;
        }
        super.a();
        if (TextUtils.equals(((PouchDynamicAd) e()).businessName, "order_crossshop")) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6fa86df8f2d0d90cf5c3ee351fdaac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6fa86df8f2d0d90cf5c3ee351fdaac9");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("AdBlockViewModel", "try pre render", new Object[0]);
        if (!(this.d instanceof Activity)) {
            com.sankuai.waimai.foundation.utils.log.a.e("AdBlockViewModel", "context invalid", new Object[0]);
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = o;
        PouchDynamicAd pouchDynamicAd = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "add168baffe7283027a6f8053c2fe64c", RobustBitConfig.DEFAULT_VALUE) ? (PouchDynamicAd) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "add168baffe7283027a6f8053c2fe64c") : (PouchDynamicAd) e();
        if (pouchDynamicAd == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("AdBlockViewModel", "data is null", new Object[0]);
            return;
        }
        com.sankuai.waimai.pouch.model.c cVar = new com.sankuai.waimai.pouch.model.c();
        cVar.f = "waimai";
        cVar.a = AppUtil.generatePageInfoKey(this.d);
        HashMap hashMap = new HashMap();
        hashMap.put("use_pouch", "1");
        hashMap.put("index", Integer.valueOf(pouchDynamicAd.index));
        cVar.h = hashMap;
        a.C1112a c1112a = new a.C1112a();
        c1112a.b = this.d;
        c1112a.d = cVar;
        this.q = c1112a.a();
        this.q.a((Activity) this.d, p, pouchDynamicAd);
    }
}
