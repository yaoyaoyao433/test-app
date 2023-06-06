package com.sankuai.waimai.search.common.mach.builder;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.b;
import com.sankuai.waimai.mach.component.indicator.IndicatorTagProcessor;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.js.DialogJSNativeMethod;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.platform.mach.lottieextend.LottieTagProcessor;
import com.sankuai.waimai.platform.mach.rooimage.RooImageProcessor;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.search.common.mach.component.IBuildMachTagProcessor;
import com.sankuai.waimai.search.common.mach.component.WMRatingBarTagProcessor;
import com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Activity b;
    private String c;
    private String d;
    private Mach.a e;

    public a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974120d862eea881066e6498b6b1865d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974120d862eea881066e6498b6b1865d");
            return;
        }
        this.b = activity;
        this.c = str;
        this.d = str2;
        Mach.a aVar = new Mach.a();
        aVar.b = activity;
        this.e = aVar;
    }

    public final a a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b155c6193680645cb1d8fd3f6dc672", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b155c6193680645cb1d8fd3f6dc672");
        }
        this.e.f = gVar;
        return this;
    }

    public final a a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342f6a2416f5c0baa22f3a80a3555a78", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342f6a2416f5c0baa22f3a80a3555a78");
        }
        this.e.d = dVar;
        return this;
    }

    public final a a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79694e934479f39e0b51babad5260f78", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79694e934479f39e0b51babad5260f78");
        }
        this.e.n = map;
        return this;
    }

    public final a a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3237bf79de28bac9e1ee8cabec4a27", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3237bf79de28bac9e1ee8cabec4a27");
        }
        this.e.l = bVar;
        return this;
    }

    public final Mach.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e200a67bc799e09b5a15e3cf959c55", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e200a67bc799e09b5a15e3cf959c55");
        }
        Mach.a aVar = this.e;
        aVar.e = new com.sankuai.waimai.search.common.mach.a();
        aVar.g = new r() { // from class: com.sankuai.waimai.search.common.mach.builder.a.2
            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_common_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_common_dot_square_yellow_normal;
            }
        };
        aVar.a(new com.sankuai.waimai.platform.mach.statistics.d(this.b)).a(new DialogJSNativeMethod() { // from class: com.sankuai.waimai.search.common.mach.builder.a.1
            public static ChangeQuickRedirect a;
            private Dialog c = null;

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void showProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10d5f43e26cfe6f4d974359ded1db434", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10d5f43e26cfe6f4d974359ded1db434");
                } else if (a()) {
                } else {
                    com.sankuai.waimai.foundation.core.utils.d.a(this.c);
                    this.c = com.sankuai.waimai.foundation.core.utils.d.a(a.this.b);
                }
            }

            @Override // com.sankuai.waimai.mach.js.DialogJSNativeMethod
            public final void dismissProcessDialog() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e09b992f18dfd612a5afe7a4526a340", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e09b992f18dfd612a5afe7a4526a340");
                } else if (a()) {
                } else {
                    com.sankuai.waimai.foundation.core.utils.d.a(this.c);
                    this.c = null;
                }
            }

            private boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c478fbf78bf75f619f385f632b6de330", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c478fbf78bf75f619f385f632b6de330")).booleanValue() : f.a(a.this.b);
            }
        }).a(new com.sankuai.waimai.platform.mach.statistics.d(this.b)).a(new ScrollerTagProcessor()).a(new WebpImageTagProcessor()).a(new RooImageProcessor()).a(new WMRatingBarTagProcessor()).a(new DynamicTagProcessor()).a(new LottieTagProcessor()).a(new IndicatorTagProcessor()).a(new SwiperTagProcessor());
        List<IBuildMachNativeMethod> a2 = com.sankuai.waimai.router.a.a(IBuildMachNativeMethod.class);
        if (!com.sankuai.waimai.foundation.utils.d.a(a2)) {
            for (IBuildMachNativeMethod iBuildMachNativeMethod : a2) {
                if (iBuildMachNativeMethod != null && iBuildMachNativeMethod.getMachHttpMethod(this.b, this.d) != null) {
                    this.e.a(iBuildMachNativeMethod.getMachHttpMethod(this.b, this.d));
                }
            }
        }
        List<IBuildMachTagProcessor> a3 = com.sankuai.waimai.router.a.a(IBuildMachTagProcessor.class);
        if (!com.sankuai.waimai.foundation.utils.d.a(a3)) {
            for (IBuildMachTagProcessor iBuildMachTagProcessor : a3) {
                if (iBuildMachTagProcessor != null && iBuildMachTagProcessor.getMachTagProcessor(this.b) != null) {
                    this.e.a(iBuildMachTagProcessor.getMachTagProcessor(this.b));
                }
            }
        }
        return this.e;
    }
}
