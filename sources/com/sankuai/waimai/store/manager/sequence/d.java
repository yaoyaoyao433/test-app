package com.sankuai.waimai.store.manager.sequence;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.SGMarketingDialog;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d<A> implements a {
    public static ChangeQuickRedirect a;
    public A b;
    a c;
    protected Activity d;
    public com.sankuai.waimai.store.platform.marketing.a e;
    boolean f;
    public com.sankuai.waimai.store.manager.marketing.d g;
    private com.sankuai.waimai.store.manager.marketing.parser.a<A> h;
    private List<com.sankuai.waimai.store.manager.sequence.strategy.a> i;

    public void a(boolean z) {
    }

    public abstract void cancel();

    public long e() {
        return 0L;
    }

    public abstract void f();

    public d(Activity activity, @NonNull com.sankuai.waimai.store.manager.marketing.parser.a<A> aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7461c0b7e440077cf7b42898ce6d3b42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7461c0b7e440077cf7b42898ce6d3b42");
            return;
        }
        this.i = new ArrayList();
        this.f = false;
        this.d = activity;
        this.h = aVar;
        this.f = false;
    }

    public final String c() {
        return this.e == null ? "" : this.e.b;
    }

    public final void a(com.sankuai.waimai.store.manager.sequence.strategy.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372146a37e9ca21659234a5e05a6317f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372146a37e9ca21659234a5e05a6317f");
        } else if (aVar == null || this.i.contains(aVar)) {
        } else {
            this.i.add(aVar);
        }
    }

    private void a(String str, SGMarketingDialog sGMarketingDialog, String str2, boolean z) {
        Object[] objArr = {str, sGMarketingDialog, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c6bdfdd379c26d45c6d9cb2b6304b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c6bdfdd379c26d45c6d9cb2b6304b0");
            return;
        }
        if (this.c != null) {
            this.c.a(str, sGMarketingDialog, str2);
        }
        if (z) {
            g();
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2539ff0010b253ef6827ca5a8bb312ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2539ff0010b253ef6827ca5a8bb312ee");
        } else if (this.c != null) {
            this.c.a(str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807192e6738be6c430a1989fe13d07de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807192e6738be6c430a1989fe13d07de");
        } else if (this.c != null) {
            this.c.b(str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b93e5bac3f0e753e498fef4b4246beea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b93e5bac3f0e753e498fef4b4246beea");
        } else if (this.c != null) {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void a(String str, SGMarketingDialog sGMarketingDialog, String str2) {
        Object[] objArr = {str, sGMarketingDialog, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd26cc106d970f9c0584a4389eadcb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd26cc106d970f9c0584a4389eadcb97");
        } else {
            a(str, sGMarketingDialog, str2, true);
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93edc10242dad886f2f653a6e787aeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93edc10242dad886f2f653a6e787aeb0");
        } else if (this.c != null) {
            this.c.b();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678c076bf6bd09345ccb2dbd84519549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678c076bf6bd09345ccb2dbd84519549");
            return;
        }
        this.f = true;
        if (this.d == null) {
            a(null, SGMarketingDialog.ContextError, "mContext is null", false);
        } else if (this.e == null) {
            a(null, SGMarketingDialog.RendTypeError, "template is null", false);
        } else if (!b(true)) {
            a(null, null, null, false);
        } else {
            try {
                this.b = this.h.a(this.d, this.e, this);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            if (this.b == null) {
                String str = this.e.b;
                SGMarketingDialog sGMarketingDialog = SGMarketingDialog.OperationError;
                a(str, sGMarketingDialog, "mActualNode is null object\n" + this.e.b + "\n" + this.e.c);
                return;
            }
            f();
        }
    }

    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8055033141677082020df2c08e80063f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8055033141677082020df2c08e80063f")).booleanValue();
        }
        for (com.sankuai.waimai.store.manager.sequence.strategy.a aVar : this.i) {
            if (!aVar.isValid(this.g)) {
                return false;
            }
            if (z) {
                aVar.updateValidStatus(this.g);
            }
        }
        return true;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36d74fea966c1e215fdfcd946590c3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36d74fea966c1e215fdfcd946590c3e");
            return;
        }
        for (com.sankuai.waimai.store.manager.sequence.strategy.a aVar : this.i) {
            aVar.rollback(this.g);
        }
    }
}
