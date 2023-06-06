package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a {
    public static ChangeQuickRedirect a;
    public com.facebook.react.views.scroll.e b;
    private FragmentManager c;
    private PoiTabMRNFragment d;
    private int e;

    public n(@NonNull Context context, PoiTabMRNFragment poiTabMRNFragment, FragmentManager fragmentManager, int i) {
        super(context);
        Object[] objArr = {context, poiTabMRNFragment, fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfc67d29130f93c7a9ce5a878865f0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfc67d29130f93c7a9ce5a878865f0c");
            return;
        }
        this.d = poiTabMRNFragment;
        this.c = fragmentManager;
        this.e = i;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00893296f500b0ce29e318a32db54d0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00893296f500b0ce29e318a32db54d0a");
            return;
        }
        super.onViewCreated();
        this.d.a(new PoiTabMRNFragment.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.n.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment.a
            public final void a(@NonNull com.facebook.react.views.scroll.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cefda456099d725251a820f7bbf1f17e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cefda456099d725251a820f7bbf1f17e");
                } else {
                    n.this.b = eVar;
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dded21906f1c28aa105f49f870badf5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dded21906f1c28aa105f49f870badf5a");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(this.e);
        return frameLayout;
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64877e9db0b44f4d4fb3d750aaf2ccd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64877e9db0b44f4d4fb3d750aaf2ccd9");
            return;
        }
        this.d.b(z);
        if (this.d.isAdded()) {
            return;
        }
        try {
            this.c.beginTransaction().replace(this.e, this.d).commitNowAllowingStateLoss();
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
    }
}
