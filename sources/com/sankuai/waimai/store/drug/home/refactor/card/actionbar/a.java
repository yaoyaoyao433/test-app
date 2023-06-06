package com.sankuai.waimai.store.drug.home.refactor.card.actionbar;

import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    protected final com.sankuai.waimai.store.param.a b;
    protected final com.sankuai.waimai.store.drug.home.callback.a c;
    private final FragmentActivity d;

    public abstract void a(int i, View view, @Nullable View view2);

    public void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
    }

    public void b(String str) {
    }

    public a(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.drug.home.callback.a aVar2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8900ec42a55e46d1875d1957fa0fad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8900ec42a55e46d1875d1957fa0fad");
            return;
        }
        this.d = fragmentActivity;
        this.b = aVar;
        this.c = aVar2;
    }

    public final SCBaseActivity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27f7e3c33e7e3b4020e42bafd90923f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27f7e3c33e7e3b4020e42bafd90923f");
        }
        if (this.d instanceof SCBaseActivity) {
            return (SCBaseActivity) this.d;
        }
        throw new RuntimeException("Activity of cube block must be SCBaseActivity!");
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f75f6c10b007d005e423fa6633d09af", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f75f6c10b007d005e423fa6633d09af") : layoutInflater.inflate(R.layout.wm_drug_poi_channel_actionbar_main, viewGroup, false);
    }

    public final <T extends View> T a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6097a14dc0a71b79cd425752b061b205", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6097a14dc0a71b79cd425752b061b205");
        }
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04faeb969fe5c0be7b270764ca41a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04faeb969fe5c0be7b270764ca41a3e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_hrjso8hz").a("cat_id", str).a("cate_id", str).a("stid", this.b.T).a("if_med_poi", 0).a("has_word", Integer.valueOf(this.b.U)).a();
        }
    }
}
