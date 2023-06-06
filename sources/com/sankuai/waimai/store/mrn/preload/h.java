package com.sankuai.waimai.store.mrn.preload;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final Map<String, Class<? extends j>> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.mrn.preload.b {
        @Override // com.sankuai.waimai.store.mrn.preload.j
        public final void a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends com.sankuai.waimai.store.mrn.preload.a {
        @Override // com.sankuai.waimai.store.mrn.preload.a, com.sankuai.waimai.store.mrn.preload.j
        public final void a() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("/supermarket/poiinfo", b.class);
    }

    public static Class<? extends j> a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e257c3886b81ba96197bbe4bdfe2b60b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e257c3886b81ba96197bbe4bdfe2b60b");
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("mrn_biz");
        if (queryParameter != null && !"".equals(queryParameter)) {
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4a65fc908db9d76e6817d6188df26436", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4a65fc908db9d76e6817d6188df26436");
            }
            if (com.sankuai.waimai.store.config.i.h().a(SCConfigPath.PRELOAD_MRN, false)) {
                return com.sankuai.waimai.store.mrn.preload.a.class;
            }
            return a.class;
        }
        Object[] objArr3 = {uri};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "413ce178a6655999dcf52c87d76b3d11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "413ce178a6655999dcf52c87d76b3d11");
        }
        String path = uri.getPath();
        if (path == null || "".equals(path)) {
            return null;
        }
        return b.get(path);
    }
}
