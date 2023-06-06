package com.sankuai.meituan.mapsdk.mapcore.net;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static String b;
    private static String c;

    public static String a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2302373f67e7e730a92b90ed282d7fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2302373f67e7e730a92b90ed282d7fb");
        }
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (context != null) {
            b = context.getPackageName();
        }
        return b;
    }

    public static String b(@NonNull Context context) {
        String stringBuffer;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ae9eb13230febb6677aa2941112f25d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ae9eb13230febb6677aa2941112f25d");
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        if (context != null) {
            try {
                byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                Object[] objArr2 = {digest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2232c23c3fcbba219850854539eba992", RobustBitConfig.DEFAULT_VALUE)) {
                    stringBuffer = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2232c23c3fcbba219850854539eba992");
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    int length = digest.length;
                    for (int i = 0; i < length; i++) {
                        byte b2 = digest[i];
                        Object[] objArr3 = {Byte.valueOf(b2), stringBuffer2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "16f13aaa5f3a281f19346eb46746681d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "16f13aaa5f3a281f19346eb46746681d");
                        } else {
                            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                            stringBuffer2.append(cArr[(b2 & 240) >> 4]);
                            stringBuffer2.append(cArr[b2 & 15]);
                        }
                        if (i < length - 1) {
                            stringBuffer2.append(CommonConstant.Symbol.COLON);
                        }
                    }
                    stringBuffer = stringBuffer2.toString();
                }
                c = stringBuffer;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return c;
    }
}
