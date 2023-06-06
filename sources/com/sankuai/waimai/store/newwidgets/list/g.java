package com.sankuai.waimai.store.newwidgets.list;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g<T, Contract extends b> implements h {
    public static ChangeQuickRedirect n;
    public Contract o;
    public View p;
    public boolean q;

    @LayoutRes
    public int a() {
        return -1;
    }

    public abstract void a(@NonNull View view);

    public abstract void a(T t, int i);

    @Override // com.sankuai.waimai.store.newwidgets.list.h
    public void g() {
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88089e96e39a557ceedc80ad2560cb79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88089e96e39a557ceedc80ad2560cb79");
        } else {
            this.q = true;
        }
    }

    public void a(Contract contract) {
        if (contract == null) {
            return;
        }
        this.o = contract;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.h
    public final View c(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a39f18b810c05c64dd691c0af72831", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a39f18b810c05c64dd691c0af72831");
        }
        View a = a(viewGroup);
        if (a == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = n;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1da03e96bb634b2a7d1ab24170346de2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1da03e96bb634b2a7d1ab24170346de2");
            } else if (com.sankuai.waimai.store.config.k.a()) {
                throw new RuntimeException("BaseViewHolderBaseViewHolder create view failed!");
            } else {
                com.sankuai.shangou.stone.util.log.a.d("BaseViewHolder", "BaseViewHolder create view failed!", new Object[0]);
            }
        }
        if (a != null) {
            a(a);
        } else {
            Context context = viewGroup.getContext();
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = n;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1046569c383272c73479c68aa52e8dcd", RobustBitConfig.DEFAULT_VALUE)) {
                a = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1046569c383272c73479c68aa52e8dcd");
            } else {
                TextView textView = new TextView(context);
                textView.setText("资源加载失败");
                int a2 = com.sankuai.shangou.stone.util.h.a(context, 15.0f);
                textView.setPadding(a2, a2, a2, a2);
                a = textView;
            }
        }
        this.p = a;
        return a;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.h
    public final void b(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26214124e4fa9d25d0bb78f991d4572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26214124e4fa9d25d0bb78f991d4572");
        } else {
            a(obj, i);
        }
    }

    public View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc241bdccf6d487d393f4979111b54ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc241bdccf6d487d393f4979111b54ea");
        }
        int a = a();
        if (-1 == a || a == 0) {
            return null;
        }
        try {
            return LayoutInflater.from(viewGroup.getContext()).inflate(a, viewGroup, false);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.h
    public final boolean h() {
        return this.q;
    }
}
