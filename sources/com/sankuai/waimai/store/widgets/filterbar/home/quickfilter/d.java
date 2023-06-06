package com.sankuai.waimai.store.widgets.filterbar.home.quickfilter;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends g<FilterConditionResponse.FilterGroup.FilterItem, c> {
    public static ChangeQuickRedirect a;
    private final c b;
    private ViewGroup c;
    private ViewGroup d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private TextView h;
    private View i;
    private View j;
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a k;
    private boolean l;
    private int m;
    private int r;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_filterbar_home_quick_filter_item;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b0  */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse.FilterGroup.FilterItem r23, int r24) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.d.a(java.lang.Object, int):void");
    }

    public d(@NonNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26430b26e55c3e1a34d9851f63dcd9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26430b26e55c3e1a34d9851f63dcd9c");
            return;
        }
        this.l = false;
        this.m = -15539;
        this.r = 654295885;
        this.l = z;
        this.b = cVar;
        this.k = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(cVar.getContext(), (PoiChannelBackgroundConfig) null);
        if (cVar.getContext() instanceof SCBaseActivity) {
            PoiPageViewModel poiPageViewModel = (PoiPageViewModel) q.a((FragmentActivity) ((SCBaseActivity) cVar.getContext())).a(PoiPageViewModel.class);
            com.sankuai.waimai.store.param.a a2 = poiPageViewModel.d != null ? poiPageViewModel.d.a() : null;
            if (a2 != null && a2.f() && a2.l()) {
                this.m = com.sankuai.shangou.stone.util.d.a("#ac2d4d", cVar.getContext().getResources().getColor(R.color.wm_sg_color_FF6391));
                this.r = com.sankuai.shangou.stone.util.d.a("#f1dce3", cVar.getContext().getResources().getColor(R.color.wm_sg_color_1AFF6391));
            }
        }
    }

    @NonNull
    private com.sankuai.waimai.store.widgets.filterbar.home.model.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9150ba397b0431bec4aa327e4d3a0a0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.filterbar.home.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9150ba397b0431bec4aa327e4d3a0a0b");
        }
        if (this.b.d() == null) {
            return this.k;
        }
        return this.b.d();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5977e04d02357fb68d143cda90f4373e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5977e04d02357fb68d143cda90f4373e");
            return;
        }
        this.c = (ViewGroup) view.findViewById(R.id.rl_quick_filter_container);
        this.d = (ViewGroup) view.findViewById(R.id.ll_quick_filter_button_container);
        this.e = (TextView) view.findViewById(R.id.tv_quick_filter_title);
        this.f = (ImageView) view.findViewById(R.id.iv_quick_filter_title_icon);
        this.g = (ImageView) view.findViewById(R.id.iv_quick_filter_image_background);
        this.h = (TextView) view.findViewById(R.id.tv_quick_filter_bubble);
        this.i = view.findViewById(R.id.v_filter_text_bubble);
        this.j = view.findViewById(R.id.v_filter_img_background_bubble);
    }
}
