package com.sankuai.waimai.business.user.comment.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.comment.Picture;
import com.sankuai.waimai.platform.widget.SquareImageView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter implements View.OnClickListener {
    public static ChangeQuickRedirect a = null;
    public static int b = 5;
    private static int g = 175;
    private static int h = 80;
    public InterfaceC0880a c;
    public final Context d;
    public final int e;
    public final int f;
    private final int i;
    @NonNull
    private ArrayList<Picture> j;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.user.comment.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0880a {
        void a(ArrayList<Picture> arrayList, int i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(Context context, int i, int i2) {
        Object[] objArr = {context, 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac024fedb0ae2767b8e47dd28a31aad4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac024fedb0ae2767b8e47dd28a31aad4");
            return;
        }
        this.j = new ArrayList<>();
        this.d = context;
        this.i = R.drawable.wm_comment_img_load_placeholder_small;
        this.e = g;
        this.f = h;
    }

    public final void a(ArrayList<Picture> arrayList) {
        int i = 0;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944ae0981803166c32c00e78a069a56a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944ae0981803166c32c00e78a069a56a");
            return;
        }
        this.j.clear();
        if (arrayList != null) {
            if (arrayList.size() > 9) {
                Iterator<Picture> it = arrayList.iterator();
                while (it.hasNext()) {
                    Picture next = it.next();
                    if (next != null) {
                        this.j.add(next);
                        i++;
                        if (i >= 9) {
                            break;
                        }
                    }
                }
            } else {
                this.j.addAll(arrayList);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d788c7ddd6503175d34a51d4f3a0ea90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d788c7ddd6503175d34a51d4f3a0ea90")).intValue() : this.j.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb520adea1f992286b7f568f4421623", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb520adea1f992286b7f568f4421623") : this.j.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        SquareImageView squareImageView;
        SquareImageView squareImageView2;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c683c337a5385420146f7aeefbcab313", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c683c337a5385420146f7aeefbcab313");
        }
        if (view == null) {
            squareImageView2 = new SquareImageView(this.d);
            squareImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            squareImageView2.setOnClickListener(this);
            squareImageView2.setTag(this.i, Integer.valueOf(i));
            squareImageView = squareImageView2;
        } else {
            squareImageView = view;
            squareImageView2 = (SquareImageView) view;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.d;
        a2.j = this.i;
        a2.i = this.i;
        a2.e = 1;
        a2.l = true;
        a2.c = this.j.get(i).getThumbUrl(this.d);
        a2.a((ImageView) squareImageView2);
        return squareImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b27cdf69767b226f3f98c3bdcce897d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b27cdf69767b226f3f98c3bdcce897d");
        } else if (this.c != null) {
            try {
                this.c.a(this.j, ((Integer) view.getTag(this.i)).intValue());
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("ImageShowAdapter-onClick", e.getMessage(), new Object[0]);
            }
        }
    }
}
