package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b extends com.sankuai.waimai.business.im.common.prepare.a {
    public static ChangeQuickRedirect g;

    public b(Activity activity, boolean z) {
        super(activity, z);
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b819a60af0ab6d25366b8429dd82395b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b819a60af0ab6d25366b8429dd82395b");
        }
    }

    public final void a(int i, Activity activity) {
        Object[] objArr = {Integer.valueOf(i), activity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529e47c3ea98ec99bb780c73c9d33b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529e47c3ea98ec99bb780c73c9d33b39");
        } else if (i == 2 || i == 1 || i == 6 || i == 7) {
            a(activity);
        }
    }

    public final void b(int i, Activity activity) {
        Object[] objArr = {Integer.valueOf(i), activity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9127c748b96c956387ec7cf40ce204e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9127c748b96c956387ec7cf40ce204e6");
            return;
        }
        if (i == 2) {
            com.sankuai.waimai.imbase.b.d().a(activity);
            a(activity);
        }
        if (i == 1 || i == 6 || i == 7) {
            a(activity);
        }
    }

    private void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b26684c06e239fcc6f1efdbe227629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b26684c06e239fcc6f1efdbe227629");
            return;
        }
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
