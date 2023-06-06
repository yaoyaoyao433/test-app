package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface cx extends ci.a {
    @NetRequest(constQuery = "ctrlpf=vector&ctrlmb=and", method = NetMethod.GET, queryKeys = {"apikey", "ver", "ctrlver", "uk", "frontier", "scenetype", "mpt"})
    NetResponse checkAuth(String str, String str2, int i, String str3, int i2, int i3, int i4);
}
