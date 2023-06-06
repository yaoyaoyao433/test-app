package com.sankuai.waimai.ugc.image.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ImagePreviewAdapter<T> extends PagerAdapter implements d.f {
    private static final int a = 2130839101;
    public static ChangeQuickRedirect c;
    protected final Context d;
    public final ArrayList<PhotoView> e;
    @NonNull
    public ArrayList<T> f;

    public abstract void a(T t, PhotoView photoView);

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ImagePreviewAdapter(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7868c6cbcb9a9f2696e0c50c8e9780a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7868c6cbcb9a9f2696e0c50c8e9780a4");
            return;
        }
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.d = context;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36e487daa042a539f5dab51b8831457", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36e487daa042a539f5dab51b8831457")).intValue() : this.f.size();
    }

    public static int a(int i) {
        return i >= 3 ? i % 3 : i;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88dc36726a5986e3d5fb39f3e09a458d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88dc36726a5986e3d5fb39f3e09a458d");
        }
        int a2 = a(i);
        while (a2 >= this.e.size()) {
            this.e.add((PhotoView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_comment_image_item, viewGroup, false));
        }
        PhotoView photoView = this.e.get(a2);
        if (photoView.getParent() != null) {
            viewGroup.removeView(photoView);
        }
        viewGroup.addView(photoView);
        photoView.setScale(1.0f);
        a(this.f.get(i), photoView);
        photoView.setOnViewTapListener(this);
        return photoView;
    }
}
