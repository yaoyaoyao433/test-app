package com.sankuai.waimai.machpro;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.l;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d e;
    public Map<String, Object> b;
    public boolean c;
    public Application d;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97a9298a2cf3958e71d39b734526354b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97a9298a2cf3958e71d39b734526354b");
        }
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0503d76924391200bbe2fbc4940d4176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0503d76924391200bbe2fbc4940d4176");
        } else if (this.d != null) {
        } else {
            this.d = application;
            this.c = l.a((Context) this.d, "mach_pro", "useSwiperV2", false);
        }
    }
}
