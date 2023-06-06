package com.tencent.mapsdk.internal;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class bz extends JsonComposer {
    @Json(ignore = true)
    public String a;
    @Json(name = "md5")
    public String b;
    @Json(name = "pinyin")
    public String c;
    @Json(name = JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public int d;
    @Json(name = "ver")
    public int e;

    private boolean a(OfflineItem offlineItem) {
        return offlineItem.getPinyin().equals(this.c);
    }

    private String b() {
        return this.c + MRNBundleManager.MRN_BUNDLE_SUFFIX;
    }

    public final String a() {
        return this.c + ".dat";
    }

    private String c() {
        return this.a + File.separator + this.c + this.e + MRNBundleManager.MRN_BUNDLE_SUFFIX;
    }

    private boolean a(me meVar) {
        if (meVar != null) {
            String a = meVar.a(this.c + "-md5");
            if (this.e == meVar.b(this.c + "-version", -1)) {
                return (a == null || a.equals(this.b)) ? false : true;
            }
            return true;
        }
        return false;
    }

    private void b(me meVar) {
        if (meVar != null) {
            meVar.a(this.c + "-md5", this.b);
            meVar.a(this.c + "-version", this.e);
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("OfflineMapConfigCity{");
        stringBuffer.append("url='");
        stringBuffer.append(this.a);
        stringBuffer.append('\'');
        stringBuffer.append(", md5='");
        stringBuffer.append(this.b);
        stringBuffer.append('\'');
        stringBuffer.append(", pinyin='");
        stringBuffer.append(this.c);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.d);
        stringBuffer.append(", version=");
        stringBuffer.append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
