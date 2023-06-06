package com.sankuai.waimai.store.view.banner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BannerPagerAdapter<T> extends PagerAdapter {
    public static ChangeQuickRedirect b;
    @NonNull
    protected final List<T> c;
    @NonNull
    protected final Context d;
    protected a e;

    public abstract View b(int i);

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public BannerPagerAdapter(Context context, List list, a aVar) {
        Object[] objArr = {context, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f637fbc52b34bb0f17180c4aa752144d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f637fbc52b34bb0f17180c4aa752144d");
            return;
        }
        this.c = new ArrayList();
        this.d = context;
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.c.addAll(list);
        }
        this.e = aVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9d76cc14ba3ce1cd30a908bc603ba2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9d76cc14ba3ce1cd30a908bc603ba2")).intValue() : this.c.size() == 1 ? 1 : Integer.MAX_VALUE;
    }

    @Override // android.support.v4.view.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9351a1624147dfcd0fb66b941d7150e2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9351a1624147dfcd0fb66b941d7150e2");
        }
        View b2 = b(i % a());
        viewGroup.addView(b2);
        return b2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc368e04137cd96cefa35eb8926819f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc368e04137cd96cefa35eb8926819f4");
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fece46244ad61dc5202d24aa0b8c343e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fece46244ad61dc5202d24aa0b8c343e")).intValue() : this.c.size();
    }

    public final T c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ec484107b74f5326f0ea52b0a53fec", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ec484107b74f5326f0ea52b0a53fec") : this.c.get(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public int a() {
            return -1;
        }

        @NonNull
        public ImageView.ScaleType b() {
            return ImageView.ScaleType.CENTER_CROP;
        }
    }
}
