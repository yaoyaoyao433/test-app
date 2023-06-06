package com.dianping.nvlbservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b12e030f32e036ecc78e011ec785c16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b12e030f32e036ecc78e011ec785c16");
        }
        try {
            URL url = new URL(str);
            return url.getHost() + url.getPath();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        byte[] doFinal;
        Object[] objArr = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e42e41f6911cd85e2ce13829a4a659a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e42e41f6911cd85e2ce13829a4a659a5");
        }
        Object[] objArr2 = {bArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ec8c1ca7ee4894c8f075822496500e03", RobustBitConfig.DEFAULT_VALUE)) {
            doFinal = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ec8c1ca7ee4894c8f075822496500e03");
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            doFinal = cipher.doFinal(bArr);
        }
        int i = 0;
        for (int length = doFinal.length - 1; length >= 0 && doFinal[length] == 0; length--) {
            i++;
        }
        if (i > 0) {
            byte[] bArr4 = new byte[doFinal.length - i];
            System.arraycopy(doFinal, 0, bArr4, 0, bArr4.length);
            return bArr4;
        }
        return doFinal;
    }

    public static int a(m... mVarArr) {
        Object[] objArr = {mVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d26888b5fc83b61f9cd193fcba456a0b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d26888b5fc83b61f9cd193fcba456a0b")).intValue();
        }
        if (mVarArr == null) {
            return 0;
        }
        int i = 0;
        for (m mVar : mVarArr) {
            i |= mVar.g;
        }
        return i;
    }

    public static List<h> a(m mVar, Collection<h> collection) {
        Object[] objArr = {mVar, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03d657fff5afe197540c6acc89a189b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03d657fff5afe197540c6acc89a189b8");
        }
        if (mVar == null || collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (h hVar : collection) {
            if ((mVar.g & hVar.c) != 0) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08e3e8034a96d5440c7bae362f06fd9b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08e3e8034a96d5440c7bae362f06fd9b")).booleanValue() : str == null || str.isEmpty();
    }
}
