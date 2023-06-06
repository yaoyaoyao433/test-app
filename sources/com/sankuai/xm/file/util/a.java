package com.sankuai.xm.file.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.m;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.integration.crypto.CryptoProxy;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1689a6ea0c1d1f130923cc96075697f5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1689a6ea0c1d1f130923cc96075697f5");
        }
        if (str2 == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(str2.getBytes(str3));
            return a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str, AtomicBoolean atomicBoolean) {
        Object[] objArr = {str, atomicBoolean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a3af2ac3a3f3fee65244705989cf45", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a3af2ac3a3f3fee65244705989cf45") : a(str, 0L, -1L, atomicBoolean);
    }

    public static String a(String str, long j, long j2, AtomicBoolean atomicBoolean) {
        InputStream q;
        int read;
        Object[] objArr = {str, new Long(j), new Long(j2), atomicBoolean};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04ccd6abd8374e3243178a9598668b93", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04ccd6abd8374e3243178a9598668b93");
        }
        long j3 = 0;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int i2 = (i <= 0 || 1024 <= j2) ? 1024 : (int) j2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Object[] objArr2 = {str, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a6e247b3c80dc05bf2f65f61f0855833", 6917529027641081856L)) {
                q = (InputStream) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a6e247b3c80dc05bf2f65f61f0855833");
            } else {
                q = k.q(str);
                if (CryptoProxy.c().d(str)) {
                    q = CryptoProxy.c().a(q, 1);
                }
            }
            inputStream = q;
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, messageDigest);
            if (j > 0) {
                digestInputStream.skip(j);
            }
            byte[] bArr = new byte[1024];
            while (!atomicBoolean.get() && (read = digestInputStream.read(bArr, 0, i2)) > 0) {
                j3 += read;
                if (j3 == j2) {
                    break;
                }
                i2 = (i <= 0 || j3 + 1024 <= j2) ? 1024 : (int) (j2 - j3);
            }
            return atomicBoolean.get() ? "" : a(digestInputStream.getMessageDigest().digest());
        } catch (IOException | NoSuchAlgorithmException e) {
            b.d("Encoder::fileMD5: path: %s, msg: %s", str, p.a(e));
            return "";
        } finally {
            m.a(inputStream);
        }
    }

    private static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1de5e3951a3b47d2aadb007b85ed927e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1de5e3951a3b47d2aadb007b85ed927e");
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append(b[(bArr[i] >> 4) & 15]);
            sb.append(b[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
