package com.dianping.video.template.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class TemplateTrack {
    public static ChangeQuickRedirect a;
    private List<d> b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public @interface TrackType {
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a268f2b5672b6c28b93805b12e8011b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a268f2b5672b6c28b93805b12e8011b")).intValue() : this.b.size();
    }

    public final d a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7358997a73ad5023a28202f36cb20e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7358997a73ad5023a28202f36cb20e");
        }
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.b.get(i);
    }
}
