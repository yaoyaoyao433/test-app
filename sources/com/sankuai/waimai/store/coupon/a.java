package com.sankuai.waimai.store.coupon;

import android.app.Dialog;
import com.facebook.react.bridge.Promise;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.coupon.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1143a {
        void a();

        void a(String str, Dialog dialog);

        void a(String str, String str2, String str3, String str4, String str5, String str6, Promise promise);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b {
        public static ChangeQuickRedirect a;
        protected InterfaceC1143a b;

        public abstract void a(long j, String str, String str2, Dialog dialog);

        public b(InterfaceC1143a interfaceC1143a) {
            Object[] objArr = {interfaceC1143a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5be4a592f25ccfd78a1d85a526ba6a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5be4a592f25ccfd78a1d85a526ba6a9");
            } else {
                this.b = interfaceC1143a;
            }
        }
    }
}
