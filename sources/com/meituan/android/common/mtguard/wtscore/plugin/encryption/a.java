package com.meituan.android.common.mtguard.wtscore.plugin.encryption;

import android.text.TextUtils;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.meituan.android.common.mtguard.wtscore.plugin.encryption.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0230a extends Enum<C0230a> {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0230a(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b851297f01728abe77bad02a539c002", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b851297f01728abe77bad02a539c002");
            }
        }

        private static int[] a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (int[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a326f3640f406ab6fa13816d3f99e83", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a326f3640f406ab6fa13816d3f99e83") : c.clone());
        }
    }

    public static byte[] a(byte[] bArr, String str, int i) {
        Object obj;
        Object[] objArr = {bArr, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50f5ba01074c2598475051b0bef99fa7", 6917529027641081856L)) {
            obj = PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50f5ba01074c2598475051b0bef99fa7");
        } else if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            Object[] main3 = NBridge.main3(i == C0230a.b ? 31 : 30, new Object[]{bArr, str});
            if (main3 == null) {
                return null;
            }
            if (main3[0] instanceof Integer) {
                MTGuardLog.setErrorLogan(new RuntimeException("crypt failed errno: " + main3[0]));
                return null;
            }
            obj = main3[0];
        }
        return (byte[]) obj;
    }
}
