package com.meituan.android.common.locate.provider;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class GpsInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<Float> satellite = new ArrayList();
    public int view = -1;
    public int available = -1;
    public float speed = -1.0f;
    public String lat = "";
    public String lng = "";
    public String acc = "";
    public String alt = "";
    public String gpsTime = "";
    public String nmea = "";
    public String nmeaTime = "";
}
