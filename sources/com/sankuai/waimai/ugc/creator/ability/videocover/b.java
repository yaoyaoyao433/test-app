package com.sankuai.waimai.ugc.creator.ability.videocover;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private List<Bitmap> b;
    private LayoutInflater c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119312b5f5287d0b6e7172fa116f1a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119312b5f5287d0b6e7172fa116f1a31");
            return;
        }
        Bitmap bitmap = this.b.get(i);
        int a2 = g.a(this.c.getContext(), 50.0f);
        if (bitmap == null) {
            aVar2.itemView.setLayoutParams(new FrameLayout.LayoutParams(g.a(this.c.getContext()) >> 1, a2));
            aVar2.a.setImageAlpha(0);
            return;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), false);
        aVar2.a.setImageAlpha(255);
        aVar2.itemView.setLayoutParams(new FrameLayout.LayoutParams(a2, g.a(this.c.getContext(), 50.0f)));
        aVar2.a.setImageBitmap(copy);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbba32d0f3a6317d6e0f3e31e4b43e6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbba32d0f3a6317d6e0f3e31e4b43e6") : new a(this.c.inflate(R.layout.wm_ugc_video_cover_frame_image_layout, viewGroup, false));
    }

    public b(Context context, List<Bitmap> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb7f9e82f81a95814fd430d259b62b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb7f9e82f81a95814fd430d259b62b9");
            return;
        }
        this.c = LayoutInflater.from(context);
        this.b = list;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9fccbc12cef505d2e02c96bd7fc440", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9fccbc12cef505d2e02c96bd7fc440")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s {
        public ImageView a;

        public a(View view) {
            super(view);
            this.a = (ImageView) view.findViewById(R.id.ugc_video_cover_frame_image_view);
        }
    }
}
