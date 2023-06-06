package com.huawei.updatesdk.b.c;

import com.huawei.hms.common.PackageConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e extends c {
    @Override // com.huawei.updatesdk.b.c.c
    public String a() {
        return PackageConstants.SERVICES_PACKAGE_APPMARKET_TV;
    }

    @Override // com.huawei.updatesdk.b.c.c
    public int b() {
        return 1;
    }

    @Override // com.huawei.updatesdk.b.c.c
    String c() {
        return com.huawei.updatesdk.a.a.d.h.c.a("ro.product.manufacturer", "");
    }

    @Override // com.huawei.updatesdk.b.c.c
    String d() {
        return com.huawei.updatesdk.a.a.d.h.c.a("ro.product.hw_model", "");
    }

    @Override // com.huawei.updatesdk.b.c.c
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("CE1EF7188F820973C191227D95D54311ED3A65EC83E37009E898A1C058BBC775");
        return arrayList;
    }
}
