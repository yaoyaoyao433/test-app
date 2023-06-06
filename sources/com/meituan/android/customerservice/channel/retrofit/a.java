package com.meituan.android.customerservice.channel.retrofit;

import android.content.Context;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.customerservice.channel.upload.c;
import com.meituan.android.customerservice.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.al;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, byte[] bArr, int i, int i2, long j, String str2, String str3, String str4, boolean z, j jVar, c cVar, int i3) {
        Object[] objArr = {context, str, bArr, Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), jVar, cVar, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0f6429023de7881eb47256d6b1ee7af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0f6429023de7881eb47256d6b1ee7af");
            return;
        }
        com.meituan.android.customerservice.utils.c.a("uploadFile", "sessionId:" + str2 + " ,openId:" + str3 + " ,visitId:" + str4 + " ,isNative:" + z + " ,fileName=" + str + " ,partSize=" + i + " ,part=" + i2 + " ,fileId=" + j + " ,fileBytes=" + bArr.length);
        List<ae.b> arrayList = new ArrayList<>();
        arrayList.add(ae.b.a("files", str, al.a(bArr, i3 == 0 ? "image/jpeg" : "video/mpeg4")));
        arrayList.add(a("fileID", Long.valueOf(j)));
        arrayList.add(a(QuickReportConstants.CONFIG_FILE_NAME, str));
        arrayList.add(a("partSize", Integer.valueOf(i)));
        arrayList.add(a("part", Integer.valueOf(i2)));
        UploadService uploadService = (UploadService) a(b.a(context), cVar, 10L).a(UploadService.class);
        HashMap hashMap = new HashMap();
        hashMap.put("openId", str3);
        hashMap.put("category", 0);
        hashMap.put("appType", Integer.valueOf(b.c()));
        if (z) {
            hashMap.put("channel", 3022);
            hashMap.put("visitId", "0");
        } else {
            hashMap.put("visitId", str4);
        }
        hashMap.put("sessionId", str2);
        d.a(jVar, uploadService.uploadFile(arrayList, hashMap).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    private static ae.b a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a019acacf78b4490bfdeb13880835ad", RobustBitConfig.DEFAULT_VALUE) ? (ae.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a019acacf78b4490bfdeb13880835ad") : ae.b.a(str, null, al.a(String.valueOf(obj).getBytes(), (String) null));
    }

    public static ar a(String str, t tVar, long j) {
        Object[] objArr = {str, tVar, 10L};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c44e3a90d072ee6805438f7d7c276ccf", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c44e3a90d072ee6805438f7d7c276ccf") : com.meituan.android.customerservice.retrofit.a.a(str, tVar, 10L);
    }
}
