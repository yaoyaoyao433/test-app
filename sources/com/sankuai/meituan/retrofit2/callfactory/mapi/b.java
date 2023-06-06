package com.sankuai.meituan.retrofit2.callfactory.mapi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str, Charset charset) {
        boolean z;
        int i;
        int i2 = 0;
        Object[] objArr = {str, charset};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edcffaeafc7a93f00d7674e2ceee9796", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edcffaeafc7a93f00d7674e2ceee9796");
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (charset == null) {
            throw new RuntimeException("Charset must not be null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        boolean z2 = false;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt == '%') {
                i = i2 + 2;
                if (i < length) {
                    char charAt2 = str.charAt(i2 + 1);
                    char charAt3 = str.charAt(i);
                    int digit = Character.digit(charAt2, 16);
                    int digit2 = Character.digit(charAt3, 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("Invalid encoded sequence \"" + str.substring(i2) + CommonConstant.Symbol.DOUBLE_QUOTES);
                    }
                    byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                    z = true;
                } else {
                    throw new IllegalArgumentException("Invalid encoded sequence \"" + str.substring(i2) + CommonConstant.Symbol.DOUBLE_QUOTES);
                }
            } else {
                byteArrayOutputStream.write(charAt);
                z = z2;
                i = i2;
            }
            i2 = i + 1;
            z2 = z;
        }
        return z2 ? new String(byteArrayOutputStream.toByteArray(), charset) : str;
    }
}
