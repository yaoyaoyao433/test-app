package com.sankuai.xm.file.proxy;

import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.file.bean.SdkServerResult;
import com.sankuai.xm.file.bean.UploadPartFileInfo;
import com.sankuai.xm.file.proxy.f;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import com.sankuai.xm.monitor.cat.c;
import com.sankuai.xm.network.c;
import java.util.Map;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e308f25b87f937719f466cb2425f59a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e308f25b87f937719f466cb2425f59a");
        }
        switch (i) {
            case 2:
                return DBSessionMsgSpecialTag.CHAT;
            case 3:
                return "groupchat";
            case 4:
                return "pubchat";
            default:
                return "";
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, com.sankuai.xm.file.bean.FileInfoBean] */
    public final c.a a(Map<String, Object> map, int i, g<FileInfoBean> gVar) {
        c.a a2;
        Object[] objArr = {map, Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1e0a56882b268428fc7d12fcadd7f9", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1e0a56882b268428fc7d12fcadd7f9");
        }
        f.a a3 = f.d().a(map).a("ownerType", a(i));
        String a4 = c.a("/7/im/files/copy.json");
        f.b e = f.e();
        e.b = 1;
        e.c = a4;
        e.d = a3.a();
        com.sankuai.xm.network.c a5 = e.a(f.a(a4, false)).a();
        com.sankuai.xm.file.util.b.b("CommonServerProxy::copyMessage => request url: %s", a4);
        com.sankuai.xm.network.httpurlconnection.g.a().a(a5);
        if (a5.t()) {
            c.a s = a5.s();
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyMessage => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(s.a()), s.b(), a5.v());
            a(a5, s);
            return s;
        }
        try {
            com.sankuai.xm.network.d r = a5.r();
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(r.a());
            a2 = sdkServerResult.hasError() ? new c.a(sdkServerResult.getResCode(), sdkServerResult.getErrorMessage()) : null;
            ?? fileInfoBean = new FileInfoBean();
            fileInfoBean.deserializeJson(sdkServerResult.getData());
            gVar.b = fileInfoBean;
        } catch (JSONException e2) {
            a2 = f.a(e2);
        }
        if (a2 != null) {
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyMessage => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(a2.a()), a2.b(), a5.v());
        }
        a(a5, a2);
        return a2;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [T, com.sankuai.xm.file.bean.FileInfoBean] */
    public final c.a a(String str, int i, long j, short s, g<FileInfoBean> gVar) {
        c.a a2;
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), Short.valueOf(s), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55fc71b7d2d3a86551f788bec9fc2af2", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55fc71b7d2d3a86551f788bec9fc2af2");
        }
        f.a a3 = f.d().a("path", str).a("ownerType", a(i)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(s)).a("ownerId", Long.valueOf(j));
        String a4 = c.a("/7/im/files/transfer.json");
        f.b e = f.e();
        e.b = 1;
        e.c = a4;
        e.d = a3.a();
        com.sankuai.xm.network.c a5 = e.a(f.a(a4, false)).a();
        com.sankuai.xm.file.util.b.b("CommonServerProxy::copyFile => request url: %s", a4);
        com.sankuai.xm.network.httpurlconnection.g.a().a(a5);
        if (a5.t()) {
            c.a s2 = a5.s();
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyFile => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(s2.a()), s2.b(), a5.v());
            a(a5, s2);
            return s2;
        }
        try {
            com.sankuai.xm.network.d r = a5.r();
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(r.a());
            a2 = sdkServerResult.hasError() ? new c.a(sdkServerResult.getResCode(), sdkServerResult.getErrorMessage()) : null;
            ?? fileInfoBean = new FileInfoBean();
            fileInfoBean.deserializeJson(sdkServerResult.getData());
            gVar.b = fileInfoBean;
        } catch (JSONException e2) {
            a2 = f.a(e2);
        }
        if (a2 != null) {
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyFile => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(a2.a()), a2.b(), a5.v());
        }
        a(a5, a2);
        return a2;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [T, com.sankuai.xm.file.bean.FileInfoBean] */
    public final c.a a(String str, String str2, int i, long j, short s, g<FileInfoBean> gVar) {
        c.a a2;
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), Short.valueOf(s), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faaca67a46b238929790a7c71294cf61", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faaca67a46b238929790a7c71294cf61");
        }
        f.a a3 = f.d().a("path", str).a("linkId", str2).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(s)).a("ownerType", a(i)).a("ownerId", Long.valueOf(j));
        String a4 = c.a("/7/link/transfer.json");
        f.b e = f.e();
        e.b = 1;
        e.c = a4;
        e.d = a3.a();
        com.sankuai.xm.network.c a5 = e.a(f.a(a4, false)).a();
        com.sankuai.xm.file.util.b.b("CommonServerProxy::copyFileShare => request url: %s", a4);
        com.sankuai.xm.network.httpurlconnection.g.a().a(a5);
        if (a5.t()) {
            c.a s2 = a5.s();
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyFileShare => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(s2.a()), s2.b(), a5.v());
            a(a5, s2);
            return s2;
        }
        try {
            com.sankuai.xm.network.d r = a5.r();
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(r.a());
            a2 = sdkServerResult.hasError() ? new c.a(sdkServerResult.getResCode(), sdkServerResult.getErrorMessage()) : null;
            ?? fileInfoBean = new FileInfoBean();
            fileInfoBean.deserializeJson(sdkServerResult.getData());
            gVar.b = fileInfoBean;
        } catch (JSONException e2) {
            a2 = f.a(e2);
        }
        if (a2 != null) {
            com.sankuai.xm.file.util.b.d("CommonServerProxy::copyFileShare => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(a2.a()), a2.b(), a5.v());
        }
        a(a5, a2);
        return a2;
    }

    private void a(com.sankuai.xm.network.c cVar, c.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22456c5dc86e611864dbb8d8287510c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22456c5dc86e611864dbb8d8287510c4");
            return;
        }
        com.sankuai.xm.monitor.cat.b bVar = new com.sankuai.xm.monitor.cat.b();
        bVar.b = cVar.j();
        bVar.e = cVar.l().getBytes().length;
        bVar.f = cVar.r() == null ? 0 : cVar.r().a().getBytes().length;
        if (aVar != null) {
            bVar.c = aVar.a();
            bVar.d = aVar.d();
            if (!TextUtils.isEmpty(aVar.b())) {
                bVar.h = aVar.b();
            }
        } else {
            bVar.c = 0;
            bVar.d = 200;
        }
        bVar.g = cVar.q() != null ? cVar.q().i : 0L;
        c.a.a.a(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [T, com.sankuai.xm.file.bean.UploadPartFileInfo] */
    public final c.a a(String str, long j, String str2, g<UploadPartFileInfo> gVar) {
        c.a a2;
        Object[] objArr = {str, new Long(j), str2, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb31e7fb70297235b37d4d1e028184f", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb31e7fb70297235b37d4d1e028184f");
        }
        f.a a3 = f.d().a("md5", str).a(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(j)).a("type", str2);
        String b = c.b("/7/ul/multi/init.json");
        f.b e = f.e();
        e.b = 1;
        e.c = b;
        e.d = a3.a();
        com.sankuai.xm.network.c a4 = e.a(f.a(b, false)).a();
        com.sankuai.xm.file.util.b.b("CoreServerProxy::executeSwiftContentInit => request url: %s", b);
        com.sankuai.xm.network.httpurlconnection.g.a().a(a4);
        if (a4.t()) {
            c.a s = a4.s();
            com.sankuai.xm.file.util.b.d("CoreServerProxy::executeSwiftContentInit => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(s.a()), s.b(), a4.v());
            a(a4, s);
            return s;
        }
        try {
            com.sankuai.xm.network.d r = a4.r();
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(r.a());
            a2 = sdkServerResult.hasError() ? new c.a(sdkServerResult.getResCode(), sdkServerResult.getErrorMessage()) : null;
            ?? uploadPartFileInfo = new UploadPartFileInfo();
            uploadPartFileInfo.deserializeJson(sdkServerResult.getData());
            gVar.b = uploadPartFileInfo;
        } catch (JSONException e2) {
            a2 = f.a(e2);
        }
        if (a2 != null) {
            com.sankuai.xm.file.util.b.d("CoreServerProxy::executeSwiftContentInit => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(a2.a()), a2.b(), a4.v());
        }
        a(a4, a2);
        return a2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [T, com.sankuai.xm.file.bean.FileInfoBean] */
    public final c.a a(String str, String str2, String str3, g<FileInfoBean> gVar) {
        Map<String, String> a2;
        c.a a3;
        Object[] objArr = {str, str2, str3, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69afb77ace6e5e8483e78ce0eb9cc0f4", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69afb77ace6e5e8483e78ce0eb9cc0f4");
        }
        f.b e = f.e();
        e.b = 1;
        e.c = str;
        e.d = str3;
        String encodeToString = Base64.encodeToString(str2.getBytes(), 2);
        Object[] objArr2 = {encodeToString, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f19e0edea2cb20b9a7029710eea9eee7", 6917529027641081856L)) {
            a2 = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f19e0edea2cb20b9a7029710eea9eee7");
        } else {
            a2 = f.a(str, false);
            a2.put("cfp", encodeToString);
        }
        com.sankuai.xm.network.c a4 = e.a(a2).a();
        com.sankuai.xm.file.util.b.b("CoreServerProxy::executeStorageCreate => request url: %s", str);
        com.sankuai.xm.network.httpurlconnection.g.a().a(a4);
        if (a4.t()) {
            c.a s = a4.s();
            com.sankuai.xm.file.util.b.d("CoreServerProxy::executeStorageCreate => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(s.a()), s.b(), a4.v());
            a(a4, s);
            return s;
        }
        try {
            com.sankuai.xm.network.d r = a4.r();
            SdkServerResult sdkServerResult = new SdkServerResult();
            sdkServerResult.deserializeJson(r.a());
            a3 = sdkServerResult.hasError() ? new c.a(sdkServerResult.getResCode(), sdkServerResult.getErrorMessage()) : null;
            ?? fileInfoBean = new FileInfoBean();
            fileInfoBean.deserializeJson(sdkServerResult.getData());
            gVar.b = fileInfoBean;
        } catch (JSONException e2) {
            a3 = f.a(e2);
        }
        if (a3 != null) {
            com.sankuai.xm.file.util.b.d("CoreServerProxy::executeStorageCreate => httpCode: %d, message: %s, request-Id: %s", Integer.valueOf(a3.a()), a3.b(), a4.v());
        }
        a(a4, a3);
        return a3;
    }
}
