package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends d {
    public static ChangeQuickRedirect o;
    private String p;

    public j(Activity activity, int i, long j, long j2, String str, long j3, HashSet<String> hashSet, int i2, String str2, boolean z, Bundle bundle) {
        super(activity, i, j, j2, str, j3, hashSet, i2, z, bundle);
        Object[] objArr = {activity, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), hashSet, Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6ceb345fc267f072598082ec3d5052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6ceb345fc267f072598082ec3d5052");
        } else {
            this.p = str2;
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.d
    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b83b93151d6e9edae1f78d6a49889c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b83b93151d6e9edae1f78d6a49889c");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(activity.getApplication());
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.d
    public final String b(Activity activity) {
        return this.p;
    }
}
