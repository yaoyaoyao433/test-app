package com.dianping.nvnetwork.tunnel.tool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.security.Key;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Key a(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "862c9f994092c26eb84b9d83c437a3ac", 6917529027641081856L) ? (Key) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "862c9f994092c26eb84b9d83c437a3ac") : SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr));
    }
}
