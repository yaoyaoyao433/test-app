package com.dianping.eunomia.model.apimodel;

import android.net.Uri;
import com.dianping.dataservice.mapi.b;
import com.dianping.dataservice.mapi.c;
import com.dianping.dataservice.mapi.e;
import com.dianping.eunomia.ModulesConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public Long c;
    public String d;
    public Integer e;
    public c f;
    private final String g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f16c28b39f34cab8ca4f3b157536711", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f16c28b39f34cab8ca4f3b157536711");
            return;
        }
        this.f = c.NORMAL;
        this.g = "http://mapi.dianping.com/mapi/framework/modulesconfig.bin";
    }

    public final e<ModulesConfig> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4719704b6418a87e3b0c501b1451be43", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4719704b6418a87e3b0c501b1451be43");
        }
        Uri.Builder buildUpon = Uri.parse("http://mapi.dianping.com/mapi/framework/modulesconfig.bin").buildUpon();
        if (this.b != null) {
            buildUpon.appendQueryParameter("version", this.b);
        }
        if (this.c != null) {
            buildUpon.appendQueryParameter("timeStamp", this.c.toString());
        }
        if (this.d != null) {
            buildUpon.appendQueryParameter("md5", this.d);
        }
        if (this.e != null) {
            buildUpon.appendQueryParameter("env", this.e.toString());
        }
        String uri = buildUpon.build().toString();
        c cVar = this.f;
        com.dianping.archive.c<ModulesConfig> cVar2 = ModulesConfig.DECODER;
        Object[] objArr2 = {uri, cVar, cVar2};
        ChangeQuickRedirect changeQuickRedirect2 = b.g;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5938c14cff4cc74ebec8eabac68f5dfe", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5938c14cff4cc74ebec8eabac68f5dfe") : new b(uri, "GET", null, cVar, false, null, 0L, cVar2);
    }
}
