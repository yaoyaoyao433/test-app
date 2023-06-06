package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Coordinate {
    public static final int COORDINATE_TYPE_GCJ02 = 1;
    public static final int COORDINATE_TYPE_WGS84 = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CoordinateType {
    }
}
