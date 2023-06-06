package com.meituan.android.common.locate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static byte[] a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f05032f256cad98e7d71ca7840e64f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f05032f256cad98e7d71ca7840e64f4");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            LogUtils.a("ReporterUtils execute gz result: " + byteArray.length + ", original size: " + bArr.length);
            return byteArray;
        } catch (Exception e) {
            LogUtils.a(m.class, e);
            return null;
        }
    }
}
