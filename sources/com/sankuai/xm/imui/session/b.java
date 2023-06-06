package com.sankuai.xm.imui.session;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.c;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.x;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public SessionId b;
    public SessionParams c;
    SessionFragment d;
    public Bundle e;
    List<com.sankuai.xm.imui.common.widget.b> f;
    public g g;

    public b(SessionId sessionId, SessionParams sessionParams) {
        Object[] objArr = {sessionId, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf9d88e57260827142315f434aebc59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf9d88e57260827142315f434aebc59");
            return;
        }
        this.e = new Bundle();
        this.b = sessionId;
        this.c = sessionParams == null ? new SessionParams() : sessionParams;
    }

    public final SessionId a() {
        return this.b;
    }

    public final short b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d24b878c21af2d097b895894be060878", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d24b878c21af2d097b895894be060878")).shortValue();
        }
        if (this.b == null) {
            return (short) 0;
        }
        return this.b.g;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736eaca19d99ad002ec70bfeead0619c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736eaca19d99ad002ec70bfeead0619c")).intValue();
        }
        if (this.b == null) {
            return 1;
        }
        return this.b.e;
    }

    @NonNull
    public final List<com.sankuai.xm.imui.common.widget.b> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6325736372e46e14f848091b418285f0", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6325736372e46e14f848091b418285f0");
        }
        if (this.f == null) {
            this.f = new ArrayList();
            String[] strArr = this.c.p;
            if (strArr != null) {
                for (String str : strArr) {
                    com.sankuai.xm.imui.common.widget.b bVar = (com.sankuai.xm.imui.common.widget.b) x.a(com.sankuai.xm.imui.session.widget.d.class, str);
                    if (bVar != null) {
                        this.f.add(bVar);
                    }
                }
            }
        }
        return this.f;
    }

    public final <T> void a(Class<T> cls, com.sankuai.xm.base.callback.c<T> cVar, boolean z) {
        Object[] objArr = {cls, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dcfb3f78167b1bd7a770767ffde15d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dcfb3f78167b1bd7a770767ffde15d2");
        } else if (this.d == null || !ActivityUtils.a((Activity) this.d.getActivity())) {
            com.sankuai.xm.imui.common.util.d.c("SessionContext::subscribeEvent invalid SessionActivity.", new Object[0]);
        } else {
            c.a<T> a2 = ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a_(cls).a(this.d.getActivity());
            if (z) {
                a2 = a2.a();
            }
            a2.a(cVar);
        }
    }

    public final <T> void a(Class<T> cls, com.sankuai.xm.base.callback.c<T> cVar) {
        Object[] objArr = {cls, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ff876f9112d7bf386e09b588735a48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ff876f9112d7bf386e09b588735a48");
        } else if (cVar == null) {
        } else {
            ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a_(cls).b(cVar);
        }
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06260a29db050f2d8deaf2f100ffdc03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06260a29db050f2d8deaf2f100ffdc03");
        } else if (this.d == null) {
            com.sankuai.xm.imui.common.util.d.c("SessionContext::dispatchEvent SessionContext is detach from activity, event = %s.", obj);
        } else {
            ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a(obj.getClass().getName()).a(obj);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2332a2a992d365a930b464a3169c4754", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2332a2a992d365a930b464a3169c4754")).booleanValue() : this.e.getBoolean("key_bool_msg_multi_select", false);
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea28061fed5c75f968791424eb40607", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea28061fed5c75f968791424eb40607")).booleanValue() : this.e.getBoolean("key_bool_is_group_admin", false);
    }

    @Nullable
    public static SessionFragment a(Context context) {
        SessionDialogFragment sessionDialogFragment;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        SessionFragment sessionFragment = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ea2a13452524fc7446bfbeaa5b7a48b", 6917529027641081856L)) {
            return (SessionFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ea2a13452524fc7446bfbeaa5b7a48b");
        }
        Activity a2 = ActivityUtils.a(context);
        if (!(a2 instanceof SessionActivity) || (sessionFragment = ((SessionActivity) a2).d) == null) {
            if (a2 instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) a2).getSupportFragmentManager();
                SessionFragment sessionFragment2 = (SessionFragment) supportFragmentManager.findFragmentById(R.id.xm_sdk_session);
                if (sessionFragment2 == null && (sessionDialogFragment = (SessionDialogFragment) supportFragmentManager.findFragmentByTag("xm_sdk_session_dialog_fragment")) != null) {
                    sessionFragment2 = sessionDialogFragment.d;
                }
                SessionFragment sessionFragment3 = sessionFragment2;
                return sessionFragment3 == null ? a(supportFragmentManager) : sessionFragment3;
            }
            return sessionFragment;
        }
        return sessionFragment;
    }

    @Nullable
    public static SessionFragment a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e634df8ea81b38f0e2d1da5e3104193", 6917529027641081856L) ? (SessionFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e634df8ea81b38f0e2d1da5e3104193") : a(view.getContext());
    }

    @Nullable
    public static <T extends com.sankuai.xm.imui.common.panel.plugin.c> T a(View view, Class<T> cls) {
        SessionFragment a2;
        Object[] objArr = {view, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dc1fb7bf3a3356b3d98ae57a60a017f", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dc1fb7bf3a3356b3d98ae57a60a017f");
        }
        if (view == null || (a2 = a(view)) == null) {
            return null;
        }
        return (T) a2.a((Class<Object>) cls);
    }

    @Nullable
    public static ICommonAdapter b(View view) {
        SessionFragment a2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8474a625d065935f31d71510e17fcaa4", 6917529027641081856L)) {
            return (ICommonAdapter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8474a625d065935f31d71510e17fcaa4");
        }
        if (view == null || (a2 = a(view)) == null) {
            return null;
        }
        return a2.u().getCommonAdapter();
    }

    public static b b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0aebd183a0622f34280f95df270e80c", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0aebd183a0622f34280f95df270e80c");
        }
        SessionFragment a2 = a(context);
        if (a2 != null && a2.r != null) {
            return a2.r;
        }
        com.sankuai.xm.imui.common.util.d.c("SessionContext::obtain use global session context.", new Object[0]);
        com.sankuai.xm.monitor.statistics.a.a("imui", "SessionContext::obtain", new RuntimeException("should not use global session context."));
        return com.sankuai.xm.imui.b.a().b;
    }

    private static SessionFragment a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "925d55cdd71245666902754a90e065be", 6917529027641081856L)) {
            return (SessionFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "925d55cdd71245666902754a90e065be");
        }
        if (fragmentManager == null || fragmentManager.isDestroyed()) {
            return null;
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        if (com.sankuai.xm.base.util.b.a(fragments)) {
            return null;
        }
        for (Fragment fragment : fragments) {
            if (fragment != null && fragment.isVisible()) {
                if (fragment instanceof SessionFragment) {
                    return (SessionFragment) fragment;
                }
                SessionFragment a2 = a(fragment.getChildFragmentManager());
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
