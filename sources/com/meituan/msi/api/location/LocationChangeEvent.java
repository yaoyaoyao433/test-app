package com.meituan.msi.api.location;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class LocationChangeEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long _mtGotTimestamp;
    public float accuracy;
    public double altitude;
    public int horizontalAccuracy;
    public double latitude;
    public double longitude;
    public long mtTimestamp;
    public String provider;
    public float speed;
    public float verticalAccuracy;

    public LocationChangeEvent(a aVar) {
        this.provider = aVar.a;
        this.horizontalAccuracy = aVar.b;
        this.verticalAccuracy = aVar.c;
        this.altitude = aVar.d;
        this.accuracy = aVar.e;
        this.speed = aVar.f;
        this.longitude = aVar.g;
        this.latitude = aVar.h;
        this.mtTimestamp = aVar.i;
        this._mtGotTimestamp = aVar.j;
    }
}
