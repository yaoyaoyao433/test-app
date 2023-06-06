package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public RestMenuResponse c;
    private com.sankuai.waimai.store.poi.subscribe.e d;

    public j(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a83aa5ca14e79137d1e62aed891b72e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a83aa5ca14e79137d1e62aed891b72e");
        } else {
            this.d = new com.sankuai.waimai.store.poi.subscribe.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.j.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.subscribe.e
                public final void a(long j, int i) {
                    Object[] objArr2 = {new Long(j), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30940fa02c437cac09dd42cd9bea5950", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30940fa02c437cac09dd42cd9bea5950");
                    } else if (j.this.c == null || j != j.this.c.getPoiId()) {
                    } else {
                        j.this.c.getPoi().subscribe = i;
                        if (i == 1) {
                            j.this.b.setImageResource(R.drawable.wm_sg_poi_page_can_subscribe);
                        }
                        if (i == 2) {
                            j.this.b.setImageResource(R.drawable.wm_sg_poi_page_have_subscribed);
                        }
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c50ef8f2bf08a67f5d67debee864274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c50ef8f2bf08a67f5d67debee864274");
            return;
        }
        super.onViewCreated();
        com.sankuai.waimai.store.poi.subscribe.a.a().a(this.d);
        this.b = (ImageView) this.mView.findViewById(R.id.poi_page_subscribe);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3125e640107a42583ed174f39daea254", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3125e640107a42583ed174f39daea254") : layoutInflater.inflate(R.layout.wm_sg_poi_page_subscribe, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe6cd5f1c9263c9b561d2955feb3f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe6cd5f1c9263c9b561d2955feb3f97");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.poi.subscribe.a.a().b(this.d);
    }
}
