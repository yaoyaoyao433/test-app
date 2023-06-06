package com.meituan.android.edfu.mvex.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String d;

    public static char[] a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04e3f5fcd86d56f7b05a5370f5e331fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04e3f5fcd86d56f7b05a5370f5e331fa");
        }
        Object[] objArr2 = {bArr, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f284ae5498af03877f7ee436ac7d943", RobustBitConfig.DEFAULT_VALUE) ? (char[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5f284ae5498af03877f7ee436ac7d943") : a(bArr, b);
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        Object[] objArr = {bArr, cArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "367cee415bf76cf5fca14cfc81998d1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "367cee415bf76cf5fca14cfc81998d1a");
        }
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933c917be28192b83019b98f5d22894b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933c917be28192b83019b98f5d22894b");
        }
        return super.toString() + "[charsetName=" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
