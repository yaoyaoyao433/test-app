package com.sankuai.waimai.store.drug.newwidgets;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SearchBoxUpActionBarView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private final ArgbEvaluator b;
    private TextView c;
    private View d;
    private ImageView e;
    private View f;
    private View g;
    private View h;
    private UniversalImageView i;
    private UniversalImageView j;
    private UniversalImageView k;
    private UniversalImageView l;
    private TextView m;
    private final int n;
    private final int o;
    private final int p;

    public SearchBoxUpActionBarView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2407c3ed6b2398621741fba9ad454251", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2407c3ed6b2398621741fba9ad454251");
        }
    }

    private SearchBoxUpActionBarView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2503b39359b0f069257695e6cc1c7ed8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2503b39359b0f069257695e6cc1c7ed8");
        }
    }

    public SearchBoxUpActionBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614235ee46cdf5d0cf48102e9062a476", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614235ee46cdf5d0cf48102e9062a476");
            return;
        }
        this.b = new ArgbEvaluator();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05759705d8b4344f5cc147969341a172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05759705d8b4344f5cc147969341a172");
        } else {
            inflate(getContext(), R.layout.wm_drug_goods_list_super_drugstore_action_bar, this);
            this.c = (TextView) findViewById(R.id.search_view);
            this.d = findViewById(R.id.action);
            this.e = (ImageView) findViewById(R.id.logo_view);
            this.g = findViewById(R.id.adapter_view);
            this.f = findViewById(R.id.gradient_background_view);
            this.i = (UniversalImageView) findViewById(R.id.collect);
            this.j = (UniversalImageView) findViewById(R.id.coupon_action_area);
            this.h = findViewById(R.id.v_space_search);
            this.k = (UniversalImageView) findViewById(R.id.back);
            this.l = (UniversalImageView) findViewById(R.id.more);
            this.m = (TextView) findViewById(R.id.unread_message_count);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b8252ba838a0d20de3ed0abab992c3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b8252ba838a0d20de3ed0abab992c3d");
            } else {
                ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
                layoutParams.height = u.a(getContext());
                this.g.setLayoutParams(layoutParams);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e09c056022bc5d6947645ec0e9781e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e09c056022bc5d6947645ec0e9781e3");
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
                layoutParams2.height = this.g.getLayoutParams().height + this.d.getLayoutParams().height;
                this.f.setLayoutParams(layoutParams2);
            }
        }
        ViewGroup.LayoutParams layoutParams3 = this.c.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            this.n = marginLayoutParams.topMargin;
            this.o = marginLayoutParams.leftMargin;
            this.p = marginLayoutParams.rightMargin;
            return;
        }
        this.n = 0;
        this.o = 0;
        this.p = 0;
    }

    public void setSearchViewText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8963bf4df1c9689d22053e6057644a2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8963bf4df1c9689d22053e6057644a2f");
        } else {
            this.c.setText(str);
        }
    }

    public void setSearchViewClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a43b0e4e379540bfc9fb5b952653932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a43b0e4e379540bfc9fb5b952653932");
        } else {
            this.c.setOnClickListener(onClickListener);
        }
    }

    public void setLogoViewImageView(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163126e30e16c66d9790be17e0c8959f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163126e30e16c66d9790be17e0c8959f");
        } else {
            m.a(str, this.e, (int) getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_24), ImageQualityUtil.b());
        }
    }

    public int getActionBarHeight() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c023bffd6d6b9492cfc0ea283a1d5d75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c023bffd6d6b9492cfc0ea283a1d5d75")).intValue();
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).height;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "699fac035dd9419b0c8bc89993886f61", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "699fac035dd9419b0c8bc89993886f61")).intValue();
        } else if (this.n <= 0) {
            i = this.d.getMeasuredHeight();
        } else {
            i = this.n;
        }
        return i2 + i + this.g.getLayoutParams().height;
    }

    public UniversalImageView getCollectView() {
        return this.i;
    }

    public UniversalImageView getBackView() {
        return this.k;
    }

    public UniversalImageView getMoreView() {
        return this.l;
    }

    public TextView getUnReadMessageView() {
        return this.m;
    }

    public int getGradientBackgroundViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ed996ec705e4e136711f16af2fe70a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ed996ec705e4e136711f16af2fe70a")).intValue() : this.f.getLayoutParams().height;
    }
}
