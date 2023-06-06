package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    b.c b;
    private View c;
    private LinearLayout d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private SearchShareData i;

    public e(@NonNull Context context, b.c cVar, SearchShareData searchShareData) {
        super(context);
        Object[] objArr = {context, cVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffb6dcd89f51138aca043ab37829df0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffb6dcd89f51138aca043ab37829df0");
            return;
        }
        this.b = cVar;
        this.i = searchShareData;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56645d2d015e7c70fe2909cc213a6071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56645d2d015e7c70fe2909cc213a6071");
            return;
        }
        this.c = findView(R.id.fl_search_filter_item_container);
        this.d = (LinearLayout) findView(R.id.search_filter_item_text_container);
        this.e = (ImageView) findView(R.id.search_filter_item_icon);
        this.f = (TextView) findView(R.id.search_filter_item_text);
        this.g = (TextView) findView(R.id.search_filter_item_sub_text);
        this.h = (ImageView) findView(R.id.search_filter_item_image);
    }

    public final void a(final SearchFilterGroup.SearchFilterItem searchFilterItem) {
        boolean z;
        Object[] objArr = {searchFilterItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee196bb2f7bf990dc8611f2702227d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee196bb2f7bf990dc8611f2702227d5");
        } else if (searchFilterItem == null) {
        } else {
            Object[] objArr2 = {searchFilterItem};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1075cace3ed703b0bfb8c5618d8ac0e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1075cace3ed703b0bfb8c5618d8ac0e1");
            } else if (searchFilterItem.selected) {
                this.c.setBackgroundColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_FFF8E1));
            } else {
                this.c.setBackgroundColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_F5F5F6));
            }
            String str = searchFilterItem.backgroundUrl;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c5960d68a479614f8ece2211035c5944", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c5960d68a479614f8ece2211035c5944")).booleanValue();
            } else if (TextUtils.isEmpty(str)) {
                this.h.setVisibility(8);
                z = false;
            } else {
                this.h.setVisibility(0);
                b.C0608b a2 = m.a(str, ImageQualityUtil.a());
                a2.b = this.h.getContext();
                a2.e = 1;
                a2.a(this.h);
                z = true;
            }
            if (z) {
                this.d.setVisibility(4);
            } else {
                this.d.setVisibility(0);
                String str2 = searchFilterItem.filterIcon;
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e3c1918b2927d68183fed474453ef88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e3c1918b2927d68183fed474453ef88");
                } else if (TextUtils.isEmpty(str2)) {
                    this.e.setVisibility(8);
                } else {
                    this.e.setVisibility(0);
                    b.C0608b a3 = m.a(str2, ImageQualityUtil.a());
                    a3.b = this.e.getContext();
                    a3.e = 1;
                    a3.a(this.e);
                }
                Object[] objArr5 = {searchFilterItem};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "23542bb97713f50e7f40f82725837d57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "23542bb97713f50e7f40f82725837d57");
                } else {
                    u.a(this.f, searchFilterItem.filterName);
                    u.a(this.g, searchFilterItem.remarks);
                    if (searchFilterItem.selected) {
                        this.f.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000));
                        this.f.setTypeface(Typeface.DEFAULT_BOLD);
                        this.g.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_FF8000));
                    } else {
                        this.f.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_222426));
                        this.f.setTypeface(Typeface.DEFAULT);
                        this.g.setTextColor(this.mContext.getResources().getColor(R.color.wm_sc_nox_search_color_858687));
                    }
                }
            }
            Object[] objArr6 = {searchFilterItem};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "73d379c8c969c6bc0df6e81b3963afc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "73d379c8c969c6bc0df6e81b3963afc4");
            } else {
                getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.e.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5038b812950b9afdaf84c73fce214446", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5038b812950b9afdaf84c73fce214446");
                        } else {
                            e.this.b.a(searchFilterItem);
                        }
                    }
                });
            }
        }
    }
}
