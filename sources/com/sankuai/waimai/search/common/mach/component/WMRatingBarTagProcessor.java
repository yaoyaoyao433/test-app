package com.sankuai.waimai.search.common.mach.component;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ITagProcessor;
import com.sankuai.waimai.mach.parser.d;
import java.util.LinkedList;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRatingBarTagProcessor implements ITagProcessor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @Nonnull
    public String getTagName() {
        return "wm-rating-bar";
    }

    @Override // com.sankuai.waimai.mach.ITagProcessor
    @Nonnull
    public com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce51dfde0a6ee2aef909cc45ff4e2ab", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce51dfde0a6ee2aef909cc45ff4e2ab") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.mach.component.base.a<RatingBar> {
        public static ChangeQuickRedirect a;
        public RatingBar b;
        public float c;
        public int d;
        d e;
        float f;
        private YogaMeasureFunction g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f454cf968250541e5698a6b2ec11cdd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f454cf968250541e5698a6b2ec11cdd4");
            } else {
                this.g = new YogaMeasureFunction() { // from class: com.sankuai.waimai.search.common.mach.component.WMRatingBarTagProcessor.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.facebook.yoga.YogaMeasureFunction
                    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
                        Object[] objArr2 = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c1e08543da6dcd2628508df55e05b0c", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c1e08543da6dcd2628508df55e05b0c")).longValue();
                        }
                        a.this.b.measure(View.MeasureSpec.makeMeasureSpec(yogaMeasureMode.d, (int) f), View.MeasureSpec.makeMeasureSpec(yogaMeasureMode2.d, (int) f2));
                        return c.a(a.this.b.getMeasuredWidth(), a.this.b.getMeasuredHeight());
                    }
                };
            }
        }

        @Override // com.sankuai.waimai.mach.component.base.a
        public final /* synthetic */ RatingBar b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff17677bfb768274ad476d9f2ab770e", RobustBitConfig.DEFAULT_VALUE)) {
                return (RatingBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff17677bfb768274ad476d9f2ab770e");
            }
            this.b = new RatingBar(context, null, 0, 2131559118);
            this.b.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.b.setRating(this.c);
            this.b.setStepSize(1.0f);
            this.b.setNumStars(this.d);
            this.b.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.sankuai.waimai.search.common.mach.component.WMRatingBarTagProcessor.a.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                    Object[] objArr2 = {ratingBar, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "feb5240de6ba126b51e8ddba77903303", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "feb5240de6ba126b51e8ddba77903303");
                    } else if (z) {
                        a aVar = a.this;
                        Object[] objArr3 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0aadbd90a79f0e4b2571a389ce3a6577", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0aadbd90a79f0e4b2571a389ce3a6577");
                        } else if (aVar.m == null || aVar.e == null) {
                        } else {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(Float.valueOf(aVar.f));
                            linkedList.add(Float.valueOf(f));
                            aVar.m.asyncCallJSMethod(aVar.e.b, linkedList);
                        }
                    }
                }
            });
            return this.b;
        }

        @Override // com.sankuai.waimai.mach.component.base.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a4bf2be5760342f747b9d2c5d918b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a4bf2be5760342f747b9d2c5d918b8");
                return;
            }
            String a2 = a("value");
            String a3 = a("index");
            String a4 = a("number-stars");
            if (k() != null && (k().get("@rating-changed") instanceof d)) {
                this.e = (d) k().get("@rating-changed");
            }
            if (i(a2)) {
                this.c = Float.parseFloat(a2);
            }
            if (i(a3)) {
                this.f = Float.parseFloat(a3);
            }
            if (i(a4)) {
                this.d = Integer.parseInt(a4);
            }
        }

        @Override // com.sankuai.waimai.mach.component.base.a
        public final com.facebook.yoga.d ac_() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf066429dd019b9cbb91197cb9d37dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.facebook.yoga.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf066429dd019b9cbb91197cb9d37dc");
            }
            com.facebook.yoga.d ac_ = super.ac_();
            ac_.a(this.g);
            return ac_;
        }
    }
}
