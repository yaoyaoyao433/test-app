package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface dc extends ci.a {
    @NetRequest(constQuery = "p_ver=1", method = NetMethod.GET, path = "map/traffic/event", queryKeys = {"param"})
    NetResponse mapTrafficEvent(String str);
}
