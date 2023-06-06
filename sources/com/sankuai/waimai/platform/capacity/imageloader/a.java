package com.sankuai.waimai.platform.capacity.imageloader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static b.C0608b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1725d060fccb3d1efcd1bd805255fb3a", RobustBitConfig.DEFAULT_VALUE) ? (b.C0608b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1725d060fccb3d1efcd1bd805255fb3a") : com.sankuai.meituan.mtimageloader.loader.a.c();
    }
}
