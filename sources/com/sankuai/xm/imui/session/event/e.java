package com.sankuai.xm.imui.session.event;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface e {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class f {
        public static ChangeQuickRedirect a;
        public final boolean b;
        public final IMMessage c;

        private f(boolean z, IMMessage iMMessage) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53f640ace4a51ae8be6108452128fdb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53f640ace4a51ae8be6108452128fdb");
                return;
            }
            this.b = z;
            this.c = iMMessage;
        }

        public static f a(boolean z, IMMessage iMMessage) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c46e9243df38cb8b69596e436d7d477c", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c46e9243df38cb8b69596e436d7d477c") : new f(z, iMMessage);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.session.event.e$e  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1400e {
        public static ChangeQuickRedirect a;
        private List<IMMessage> b;

        private C1400e(List<IMMessage> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7307c9171744981f53a9794cd43e494c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7307c9171744981f53a9794cd43e494c");
            } else {
                this.b = list;
            }
        }

        public static C1400e a(List<IMMessage> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "701351cfb5f31cf54103f36bb22d8ed8", 6917529027641081856L) ? (C1400e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "701351cfb5f31cf54103f36bb22d8ed8") : new C1400e(list);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d extends com.sankuai.xm.base.entity.b<List<com.sankuai.xm.imui.session.entity.b>> {
        public static ChangeQuickRedirect b;
        public int c;
        public int d;

        public d(int i, List<com.sankuai.xm.imui.session.entity.b> list) {
            super(i, list);
            Object[] objArr = {Integer.valueOf(i), list};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4b7b8cffb44b84f6c5f53a04337ae2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4b7b8cffb44b84f6c5f53a04337ae2");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends com.sankuai.xm.base.entity.b<List<com.sankuai.xm.imui.session.entity.b>> {
        public static ChangeQuickRedirect b;
        private int c;

        private b(int i, List<com.sankuai.xm.imui.session.entity.b> list, int i2) {
            super(i, list);
            Object[] objArr = {Integer.valueOf(i), list, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c50648afa3518b7c945a5f1bfb54c1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c50648afa3518b7c945a5f1bfb54c1e");
            } else {
                this.c = i2;
            }
        }

        public static b a(int i, List<com.sankuai.xm.imui.session.entity.b> list, int i2) {
            Object[] objArr = {Integer.valueOf(i), list, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6cdf1e9952f9e1dd13d951f76fbe87", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6cdf1e9952f9e1dd13d951f76fbe87") : new b(i, list, i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        public static ChangeQuickRedirect a;
        public final boolean b;
        public final IMMessage c;

        private c(boolean z, IMMessage iMMessage) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ecf86dc871d23e96325d542d873885c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ecf86dc871d23e96325d542d873885c");
                return;
            }
            this.b = z;
            this.c = iMMessage;
        }

        public static c a(boolean z, IMMessage iMMessage) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a864ddd4e137e7ece276e4b91379ae1c", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a864ddd4e137e7ece276e4b91379ae1c") : new c(z, iMMessage);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        @NonNull
        public final com.sankuai.xm.imui.session.entity.b<?> b;
        private final int c;

        private a(int i, @NonNull com.sankuai.xm.imui.session.entity.b<?> bVar) {
            Object[] objArr = {Integer.valueOf(i), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ac6fd7f2dde17c317a98433fdb0e4f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ac6fd7f2dde17c317a98433fdb0e4f");
                return;
            }
            this.c = i;
            this.b = bVar;
        }

        public final boolean a() {
            return this.c > 0;
        }

        public final com.sankuai.xm.imui.session.entity.b<?> b() {
            return this.b;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fecf771a406f03df46d0596b94a7deb", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fecf771a406f03df46d0596b94a7deb");
            }
            return "MsgItemVisibilityEvent{mVisiblePercent=" + this.c + ", mMsg=" + this.b.b() + '}';
        }

        public static a a(int i, @NonNull com.sankuai.xm.imui.session.entity.b<?> bVar) {
            Object[] objArr = {Integer.valueOf(i), bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5af7214ff1dbbc6f33916185ee73d182", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5af7214ff1dbbc6f33916185ee73d182") : new a(i, bVar);
        }
    }
}
