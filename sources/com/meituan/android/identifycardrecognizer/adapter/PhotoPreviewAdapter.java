package com.meituan.android.identifycardrecognizer.adapter;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.github.chrisbanes.xdphotoview.PhotoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PhotoPreviewAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    public a b;
    private Context c;
    private List<String> d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public PhotoPreviewAdapter(Context context, List<String> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588fe90a9382785581a86410dcc2af71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588fe90a9382785581a86410dcc2af71");
            return;
        }
        this.c = context;
        this.d = list;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba25d5615bd2c3103e96749ca812f1fb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba25d5615bd2c3103e96749ca812f1fb")).intValue() : this.d.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, final int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a88ef2e6e8a4e535c5f87671b7dd914", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a88ef2e6e8a4e535c5f87671b7dd914");
        }
        String str = this.d.get(i);
        PhotoView photoView = new PhotoView(this.c);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(str, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (i2 > measuredWidth || i3 > measuredHeight) {
            float f = i2;
            float f2 = i3;
            float max = Math.max(f / measuredWidth, f2 / measuredHeight);
            i2 = (int) (f / max);
            i3 = (int) (f2 / max);
        }
        com.meituan.android.paybase.config.a.d().r().a(str).a(i2, i3).a().a(photoView);
        viewGroup.addView(photoView);
        photoView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.identifycardrecognizer.adapter.PhotoPreviewAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1498e214ad4314b62c73922381c1848a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1498e214ad4314b62c73922381c1848a");
                } else if (PhotoPreviewAdapter.this.b != null) {
                    PhotoPreviewAdapter.this.b.a(i);
                }
            }
        });
        return photoView;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b785b7286e85890fdb35f8bd192f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b785b7286e85890fdb35f8bd192f8c");
        } else {
            viewGroup.removeView((View) obj);
        }
    }
}
