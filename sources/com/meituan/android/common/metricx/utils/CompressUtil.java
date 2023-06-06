package com.meituan.android.common.metricx.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CompressUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static byte[] stringToGzipData(String str) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ea55fb7e6c32f00f42ad70b1f3405d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ea55fb7e6c32f00f42ad70b1f3405d2");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (IOException unused) {
            gZIPOutputStream = null;
        } catch (Throwable th) {
            th = th;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream.write(str.getBytes("UTF-8"));
            gZIPOutputStream.flush();
            byteArrayOutputStream.close();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            IOUtils.close(byteArrayOutputStream);
            IOUtils.close(gZIPOutputStream);
            return byteArray;
        } catch (IOException unused2) {
            IOUtils.close(byteArrayOutputStream);
            IOUtils.close(gZIPOutputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.close(byteArrayOutputStream);
            IOUtils.close(gZIPOutputStream);
            throw th;
        }
    }

    public static void stringToGzipData(String str, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {str, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72cb9ca3e7b2a302fb94daaa4dccb9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72cb9ca3e7b2a302fb94daaa4dccb9c1");
        } else if (TextUtils.isEmpty(str) || outputStream == null) {
        } else {
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (IOException unused) {
                gZIPOutputStream = null;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream.write(str.getBytes("UTF-8"));
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                IOUtils.close(gZIPOutputStream);
            } catch (IOException unused2) {
                IOUtils.close(gZIPOutputStream);
            } catch (Throwable th2) {
                th = th2;
                IOUtils.close(gZIPOutputStream);
                throw th;
            }
        }
    }

    public static String unGzipToString(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStreamReader inputStreamReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bdd54da9cbd4865e13ec4e398c710961", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bdd54da9cbd4865e13ec4e398c710961");
        }
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                inputStreamReader = new InputStreamReader(gZIPInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    String sb2 = sb.toString();
                                    IOUtils.close(gZIPInputStream);
                                    IOUtils.close(inputStreamReader);
                                    IOUtils.close(bufferedReader);
                                    return sb2;
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            IOUtils.close(gZIPInputStream);
                            IOUtils.close(inputStreamReader);
                            IOUtils.close(bufferedReader);
                            return null;
                        }
                    } catch (Throwable th) {
                        inputStreamReader2 = inputStreamReader;
                        th = th;
                        IOUtils.close(gZIPInputStream);
                        IOUtils.close(inputStreamReader2);
                        IOUtils.close(bufferedReader);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (Throwable th2) {
                    inputStreamReader2 = inputStreamReader;
                    th = th2;
                    bufferedReader = null;
                    IOUtils.close(gZIPInputStream);
                    IOUtils.close(inputStreamReader2);
                    IOUtils.close(bufferedReader);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Exception e4) {
            e = e4;
            inputStreamReader = null;
            gZIPInputStream = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            gZIPInputStream = null;
            bufferedReader = null;
        }
    }
}
