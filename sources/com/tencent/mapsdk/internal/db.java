package com.tencent.mapsdk.internal;

import com.dianping.titans.utils.Constants;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface db extends ci.a {
    @NetRequest(constQuery = "channel=1&output=json&uuid=unknown", head = @NetHead(keys = {"Content-Type"}, values = {PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON}), method = NetMethod.POST, path = "ditusdk/monitor", queryKeys = {"key", "key2", Constants.MULTI_PROCESS_PID, "pid2", "hm", "suid", "os", "psv", "ver", com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "nt"}, userAgent = NetUtil.MAP_USER_AGENT)
    NetResponse report(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, byte[] bArr);
}
