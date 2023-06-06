package com.sankuai.meituan.mapsdk.core.annotations;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.LocalGlyphRasterizer;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.TextOptions;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class z extends c implements com.sankuai.meituan.mapsdk.maps.interfaces.t {
    public static ChangeQuickRedirect b;
    private static final float c = Resources.getSystem().getDisplayMetrics().density;
    private float A;
    private String B;
    private String d;
    private int e;
    private int f;
    private int g;
    private float h;
    private float y;
    private LatLng z;

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final /* bridge */ /* synthetic */ float getAlpha() {
        return super.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ String getId() {
        return super.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMaxZoomLevel() {
        return super.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMinZoomLevel() {
        return super.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object getObject() {
        return super.getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ float getZIndex() {
        return super.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean isClickable() {
        return super.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ boolean isVisible() {
        return super.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final /* bridge */ /* synthetic */ void setClickable(boolean z) {
        super.setClickable(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMaxZoomLevel(float f) {
        super.setMaxZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMinZoomLevel(float f) {
        super.setMinZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setObject(Object obj) {
        super.setObject(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ void setVisible(boolean z) {
        super.setVisible(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ void setZIndex(float f) {
        super.setZIndex(f);
    }

    public z(g gVar, TextOptions textOptions) {
        super(gVar);
        Object[] objArr = {gVar, textOptions};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "587a9f2ff34b50fc2174deed4548318f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "587a9f2ff34b50fc2174deed4548318f");
            return;
        }
        this.B = c();
        String str = "";
        if (textOptions == null) {
            str = "TextOptions is null";
        } else if (textOptions.getPosition() == null) {
            str = "TextOptions has no position";
        } else if (TextUtils.isEmpty(textOptions.getText())) {
            str = "TextOptions has no text";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        this.s.a(false);
        this.s.a(MapConstant.LayerPropertyFlag_TextMaxWidth, 1080.0f);
        this.s.a(MapConstant.LayerPropertyFlag_TextAllowOverlap, true);
        this.s.a(MapConstant.LayerPropertyFlag_TextBgName, "yuanjiao1_sdf");
        this.s.a(MapConstant.LayerPropertyFlag_TextBgPadding, new float[]{0.0f, 5.0f, 0.0f, 5.0f});
        setFontColor(textOptions.getFontColor());
        setFontSize(textOptions.getFontSize());
        setBackgroundColor(textOptions.getBackgroundColor());
        setText(textOptions.getText());
        setVisible(textOptions.isVisible());
        setObject(textOptions.getObject());
        setPosition(textOptions.getPosition());
        setZIndex(textOptions.getZIndex());
        setRotateAngle(textOptions.getRotate());
        setTypeface(textOptions.getTypeface());
        setAlign(textOptions.getAlignX(), textOptions.getAlignY());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final String getText() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d869b20114941d19a120a224b4c4882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d869b20114941d19a120a224b4c4882");
        } else if (f() || TextUtils.isEmpty(str)) {
        } else {
            this.d = str;
            this.s.a(MapConstant.LayerPropertyFlag_TextField, this.d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getBackgroundColor() {
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b100d6f6922f505e482560ded63d337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b100d6f6922f505e482560ded63d337");
        } else if (f()) {
        } else {
            this.f = i;
            this.s.a(MapConstant.LayerPropertyFlag_TextBgColor, com.sankuai.meituan.mapsdk.core.render.b.f(this.f));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontColor() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1bfa138f4bcd5a11f0405a70f2243f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1bfa138f4bcd5a11f0405a70f2243f");
        } else if (f()) {
        } else {
            this.e = i;
            this.s.a(MapConstant.LayerPropertyFlag_TextColor, com.sankuai.meituan.mapsdk.core.render.b.f(this.e));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontSize() {
        return this.g;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5181a77aeb3931f71415267b13cbbe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5181a77aeb3931f71415267b13cbbe4");
        } else if (f()) {
        } else {
            if (i > 50) {
                i = 50;
            }
            this.g = i;
            this.s.a(MapConstant.LayerPropertyFlag_TextSize, this.g);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignXValue() {
        return this.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignYValue() {
        return this.y;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final LatLng getPosition() {
        return this.z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08eb1ec8aa7dc67ac0ca33b1a2bdf0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08eb1ec8aa7dc67ac0ca33b1a2bdf0b");
        } else if (f() || latLng == null) {
        } else {
            this.z = latLng;
            this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, this.z);
            this.s.a(4000, 0);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final Typeface getTypeface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3d3841a612d48e4101e927accf571f", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3d3841a612d48e4101e927accf571f") : LocalGlyphRasterizer.getTypeface(this.B);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setAlign(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb41d850f8ed5c5b4c3caf4a62bdc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb41d850f8ed5c5b4c3caf4a62bdc9f");
        } else if (f()) {
        } else {
            this.h = f;
            this.y = f2;
            this.s.a(MapConstant.LayerPropertyFlag_TextAnchor, com.sankuai.meituan.mapsdk.core.utils.a.a(this.h / this.j.c.b(), this.y / this.j.c.c()));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e59e07ef1052780302942452fb36ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e59e07ef1052780302942452fb36ed");
        } else if (f() || typeface == null) {
        } else {
            LocalGlyphRasterizer.removeTypeface(this.B);
            this.B = c();
            LocalGlyphRasterizer.putTypeface(this.B, typeface);
            this.s.a(MapConstant.LayerPropertyFlag_TextFont, this.B);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final float getRotateAngle() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897e6089e2e17dd8420ffe22e14ed6b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897e6089e2e17dd8420ffe22e14ed6b6");
        } else if (f()) {
        } else {
            while (f < 0.0f) {
                f += 360.0f;
            }
            this.A = f % 360.0f;
            this.s.a(MapConstant.LayerPropertyFlag_TextRotate, this.A);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c107be3aeecc49a633f5442c13943f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c107be3aeecc49a633f5442c13943f2");
        } else if (f()) {
        } else {
            super.remove();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (f()) {
                    return;
                }
                LocalGlyphRasterizer.removeTypeface(this.B);
                return;
            }
            LocalGlyphRasterizer.removeTypeface(this.B);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac53df90cc487c341f31d24618fa1d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac53df90cc487c341f31d24618fa1d26");
        } else {
            remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1889c42e8a812e18e183c6601b02d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1889c42e8a812e18e183c6601b02d7");
        } else if (f()) {
        } else {
            super.setAlpha(f);
            this.s.a(MapConstant.LayerPropertyFlag_TextOpacity, this.v);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final Object b() {
        return this.r;
    }
}
