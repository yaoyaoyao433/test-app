package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.b;
import com.sankuai.meituan.mapsdk.maps.model.ArrowOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Arrow implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final b a;

    public Arrow(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5283e69cf18176b526a7642da160ec2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5283e69cf18176b526a7642da160ec2");
        } else {
            this.a = bVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2979fc8d3d6bc516b2adc24b3bc9909", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2979fc8d3d6bc516b2adc24b3bc9909") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "459e2b35df55de434c5ae8416e00c365", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "459e2b35df55de434c5ae8416e00c365") : this.a.getPoints();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46bd805d5abd64495f842d585f00a77e", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46bd805d5abd64495f842d585f00a77e")).floatValue() : this.a.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27892334246a9ff66612944000905fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27892334246a9ff66612944000905fb2");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setPoints(List<LatLng> list, float f) {
        Object[] objArr = {list, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "319f3e1ced726b7c1022ee075d5edba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "319f3e1ced726b7c1022ee075d5edba6");
        } else {
            this.a.setPoints(list, f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public int getTopSurfaceColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d19ad7a3d8d70741b29a76b341194169", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d19ad7a3d8d70741b29a76b341194169")).intValue() : this.a.getTopSurfaceColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setTopSurfaceColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6139620f592ff685aa7a7ef109b5d510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6139620f592ff685aa7a7ef109b5d510");
        } else {
            this.a.setTopSurfaceColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public int getOutlineColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbda3c0e89dfcaf629747e0675de6d45", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbda3c0e89dfcaf629747e0675de6d45")).intValue() : this.a.getOutlineColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setOutlineColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51442086d3ca0abd8829c5fd92be77f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51442086d3ca0abd8829c5fd92be77f1");
        } else {
            this.a.setOutlineColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getOutlineWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c202d69a43cf33b2d607a3186addd9a0", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c202d69a43cf33b2d607a3186addd9a0")).floatValue() : this.a.getOutlineWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setOutlineWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "972f2d86d920232f456ee8ef37fb304c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "972f2d86d920232f456ee8ef37fb304c");
        } else {
            this.a.setOutlineWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public int getColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e7bf1c1c10e722f0eca425d5410bf8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e7bf1c1c10e722f0eca425d5410bf8")).intValue() : this.a.getColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da0d46f65db4331926da566afc3dcf20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da0d46f65db4331926da566afc3dcf20");
        } else {
            this.a.setColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba1984afe527e2e3e62c9ad475f8ee6c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba1984afe527e2e3e62c9ad475f8ee6c")).floatValue() : this.a.getHeight();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setHeight(float f, ArrowOptions.HeightUnit heightUnit) {
        Object[] objArr = {Float.valueOf(f), heightUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77c4951e5ab746cfa4cdc86e2a61696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77c4951e5ab746cfa4cdc86e2a61696");
        } else {
            this.a.setHeight(f, heightUnit);
        }
    }

    public ArrowOptions.HeightUnit getUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46e4d0d897374424d8d1f1b4a80d5bbc", RobustBitConfig.DEFAULT_VALUE) ? (ArrowOptions.HeightUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46e4d0d897374424d8d1f1b4a80d5bbc") : this.a.getHeightUnit();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public ArrowOptions.HeightUnit getHeightUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51c54068c89df4f8fec07d649bda4a0e", RobustBitConfig.DEFAULT_VALUE) ? (ArrowOptions.HeightUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51c54068c89df4f8fec07d649bda4a0e") : this.a.getHeightUnit();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getMinPitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a271361393cf9ebd557c8df95b35df99", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a271361393cf9ebd557c8df95b35df99")).floatValue() : this.a.getMinPitch();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setMinPitch(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f38af91cc4762a37b94650da14a595ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f38af91cc4762a37b94650da14a595ba");
        } else {
            this.a.setMinPitch(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27499b3a565b6347bab2f46332c83028", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27499b3a565b6347bab2f46332c83028")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fd73a5396bacf7d7249a8faae6da80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fd73a5396bacf7d7249a8faae6da80d");
        } else {
            this.a.setZIndex(f);
        }
    }

    public float getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f3484bf624b1c6335ca1b2370c1a9ee", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f3484bf624b1c6335ca1b2370c1a9ee")).floatValue() : this.a.getAlpha();
    }

    public void setOpacity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c064b75f19d459a2faef32856b0fd72d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c064b75f19d459a2faef32856b0fd72d");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98d4bcf44d2f7af352ea682c9345aa10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98d4bcf44d2f7af352ea682c9345aa10");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public Object getObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc2879bcd48c46679d20fb205b57640", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc2879bcd48c46679d20fb205b57640") : this.a.getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f235872fac8fe8ff4de442951fe396b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f235872fac8fe8ff4de442951fe396b9");
        } else {
            this.a.setObject(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "006a1d39be25c21012485eb5eed969d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "006a1d39be25c21012485eb5eed969d0")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cd7012873b1b86f117fd985d94eb94a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cd7012873b1b86f117fd985d94eb94a");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getMaxZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aed8999d6af1803184539cebc27d8f9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aed8999d6af1803184539cebc27d8f9")).floatValue() : this.a.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "761bcd779c47cc017e258f27143fadcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "761bcd779c47cc017e258f27143fadcf");
        } else {
            this.a.setMaxZoomLevel(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public float getMinZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85e5449638c4891474232cc0a81b0b65", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85e5449638c4891474232cc0a81b0b65")).floatValue() : this.a.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da92f1d2af8564184adc1fd70d563de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da92f1d2af8564184adc1fd70d563de0");
        } else {
            this.a.setMinZoomLevel(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public boolean is3DModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8808bf98266cb6319f65b12e221b1897", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8808bf98266cb6319f65b12e221b1897")).booleanValue() : this.a.is3DModel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.b
    public void set3DModel(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "126d5c272ad2255e4debb512a53b9afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "126d5c272ad2255e4debb512a53b9afc");
        } else {
            this.a.set3DModel(z);
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85590a3f32d4e705a2bb9931966b8338", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85590a3f32d4e705a2bb9931966b8338")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Arrow) obj).a);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc2f3b5c59c52455724ee220a962f696", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc2f3b5c59c52455724ee220a962f696")).intValue() : this.a.hashCode();
    }
}
