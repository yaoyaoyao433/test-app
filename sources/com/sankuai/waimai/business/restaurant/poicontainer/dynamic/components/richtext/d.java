package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.richtext;

import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d c;
    LruCache<String, BitmapDrawable> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca49bb9de93b1eedd9fa3ecc432660b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca49bb9de93b1eedd9fa3ecc432660b");
        } else if (this.b == null) {
            this.b = new LruCache<>(10);
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9b008bdb28e776938a54da0a202327a", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9b008bdb28e776938a54da0a202327a");
        }
        synchronized (d.class) {
            if (c == null) {
                c = new d();
            }
        }
        return c;
    }
}
