package com.sankuai.waimai.store.mach.page.mach;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    Activity b;
    Mach.a c;
    private String d;
    private String e;

    public c(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354cf39684b173d31e4fc3f96d56ed1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354cf39684b173d31e4fc3f96d56ed1a");
            return;
        }
        this.b = activity;
        this.d = str;
        this.e = str2;
        Mach.a aVar = new Mach.a();
        aVar.b = activity;
        this.c = aVar;
    }

    public final Mach.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b881c523ae1606b8bdbb8c0c8a6b8db5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b881c523ae1606b8bdbb8c0c8a6b8db5");
        }
        Mach.a aVar = this.c;
        aVar.e = new com.sankuai.waimai.store.search.ui.result.mach.c();
        aVar.g = new r() { // from class: com.sankuai.waimai.store.mach.page.mach.c.2
            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_common_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_common_dot_square_yellow_normal;
            }
        };
        aVar.a(new com.sankuai.waimai.platform.mach.statistics.d(this.b)).a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.store.mach.page.mach.c.1
            public static ChangeQuickRedirect a;
            private Dialog c = null;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85140da526946bf8f5fc1beae2e61a83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85140da526946bf8f5fc1beae2e61a83");
                } else if (a()) {
                } else {
                    com.sankuai.waimai.foundation.core.utils.d.a(this.c);
                    this.c = com.sankuai.waimai.foundation.core.utils.d.a(c.this.b);
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9feaf4ed014ca4420819117d1a96958", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9feaf4ed014ca4420819117d1a96958");
                } else if (a()) {
                } else {
                    com.sankuai.waimai.foundation.core.utils.d.a(this.c);
                    this.c = null;
                }
            }

            private boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91163950e0a3120269d7a698b90fe1ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91163950e0a3120269d7a698b90fe1ba")).booleanValue() : com.sankuai.waimai.foundation.utils.f.a(c.this.b);
            }
        }).a(new com.sankuai.waimai.platform.mach.statistics.d(this.b)).a(new SwiperTagProcessor());
        List<IBuildMachNativeMethod> a2 = com.sankuai.waimai.router.a.a(IBuildMachNativeMethod.class);
        if (!com.sankuai.waimai.foundation.utils.d.a(a2)) {
            for (IBuildMachNativeMethod iBuildMachNativeMethod : a2) {
                if (iBuildMachNativeMethod != null && iBuildMachNativeMethod.getMachHttpMethod(this.b, this.e) != null) {
                    this.c.a(iBuildMachNativeMethod.getMachHttpMethod(this.b, this.e));
                }
            }
        }
        return this.c;
    }
}
