package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public class NVCandyInterceptor implements r {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public NVCandyInterceptor() {
    }

    public NVCandyInterceptor(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e5a0487b34edee13630c812a781154", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e5a0487b34edee13630c812a781154");
        } else {
            this.mContext = context;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    @Override // com.dianping.nvnetwork.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rx.d<com.dianping.nvnetwork.q> intercept(com.dianping.nvnetwork.r.a r14) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor.intercept(com.dianping.nvnetwork.r$a):rx.d");
    }
}
