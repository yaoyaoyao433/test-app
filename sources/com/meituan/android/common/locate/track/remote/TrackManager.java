package com.meituan.android.common.locate.track.remote;

import android.location.Location;
@Deprecated
/* loaded from: classes2.dex */
public interface TrackManager {
    public static final String CACHE = "MarsCache";
    public static final String GEARS = "Mars";
    public static final String GPS = "GPS";
    public static final String GPSCACHE = "GPSCache";
    public static final String NLP = "NLP";
    public static final int PROCESS_MAIN = 0;
    public static final int TYPE_GEARS = 1;
    public static final int TYPE_GPS = 0;
    public static final int TYPE_LOADER = 2;

    void addGearsTrackPoint(Location location);

    void addGpsTrackPoint(Location location);

    void addLoaderTrackPoint(Location location);
}
