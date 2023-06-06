package com.sankuai.waimai.store.mrn.dialog;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.mrn.dialog.SGMRNFragment;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    public String d;
    public String e;
    public String f;
    private float g;
    private boolean h;
    private d i;
    private final boolean j;
    @Nullable
    private final List<String> k;
    private boolean l;

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        return null;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644247660b4d5041d2e2170ffa40e775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644247660b4d5041d2e2170ffa40e775");
        } else {
            this.i.d(str);
        }
    }

    public c(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53da6974e02582f0c8a530d65309a9ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53da6974e02582f0c8a530d65309a9ec");
            return;
        }
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0.0f;
        this.h = false;
        i h = i.h();
        this.j = h.a("mrn_half_page_use_normal_fragment", false);
        this.k = h.e("mrn_half_page_use_normal_fragment_list");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
        if (r14 != false) goto L28;
     */
    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.support.v4.app.FragmentActivity r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.dialog.c.a(android.support.v4.app.FragmentActivity, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        SGMRNDialogFragment.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b48001f394166a71ac151afb060db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b48001f394166a71ac151afb060db6");
            return;
        }
        super.g();
        if (this.h) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c06b5a0137168be1dc23dfef2806211c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c06b5a0137168be1dc23dfef2806211c");
            return;
        }
        try {
            if (this.l) {
                SGMRNFragment.a aVar2 = new SGMRNFragment.a();
                aVar2.b = this.d;
                aVar2.d = this.f;
                aVar2.c = this.e;
                aVar2.e = this.g;
                aVar2.f = true;
                aVar2.g = true;
                aVar = aVar2;
            } else {
                SGMRNDialogFragment.a aVar3 = new SGMRNDialogFragment.a();
                aVar3.b = this.d;
                aVar3.d = this.f;
                aVar3.c = this.e;
                aVar3.e = this.g;
                aVar3.g = true;
                aVar3.h = true;
                aVar = aVar3;
            }
            Object[] objArr3 = {aVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee616ef6524a4a89f1785697d41f58b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee616ef6524a4a89f1785697d41f58b1");
            } else {
                Uri data = l().getData();
                if (data != null) {
                    Set<String> queryParameterNames = data.getQueryParameterNames();
                    if (!com.sankuai.shangou.stone.util.a.b(queryParameterNames)) {
                        for (String str : queryParameterNames) {
                            aVar.a(str, data.getQueryParameter(str));
                        }
                    }
                }
            }
            this.i = aVar.a();
            this.i.a(this.c, c.class.getSimpleName());
            this.h = true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eea15992e53b4b4bdbebfe18ee0b223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eea15992e53b4b4bdbebfe18ee0b223");
            return;
        }
        super.a(i, i2, intent);
        if (this.i != null) {
            this.i.onActivityResult(i, i2, intent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
        }

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc916a43c6886a917527617a025bd698", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc916a43c6886a917527617a025bd698") : new c(sCBaseActivity);
        }
    }
}
