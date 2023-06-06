package com.sankuai.meituan.mapsdk.core.location;

import android.animation.Animator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.annotations.l;
import com.sankuai.meituan.mapsdk.core.c;
import com.sankuai.meituan.mapsdk.core.d;
import com.sankuai.meituan.mapsdk.core.render.model.f;
import com.sankuai.meituan.mapsdk.core.render.model.g;
import com.sankuai.meituan.mapsdk.core.render.model.i;
import com.sankuai.meituan.mapsdk.maps.interfaces.p;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MyLocationStyle;
import com.sankuai.meituan.mapsdk.maps.model.animation.FrameAnimation;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements p {
    public static ChangeQuickRedirect a;
    public f b;
    public f c;
    LatLng d;
    private final c e;
    private d f;
    private List<String> g;
    private float h;
    private com.sankuai.meituan.mapsdk.core.render.model.d i;
    private com.sankuai.meituan.mapsdk.core.render.model.b j;
    private BitmapDescriptor k;
    private l l;
    private Animator m;

    public a(c cVar, @NonNull d dVar) {
        Object[] objArr = {cVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ac73d1e78aa8d5583b01800ea0bbcf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ac73d1e78aa8d5583b01800ea0bbcf");
            return;
        }
        this.g = new ArrayList();
        this.h = 30000.0f;
        this.e = cVar;
        this.f = dVar;
        b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8a7da338af2e36a3909c1337282db9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8a7da338af2e36a3909c1337282db9c");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c64569aa45ed86f29dac8a0bb4b11bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c64569aa45ed86f29dac8a0bb4b11bd1");
        } else {
            this.i = new com.sankuai.meituan.mapsdk.core.render.model.d(this.f.d, "mtmapsdk-location-source", false, i.RenderThread);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "20187e48f7eec7b52ea0a4d4c9cf939c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "20187e48f7eec7b52ea0a4d4c9cf939c");
        } else {
            this.b = this.e.a("mtmapsdk-location-accurancy-layer", this.i);
            if (this.b != null) {
                this.b.a(5001, 0);
                this.b.a(5008, 0);
                this.b.a(30000.0f, g.OrderSymbol);
                this.b.a(false);
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad384a624f1bb1b767c5375d2e650980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad384a624f1bb1b767c5375d2e650980");
        } else {
            this.c = this.e.a("mtmapsdk-location-layer", this.i);
            if (this.c != null) {
                this.c.a(4000, 0);
                this.c.a(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, false);
                this.c.a(MapConstant.LayerPropertyFlag_IconIgnorePlacement, false);
                this.c.a(MapConstant.LayerPropertyFlag_IconAllowOverlap, true);
                this.c.a(MapConstant.LayerPropertyFlag_IconRotate, 0.0f);
                this.c.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 1);
                this.c.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, 0);
                this.c.a(MapConstant.LayerPropertyFlag_IconPadding, 0);
                this.c.a(30000.0f, g.OrderSymbol);
                this.c.a(false);
            }
        }
        a(false);
    }

    private l b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131669900fd4b00f2643bc62a09c6312", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131669900fd4b00f2643bc62a09c6312");
        }
        if (this.l == null && this.f.f != null) {
            this.l = this.f.f.d;
        }
        return this.l;
    }

    public final void a(MyLocationStyle myLocationStyle) {
        Object[] objArr = {myLocationStyle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fc0dbaa2186f6097f296c754958cfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fc0dbaa2186f6097f296c754958cfd");
        } else if (!myLocationStyle.isMyLocationShowing()) {
            a(false);
        } else {
            this.h = com.sankuai.meituan.mapsdk.core.utils.a.d(myLocationStyle.getZIndex());
            if (this.b != null) {
                this.b.a(this.h, g.OrderSymbol);
            }
            if (this.c != null) {
                this.c.a(this.h, g.OrderSymbol);
                this.c.a(MapConstant.LayerPropertyFlag_IconIgnorePlacement, myLocationStyle.isIconIgnorePlacement());
            }
            int a2 = com.sankuai.meituan.mapsdk.core.utils.a.a(com.sankuai.meituan.mapsdk.core.utils.a.c(myLocationStyle.getAnchorU()), com.sankuai.meituan.mapsdk.core.utils.a.c(myLocationStyle.getAnchorV()));
            this.c.a(MapConstant.LayerPropertyFlag_IconAnchor, a2);
            this.b.a(MapConstant.LayerPropertyFlag_IconAnchor, a2);
            this.b.a(5002, com.sankuai.meituan.mapsdk.core.render.b.f(myLocationStyle.isCircleShow() ? myLocationStyle.getRadiusFillColor() : 0));
            this.b.a(5010, com.sankuai.meituan.mapsdk.core.render.b.f(myLocationStyle.isCircleShow() ? myLocationStyle.getStrokeColor() : 0));
            this.b.a(5009, myLocationStyle.isCircleShow() ? myLocationStyle.getStrokeWidth() : 0.0f);
            FrameAnimation frameAnimation = (FrameAnimation) myLocationStyle.getAnimation();
            if (this.m != null) {
                this.m.cancel();
                this.m = null;
            }
            if (frameAnimation != null && frameAnimation.getFrameIcons() != null) {
                if (this.m != null) {
                    this.m.cancel();
                }
                this.m = com.sankuai.meituan.mapsdk.api.model.animation.b.a(this, frameAnimation);
                if (this.m != null) {
                    this.m.start();
                }
            } else {
                setIcon(myLocationStyle.getMyLocationIcon());
            }
            this.b.b(true);
            this.c.b(true);
            a(this.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cde433a1cc5097b4f3391261d6963f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cde433a1cc5097b4f3391261d6963f");
        } else if (b() == null || bitmapDescriptor == null) {
        } else {
            if (this.k == null || !this.k.getId().equals(bitmapDescriptor.getId())) {
                b().a(this.i, bitmapDescriptor, this.k);
                this.c.a(MapConstant.LayerPropertyFlag_IconImage, bitmapDescriptor.getId());
                this.k = bitmapDescriptor;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    @Nullable
    public final BitmapDescriptor getIcon() {
        return this.k;
    }

    public final void a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca531f805bd99eb2640da53270e1bb55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca531f805bd99eb2640da53270e1bb55");
        } else if (this.i == null || latLng == null) {
        } else {
            if (this.j == null) {
                this.j = this.i.c();
            }
            this.j.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, latLng);
            this.j.a("rank", this.h + 100000.0f);
            this.d = latLng;
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeabdce03eceead7ae3c664815895469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeabdce03eceead7ae3c664815895469");
            return;
        }
        if (this.b != null) {
            this.b.b(z);
        }
        if (this.c != null) {
            this.c.b(z);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "299b19ebf2d81024b03466dbad0b7868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "299b19ebf2d81024b03466dbad0b7868");
        } else if (this.c == null || this.b == null || this.i == null) {
        } else {
            if (this.m != null) {
                this.m.cancel();
            }
            if (this.k != null && this.l != null) {
                this.l.b(this.i, this.k);
                this.k = null;
            }
            this.e.a(this.c);
            this.e.a(this.b);
            this.e.a(this.i);
            this.c = null;
            this.b = null;
            this.i = null;
        }
    }
}
