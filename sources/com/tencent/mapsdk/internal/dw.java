package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.tools.Callback;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface dw extends TencentMapComponent.Component {
    VisualLayer a(VisualLayerOptions visualLayerOptions);

    void a(String str);

    void a(String str, int i);

    void a(String str, int i, int i2);

    void a(String str, Callback<byte[]> callback);

    void a(String str, byte[] bArr);

    void a(JSONObject jSONObject);

    boolean a();

    void b(String str);

    void b(String str, Callback<byte[]> callback);

    boolean c(String str);

    bn c_();

    void d(String str);

    void e(String str);
}
