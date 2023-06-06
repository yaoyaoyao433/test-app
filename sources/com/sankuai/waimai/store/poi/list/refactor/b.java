package com.sankuai.waimai.store.poi.list.refactor;

import android.arch.lifecycle.f;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.k;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements l<PoiResult> {
    public static ChangeQuickRedirect a;
    private f b;
    private FragmentActivity c;
    private k d;
    private com.sankuai.waimai.store.poi.list.refactor.service.c e;
    private List<BaseCard> f;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(PoiResult poiResult) {
        PoiResult poiResult2 = poiResult;
        Object[] objArr = {poiResult2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993c55ce516063f223661b24c55721b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993c55ce516063f223661b24c55721b2");
        } else if (poiResult2 != null) {
            ArrayList arrayList = new ArrayList();
            BaseCard a2 = this.e.a(poiResult2.response, this.b, this.c);
            if (a2 != null) {
                arrayList.add(a2);
            }
            List<BaseCard> c = this.e.c(poiResult2.response, this.b, this.c);
            if (com.sankuai.shangou.stone.util.a.a((List) c) > 0) {
                a(c);
                arrayList.addAll(c);
            }
            List<BaseCard> e = this.e.e(poiResult2.response, this.b, this.c);
            if (com.sankuai.shangou.stone.util.a.a((List) e) > 0) {
                arrayList.addAll(e);
            }
            com.sankuai.waimai.store.fsp.a.a().a(this.c, "wp_render_start");
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

    public b(f fVar, FragmentActivity fragmentActivity, k kVar) {
        Object[] objArr = {fVar, fragmentActivity, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2445dd8c719725e95b3bddbb4e22ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2445dd8c719725e95b3bddbb4e22ee");
            return;
        }
        this.f = new ArrayList();
        this.b = fVar;
        this.c = fragmentActivity;
        this.d = kVar;
        PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a(this.c).a(PoiPageViewModel.class);
        this.e = new a(poiPageViewModel.d.a());
        poiPageViewModel.b.a(this.b, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebdf7483821651a0e786696b280b6487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebdf7483821651a0e786696b280b6487");
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

    private void a(List<BaseCard> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152ae5ae2fef5b1e85ef173ef29ec399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152ae5ae2fef5b1e85ef173ef29ec399");
            return;
        }
        if (com.sankuai.shangou.stone.util.a.c(this.f) > 0) {
            for (BaseCard baseCard : this.f) {
                if (baseCard != null) {
                    baseCard.onDestroy();
                }
            }
            this.f.clear();
        }
        this.f.addAll(list);
    }
}
