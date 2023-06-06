package com.tencent.mapsdk.internal;

import com.meituan.passport.api.AbsApiFactory;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class cb extends JsonComposer {
    @Json(name = "domain1")
    public String a;
    @Json(name = "dirNew")
    public String b;
    @Json(name = "domain")
    public String c;
    @Json(name = "fileversion")
    public int d;
    @Json(name = "updateData")
    public List<bz> e;

    public final bz a(OfflineItem offlineItem) {
        List<bz> list = this.e;
        if (list != null) {
            for (bz bzVar : list) {
                if (offlineItem.getPinyin().equals(bzVar.c)) {
                    bzVar.a = AbsApiFactory.HTTPS + this.c + this.b;
                    return bzVar;
                }
            }
        }
        return null;
    }
}
