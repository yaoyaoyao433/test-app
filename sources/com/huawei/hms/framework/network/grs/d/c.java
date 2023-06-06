package com.huawei.hms.framework.network.grs.d;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static final String a = "c";

    public static String a(String str, Context context) {
        InputStream inputStream;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                    IoUtils.closeSecure(inputStream);
                    return str2;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            inputStream2 = inputStream;
            Logger.w(a, "local config file is not exist.filename is {%s}", str);
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStream);
            throw th;
        }
    }
}
