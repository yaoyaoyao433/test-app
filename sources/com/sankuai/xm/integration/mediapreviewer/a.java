package com.sankuai.xm.integration.mediapreviewer;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Uri b;
    public Uri c;
    public Uri d;
    public Uri e;
    public Uri f;
    public HashMap<Uri, HashMap<String, String>> g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386add0e1fb3883ea3e76086864f7da9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386add0e1fb3883ea3e76086864f7da9");
        } else {
            this.g = new HashMap<>();
        }
    }

    public final void a(Uri uri, HashMap<String, String> hashMap) {
        Object[] objArr = {uri, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488d86f149b39d5b268723a54cfd5406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488d86f149b39d5b268723a54cfd5406");
        } else if (uri == null) {
        } else {
            this.g.put(uri, hashMap);
        }
    }
}
