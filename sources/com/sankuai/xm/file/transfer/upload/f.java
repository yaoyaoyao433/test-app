package com.sankuai.xm.file.transfer.upload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.integration.crypto.CryptoProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class f extends b {
    public static ChangeQuickRedirect m;
    protected String n;
    protected String o;
    protected String p;
    protected long q;
    protected String r;
    protected String s;
    protected String t;
    protected boolean u;

    public String h() {
        return "application/octet-stream";
    }

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public f(int i, long j, String str, String str2, int i2, int i3) {
        super(i, j, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ab346b40a3f133522ecb41b3c1dace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ab346b40a3f133522ecb41b3c1dace");
            return;
        }
        this.n = str;
        this.o = str2;
        this.p = "";
        this.q = 0L;
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = CryptoProxy.c().c(str2);
    }

    @Override // com.sankuai.xm.file.transfer.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6af2b048aab1d29d8861beec57449e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6af2b048aab1d29d8861beec57449e3");
            return;
        }
        TransferContext transferContext = new TransferContext();
        transferContext.setTransferType(2);
        transferContext.setOwnerType(this.e);
        transferContext.setOwnerId(this.f);
        transferContext.setServerPath(this.n);
        transferContext.setLocalPath(this.o);
        transferContext.setCurrentProgress(0L);
        transferContext.setLastProgress(0L);
        transferContext.setLength(0L);
        transferContext.setState(3);
        transferContext.getFileInfo().setServerPath(this.n);
        this.d = transferContext;
    }

    @Override // com.sankuai.xm.file.transfer.upload.d
    public final boolean bX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6463811c43532455d295b5f35bd5fce4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6463811c43532455d295b5f35bd5fce4")).booleanValue();
        }
        if (!k.o(this.o)) {
            c(11011);
            b(11011);
            com.sankuai.xm.file.util.b.d("%s::prepare => file not exist", k());
            return false;
        }
        this.q = k.p(this.o);
        if (this.u) {
            this.q = CryptoProxy.c().a(this.o, 1);
            if (this.q == -1) {
                com.sankuai.xm.file.util.b.d("%s::prepare => failed in getting length of encrypted file", k());
                return false;
            }
        }
        this.d.setLength(this.q);
        if (this.q == 0) {
            c(11012);
            b(11012);
            com.sankuai.xm.file.util.b.d("%s::prepare => file size is 0 path=%s", k(), this.o);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.r = com.sankuai.xm.file.util.a.a(this.o, 0L, this.q, this.l);
        this.d.getStatisticEntry().calculateMD5Time = System.currentTimeMillis() - currentTimeMillis;
        if (this.l.get()) {
            c(0);
            a(5);
            com.sankuai.xm.file.util.b.d("%s::prepare => stopped [task id: %d]", k(), Integer.valueOf(this.d.getTaskId()));
            return false;
        } else if (TextUtils.isEmpty(this.r)) {
            c(11014);
            b(11014);
            com.sankuai.xm.file.util.b.d("%s::prepare => calculate md5 failed", k());
            return false;
        } else {
            com.sankuai.xm.file.util.b.b("%s::prepare => size: %d, md5: %s", k(), Long.valueOf(this.q), this.r);
            this.d.getFileInfo().setSize(this.q);
            this.d.getFileInfo().setMd5(this.r);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x03ea: MOVE  (r15 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:76:0x03ea */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0431 A[Catch: Exception -> 0x0435, TRY_LEAVE, TryCatch #5 {Exception -> 0x0435, blocks: (B:78:0x040e, B:80:0x0431), top: B:89:0x040e }] */
    @Override // com.sankuai.xm.file.transfer.upload.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.file.transfer.upload.f.b():boolean");
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f7902d7aee9cc644afc91ea79c7dd7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f7902d7aee9cc644afc91ea79c7dd7");
        }
        String n = k.n(this.o);
        if (n.contains(CommonConstant.Symbol.DOT)) {
            return n;
        }
        return n + this.p;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e559518044e96cc3f47b3d91ff10e5bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e559518044e96cc3f47b3d91ff10e5bf");
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str.contains(CommonConstant.Symbol.DOT)) {
            str = str.substring(str.indexOf(CommonConstant.Symbol.DOT) + 1);
        }
        this.p = str;
    }
}
