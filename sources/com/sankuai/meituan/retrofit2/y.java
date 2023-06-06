package com.sankuai.meituan.retrofit2;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class y implements Interceptor {
    public static ChangeQuickRedirect a;
    private String b;
    private boolean c;
    private z d;
    private SimpleDateFormat e;
    private String f;
    private String g;

    public y(String str, boolean z) {
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd336921850f710b6814cc42316688aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd336921850f710b6814cc42316688aa");
            return;
        }
        this.d = new z();
        this.e = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.CHINA);
        this.f = ", ";
        this.g = ": ";
        this.b = str;
        this.c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.sankuai.meituan.retrofit2.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.meituan.retrofit2.raw.b intercept(com.sankuai.meituan.retrofit2.Interceptor.a r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.y.intercept(com.sankuai.meituan.retrofit2.Interceptor$a):com.sankuai.meituan.retrofit2.raw.b");
    }

    private String a(aj ajVar) {
        String str;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581e087dc87c38e6c8548374561967bd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581e087dc87c38e6c8548374561967bd");
        }
        String str2 = null;
        a("tunnel" + this.g + this.b);
        a(ajVar.f);
        a(ajVar.e);
        StringBuilder sb = new StringBuilder("reqBody");
        sb.append(this.g);
        if (ajVar.h != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ajVar.h.contentLength());
            str = sb2.toString();
        } else {
            str = StringUtil.NULL;
        }
        sb.append(str);
        a(sb.toString());
        List<q> list = ajVar.g;
        StringBuilder sb3 = new StringBuilder("reqHeaders" + this.g + CommonConstant.Symbol.BIG_BRACKET_LEFT);
        for (int i = 0; i < list.size(); i++) {
            q qVar = list.get(i);
            if ("enqueue-time".equals(qVar.b)) {
                str2 = qVar.c;
            }
            if (i > 0) {
                sb3.append(CommonConstant.Symbol.COMMA);
            }
            sb3.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb3.append(qVar.b);
            sb3.append("\":\"");
            sb3.append(qVar.c);
            sb3.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        sb3.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        a(sb3.toString());
        return str2;
    }

    private void a(com.sankuai.meituan.retrofit2.raw.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d8074b1be7d1ea18d5c2acbcd20c1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d8074b1be7d1ea18d5c2acbcd20c1b");
            return;
        }
        List<q> headers = bVar.headers();
        StringBuilder sb = new StringBuilder("respHeaders" + this.g + CommonConstant.Symbol.BIG_BRACKET_LEFT);
        for (int i = 0; i < headers.size(); i++) {
            q qVar = headers.get(i);
            if (i > 0) {
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb.append(qVar.b);
            sb.append("\":\"");
            sb.append(qVar.c);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        a(sb.toString());
        int code = bVar.code();
        a("respCode" + this.g + code);
        a("respContentLength" + this.g + bVar.body().contentLength());
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d70e532a54c6a210e4e25bcd5887726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d70e532a54c6a210e4e25bcd5887726");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.d.a() > 0) {
                this.d.a(this.f);
            }
            this.d.a(str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a720fdafe20ccb1d6bcc8c4c76b0f6d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a720fdafe20ccb1d6bcc8c4c76b0f6d3");
        } else if (TextUtils.isEmpty(this.d.toString())) {
        } else {
            aa.b(this.d.toString());
        }
    }
}
