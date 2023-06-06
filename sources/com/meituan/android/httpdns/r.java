package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface r {
    public static final r a = new r() { // from class: com.meituan.android.httpdns.r.1
        public static ChangeQuickRedirect b;

        @Override // com.meituan.android.httpdns.r
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be396a726e29894af41bf780616656a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be396a726e29894af41bf780616656a");
            } else if (h.a().e) {
                PrintStream printStream = System.out;
                printStream.println("HttpDnsService: " + str);
            }
        }
    };

    void a(String str);
}
