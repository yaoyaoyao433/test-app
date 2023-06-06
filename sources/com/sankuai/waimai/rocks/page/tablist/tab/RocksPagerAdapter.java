package com.sankuai.waimai.rocks.page.tablist.tab;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.tablist.rocklist.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RocksPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    public SparseArray<c> b;
    public c c;
    private com.sankuai.waimai.rocks.page.a d;
    private int e;
    private boolean f;

    private void a(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a8222a5b481e4250c23a25be48eaea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a8222a5b481e4250c23a25be48eaea");
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public RocksPagerAdapter(com.sankuai.waimai.rocks.page.a aVar, int i, boolean z) {
        Object[] objArr = {aVar, Integer.valueOf(i), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b27924e97fa5d231493fb4d334a9d67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b27924e97fa5d231493fb4d334a9d67");
            return;
        }
        this.c = null;
        this.b = new SparseArray<>();
        this.e = i;
        this.d = aVar;
        this.f = true;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        return this.e;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbdc6692caa62766bc524093eea7a80", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbdc6692caa62766bc524093eea7a80")).booleanValue() : view == ((c) obj).i();
    }

    @Override // android.support.v4.view.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d740e37bb8444ef764c0359a272d6dd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d740e37bb8444ef764c0359a272d6dd");
        }
        c a2 = a(i);
        if (a2 != null) {
            viewGroup.addView(a2.i());
            a2.a(this.d, 1);
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        c cVar = new c(this.d, sb.toString());
        this.b.put(i, cVar);
        cVar.a(viewGroup);
        if (cVar != this.c) {
            a(cVar, false);
        }
        cVar.a(this.d, 1);
        return cVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a63a87dcdff2192d384b42b93ad26d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a63a87dcdff2192d384b42b93ad26d12");
        } else if ((obj instanceof c) && this.f) {
            c cVar = (c) obj;
            viewGroup.removeView(cVar.i());
            cVar.a(this.d, 0);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void notifyDataSetChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fdab995d10f4ca31d9e17eb748689b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fdab995d10f4ca31d9e17eb748689b3");
        } else {
            super.notifyDataSetChanged();
        }
    }

    public final c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410605a9c96d63e052b6ce82cfd7586f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410605a9c96d63e052b6ce82cfd7586f");
        }
        if (i < 0) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d648f570515b32af7191bc5c671b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d648f570515b32af7191bc5c671b39");
            return;
        }
        c cVar = (c) obj;
        if (cVar != this.c) {
            a(this.c, false);
            a(cVar, true);
            this.c = cVar;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9069d705d4dcf460ded4c6c79c53782c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9069d705d4dcf460ded4c6c79c53782c");
        } else if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                this.b.get(this.b.keyAt(0)).a(this.d, 0);
            }
        }
    }
}
