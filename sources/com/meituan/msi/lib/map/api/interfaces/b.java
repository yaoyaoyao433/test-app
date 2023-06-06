package com.meituan.msi.lib.map.api.interfaces;

import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.MapParam;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {
    void addArc(MsiContext msiContext);

    void addDynamicMapGeoJSON(MsiContext msiContext);

    void addDynamicMapResources(MsiContext msiContext);

    void addFlowLine(MsiContext msiContext);

    void addGroundOverlay(MsiContext msiContext);

    void addMapCircles(MsiContext msiContext);

    void addMapHeatOverlays(MsiContext msiContext);

    void addMapLines(MsiContext msiContext);

    void addMapMarkers(MsiContext msiContext);

    void addMapPolygons(MsiContext msiContext);

    void addMarkers(MsiContext msiContext);

    void addPolylines(MsiContext msiContext);

    void addRipples(MsiContext msiContext);

    void clear(MsiContext msiContext);

    void createDynamicMap(MsiContext msiContext);

    void fromScreenLocation(MsiContext msiContext);

    void getAllOverlays(MsiContext msiContext);

    void getMapCenterLocation(MsiContext msiContext);

    void getMapOptions(MsiContext msiContext);

    void getMapRegion(MsiContext msiContext);

    void getMapRotate(MsiContext msiContext);

    void getMapScale(MsiContext msiContext);

    void includeMapPoints(MsiContext msiContext);

    void moveAlong(MsiContext msiContext);

    void moveToMapLocation(MsiContext msiContext);

    void removeArc(MsiContext msiContext);

    void removeDynamicMap(MsiContext msiContext);

    void removeDynamicMapResources(MsiContext msiContext);

    void removeGroundOverlay(MsiContext msiContext);

    void removeLines(MsiContext msiContext);

    void removeMapMarkers(MsiContext msiContext);

    void removePolylines(MsiContext msiContext);

    void removeRipples(MsiContext msiContext);

    void resume(MsiContext msiContext);

    void selectMarkers(MsiContext msiContext);

    void setBoundary(MsiContext msiContext);

    void setCamera(MsiContext msiContext);

    void setMapCenterOffset(MsiContext msiContext);

    void setMapLocMarkerIcon(MsiContext msiContext);

    void setMapStyle(MsiContext msiContext);

    void setMapStyleColor(MsiContext msiContext);

    void takeSnapshot(MsiContext msiContext);

    void toScreenLocation(MsiContext msiContext);

    void translateMapMarker(MapParam mapParam, MsiContext msiContext);

    void updateGroundOverlay(MsiContext msiContext);

    void updateLocation(MsiContext msiContext);

    void updatePolylines(MsiContext msiContext);
}
