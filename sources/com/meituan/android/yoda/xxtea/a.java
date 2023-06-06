package com.meituan.android.yoda.xxtea;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final byte[] b = "pangolin".getBytes();

    private static Cipher a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b93486ea82c7e7e02dad0274e3f41a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cipher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b93486ea82c7e7e02dad0274e3f41a7");
        }
        try {
            return Cipher.getInstance("AES/GCM/NoPadding");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025e  */
    @android.support.annotation.RequiresApi(api = 19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] a(byte[] r28, byte[] r29, byte[] r30) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.xxtea.a.a(byte[], byte[], byte[]):byte[]");
    }

    public final byte[] a(byte[] bArr, String str, String str2) throws GeneralSecurityException {
        Object[] objArr = {bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c3098615a4f7f0915a6bf9303ef59f", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c3098615a4f7f0915a6bf9303ef59f") : a(bArr, Base64.decode(str, 0), Base64.decode(str2, 0));
    }

    private byte[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796b15c3387480c5aceff16670965e35", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796b15c3387480c5aceff16670965e35") : new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }
}
