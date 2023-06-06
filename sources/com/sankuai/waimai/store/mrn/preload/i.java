package com.sankuai.waimai.store.mrn.preload;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements j {
        @Override // com.sankuai.waimai.store.mrn.preload.j
        public final void a() {
        }
    }

    public static j a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e0cb66d5024f6f5be9e7d4fb2f0fa81", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e0cb66d5024f6f5be9e7d4fb2f0fa81");
        }
        if (uri == null) {
            return new a();
        }
        return a(uri.toString(), null);
    }

    public static j a(String str, Map<String, String> map) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faf9c767752695756371194b6e352e2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faf9c767752695756371194b6e352e2d");
        }
        try {
            Uri parse = Uri.parse(str);
            Class<? extends j> a2 = h.a(parse);
            if (a2 == null) {
                return new a();
            }
            if (!b.class.isAssignableFrom(a2)) {
                return new a();
            }
            b bVar = (b) a2.newInstance();
            bVar.c = parse;
            bVar.d = null;
            return bVar;
        } catch (IllegalAccessException | InstantiationException e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            return new a();
        }
    }
}
