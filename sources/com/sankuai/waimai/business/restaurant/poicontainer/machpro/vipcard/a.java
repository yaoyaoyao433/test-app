package com.sankuai.waimai.business.restaurant.poicontainer.machpro.vipcard;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaUnit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.mach.b;
import com.sankuai.waimai.business.restaurant.poicontainer.mach.c;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.mach.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    private b b;
    private String c;
    private String d;
    private boolean e;
    private long f;
    private final String g;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b733578982754979663d0fd260c7e27", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b733578982754979663d0fd260c7e27");
        }
        this.e = false;
        return new FrameLayout(this.mMachContext.getContext());
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b8ea006e03de886f98c09aab30ec5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b8ea006e03de886f98c09aab30ec5a");
        } else {
            this.g = ((BaseActivity) mPContext.getContext()).w();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        boolean z;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f879ea852ab35e7ca0da3ca09a68fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f879ea852ab35e7ca0da3ca09a68fc");
        } else if (str.equals("machData")) {
            if (obj instanceof MachMap) {
                MachMap machMap = (MachMap) obj;
                Object obj2 = machMap.get("member_template");
                this.f = com.sankuai.waimai.machpro.util.b.c(machMap.get("poi_id"));
                if (obj2 instanceof MachMap) {
                    MachMap machMap2 = (MachMap) obj2;
                    this.c = String.valueOf(machMap2.get("template_id"));
                    this.d = String.valueOf(machMap2.get("template_data"));
                }
            }
            if (this.e) {
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34b6f3af8a161c94699dc97f78c841d1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34b6f3af8a161c94699dc97f78c841d1")).booleanValue();
            } else {
                z = (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) ? false : true;
            }
            if (!z) {
                getView().setVisibility(8);
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2827b1be9636beeb352ddb5819bb2e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2827b1be9636beeb352ddb5819bb2e8");
            } else if (this.b == null) {
                this.b = new b((Activity) this.mMachContext.getContext(), "c_CijEL", this.g, new c.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.vipcard.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.poicontainer.mach.c.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa780b097d76e463938c43beb806a802", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa780b097d76e463938c43beb806a802");
                            return;
                        }
                        float f = a.this.b.l().c.o().d;
                        YogaUnit yogaUnit = a.this.b.l().c.o().e;
                        if (yogaUnit.equals(YogaUnit.POINT)) {
                            a.this.getYogaNode().h(f);
                        } else if (yogaUnit.equals(YogaUnit.PERCENT)) {
                            a.this.getYogaNode().i(f);
                        }
                        a.this.requestLayout();
                        if (a.this.b.w) {
                            a.this.b.b();
                            a.this.b.b = true;
                            return;
                        }
                        a.this.b.b = false;
                    }
                });
                this.b.a(getView(), "restaurant_vip_card", "waimai");
            }
            getView().setVisibility(0);
            try {
                Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(this.d);
                if (a2 != null) {
                    this.e = true;
                    this.b.a(this.c, a2, new a.InterfaceC1053a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.vipcard.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.mach.a.InterfaceC1053a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e0042712bf9d621b28bebb9d6064c954", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e0042712bf9d621b28bebb9d6064c954");
                            } else {
                                a.this.getView().setVisibility(8);
                            }
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("MPVipCard exception = " + e.getMessage());
            }
        } else {
            super.updateAttribute(str, obj);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0943f437dfc6f6b0d1da9fa24d769c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0943f437dfc6f6b0d1da9fa24d769c");
            return;
        }
        super.onAttachToParent();
        getYogaNode().g(100.0f);
        getYogaNode().a(YogaEdge.BOTTOM, 10.0f);
    }
}
