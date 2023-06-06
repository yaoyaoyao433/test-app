package com.meituan.android.yoda.config.launch;

import com.meituan.android.yoda.interfaces.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface a {
    int a();

    f<Integer> b();

    int c();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.config.launch.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0374a implements a {
        public static ChangeQuickRedirect b;
        protected int c;
        protected int d;
        protected f<Integer> e;

        public C0374a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f7503bc4f11a9b2474a3e9acb6233a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f7503bc4f11a9b2474a3e9acb6233a");
                return;
            }
            this.c = 0;
            this.d = -1;
        }

        @Override // com.meituan.android.yoda.config.launch.a
        public final int a() {
            return this.c;
        }

        @Override // com.meituan.android.yoda.config.launch.a
        public final f<Integer> b() {
            return this.e;
        }

        @Override // com.meituan.android.yoda.config.launch.a
        public final int c() {
            return this.d;
        }
    }
}
