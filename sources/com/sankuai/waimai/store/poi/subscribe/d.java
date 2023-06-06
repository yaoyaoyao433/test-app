package com.sankuai.waimai.store.poi.subscribe;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.poi.subscribe.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends a.c {
    public static ChangeQuickRedirect h;
    @NonNull
    private SCBaseActivity a;
    private long b;
    private int d;

    public d(@NonNull SCBaseActivity sCBaseActivity, long j, int i) {
        super(j);
        Object[] objArr = {sCBaseActivity, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fdf773a10c62e4e7aa28ec350ac9e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fdf773a10c62e4e7aa28ec350ac9e9");
            return;
        }
        this.a = sCBaseActivity;
        this.b = j;
        this.d = i;
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3e3d959ceb4e514d36bb8045b584c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3e3d959ceb4e514d36bb8045b584c8");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.a.w()).a(this.b, this.d, this);
        }
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f44402958e9fef869bbcb2f2bc0fb9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f44402958e9fef869bbcb2f2bc0fb9") : this.a.getString(R.string.wm_sg_poi_subscribe_error);
    }
}
