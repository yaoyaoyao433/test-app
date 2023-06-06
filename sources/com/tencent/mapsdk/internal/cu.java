package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface cu extends ci.a {
    @NetRequest(method = NetMethod.GET, path = "map/poi/detail", queryKeys = {"id", "key"})
    NetResponse poiDetail(String str, String str2);
}
