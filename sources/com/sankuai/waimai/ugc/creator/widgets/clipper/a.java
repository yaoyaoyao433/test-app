package com.sankuai.waimai.ugc.creator.widgets.clipper;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends RecyclerView.a<C1367a> {
    public static ChangeQuickRedirect a;
    public final List<Bitmap> b;
    public int c;
    private int d;
    private int e;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1367a c1367a, int i) {
        C1367a c1367a2 = c1367a;
        Object[] objArr = {c1367a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ef4eb98259a1b3562ead49d4f4ea73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ef4eb98259a1b3562ead49d4f4ea73");
            return;
        }
        Bitmap bitmap = this.b.get(i);
        Object[] objArr2 = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = C1367a.a;
        if (PatchProxy.isSupport(objArr2, c1367a2, changeQuickRedirect2, false, "1ef631fc561193c5268cefe0fb7507df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1367a2, changeQuickRedirect2, false, "1ef631fc561193c5268cefe0fb7507df");
        } else {
            c1367a2.b.setImageBitmap(bitmap);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ C1367a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837e0d60f7eef18ec714ebc205eeb0ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1367a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837e0d60f7eef18ec714ebc205eeb0ac");
        }
        Context context = viewGroup.getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f951820d31fe47fc70f9b84ed466d62", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1367a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f951820d31fe47fc70f9b84ed466d62");
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(this.d, this.e));
        return new C1367a(imageView);
    }

    public a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a147ee9e9ba9de337d2641362fd4f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a147ee9e9ba9de337d2641362fd4f6");
            return;
        }
        this.c = -1;
        this.d = i;
        this.e = i2;
        this.b = new ArrayList();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fb174ee96965b0acd90fff07e5d2a5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fb174ee96965b0acd90fff07e5d2a5")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ugc.creator.widgets.clipper.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1367a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        final ImageView b;

        public C1367a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9424fb071417df979968bc74c574c1ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9424fb071417df979968bc74c574c1ab");
            } else {
                this.b = (ImageView) view;
            }
        }
    }
}
