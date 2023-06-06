package com.sankuai.waimai.store.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static View a(Context context, int i, ViewGroup viewGroup) {
        Object[] objArr = {context, Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2e96d94484ca46d9c9d6b13ca3a6a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2e96d94484ca46d9c9d6b13ca3a6a18");
        }
        if (context == null) {
            return null;
        }
        return a(context, i, viewGroup, viewGroup != null);
    }

    public static View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        LayoutInflater layoutInflater;
        int i2;
        boolean z2;
        Object[] objArr2 = {context, Integer.valueOf(i), viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "da79016bb4e15c5466fcbcc8fe15fb10", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "da79016bb4e15c5466fcbcc8fe15fb10");
        }
        if (context == null) {
            return null;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            try {
                objArr = new Object[]{context};
                changeQuickRedirect = a;
            } catch (OutOfMemoryError | RuntimeException e) {
                e = e;
            }
            try {
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d3312563889cc31aee2a9ca2b25101d", RobustBitConfig.DEFAULT_VALUE)) {
                    layoutInflater = (LayoutInflater) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d3312563889cc31aee2a9ca2b25101d");
                } else if (context == null) {
                    i2 = i;
                    z2 = z ? 1 : 0;
                    layoutInflater = null;
                    return layoutInflater.inflate(i2, viewGroup, z2);
                } else {
                    layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
                }
                return layoutInflater.inflate(i2, viewGroup, z2);
            } catch (OutOfMemoryError | RuntimeException e2) {
                e = e2;
                if (i3 == 2) {
                    throw e;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7038df4bd11799141c25f6ec7364ee08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7038df4bd11799141c25f6ec7364ee08");
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.imageloader.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f6c190287b74c108b50af202605abdac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f6c190287b74c108b50af202605abdac");
                    } else {
                        Object[] objArr5 = {40};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.mtimageloader.loader.a.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "4d2d54306bc236a44fa29aecc3f82fac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "4d2d54306bc236a44fa29aecc3f82fac");
                        } else {
                            com.sankuai.meituan.mtimageloader.config.a.k().a(40);
                        }
                    }
                    System.gc();
                }
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            i2 = i;
            z2 = z ? 1 : 0;
        }
        return null;
    }
}
