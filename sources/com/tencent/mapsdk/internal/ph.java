package com.tencent.mapsdk.internal;

import android.util.Log;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.internal.go;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ph {
    private static final String a = "UTF-8";
    private WeakReference<pj> b;
    private List<FileUpdateReq> c;
    private String d;
    private String e;
    private String f;
    private int g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[LOOP:0: B:8:0x0039->B:56:0x00fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> a(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq r8, com.tencent.mapsdk.internal.pj r9) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ph.a(java.lang.String, java.lang.String, java.lang.String, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq, com.tencent.mapsdk.internal.pj):java.util.List");
    }

    private List<FileUpdateRsp> a(CSFileUpdateReq cSFileUpdateReq) {
        try {
            NetResponse configFileUpdate = ((cv) ((dj) ck.a(dj.class)).h()).configFileUpdate(gy.i(), gy.d(), gy.l(), gy.g(), this.f, cSFileUpdateReq.toByteArray("UTF-8"));
            if (configFileUpdate != null && configFileUpdate.data != null) {
                m mVar = new m(configFileUpdate.data);
                mVar.a("UTF-8");
                SCFileUpdateRsp sCFileUpdateRsp = new SCFileUpdateRsp();
                sCFileUpdateRsp.readFrom(mVar);
                kj.c("net", "scrsp.iRet = " + sCFileUpdateRsp.iRet);
                if (sCFileUpdateRsp.iRet == 0) {
                    return sCFileUpdateRsp.vItems;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("rsp = ");
            sb.append(configFileUpdate != null ? Integer.valueOf(configFileUpdate.statusCode) : StringUtil.NULL);
            kj.c("net", sb.toString());
            return null;
        } catch (Exception e) {
            kj.c(Log.getStackTraceString(e));
            return null;
        }
    }

    private go.c a(FileUpdateRsp fileUpdateRsp) {
        if (fileUpdateRsp == null || fileUpdateRsp.iRet != 0) {
            return null;
        }
        String str = fileUpdateRsp.sName;
        char c = 65535;
        switch (str.hashCode()) {
            case -1319508241:
                if (str.equals(eh.n)) {
                    c = 3;
                    break;
                }
                break;
            case -1091367180:
                if (str.equals(eh.m)) {
                    c = 2;
                    break;
                }
                break;
            case -503063473:
                if (str.equals(eh.p)) {
                    c = 5;
                    break;
                }
                break;
            case 178735484:
                if (str.equals(eh.j)) {
                    c = 7;
                    break;
                }
                break;
            case 204802075:
                if (str.equals(eh.l)) {
                    c = 1;
                    break;
                }
                break;
            case 451944782:
                if (str.equals("poi_icon")) {
                    c = 6;
                    break;
                }
                break;
            case 1366209438:
                if (str.equals(eh.i)) {
                    c = 0;
                    break;
                }
                break;
            case 1864531656:
                if (str.equals(eh.o)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return a(fileUpdateRsp, this.d, false);
            case 6:
                return a(fileUpdateRsp, this.d, true);
            case 7:
                return a(fileUpdateRsp, this.e, true);
            default:
                return null;
        }
    }

    private go.c a(FileUpdateRsp fileUpdateRsp, String str, boolean z) {
        if (fileUpdateRsp.iFileUpdated != 1) {
            return null;
        }
        String str2 = fileUpdateRsp.sName;
        if (str2.equals(eh.i)) {
            str2 = eh.a;
        } else if (str2.equals(eh.l)) {
            str2 = eh.b;
        } else if (str2.equals(eh.m)) {
            str2 = eh.c;
        } else if (str2.equals(eh.n)) {
            str2 = eh.e;
        } else if (str2.equals(eh.o)) {
            str2 = eh.f;
        } else if (str2.equals(eh.p)) {
            str2 = eh.h;
        }
        File file = new File(str + str2);
        go.c a2 = a(str2, fileUpdateRsp.sUpdateUrl, file);
        kj.c("net", "fileUpdateRsp.sName = " + fileUpdateRsp.sName);
        if (a2 != null) {
            a2.a = fileUpdateRsp.sName;
            return a2;
        }
        try {
            String a3 = ks.a(file);
            kj.c("net", "fileMd5 = ".concat(String.valueOf(a3)));
            if (!fileUpdateRsp.sMd5.equals(a3)) {
                go.c cVar = new go.c();
                cVar.a = fileUpdateRsp.sName;
                cVar.c = fileUpdateRsp.sMd5;
                cVar.d = a3;
                kj.c("net", "error md5 1");
                return cVar;
            }
            if (z) {
                try {
                    kf.b(file, file.getParent());
                    file.delete();
                } catch (Throwable th) {
                    kj.c(th.getMessage());
                    go.c cVar2 = new go.c();
                    cVar2.a = fileUpdateRsp.sName;
                    kj.c("net", "error unzip");
                    return cVar2;
                }
            }
            if (this.b != null && this.b.get() != null) {
                this.b.get().a = true;
            }
            return null;
        } catch (Exception e) {
            kj.c(e.getMessage());
            go.c cVar3 = new go.c();
            cVar3.a = fileUpdateRsp.sName;
            kj.c("net", "error md5 2 " + e.getMessage());
            return cVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.tencent.mapsdk.internal.go.c a(java.lang.String r7, java.lang.String r8, java.io.File r9) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ph.a(java.lang.String, java.lang.String, java.io.File):com.tencent.mapsdk.internal.go$c");
    }

    private static String a(String str) {
        return str.equals(eh.i) ? eh.a : str.equals(eh.l) ? eh.b : str.equals(eh.m) ? eh.c : str.equals(eh.n) ? eh.e : str.equals(eh.o) ? eh.f : str.equals(eh.p) ? eh.h : str;
    }

    private void a(go.c cVar) {
        pj pjVar;
        bh bhVar;
        if (this.b == null || (pjVar = this.b.get()) == null) {
            return;
        }
        List<WeakReference<bh>> list = pj.e.get(pjVar.a());
        WeakReference[] weakReferenceArr = list == null ? null : (WeakReference[]) list.toArray(new WeakReference[list.size()]);
        if (weakReferenceArr == null) {
            return;
        }
        for (int i = 0; i < weakReferenceArr.length; i++) {
            if (weakReferenceArr[i] != null && (bhVar = (bh) weakReferenceArr[i].get()) != null && bhVar.b != null && bhVar.b.aB != null) {
                gs gsVar = bhVar.b.aB.d;
                if (gsVar == null) {
                    return;
                }
                cVar.b -= gsVar.q();
                gsVar.a().a(cVar);
            }
        }
    }

    private FileUpdateReq b(String str) {
        if (this.c == null || this.c.isEmpty()) {
            return null;
        }
        for (FileUpdateReq fileUpdateReq : this.c) {
            if (hb.a(fileUpdateReq.sName, str)) {
                return fileUpdateReq;
            }
        }
        return null;
    }
}
