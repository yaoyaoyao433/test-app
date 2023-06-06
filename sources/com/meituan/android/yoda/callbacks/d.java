package com.meituan.android.yoda.callbacks;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends b {
    public static ChangeQuickRedirect c = null;
    private static final String d = "d";

    private d(FragmentActivity fragmentActivity, @NonNull h<YodaResult> hVar) {
        super(fragmentActivity, hVar);
        Object[] objArr = {fragmentActivity, hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774d3a1aa94110b9fca9bfd896645d76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774d3a1aa94110b9fca9bfd896645d76");
        }
    }

    public static d a(FragmentActivity fragmentActivity, @NonNull h<YodaResult> hVar) {
        Object[] objArr = {fragmentActivity, hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc38dcb42e94917feba024597bf46b45", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc38dcb42e94917feba024597bf46b45") : new d(fragmentActivity, hVar);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9caf83a0fe6dc03757fad2c919d7bcae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9caf83a0fe6dc03757fad2c919d7bcae");
        } else if (this.b instanceof a) {
            ((a) this.b).a(str);
            com.meituan.android.yoda.network.a.a().a(str, this.b);
        }
    }
}
