package com.sankuai.xm.file.transfer.upload.im;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.network.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.file.transfer.upload.e {
    public static ChangeQuickRedirect x;
    private String A;
    private String B;
    protected String y;
    protected long z;

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String p() {
        return "IMPartVideoUploadTask";
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String q() {
        return "CHAT";
    }

    public e(int i, long j, String str, int i2, int i3) {
        super(i, j, "", str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3dc834de72d658f5e7b1b93de6a8d4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3dc834de72d658f5e7b1b93de6a8d4f");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.e, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef9f579c8d4102f27689927efb9b02a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef9f579c8d4102f27689927efb9b02a");
            return;
        }
        super.c();
        this.d.setTaskType(5);
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ebaa2703d1a44b30c0f4acc2a6df86", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ebaa2703d1a44b30c0f4acc2a6df86") : com.sankuai.xm.file.proxy.f.d().a(a()).a("name", m()).a("md5", this.s).a("ownerType", d(this.e)).a("ownerId", Long.valueOf(this.f)).a(RemoteMessageConst.Notification.CHANNEL_ID, Short.valueOf(this.h)).a();
    }

    @Override // com.sankuai.xm.file.transfer.upload.e
    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cd83741589e99e8357969bfbe2a74d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cd83741589e99e8357969bfbe2a74d") : com.sankuai.xm.file.proxy.c.b("/7/im/multi/minivideo/create.json");
    }

    public final void b(String str) {
        this.y = str;
    }

    @Override // com.sankuai.xm.file.transfer.upload.e, com.sankuai.xm.file.transfer.upload.c
    public final boolean bW_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627d14b589031ad76bca2312b71b61af", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627d14b589031ad76bca2312b71b61af")).booleanValue();
        }
        if (super.bW_()) {
            if (!k.o(this.y)) {
                c(11011);
                b(11011);
                com.sankuai.xm.file.util.b.d("%s::prepare => screenshot file not exist [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return false;
            }
            this.z = k.p(this.y);
            if (this.z == 0) {
                c(11012);
                b(11012);
                com.sankuai.xm.file.util.b.d("%s::prepare => screenshot file size is 0 [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return false;
            }
            this.B = com.sankuai.xm.file.util.a.a(this.y, this.m);
            if (this.m.get()) {
                c(0);
                a(5);
                com.sankuai.xm.file.util.b.d("%s::prepare => stopped [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return false;
            } else if (TextUtils.isEmpty(this.B)) {
                c(11014);
                b(11014);
                com.sankuai.xm.file.util.b.d("%s::prepare => screenshot calculate md5 failed [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return false;
            } else {
                com.sankuai.xm.file.util.b.b("%s::prepare => screenshot md5: %s, size: %d [task id: %d]", "IMPartVideoUploadTask", this.B, Long.valueOf(this.z), Integer.valueOf(this.d.getTaskId()));
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.xm.file.transfer.upload.a
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1801f018d43744069ea5828b66d26300", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1801f018d43744069ea5828b66d26300")).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k || this.l || !r()) {
            this.d.getStatisticEntry().createPathTime = System.currentTimeMillis() - currentTimeMillis;
            if (this.k) {
                c(0);
                a(5);
                com.sankuai.xm.file.util.b.a("%s::assistUpload => stop task quit [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else if (this.l) {
                c(0);
                a(4);
                com.sankuai.xm.file.util.b.a("%s::assistUpload => suspend task quit [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else {
                c(11009);
                b(11015);
                com.sankuai.xm.file.util.b.d("%s::assistUpload => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
                return 11015;
            }
        }
        c(0);
        com.sankuai.xm.file.util.b.b("%s::assistUpload => task finished [task id: %d]", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()));
        return 0;
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x047f: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:100:0x047f */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04cb A[Catch: Exception -> 0x04cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x04cf, blocks: (B:102:0x04a5, B:104:0x04cb), top: B:109:0x04a5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean r() {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.file.transfer.upload.im.e.r():boolean");
    }

    @Override // com.sankuai.xm.file.transfer.upload.e, com.sankuai.xm.file.transfer.upload.c
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54826685315902219aaa2dbdf465dcf5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54826685315902219aaa2dbdf465dcf5")).booleanValue();
        }
        com.sankuai.xm.file.proxy.g<FileInfoBean> gVar = new com.sankuai.xm.file.proxy.g<>();
        c.a a = a.C1381a.a.d.a(o(), n(), a(this.u, this.j.getPartIdList(), this.A), gVar);
        if (a == null) {
            this.d.setFileInfo(gVar.b);
            com.sankuai.xm.file.util.b.b("%s::createPath => succeed [task id: %d], uploadId is %s", "IMPartVideoUploadTask", Integer.valueOf(this.d.getTaskId()), this.u);
            return true;
        }
        com.sankuai.xm.file.util.b.d("%s::createPath => failed, code: %d, message: %s [task id: %d] ,uploadId is %s", "IMPartVideoUploadTask", Integer.valueOf(a.a()), a.b(), Integer.valueOf(this.d.getTaskId()), this.u);
        a(a);
        return false;
    }

    private String a(String str, List<String> list, String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28d0ecd35a754b0855bd617d24954766", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28d0ecd35a754b0855bd617d24954766");
        }
        JSONArray jSONArray = new JSONArray();
        if (!list.isEmpty()) {
            for (String str3 : list) {
                jSONArray.put(str3);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        if (!TextUtils.isEmpty(str2)) {
            jSONArray2.put(str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uploadId", str);
            jSONObject.put("partIds", jSONArray);
            jSONObject.put("additionPartIds", jSONArray2);
        } catch (JSONException e) {
            com.sankuai.xm.file.util.b.d("%s::createPath => failed, message: %s [task id: %d] ,uploadId is %s", "IMPartVideoUploadTask", e.getMessage(), Integer.valueOf(this.d.getTaskId()), this.u);
        }
        return jSONObject.toString();
    }
}
