package com.sankuai.waimai.business.search.ui.result.guideQuery;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.datatype.GuideQueryCard;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends RecyclerView.a<b> {
    public static ChangeQuickRedirect a;
    final List<GuideQueryCard.GuideQuery> b;
    final SearchShareData c;
    final RecyclerView d;
    public a e;
    public boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(GuideQueryCard.GuideQuery guideQuery, int i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull b bVar, final int i) {
        final b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3b8f85c31fbbf4f1772ec6b07042ba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3b8f85c31fbbf4f1772ec6b07042ba1");
            return;
        }
        final GuideQueryCard.GuideQuery guideQuery = this.b.get(i);
        Object[] objArr2 = {guideQuery, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "772090533716045e528c80739e429282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "772090533716045e528c80739e429282");
            return;
        }
        bVar2.a(guideQuery, i);
        bVar2.itemView.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.d.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ffeafea92d872edf1e7d434e070d531", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ffeafea92d872edf1e7d434e070d531");
                } else if (guideQuery.isExposed) {
                } else {
                    h.a(b.this.itemView.getContext(), 2, "c_nfqbfvw", "b_waimai_hzf52469_mv", k.a(b.this.itemView.getContext()), k.a(guideQuery, d.this.d.computeHorizontalScrollOffset() > 0 ? 1 : 0, d.this.f, d.this.c, i));
                    guideQuery.isExposed = true;
                }
            }
        });
        bVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.guideQuery.d.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ee45bc8cde331942d402a5ecf7b3db8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ee45bc8cde331942d402a5ecf7b3db8");
                    return;
                }
                b.this.a(guideQuery, i);
                if (d.this.e != null) {
                    h.a(b.this.itemView.getContext(), 1, "c_nfqbfvw", "b_waimai_4pzicjty_mc", k.a(b.this.itemView.getContext()), k.a(guideQuery, d.this.d.computeHorizontalScrollOffset() <= 0 ? 0 : 1, d.this.f, d.this.c, i));
                    d.this.e.a(guideQuery, i);
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d0ebb75300cdae16d41d34220aab08", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d0ebb75300cdae16d41d34220aab08") : new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_nox_search_guide_query_item, viewGroup, false));
    }

    public d(RecyclerView recyclerView, SearchShareData searchShareData) {
        Object[] objArr = {recyclerView, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5b2b5a6a739cf33c0503fccbf0abac7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5b2b5a6a739cf33c0503fccbf0abac7");
            return;
        }
        this.f = false;
        this.b = new ArrayList();
        this.d = recyclerView;
        this.c = searchShareData;
    }

    public final void a(List<GuideQueryCard.GuideQuery> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2006313bbd092cc10558f28d5ca2db5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2006313bbd092cc10558f28d5ca2db5b");
            return;
        }
        this.b.clear();
        this.b.addAll(list);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77dca94ca5b8956a5cd4d4ba9cb974fa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77dca94ca5b8956a5cd4d4ba9cb974fa")).intValue() : this.b.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        private final ImageView c;
        private final TextView d;
        private final TextView e;

        public b(View view) {
            super(view);
            Object[] objArr = {d.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f71bd20af5097f6e6d87692a82ad01", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f71bd20af5097f6e6d87692a82ad01");
                return;
            }
            this.c = (ImageView) view.findViewById(R.id.image_view);
            this.d = (TextView) view.findViewById(R.id.text_view);
            this.e = (TextView) view.findViewById(R.id.tv_label);
        }

        void a(GuideQueryCard.GuideQuery guideQuery, int i) {
            Object[] objArr = {guideQuery, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e641ab9be28aa45af3ab27c5924572fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e641ab9be28aa45af3ab27c5924572fe");
                return;
            }
            this.c.setVisibility(d.this.f ? 0 : 8);
            if (d.this.f) {
                a(guideQuery.showQuery);
            }
            if (!TextUtils.isEmpty(guideQuery.queryPic)) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.itemView.getContext();
                a2.c = guideQuery.queryPic;
                a2.f = ImageQualityUtil.a();
                a2.j = R.drawable.wm_nox_search_category_filter_default_icon;
                a2.a(this.c);
            } else if (d.this.f) {
                this.c.setImageResource(R.drawable.wm_nox_search_category_filter_default_icon);
            }
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (d.this.f) {
                this.d.setMaxWidth(g.a(com.meituan.android.singleton.b.a, 60.0f));
            } else {
                layoutParams.width = -2;
                this.d.setMaxWidth(Integer.MAX_VALUE);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                marginLayoutParams.topMargin = g.a(this.d.getContext(), 7.0f);
                marginLayoutParams.bottomMargin = g.a(this.d.getContext(), 7.0f);
                marginLayoutParams.leftMargin = g.a(this.d.getContext(), 7.0f);
                marginLayoutParams.rightMargin = g.a(this.d.getContext(), 7.0f);
                this.d.setLayoutParams(marginLayoutParams);
            }
            this.itemView.setLayoutParams(layoutParams);
            this.d.setText(guideQuery.showQuery);
            this.d.setTypeface(Typeface.defaultFromStyle(0));
            this.d.setTextColor(Color.parseColor("#575859"));
            if (TextUtils.isEmpty(guideQuery.label)) {
                this.e.setVisibility(8);
            } else {
                this.e.setText(guideQuery.label);
                this.e.setVisibility(0);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(g.a(this.itemView.getContext(), 7.0f));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
            if (d.this.c.ar) {
                gradientDrawable.setColor(-1);
                marginLayoutParams2.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 0.0f : 4.0f);
                marginLayoutParams2.rightMargin = g.a(this.itemView.getContext(), i != d.this.b.size() - 1 ? 4.0f : 0.0f);
            } else if (d.this.c.as) {
                gradientDrawable.setColor(this.itemView.getResources().getColor(R.color.wm_nox_search_FFF5F5F5));
                marginLayoutParams2.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 10.0f : 4.0f);
                marginLayoutParams2.rightMargin = g.a(this.itemView.getContext(), i != d.this.b.size() - 1 ? 4.0f : 10.0f);
            } else {
                gradientDrawable.setColor(-1);
                marginLayoutParams2.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 0.0f : 4.0f);
                marginLayoutParams2.rightMargin = g.a(this.itemView.getContext(), i != d.this.b.size() - 1 ? 4.0f : 0.0f);
            }
            this.itemView.setBackground(gradientDrawable);
            this.itemView.setLayoutParams(marginLayoutParams2);
        }

        private void a(String str) {
            int a2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1e2c8581186881566d30f3c401af21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1e2c8581186881566d30f3c401af21");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                if (str.length() >= 5) {
                    layoutParams.width = g.a(com.meituan.android.singleton.b.a, 68.0f);
                    a2 = g.a(com.meituan.android.singleton.b.a, 8.0f);
                } else {
                    layoutParams.width = g.a(com.meituan.android.singleton.b.a, 60.0f);
                    a2 = g.a(com.meituan.android.singleton.b.a, 4.0f);
                }
                this.itemView.setLayoutParams(layoutParams);
                marginLayoutParams.setMargins(a2, 0, a2, 0);
                this.c.setLayoutParams(marginLayoutParams);
                marginLayoutParams2.setMargins(g.a(com.meituan.android.singleton.b.a, 4.0f), g.a(com.meituan.android.singleton.b.a, 0.0f), g.a(com.meituan.android.singleton.b.a, 4.0f), g.a(com.meituan.android.singleton.b.a, 6.0f));
                this.d.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
