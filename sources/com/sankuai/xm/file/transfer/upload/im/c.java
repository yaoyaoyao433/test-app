package com.sankuai.xm.file.transfer.upload.im;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.file.transfer.upload.e {
    public static ChangeQuickRedirect x;

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String p() {
        return "IMPartFileUploadTask";
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String q() {
        return "CHAT";
    }

    public c(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9caf7e392dccc6ca457ec8008e252c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9caf7e392dccc6ca457ec8008e252c");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.e, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d139027878e6dbf9c697dfb434461ae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d139027878e6dbf9c697dfb434461ae7");
            return;
        }
        super.c();
        this.d.setTaskType(3);
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade00f4e4407466ec47aa65fe480e776", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade00f4e4407466ec47aa65fe480e776") : com.sankuai.xm.file.proxy.f.d().a(a()).a("name", m()).a("md5", this.s).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb6d4ead6bad42d982e03233c88a1ad", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb6d4ead6bad42d982e03233c88a1ad") : com.sankuai.xm.file.proxy.c.b("/7/im/multi/file/create.json");
    }
}
