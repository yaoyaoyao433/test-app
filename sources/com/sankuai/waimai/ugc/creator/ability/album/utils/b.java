package com.sankuai.waimai.ugc.creator.ability.album.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.c;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final Map<String, Drawable> b;

    public b(Context context, String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c111a80b6647f281606f698b5e15f1f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c111a80b6647f281606f698b5e15f1f0");
            return;
        }
        this.b = new HashMap();
        a(context, strArr);
    }

    private void a(Context context, String... strArr) {
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4f14d3ba64984709a01bebf666157f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4f14d3ba64984709a01bebf666157f");
            return;
        }
        for (String str : strArr) {
            a(context, str);
        }
    }

    public final Drawable a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ced7b8cb2b4a9efbb77bd84c6403967", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ced7b8cb2b4a9efbb77bd84c6403967") : a(context, str, null);
    }

    private Drawable a(Context context, final String str, com.meituan.roodesign.resfetcher.runtime.b bVar) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e644da75b5e3c33d18b2ccd38bff6843", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e644da75b5e3c33d18b2ccd38bff6843");
        }
        Drawable drawable = this.b.get(str);
        if (drawable == null) {
            c.a(context, str, new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.ugc.creator.ability.album.utils.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.roodesign.resfetcher.runtime.b
                public final void a(Drawable drawable2, boolean z) {
                    Object[] objArr2 = {drawable2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b913cd052927b8074a7499cd372da95", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b913cd052927b8074a7499cd372da95");
                        return;
                    }
                    if (!z) {
                        b.this.b.put(str, drawable2);
                    }
                    if (r3 != null) {
                        r3.a(drawable2, z);
                    }
                }
            });
        }
        return drawable;
    }
}
