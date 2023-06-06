package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMscFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.pagenotfound.PageNotFoundManager;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a {
    public static ChangeQuickRedirect a;
    private final FragmentManager b;
    private PoiTabMscFragment c;
    private final int d;
    private String e;
    private StandardShopPageAdapter.b f;

    public o(@NonNull Context context, PoiTabMscFragment poiTabMscFragment, FragmentManager fragmentManager, int i) {
        super(context);
        Object[] objArr = {context, poiTabMscFragment, fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d5d7b965bb5a1b60e179e67a3e48bab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d5d7b965bb5a1b60e179e67a3e48bab");
            return;
        }
        this.e = "";
        this.c = poiTabMscFragment;
        this.b = fragmentManager;
        this.d = i;
    }

    public final void a(StandardShopPageAdapter.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f4441aed4b533c832e7b1ab6dc1e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f4441aed4b533c832e7b1ab6dc1e9a");
            return;
        }
        this.f = bVar;
        this.e = bVar.b();
        PageNotFoundManager.a(this.e, new WeakReference(this));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19937113656067561e697b62fec0288e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19937113656067561e697b62fec0288e");
        } else {
            super.onViewCreated();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e3f35f590b8f4a6d17e6d6c2387b92", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e3f35f590b8f4a6d17e6d6c2387b92");
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(this.d);
        return frameLayout;
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af1eefae45c225b2d7cb36b4639f256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af1eefae45c225b2d7cb36b4639f256");
            return;
        }
        if (!this.c.isAdded()) {
            a();
        }
        this.c.b(z);
    }

    public final boolean a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31997f560b9aa6b4841ee7fbf8ea1d62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31997f560b9aa6b4841ee7fbf8ea1d62")).booleanValue();
        }
        if (this.f != null && TextUtils.equals(str, this.e) && z && z2) {
            this.c = this.f.a();
            a();
            return true;
        }
        return false;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4b27907bb1f6dec1c10a0441ec9b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4b27907bb1f6dec1c10a0441ec9b6c");
            return;
        }
        try {
            this.b.beginTransaction().replace(this.d, this.c).commitNowAllowingStateLoss();
        } catch (Exception e) {
            com.dianping.judas.util.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443789eb5955a9400c83957523a1592a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443789eb5955a9400c83957523a1592a");
            return;
        }
        if (this.f != null && !t.a(this.e)) {
            PageNotFoundManager.a(this.e);
        }
        super.onDestroy();
    }
}
