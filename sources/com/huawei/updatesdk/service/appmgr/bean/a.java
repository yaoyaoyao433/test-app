package com.huawei.updatesdk.service.appmgr.bean;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a extends com.huawei.updatesdk.b.b.c {
    public static final String APIMETHOD = "client.getMarketInfo";
    @SDKNetTransmission
    private int deviceType;
    @SDKNetTransmission
    private int international;
    @SDKNetTransmission
    private String lang;
    @SDKNetTransmission
    private String marketPkg;
    @SDKNetTransmission
    private int net;
    @SDKNetTransmission
    private int sysBits;
    @SDKNetTransmission
    private String version;
    @SDKNetTransmission
    private String subsystem = "updatesdk";
    @SDKNetTransmission
    private String code = "0200";

    public a(String str) {
        a(APIMETHOD);
        this.marketPkg = str;
        this.sysBits = com.huawei.updatesdk.a.a.d.h.c.g();
        this.lang = com.huawei.updatesdk.a.a.d.h.c.e();
        b("8.0");
        Context a = com.huawei.updatesdk.a.b.a.a.c().a();
        this.version = com.huawei.updatesdk.a.a.d.h.c.h(a);
        this.deviceType = com.huawei.updatesdk.b.c.b.a().b();
        this.international = com.huawei.updatesdk.a.a.d.h.d.a();
        this.net = com.huawei.updatesdk.a.a.d.i.a.c(a);
    }
}
