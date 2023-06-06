package com.sankuai.waimai.ugc.creator.ability.album;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.utils.m;
import com.sankuai.waimai.ugc.creator.utils.o;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.ugc.creator.ability.album.event.a b;
    final List<com.sankuai.waimai.ugc.creator.entity.inner.a> c;
    final ArrayList<ImageData> d;
    final ArrayList<ImageData> e;
    final ArrayList<ImageData> f;
    final List<ImageData> g;
    List<ImageData> h;
    SparseIntArray i;
    private final Context j;
    private final LayoutInflater k;
    private final Picasso l;
    private final com.sankuai.waimai.ugc.creator.ability.album.utils.b m;
    private int n;
    private final int o;
    private final long p;
    private final long q;
    private final int r;
    private List<MediaData> s;
    private int t;

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        return 101;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, int i) {
        String str;
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e2b7ef9cebe4387c211ebc9d5a3306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e2b7ef9cebe4387c211ebc9d5a3306");
            return;
        }
        MediaData mediaData = this.s.get(i);
        final int adapterPosition = aVar2.getAdapterPosition();
        RequestCreator d = this.l.d(mediaData.i);
        d.n = this.l;
        RequestCreator a2 = d.e().a(this.n, this.n);
        a2.i = this.m.a(this.j, "ugccreator_ugc_icon_mediapicker_image_default");
        a2.j = this.m.a(this.j, "ugccreator_ugc_icon_mediapicker_image_error");
        a2.a(aVar2.b);
        if (mediaData instanceof VideoData) {
            final VideoData videoData = (VideoData) mediaData;
            aVar2.e.setVisibility(8);
            aVar2.f.setVisibility(8);
            TextView textView = aVar2.h;
            long j = videoData.b;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = m.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "861c99bde58cdbe020a2c16599eda0de", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "861c99bde58cdbe020a2c16599eda0de");
            } else if (j <= 0 || j >= 86400000) {
                str = "00:00";
            } else {
                long j2 = j / 1000;
                long j3 = j2 % 60;
                long j4 = (j2 / 60) % 60;
                long j5 = j2 / 3600;
                Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
                str = j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
            }
            textView.setText(str);
            aVar2.g.setVisibility(0);
            aVar2.c.setVisibility(8);
            if (this.o != 1 && !m.a(videoData.b, this.p) && !m.b(videoData.b, this.q) && this.d.size() <= 0 && !o.c(videoData.c)) {
                r12 = false;
            }
            aVar2.d.setVisibility(r12 ? 0 : 8);
            aVar2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2d16d51a7e4888cafe98943a071dee2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2d16d51a7e4888cafe98943a071dee2");
                    } else if (b.this.b != null) {
                        b.this.b.a(adapterPosition, videoData);
                    }
                }
            });
            aVar2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b4d5d8d48f2bf88b96774e7cab4cd3d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b4d5d8d48f2bf88b96774e7cab4cd3d");
                    } else if (b.this.b != null) {
                        b.this.b.b(adapterPosition, videoData);
                    }
                }
            });
        } else if (mediaData instanceof ImageData) {
            final ImageData imageData = (ImageData) mediaData;
            int b = b(imageData) + 1;
            r12 = b > 0;
            aVar2.e.setVisibility(0);
            aVar2.e.setSelected(r12);
            aVar2.f.setVisibility(r12 ? 0 : 4);
            aVar2.f.setText(String.valueOf(b));
            aVar2.g.setVisibility(8);
            aVar2.c.setVisibility(r12 ? 0 : 4);
            aVar2.d.setVisibility(this.o == 2 ? 0 : 8);
            aVar2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.b.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "793b832da670366f8787131b07a37c06", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "793b832da670366f8787131b07a37c06");
                    } else if (b.this.b != null) {
                        b.this.b.a(adapterPosition);
                    }
                }
            });
            aVar2.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.b.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d4090bddf035d2f3a16fbb1b0f628fb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d4090bddf035d2f3a16fbb1b0f628fb");
                    } else if (b.this.b != null) {
                        b.this.b.b(adapterPosition);
                    }
                }
            });
            aVar2.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.ability.album.b.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c5460201f41fc667b05e448e3682756", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c5460201f41fc667b05e448e3682756");
                    } else {
                        b.this.a(imageData);
                    }
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff00d5baa87075c9c9dbf88da089f4c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff00d5baa87075c9c9dbf88da089f4c") : new a(this.k.inflate(R.layout.wm_ugc_media_picker_item_grid, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34d47d690ec8a994fc9d48cd795e6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34d47d690ec8a994fc9d48cd795e6e6");
            return;
        }
        i.a(aVar2.b);
        super.onViewRecycled(aVar2);
    }

    public b(Context context, Picasso picasso) {
        Object[] objArr = {context, picasso};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344698f59cdfe4d395a9ce38520ad9fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344698f59cdfe4d395a9ce38520ad9fd");
            return;
        }
        this.b = null;
        this.t = 0;
        this.j = context;
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.c = new ArrayList();
        this.g = new ArrayList();
        this.l = picasso;
        this.k = LayoutInflater.from(context);
        this.m = new com.sankuai.waimai.ugc.creator.ability.album.utils.b(context, "ugccreator_ugc_icon_mediapicker_image_default", "ugccreator_ugc_icon_mediapicker_image_error");
        com.sankuai.waimai.ugc.creator.config.a c = com.sankuai.waimai.ugc.creator.manager.i.a().c();
        this.o = c.b;
        this.p = c.k;
        this.q = c.l;
        this.r = c.j;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebcfd5082e4fcf53b84a19b4d3beea77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebcfd5082e4fcf53b84a19b4d3beea77");
        } else {
            this.n = g.a(context) / 3;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9474905d113767cb7d095bff06e3cb40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9474905d113767cb7d095bff06e3cb40")).intValue();
        }
        if (this.s == null) {
            return 0;
        }
        return this.s.size();
    }

    public final void a(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29fd2e05cb1370714e6581edb18a3e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29fd2e05cb1370714e6581edb18a3e1f");
            return;
        }
        boolean contains = this.f.contains(imageData);
        if (this.f.size() + (contains ? -1 : 1) > this.r) {
            ae.a((Activity) this.j, this.j.getString(R.string.wm_ugc_media_picker_over_max_count_tips, Integer.valueOf(this.r)));
            return;
        }
        if (contains) {
            this.f.remove(imageData);
            this.d.remove(imageData);
        } else {
            this.f.add(imageData);
            this.d.add(imageData);
        }
        notifyDataSetChanged();
        if (this.b != null) {
            this.b.a(this.f);
        }
    }

    public final void a(List<com.sankuai.waimai.ugc.creator.entity.inner.a> list, List<ImageData> list2) {
        List<ImageData> list3;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b8e4606d19054a38d3fd0484c2d756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b8e4606d19054a38d3fd0484c2d756");
            return;
        }
        this.c.clear();
        this.d.clear();
        this.f.clear();
        this.e.clear();
        this.g.clear();
        if (list != null) {
            this.c.addAll(list);
        }
        if (list2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48f77d7bc4d37f69fcfa44807f2c56c4", RobustBitConfig.DEFAULT_VALUE)) {
                list3 = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48f77d7bc4d37f69fcfa44807f2c56c4");
            } else {
                com.sankuai.waimai.ugc.creator.entity.inner.a aVar = this.c.get(0);
                list3 = aVar != null ? aVar.e : null;
            }
            for (ImageData imageData : list2) {
                if (!TextUtils.isEmpty(imageData.i)) {
                    Iterator<ImageData> it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ImageData next = it.next();
                            if (imageData.i.equals(next.i)) {
                                next.k = imageData.k;
                                next.h = imageData.h;
                                next.b = imageData.b;
                                next.c = imageData.c;
                                this.d.add(next);
                                this.f.add(next);
                                this.g.add(next);
                                break;
                            }
                        }
                    }
                } else if (!TextUtils.isEmpty(imageData.k)) {
                    this.d.add(imageData);
                    this.e.add(imageData);
                    this.g.add(imageData);
                }
            }
        }
        a(0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba5ffb60e44a405fe27a875103b1406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba5ffb60e44a405fe27a875103b1406");
            return;
        }
        this.t = i;
        com.sankuai.waimai.ugc.creator.entity.inner.a aVar = this.c.get(this.t);
        this.s = aVar.d;
        this.h = aVar.e;
        this.i = aVar.f;
        notifyDataSetChanged();
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf2339c8c60032e4eb96fd0180918cf2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf2339c8c60032e4eb96fd0180918cf2")).intValue() : this.d.size();
    }

    public final int b(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac91cb007121dc4692f7ba690f001387", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac91cb007121dc4692f7ba690f001387")).intValue() : this.f.indexOf(imageData);
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3453654f206a0732b77eedfae8d80d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3453654f206a0732b77eedfae8d80d0f")).intValue();
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!this.g.contains(this.d.get(i))) {
                return i;
            }
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        final ImageView b;
        final View c;
        final View d;
        final View e;
        final TextView f;
        final ViewGroup g;
        final TextView h;

        public a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9ac0d9f287382fbf07b6973bf2a3ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9ac0d9f287382fbf07b6973bf2a3ff");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.iv_media);
            this.c = view.findViewById(R.id.selected_mask_view);
            this.d = view.findViewById(R.id.block_mask_view);
            this.e = view.findViewById(R.id.iv_checkbox);
            this.f = (TextView) view.findViewById(R.id.tv_selected_index);
            this.g = (ViewGroup) view.findViewById(R.id.fl_video_duration_container);
            this.h = (TextView) view.findViewById(R.id.duration);
        }
    }
}
