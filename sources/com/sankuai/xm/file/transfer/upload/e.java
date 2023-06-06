package com.sankuai.xm.file.transfer.upload;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.Block;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.file.bean.UploadPartFileInfo;
import com.sankuai.xm.file.proxy.g;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import com.sankuai.xm.network.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class e extends a {
    public static ChangeQuickRedirect n;
    protected String o;
    protected String p;
    protected String q;
    protected long r;
    protected String s;
    protected String t;
    protected String u;
    protected boolean v;
    protected final SharedPreferences w;

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public e(int i, long j, String str, String str2, int i2, int i3) {
        super(i, j, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497f8430e16c39d213413ee13c92a5a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497f8430e16c39d213413ee13c92a5a1");
            return;
        }
        this.o = str;
        this.p = str2;
        this.q = "";
        this.r = 0L;
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = CryptoProxy.c().c(str2);
        this.w = new com.sankuai.xm.base.sp.c(a.C1381a.a.f, "upload_break_point_info", 0);
    }

    @Override // com.sankuai.xm.file.transfer.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b611523223603cf75cb7868109924370", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b611523223603cf75cb7868109924370");
            return;
        }
        TransferContext transferContext = new TransferContext();
        transferContext.setTransferType(2);
        transferContext.setOwnerType(this.e);
        transferContext.setOwnerId(this.f);
        transferContext.setServerPath(this.o);
        transferContext.setLocalPath(this.p);
        transferContext.setLastProgress(0L);
        transferContext.setCurrentProgress(0L);
        transferContext.setLength(0L);
        transferContext.setState(3);
        transferContext.getFileInfo().setServerPath(this.o);
        this.d = transferContext;
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public boolean bW_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe13af04d1454be7cf5f69480b37d73", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe13af04d1454be7cf5f69480b37d73")).booleanValue();
        }
        if (!k.o(this.p)) {
            c(11011);
            b(11011);
            com.sankuai.xm.file.util.b.d("%s::prepare => file not exist [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        }
        this.r = k.p(this.p);
        if (this.v) {
            this.r = CryptoProxy.c().a(this.p, 1);
            if (this.r == -1) {
                com.sankuai.xm.file.util.b.d("%s::prepare => failed in getting length of encrypted file", p());
                return false;
            }
        }
        this.d.setLength(this.r);
        long j = this.r;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = n;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b2da1fc488414f3edefc83576be365b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b2da1fc488414f3edefc83576be365b");
        } else {
            this.d.getFileInfo().setSize(j);
        }
        if (this.r == 0) {
            c(11012);
            b(11012);
            com.sankuai.xm.file.util.b.d("%s::prepare => file size is 0 [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.s = com.sankuai.xm.file.util.a.a(this.p, this.m);
        this.d.getStatisticEntry().calculateMD5Time = System.currentTimeMillis() - currentTimeMillis;
        if (this.m.get()) {
            c(0);
            a(5);
            com.sankuai.xm.file.util.b.d("%s::prepare => stopped [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        } else if (TextUtils.isEmpty(this.s)) {
            c(11014);
            b(11014);
            com.sankuai.xm.file.util.b.d("%s::prepare => calculate md5 failed [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        } else {
            this.t = q() + CommonConstant.Symbol.UNDERLINE + this.s;
            String str = this.s;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = n;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0bb2436de924b772697d32037e5fba60", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0bb2436de924b772697d32037e5fba60");
            } else {
                this.d.getFileInfo().setMd5(str);
            }
            com.sankuai.xm.file.util.b.b("%s::prepare => md5: %s, size: %d [task id: %d]", p(), this.s, Long.valueOf(this.r), Integer.valueOf(this.d.getTaskId()));
            return true;
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e105e1c5328605cab9574c5dfa3923", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e105e1c5328605cab9574c5dfa3923")).booleanValue();
        }
        long j = this.r;
        long j2 = 0;
        long j3 = 20971520;
        if (j <= 20971520) {
            Block block = new Block();
            block.setStart(0L);
            block.setLength(j);
            block.setMd5(this.s);
            this.j.addBlock(block);
        } else {
            long j4 = j / 20971520;
            while (j2 < j4) {
                Block block2 = new Block();
                long j5 = j2 * j3;
                block2.setStart(j5);
                block2.setLength(j3);
                String a = com.sankuai.xm.file.util.a.a(this.p, j5, 20971520L, this.m);
                if (TextUtils.isEmpty(a)) {
                    com.sankuai.xm.file.util.b.d("%s::divideBlock => calculate md5 failed [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
                    return false;
                }
                block2.setMd5(a);
                block2.setPartNum(j2);
                this.j.addBlock(block2);
                j2++;
                j3 = 20971520;
            }
            long j6 = j4 * j3;
            if (j > j6) {
                Block block3 = new Block();
                block3.setStart(j6);
                long j7 = j - j6;
                block3.setLength(j7);
                String a2 = com.sankuai.xm.file.util.a.a(this.p, j6, j7, this.m);
                if (TextUtils.isEmpty(a2)) {
                    com.sankuai.xm.file.util.b.d("%s::divideBlock => calculate md5 failed [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
                    return false;
                }
                block3.setPartNum(this.j.getBlockList().size());
                block3.setMd5(a2);
                this.j.addBlock(block3);
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [T, java.lang.Boolean] */
    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean a(g<Boolean> gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b2759e507f7f96af4d61af24807eb6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b2759e507f7f96af4d61af24807eb6")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        g<UploadPartFileInfo> gVar2 = new g<>();
        c.a a = a.C1381a.a.d.a(this.s, this.r, q(), gVar2);
        this.d.getStatisticEntry().checkExistTime = System.currentTimeMillis() - currentTimeMillis;
        if (a != null || TextUtils.isEmpty(gVar2.b.getUploadId())) {
            if (a != null) {
                a(a);
            }
            return false;
        }
        this.u = gVar2.b.getUploadId();
        this.j.setUploadId(this.u);
        gVar.b = Boolean.valueOf(gVar2.b.isExists());
        if (gVar2.b.isExists()) {
            com.sankuai.xm.file.util.b.b("%s::prepare => file exist in server, mUploadId: %s [task id: %d]", p(), this.u, Integer.valueOf(this.d.getTaskId()));
        } else {
            com.sankuai.xm.file.util.b.b("%s::prepare => file don't exist in server, mUploadId: %s [task id: %d]", p(), this.u, Integer.valueOf(this.d.getTaskId()));
        }
        return true;
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "474ff2b284675ff4a2e38d46fdb1f35e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "474ff2b284675ff4a2e38d46fdb1f35e")).booleanValue();
        }
        String string = this.w.getString(this.t, "");
        com.sankuai.xm.file.util.b.b("%s::loadBreakpoint => break point: %s [task id: %d]", p(), string, Integer.valueOf(this.d.getTaskId()));
        if (string.isEmpty()) {
            return false;
        }
        try {
            this.j.clear();
            this.j.jsonToObject(string);
            if (!TextUtils.isEmpty(this.j.getUploadId())) {
                this.u = this.j.getUploadId();
            }
            return true;
        } catch (JSONException e) {
            com.sankuai.xm.file.util.b.a("", e);
            return false;
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e808b22257e9b4cdb978f8f00282201b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e808b22257e9b4cdb978f8f00282201b")).booleanValue();
        }
        try {
            String jSONObject = this.j.serializeObject().toString();
            SharedPreferences.Editor edit = this.w.edit();
            edit.putString(this.t, jSONObject);
            com.sankuai.xm.file.util.b.b("%s::saveBreakpoint => break point: %s [task id: %d]", p(), jSONObject, Integer.valueOf(this.d.getTaskId()));
            return edit.commit();
        } catch (JSONException e) {
            com.sankuai.xm.file.util.b.a("", e);
            return false;
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean a(Block block) {
        Object[] objArr = {block};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64cfbf6568ca3f25e5b2b340e35bb590", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64cfbf6568ca3f25e5b2b340e35bb590")).booleanValue();
        }
        if (TextUtils.isEmpty(this.j.getUploadId())) {
            com.sankuai.xm.file.util.b.b("%s::uploadBlock => block exists in server [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        }
        Block a = a(this.j.getUploadId(), block.getPartNum(), this.p, block.getStart(), block.getLength(), block.getMd5());
        if (a == null || !a.getMd5().equals(block.getMd5()) || a.getLength() != a.getLength()) {
            com.sankuai.xm.file.util.b.d("%s::uploadBlock => block upload failed [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
            return false;
        }
        block.setState(1);
        block.setPartId(a.getPartId());
        com.sankuai.xm.file.util.b.b("%s::uploadBlock => block upload success [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
        return true;
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4797f941a7d473be29d9182833095a8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4797f941a7d473be29d9182833095a8")).booleanValue();
        }
        SharedPreferences.Editor remove = this.w.edit().remove(this.t);
        com.sankuai.xm.file.util.b.b("%s::removeBreakpoint => finished [task id: %d]", p(), Integer.valueOf(this.d.getTaskId()));
        return remove.commit();
    }

    @Override // com.sankuai.xm.file.transfer.upload.c
    public boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6438ca6ab3c3efe18da8b799502a2192", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6438ca6ab3c3efe18da8b799502a2192")).booleanValue();
        }
        g<FileInfoBean> gVar = new g<>();
        c.a a = a.C1381a.a.d.a(o(), n(), a(this.u, this.j.getPartIdList()), gVar);
        if (a == null) {
            this.d.setFileInfo(gVar.b);
            com.sankuai.xm.file.util.b.b("%s::createPath => succeed [task id: %d], uploadId is %s", p(), Integer.valueOf(this.d.getTaskId()), this.u);
            return true;
        }
        com.sankuai.xm.file.util.b.d("%s::createPath => failed, code: %d, message: %s [task id: %d] ,uploadId is %s", p(), Integer.valueOf(a.a()), a.b(), Integer.valueOf(this.d.getTaskId()), this.u);
        a(a);
        return false;
    }

    private String a(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1525ef339242254ed599a97d45d65d6d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1525ef339242254ed599a97d45d65d6d");
        }
        JSONArray jSONArray = new JSONArray();
        if (!list.isEmpty()) {
            for (String str2 : list) {
                jSONArray.put(str2);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uploadId", str);
            jSONObject.put("partIds", jSONArray);
        } catch (JSONException e) {
            com.sankuai.xm.file.util.b.d("%s::createPath => failed, message: %s [task id: %d] ,uploadId is %s", p(), e.getMessage(), Integer.valueOf(this.d.getTaskId()), this.u);
        }
        return jSONObject.toString();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e925517520aecab0e4d50581c64c9c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e925517520aecab0e4d50581c64c9c4");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.q = str;
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffa8f6a07bcaad915a4bb86c1390057", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffa8f6a07bcaad915a4bb86c1390057");
        }
        String n2 = k.n(this.p);
        if (n2.contains(CommonConstant.Symbol.DOT)) {
            return n2;
        }
        return n2 + this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d5 A[Catch: Exception -> 0x04d9, TRY_LEAVE, TryCatch #12 {Exception -> 0x04d9, blocks: (B:97:0x04b2, B:99:0x04d5), top: B:120:0x04b2 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.sankuai.xm.network.http.b] */
    /* JADX WARN: Type inference failed for: r8v10, types: [long] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.xm.file.bean.Block a(java.lang.String r23, long r24, final java.lang.String r26, final long r27, final long r29, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.file.transfer.upload.e.a(java.lang.String, long, java.lang.String, long, long, java.lang.String):com.sankuai.xm.file.bean.Block");
    }
}
