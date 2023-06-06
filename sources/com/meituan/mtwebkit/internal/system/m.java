package com.meituan.mtwebkit.internal.system;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceRequest;
import com.meituan.mtwebkit.MTWebResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m implements MTWebResourceRequest {
    public static ChangeQuickRedirect a;
    private WebResourceRequest b;

    public m(WebResourceRequest webResourceRequest) {
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8834143e52ddd17376bf4a3c6f7859", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8834143e52ddd17376bf4a3c6f7859");
        } else {
            this.b = webResourceRequest;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final Uri getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140183499a3970a130cf5c64f9b4daa1", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140183499a3970a130cf5c64f9b4daa1") : this.b.getUrl();
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final boolean isForMainFrame() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4653b9fd04c54c7bc1e455af54d2e1b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4653b9fd04c54c7bc1e455af54d2e1b2")).booleanValue() : this.b.isForMainFrame();
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final boolean isRedirect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dcec233765ede8e864e06651e486da7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dcec233765ede8e864e06651e486da7")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.b.isRedirect();
        }
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final boolean hasGesture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeea8810dd4f01ea3a2350bb280a9b3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeea8810dd4f01ea3a2350bb280a9b3b")).booleanValue() : this.b.hasGesture();
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final String getMethod() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ffcd01f8c19c04dd96fb29b95abf69", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ffcd01f8c19c04dd96fb29b95abf69") : this.b.getMethod();
    }

    @Override // com.meituan.mtwebkit.MTWebResourceRequest
    public final Map<String, String> getRequestHeaders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd2953c666aa1bf7642be1692405f8d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd2953c666aa1bf7642be1692405f8d") : this.b.getRequestHeaders();
    }
}
