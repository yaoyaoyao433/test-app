package com.sankuai.meituan.mapsdk.tencentadapter;

import android.graphics.Typeface;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.TextOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p implements com.sankuai.meituan.mapsdk.maps.interfaces.t {
    public static ChangeQuickRedirect a;
    private Marker b;
    private TextOptions c;
    private TextView d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignXValue() {
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final float getAlignYValue() {
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final float getRotateAngle() {
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setAlign(float f, float f2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setRotateAngle(float f) {
    }

    public p(Marker marker, TextOptions textOptions, TextView textView) {
        Object[] objArr = {marker, textOptions, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f2ca72a6e34d83224e8a943c0460c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f2ca72a6e34d83224e8a943c0460c6");
            return;
        }
        this.b = marker;
        this.d = textView;
        this.c = textOptions;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e021ea0efea2bf64ff9f8baed484a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e021ea0efea2bf64ff9f8baed484a90");
            return;
        }
        this.c.text(str);
        this.d.setText(str);
        a();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7eecd84790160206cdb99a98779a0e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7eecd84790160206cdb99a98779a0e") : this.c.getText();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c76f8c24db1342f0c4ed159f95969b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c76f8c24db1342f0c4ed159f95969b8");
            return;
        }
        this.c.backgroundColor(i);
        this.d.setBackgroundColor(i);
        a();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getBackgroundColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73d2eacf9cf68195c46529c1c633538", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73d2eacf9cf68195c46529c1c633538")).intValue() : this.c.getBackgroundColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d5349207c2751025564f1ee9e37d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d5349207c2751025564f1ee9e37d1c");
            return;
        }
        this.c.fontColor(i);
        this.d.setTextColor(i);
        a();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0678bf418bb9f3a3c0a9d0e88c8e4396", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0678bf418bb9f3a3c0a9d0e88c8e4396")).intValue() : this.c.getFontColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d0dbd0f9c75adb74373707107075d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d0dbd0f9c75adb74373707107075d6");
            return;
        }
        this.c.fontSize(i);
        this.d.setTextSize(i);
        a();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final int getFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f354cc4733b5499972e38f3a34d721", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f354cc4733b5499972e38f3a34d721")).intValue() : this.c.getFontSize();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39fb307fd9f21b48e127045333f100d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39fb307fd9f21b48e127045333f100d");
            return;
        }
        this.c.typeface(typeface);
        this.d.setTypeface(typeface);
        a();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.t
    public final Typeface getTypeface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f564775316754c50ac9acfb3015b5b7a", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f564775316754c50ac9acfb3015b5b7a") : this.c.getTypeface();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1864c3e08fa0da46129631ea9d6984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1864c3e08fa0da46129631ea9d6984");
        } else {
            this.b.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b35d1373b314cb9622b81091c73f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b35d1373b314cb9622b81091c73f43");
        } else {
            this.b.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6869d1b5028a25a51251a614987354ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6869d1b5028a25a51251a614987354ff");
            return;
        }
        this.c.zIndex(f);
        this.b.setZIndex(f);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf93a80084fc21778d9442e641a626b7", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf93a80084fc21778d9442e641a626b7")).floatValue() : this.b.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0412f32a70d6a078909e6d842bf5aa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0412f32a70d6a078909e6d842bf5aa") : this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e12059f9ebca1f21dd1ac705b91c23", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e12059f9ebca1f21dd1ac705b91c23") : this.c.getPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd375d324265f1a04e4340192b9e5a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd375d324265f1a04e4340192b9e5a55");
            return;
        }
        try {
            this.c.position(latLng);
            this.b.setPosition(b.a(latLng));
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbdc1a5e8aaf505a9f3cd7a8cb24b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbdc1a5e8aaf505a9f3cd7a8cb24b75");
            return;
        }
        this.c.visible(z);
        this.b.setVisible(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084a2151cd36003ce45ca848b1c70d02", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084a2151cd36003ce45ca848b1c70d02")).booleanValue() : this.b.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e499076d82ef017fae1dac7416a5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e499076d82ef017fae1dac7416a5fe");
        } else {
            this.b.setTag(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.o
    public final Object getObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d4d52d11c3bfb04161e9f31b1d8a6f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d4d52d11c3bfb04161e9f31b1d8a6f") : this.b.getTag();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed2bfd6daaade729ef17d811ce472a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed2bfd6daaade729ef17d811ce472a2");
            return;
        }
        MarkerOptions markerOptions = new MarkerOptions(b.a(this.c.getPosition()));
        markerOptions.icon(BitmapDescriptorFactory.fromView(this.d));
        markerOptions.visible(this.c.isVisible());
        this.b.setMarkerOptions(markerOptions);
    }
}
