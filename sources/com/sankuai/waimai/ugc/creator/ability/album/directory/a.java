package com.sankuai.waimai.ugc.creator.ability.album.directory;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.ugc.creator.ability.album.directory.AlbumDirectoryListPopup;
import com.squareup.picasso.Picasso;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1359a> {
    public static ChangeQuickRedirect a;
    private final List<com.sankuai.waimai.ugc.creator.entity.inner.a> b;
    private final AlbumDirectoryListPopup.a c;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1359a c1359a, final int i) {
        final C1359a c1359a2 = c1359a;
        Object[] objArr = {c1359a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c22d35cbc8b76ac4f6b97cb721817e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c22d35cbc8b76ac4f6b97cb721817e4");
            return;
        }
        com.sankuai.waimai.ugc.creator.entity.inner.a aVar = this.b.get(i);
        if (aVar != null) {
            final AlbumDirectoryListPopup.a aVar2 = this.c;
            Object[] objArr2 = {aVar, aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = C1359a.a;
            if (PatchProxy.isSupport(objArr2, c1359a2, changeQuickRedirect2, false, "555a39d7dc9dc1686e6702e23bab386c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1359a2, changeQuickRedirect2, false, "555a39d7dc9dc1686e6702e23bab386c");
                return;
            }
            if (b.a(aVar.d)) {
                Picasso.g(c1359a2.itemView.getContext()).d(aVar.d.get(0).h).a(c1359a2.b);
            }
            c1359a2.c.setText(aVar.c);
            c1359a2.d.setText(String.valueOf(aVar.d.size()));
            c1359a2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.directory.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce8f85ef78fd66f04b54c364adeafe7c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce8f85ef78fd66f04b54c364adeafe7c");
                    } else if (aVar2 != null) {
                        aVar2.a(i);
                    }
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ C1359a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee33a18304dd662175dda3adab661213", RobustBitConfig.DEFAULT_VALUE) ? (C1359a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee33a18304dd662175dda3adab661213") : new C1359a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_ugc_media_picker_item_directory, viewGroup, false));
    }

    public a(List<com.sankuai.waimai.ugc.creator.entity.inner.a> list, AlbumDirectoryListPopup.a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fbfc4a1d7087732b6909aae22cbc2c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fbfc4a1d7087732b6909aae22cbc2c8");
            return;
        }
        this.b = list;
        this.c = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc529dcd1ecffe64b961cfc3678257ee", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc529dcd1ecffe64b961cfc3678257ee")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ugc.creator.ability.album.directory.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1359a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public TextView c;
        public TextView d;

        public C1359a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01b35e56a03185b904b6c6d0233b1eed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01b35e56a03185b904b6c6d0233b1eed");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.iv_dir_cover);
            this.c = (TextView) view.findViewById(R.id.tv_dir_name);
            this.d = (TextView) view.findViewById(R.id.tv_dir_count);
        }
    }
}
