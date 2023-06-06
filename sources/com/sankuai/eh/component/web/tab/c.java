package com.sankuai.eh.component.web.tab;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.titans.EHMTWebFragment;
import com.sankuai.eh.plugins.fupTab.BlockItemView;
import com.sankuai.eh.plugins.fupTab.EHTabBlock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.sankuai.eh.component.web.plugins.b implements EHTabBlock.a {
    public static ChangeQuickRedirect a;
    public Fragment b;
    private a f;
    private Bundle g;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "01";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "fup_tab";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774828c370c92a5e206ae2363e3e6a99", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774828c370c92a5e206ae2363e3e6a99") : new String[]{"onComponentInit", "onComponentStart"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8efcc39970198223c89e206b3c8114e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8efcc39970198223c89e206b3c8114e");
            return;
        }
        String a2 = aVar.a();
        int hashCode = a2.hashCode();
        if (hashCode != -1732242418) {
            if (hashCode == 2144466212 && a2.equals("onComponentStart")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (a2.equals("onComponentInit")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                if (aVar.d() instanceof Bundle) {
                    this.g = (Bundle) aVar.d();
                    return;
                }
                return;
            case 1:
                if (aVar.d() instanceof ViewGroup) {
                    this.f = new a((ViewGroup) aVar.d(), this.d.g);
                    a aVar2 = this.f;
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "292b245a82ad68b502bb04c87b5b1a8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "292b245a82ad68b502bb04c87b5b1a8a");
                        return;
                    }
                    aVar2.c = new EHTabBlock(aVar2.d.getContext());
                    try {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(12);
                        aVar2.c.setLayoutParams(layoutParams);
                        aVar2.c.setBackgroundColor(-1);
                        aVar2.c.setPadding(com.sankuai.eh.component.service.utils.a.a(12.0f), com.sankuai.eh.component.service.utils.a.a(4.0f), com.sankuai.eh.component.service.utils.a.a(12.0f), com.sankuai.eh.component.service.utils.a.a(9.0f));
                        aVar2.c.setOnItemClickListener(this);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "36f389b1ddd4543a147c6097ae379221", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "36f389b1ddd4543a147c6097ae379221");
                            return;
                        }
                        JsonElement a3 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.a.a().b("fup_bottom_tab", "{}"));
                        String b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(a3, "userid"), "");
                        String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(a3, "data"), "");
                        if (!TextUtils.isEmpty(b2) && b.equals(com.sankuai.eh.component.service.a.c().d())) {
                            if (aVar2.a(b2)) {
                                aVar2.a();
                            }
                            aVar2.a(false);
                            return;
                        }
                        aVar2.a(true);
                        return;
                    } catch (Exception e) {
                        d.a(e);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.eh.plugins.fupTab.EHTabBlock.a
    public final void a(BlockItemView blockItemView, int i) {
        String builder;
        Object[] objArr = {blockItemView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd2ab29cbdfff768388fecf494a4a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd2ab29cbdfff768388fecf494a4a34");
        } else if (this.f != null) {
            a aVar = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if ((PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "42205e2e3d630dfa18e4d64254266b0c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "42205e2e3d630dfa18e4d64254266b0c")).intValue() : aVar.c.getCurIndex()) != i) {
                try {
                    a aVar2 = this.f;
                    com.sankuai.eh.plugins.fupTab.a blockItem = blockItemView.getBlockItem();
                    Object[] objArr3 = {blockItem, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "950bbef18516b4c71c559b67fcdfb3fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "950bbef18516b4c71c559b67fcdfb3fb");
                    } else {
                        d.b("fup", "b_fup_g5v8t3vc_mc", "c_fup_2e5d1t9k", new d.b().a("biz_id", Integer.valueOf(blockItem.a)).a("display_name", blockItem.c).a("from", aVar2.a(aVar2.b, "from")).a("utm_source", aVar2.a(aVar2.b, "utm_source")).b);
                    }
                    com.sankuai.eh.plugins.fupTab.a blockItem2 = blockItemView.getBlockItem();
                    Object[] objArr4 = {blockItem2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c3bf58d1204441495ea85a0608bd6c22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c3bf58d1204441495ea85a0608bd6c22");
                        return;
                    }
                    String str = blockItem2.b;
                    if (str.startsWith("http")) {
                        builder = f.a(e.a(str, "ehc_source", "tab"));
                    } else {
                        String b = e.b(str, "url");
                        e.a(str, "ehc_source", "tab");
                        builder = Uri.parse(e.a(str, "url")).buildUpon().appendQueryParameter("url", b).toString();
                    }
                    String str2 = builder;
                    if (blockItem2.f == 2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage(this.d.i.getPackageName());
                        intent.setData(Uri.parse(str2));
                        intent.putExtra("ehc_source", "tab");
                        this.d.i.startActivity(intent);
                        return;
                    }
                    this.g.putAll(e.a(e.g(str2)));
                    this.d.i.getIntent().setData(Uri.parse(str2));
                    a aVar3 = this.f;
                    Object[] objArr5 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "ddcf4b272edf3794a96fe950cad63182", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "ddcf4b272edf3794a96fe950cad63182");
                    } else if (aVar3.c != null && aVar3.c.getItemClickListener() != null) {
                        aVar3.c.setItemPressed(i);
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c5dc321772efc36a92f01039ffaeda14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c5dc321772efc36a92f01039ffaeda14");
                    } else if (this.d.i instanceof AppCompatActivity) {
                        this.b = EHMTWebFragment.a(this.d, this.g);
                        ((AppCompatActivity) this.d.i).getSupportFragmentManager().beginTransaction().replace(R.id.eh_component_web_content, this.b).commitAllowingStateLoss();
                    }
                    Object[] objArr7 = {str2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a92a9e6138313e427679469665de4ae1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a92a9e6138313e427679469665de4ae1");
                    } else {
                        String b2 = e.b(str2, "url");
                        String a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.a(b2), "pattern");
                        d.a("ehc_start", new d.b().a("name", "ehc.module.start").a("original", b2).a("originalPattern", a2).a("pattern", a2).b);
                    }
                    try {
                        com.sankuai.eh.component.service.utils.a.a(this.d.i.getWindow(), "#ffeeeeee", 0);
                    } catch (Exception e) {
                        d.a(e);
                    }
                } catch (Exception unused) {
                    new d.c().a("ehc_fup_tab").a("type", "click_exception").b();
                }
            }
        }
    }
}
