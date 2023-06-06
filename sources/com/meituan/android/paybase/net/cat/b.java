package com.meituan.android.paybase.net.cat;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.r;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(String str, int i) {
        JSONObject jSONObject;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a669bcda9a175871bf8b748e87df3256", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a669bcda9a175871bf8b748e87df3256")).intValue();
        }
        if (str == null) {
            return -1301;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                String string = jSONObject2.getString("status");
                if (TextUtils.equals("success", string)) {
                    if (jSONObject2.get("data") != null) {
                        return i;
                    }
                } else if (TextUtils.equals("fail", string) && (jSONObject = jSONObject2.getJSONObject("error")) != null) {
                    Object[] objArr2 = {jSONObject, "code"};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    int intValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fdf21723d2dc1b6540e4c33e28684b4b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fdf21723d2dc1b6540e4c33e28684b4b")).intValue() : jSONObject.getInt("code");
                    return (intValue < -1000 || intValue > 600) ? intValue : intValue + 10000;
                }
            } catch (JSONException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorUtils_getCode").a("message", e.getMessage()).b);
            }
            return -1302;
        } catch (JSONException e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorUtils_getCode").a("message", e2.getMessage()).b);
            return -1302;
        }
    }

    public static int a(x xVar) {
        Object[] objArr = {xVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae9632186fa7027043354c9befd208ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae9632186fa7027043354c9befd208ed")).intValue();
        }
        if (xVar == null) {
            return 0;
        }
        return (int) (a(xVar.e()) + a(xVar.d()) + xVar.a().toString().getBytes().length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e47a633f2e67c268d7d1dd1c2041aae2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e47a633f2e67c268d7d1dd1c2041aae2")).intValue();
        }
        if (rVar == null || rVar.a() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int a2 = rVar.a();
        for (int i = 0; i < a2; i++) {
            sb.append(rVar.a(i));
            sb.append(rVar.b(i));
        }
        return sb.toString().getBytes().length;
    }

    private static long a(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3615e42924fd78c9ee34adcb00073869", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3615e42924fd78c9ee34adcb00073869")).longValue();
        }
        if (yVar == null) {
            return 0L;
        }
        try {
            return yVar.contentLength();
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorUtils_computeRequestBodySize").a("message", e.getMessage()).b);
            return 0L;
        }
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bed0c5a6f26278e27b7f63d8bd1fa34e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bed0c5a6f26278e27b7f63d8bd1fa34e")).intValue() : (!"http".equalsIgnoreCase(str) && "https".equalsIgnoreCase(str)) ? 8 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(byte[] bArr, Charset charset, String str) {
        Object[] objArr = {bArr, charset, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f544747931be2b6bcda40edb6114a250", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f544747931be2b6bcda40edb6114a250");
        }
        if (str != null) {
            try {
                if ("gzip".equalsIgnoreCase(str)) {
                    return a(bArr);
                }
            } catch (Exception e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorUtils_getBodyStr").a("message", e.getMessage()).b);
                return null;
            }
        }
        return new String(bArr, charset);
    }

    private static String a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "706296c54fbcf8d75d14c87951cba6fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "706296c54fbcf8d75d14c87951cba6fa");
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                StringWriter stringWriter = new StringWriter();
                InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
                Object[] objArr2 = {inputStreamReader, stringWriter};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "90eec7b76ae9f15f9eb4c8b5158b5949", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "90eec7b76ae9f15f9eb4c8b5158b5949")).intValue();
                } else {
                    int i = (a(inputStreamReader, stringWriter) > 2147483647L ? 1 : (a(inputStreamReader, stringWriter) == 2147483647L ? 0 : -1));
                }
                String stringWriter2 = stringWriter.toString();
                gZIPInputStream.close();
                return stringWriter2;
            } catch (Throwable th) {
                th = th;
                if (gZIPInputStream != null) {
                    gZIPInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream = null;
        }
    }

    private static long a(Reader reader, Writer writer) throws RuntimeException {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65094cd0bff8dc33de6da66086eb263a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65094cd0bff8dc33de6da66086eb263a")).longValue();
        }
        try {
            char[] cArr = new char[4096];
            long j = 0;
            while (true) {
                int read = reader.read(cArr);
                if (-1 == read) {
                    return j;
                }
                writer.write(cArr, 0, read);
                j += read;
            }
        } catch (IOException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CatMonitorUtils_copyLarge").a("message", e.getMessage()).b);
            throw new RuntimeException(e);
        }
    }
}
