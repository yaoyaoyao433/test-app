package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.os.Build;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends com.huawei.updatesdk.a.b.c.c.c {
    @SDKNetTransmission
    private String buildNumber;
    @SDKNetTransmission
    private String density;
    @SDKNetTransmission
    private int emuiApiLevel;
    @SDKNetTransmission
    private String firmwareVersion;
    @SDKNetTransmission
    private String manufacturer;
    @SDKNetTransmission
    private String phoneType;
    @SDKNetTransmission
    private String resolution;
    @SDKNetTransmission
    private long ts;

    public c() {
        this.emuiApiLevel = 0;
        Context a = com.huawei.updatesdk.a.b.a.a.c().a();
        this.ts = System.currentTimeMillis();
        this.firmwareVersion = Build.VERSION.RELEASE.trim();
        this.buildNumber = com.huawei.updatesdk.a.a.d.h.c.c();
        com.huawei.updatesdk.b.c.c a2 = com.huawei.updatesdk.b.c.b.a();
        this.phoneType = a2.f();
        this.density = com.huawei.updatesdk.a.a.d.h.c.f(a);
        this.resolution = com.huawei.updatesdk.a.a.d.h.c.e(a);
        this.emuiApiLevel = com.huawei.updatesdk.b.h.a.d().a();
        this.manufacturer = a2.e();
    }

    public String toString() {
        return getClass().getName() + " {\n\tmethod_: " + b() + "\n}";
    }
}
