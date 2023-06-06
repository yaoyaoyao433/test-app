package com.sankuai.waimai.business.page.home.basal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PreLoadLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    boolean b;
    private int c;

    public PreLoadLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e14cf1856be1c34827bacc405c7593", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e14cf1856be1c34827bacc405c7593");
        } else {
            this.c = g.c(b.a) * 2;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int getExtraLayoutSpace(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849215cb485f8fe49ce4279c2f78c538", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849215cb485f8fe49ce4279c2f78c538")).intValue();
        }
        if (state.b() || !this.b) {
            return super.getExtraLayoutSpace(state);
        }
        return this.c;
    }
}
