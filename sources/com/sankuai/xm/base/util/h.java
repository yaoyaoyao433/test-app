package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] a2;
        Object[] objArr = {inputStream, outputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "399ae7b904a1beda019e77f66eb898e3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "399ae7b904a1beda019e77f66eb898e3")).booleanValue();
        }
        try {
            ExifInterface exifInterface = new ExifInterface(inputStream);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            exifInterface.a("Orientation", sb.toString());
            Object[] objArr2 = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = ExifInterface.a;
            if (PatchProxy.isSupport(objArr2, exifInterface, changeQuickRedirect2, false, "1a724bc196969884b3deadf49ec19f33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, exifInterface, changeQuickRedirect2, false, "1a724bc196969884b3deadf49ec19f33");
            } else if (!exifInterface.n || exifInterface.k != 4) {
                throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
            } else {
                if (exifInterface.j == null) {
                    throw new IOException("ExifInterface input stream cannot be null.");
                }
                if (outputStream == null) {
                    throw new IOException("ExifInterface output stream cannot be null.");
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = ExifInterface.a;
                if (PatchProxy.isSupport(objArr3, exifInterface, changeQuickRedirect3, false, "3a6d151f5ca3c9e8ff73fe6bc45873c3", 6917529027641081856L)) {
                    a2 = (byte[]) PatchProxy.accessDispatch(objArr3, exifInterface, changeQuickRedirect3, false, "3a6d151f5ca3c9e8ff73fe6bc45873c3");
                } else {
                    if (exifInterface.m != 6 && exifInterface.m != 7) {
                        a2 = null;
                    }
                    a2 = exifInterface.a();
                }
                exifInterface.l = a2;
                if (exifInterface.j.markSupported()) {
                    exifInterface.j.reset();
                    exifInterface.a(exifInterface.j, outputStream);
                    ExifInterface.a((Closeable) exifInterface.j);
                    ExifInterface.a((Closeable) outputStream);
                    exifInterface.l = null;
                } else {
                    throw new IOException("Cannot save attributes from inputstream without mark/reset support");
                }
            }
            return true;
        } catch (Exception e) {
            com.sankuai.xm.log.c.a("ExifUtils", e);
            return false;
        }
    }
}
