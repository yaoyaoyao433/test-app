package com.tencent.mapsdk.internal;

import com.meituan.android.common.statistics.Constants;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface da extends ci.a {
    @NetRequest(constQuery = "styleid=7", method = NetMethod.URL, path = "scenic/", queryKeys = {Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "z", "version"}, useExtraQuery = false)
    String sketchTileUrl(int i, int i2, int i3, int i4);
}
