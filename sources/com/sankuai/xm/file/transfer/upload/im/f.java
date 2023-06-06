package com.sankuai.xm.file.transfer.upload.im;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends com.sankuai.xm.file.transfer.upload.f {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String k() {
        return "IMSingleFileUploadTask";
    }

    public f(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e307a17ad014dd0389e59ea0b1bed6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e307a17ad014dd0389e59ea0b1bed6");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.f, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1037ab35ddcd1495695e3d6cea33c6c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1037ab35ddcd1495695e3d6cea33c6c6");
            return;
        }
        super.c();
        this.d.setTaskType(3);
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6df74f1904382dd6ac7f96d19f6b92c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6df74f1904382dd6ac7f96d19f6b92c") : com.sankuai.xm.file.proxy.f.d().a(a()).a("name", g()).a("md5", this.r).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a53d84e542c8a35a465059789cc442a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a53d84e542c8a35a465059789cc442a") : com.sankuai.xm.file.proxy.c.b("/7/im/file/create.json");
    }
}
