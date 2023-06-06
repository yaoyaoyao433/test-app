package com.meituan.android.common.horn;

import android.os.Environment;
import android.os.StatFs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlobDownLoadUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static OkHttpClient client = new OkHttpClient();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #6 {Exception -> 0x00d9, blocks: (B:71:0x00d5, B:75:0x00dd), top: B:91:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean simpleDownload(java.lang.String r13, java.io.File r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.BlobDownLoadUtils.simpleDownload(java.lang.String, java.io.File):java.lang.Boolean");
    }

    private static long getRomSpace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "257fde6fa2da04ea26682a4c95aba330", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "257fde6fa2da04ea26682a4c95aba330")).longValue();
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }
}
