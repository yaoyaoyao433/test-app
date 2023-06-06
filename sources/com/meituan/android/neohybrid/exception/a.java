package com.meituan.android.neohybrid.exception;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends RuntimeException {
    public static ChangeQuickRedirect a;
    private List<String> b;

    private a(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386952239924eb50c56e4d0d822c8644", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386952239924eb50c56e4d0d822c8644");
        } else {
            this.b = new ArrayList();
        }
    }

    private a(Throwable th) {
        super(th);
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b69937e3f0fd4f857798f51d1d276d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b69937e3f0fd4f857798f51d1d276d");
        } else {
            this.b = new ArrayList();
        }
    }

    private a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31c68ac27fa22177772b7fb206defa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31c68ac27fa22177772b7fb206defa7");
        }
        if (!TextUtils.isEmpty(str)) {
            this.b.add(str);
        }
        return this;
    }

    public static void a(@NonNull Throwable th, String str) {
        a a2;
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f27e869f1121826174fe48055d6fb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f27e869f1121826174fe48055d6fb27");
            return;
        }
        Object[] objArr2 = {th, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "158413a7b579941296373a9a2b4565f3", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "158413a7b579941296373a9a2b4565f3");
        } else if (th instanceof a) {
            a2 = ((a) th).a(str);
        } else {
            a2 = new a(th).a(str);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        com.meituan.android.neohybrid.neo.report.b.a(a2, PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b260ac52effe12239946fc2b610c8e21", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b260ac52effe12239946fc2b610c8e21") : a2.b.toString());
        if (com.meituan.android.neohybrid.init.a.h()) {
            throw a2;
        }
    }

    public static void a(@NonNull Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00d6e4c47abad255a3124c1eea7ea1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00d6e4c47abad255a3124c1eea7ea1ff");
        } else {
            a(th, (String) null);
        }
    }

    public static void a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5de55a4b8f9a1b96e0660ae6d143ba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5de55a4b8f9a1b96e0660ae6d143ba8");
        } else {
            a(new a(str), str2);
        }
    }
}
