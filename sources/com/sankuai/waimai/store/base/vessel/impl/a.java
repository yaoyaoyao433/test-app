package com.sankuai.waimai.store.base.vessel.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements com.sankuai.waimai.store.base.vessel.a {
    public static ChangeQuickRedirect b;
    public final SCBaseActivity c;

    public void a(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca35b265aedf4338be9ed43513978f91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca35b265aedf4338be9ed43513978f91");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8641e7ceb071b765cd8a490a4fe73712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8641e7ceb071b765cd8a490a4fe73712");
        }
    }

    @Override // com.sankuai.waimai.platform.capacity.network.errorhanding.g
    public boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.a
    public void b(Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public void b(Bundle bundle) {
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fede8e9de254f36972c029da610507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fede8e9de254f36972c029da610507");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ba63abf6c053541dfa5b204703b3f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ba63abf6c053541dfa5b204703b3f2");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a62036b5d4eea436e9e92c273d6f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a62036b5d4eea436e9e92c273d6f4b");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff56120dc2469a9352195a63523438a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff56120dc2469a9352195a63523438a1");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb85dd5b1781b13b2932f673aa7ffa66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb85dd5b1781b13b2932f673aa7ffa66");
        }
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6181203446d854efccbd2cd893d7246", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6181203446d854efccbd2cd893d7246");
        } else {
            this.c = sCBaseActivity;
        }
    }

    public final Intent l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f793475fd1ce5815d33d49727b83bd", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f793475fd1ce5815d33d49727b83bd") : this.c.getIntent();
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28e2087527957119bbfdae9dd7b4bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28e2087527957119bbfdae9dd7b4bb8");
        } else {
            this.c.finish();
        }
    }

    public final SCBaseActivity n() {
        return this.c;
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033d85826d51ce87673d5211cafb4b8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033d85826d51ce87673d5211cafb4b8c")).booleanValue() : com.sankuai.waimai.store.util.b.a(this.c);
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca387e90a4011ae2221cad50459bf0d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca387e90a4011ae2221cad50459bf0d") : this.c.w();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a94cfcec16048168e0a23c8b8995fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a94cfcec16048168e0a23c8b8995fc3");
        } else {
            this.c.setContentView(i);
        }
    }

    public final <T extends View> T b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28052393ebca491fd2287fe82f4e632", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28052393ebca491fd2287fe82f4e632") : (T) this.c.findViewById(i);
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1721d7dffc8d911fbcd6693b5226a0ee", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1721d7dffc8d911fbcd6693b5226a0ee") : new HashMap();
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0046adfc6dba3f1ca753577fd5451f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0046adfc6dba3f1ca753577fd5451f6") : com.sankuai.waimai.store.manager.judas.b.a((Object) this.c);
    }
}
