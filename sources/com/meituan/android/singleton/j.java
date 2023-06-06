package com.meituan.android.singleton;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.ak;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements ak {
    public static ChangeQuickRedirect a;
    private static final String b = ad.a("application/octet-stream").toString();
    private final HttpEntity c;
    private final String d;

    public j(HttpEntity httpEntity, String str) {
        Object[] objArr = {httpEntity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a305bdf860b4955f3aeffec9bf2d3c53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a305bdf860b4955f3aeffec9bf2d3c53");
            return;
        }
        this.c = httpEntity;
        if (str != null) {
            this.d = a(str);
        } else if (httpEntity.getContentType() != null) {
            this.d = a(httpEntity.getContentType().getValue());
        } else {
            this.d = b;
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89682a5b3afb9db98ed86e0e815a031c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89682a5b3afb9db98ed86e0e815a031c");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return ad.a(str).toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final String contentType() {
        return this.d;
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final long contentLength() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff1416f4fc3e25f27fad7f939a2d742", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff1416f4fc3e25f27fad7f939a2d742")).longValue() : this.c.getContentLength();
    }

    @Override // com.sankuai.meituan.retrofit2.ak
    public final void writeTo(OutputStream outputStream) throws IOException {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3382282f568a47d685e92a3fa234d28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3382282f568a47d685e92a3fa234d28c");
        } else {
            this.c.writeTo(outputStream);
        }
    }
}
