package com.meituan.android.neohybrid.framework.webcompat.client;

import android.graphics.Bitmap;
import android.support.annotation.RequiresApi;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.protocol.kernel.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private final List<d> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b599137d4d1e9e751c2fb7591f0e8625", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b599137d4d1e9e751c2fb7591f0e8625");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final boolean a(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30db127d2fc74e87ec54ca4a3ebf7bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30db127d2fc74e87ec54ca4a3ebf7bc")).booleanValue();
        }
        for (d dVar : this.b) {
            if (dVar.a(cVar, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    @RequiresApi(api = 24)
    public final boolean a(c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3710f5e6d4bb824fcca2070cb8c5045", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3710f5e6d4bb824fcca2070cb8c5045")).booleanValue();
        }
        for (d dVar : this.b) {
            if (dVar.a(cVar, webResourceRequest)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final void a(c cVar, String str, Bitmap bitmap) {
        Object[] objArr = {cVar, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507619d0588902e5effd92b85d5fa52f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507619d0588902e5effd92b85d5fa52f");
            return;
        }
        for (d dVar : this.b) {
            dVar.a(cVar, str, bitmap);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final void b(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5becb6b5a4d05a6ac2c00bf1459edf0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5becb6b5a4d05a6ac2c00bf1459edf0b");
            return;
        }
        for (d dVar : this.b) {
            dVar.b(cVar, str);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final WebResourceResponse b(c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeeb6ceb4e8f6f512b3f0d7b60e0cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeeb6ceb4e8f6f512b3f0d7b60e0cd3");
        }
        for (d dVar : this.b) {
            WebResourceResponse b = dVar.b(cVar, webResourceRequest);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final void a(c cVar, int i, String str, String str2) {
        Object[] objArr = {cVar, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981a83067b6d913a99457242682503a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981a83067b6d913a99457242682503a2");
            return;
        }
        for (d dVar : this.b) {
            dVar.a(cVar, i, str, str2);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    @RequiresApi(api = 23)
    public final void a(c cVar, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {cVar, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8afa6311b743da858f4e485beda44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8afa6311b743da858f4e485beda44f");
            return;
        }
        for (d dVar : this.b) {
            dVar.a(cVar, webResourceRequest, webResourceError);
        }
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    @RequiresApi(api = 26)
    public final boolean a(c cVar, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {cVar, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec846caefe1082934b4045a722b5f09", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec846caefe1082934b4045a722b5f09")).booleanValue();
        }
        for (d dVar : this.b) {
            if (dVar.a(cVar, renderProcessGoneDetail)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meituan.android.neohybrid.protocol.kernel.d
    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6c8b8f6ecb2416539373aa30a8d310", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6c8b8f6ecb2416539373aa30a8d310");
        } else if (dVar != null) {
            this.b.add(dVar);
        }
    }
}
