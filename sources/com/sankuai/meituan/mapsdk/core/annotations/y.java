package com.sankuai.meituan.mapsdk.core.annotations;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class y extends a {
    public static ChangeQuickRedirect k;
    t l;

    public y(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, u uVar) {
        super(eVar, uVar);
        Object[] objArr = {eVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a285b02d8cfb3bb94922b69001cd6059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a285b02d8cfb3bb94922b69001cd6059");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final boolean b() {
        Bitmap bitmap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872dd3909da85dbafbda960c6e062138", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872dd3909da85dbafbda960c6e062138")).booleanValue();
        }
        a();
        if (this.l == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "900e1a4094ca76c45ad84d7655d481c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "900e1a4094ca76c45ad84d7655d481c0");
            } else {
                Bitmap a = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(this.e);
                if (a == null) {
                    a = Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
                }
                BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(a);
                int[] iArr = {0, -((this.c.getIcon() == null || (bitmap = this.c.getIcon().getBitmap()) == null) ? 1 : bitmap.getHeight())};
                a(iArr, a.getWidth(), a.getHeight());
                MarkerOptions offset = new MarkerOptions().position(this.c.getPosition()).icon(fromBitmap).zIndex(this.c.getInfoWindowZIndex()).level(this.c.getInfoWindowLevel()).allowOverlap(this.c.isInfoWindowAllowOverlap()).ignorePlacement(this.c.isInfoWindowIgnorePlacement()).offset(iArr[0], iArr[1]);
                i iVar = this.b.e.f;
                if (iVar != null) {
                    this.l = iVar.b(offset);
                    this.l.b(this.c);
                }
            }
            this.b.c(this.c);
            c();
        }
        if (this.l == null) {
            return false;
        }
        if (this.l.isVisible()) {
            return true;
        }
        this.l.setVisible(true);
        return true;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.a, com.sankuai.meituan.mapsdk.core.annotations.r
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752164595bd753ce3368ac318eff0eb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752164595bd753ce3368ac318eff0eb5");
            return;
        }
        super.a();
        Bitmap a = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(this.e);
        if (a == null) {
            return;
        }
        if (this.l != null) {
            this.l.a(BitmapDescriptorFactory.fromBitmap(a));
        }
        c();
    }

    private void a(@NonNull int[] iArr, int i, int i2) {
        int i3;
        int i4;
        Bitmap bitmap;
        Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4837c63a46100196e7facfb5b22616d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4837c63a46100196e7facfb5b22616d5");
        } else if (this.c == null || i <= 0 || i2 <= 0) {
        } else {
            if (this.c.getIcon() == null || (bitmap = this.c.getIcon().getBitmap()) == null) {
                i3 = 1;
                i4 = 1;
            } else {
                i4 = bitmap.getWidth();
                i3 = bitmap.getHeight();
            }
            iArr[0] = ((int) (i4 * this.c.getScale() * (0.5f - this.c.getAnchorU()))) + this.c.getInfoWindowOffsetX() + this.c.getOffsetX();
            iArr[1] = (-((int) (this.c.getAnchorV() * i3 * this.c.getScale()))) + this.c.getInfoWindowOffsetY() + this.c.getOffsetY();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void c() {
        Bitmap bitmap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5789adf75dcb0830c5f6ed2fa279945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5789adf75dcb0830c5f6ed2fa279945");
        } else if (this.l == null || this.e == null) {
        } else {
            this.f.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = this.e.getMeasuredWidth();
            int measuredHeight = this.e.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            if (this.c != null) {
                this.l.a(this.c.getPosition());
            }
            int[] iArr = {0, -((this.c.getIcon() == null || (bitmap = this.c.getIcon().getBitmap()) == null) ? 1 : bitmap.getHeight())};
            a(iArr, measuredWidth, measuredHeight);
            this.l.a(iArr[0], iArr[1]);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7b7abd83c16a64407563a0674f4f331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7b7abd83c16a64407563a0674f4f331");
        } else if (this.l == null || !this.l.isVisible()) {
        } else {
            this.l.remove();
            this.l = null;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042dd6001c71319c37a1d0d9dc92feb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042dd6001c71319c37a1d0d9dc92feb1");
            return;
        }
        if (this.l != null) {
            this.l.remove();
            this.l = null;
        }
        this.e = null;
        this.d = null;
        this.b.b(this.c);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957644c627ca616e4d282a585756a69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957644c627ca616e4d282a585756a69c");
        } else if (this.l == null) {
        } else {
            this.l.setZIndex(f);
        }
    }
}
