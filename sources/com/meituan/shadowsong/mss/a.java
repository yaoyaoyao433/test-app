package com.meituan.shadowsong.mss;

import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;
    private static ThreadLocal<SimpleDateFormat> b = new ThreadLocal<SimpleDateFormat>() { // from class: com.meituan.shadowsong.mss.a.1
        public static ChangeQuickRedirect a;

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e54372443b581edabd6e7fa86a6bfcd", RobustBitConfig.DEFAULT_VALUE) ? (SimpleDateFormat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e54372443b581edabd6e7fa86a6bfcd") : new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        }
    };

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        String format;
        String substring;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc60b6477b36eae0097a90a40c62c75", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc60b6477b36eae0097a90a40c62c75");
        }
        aj request = aVar.request();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "765d4395df6014905611eb80b515d5e2", RobustBitConfig.DEFAULT_VALUE)) {
            format = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "765d4395df6014905611eb80b515d5e2");
        } else {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = b.get();
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            format = simpleDateFormat.format(calendar.getTime());
        }
        aj.a a2 = request.a();
        a2.b("Authorization", f.a(request, format, request.d()));
        a2.b("Date", format);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6d7f01aaa2063fdb4f2c74d99b7605d4", RobustBitConfig.DEFAULT_VALUE)) {
            substring = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6d7f01aaa2063fdb4f2c74d99b7605d4");
        } else if ("https://s3plus.sankuai.com".contains(AbsApiFactory.HTTP)) {
            substring = "https://s3plus.sankuai.com".substring(7);
        } else {
            substring = "https://s3plus.sankuai.com".substring(8);
        }
        a2.b("Host", substring);
        return aVar.a(a2.a());
    }
}
