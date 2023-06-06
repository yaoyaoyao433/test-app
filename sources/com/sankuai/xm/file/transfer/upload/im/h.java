package com.sankuai.xm.file.transfer.upload.im;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.sankuai.xm.file.transfer.upload.f {
    public static ChangeQuickRedirect v;
    public boolean w;

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String h() {
        return "video/mpeg";
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String k() {
        return "IMVideoUploadTask";
    }

    public h(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a11989ac01a9b8d55956257813f706f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a11989ac01a9b8d55956257813f706f");
        } else {
            this.w = false;
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.f, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6f3a76b0ce57ca3905748b489ec6b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6f3a76b0ce57ca3905748b489ec6b9");
            return;
        }
        super.c();
        this.d.setTaskType(5);
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759a14612bca93476e027e3be6a514a6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759a14612bca93476e027e3be6a514a6") : com.sankuai.xm.file.proxy.f.d().a(a()).a("name", g()).a("md5", this.r).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a("contentType", "video/mpeg").a("screenshot", Boolean.valueOf(this.w)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a978e8166ada91283d887e7d167c6352", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a978e8166ada91283d887e7d167c6352") : com.sankuai.xm.file.proxy.c.b("/7/im/minivideo/create.json");
    }
}
