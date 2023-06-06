package com.meituan.android.quickpass.uptsm.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.r;
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
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "790ddf48320323a25cf2461b817741a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "790ddf48320323a25cf2461b817741a1")).intValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.optInt("code") != 0 ? jSONObject.optInt("code") : i;
        } catch (JSONException e) {
            e.printStackTrace();
            return i;
        }
    }

    private static long a(Reader reader, Writer writer) throws RuntimeException {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15d775a4422c9b265fbb2f4f3b1faf41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15d775a4422c9b265fbb2f4f3b1faf41")).longValue();
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
            throw new RuntimeException(e);
        }
    }

    private static String a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2fb84f4266b5c7b262c9401e2651a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2fb84f4266b5c7b262c9401e2651a18");
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                StringWriter stringWriter = new StringWriter();
                InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
                Object[] objArr2 = {inputStreamReader, stringWriter};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "40be030aec86d1ee2b04d551494355e9", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "40be030aec86d1ee2b04d551494355e9")).intValue();
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

    public static String a(byte[] bArr, Charset charset, String str) {
        Object[] objArr = {bArr, charset, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffdb6975312efc9ade5bf8b63c4bda8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffdb6975312efc9ade5bf8b63c4bda8c");
        }
        if (str != null) {
            try {
                if ("gzip".equalsIgnoreCase(str)) {
                    return a(bArr);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return new String(bArr, charset);
    }

    public static long a(y yVar) {
        Object[] objArr = {yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0addb442587a7f9e0c197cafc6673fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0addb442587a7f9e0c197cafc6673fa2")).longValue();
        }
        if (yVar == null) {
            return 0L;
        }
        try {
            return yVar.contentLength();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static int a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb14790d1fc23dd5883381444e5943b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb14790d1fc23dd5883381444e5943b5")).intValue();
        }
        if (rVar == null || rVar.a.length / 2 == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int length = rVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(rVar.a(i));
            sb.append(rVar.b(i));
        }
        return sb.toString().getBytes().length;
    }
}
