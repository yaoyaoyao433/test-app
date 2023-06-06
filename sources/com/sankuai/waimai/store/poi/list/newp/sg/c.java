package com.sankuai.waimai.store.poi.list.newp.sg;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.widget.searchtip.SearchTipView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.param.a i;
    SearchTipView j;
    private SCBaseActivity k;
    private boolean l;
    private String m;

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return R.layout.wm_sc_home_channel_refactor_search_tip_card;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.NonNull com.sankuai.waimai.store.base.idata.b<com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.newp.sg.c.a(java.lang.Object):void");
    }

    public c(SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cef216e8be82d6832c289cd2e9882c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cef216e8be82d6832c289cd2e9882c0");
        } else {
            this.k = sCBaseActivity;
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0077fda82f9ea16105a229d4df35ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0077fda82f9ea16105a229d4df35ce");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
        int a2 = c1279a.a(getContext());
        int b = c1279a.b(getContext());
        if (a2 >= 0 && a2 != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = a2;
            z2 = true;
        }
        if (b < 0 || b == marginLayoutParams.bottomMargin) {
            z = z2;
        } else {
            marginLayoutParams.bottomMargin = b;
        }
        if (z) {
            this.j.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba244a5cb1629013ad08f8ef1d0dc67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba244a5cb1629013ad08f8ef1d0dc67");
            return;
        }
        super.onViewCreated();
        this.j = (SearchTipView) findView(R.id.view_search_tip);
        this.i = ((PoiPageViewModel) q.a((FragmentActivity) this.k).a(PoiPageViewModel.class)).d.a();
        this.j.setOnWidgetEventListener(new SearchTipView.c() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widget.searchtip.SearchTipView.c
            public final void a(View view, Map<String, Object> map) {
                Object[] objArr2 = {view, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8356e9e7c2bd10e6126e8ee987ae721d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8356e9e7c2bd10e6126e8ee987ae721d");
                    return;
                }
                com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(c.this.i.G, "b_jje7nw4r", view);
                bVar.b(map);
                com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) c.this.mContext, bVar);
            }

            @Override // com.sankuai.waimai.store.widget.searchtip.SearchTipView.c
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "321c6ac311072c6664580709f20a68fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "321c6ac311072c6664580709f20a68fe");
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(c.this.mContext, "b_3zh636xv").b(map).a();
                }
            }
        });
        this.j.setOnSearchTipResultListener(new SearchTipView.b() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widget.searchtip.SearchTipView.b
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0193749a177c62129fcc0950e7bb521", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0193749a177c62129fcc0950e7bb521");
                } else if (z) {
                } else {
                    ViewGroup.LayoutParams layoutParams = c.this.j.getLayoutParams();
                    layoutParams.height = 0;
                    c.this.j.setLayoutParams(layoutParams);
                }
            }
        });
        this.j.setInDataParam(this.i);
        com.sankuai.waimai.store.poi.list.refactor.cat.a.a(this.i == null ? -1L : this.i.c, getClass().getSimpleName());
        this.l = true;
        this.i.bv++;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fcf58b0a39ab2b900774178b043f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fcf58b0a39ab2b900774178b043f5c");
            return;
        }
        super.onDestroy();
        a(this.m, this.l);
    }
}
