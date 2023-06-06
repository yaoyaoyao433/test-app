package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ct extends ci.a {
    @NetRequest(method = NetMethod.URL, path = "indoor_map")
    String getIndoorMapUrl();
}
