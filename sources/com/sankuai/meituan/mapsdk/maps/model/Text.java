package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Typeface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.t;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Text implements t {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final t a;

    public Text(t tVar) {
        Object[] objArr = {tVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05262d9320091c14f92e4b9356f886f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05262d9320091c14f92e4b9356f886f7");
        } else {
            this.a = tVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6c0aa808c51dda59a82b6bd9e5be863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6c0aa808c51dda59a82b6bd9e5be863");
            return;
        }
        try {
            this.a.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01061b168bbbac9cd5f8dae6557d6d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01061b168bbbac9cd5f8dae6557d6d68");
            return;
        }
        try {
            if (this.a != null) {
                this.a.destroy();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869be2e474f88a913a06b448955a14e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869be2e474f88a913a06b448955a14e0") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a347fc8ac87d539d5ce474f51e32490e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a347fc8ac87d539d5ce474f51e32490e");
        } else {
            this.a.setPosition(latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1ada6076cf75a71936dbcb9fc90427f", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1ada6076cf75a71936dbcb9fc90427f") : this.a.getPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e870f5b4fb44a82eb6cab56379c86c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e870f5b4fb44a82eb6cab56379c86c0a");
        } else {
            this.a.setText(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34e1ce5dc9bf7bd16b663608738e298f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34e1ce5dc9bf7bd16b663608738e298f") : this.a.getText();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b0094c56c6d6fb62dbb0953e99387b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b0094c56c6d6fb62dbb0953e99387b1");
        } else {
            this.a.setBackgroundColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getBackgroundColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d079f1aaa1d2a08c427629009ed888b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d079f1aaa1d2a08c427629009ed888b")).intValue() : this.a.getBackgroundColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f84f14dd88791082939960cc13f3ac39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f84f14dd88791082939960cc13f3ac39");
        } else {
            this.a.setFontColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "063bc4ccbd3ae755c74f3e38aa1ade76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "063bc4ccbd3ae755c74f3e38aa1ade76")).intValue() : this.a.getFontColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db5b2014419f165b011764f1d070cc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db5b2014419f165b011764f1d070cc6d");
        } else {
            this.a.setFontSize(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ee14f82c4b730cbe2cca9a80786dde9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ee14f82c4b730cbe2cca9a80786dde9")).intValue() : this.a.getFontSize();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad4faf11dccc7e8dff8de90f052bdc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad4faf11dccc7e8dff8de90f052bdc8");
        } else {
            this.a.setTypeface(typeface);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final Typeface getTypeface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c884c8c92a1f1c2bbbb87540e8e3d1", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c884c8c92a1f1c2bbbb87540e8e3d1") : this.a.getTypeface();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setAlign(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32da46466c52f9a25d922302f3dd3496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32da46466c52f9a25d922302f3dd3496");
        } else {
            this.a.setAlign(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignXValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34038d0dedf64557c125306ea288f2c8", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34038d0dedf64557c125306ea288f2c8")).floatValue() : this.a.getAlignXValue();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignYValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8349fffc2a4c363210a80c94e05b3c29", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8349fffc2a4c363210a80c94e05b3c29")).floatValue() : this.a.getAlignYValue();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f63342f7727657ac3860391a5fe6e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f63342f7727657ac3860391a5fe6e5e");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a01f820f87024075fa563689fcc6f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a01f820f87024075fa563689fcc6f9")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e5197596c7dfca88825bdb609f93024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e5197596c7dfca88825bdb609f93024");
        } else {
            this.a.setObject(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final Object getObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2da6dd3e84d5a29696d01d7a0e9a8ff", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2da6dd3e84d5a29696d01d7a0e9a8ff") : this.a.getObject();
    }

    public final void setRotate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "787db819dfe9596b670aa068ab4e1a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "787db819dfe9596b670aa068ab4e1a65");
        } else {
            this.a.setRotateAngle(f);
        }
    }

    public final float getRotate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ec4c20f0c5a791e1229c8eb77a846cb", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ec4c20f0c5a791e1229c8eb77a846cb")).floatValue() : this.a.getRotateAngle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b23cb18a9b62562fa83b305735ba2c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b23cb18a9b62562fa83b305735ba2c8");
        } else {
            this.a.setRotateAngle(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final float getRotateAngle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f420d272f9e067d64ae1be41477c41db", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f420d272f9e067d64ae1be41477c41db")).floatValue() : this.a.getRotateAngle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94335c3937e379f7a930aa8a1b78542b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94335c3937e379f7a930aa8a1b78542b");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3afa6f3db2d6d3f45dc0d470b13a967c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3afa6f3db2d6d3f45dc0d470b13a967c")).floatValue() : this.a.getZIndex();
    }

    @Deprecated
    public final void setAlign(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5ee292145d2277e2221e9f77b0538c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5ee292145d2277e2221e9f77b0538c5");
        } else {
            this.a.setAlign(i, i2);
        }
    }

    @Deprecated
    public final int getAlignX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2993fcf8b90f04acf761df44e2517809", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2993fcf8b90f04acf761df44e2517809")).intValue() : (int) this.a.getAlignXValue();
    }

    @Deprecated
    public final int getAlignY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f8d23700323f763c5489bba17f6cf28", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f8d23700323f763c5489bba17f6cf28")).intValue() : (int) this.a.getAlignYValue();
    }
}
