package com.meituan.android.common.kitefly.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.Deflater;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonUtils {
    public static String TOKEN;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long convertToMills(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a4e6eb5a0e8a7de9bd5ba7562e5c984", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a4e6eb5a0e8a7de9bd5ba7562e5c984")).longValue() : j < 1000000000000L ? j * 1000 : j;
    }

    public static String obtainToken(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "753971e3ca61b6373fbf066958767e22", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "753971e3ca61b6373fbf066958767e22");
        }
        if (TextUtils.isEmpty(TOKEN)) {
            if (Babel.getBabelConfig() != null) {
                TOKEN = Babel.getBabelConfig().getToken();
            } else {
                TOKEN = "";
            }
        }
        return TOKEN;
    }

    public static byte[] deflateCompress(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b553061f95ef6456c3e1541cda938eb0", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b553061f95ef6456c3e1541cda938eb0");
        }
        Deflater deflater = new Deflater(i);
        deflater.setInput(bArr);
        deflater.finish();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            try {
                try {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                IOUtils.close(byteArrayOutputStream);
                throw th;
            }
        }
        byteArrayOutputStream.flush();
        deflater.end();
        IOUtils.close(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String getDate(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "203d60aebf724829802808d575e6e62f", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "203d60aebf724829802808d575e6e62f") : new SimpleDateFormat("yyyy-MM-dd").format(new Date(convertToMills(j)));
    }
}
