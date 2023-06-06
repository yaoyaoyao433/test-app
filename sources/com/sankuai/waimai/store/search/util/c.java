package com.sankuai.waimai.store.search.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import com.sankuai.waimai.store.view.SCSingleLineFlowLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static int c = 1;
    public static int d = 2;
    protected Context b;
    private List<TextView> e;
    private List<ConstraintLayout> f;
    private int g;
    private boolean h;
    private com.sankuai.waimai.store.search.ui.result.dynamictag.d i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae6a17bca77dd169349cf4202d498ae3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae6a17bca77dd169349cf4202d498ae3");
            return;
        }
        this.g = 1;
        this.b = context;
    }

    public final void a(SCSingleLineFlowLayout sCSingleLineFlowLayout, RecommendSummary recommendSummary, int i) {
        final TextView remove;
        GradientDrawable gradientDrawable;
        int i2 = 2;
        Object[] objArr = {sCSingleLineFlowLayout, recommendSummary, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7be7c6cb287d44e1d51609d7e459e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7be7c6cb287d44e1d51609d7e459e17");
        } else if (sCSingleLineFlowLayout != null) {
            if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
                sCSingleLineFlowLayout.setVisibility(8);
                return;
            }
            if (this.e == null) {
                this.e = new ArrayList();
            }
            a(sCSingleLineFlowLayout);
            sCSingleLineFlowLayout.removeAllViews();
            sCSingleLineFlowLayout.setVisibility(0);
            for (RecommendSummary.RecommendTag recommendTag : recommendSummary.recommendTags) {
                if (recommendTag != null && !TextUtils.isEmpty(recommendTag.text) && recommendTag.location == i2) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3da0d114a6da809e220a6812fabd7a80", RobustBitConfig.DEFAULT_VALUE)) {
                        remove = (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3da0d114a6da809e220a6812fabd7a80");
                    } else if (com.sankuai.shangou.stone.util.a.b(this.e)) {
                        remove = new TextView(this.b);
                        remove.setMaxLines(1);
                        remove.setEllipsize(TextUtils.TruncateAt.END);
                        remove.setTextSize(0, this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_11));
                        remove.setTypeface(Typeface.defaultFromStyle(1));
                        remove.setIncludeFontPadding(false);
                        remove.setGravity(16);
                    } else {
                        remove = this.e.remove(this.e.size() - 1);
                    }
                    int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
                    remove.setText(recommendTag.text);
                    remove.setTextColor(com.sankuai.shangou.stone.util.d.a(recommendTag.textColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FF6F2A)));
                    if (i == c && recommendTag.tagType == 10) {
                        remove.setPadding(0, 0, dimensionPixelSize * 2, dimensionPixelSize);
                        remove.setTypeface(null);
                        remove.setBackground(null);
                    } else {
                        int i3 = dimensionPixelSize * 2;
                        remove.setPadding(i3, dimensionPixelSize, i3, dimensionPixelSize);
                        remove.setTypeface(Typeface.defaultFromStyle(1));
                        if (remove.getBackground() instanceof GradientDrawable) {
                            gradientDrawable = (GradientDrawable) remove.getBackground();
                        } else {
                            gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setCornerRadius(this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4));
                        }
                        gradientDrawable.setColor(com.sankuai.shangou.stone.util.d.a(recommendTag.backgroundColor, this.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFF2F0)));
                        remove.setBackground(gradientDrawable);
                    }
                    final int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                    final int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this.b;
                    a2.c = recommendTag.iconUrl;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.store.search.util.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr3 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0fbec439232693f6f55a5ffd3772b94", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0fbec439232693f6f55a5ffd3772b94");
                                return;
                            }
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(c.this.b.getResources(), bitmap);
                            bitmapDrawable.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
                            remove.setCompoundDrawables(bitmapDrawable, null, null, null);
                            remove.setCompoundDrawablePadding(dimensionPixelSize3);
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f90514ad0323242914f36e3f82c9b346", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f90514ad0323242914f36e3f82c9b346");
                            } else {
                                remove.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        }
                    });
                    sCSingleLineFlowLayout.addView(remove);
                    i2 = 2;
                }
            }
            if (sCSingleLineFlowLayout.getChildCount() == 0) {
                sCSingleLineFlowLayout.setVisibility(8);
            }
        }
    }

    public final void a(SCSingleLineFlowLayout sCSingleLineFlowLayout, RecommendSummary recommendSummary, int i, SearchShareData searchShareData) {
        GradientDrawable gradientDrawable;
        c cVar = this;
        boolean z = false;
        int i2 = 2;
        Object[] objArr = {sCSingleLineFlowLayout, recommendSummary, Integer.valueOf(i), searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0941e3742c5e4af92699707c3f50752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b0941e3742c5e4af92699707c3f50752");
        } else if (sCSingleLineFlowLayout != 0) {
            if (recommendSummary == null || com.sankuai.shangou.stone.util.a.b(recommendSummary.recommendTags)) {
                sCSingleLineFlowLayout.setVisibility(8);
                return;
            }
            if (cVar.f == null) {
                cVar.f = new ArrayList();
            }
            b(sCSingleLineFlowLayout);
            sCSingleLineFlowLayout.removeAllViews();
            sCSingleLineFlowLayout.setVisibility(0);
            String str = "";
            for (RecommendSummary.RecommendTag recommendTag : recommendSummary.recommendTags) {
                if (recommendTag == null || TextUtils.isEmpty(recommendTag.text) || recommendTag.location != i2) {
                    cVar = this;
                } else {
                    ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(cVar.b).inflate(R.layout.wm_sc_nox_search_recommend_exp_tag_layout, sCSingleLineFlowLayout, z);
                    final TextView textView = (TextView) constraintLayout.findViewById(R.id.recommend_exp_tag);
                    final ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.recommend_exp_icon_back);
                    final ImageView imageView2 = (ImageView) constraintLayout.findViewById(R.id.recommend_exp_icon);
                    final int dimensionPixelSize = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_1);
                    int dimensionPixelSize2 = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2_half);
                    final int dimensionPixelSize3 = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
                    int dimensionPixelSize4 = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half);
                    textView.setText(recommendTag.text);
                    textView.setTextColor(com.sankuai.shangou.stone.util.d.a(recommendTag.textColor, cVar.b.getResources().getColor(R.color.wm_sc_nox_search_color_FF6F2A)));
                    if (i == c && recommendTag.tagType == 10) {
                        textView.setPadding(z ? 1 : 0, z ? 1 : 0, dimensionPixelSize3 * 2, dimensionPixelSize3);
                        textView.setTypeface(null);
                        constraintLayout.setBackground(null);
                    } else {
                        int i3 = dimensionPixelSize3 * 2;
                        textView.setPadding(i3, dimensionPixelSize2, i3, dimensionPixelSize2);
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        if (constraintLayout.getBackground() instanceof GradientDrawable) {
                            gradientDrawable = (GradientDrawable) constraintLayout.getBackground();
                        } else {
                            gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(z ? 1 : 0);
                            gradientDrawable.setCornerRadius(cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4));
                            if (TextUtils.equals(ErrorCode.ERROR_TYPE_B, str)) {
                                gradientDrawable.setStroke(dimensionPixelSize4, com.sankuai.shangou.stone.util.d.a(com.sankuai.shangou.stone.util.d.a(recommendTag.textColor, cVar.b.getResources().getColor(R.color.white)), 0.1f));
                            }
                        }
                        gradientDrawable.setColor(com.sankuai.shangou.stone.util.d.a(recommendTag.backgroundColor, cVar.b.getResources().getColor(R.color.wm_sc_nox_search_color_FFF2F0)));
                        constraintLayout.setBackground(gradientDrawable);
                    }
                    final int dimensionPixelSize5 = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                    final int dimensionPixelSize6 = cVar.b.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_2);
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = cVar.b;
                    a2.c = recommendTag.iconUrl;
                    final String str2 = str;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.store.search.util.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr2 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6155d744b3ab7d26850037bafee11bb1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6155d744b3ab7d26850037bafee11bb1");
                                return;
                            }
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(c.this.b.getResources(), bitmap);
                            bitmapDrawable.setBounds(0, 0, dimensionPixelSize5, dimensionPixelSize5);
                            if (TextUtils.equals("A", str2)) {
                                imageView.setVisibility(0);
                                imageView2.setVisibility(0);
                                imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                imageView2.setImageDrawable(bitmapDrawable);
                                textView.setPadding(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize3 * 2, dimensionPixelSize3);
                                return;
                            }
                            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
                            textView.setCompoundDrawablePadding(dimensionPixelSize6);
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20ec7dcc085cf9f3a3f3c2e89645173c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20ec7dcc085cf9f3a3f3c2e89645173c");
                            } else if (TextUtils.equals("A", str2)) {
                                imageView.setVisibility(8);
                                imageView2.setVisibility(8);
                            } else {
                                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            }
                        }
                    });
                    sCSingleLineFlowLayout.addView(constraintLayout);
                    str = str;
                    cVar = this;
                    z = false;
                }
                i2 = 2;
            }
            if (sCSingleLineFlowLayout.getChildCount() == 0) {
                sCSingleLineFlowLayout.setVisibility(8);
            }
        }
    }

    private void a(SCSingleLineFlowLayout sCSingleLineFlowLayout) {
        Object[] objArr = {sCSingleLineFlowLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676d47cbcc603d91f6dabc892efcb0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676d47cbcc603d91f6dabc892efcb0fa");
            return;
        }
        int childCount = sCSingleLineFlowLayout.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            this.e.add((TextView) sCSingleLineFlowLayout.getChildAt(i));
        }
        sCSingleLineFlowLayout.removeAllViewsInLayout();
    }

    private void b(SCSingleLineFlowLayout sCSingleLineFlowLayout) {
        Object[] objArr = {sCSingleLineFlowLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0717e0fafebd41b84d2bbea82da883ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0717e0fafebd41b84d2bbea82da883ec");
            return;
        }
        int childCount = sCSingleLineFlowLayout.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            this.f.add((ConstraintLayout) sCSingleLineFlowLayout.getChildAt(i));
        }
        sCSingleLineFlowLayout.removeAllViewsInLayout();
    }

    public final boolean a(final ViewGroup viewGroup, final TagCanvasView tagCanvasView, final ImageView imageView, List<SGSearchTagInfo> list, boolean z, final a aVar, boolean z2) {
        Object[] objArr = {viewGroup, tagCanvasView, imageView, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c77e69acf7feb44a00b66f6b03c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c77e69acf7feb44a00b66f6b03c9b0")).booleanValue();
        }
        if (viewGroup == null || tagCanvasView == null) {
            return false;
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            viewGroup.setVisibility(8);
            return false;
        }
        this.h = z;
        viewGroup.setVisibility(0);
        if (this.i == null) {
            this.i = new com.sankuai.waimai.store.search.ui.result.dynamictag.d(this.b, null);
            tagCanvasView.setAdapter(this.i);
        }
        this.i.e = z2;
        if (this.h) {
            tagCanvasView.setMaxLines(Integer.MAX_VALUE);
        } else {
            tagCanvasView.setMaxLines(this.g);
        }
        this.i.b(com.sankuai.waimai.store.search.ui.result.dynamictag.b.a(this.b, list));
        this.i.notifyChanged();
        tagCanvasView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.store.search.util.c.3
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "241c6dc0568ecea0dfa931f6d24ab4a9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "241c6dc0568ecea0dfa931f6d24ab4a9")).booleanValue();
                }
                tagCanvasView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (c.this.i.b().size() > c.this.g || c.this.i.d) {
                    u.a(imageView);
                    if (c.this.h) {
                        u.a(imageView, (int) R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_up_search);
                    } else {
                        u.a(imageView, (int) R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_down_search);
                    }
                    viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.util.c.3.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "16f0823fa618159e2a1d503e72304e46", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "16f0823fa618159e2a1d503e72304e46");
                                return;
                            }
                            if (c.this.h) {
                                c.this.h = false;
                                u.a(imageView, (int) R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_down_search);
                                tagCanvasView.setMaxLines(c.this.g);
                            } else {
                                c.this.h = true;
                                u.a(imageView, (int) R.drawable.wm_sc_widget_filter_bar_tab_icon_sort_drop_up_search);
                                tagCanvasView.setMaxLines(Integer.MAX_VALUE);
                            }
                            if (aVar != null) {
                                aVar.a(c.this.h);
                            }
                        }
                    });
                } else {
                    u.c(imageView);
                    viewGroup.setOnClickListener(null);
                }
                return true;
            }
        });
        return true;
    }
}
