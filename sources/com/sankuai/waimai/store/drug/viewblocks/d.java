package com.sankuai.waimai.store.drug.viewblocks;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.platform.capacity.imageloader.image.BlurTransformation;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.drug.viewblocks.c;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.drug.viewblocks.c
    public final int a() {
        return R.layout.wm_drug_poi_float_player_cover_controller;
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.c
    public final void b(e eVar) {
    }

    public d(c.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fcbe04d3b9a2b32d20cf925215c8e90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fcbe04d3b9a2b32d20cf925215c8e90");
        }
    }

    public void a(@NonNull Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a753b5a6a1cc8479f5e0f61455713ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a753b5a6a1cc8479f5e0f61455713ac3");
            return;
        }
        Context context = this.d.getContext();
        int a2 = h.a(context, 113.0f);
        int a3 = h.a(context, 85.0f);
        b.C0608b a4 = m.a(poi.getPicture());
        a4.b = context;
        a4.a(a2, a3).a(new FixedSizeTransform(a2, a3), BlurTransformation.a(context, 0.1f, 0.3f, 0.33f)).a(this.d);
    }

    public final void a(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e383faffd5a11be92b041d059abc2116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e383faffd5a11be92b041d059abc2116");
        } else if (this.c != null) {
            this.c.setImageResource(i);
        }
    }
}
