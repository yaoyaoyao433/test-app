package com.meituan.android.mrn.component.map.view.childview;

import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Arc;
import com.sankuai.meituan.mapsdk.maps.model.ArcOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* loaded from: classes2.dex */
public final class i extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public MTMap b;
    public Arc c;
    private LatLng d;
    private LatLng e;
    private LatLng f;
    private float g;
    private int h;
    private float i;
    private boolean j;
    private int k;

    public i(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad573c15bb9275d91981f0659d5620e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad573c15bb9275d91981f0659d5620e");
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 10.0f;
        this.h = -1;
        this.i = 0.0f;
        this.j = true;
        this.k = 0;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffc2d43cd949852b0653530d414fab7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffc2d43cd949852b0653530d414fab7f");
        } else if (this.b == null || this.c != null) {
        } else {
            this.c = this.b.addArcEnhance(new ArcOptions(this.d, this.e, this.f).strokeWidth(this.g).strokeColor(this.h).level(this.k).zIndex(this.i).visible(this.j));
            if (this.c == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! Arc is null :" + this), "other");
            }
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f1e39fcbe7dbfd376ce91580ab71de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f1e39fcbe7dbfd376ce91580ab71de");
        } else if (this.c != null) {
            this.c.remove();
            this.c = null;
            this.b = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f4c1414fbbc76d5288667e9200c111", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f4c1414fbbc76d5288667e9200c111");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getMapElement();
    }

    public final void setLevel(int i) {
        this.k = i;
    }

    public final void setPoints(ReadableMap readableMap) {
        IllegalArgumentException illegalArgumentException;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e789b4cac0db6e2ca15250ff2c9e8209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e789b4cac0db6e2ca15250ff2c9e8209");
        } else if (readableMap == null) {
        } else {
            this.d = com.meituan.android.mrn.component.map.utils.f.d;
            this.e = com.meituan.android.mrn.component.map.utils.f.d;
            this.f = com.meituan.android.mrn.component.map.utils.f.d;
            if (readableMap.hasKey(LinearGradientManager.PROP_START_POS)) {
                LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableMap.getMap(LinearGradientManager.PROP_START_POS));
                if (b == null) {
                    illegalArgumentException = new IllegalArgumentException("MRNArc must has startPoint");
                } else if (b.isValid()) {
                    this.d = b;
                } else {
                    illegalArgumentException = new IllegalArgumentException("MRNArc startPoint coordinate is invalid");
                }
                com.meituan.android.mrn.component.map.utils.e.a(illegalArgumentException, "param");
                return;
            }
            if (readableMap.hasKey("passedPoint")) {
                LatLng b2 = com.meituan.android.mrn.component.map.utils.a.b(readableMap.getMap("passedPoint"));
                if (b2 == null) {
                    illegalArgumentException = new IllegalArgumentException("MRNArc must has passedPoint");
                } else if (b2.isValid()) {
                    this.e = b2;
                } else {
                    illegalArgumentException = new IllegalArgumentException("MRNArc passedPoint coordinate is invalid");
                }
                com.meituan.android.mrn.component.map.utils.e.a(illegalArgumentException, "param");
                return;
            }
            if (readableMap.hasKey(LinearGradientManager.PROP_END_POS)) {
                LatLng b3 = com.meituan.android.mrn.component.map.utils.a.b(readableMap.getMap(LinearGradientManager.PROP_END_POS));
                if (b3 == null) {
                    illegalArgumentException = new IllegalArgumentException("MRNArc must has passedPoint");
                } else if (b3.isValid()) {
                    this.f = b3;
                } else {
                    illegalArgumentException = new IllegalArgumentException("MRNArc passedPoint coordinate is invalid");
                }
                com.meituan.android.mrn.component.map.utils.e.a(illegalArgumentException, "param");
                return;
            }
            if (this.c != null) {
                this.c.remove();
                this.c = null;
                a();
            }
        }
    }

    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479bc6dae70c94dd899804bc36d9d46a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479bc6dae70c94dd899804bc36d9d46a");
            return;
        }
        this.h = i;
        if (this.c != null) {
            this.c.setStrokeColor(this.h);
        }
    }

    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67b29ab81cd4a72b358089d52999464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67b29ab81cd4a72b358089d52999464");
            return;
        }
        this.g = com.meituan.android.mrn.component.map.utils.b.a(getContext(), f);
        if (this.c != null) {
            this.c.setStrokeWidth(this.g);
        }
    }

    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431a287a246b3e5973783cf5b4f70798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431a287a246b3e5973783cf5b4f70798");
            return;
        }
        this.j = z;
        if (this.c != null) {
            this.c.setVisible(this.j);
        }
    }

    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c066b904b3a46e923eb4bcdbffbb1b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c066b904b3a46e923eb4bcdbffbb1b1");
            return;
        }
        this.i = f;
        if (this.c != null) {
            this.c.setZIndex(this.i);
        }
    }
}
