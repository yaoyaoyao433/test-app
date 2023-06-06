package com.meituan.android.common.statistics.network;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.InnerDataBuilder.InnerDataManager;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkController {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RealResponse {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("status")
        public int status = -1;
    }

    public static boolean mockRegist(String str, Map<String, String> map) throws Exception {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e1184f885f9dc0717a199c5aedee425", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e1184f885f9dc0717a199c5aedee425")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("Statistics : NetworkController - url or body is null  ");
        }
        try {
            Response<Void> a = StatisticsApiRetrofit.getInstance().getMockRegist(str, map).a();
            if (a != null && a.b() == 200) {
                LogUtil.log("statistics", "扫码成功");
                return true;
            }
        } catch (Throwable th) {
            LogUtil.log("statistics", "Statistics : NetworkController - getRegister failes : " + th.toString());
        }
        return false;
    }

    public static void mockReport(String str, Map<String, String> map, String str2) throws Exception {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c2d00e75e39e94e21f9f3cc7e094112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c2d00e75e39e94e21f9f3cc7e094112");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new Exception("Statistics : NetworkController - url or body is null  ");
        } else {
            try {
                Response<Void> a = StatisticsApiRetrofit.getInstance().postMockData(str, map, al.a(str2.getBytes("UTF-8"), "application/json;charset=UTF-8")).a();
                if (a == null || a.b() != 200) {
                    return;
                }
                LogUtil.log("statistics", "上报服务器成功");
            } catch (Throwable th) {
                LogUtil.log("statistics", "NetworkController - mockReport failed : " + th.toString());
            }
        }
    }

    public static boolean quickReport(String str, String str2) throws Exception {
        int i = 2;
        boolean z = false;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Response<RealResponse> response = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e230ebc55bcfc833fabd3fed2dddf10", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e230ebc55bcfc833fabd3fed2dddf10")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.log("statistics", "quickReport: NetworkController --- url or body is null  ");
            return false;
        }
        byte[] gzipContent = gzipContent(str2, null);
        if (gzipContent == null) {
            return false;
        }
        ak a = al.a(gzipContent, "application/json;charset=UTF-8");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Call<RealResponse> postQuickData = StatisticsApiRetrofit.getInstance().postQuickData(str, a);
            while (true) {
                if (i <= 0) {
                    break;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                response = postQuickData.a();
                if (response != null) {
                    try {
                        if (200 == response.b()) {
                            if (200 == response.e().status) {
                                currentTimeMillis = currentTimeMillis2;
                                z = true;
                                break;
                            }
                            currentTimeMillis = currentTimeMillis2;
                        }
                    }
                }
                postQuickData = postQuickData.d();
                Thread.sleep(100L);
                i--;
                currentTimeMillis = currentTimeMillis2;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtil.log("statistics", "quickReport: NetworkController - report: " + th.toString());
        }
        if (!z) {
            CatMonitorManager.startCatMonitorService(str, a, response, System.currentTimeMillis() - currentTimeMillis);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean report(java.lang.String r19, java.lang.String r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.network.NetworkController.report(java.lang.String, java.lang.String):boolean");
    }

    public static boolean ping(String str, byte[] bArr) {
        boolean z = true;
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23f31d7a7741265497c6bdc62067a6d2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23f31d7a7741265497c6bdc62067a6d2")).booleanValue();
        }
        ak a = al.a(bArr, "application/json;charset=UTF-8");
        try {
            Call<RealResponse> postData = StatisticsApiRetrofit.getInstance().postData(str, a);
            int i = 0;
            while (true) {
                long currentTimeMillis = System.currentTimeMillis();
                InnerDataManager.processDataOnNetworkStart(z);
                Response<RealResponse> a2 = postData.a();
                CatMonitorManager.getInstance().reportNetworkReport(str, a, a2, System.currentTimeMillis() - currentTimeMillis);
                if (a2 != null && 200 == a2.b()) {
                    if (200 == a2.e().status) {
                        return true;
                    }
                } else {
                    postData = postData.d();
                    Thread.sleep((long) (Math.pow(2.0d, i) * 5000.0d));
                    if (i < 6) {
                        i++;
                    }
                }
                z = true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.zip.GZIPOutputStream] */
    private static byte[] gzipContent(String str, String str2) {
        GZIPOutputStream gZIPOutputStream;
        String str3;
        StringBuilder sb;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9734107f2ee5316525c0d23fdf92ebb", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9734107f2ee5316525c0d23fdf92ebb");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ?? r0 = "UTF-8";
        ?? isEmpty = TextUtils.isEmpty(str2);
        if (isEmpty != 0) {
            str2 = "UTF-8";
        }
        try {
            try {
                r0 = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (UnsupportedEncodingException e) {
            e = e;
            r0 = 0;
            gZIPOutputStream = null;
        } catch (IOException e2) {
            e = e2;
            r0 = 0;
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            r0 = 0;
            gZIPOutputStream = null;
        }
        try {
            gZIPOutputStream = new GZIPOutputStream(r0);
            try {
                gZIPOutputStream.write(str.getBytes(str2));
                gZIPOutputStream.flush();
                r0.close();
                gZIPOutputStream.close();
                byte[] byteArray = r0.toByteArray();
                try {
                    r0.close();
                } catch (IOException e3) {
                    LogUtil.log("statistics", "RequestBody - gzipContent:" + e3.toString());
                }
                try {
                    gZIPOutputStream.close();
                    return byteArray;
                } catch (IOException e4) {
                    LogUtil.log("statistics", "RequestBody - gzipContent:" + e4.toString());
                    return byteArray;
                }
            } catch (UnsupportedEncodingException e5) {
                e = e5;
                LogUtil.log("statistics", "RequestBody - gzipContent:" + e.toString());
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e6) {
                        LogUtil.log("statistics", "RequestBody - gzipContent:" + e6.toString());
                    }
                }
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e7) {
                        e = e7;
                        str3 = "statistics";
                        sb = new StringBuilder("RequestBody - gzipContent:");
                        sb.append(e.toString());
                        LogUtil.log(str3, sb.toString());
                        return null;
                    }
                }
                return null;
            } catch (IOException e8) {
                e = e8;
                LogUtil.log("statistics", "RequestBody - gzipContent:" + e.toString());
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e9) {
                        LogUtil.log("statistics", "RequestBody - gzipContent:" + e9.toString());
                    }
                }
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e10) {
                        e = e10;
                        str3 = "statistics";
                        sb = new StringBuilder("RequestBody - gzipContent:");
                        sb.append(e.toString());
                        LogUtil.log(str3, sb.toString());
                        return null;
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                LogUtil.log("statistics", "RequestBody - gzipContent:" + th.toString());
                if (r0 != 0) {
                    try {
                        r0.close();
                    } catch (IOException e11) {
                        LogUtil.log("statistics", "RequestBody - gzipContent:" + e11.toString());
                    }
                }
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException e12) {
                        e = e12;
                        str3 = "statistics";
                        sb = new StringBuilder("RequestBody - gzipContent:");
                        sb.append(e.toString());
                        LogUtil.log(str3, sb.toString());
                        return null;
                    }
                }
                return null;
            }
        } catch (UnsupportedEncodingException e13) {
            e = e13;
            gZIPOutputStream = null;
        } catch (IOException e14) {
            e = e14;
            gZIPOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = null;
        }
    }

    private static long getWaitTimeExp(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca71bee18886aebb012a793f4a90b7ba", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca71bee18886aebb012a793f4a90b7ba")).longValue() : ((long) Math.pow(2.0d, i)) * 1000;
    }
}
