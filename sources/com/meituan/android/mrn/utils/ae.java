package com.meituan.android.mrn.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ae {
    public static ChangeQuickRedirect a;

    private static com.meituan.android.mrn.engine.e a(Context context, String str) {
        MRNBundleManager createInstance;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45b9290fb6d69f201589f3be5655ab9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.engine.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45b9290fb6d69f201589f3be5655ab9f");
        }
        try {
            createInstance = MRNBundleManager.sharedInstance();
        } catch (Exception unused) {
            createInstance = MRNBundleManager.createInstance(context.getApplicationContext());
        }
        if (createInstance != null) {
            return createInstance.getHighestBundle(str);
        }
        return null;
    }

    public static com.meituan.android.mrn.component.skeleton.a a(Context context, com.meituan.android.mrn.router.d dVar) {
        String str;
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        DioFile dioFile = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "675cb1ed7863f9fd5df1b2cae84e4ed1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.component.skeleton.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "675cb1ed7863f9fd5df1b2cae84e4ed1");
        }
        if (dVar != null) {
            String str2 = dVar.l;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = dVar.i;
                if (TextUtils.isEmpty(str3)) {
                    return null;
                }
                com.meituan.android.mrn.engine.e a2 = a(context, str3);
                Object[] objArr2 = {a2, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04d5a9d178ac210855cb1bdc4c74287c", RobustBitConfig.DEFAULT_VALUE)) {
                    dioFile = (DioFile) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04d5a9d178ac210855cb1bdc4c74287c");
                } else if (a2 != null) {
                    if (str2.contains(CommonConstant.Symbol.DOLLAR)) {
                        String[] split = str2.split("\\$");
                        str = split[split.length - 1];
                    } else {
                        str = str2;
                    }
                    DioFile b = a2.b(str);
                    if (b.c() && b.k()) {
                        dioFile = b;
                    }
                }
                com.meituan.android.mrn.component.skeleton.a aVar = new com.meituan.android.mrn.component.skeleton.a(context, str2, dioFile);
                if (dVar.m) {
                    aVar.setOpenAnim(false);
                }
                try {
                    aVar.setBackgroundColor(Color.parseColor("#fefefe"));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
                aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return aVar;
            }
        }
        return null;
    }
}
