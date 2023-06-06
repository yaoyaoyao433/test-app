package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static PublicKey a(byte[] bArr, ECParameterSpec eCParameterSpec) throws GeneralSecurityException, IOException {
        Object[] objArr = {bArr, eCParameterSpec};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb1f286338bca03734a57b20b34574b7", RobustBitConfig.DEFAULT_VALUE) ? (PublicKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb1f286338bca03734a57b20b34574b7") : KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(a(bArr, eCParameterSpec.getCurve()), eCParameterSpec));
    }

    private static ECPoint a(byte[] bArr, EllipticCurve ellipticCurve) throws IOException {
        Object[] objArr = {bArr, ellipticCurve};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "460197732b359bffafa417ce6c5a5aee", RobustBitConfig.DEFAULT_VALUE)) {
            return (ECPoint) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "460197732b359bffafa417ce6c5a5aee");
        }
        if (bArr.length == 0 || bArr[0] != 4) {
            throw new IOException("Only uncompressed point format supported");
        }
        int length = (bArr.length - 1) / 2;
        if (length != ((ellipticCurve.getField().getFieldSize() + 7) >> 3)) {
            throw new IOException("Point does not match field size");
        }
        int i = length + 1;
        return new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, length + i)));
    }

    public static byte[] a(byte[] bArr) {
        int i = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c6a8245da232788944409d20a5aea13", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c6a8245da232788944409d20a5aea13");
        }
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        return i == 0 ? bArr : Arrays.copyOfRange(bArr, i, bArr.length);
    }
}
