package com.sankuai.waimai.bussiness.order.list.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GoldenCoinProgressBar extends FrameLayout {
    public static ChangeQuickRedirect a;
    public View b;
    public View c;
    public FrameLayout d;
    public int e;
    public boolean f;
    private final Runnable g;

    public GoldenCoinProgressBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9311b34f8944d9904d0d457b986032f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9311b34f8944d9904d0d457b986032f3");
        }
    }

    private GoldenCoinProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48238a7c5fdf61610e232398f954af3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48238a7c5fdf61610e232398f954af3");
        }
    }

    public GoldenCoinProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90823ac074e290e2e25f0074cc428be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90823ac074e290e2e25f0074cc428be");
            return;
        }
        this.f = false;
        this.g = new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.view.GoldenCoinProgressBar.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6623154591acebebd3c0de346ab5cca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6623154591acebebd3c0de346ab5cca");
                    return;
                }
                GoldenCoinProgressBar.this.measure(View.MeasureSpec.makeMeasureSpec(GoldenCoinProgressBar.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(GoldenCoinProgressBar.this.getHeight(), 1073741824));
                GoldenCoinProgressBar.this.layout(GoldenCoinProgressBar.this.getLeft(), GoldenCoinProgressBar.this.getTop(), GoldenCoinProgressBar.this.getRight(), GoldenCoinProgressBar.this.getBottom());
            }
        };
        LayoutInflater.from(context).inflate(R.layout.wm_order_golden_coin_progressbar, (ViewGroup) this, true);
        this.b = findViewById(R.id.iv_golden_coin_progress_main);
        this.c = findViewById(R.id.iv_golden_coin_progress_second);
        this.d = (FrameLayout) findViewById(R.id.fl_golden_coin_progress_packets);
        a();
        int l = b.A().l();
        this.e = l - g.a(context, 48.0f);
        if (g.c(context, l) <= 320) {
            this.f = true;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b52e1de8a58fcdad26c5c2fbf9efdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b52e1de8a58fcdad26c5c2fbf9efdc");
            return;
        }
        for (int i = 0; i < 5; i++) {
            LayoutInflater.from(getContext()).inflate(R.layout.wm_order_golden_coin_progressbar_milestone, (ViewGroup) this.d, true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74114008d3f673c7344a660f84bc09c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74114008d3f673c7344a660f84bc09c5");
            return;
        }
        super.requestLayout();
        post(this.g);
    }
}
