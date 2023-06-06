package com.meituan.android.common.unionid.oneid.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.SecureRandom;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TempIDGenerator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String generate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a551ade254c213bec11d35a7cfdaaf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a551ade254c213bec11d35a7cfdaaf2");
        }
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[50];
        byte[] bArr2 = new byte[24];
        byte[] bArr3 = new byte[24];
        secureRandom.nextBytes(bArr2);
        secureRandom.nextBytes(bArr3);
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr2[i] & 15);
            bArr3[i] = (byte) (bArr3[i] & 15);
        }
        System.arraycopy(bArr2, 0, bArr, 0, 24);
        System.arraycopy(bArr3, 0, bArr, 26, 24);
        handleBytes(bArr2);
        handleBytes(bArr3);
        byte checker = getChecker(bArr2);
        byte checker2 = getChecker(bArr3);
        bArr[24] = checker;
        bArr[25] = checker2;
        return byteArrayToHexString(bArr);
    }

    private static void handleBytes(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0de2aa1210ca6b2d33e232138cccdfdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0de2aa1210ca6b2d33e232138cccdfdc");
            return;
        }
        for (int i = 0; i < bArr.length; i += 2) {
            bArr[i] = (byte) (bArr[i] * 2);
            while (bArr[i] >= 10) {
                bArr[i] = (byte) ((bArr[i] % 10) + ((bArr[i] / 10) % 10));
            }
        }
    }

    private static byte getChecker(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cf2310ab942df48e3a0457248492a9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cf2310ab942df48e3a0457248492a9b")).byteValue();
        }
        int i = 0;
        for (byte b : bArr) {
            i += b;
        }
        byte b2 = (byte) (10 - ((byte) (i % 10)));
        if (b2 == 10) {
            return (byte) 0;
        }
        return b2;
    }

    private static String byteArrayToHexString(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "037936b5ad1b757c21f1b857a30b8c03", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "037936b5ad1b757c21f1b857a30b8c03");
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            stringBuffer.append(Integer.toHexString(b));
        }
        return new String(stringBuffer);
    }
}
