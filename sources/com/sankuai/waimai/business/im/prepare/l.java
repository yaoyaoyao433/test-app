package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l extends e {
    public static ChangeQuickRedirect j;
    private String k;

    public l(Activity activity, long j2, String str, int i, long j3, boolean z, boolean z2, Bundle bundle) {
        super(activity, j2, i, j3, z, z2, bundle);
        Object[] objArr = {activity, new Long(j2), str, Integer.valueOf(i), new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51332d49e58119f3a9b5f92e74e38f50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51332d49e58119f3a9b5f92e74e38f50");
        } else {
            this.k = str;
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.e
    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e40f0b20a04c1c34e5d521ce811ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e40f0b20a04c1c34e5d521ce811ead");
        } else {
            a(this.f, activity);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.e
    public final String c(Activity activity) {
        return this.k;
    }

    @Override // com.sankuai.waimai.business.im.prepare.e
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c932f8b15ec063abe3b5c55ad40531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c932f8b15ec063abe3b5c55ad40531");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(activity.getApplication());
        }
    }
}
