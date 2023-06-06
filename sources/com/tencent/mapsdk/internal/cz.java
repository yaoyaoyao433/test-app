package com.tencent.mapsdk.internal;

import com.meituan.android.common.statistics.Constants;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface cz extends ci.a {
    @NetRequest(constQuery = "styleid=0", method = NetMethod.URL, path = "satellite", queryKeys = {"z", Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "version"}, useExtraQuery = false)
    String satelliteUrl(String str, String str2, String str3, String str4);

    @NetRequest(constQuery = "styleid=0", method = NetMethod.URL, path = "satellite", queryKeys = {"z", Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "version"})
    String satelliteUrl2(String str, String str2, String str3, String str4);
}
