package com.sankuai.waimai.store.poi.list.refactor.card.float_card;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;
    private ImageView c;

    public a(@NonNull Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90dc2a1d4e5d37e83b581f4d1ffb102b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90dc2a1d4e5d37e83b581f4d1ffb102b");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb0f5431f2a7b6ea8f924e4f01d8b4d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb0f5431f2a7b6ea8f924e4f01d8b4d") : layoutInflater.inflate(R.layout.wm_sc_home_marketing_float_entrance, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252f31d785f9416620d6ae47c13d4af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252f31d785f9416620d6ae47c13d4af3");
            return;
        }
        super.onViewCreated();
        this.c = (ImageView) findView(R.id.iv_home_marketing_float_entrance);
    }

    public final void a(final PoiVerticalityDataResponse.FloatMarketingEntrance floatMarketingEntrance) {
        final Map<String, Object> map;
        Object[] objArr = {floatMarketingEntrance};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bff397d77f96e5197aa0e18c6c62d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bff397d77f96e5197aa0e18c6c62d9");
        } else if (floatMarketingEntrance == null || this.b == null) {
            hide();
        } else {
            Object[] objArr2 = {floatMarketingEntrance};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a926e4a64124e289dcced5542f6c6676", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a926e4a64124e289dcced5542f6c6676");
            } else if (this.b == null || floatMarketingEntrance == null) {
                map = null;
            } else {
                map = new HashMap<>();
                map.put("cat_id", String.valueOf(this.b.c));
                map.put("stid", TextUtils.isEmpty(this.b.T) ? "-999" : this.b.T);
                map.put("activity_id", TextUtils.isEmpty(floatMarketingEntrance.activityId) ? "-999" : floatMarketingEntrance.activityId);
            }
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_gr9yx04z_mv", this.c);
            bVar.b(map);
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, bVar);
            show();
            m.b(floatMarketingEntrance.picUrl, ImageQualityUtil.a()).a(this.c);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.float_card.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50b22073f2711f499356bca625c68333", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50b22073f2711f499356bca625c68333");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.mContext, "b_waimai_gr9yx04z_mc").b(map).a();
                    com.sankuai.waimai.store.router.d.a(view.getContext(), floatMarketingEntrance.schemeUrl);
                }
            });
        }
    }
}
