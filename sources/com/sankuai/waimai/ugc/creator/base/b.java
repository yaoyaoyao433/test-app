package com.sankuai.waimai.ugc.creator.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
import com.sankuai.waimai.ugc.creator.utils.d;
import com.sankuai.waimai.ugc.creator.utils.j;
import com.sankuai.waimai.ugc.creator.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.ugc.creator.framework.b {
    public static ChangeQuickRedirect n;
    private Dialog a;
    public com.sankuai.waimai.ugc.creator.config.a o;
    protected int p;
    protected int q;

    public void a(Intent intent) {
    }

    public boolean a(int i, int i2, Intent intent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public b() {
    }

    public b(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df14bccee4ee74a36bdd87f182b8065c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df14bccee4ee74a36bdd87f182b8065c");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028b  */
    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.ugc.creator.framework.e r19) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ugc.creator.base.b.a(com.sankuai.waimai.ugc.creator.framework.e):void");
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b, com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad23b4ab97256a56e2ea037189c918a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad23b4ab97256a56e2ea037189c918a2");
            return;
        }
        super.a(bundle);
        a(w());
    }

    public final boolean s() {
        return this.p == 1;
    }

    public final boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4697536f8a07149dd617655066267760", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4697536f8a07149dd617655066267760")).booleanValue() : !s();
    }

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc994ef5f32dd1e84921bc8a7263012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc994ef5f32dd1e84921bc8a7263012");
        } else if (this.a == null) {
            this.a = d.a(B());
        } else {
            this.a.show();
        }
    }

    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a01468b9933db2ea90a850f4ce2ff96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a01468b9933db2ea90a850f4ce2ff96");
        } else if (this.a != null) {
            this.a.dismiss();
            this.a = null;
        }
    }

    public final Intent w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e57dc4b3eb0af29e46fb92a3cba616", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e57dc4b3eb0af29e46fb92a3cba616");
        }
        Activity B = B();
        if (B != null) {
            return B.getIntent();
        }
        return null;
    }

    public final void a(Bundle bundle, String str, int i) {
        Object[] objArr = {bundle, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9adba1ce82e02f22a9f21d3bc4ab42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9adba1ce82e02f22a9f21d3bc4ab42");
        } else if (o.a(B())) {
            bundle.putInt("creatorJumpType", 1);
            j.a(B(), str, bundle, i);
        }
    }

    public final void b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549868efcce4ce072499e785cb5c3900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549868efcce4ce072499e785cb5c3900");
        } else if (o.a(B())) {
            ae.a(B(), str);
        }
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1717f2a1570bf8013fff0b003f67eb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1717f2a1570bf8013fff0b003f67eb5d");
            return;
        }
        Activity B = B();
        if (B instanceof BaseActivity) {
            ((BaseActivity) B).a(new com.sankuai.waimai.ugc.creator.framework.event.b(1001));
        }
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final boolean b(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925ee449b1e704aa53c530bf9246d537", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925ee449b1e704aa53c530bf9246d537")).booleanValue();
        }
        switch (bVar.e) {
            case 1000:
                return p();
            case 1001:
                return q();
            case 1002:
                com.sankuai.waimai.ugc.creator.framework.event.a aVar = (com.sankuai.waimai.ugc.creator.framework.event.a) bVar;
                return a(aVar.b, aVar.a, aVar.c);
            default:
                return false;
        }
    }
}
