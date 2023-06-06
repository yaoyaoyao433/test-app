package com.sankuai.waimai.store.drug.home.refactor;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
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
public class PoiPageLifecycleManager implements android.arch.lifecycle.e, android.arch.lifecycle.l<com.sankuai.waimai.store.drug.home.refactor.event.c> {
    public static ChangeQuickRedirect a;
    k b;
    private android.arch.lifecycle.d c;
    private boolean d;
    private m e;

    @Override // android.arch.lifecycle.l
    public final /* synthetic */ void a(@Nullable com.sankuai.waimai.store.drug.home.refactor.event.c cVar) {
        com.sankuai.waimai.store.drug.home.refactor.event.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edf78f678598dd4b1073cb92e2557dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edf78f678598dd4b1073cb92e2557dd");
        } else if (cVar2 != null) {
            if (cVar2.a == 0) {
                if (!this.d) {
                    a(m.STATE_ON_START);
                    a(m.STATE_ON_RESUME);
                }
                this.d = true;
                return;
            }
            if (this.d) {
                a(m.STATE_ON_PAUSE);
                a(m.STATE_ON_STOP);
            }
            this.d = false;
        }
    }

    public PoiPageLifecycleManager(SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8cb9f98bf90a060a6a43741a2d8c6fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8cb9f98bf90a060a6a43741a2d8c6fd");
            return;
        }
        this.d = true;
        this.e = null;
        this.c = sCBaseActivity.getLifecycle();
        this.c.a(this);
        ((PageEventHandler) q.a((FragmentActivity) sCBaseActivity).a(PageEventHandler.class)).a(sCBaseActivity, com.sankuai.waimai.store.drug.home.refactor.event.c.class, this);
    }

    @OnLifecycleEvent(d.a.ON_START)
    public void onActivityStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a93d5a5393a38e8565fbf3b9ab8766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a93d5a5393a38e8565fbf3b9ab8766");
        } else if (this.d) {
            a(m.STATE_ON_START);
        }
    }

    @OnLifecycleEvent(d.a.ON_RESUME)
    public void onActivityResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea3e6ef4645695a9414b6bf63774726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea3e6ef4645695a9414b6bf63774726");
        } else if (this.d) {
            a(m.STATE_ON_RESUME);
        }
    }

    @OnLifecycleEvent(d.a.ON_PAUSE)
    public void onActivityPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aded093d6625d48f44c39e8411138ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aded093d6625d48f44c39e8411138ea");
        } else if (this.d) {
            a(m.STATE_ON_PAUSE);
        }
    }

    @OnLifecycleEvent(d.a.ON_STOP)
    public void onActivityStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c608f85aaeb007139a7c56e87ff0883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c608f85aaeb007139a7c56e87ff0883");
        } else if (this.d) {
            a(m.STATE_ON_STOP);
        }
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    public void onActivityDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a415a2af56ad2b2eb2edf764da710d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a415a2af56ad2b2eb2edf764da710d37");
            return;
        }
        this.c.b(this);
        a(m.STATE_ON_DESTROY);
    }

    private void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade61913fe5c6a960d4a7469a08eb01a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade61913fe5c6a960d4a7469a08eb01a");
        } else if (mVar != this.e) {
            this.e = mVar;
            if (this.b != null) {
                this.b.a(mVar);
            }
        }
    }
}
