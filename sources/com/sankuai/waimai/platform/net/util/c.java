package com.sankuai.waimai.platform.net.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.r;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9802087e24cdc66188ff36f2df5c60f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9802087e24cdc66188ff36f2df5c60f");
        }
        if (str == null) {
            return null;
        }
        try {
            return new JsonParser().parse(str);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public static String a(byte[] bArr, Charset charset, String str) {
        Object[] objArr = {bArr, charset, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cd87f332d2703e54ab5209ccba398d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cd87f332d2703e54ab5209ccba398d7");
        }
        if (str != null) {
            try {
                if (str.equalsIgnoreCase("gzip")) {
                    return a(bArr);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return new String(bArr, charset);
    }

    private static String a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f32534ba1c5cea06ffe9a293fa0e965", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f32534ba1c5cea06ffe9a293fa0e965");
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                StringWriter stringWriter = new StringWriter();
                InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream);
                Object[] objArr2 = {inputStreamReader, stringWriter};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f95945b3c342b59bb521ca7833334683", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f95945b3c342b59bb521ca7833334683")).intValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c63a3db54af8c071fc93664faac59de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c63a3db54af8c071fc93664faac59de")).longValue();
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

    public static int a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54104da9547576593439cbe26d996bda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54104da9547576593439cbe26d996bda")).intValue();
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
