package com.meituan.android.mrn.utils;

import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static boolean a(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "563f59ebb89bd999dbd4b1177e299930", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "563f59ebb89bd999dbd4b1177e299930")).booleanValue();
        }
        try {
            InputStream b = dioFile.b();
            byte[] bArr = new byte[4];
            b.read(bArr);
            boolean z = -83111451 == com.meituan.dio.utils.a.a(bArr, 0, false);
            if (b != null) {
                b.close();
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }

    private static boolean a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c89df113d702a52e3052879776578f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c89df113d702a52e3052879776578f6")).booleanValue();
        }
        try {
            byte[] bArr = new byte[4];
            inputStream.read(bArr);
            return com.meituan.dio.utils.a.a(bArr, 0, false) == -83111451;
        } catch (IOException unused) {
            return false;
        }
    }

    public static int b(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "361955096738582e1e7cbeb879529e09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "361955096738582e1e7cbeb879529e09")).intValue();
        }
        try {
            InputStream b = dioFile.b();
            if (!a(b)) {
                if (b != null) {
                    b.close();
                }
                return -1;
            }
            b.skip(4L);
            byte[] bArr = new byte[4];
            b.read(bArr);
            int a2 = com.meituan.dio.utils.a.a(bArr, 0, false);
            if (b != null) {
                b.close();
            }
            return a2;
        } catch (IOException unused) {
            return -1;
        }
    }
}
