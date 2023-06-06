package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FilterBarView extends LinearLayout {
    public static ChangeQuickRedirect a;
    Context b;
    ViewGroup c;
    View d;
    boolean e;
    boolean f;
    private LayoutInflater g;
    private LinearLayout h;
    private b.g i;
    private b.f j;
    private b.h k;
    private boolean l;
    private TextView m;
    private RooIconFont n;
    private View o;

    public FilterBarView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae408b5a09c364b11a0b26e8d12bfd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae408b5a09c364b11a0b26e8d12bfd9");
            return;
        }
        this.l = true;
        a(context);
    }

    public FilterBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a632f2044f9599db88a9ec399812362", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a632f2044f9599db88a9ec399812362");
            return;
        }
        this.l = true;
        a(context);
    }

    public FilterBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362f346d2e35a9374329f2c9cc4f8db0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362f346d2e35a9374329f2c9cc4f8db0");
            return;
        }
        this.l = true;
        a(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c29982eac8c7c27ce63b95a93672031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c29982eac8c7c27ce63b95a93672031");
        } else {
            super.onFinishInflate();
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e57b3a3eb4a0070afb95a6aa09b6f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e57b3a3eb4a0070afb95a6aa09b6f22");
            return;
        }
        this.b = context;
        if (this.b instanceof GlobalSearchActivity) {
            this.f = ((GlobalSearchActivity) this.b).b();
        }
        this.g = LayoutInflater.from(this.b);
        inflate(this.b, R.layout.wm_nox_search_filter_bar_view, this);
        this.c = (ViewGroup) findViewById(R.id.filter_bar_root);
        this.h = (LinearLayout) findViewById(R.id.filter_bar);
        if (this.f) {
            setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.h hVar, Long l, int i, boolean z, boolean z2, boolean z3, int i2) {
        boolean z4;
        Object[] objArr = {hVar, l, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576bdcd25fc016024bcdd94544293ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576bdcd25fc016024bcdd94544293ff7");
            return;
        }
        this.h.removeAllViews();
        ArrayList<h.a> arrayList = hVar.a;
        if (com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
            return;
        }
        Long l2 = l == null ? 0L : l;
        for (h.a aVar : arrayList) {
            if (l2.longValue() == aVar.a || (aVar.i != 0 && aVar.i == l2.longValue())) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        if (!z4) {
            l2 = 0L;
        }
        int i3 = 0;
        for (final h.a aVar2 : arrayList) {
            if (aVar2 != null) {
                Object[] objArr2 = {aVar2, Integer.valueOf(i3), l2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9a11a9aedce47e0126659b803ce58c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9a11a9aedce47e0126659b803ce58c3");
                } else if (aVar2 != null) {
                    aVar2.j = aVar2.i != 0 && aVar2.i == l2.longValue();
                    boolean z5 = l2 != null && (aVar2.a == l2.longValue() || aVar2.j);
                    View inflate = this.g.inflate(R.layout.wm_nox_search_widget_filter_bar_tab_item, (ViewGroup) this.h, false);
                    ((TextView) inflate.findViewById(R.id.filter_count)).setVisibility(8);
                    inflate.findViewById(R.id.filter_bubble).setVisibility(8);
                    ((RooIconFont) inflate.findViewById(R.id.filter_right_arrow)).setVisibility(8);
                    View findViewById = inflate.findViewById(R.id.filter_divider);
                    if (i3 == 0) {
                        findViewById.setVisibility(8);
                    } else {
                        findViewById.setVisibility(0);
                    }
                    TextView textView = (TextView) inflate.findViewById(R.id.filter_text);
                    textView.setTextSize(1, 18.0f);
                    textView.setText(aVar2.b);
                    textView.setGravity(17);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                    layoutParams.height = -1;
                    if (i3 == 0) {
                        this.o = inflate;
                    }
                    if (z5) {
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_sort_dialog_item_text_selected));
                    } else {
                        textView.setTypeface(Typeface.defaultFromStyle(0));
                        textView.setTextColor(getResources().getColor(R.color.takeout_widget_filter_bar_sort_dialog_item_text_unselected));
                    }
                    if (!z5) {
                        final long j = aVar2.a;
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.5
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b0cce3362722289c11ddbc0bb538bb2", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b0cce3362722289c11ddbc0bb538bb2");
                                } else if (FilterBarView.this.k != null) {
                                    FilterBarView.this.k.a(j, FilterBarView.this.l);
                                }
                            }
                        });
                    } else if (aVar2.i != 0) {
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.6
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e5c8000386d916df6e1c1a1c860a74a", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e5c8000386d916df6e1c1a1c860a74a");
                                } else if (FilterBarView.this.k != null) {
                                    FilterBarView.this.k.a(aVar2.j ? aVar2.a : aVar2.i, FilterBarView.this.l);
                                }
                            }
                        });
                    }
                    textView.setPadding(0, 0, 0, com.sankuai.waimai.foundation.utils.g.a(this.b, 20.0f));
                    inflate.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, com.sankuai.waimai.foundation.utils.g.a(this.b, 42.0f));
                    layoutParams2.weight = 1.0f;
                    this.h.addView(inflate, layoutParams2);
                    i3++;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.h hVar, Long l, int i, boolean z, boolean z2, boolean z3, int i2) {
        boolean z4;
        long j;
        int i3 = 4;
        Object[] objArr = {hVar, l, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d16e3492b3f127e14ff9ae11e2dd4eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d16e3492b3f127e14ff9ae11e2dd4eb");
            return;
        }
        ArrayList<h.a> arrayList = hVar.a;
        ArrayList<h.a> arrayList2 = hVar.b;
        if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == null || arrayList2.isEmpty())) {
            return;
        }
        this.h.removeAllViews();
        ArrayList<h.a> arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        Long l2 = l == null ? 0L : l;
        for (h.a aVar : arrayList3) {
            if (l2.longValue() == aVar.a || (aVar.i != 0 && aVar.i == l2.longValue())) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        if (!z4) {
            l2 = 0L;
        }
        int size = arrayList2.size();
        if (arrayList != null && !arrayList.isEmpty()) {
            int i4 = 0;
            for (h.a aVar2 : arrayList) {
                if (aVar2 != null) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = aVar2;
                    objArr2[1] = Integer.valueOf(i4);
                    objArr2[2] = l2;
                    objArr2[3] = Integer.valueOf(size);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d31dcea0e28821b5e955dd86913243ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d31dcea0e28821b5e955dd86913243ed");
                    } else if (aVar2 != null) {
                        aVar2.j = aVar2.i != 0 && aVar2.i == l2.longValue();
                        boolean z5 = l2 != null && (aVar2.a == l2.longValue() || aVar2.j);
                        View inflate = this.g.inflate(R.layout.wm_nox_search_widget_filter_bar_tab_item_new_style, (ViewGroup) this.h, false);
                        TextView textView = (TextView) inflate.findViewById(R.id.filter_text);
                        View findViewById = inflate.findViewById(R.id.filter_divider);
                        if (i4 == 0) {
                            findViewById.setVisibility(8);
                        } else {
                            findViewById.setVisibility(0);
                        }
                        View findViewById2 = inflate.findViewById(R.id.filter_bubble);
                        if (aVar2.h != null && aVar2.h.a) {
                            findViewById2.setVisibility(0);
                        } else {
                            findViewById2.setVisibility(8);
                        }
                        final ImageView imageView = (ImageView) inflate.findViewById(R.id.filter_sort_icon);
                        b.a aVar3 = new b.a() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a(Bitmap bitmap) {
                                Object[] objArr3 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e2b0af1b9b274b45744d7d2ac44f2b1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e2b0af1b9b274b45744d7d2ac44f2b1");
                                } else if (bitmap != null) {
                                    imageView.setImageBitmap(bitmap);
                                }
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8be9d252a190204f43e1d3360137e2fa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8be9d252a190204f43e1d3360137e2fa");
                                } else {
                                    imageView.setVisibility(8);
                                }
                            }
                        };
                        if (!TextUtils.isEmpty(aVar2.e) && !TextUtils.isEmpty(aVar2.d)) {
                            imageView.setVisibility(0);
                            if (z5) {
                                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a2.b = this.b;
                                a2.c = aVar2.e;
                                a2.a(aVar3);
                                if (aVar2.j && !TextUtils.isEmpty(aVar2.f)) {
                                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                    a3.b = this.b;
                                    a3.c = aVar2.f;
                                    a3.a(aVar3);
                                }
                            } else {
                                b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                a4.b = this.b;
                                a4.c = aVar2.d;
                                a4.a(aVar3);
                            }
                        } else {
                            imageView.setVisibility(8);
                        }
                        textView.setTypeface(Typeface.defaultFromStyle(1));
                        int i5 = R.color.wm_nox_search_ffa400;
                        if (z5) {
                            textView.setTextColor(getResources().getColor(R.color.wm_nox_search_ffa400));
                            if (aVar2.j) {
                                textView.setTextColor(getResources().getColor(R.color.wm_nox_search_ffa400));
                            }
                        } else {
                            textView.setTextColor(getResources().getColor(R.color.wm_nox_search_575859));
                        }
                        RooIconFont rooIconFont = (RooIconFont) inflate.findViewById(R.id.filter_right_arrow);
                        if (i4 == 0) {
                            textView.setText(aVar2.b);
                            this.o = inflate;
                            this.m = textView;
                            this.n = rooIconFont;
                            this.m.setSelected(z5);
                            if (size > 1) {
                                rooIconFont.setVisibility(0);
                                Resources resources = getResources();
                                if (!z5) {
                                    i5 = R.color.wm_nox_search_d3d3d3;
                                }
                                rooIconFont.setTextColor(resources.getColor(i5));
                            } else {
                                rooIconFont.setVisibility(8);
                            }
                        } else {
                            if (!TextUtils.isEmpty(aVar2.b)) {
                                textView.setText(aVar2.b);
                            } else {
                                textView.setText(aVar2.c);
                            }
                            if (z5) {
                                if (!TextUtils.isEmpty(aVar2.k)) {
                                    textView.setText(aVar2.k);
                                }
                                if (aVar2.j && !TextUtils.isEmpty(aVar2.l)) {
                                    textView.setText(aVar2.l);
                                }
                            }
                            rooIconFont.setVisibility(8);
                        }
                        if (i4 == 0 && z5) {
                            if (size > 1) {
                                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr3 = {view};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bc8450a5f9216a6d47c34fe2180746ec", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bc8450a5f9216a6d47c34fe2180746ec");
                                        } else if (FilterBarView.this.i != null) {
                                            FilterBarView.this.i.a(FilterBarView.this.l);
                                        }
                                    }
                                });
                            }
                        } else if (!z5) {
                            final long j2 = aVar2.a;
                            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.3
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2d60474e8017199e6f918941801975f", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2d60474e8017199e6f918941801975f");
                                    } else if (FilterBarView.this.k != null) {
                                        FilterBarView.this.k.a(j2, FilterBarView.this.l);
                                    }
                                }
                            });
                        } else {
                            j = 0;
                            if (aVar2.i != 0) {
                                final long j3 = aVar2.j ? aVar2.a : aVar2.i;
                                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.FilterBarView.4
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr3 = {view};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fc25491eeb522dd11192dca6fd4602a", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fc25491eeb522dd11192dca6fd4602a");
                                        } else if (FilterBarView.this.k != null) {
                                            FilterBarView.this.k.a(j3, FilterBarView.this.l);
                                        }
                                    }
                                });
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            this.h.addView(inflate, layoutParams);
                            i4++;
                            i3 = 4;
                        }
                        j = 0;
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                        layoutParams2.weight = 1.0f;
                        this.h.addView(inflate, layoutParams2);
                        i4++;
                        i3 = 4;
                    }
                    j = 0;
                    i4++;
                    i3 = 4;
                }
            }
        }
        setArrow(z2);
        setFilterViewArrow(z3);
    }

    public void setFilterViewArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10281fdf8daa03926f5c0d10da40cc1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10281fdf8daa03926f5c0d10da40cc1e");
        } else if (this.d != null) {
            this.d.setSelected(z);
        }
    }

    public void setArrow(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848ebe92e1be10737c2321f4ec9510b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848ebe92e1be10737c2321f4ec9510b3");
        } else if (this.m == null || this.n == null) {
        } else {
            int i = R.color.wm_nox_search_ffa400;
            if (z) {
                this.n.setTextColor(getResources().getColor(R.color.wm_nox_search_ffa400));
                this.n.setText(R.string.wm_c_iconfont_jiantouxiangshang);
                return;
            }
            RooIconFont rooIconFont = this.n;
            Resources resources = getResources();
            if (!this.m.isSelected()) {
                i = R.color.wm_nox_search_d3d3d3;
            }
            rooIconFont.setTextColor(resources.getColor(i));
            this.n.setText(R.string.wm_c_iconfont_jiantouxiangxia);
        }
    }

    public void setOnTabSortClickListener(b.g gVar) {
        this.i = gVar;
    }

    public void setOnTabFilterClickListener(b.f fVar) {
        this.j = fVar;
    }

    public void setOnTabSortItemClickListener(b.h hVar) {
        this.k = hVar;
    }
}
