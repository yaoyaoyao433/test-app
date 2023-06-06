package com.sankuai.waimai.store.drug.home.refactor;

import android.arch.lifecycle.q;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.drug.home.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j implements android.arch.lifecycle.l<PoiResult> {
    public static ChangeQuickRedirect a;
    private android.arch.lifecycle.f b;
    private FragmentActivity c;
    private com.sankuai.waimai.store.assembler.component.k d;
    private com.sankuai.waimai.store.drug.home.refactor.service.a e;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(PoiResult poiResult) {
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb9ef3fbf8b96a396aa9427d1b90e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb9ef3fbf8b96a396aa9427d1b90e67");
        } else if (poiResult2 != null) {
            Object[] objArr2 = {poiResult2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1e8a06ec345404a32d8d2b2413c1e46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1e8a06ec345404a32d8d2b2413c1e46");
                return;
            }
            ArrayList arrayList = new ArrayList();
            BaseCard a2 = this.e.a(poiResult2.response, this.b, this.c);
            if (a2 != null) {
                arrayList.add(a2);
            }
            List<BaseCard> c = this.e.c(poiResult2.response, this.b, this.c);
            if (com.sankuai.shangou.stone.util.a.a((List) c) > 0) {
                arrayList.addAll(c);
            }
            List<BaseCard> e = this.e.e(poiResult2.response, this.b, this.c);
            if (com.sankuai.shangou.stone.util.a.a((List) e) > 0) {
                arrayList.addAll(e);
            }
            if (arrayList.size() > 0) {
                this.d.a(arrayList);
            }
            List<BaseCard> d = this.e.d(poiResult2.response, this.b, this.c);
            if (com.sankuai.shangou.stone.util.a.b(d)) {
                return;
            }
            this.d.b(d);
        }
    }

    public j(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity, com.sankuai.waimai.store.assembler.component.k kVar) {
        Object[] objArr = {fVar, fragmentActivity, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fcd506b17b9140e838090aabb8b0ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fcd506b17b9140e838090aabb8b0ec");
            return;
        }
        this.b = fVar;
        this.c = fragmentActivity;
        this.d = kVar;
        this.e = new a();
        ((PoiPageViewModel) q.a(this.c).a(PoiPageViewModel.class)).b.a(this.b, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3635419ef05fa0416b009603867e3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3635419ef05fa0416b009603867e3bf");
            return;
        }
        BaseCard a2 = this.e.a(new PoiVerticalityDataResponse(), this.b, this.c);
        if (a2 != null) {
            this.d.a(a2);
        }
        BaseCard b = this.e.b(new PoiVerticalityDataResponse(), this.b, this.c);
        if (b != null) {
            this.d.a(b);
        }
    }
}
