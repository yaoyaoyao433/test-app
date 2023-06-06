package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.unionpay.tsmservice.data.Constant;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class IOUtils {
    public static final String CONTENT_TYPE = "Content-Type";
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final String SEC_YODA_KEY = "sec-yoda-check";
    public static final String SEC_YODA_VALUE = "true";
    public static final String UTF_8 = "UTF-8";
    public static final String YODA_CALLBACK_NAME = "com.meituan.android.yoda.YodaResponseListener";
    public static final String YODA_CONFIRM_NAME = "com.meituan.android.yoda.YodaConfirm";
    public static final String YODA_FLAG = "native";
    public static final String YODA_READY = "yodaReady";
    public static final String YODA_VERSION = "yodaVersion";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void close(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8ff8dcd25c34e28909cd6939ffda670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8ff8dcd25c34e28909cd6939ffda670");
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public static void close(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "508cdc55790ee8fd5a60e6f4c3796278", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "508cdc55790ee8fd5a60e6f4c3796278");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f47fe11f410f4bcbf26f9769598fc722", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f47fe11f410f4bcbf26f9769598fc722")).intValue();
        }
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    private static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bd7ddb138037d6c586af1a1467cf8a8", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bd7ddb138037d6c586af1a1467cf8a8")).longValue();
        }
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static boolean getYodaReady(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "168cad1b0adcee227a2d9656a6159f91", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "168cad1b0adcee227a2d9656a6159f91")).booleanValue();
        }
        try {
            Class<?> cls = Class.forName(str);
            return ((Boolean) cls.getMethod("isInterceptReady", new Class[0]).invoke(cls, new Object[0])).booleanValue();
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return false;
        }
    }

    public static String getYodaVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0eb46a13612241cd5f2ba9f4431f9f1b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0eb46a13612241cd5f2ba9f4431f9f1b");
        }
        try {
            Class<?> cls = Class.forName(str);
            String str2 = (String) cls.getMethod("getVersion", new Class[0]).invoke(cls, new Object[0]);
            return (str2.contains("1.18.0.") && str2.contains("-intercept")) ? Integer.valueOf(str2.replace("1.18.0.", "").replace("-intercept", "").replace("-test", "")).intValue() < 143 ? "" : str2 : str2;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    public static void openYoda(Context context, String str, String str2, String str3) {
        JSONObject jSONObject;
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c40ff4f7c1f7c45f10e684a5390a9cae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c40ff4f7c1f7c45f10e684a5390a9cae");
        } else if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("yodaCode") && jSONObject2.getInt("yodaCode") == 406 && jSONObject2.has(Constant.KEY_CUSTOM_DATA) && (jSONObject = jSONObject2.getJSONObject(Constant.KEY_CUSTOM_DATA)) != null && jSONObject.has(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                    String string = jSONObject.getString(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    MTGuardLog.setLogan("start yoda requestCode = ".concat(String.valueOf(string)));
                    Class<?> cls = Class.forName(str2);
                    cls.getMethod("interceptConfirm", Context.class, String.class, Class.forName(str3)).invoke(cls, context, string, null);
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86fc734427b84fadc632f76df3e27843", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86fc734427b84fadc632f76df3e27843");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
