package com.sankuai.meituan.location.collector.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3e150460d269f8f9528d602fd97e4dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3e150460d269f8f9528d602fd97e4dc")).intValue();
        }
        long a2 = a(inputStream, outputStream, 1024);
        if (a2 > 2147483647L) {
            return -1;
        }
        return (int) a2;
    }

    private static long a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        Object[] objArr = {inputStream, outputStream, 1024};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0635506c22d742c42b7a69ebf3bde64b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0635506c22d742c42b7a69ebf3bde64b")).longValue() : a(inputStream, outputStream, new byte[1024]);
    }

    private static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        Object[] objArr = {inputStream, outputStream, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74734c76fbfb934821c10512553eeab2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74734c76fbfb934821c10512553eeab2")).longValue();
        }
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static String a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6558e155219fd544d636f9df1fe7b4a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6558e155219fd544d636f9df1fe7b4a1");
        }
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        while (true) {
            int read = inputStreamReader.read(cArr, 0, 1024);
            if (read < 0) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }
}
