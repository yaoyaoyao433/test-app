package com.sankuai.xm.file.transfer.download.im;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends com.sankuai.xm.file.transfer.download.a {
    public static ChangeQuickRedirect m;
    private String l;
    public String n;
    private String o;
    private String p;
    private long q;
    private boolean r;
    private String s;

    public d(String str, long j, String str2, String str3, String str4, String str5) {
        super(-1, -1L);
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dfe02c652fce22abb8310c49ef90367", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dfe02c652fce22abb8310c49ef90367");
            return;
        }
        this.l = str;
        this.q = j;
        this.o = str2;
        this.p = str3;
        this.n = str4;
        this.r = CryptoProxy.c().c(str2);
        this.s = str5;
    }

    @Override // com.sankuai.xm.file.transfer.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8043d84f8b94d37e8ae5c2eb985fc7e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8043d84f8b94d37e8ae5c2eb985fc7e3");
            return;
        }
        TransferContext transferContext = new TransferContext();
        transferContext.setTransferType(1);
        transferContext.setLocalPath(this.o);
        transferContext.setCurrentProgress(0L);
        transferContext.setLastProgress(0L);
        transferContext.setLength(this.q);
        transferContext.getFileInfo().setSize(this.q);
        transferContext.getFileInfo().setUrl(this.n);
        transferContext.getFileInfo().setName(this.l);
        transferContext.getFileInfo().setToken(this.s);
        transferContext.setState(3);
        this.d = transferContext;
    }

    @Override // com.sankuai.xm.file.transfer.download.b
    public final boolean bV_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1022a463931684715802bc7bd2277db", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1022a463931684715802bc7bd2277db")).booleanValue();
        }
        String str = a.C1381a.a.e + "/.cache/";
        if (TextUtils.isEmpty(this.p)) {
            this.p = str + this.l + CommonConstant.Symbol.UNDERLINE + com.sankuai.xm.file.util.a.a("MD5", this.n, "UTF-8");
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:65|(3:66|67|(11:69|70|71|72|(3:161|162|163)|74|75|76|77|78|(3:80|81|82)))|(6:94|95|(3:96|97|(1:1)(6:101|102|103|104|(4:106|(1:108)|109|110)(2:112|113)|111))|120|121|(7:123|124|125|(1:127)|128|24|25)(2:129|130))|143|144|145|146|(1:148)|149|24|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(2:7|8)|(6:10|11|(3:14|15|12)|36|37|38)|(11:40|(1:42)(2:203|(3:206|(2:208|(1:212))|213)(1:205))|43|(1:202)(1:49)|50|51|(2:53|(1:55)(2:189|(2:191|(1:193)(1:194))))(2:195|(5:199|200|57|58|(4:60|(1:62)|63|64)(23:65|66|67|69|70|71|72|(3:161|162|163)|74|75|76|77|78|(3:80|81|82)|(6:94|95|(3:96|97|(1:1)(6:101|102|103|104|(4:106|(1:108)|109|110)(2:112|113)|111))|120|121|(7:123|124|125|(1:127)|128|24|25)(2:129|130))|143|144|145|146|(1:148)|149|24|25)))|56|57|58|(0)(0))|214|43|(1:45)|202|50|51|(0)(0)|56|57|58|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0465, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0467, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04a7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04a8, code lost:
        r27 = r7;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04b6, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04b7, code lost:
        r27 = r7;
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bb A[Catch: all -> 0x00c6, Exception -> 0x00ce, TRY_ENTER, TryCatch #17 {Exception -> 0x00ce, all -> 0x00c6, blocks: (B:11:0x00b0, B:20:0x00f7, B:22:0x0117, B:37:0x014c, B:39:0x0154, B:41:0x015c, B:47:0x01bb, B:49:0x01e6, B:50:0x01ea, B:52:0x01ee, B:54:0x01fc, B:55:0x0204, B:23:0x0122, B:26:0x012b, B:28:0x0133, B:30:0x013d), top: B:228:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0283  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.InputStream] */
    @Override // com.sankuai.xm.file.transfer.download.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.file.transfer.download.im.d.b():boolean");
    }

    private com.sankuai.xm.network.http.b b(com.sankuai.xm.network.http.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "394c6ad9fca353a9dfdc8b520f329831", 6917529027641081856L)) {
            return (com.sankuai.xm.network.http.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "394c6ad9fca353a9dfdc8b520f329831");
        }
        String c = bVar.c("Location");
        com.sankuai.xm.network.http.b b = com.sankuai.xm.network.http.d.b(com.sankuai.xm.file.proxy.b.b().a(c));
        for (Map.Entry<String, List<String>> entry : bVar.c().entrySet()) {
            if (entry.getValue().size() > 0) {
                b.a(entry.getKey(), entry.getValue().get(0));
            }
        }
        b.b("GET");
        b.a(30000);
        b.b(30000);
        com.sankuai.xm.file.util.b.b("SimpleDownloadTask::redirect => url=" + this.n + ", code = 302, new url:" + c, new Object[0]);
        return b;
    }

    @Override // com.sankuai.xm.file.transfer.download.b
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab856faef86c6e7bdd9d921e48d51d5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab856faef86c6e7bdd9d921e48d51d5")).booleanValue();
        }
        long size = this.d.getFileInfo().getSize();
        if (size == -1 || size == 0) {
            return true;
        }
        if (!k.o(this.p)) {
            com.sankuai.xm.file.util.b.d("SimpleDownloadTask::checkFileLength noExist=>cachePath :%s", this.p);
            return false;
        }
        long p = k.p(this.p);
        if (this.r) {
            size = CryptoProxy.c().a(Long.valueOf(size), 0);
        }
        if (p == size) {
            com.sankuai.xm.file.util.b.b("SimpleDownloadTask::checkFileLength => success length is %d", Long.valueOf(p));
            return true;
        }
        com.sankuai.xm.file.util.b.d("SimpleDownloadTask::checkFileLength => length is %s ,size is %s , path is %s, downloadUrl is: %s", Long.valueOf(p), Long.valueOf(size), this.p, this.n);
        return false;
    }

    @Override // com.sankuai.xm.file.transfer.download.b
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc44188b975fa40be5ab0980bb1b5ce2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc44188b975fa40be5ab0980bb1b5ce2")).booleanValue();
        }
        String str = this.p;
        String str2 = this.o;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.file.util.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51a89d74812be26c77cdd837c8bd7dc4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51a89d74812be26c77cdd837c8bd7dc4")).booleanValue() : k.e(str, str2)) {
            com.sankuai.xm.file.util.b.b("DownloadTask::finishDownload => move success path is %s cache file is %s", this.o, this.p);
            return true;
        }
        com.sankuai.xm.file.util.b.d("DownloadTask::finishDownload => move failed path is %s cache file is %s", this.o, this.p);
        return false;
    }

    @Override // com.sankuai.xm.file.transfer.download.b
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f86cacee077e4b612423fcf59e5c974", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f86cacee077e4b612423fcf59e5c974")).booleanValue();
        }
        com.sankuai.xm.file.util.b.b("DownloadTask::removeCache => path is %s", this.p);
        return k.t(this.p);
    }
}
