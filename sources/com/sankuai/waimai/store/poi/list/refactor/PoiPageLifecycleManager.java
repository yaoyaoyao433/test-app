package com.sankuai.waimai.store.poi.list.refactor;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiPageLifecycleManager implements e, l<com.sankuai.waimai.store.poi.list.refactor.event.e> {
    public static ChangeQuickRedirect a;
    public PoiPageLifecycleObserver b;
    private d c;
    private boolean d;
    private int e;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.poi.list.refactor.event.e eVar) {
        com.sankuai.waimai.store.poi.list.refactor.event.e eVar2 = eVar;
        Object[] objArr = {eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "765ca0357d57db59b49ca546eb182ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "765ca0357d57db59b49ca546eb182ce5");
        } else if (eVar2 != null) {
            if (eVar2.a == 0) {
                if (!this.d) {
                    a(0);
                    a(1);
                }
                this.d = true;
                return;
            }
            if (this.d) {
                a(2);
                a(3);
            }
            this.d = false;
        }
    }

    public PoiPageLifecycleManager(SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "669a0bce300130ae276ea1810ba829a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "669a0bce300130ae276ea1810ba829a7");
            return;
        }
        this.d = true;
        this.e = -1;
        this.c = sCBaseActivity.getLifecycle();
        this.c.a(this);
        ((PageEventHandler) q.a((FragmentActivity) sCBaseActivity).a(PageEventHandler.class)).a(sCBaseActivity, com.sankuai.waimai.store.poi.list.refactor.event.e.class, this);
    }

    @OnLifecycleEvent(d.a.ON_START)
    public void onActivityStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d956603153992722284a115012c33fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d956603153992722284a115012c33fff");
        } else if (this.d) {
            a(0);
        }
    }

    @OnLifecycleEvent(d.a.ON_RESUME)
    public void onActivityResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1210f7b39a5f072ef16fb9b7c04a000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1210f7b39a5f072ef16fb9b7c04a000");
        } else if (this.d) {
            a(1);
        }
    }

    @OnLifecycleEvent(d.a.ON_PAUSE)
    public void onActivityPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19b61cbf6af409f78b66c8e345bdf68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19b61cbf6af409f78b66c8e345bdf68");
        } else if (this.d) {
            a(2);
        }
    }

    @OnLifecycleEvent(d.a.ON_STOP)
    public void onActivityStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2592482e7dbc814d8f0740e9aa3fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2592482e7dbc814d8f0740e9aa3fa4");
        } else if (this.d) {
            a(3);
        }
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    public void onActivityDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0484ca4e55a3b3ce6579088489dd38b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0484ca4e55a3b3ce6579088489dd38b");
            return;
        }
        this.c.b(this);
        a(4);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b1633a81290080c660980794e7173c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b1633a81290080c660980794e7173c");
        } else if (i != this.e) {
            this.e = i;
            if (this.b != null) {
                this.b.f(i);
            }
        }
    }
}
