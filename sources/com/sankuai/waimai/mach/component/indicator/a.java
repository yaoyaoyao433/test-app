package com.sankuai.waimai.mach.component.indicator;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1003a> {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private String d;
    private String e;
    private int f;
    private final j g;
    private int h;
    private int i;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1003a c1003a, int i) {
        int b;
        ViewGroup.LayoutParams layoutParams;
        C1003a c1003a2 = c1003a;
        Object[] objArr = {c1003a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420d472222ced8351fb275c3ece51f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420d472222ced8351fb275c3ece51f31");
            return;
        }
        ImageView imageView = (ImageView) c1003a2.itemView;
        if (this.b == i) {
            b = this.g.a();
        } else {
            b = this.g.b();
        }
        imageView.setImageResource(b);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String str = this.b == i ? this.d : this.e;
        if (!TextUtils.isEmpty(str)) {
            try {
                imageView.setColorFilter(Color.parseColor(str));
            } catch (Exception unused) {
            }
        }
        byte b2 = this.b == i ? (byte) 1 : (byte) 0;
        Object[] objArr2 = {imageView, Byte.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d94fa852ad185b97c8d56ea39a690da", RobustBitConfig.DEFAULT_VALUE)) {
            layoutParams = (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d94fa852ad185b97c8d56ea39a690da");
        } else if (this.h <= 0 || this.i <= 0) {
            layoutParams = null;
        } else {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams2.height = this.i;
            layoutParams2.width = b2 != 0 ? this.h : this.i;
            layoutParams = layoutParams2;
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ C1003a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65375e6259e5545465ad098f7071a7b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1003a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65375e6259e5545465ad098f7071a7b5");
        }
        ImageView imageView = new ImageView(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(this.f, 0, this.f, 0);
        imageView.setLayoutParams(layoutParams);
        return new C1003a(imageView);
    }

    public a(j jVar, c cVar) {
        int b;
        int b2;
        Object[] objArr = {jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f219ef586b4159097be6579236a1e6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f219ef586b4159097be6579236a1e6b4");
            return;
        }
        this.b = 0;
        this.c = cVar.e;
        this.d = cVar.c;
        this.e = cVar.d;
        this.f = cVar.h / 2 > 0 ? cVar.h / 2 : b(2);
        this.g = jVar;
        if (cVar.g <= 0) {
            b = b(6);
        } else {
            b = cVar.g;
        }
        this.h = b;
        if (cVar.f <= 0) {
            b2 = b(3);
        } else {
            b2 = cVar.f;
        }
        this.i = b2;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b4b77ad0b65b4b0257b757ccf1de75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b4b77ad0b65b4b0257b757ccf1de75");
            return;
        }
        this.b = i;
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        return this.c;
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fed4431ea636670ad0da085d80566d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fed4431ea636670ad0da085d80566d")).intValue() : (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.indicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1003a extends RecyclerView.s {
        public C1003a(View view) {
            super(view);
        }
    }
}
