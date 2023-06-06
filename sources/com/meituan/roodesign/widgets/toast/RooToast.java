package com.meituan.roodesign.widgets.toast;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RooToast {
    public static ChangeQuickRedirect a;
    @NonNull
    private a b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface Duration {
    }

    private RooToast(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27ab0e7ce9be629dbe29353a1577e26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27ab0e7ce9be629dbe29353a1577e26");
            return;
        }
        if (aVar.c() != null) {
            Context context = aVar.c().getContext();
            aVar.a(com.meituan.roodesign.widgets.internal.a.a(context, 12.0f));
            int a2 = com.meituan.roodesign.widgets.internal.a.a(context, 240.0f);
            Object[] objArr2 = {Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect2 = a.d;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b87c6d0f072b8fe855b0d00ca80d2495", RobustBitConfig.DEFAULT_VALUE)) {
                a aVar2 = (a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b87c6d0f072b8fe855b0d00ca80d2495");
            } else if (aVar.e != null) {
                ((TextView) aVar.e.d.findViewById(R.id.snackbar_text)).setMaxWidth(a2);
            }
            int a3 = com.meituan.roodesign.widgets.internal.a.a(context, 12.0f);
            Object[] objArr3 = {Integer.valueOf(a3)};
            ChangeQuickRedirect changeQuickRedirect3 = a.d;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3f639b1f7878b64a7406ec060b9ee360", RobustBitConfig.DEFAULT_VALUE)) {
                a aVar3 = (a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3f639b1f7878b64a7406ec060b9ee360");
            } else if (aVar.e != null) {
                aVar.a(a3, a3, a3, a3);
            }
        }
        this.b = aVar;
    }

    @NonNull
    public static RooToast a(@NonNull View view, @NonNull CharSequence charSequence, int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee979b0e5391fd22b7ce0c09edf7bcc3", RobustBitConfig.DEFAULT_VALUE) ? (RooToast) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee979b0e5391fd22b7ce0c09edf7bcc3") : new RooToast(a.a(view, charSequence, i));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3230cdad2bdd78c958298071b58525ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3230cdad2bdd78c958298071b58525ed");
        } else {
            this.b.a();
        }
    }
}
