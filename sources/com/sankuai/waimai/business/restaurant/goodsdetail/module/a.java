package com.sankuai.waimai.business.restaurant.goodsdetail.module;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected c c;
    protected b d;
    protected d e;
    protected InterfaceC0834a f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.goodsdetail.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    interface InterfaceC0834a {
        void a();

        void a(long j, short s);

        void a(g gVar);

        void a(String str, long j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    interface b {
        void a();

        void a(g gVar);

        void a(String str);

        e b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    interface c {
        void a();

        void a(f fVar);

        void a(GoodsSpu goodsSpu);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface f {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface g {
        void a(int i, boolean z);
    }

    public a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4588fca0af2854c82859e6e23816fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4588fca0af2854c82859e6e23816fc");
        } else {
            this.b = activity;
        }
    }

    public final Activity a() {
        return this.b;
    }

    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7eaeb2db64e05f75104b067194e9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7eaeb2db64e05f75104b067194e9f4");
        } else if (this.c != null) {
            this.c.a(goodsSpu);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757ec6553bb6da6f3edfa2f77a90e24e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757ec6553bb6da6f3edfa2f77a90e24e");
        } else if (this.d != null) {
            this.d.a(str);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34f6d05c14dadc4339059844088b85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34f6d05c14dadc4339059844088b85d");
        } else if (this.e != null) {
            this.e.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class e {
        public int a = 0;
        public boolean b = false;

        public e() {
        }
    }
}
