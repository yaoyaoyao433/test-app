package com.tencent.tencentmap.mapsdk.maps.exception;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InvalidLatLngBoundsException extends RuntimeException {
    public InvalidLatLngBoundsException(int i) {
        super("Cannot create a LatLngBounds from " + i + " items");
    }
}
