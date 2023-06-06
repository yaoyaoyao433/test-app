package com.tencent.mapsdk.internal;

import com.dianping.titans.utils.Constants;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface cr extends ci.a {
    @NetRequest(constQuery = "channel=1&output=json&uuid=unknown", method = NetMethod.GET, path = "mkey/index.php/mkey/check", queryKeys = {"key", "key2", Constants.MULTI_PROCESS_PID, "pid2", "hm", "suid", "os", "psv", "ver", com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "nt"})
    NetResponse checkAuth(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10);

    @NetRequest(constQuery = "channel=1&output=json", method = NetMethod.GET, path = "sdkapis/v1/cos_token", queryKeys = {TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME, "key", Constants.MULTI_PROCESS_PID})
    NetResponse uploadToken(String str, String str2, String str3);
}
