package com.sankuai.meituan.mapsdk.tencentadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements com.sankuai.meituan.mapsdk.maps.interfaces.a {
    public static ChangeQuickRedirect a;
    private Arc b;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final LatLngBounds getBounds() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setGradientColors(float[] fArr, int[] iArr) {
    }

    public d(Arc arc) {
        Object[] objArr = {arc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b148b9d452a05ee1c3c5c5a4f9bce28f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b148b9d452a05ee1c3c5c5a4f9bce28f");
        } else {
            this.b = arc;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512324f37bdfbfe2efbcc4f750780d71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512324f37bdfbfe2efbcc4f750780d71");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f409a58960fe77215c687d498dab7761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f409a58960fe77215c687d498dab7761")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.getColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ad930f5b499c45fe62d423b349446b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ad930f5b499c45fe62d423b349446b")).floatValue();
        }
        if (this.b == null) {
            return 0.0f;
        }
        return this.b.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574530966756aa991fe3bee980aab233", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574530966756aa991fe3bee980aab233")).floatValue();
        }
        if (this.b == null) {
            return 0.0f;
        }
        return this.b.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ae64307723f3e96625124f72ab8b06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ae64307723f3e96625124f72ab8b06")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d8355c0ccd0cb6f55ea03286f4fa52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d8355c0ccd0cb6f55ea03286f4fa52");
        } else if (this.b == null) {
        } else {
            this.b.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa009f98c0bf96ddcd7898cbaff6e085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa009f98c0bf96ddcd7898cbaff6e085");
        } else if (this.b == null) {
        } else {
            this.b.setColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d2ce7ba28ef867186c348875ce7628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d2ce7ba28ef867186c348875ce7628");
        } else if (this.b == null) {
        } else {
            this.b.setWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final float[] getGradientColorPercentage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0d53645b00246c7a036e0099028ddd", RobustBitConfig.DEFAULT_VALUE) ? (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0d53645b00246c7a036e0099028ddd") : new float[]{0.0f};
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final int[] getGradientColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b5bc69607cdbed1ac8ba1c22deaed0", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b5bc69607cdbed1ac8ba1c22deaed0") : new int[]{getStrokeColor()};
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11433a5a33c0da762efa843db78ccca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11433a5a33c0da762efa843db78ccca1");
        } else if (this.b == null) {
        } else {
            this.b.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e54a09bb3922c7dee8a51f45bdce8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e54a09bb3922c7dee8a51f45bdce8c");
        } else if (this.b == null) {
        } else {
            this.b.setZIndex((int) f);
        }
    }
}
