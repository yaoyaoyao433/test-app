package com.sankuai.eh.component.web;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.module.c;
import com.sankuai.eh.component.web.module.i;
import com.sankuai.eh.component.web.module.j;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHTransferFragment extends Fragment implements com.sankuai.eh.component.service.spi.a {
    public static ChangeQuickRedirect a;
    private j b;
    private c c;
    private String d;

    @Override // com.sankuai.eh.component.service.spi.a
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.eh.component.service.spi.a
    public final void b() {
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1641a88e7c46039079ff9f170634dcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1641a88e7c46039079ff9f170634dcb");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0e3a80e61a9a0f2eee83cd5f3f93abe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0e3a80e61a9a0f2eee83cd5f3f93abe");
        } else {
            this.c = com.sankuai.eh.component.web.plugins.core.b.a(getContext());
            this.b = new i(this.c);
        }
        com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.j(), this.c);
        getArguments().putString("url", "https://ehc.meituan.com/ehc/redirect/default");
        this.b.a(getActivity(), getArguments());
        this.d = f.a((Object) ("ehc__" + "c_pay_ehc".hashCode()));
        Statistics.disableAutoPV(this.d);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19e47112dab761bc1f9dc6df5eb92afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19e47112dab761bc1f9dc6df5eb92afb");
        } else {
            d.a("module_start", new d.b().a("name", "ehc.module.start").a("pattern", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.a(e.b(this.c.g, "url")), "pattern"), "")).a("origin", e.b(this.c.g, "url")).b);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e6ebe0d85266d82e4ff04d385e8cdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e6ebe0d85266d82e4ff04d385e8cdb");
        }
        View inflate = layoutInflater.inflate(R.layout.eh_default_content, viewGroup, false);
        this.b.a(layoutInflater, viewGroup);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c59414115b483039b419727658856fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c59414115b483039b419727658856fb");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b.a(view, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa5d7495c4746650258b837bfcccc35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa5d7495c4746650258b837bfcccc35");
            return;
        }
        super.onActivityCreated(bundle);
        this.b.a(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d242591f8be02ebf0a2b527ba536b5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d242591f8be02ebf0a2b527ba536b5b9");
            return;
        }
        super.onStart();
        this.b.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        String b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e619f21c9e95fe0175cd9f4306521990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e619f21c9e95fe0175cd9f4306521990");
            return;
        }
        super.onResume();
        if (this.c != null) {
            if (com.sankuai.eh.component.service.utils.b.d(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.g(), "apiEnabled"))) {
                new d.c().a("ehc.transfer").a("from", "indexV4").b();
            }
            String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(this.c.j, "data", "transfer", "cid"), "c_fup_lxgzg91y");
            String str = (String) this.c.c("originUrl", "");
            String b3 = TextUtils.isEmpty(e.b(str, "bizId")) ? "-999" : e.b(str, "bizId");
            String str2 = com.sankuai.eh.component.service.a.c().j().get("channel");
            if (TextUtils.isEmpty(str2)) {
                str2 = "-999";
            }
            if (!TextUtils.isEmpty(e.b(str, "utm_source"))) {
                str2 = e.b(str, "utm_source");
            }
            d.b a2 = new d.b().a("biz_id", b3).a("source_biz_id", str2);
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf46e0b376f9e5fa4d32980185628fd1", RobustBitConfig.DEFAULT_VALUE)) {
                b = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf46e0b376f9e5fa4d32980185628fd1");
            } else {
                b = e.b(str, "from");
                String b4 = e.b(str, KnbConstants.PARAMS_SCENE);
                String b5 = e.b(str, "entry");
                if (TextUtils.isEmpty(b)) {
                    if (TextUtils.isEmpty(b4)) {
                        b = !TextUtils.isEmpty(b5) ? b5 : "-999";
                    } else {
                        b = b4;
                    }
                }
            }
            Statistics.getChannel("fup").writePageView(this.d, b2, new d.b().a("custom", a2.a("from", b).b).b);
        }
        this.b.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47d3792441bb058a007cf9ad4c0b1a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47d3792441bb058a007cf9ad4c0b1a4");
            return;
        }
        super.onPause();
        this.b.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef954df609f73e5582a2acf813db671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef954df609f73e5582a2acf813db671");
            return;
        }
        super.onStop();
        this.b.e();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b2536444f371fe0dd3bf8d9e4f2a9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b2536444f371fe0dd3bf8d9e4f2a9c");
            return;
        }
        super.onDestroy();
        this.b.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b552998ce4864ce400f1e1196400c4f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b552998ce4864ce400f1e1196400c4f0");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3944e9ae8222d74ef9ab9fb719dab8b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3944e9ae8222d74ef9ab9fb719dab8b3");
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.b.a(i, strArr, iArr);
        }
    }
}
