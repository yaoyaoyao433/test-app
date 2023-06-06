package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum lc {
    NONE(-1),
    SATELLITE(0),
    DEM(1),
    MAP(2),
    STREET_VIEW_ROAD(3),
    TRAFFIC_NETWORK(4),
    INDOOR_BUILDINGS(5),
    LANDMARK(6),
    TILE_OVERLAY(7),
    INDOOR_CONFIG(8),
    NUM(9);
    
    private final int l;

    lc(int i) {
        this.l = i;
    }

    private static lc a(int i) {
        lc[] values;
        for (lc lcVar : values()) {
            if (lcVar.l == i) {
                return lcVar;
            }
        }
        return NONE;
    }

    private int a() {
        return this.l;
    }
}
