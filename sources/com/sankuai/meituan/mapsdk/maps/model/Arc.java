package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.a;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Arc implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final a a;

    public Arc(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d69173541b5d1131188aa53390c4bc13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d69173541b5d1131188aa53390c4bc13");
        } else {
            this.a = aVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c011118b4ed2e74a9d732545aee9a9e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c011118b4ed2e74a9d732545aee9a9e1");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1886dbf7c166043c5a3bd3f247419c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1886dbf7c166043c5a3bd3f247419c")).intValue();
        }
        if (this.a == null) {
            return 0;
        }
        return this.a.getStrokeColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc9c22c0a325223017b25f783e6ba6c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc9c22c0a325223017b25f783e6ba6c4")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getStrokeWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b179af3cf355bfcf2b6f4f68c8759ff1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b179af3cf355bfcf2b6f4f68c8759ff1")).floatValue();
        }
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92fada8103fc6e5cf9fdd67d18bb82e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92fada8103fc6e5cf9fdd67d18bb82e")).booleanValue() : this.a != null && this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e21c4673546c2a5500938e8110b47bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e21c4673546c2a5500938e8110b47bd");
        } else if (this.a != null) {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "764fa145e1c0ee6d79e95b986870fe68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "764fa145e1c0ee6d79e95b986870fe68");
        } else if (this.a != null) {
            this.a.setStrokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78178bfca0a7dc0d7d961fedd78d4977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78178bfca0a7dc0d7d961fedd78d4977");
        } else if (this.a != null) {
            this.a.setStrokeWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b04775aa4d5ac06f3fefa7e9e1abd7cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b04775aa4d5ac06f3fefa7e9e1abd7cc");
        } else if (this.a != null) {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "925937ef8b8687c270b3e70f2cd4ac3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "925937ef8b8687c270b3e70f2cd4ac3b");
        } else if (this.a != null) {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final float[] getGradientColorPercentage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56d7d87bae2bb27a3780d0b2f9c98e5", RobustBitConfig.DEFAULT_VALUE) ? (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56d7d87bae2bb27a3780d0b2f9c98e5") : this.a == null ? new float[]{0.0f} : this.a.getGradientColorPercentage();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final int[] getGradientColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2a56e1bf7518ed1a42e3c3ff6a405fb", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2a56e1bf7518ed1a42e3c3ff6a405fb") : this.a == null ? new int[]{getStrokeColor()} : this.a.getGradientColors();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final void setGradientColors(float[] fArr, int[] iArr) {
        Object[] objArr = {fArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e427d60a52603e11c344db1b00b3400d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e427d60a52603e11c344db1b00b3400d");
        } else if (this.a == null) {
        } else {
            this.a.setGradientColors(fArr, iArr);
        }
    }

    public final l getMapElement() {
        return this.a;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.a
    public final LatLngBounds getBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d501815bd7324e0f910506b53411321", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d501815bd7324e0f910506b53411321");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.getBounds();
    }
}
