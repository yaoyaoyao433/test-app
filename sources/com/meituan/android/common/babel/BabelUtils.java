package com.meituan.android.common.babel;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BabelUtils {
    private static final String EC = "F\"k-`0'7P2X!eIBqTM)g?c_S=:Km6lQi4WzGNa8s(AE/@Y.D5^Hy~w>ZhJ[\\]$pLxb1|;f&*UR,j#n+%orVtu3C<v9{d}O";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Nullable
    public static String encrypt(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6b71b54953be641bac995fa5f1d5308", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6b71b54953be641bac995fa5f1d5308");
        }
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("01");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= '~' && charAt >= '!') {
                sb.append(EC.charAt(charAt - '!'));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
