package com.sankuai.xm.file.transfer.upload.im;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.file.transfer.upload.f {
    public static ChangeQuickRedirect v;
    public boolean w;
    public boolean x;
    public boolean y;

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String k() {
        return "IMImageUploadTask";
    }

    public b(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1383995060aa46b50a57b7962e2547a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1383995060aa46b50a57b7962e2547a");
            return;
        }
        this.w = false;
        this.x = true;
        this.y = false;
    }

    @Override // com.sankuai.xm.file.transfer.upload.f, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5e69d80d92fc4eda5059a0e2fa5131", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5e69d80d92fc4eda5059a0e2fa5131");
            return;
        }
        super.c();
        this.d.setTaskType(2);
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4918a658690497239a7ee7537b93c2a5", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4918a658690497239a7ee7537b93c2a5") : com.sankuai.xm.file.proxy.f.d().a(a()).a("name", g()).a("md5", this.r).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a("big", Boolean.valueOf(this.w)).a("thumb", Boolean.valueOf(this.x)).a("originAsBig", Boolean.valueOf(this.y)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784a94f27f61c41cd2a26a21e3d600d3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784a94f27f61c41cd2a26a21e3d600d3") : com.sankuai.xm.file.proxy.c.b("/7/im/image/create.json");
    }

    @Override // com.sankuai.xm.file.transfer.upload.f
    public final String h() {
        String str;
        int lastIndexOf;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8223719453a2c2326abf7fcce7391e12", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8223719453a2c2326abf7fcce7391e12");
        }
        if (TextUtils.isEmpty(this.p)) {
            String g = g();
            if (!TextUtils.isEmpty(g) && (lastIndexOf = g.lastIndexOf(46)) != -1) {
                this.p = g.substring(lastIndexOf + 1);
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            String str2 = this.p;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1dc5b90c783d8a21b8dd54ace3b6e450", 6917529027641081856L)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1dc5b90c783d8a21b8dd54ace3b6e450");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(CommonConstant.File.JPG, "image/jpeg");
                hashMap.put("png", "image/png");
                hashMap.put("tiff", "image/tiff");
                hashMap.put("bmp", "image/bmp");
                hashMap.put(CommonConstant.File.GIF, "image/gif");
                str = (String) hashMap.get(str2.toLowerCase());
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return super.h();
    }
}
