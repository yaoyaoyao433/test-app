package com.sankuai.waimai.bussiness.order.confirm.helper;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class View$OnClickListenerC0892a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        @NonNull
        private final View b;
        @NonNull
        private final ViewGroup c;

        private View$OnClickListenerC0892a(@NonNull View view, @NotNull ViewGroup viewGroup) {
            Object[] objArr = {view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "838fe8854b8c5acca4206c62eaa2451f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "838fe8854b8c5acca4206c62eaa2451f");
                return;
            }
            this.b = view;
            this.c = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a7813def3a0444f94d89242f50b3cf", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a7813def3a0444f94d89242f50b3cf");
            } else {
                this.c.removeView(this.b);
            }
        }
    }
}
