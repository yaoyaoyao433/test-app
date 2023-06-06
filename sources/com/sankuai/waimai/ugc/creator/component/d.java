package com.sankuai.waimai.ugc.creator.component;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.widgets.SmoothScrollLinearLayoutManager;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends com.sankuai.waimai.ugc.creator.base.b {
    public static ChangeQuickRedirect a;
    public View.OnClickListener b;
    private RecyclerView c;
    private ImageView d;
    private b e;
    private final boolean f;
    private int g;
    private int h;

    public d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5c9384f3cf2a52bee09c0d2e0abc12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5c9384f3cf2a52bee09c0d2e0abc12");
        } else {
            this.f = z;
        }
    }

    public d(boolean z, int i, int i2) {
        this(false);
        Object[] objArr = {(byte) 0, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b6b706549d043185f7347c2a66eceb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b6b706549d043185f7347c2a66eceb");
            return;
        }
        this.g = i;
        this.h = i2;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b805c7c07f51d214d1bf296599469fd3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b805c7c07f51d214d1bf296599469fd3") : layoutInflater.inflate(R.layout.wm_ugc_media_selector_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ffb2d9f323d57f2408f88ca6322923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ffb2d9f323d57f2408f88ca6322923");
            return;
        }
        super.a(view);
        this.c = (RecyclerView) b(R.id.rv_media_selector_list);
        this.c.setClipToPadding(false);
        this.c.setLayoutManager(new SmoothScrollLinearLayoutManager(A(), 0, false));
        this.e = new b(this.g, this.h);
        this.c.setAdapter(this.e);
        this.d = (ImageView) b(R.id.iv_media_selector_add_btn);
        if (this.f) {
            this.d.setVisibility(0);
            this.d.setOnClickListener(this.b);
            if (this.h <= 0 || this.g <= 0) {
                return;
            }
            ah.b(this.d, this.g, this.h);
            return;
        }
        this.d.setVisibility(8);
    }

    public final void a(List<ImageData> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5136652856fb29fc653741c5c682462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5136652856fb29fc653741c5c682462");
            return;
        }
        b bVar = this.e;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1f9d0d05cb3964af1a3fc92b3de08429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1f9d0d05cb3964af1a3fc92b3de08429");
        } else {
            bVar.b.clear();
            if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
                bVar.b.addAll(list);
            }
            bVar.notifyDataSetChanged();
        }
        if (this.f) {
            if (list.size() >= this.o.j) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0698515e69e1e725ecca4c1c664f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0698515e69e1e725ecca4c1c664f00");
        } else if (i >= 0 && i < this.e.getItemCount()) {
            this.e.a(i);
            this.c.smoothScrollToPosition(i);
        } else {
            this.e.a();
        }
    }

    public final void a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a7b8ae3259d7705a96bb173f5b4ecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a7b8ae3259d7705a96bb173f5b4ecd");
            return;
        }
        int a2 = this.e.a(imageData);
        if (a2 >= 0) {
            this.e.a(a2);
            this.c.smoothScrollToPosition(a2);
            return;
        }
        this.e.a();
    }

    public final void a(com.sankuai.waimai.ugc.creator.ability.imgedit.ex.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fbcfb7fadf3158d5ecf71ac68cb1a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fbcfb7fadf3158d5ecf71ac68cb1a6");
        } else {
            this.e.c = dVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.a<a> {
        public static ChangeQuickRedirect a;
        final List<ImageData> b;
        com.sankuai.waimai.ugc.creator.ability.imgedit.ex.d c;
        private int d;
        private final int e;
        private final int f;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
            final a aVar2 = aVar;
            Object[] objArr = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea28a11c5f876badade18f85f0b8f12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea28a11c5f876badade18f85f0b8f12");
                return;
            }
            ImageData imageData = this.b.get(i);
            byte b = this.d == i ? (byte) 1 : (byte) 0;
            Object[] objArr2 = {imageData, Byte.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = a.b;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "21ac9ad573b8014e434d8b15ff960ca7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "21ac9ad573b8014e434d8b15ff960ca7");
            } else {
                if (!imageData.equals(aVar2.g)) {
                    aVar2.g = imageData;
                    if (!TextUtils.isEmpty(aVar2.g.i)) {
                        Picasso.g(aVar2.a()).d(aVar2.g.i).a(aVar2.c);
                    } else if (!TextUtils.isEmpty(aVar2.g.k)) {
                        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c.b = aVar2.a();
                        b.C0608b a2 = c.a(aVar2.e, aVar2.f);
                        a2.c = aVar2.g.k;
                        a2.a(aVar2.c);
                    }
                }
                aVar2.d.setVisibility(b != 0 ? 0 : 8);
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.component.d.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3252c0251d0218468b77f1772f13d539", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3252c0251d0218468b77f1772f13d539");
                    } else {
                        b.this.a(aVar2.getAdapterPosition());
                    }
                }
            };
            Object[] objArr3 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect3 = a.b;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "d0c175f0d3b7bb53327e2438ace2d48d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "d0c175f0d3b7bb53327e2438ace2d48d");
            } else {
                aVar2.itemView.setOnClickListener(onClickListener);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66ba621654c0913c16d6de1747d7b5f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66ba621654c0913c16d6de1747d7b5f") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_ugc_media_selector_list_item, viewGroup, false), this.e, this.f);
        }

        public b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f263023da7ab548c4db28311f48965", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f263023da7ab548c4db28311f48965");
                return;
            }
            this.b = new ArrayList();
            this.e = i;
            this.f = i2;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274a33dc47042eab51ab4cbbae57c600", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274a33dc47042eab51ab4cbbae57c600")).intValue() : this.b.size();
        }

        public final int a(ImageData imageData) {
            Object[] objArr = {imageData};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cba6e59d27e29572661e027af079b3d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cba6e59d27e29572661e027af079b3d")).intValue() : this.b.indexOf(imageData);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531ede44ed6cff319c8746fd6fa16f12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531ede44ed6cff319c8746fd6fa16f12");
                return;
            }
            int i = this.d;
            this.d = -1;
            notifyItemChanged(i);
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20878527e8dedff6ba0a3646435a7034", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20878527e8dedff6ba0a3646435a7034");
            } else if (this.d == i || i < 0 || i > this.b.size() - 1) {
            } else {
                int i2 = this.d;
                this.d = i;
                if (i2 >= 0) {
                    notifyItemChanged(i2);
                }
                notifyItemChanged(this.d);
                if (this.c != null) {
                    this.c.a(this.b.get(this.d), this.d);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends com.sankuai.waimai.ugc.creator.base.c {
        public static ChangeQuickRedirect b;
        final ImageView c;
        final View d;
        final int e;
        final int f;
        ImageData g;

        public a(View view, int i, int i2) {
            super(view);
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c37ca9ec0e3fe5b5b282baa34603d55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c37ca9ec0e3fe5b5b282baa34603d55");
                return;
            }
            this.c = (ImageView) a(R.id.iv_media_selector_item_thumbnail);
            this.d = a(R.id.v_media_selector_item_selected_mask_view);
            this.e = i <= 0 ? com.sankuai.waimai.foundation.utils.g.a(a(), 45.0f) : i;
            this.f = i2 <= 0 ? com.sankuai.waimai.foundation.utils.g.a(a(), 45.0f) : i2;
            if (this.f <= 0 || this.e <= 0) {
                return;
            }
            ah.b(view, this.e, this.f);
        }
    }
}
