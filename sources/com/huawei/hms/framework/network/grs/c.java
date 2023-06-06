package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.c.m;
import com.huawei.hms.framework.network.grs.c.n;
import com.tencent.mapsdk.internal.ch;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements Callable<Boolean> {
    final /* synthetic */ Context a;
    final /* synthetic */ GrsBaseInfo b;
    final /* synthetic */ Context c;
    final /* synthetic */ d d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar, Context context, GrsBaseInfo grsBaseInfo, Context context2) {
        this.d = dVar;
        this.a = context;
        this.b = grsBaseInfo;
        this.c = context2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() {
        com.huawei.hms.framework.network.grs.a.c cVar;
        com.huawei.hms.framework.network.grs.a.c cVar2;
        m mVar;
        GrsBaseInfo grsBaseInfo;
        com.huawei.hms.framework.network.grs.a.a aVar;
        m mVar2;
        com.huawei.hms.framework.network.grs.a.c cVar3;
        String str;
        com.huawei.hms.framework.network.grs.a.c cVar4;
        com.huawei.hms.framework.network.grs.a.c cVar5;
        com.huawei.hms.framework.network.grs.a.a aVar2;
        com.huawei.hms.framework.network.grs.a.c cVar6;
        String str2;
        GrsBaseInfo grsBaseInfo2;
        m mVar3;
        m mVar4;
        com.huawei.hms.framework.network.grs.a.c cVar7;
        this.d.g = new m();
        this.d.i = new com.huawei.hms.framework.network.grs.a.c(this.a, "share_pre_grs_conf_");
        this.d.j = new com.huawei.hms.framework.network.grs.a.c(this.a, "share_pre_grs_services_");
        d dVar = this.d;
        cVar = dVar.i;
        cVar2 = this.d.j;
        mVar = this.d.g;
        dVar.h = new com.huawei.hms.framework.network.grs.a.a(cVar, cVar2, mVar);
        d dVar2 = this.d;
        grsBaseInfo = dVar2.c;
        aVar = this.d.h;
        mVar2 = this.d.g;
        cVar3 = this.d.j;
        dVar2.k = new a(grsBaseInfo, aVar, mVar2, cVar3);
        new com.huawei.hms.framework.network.grs.b.b(this.a, this.b, true).a(this.b);
        String c = new com.huawei.hms.framework.network.grs.c.b.c(this.b, this.a).c();
        str = d.a;
        Logger.v(str, "scan serviceSet is:" + c);
        cVar4 = this.d.j;
        String a = cVar4.a(ch.a_, "");
        String a2 = n.a(a, c);
        if (!TextUtils.isEmpty(a2)) {
            cVar6 = this.d.j;
            cVar6.b(ch.a_, a2);
            str2 = d.a;
            Logger.v(str2, "postList is:" + a2 + " currentServices:" + a);
            if (!a2.equals(a)) {
                grsBaseInfo2 = this.d.c;
                String grsParasKey = grsBaseInfo2.getGrsParasKey(false, true, this.a);
                mVar3 = this.d.g;
                mVar3.a(grsParasKey);
                mVar4 = this.d.g;
                com.huawei.hms.framework.network.grs.c.b.c cVar8 = new com.huawei.hms.framework.network.grs.c.b.c(this.b, this.c);
                cVar7 = this.d.j;
                mVar4.a(cVar8, null, null, cVar7);
            }
        }
        d dVar3 = this.d;
        cVar5 = dVar3.i;
        dVar3.a((Map<String, ?>) cVar5.a());
        aVar2 = this.d.h;
        aVar2.b(this.b, this.a);
        return Boolean.valueOf(this.d.d = true);
    }
}
