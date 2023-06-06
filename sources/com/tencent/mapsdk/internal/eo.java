package com.tencent.mapsdk.internal;

import android.view.View;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface eo extends er {
    public static final String a = "tencent_map_infowindow_view";
    public static final String b = "tencent_map_infowindow_content_title";
    public static final String c = "tencent_map_infowindow_content_snippet";

    void a(int i, int i2);

    void a(LatLng latLng);

    void a(MarkerOptions markerOptions);

    void a(boolean z);

    void b(boolean z);

    boolean c();

    void d();

    void e();

    void f();

    View g();

    void i_();
}
