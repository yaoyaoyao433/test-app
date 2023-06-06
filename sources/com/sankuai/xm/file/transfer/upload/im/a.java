package com.sankuai.xm.file.transfer.upload.im;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.file.transfer.upload.f {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String k() {
        return "IMAudioUploadTask";
    }

    public a(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8818481db1e057f0fb2d45c8e4b866", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8818481db1e057f0fb2d45c8e4b866");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.f, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf009a2d7d9b1a9a3f48ff376439f0ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf009a2d7d9b1a9a3f48ff376439f0ef");
            return;
        }
        super.c();
        this.d.setTaskType(4);
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e2bc66727b91b610bdf7d2868c8269", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e2bc66727b91b610bdf7d2868c8269") : com.sankuai.xm.file.proxy.f.d().a(a()).a("md5", this.r).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4a9588c5035f1552c15fd8e012f102", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4a9588c5035f1552c15fd8e012f102") : com.sankuai.xm.file.proxy.c.b("/7/im/audio/create.json");
    }
}
