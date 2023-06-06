package com.sankuai.waimai.machpro.component.swiper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.yoga.d;
import com.facebook.yoga.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
import com.sankuai.waimai.machpro.component.view.b;
import com.sankuai.waimai.machpro.component.view.c;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private static a e;
    RecyclerView b;
    public MPViewPager c;

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f737f39180b54ab504557526f768e2fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f737f39180b54ab504557526f768e2fd");
        } else {
            e = this;
        }
    }

    public static a b() {
        a aVar = e;
        e = null;
        return aVar;
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public final c createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2b22a554b990946f78c64e15d1b1bc", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2b22a554b990946f78c64e15d1b1bc") : new C1024a(this.mMachContext.getContext(), this.mYogaNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.machpro.component.swiper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1024a extends c {
        public static ChangeQuickRedirect a;

        public C1024a(Context context, d dVar) {
            super(context, dVar);
            Object[] objArr = {a.this, context, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5dcadd1bbd2c2b65dba421305fc3707", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5dcadd1bbd2c2b65dba421305fc3707");
            }
        }

        @Override // com.sankuai.waimai.machpro.component.view.c, android.view.View
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56cd159881be0654a943451c894e3e3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56cd159881be0654a943451c894e3e3f");
                return;
            }
            try {
                View view = a.this.b;
                if (a.this.c != null) {
                    view = a.this.c;
                }
                if (view != null && this.d.c() == 1) {
                    e m = this.d.a(0).m();
                    if (m.e.e == 2) {
                        this.d.a(0).f((view.getMeasuredWidth() * m.d) / 100.0f);
                    }
                    e o = this.d.a(0).o();
                    if (o.e.e == 2) {
                        this.d.a(0).h((view.getMeasuredHeight() * o.d) / 100.0f);
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("Swiper Measure Child Exception | " + e.getMessage());
            }
            super.onMeasure(i, i2);
        }
    }
}
