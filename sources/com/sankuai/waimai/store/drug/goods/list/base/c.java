package com.sankuai.waimai.store.drug.goods.list.base;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.poi.subscribe.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a.c {
    public static ChangeQuickRedirect a;
    @NonNull
    private SCBaseActivity b;
    private long d;
    private String h;
    private int i;

    public c(@NonNull SCBaseActivity sCBaseActivity, long j, String str, int i) {
        super(j, str);
        Object[] objArr = {sCBaseActivity, new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f0e353d4659e2a18127090694bf595", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f0e353d4659e2a18127090694bf595");
            return;
        }
        this.b = sCBaseActivity;
        this.d = j;
        this.h = str;
        this.i = i;
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7a1235fab991b8535aa0cecb9fe4bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7a1235fab991b8535aa0cecb9fe4bf");
        } else {
            com.sankuai.waimai.store.drug.base.net.b.a(this.b.w()).a(this.d, this.h, this.i, (j<PoiSubscribeResponse>) this);
        }
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34aee93fef79e2bd39cade2f0e79cf52", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34aee93fef79e2bd39cade2f0e79cf52") : this.b.getString(R.string.wm_sg_poi_subscribe_error);
    }
}
