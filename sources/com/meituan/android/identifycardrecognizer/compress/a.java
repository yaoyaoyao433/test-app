package com.meituan.android.identifycardrecognizer.compress;

import com.huawei.hms.utils.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private final long d;

    public a(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d77ea36c8284b0d53fda153b53656fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d77ea36c8284b0d53fda153b53656fe");
            return;
        }
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            this.d = FileUtil.LOCAL_REPORT_FILE_MAX_SIZE;
        } else {
            this.d = j;
        }
        this.c = str2;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0324 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01d6 A[ADDED_TO_REGION, EDGE_INSN: B:184:0x01d6->B:88:0x01d6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb A[Catch: all -> 0x024d, Exception -> 0x0252, TryCatch #18 {Exception -> 0x0252, all -> 0x024d, blocks: (B:34:0x00de, B:36:0x00eb, B:39:0x00f3, B:41:0x00fb, B:43:0x011d, B:81:0x0192, B:44:0x0129, B:46:0x0131, B:47:0x0133, B:49:0x0137, B:52:0x0140, B:80:0x0188, B:65:0x0163, B:68:0x0168, B:74:0x0176, B:77:0x017b, B:78:0x017e), top: B:182:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d A[Catch: all -> 0x024d, Exception -> 0x0252, TryCatch #18 {Exception -> 0x0252, all -> 0x024d, blocks: (B:34:0x00de, B:36:0x00eb, B:39:0x00f3, B:41:0x00fb, B:43:0x011d, B:81:0x0192, B:44:0x0129, B:46:0x0131, B:47:0x0133, B:49:0x0137, B:52:0x0140, B:80:0x0188, B:65:0x0163, B:68:0x0168, B:74:0x0176, B:77:0x017b, B:78:0x017e), top: B:182:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129 A[Catch: all -> 0x024d, Exception -> 0x0252, TryCatch #18 {Exception -> 0x0252, all -> 0x024d, blocks: (B:34:0x00de, B:36:0x00eb, B:39:0x00f3, B:41:0x00fb, B:43:0x011d, B:81:0x0192, B:44:0x0129, B:46:0x0131, B:47:0x0133, B:49:0x0137, B:52:0x0140, B:80:0x0188, B:65:0x0163, B:68:0x0168, B:74:0x0176, B:77:0x017b, B:78:0x017e), top: B:182:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec A[Catch: all -> 0x0240, Exception -> 0x0242, TRY_LEAVE, TryCatch #21 {Exception -> 0x0242, all -> 0x0240, blocks: (B:89:0x01e0, B:91:0x01ec), top: B:176:0x01e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.android.identifycardrecognizer.compress.b r19) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.identifycardrecognizer.compress.a.a(com.meituan.android.identifycardrecognizer.compress.b):void");
    }
}
