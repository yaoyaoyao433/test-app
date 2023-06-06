package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetMethod;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
import com.tencent.mapsdk.internal.ds;
import com.tencent.mapsdk.internal.dt;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface cw extends ci.a {
    @NetJceResolver(inJce = CSFileUpdateReq.class, outJce = SCFileUpdateRsp.class, queryRange = {5, 10})
    @NetRequest(constQuery = "pf=androidsdk&fr=02001", method = NetMethod.POST, path = "fileupdate", queryKeys = {"sdkver", "suid", "appsuid", "nt", "api_key"})
    dt.a<SCFileUpdateRsp> checkUpdate(String str, String str2, String str3, String str4, String str5, ArrayList<FileUpdateReq> arrayList, String str6, String str7, String str8, String str9, String str10);

    @NetFileResolver(outFile = ca.f, queryRange = {0})
    @NetRequest(authority = "mapapi.qq.com", method = NetMethod.GET, path = "sdk/config/offline_city_detail_v2.json")
    ds.a downloadOfflineMapCityList(String str);
}
