package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGCachePagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect i;
    protected com.sankuai.waimai.store.base.b j;
    protected Map<String, com.sankuai.waimai.store.base.b> k;
    protected a l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, com.sankuai.waimai.store.base.b bVar);
    }

    public abstract int a(int i2);

    public abstract com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i2);

    public abstract void a(com.sankuai.waimai.store.base.b bVar, int i2);

    public SGCachePagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6967f67359a0f43773775c597d298e58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6967f67359a0f43773775c597d298e58");
        } else {
            this.k = new HashMap();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe60a8f680a9b48f3dbec0dbca057714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe60a8f680a9b48f3dbec0dbca057714");
        } else {
            this.k.clear();
        }
    }

    public final void a(a aVar) {
        this.l = aVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99160a0527b5d012fb47bdea8e091eeb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99160a0527b5d012fb47bdea8e091eeb")).booleanValue() : view == ((com.sankuai.waimai.store.base.b) obj).getView();
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        Object[] objArr = {viewGroup, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a16d03f9c30ffea40daf2d5ccf8d063e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a16d03f9c30ffea40daf2d5ccf8d063e");
        }
        String b = b(i2, viewGroup);
        com.sankuai.waimai.store.base.b bVar = this.k.get(b);
        if (bVar == null) {
            bVar = a(viewGroup, i2);
            this.k.put(b, bVar);
            bVar.createView(viewGroup);
            if (this.l != null) {
                this.l.a(i2, bVar);
            }
        }
        viewGroup.addView(bVar.getView());
        a(bVar, i2);
        return bVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba13c28539e2eef9a831debca6a290a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba13c28539e2eef9a831debca6a290a");
        } else {
            viewGroup.removeView(((com.sankuai.waimai.store.base.b) obj).getView());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        boolean z = false;
        Object[] objArr = {viewGroup, Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f882171665cd463567bbe18cbd98eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f882171665cd463567bbe18cbd98eb");
            return;
        }
        super.setPrimaryItem(viewGroup, i2, obj);
        if (this.j != obj) {
            if (this.j instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) this.j).a(false);
            }
            if (obj instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) obj).a((i2 != 0 || this.j == null) ? true : true);
            }
            this.j = (com.sankuai.waimai.store.base.b) obj;
        }
    }

    @Nullable
    public final com.sankuai.waimai.store.base.b a(int i2, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i2), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aac59663cc71cfeaad8956ef8d3d0e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aac59663cc71cfeaad8956ef8d3d0e6");
        }
        if (this.k != null) {
            return this.k.get(b(i2, viewGroup));
        }
        return null;
    }

    private String b(int i2, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i2), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2faef6baefc152709330f0eecd460a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2faef6baefc152709330f0eecd460a");
        }
        return "CubeBlock:ViewPager:" + viewGroup.getId() + a(i2) + CommonConstant.Symbol.COLON + i2;
    }
}
