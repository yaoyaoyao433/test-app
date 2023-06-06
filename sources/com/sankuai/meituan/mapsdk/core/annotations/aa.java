package com.sankuai.meituan.mapsdk.core.annotations;

import android.graphics.Point;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class aa extends a {
    public static ChangeQuickRedirect k;

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void a(float f) {
    }

    public aa(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, u uVar) {
        super(eVar, uVar);
        Object[] objArr = {eVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfeffd9378be5f1fa4e5ecd77aa4f5aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfeffd9378be5f1fa4e5ecd77aa4f5aa");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.a, com.sankuai.meituan.mapsdk.core.annotations.r
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4134ac445f9b20627beb967a1274c294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4134ac445f9b20627beb967a1274c294");
            return;
        }
        super.a();
        com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.annotations.aa.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75107084f63d4f1dd7d2c2ce0acdc8ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75107084f63d4f1dd7d2c2ce0acdc8ee");
                } else if (aa.this.d.get() != null) {
                    aa.this.d.get().addView(aa.this.e, new FrameLayout.LayoutParams(aa.this.f.getMeasuredWidth(), aa.this.f.getMeasuredHeight()));
                    aa.this.c();
                }
            }
        });
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef29c632014a433ee8dd3561ff44247c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef29c632014a433ee8dd3561ff44247c")).booleanValue();
        }
        a();
        if (this.f != null) {
            this.b.c(this.c);
            this.h = true;
        }
        return this.h;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f5cc459ab4326d83c5ab64cb5b58c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f5cc459ab4326d83c5ab64cb5b58c5");
        } else if (this.e != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k;
            float[] fArr = null;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9776fb82d068515710d6ec1c976e2d55", RobustBitConfig.DEFAULT_VALUE)) {
                fArr = (float[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9776fb82d068515710d6ec1c976e2d55");
            } else {
                LatLng position = this.c.getPosition();
                if (position != null && this.f != null) {
                    Point screenLocation = (this.b.e == null || this.b.e == null || this.b.e.getProjection() == null) ? null : this.b.e.getProjection().toScreenLocation(position);
                    if (screenLocation != null) {
                        int infoWindowOffsetX = this.c.getInfoWindowOffsetX() + this.c.getOffsetX();
                        int infoWindowOffsetY = this.c.getInfoWindowOffsetY() + this.c.getOffsetY();
                        this.f.measure(0, 0);
                        BitmapDescriptor icon = this.c.getIcon();
                        if (icon == null && this.c.i().length != 0) {
                            icon = this.c.i()[0];
                        }
                        fArr = icon == null ? new float[]{0.5f, 1.0f} : new float[]{(screenLocation.x - (this.f.getMeasuredWidth() / 2.0f)) + (icon.getWidth() * (0.5f - this.c.getAnchorU()) * this.c.getScale()) + infoWindowOffsetX, ((screenLocation.y - this.f.getMeasuredHeight()) - ((icon.getHeight() * this.c.getAnchorV()) * this.c.getScale())) + infoWindowOffsetY};
                    }
                }
            }
            if (fArr != null) {
                this.e.setX(fArr[0]);
                this.e.setY(fArr[1]);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ec4b28d82e43658d398a68c82c5b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ec4b28d82e43658d398a68c82c5b99");
        } else if (this.h) {
            this.h = false;
            if (this.e == null || this.f == null || this.e == null || this.d.get() == null) {
                return;
            }
            this.e.removeView(this.f);
            this.d.get().removeView(this.e);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa51fcf6f14e210a27b232863a698079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa51fcf6f14e210a27b232863a698079");
            return;
        }
        d();
        this.e = null;
        this.d = null;
        this.b.b(this.c);
    }
}
