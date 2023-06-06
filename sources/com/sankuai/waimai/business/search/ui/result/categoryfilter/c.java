package com.sankuai.waimai.business.search.ui.result.categoryfilter;

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
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends RecyclerView.a<C0865c> {
    public static ChangeQuickRedirect a;
    final b b;
    final List<CategoryFilterData.a> c;
    final com.sankuai.waimai.business.search.ui.result.categoryfilter.b d;
    final SearchShareData e;
    a f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(CategoryFilterData.a aVar, int i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C0865c c0865c, final int i) {
        final C0865c c0865c2 = c0865c;
        Object[] objArr = {c0865c2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6f22342db5878fed5c775b6dc7a6b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6f22342db5878fed5c775b6dc7a6b0");
            return;
        }
        final CategoryFilterData.a aVar = this.c.get(i);
        Object[] objArr2 = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = C0865c.a;
        if (PatchProxy.isSupport(objArr2, c0865c2, changeQuickRedirect2, false, "c423452ce621c084b4ce01749c3156f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0865c2, changeQuickRedirect2, false, "c423452ce621c084b4ce01749c3156f8");
            return;
        }
        c0865c2.a(aVar, i);
        c0865c2.itemView.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.categoryfilter.c.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f929f5901b5ff020ed9dcbdaeb57e5c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f929f5901b5ff020ed9dcbdaeb57e5c2");
                } else if (aVar.e) {
                } else {
                    h.a(C0865c.this.itemView.getContext(), 2, "c_nfqbfvw", "b_waimai_9c7nz6ve_mv", AppUtil.generatePageInfoKey(C0865c.this.itemView.getContext()), k.a(aVar, c.this.e, i));
                    aVar.e = true;
                }
            }
        });
        c0865c2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.categoryfilter.c.c.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af13803a70eda37012de93569a541088", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af13803a70eda37012de93569a541088");
                    return;
                }
                C0865c.this.a(aVar, i);
                if (c.this.f != null) {
                    h.a(C0865c.this.itemView.getContext(), 1, "c_nfqbfvw", "b_waimai_9c7nz6ve_mc", AppUtil.generatePageInfoKey(C0865c.this.itemView.getContext()), k.a(aVar, c.this.e, i));
                    if (i != c.this.d.f) {
                        c.this.f.a(aVar, i);
                    }
                }
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C0865c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab386f77c4dfcfc5f71f28bf56d581fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0865c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab386f77c4dfcfc5f71f28bf56d581fd");
        }
        int[] iArr = AnonymousClass1.a;
        this.b.ordinal();
        return new C0865c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_nox_search_category2_filter_item, viewGroup, false));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        VERSION_0,
        VERSION_1;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61a93ebbe7cb19fa8d0817a8d920733", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61a93ebbe7cb19fa8d0817a8d920733");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "155b878c79e7e897dd7377be05746ab7", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "155b878c79e7e897dd7377be05746ab7") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eac9dda0d034e5735dae65667c6c144a", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eac9dda0d034e5735dae65667c6c144a") : (b[]) values().clone();
        }
    }

    public c(com.sankuai.waimai.business.search.ui.result.categoryfilter.b bVar, SearchShareData searchShareData, b bVar2) {
        Object[] objArr = {bVar, searchShareData, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0816b809c146a6dd44caf194e12e6088", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0816b809c146a6dd44caf194e12e6088");
            return;
        }
        this.c = new ArrayList();
        this.d = bVar;
        this.e = searchShareData;
        this.b = bVar2;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b24dd66c0089eae7ba1e01e9cbecba3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b24dd66c0089eae7ba1e01e9cbecba3")).intValue() : this.c.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.categoryfilter.c$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[b.valuesCustom().length];

        static {
            try {
                a[b.VERSION_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.VERSION_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.categoryfilter.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0865c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        private final ImageView c;
        private final TextView d;

        public C0865c(View view) {
            super(view);
            Object[] objArr = {c.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f967ba1ea58454fdbdbce8b3392ff71", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f967ba1ea58454fdbdbce8b3392ff71");
                return;
            }
            this.c = (ImageView) view.findViewById(R.id.image_view);
            this.d = (TextView) view.findViewById(R.id.text_view);
        }

        void a(CategoryFilterData.a aVar, int i) {
            Object[] objArr = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9b14dba5db55d2ac7eba2b72fb61ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9b14dba5db55d2ac7eba2b72fb61ea");
                return;
            }
            boolean z = i == c.this.d.f;
            if (TextUtils.isEmpty(aVar.c)) {
                this.c.setImageResource(R.drawable.wm_nox_search_category_filter_default_icon);
            } else {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.itemView.getContext();
                a2.c = aVar.c;
                a2.f = ImageQualityUtil.a();
                a2.j = R.drawable.wm_nox_search_category_filter_default_icon;
                a2.a(this.c);
            }
            this.d.setText(aVar.b);
            if (z) {
                this.d.setTypeface(Typeface.defaultFromStyle(1));
                this.d.setTextColor(Color.parseColor("#FF8000"));
            } else {
                this.d.setTypeface(Typeface.defaultFromStyle(0));
                this.d.setTextColor(Color.parseColor("#575859"));
            }
            if (AnonymousClass1.a[c.this.b.ordinal()] != 2) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(g.a(this.itemView.getContext(), 6.0f));
                gradientDrawable.setColor(-1);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
                marginLayoutParams.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 12.0f : 5.0f);
                marginLayoutParams.rightMargin = g.a(this.itemView.getContext(), i == c.this.c.size() - 1 ? 12.0f : 5.0f);
                this.itemView.setLayoutParams(marginLayoutParams);
                this.itemView.setBackground(gradientDrawable);
                return;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(g.a(this.itemView.getContext(), 6.0f));
            if (z) {
                this.c.animate().scaleX(1.11f).scaleY(1.11f).setDuration(200L).start();
                gradientDrawable2.setColor(Color.parseColor("#FFF1DC"));
            } else {
                gradientDrawable2.setColor(-1);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams();
            marginLayoutParams2.leftMargin = g.a(this.itemView.getContext(), i == 0 ? 12.0f : 5.0f);
            marginLayoutParams2.rightMargin = g.a(this.itemView.getContext(), i == c.this.c.size() - 1 ? 12.0f : 5.0f);
            this.itemView.setLayoutParams(marginLayoutParams2);
            this.itemView.setBackground(gradientDrawable2);
        }
    }
}
