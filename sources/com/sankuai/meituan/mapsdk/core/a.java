package com.sankuai.meituan.mapsdk.core;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.mtmap.rendersdk.IndoorBuildingsObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.IndoorBuilding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements IndoorBuildingsObserver, MTMap.OnCameraChangeListener {
    public static ChangeQuickRedirect a;
    double b;
    boolean c;
    com.sankuai.meituan.mapsdk.core.render.a d;
    private boolean e;
    private j f;
    private volatile IndoorBuilding g;
    private MTMap.OnIndoorStateChangeListener h;
    private volatile Map<String, Integer> i;

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChangeFinish(CameraPosition cameraPosition) {
    }

    public a(com.sankuai.meituan.mapsdk.core.render.a aVar, j jVar) {
        Object[] objArr = {aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a2d9a956cb51f07f7112c09052a360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a2d9a956cb51f07f7112c09052a360");
            return;
        }
        this.b = 17.0d;
        this.d = aVar;
        this.f = jVar;
        this.i = new HashMap();
    }

    @Override // com.meituan.mtmap.rendersdk.IndoorBuildingsObserver
    public final void onIndoorBuildings(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40c126e53f5d2839f7b5f0eee04c531", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40c126e53f5d2839f7b5f0eee04c531");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("onIndoorBuildings: " + j);
        if (this.d == null) {
            return;
        }
        if (!this.c) {
            this.d.a((IndoorBuildingsObserver) null);
        }
        String valueOf = String.valueOf(this.d.getFeatureStringProperty(j, 0, "id"));
        if (TextUtils.isEmpty(valueOf)) {
            b();
            this.g = null;
            return;
        }
        if (this.g != null && !TextUtils.equals(this.g.getBuildingId(), valueOf)) {
            b();
            this.g = null;
        }
        if (this.g == null) {
            this.g = new IndoorBuilding();
        }
        this.g.setBuildingId(valueOf);
        this.g.setPoiId(this.d.getFeatureStringProperty(j, 0, "poiid"));
        this.g.setName(this.d.getFeatureStringProperty(j, 0, "poiname"));
        List<String> asList = Arrays.asList(this.d.getFeatureStringProperty(j, 0, "floornames").trim().split("\\s*;\\s*"));
        List<String> asList2 = Arrays.asList(this.d.getFeatureStringProperty(j, 0, "floornums").replaceAll("\\[", "").replaceAll(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, "").trim().split("\\s*,\\s*"));
        Object[] objArr2 = {asList, asList2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71e48951e2647f5b43bc49f228368bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71e48951e2647f5b43bc49f228368bc0");
        } else {
            int size = asList2.size();
            if (size >= 2) {
                try {
                    if (Integer.parseInt(asList2.get(0)) < Integer.parseInt(asList2.get(size - 1))) {
                        Collections.reverse(asList2);
                        Collections.reverse(asList);
                    }
                } catch (NumberFormatException e) {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.c(Log.getStackTraceString(e));
                }
            }
        }
        this.g.setIndoorFloorNames(asList);
        this.g.setIndoorFloorNums(asList2);
        this.g.setDefaultFloorName(this.d.getFeatureStringProperty(j, 0, "dfloorname"));
        List<String> indoorFloorNames = this.g.getIndoorFloorNames();
        ArrayList arrayList = new ArrayList();
        if (indoorFloorNames != null && !indoorFloorNames.isEmpty()) {
            arrayList.addAll(indoorFloorNames);
        }
        this.g.setIndoorLevelList(arrayList);
        this.g.setDefaultFloorNum(this.d.getFeatureStringProperty(j, 0, "dfloornum"));
        if (this.i != null && this.i.containsKey(this.g.getBuildingId())) {
            this.g.setActiveIndex(this.i.get(this.g.getBuildingId()).intValue());
        }
        if (c()) {
            a();
        }
        this.d.destroyFeatures(j);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
    public final void onCameraChange(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec4a560e29536e02e340d68309be5907", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec4a560e29536e02e340d68309be5907");
        } else if (c() && this.c) {
            a();
        } else {
            b();
        }
    }

    public final void a(MTMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        Object[] objArr = {onIndoorStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b5e5799bea33d3e4efbbb165c6998ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b5e5799bea33d3e4efbbb165c6998ef");
            return;
        }
        this.h = onIndoorStateChangeListener;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e78158b60275ded660ca8e74e4b60ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e78158b60275ded660ca8e74e4b60ac9");
        } else if (this.h != null) {
            if (this.e && this.g != null) {
                this.h.onIndoorBuildingFocused();
                a(this.g.getBuildingId(), this.g.getIndoorFloorNames().get(this.g.getActiveIndex()), Integer.parseInt(this.g.getIndoorFloorNums().get(this.g.getActiveIndex())));
                if (this.d != null) {
                    this.d.addHighlightBuilding(Long.parseLong(this.g.getBuildingId()));
                }
                if (this.f == null || this.f.k == null) {
                    return;
                }
                this.f.k.setIndoorBuilding(this.g);
                return;
            }
            this.h.onIndoorBuildingDeactivated();
            if (this.d != null) {
                this.d.removeHighlightBuilding();
            }
            if (this.f == null || this.f.k == null) {
                return;
            }
            this.f.k.setIndoorBuilding(null);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa23f7aa8fbbf2379a911d32fc450def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa23f7aa8fbbf2379a911d32fc450def");
        } else if (this.e || this.d == null || this.g == null) {
        } else {
            this.e = true;
            if (this.h != null) {
                this.h.onIndoorBuildingFocused();
            }
            a(this.g.getBuildingId(), this.g.getIndoorFloorNames().get(this.g.getActiveIndex()), Integer.parseInt(this.g.getIndoorFloorNums().get(this.g.getActiveIndex())));
            this.d.addHighlightBuilding(Long.parseLong(this.g.getBuildingId()));
            this.f.k.setIndoorBuilding(this.g);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3267f347e479bee9dfa5243ce4c73230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3267f347e479bee9dfa5243ce4c73230");
        } else if (!this.e || this.d == null) {
        } else {
            this.e = false;
            if (this.h != null) {
                this.h.onIndoorBuildingDeactivated();
            }
            this.d.removeHighlightBuilding();
            this.f.k.setIndoorBuilding(null);
        }
    }

    private void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386b71e4751a2a61cc6b792148dfad1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386b71e4751a2a61cc6b792148dfad1a");
            return;
        }
        this.d.setIndoorFloor(Long.parseLong(str), str2, i);
        if (this.g == null || !this.g.getBuildingId().equals(str)) {
            return;
        }
        List<String> indoorFloorNums = this.g.getIndoorFloorNums();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        int indexOf = indoorFloorNums.indexOf(sb.toString());
        this.g.setActiveIndex(indexOf);
        if (this.h != null) {
            this.h.onIndoorLevelActivated(this.g);
        }
        this.f.k.setActiveIndex(indexOf);
        if (this.i == null || this.g == null) {
            return;
        }
        this.i.put(this.g.getBuildingId(), Integer.valueOf(this.g.getActiveIndex()));
    }

    public final void a(int i) {
        List<String> indoorFloorNames;
        List<String> indoorFloorNums;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d944919b49e487f62c80d88aff7bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d944919b49e487f62c80d88aff7bbe");
        } else if (this.d == null) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("地图已销毁！！！ setIndoorFloor failed with destroyed map");
        } else if (!c() || this.g == null || this.g.getActiveIndex() == i || (indoorFloorNames = this.g.getIndoorFloorNames()) == null || (indoorFloorNums = this.g.getIndoorFloorNums()) == null || i < 0 || i >= indoorFloorNames.size() || i >= indoorFloorNums.size()) {
        } else {
            try {
                a(this.g.getBuildingId(), indoorFloorNames.get(i), Integer.parseInt(indoorFloorNums.get(i)));
            } catch (NumberFormatException e) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.a("setIndoorFloor faild with building id:" + this.g.getBuildingId() + "\n", e);
            }
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808c525adeac0b572258f0da8859d194", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808c525adeac0b572258f0da8859d194")).booleanValue() : this.d.getZoom() >= this.b && this.d.getPitch() <= 10.0d;
    }
}
