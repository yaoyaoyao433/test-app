package com.sankuai.waimai.business.page.home.list.future.mach;

import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.mach.component.base.a {
    public static ChangeQuickRedirect a;
    RatingBar b;
    private float c;
    private YogaMeasureFunction d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49685513ebc404032043ecd93d320d12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49685513ebc404032043ecd93d320d12");
        } else {
            this.d = new YogaMeasureFunction() { // from class: com.sankuai.waimai.business.page.home.list.future.mach.e.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.yoga.YogaMeasureFunction
                public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                    Object[] objArr2 = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a14bb2966a150809441e132860804daf", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a14bb2966a150809441e132860804daf")).longValue();
                    }
                    e.this.b.measure(View.MeasureSpec.makeMeasureSpec(yogaMeasureMode.d, (int) f), View.MeasureSpec.makeMeasureSpec(yogaMeasureMode2.d, (int) f2));
                    return com.facebook.yoga.c.a(e.this.b.getMeasuredWidth(), e.this.b.getMeasuredHeight());
                }
            };
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "591d4d98ee8251d471de612e6f6f095e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RatingBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "591d4d98ee8251d471de612e6f6f095e");
        }
        this.b = new RatingBar(context, null, 0, 2131559121);
        this.b.setRating((this.c / 10.0f) * 5.0f);
        return this.b;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594a59212ced8d8f5f52f054f54bd36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594a59212ced8d8f5f52f054f54bd36c");
            return;
        }
        String a2 = a("score");
        if (i(a2)) {
            this.c = Float.parseFloat(a2);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final com.facebook.yoga.d ac_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca819f603a20c47c92f343adb071969", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.facebook.yoga.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca819f603a20c47c92f343adb071969");
        }
        com.facebook.yoga.d ac_ = super.ac_();
        ac_.a(this.d);
        return ac_;
    }
}
