package com.sankuai.waimai.business.page.home.list.future.filterBar;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.view.view.FloatFilterRelativeLayout;
import com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatFilterDialogView extends FloatFilterRelativeLayout {
    public static ChangeQuickRedirect a;
    private PoiFilterActivityDialogFragmentHome b;
    private FragmentManager c;
    private String d;
    private b.a e;
    private Handler f;

    public FloatFilterDialogView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f29fc3d48161c8db196f9039e6f69c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f29fc3d48161c8db196f9039e6f69c6");
            return;
        }
        this.f = new Handler();
        a(context);
    }

    public FloatFilterDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0eff3a6b9d9c05699d007d47657b02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0eff3a6b9d9c05699d007d47657b02");
            return;
        }
        this.f = new Handler();
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b15cbb3f19042d7e2da9d03efdb6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b15cbb3f19042d7e2da9d03efdb6d0");
        } else {
            LayoutInflater.from(context).inflate(R.layout.wm_page_home_float_filter_dialog, (ViewGroup) this, true);
        }
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public void setOnDialogSortItemClickListener(b.a aVar) {
        this.e = aVar;
    }

    public void setPageInfoKey(String str) {
        this.d = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71232a19cab65b0150e3166891ab138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71232a19cab65b0150e3166891ab138");
        } else if (this.c == null || !isAttachedToWindow()) {
        } else {
            this.b = (PoiFilterActivityDialogFragmentHome) this.c.findFragmentByTag("tag_main_page_future_filter_dialog");
            if (this.b == null) {
                this.b = PoiFilterActivityDialogFragmentHome.a(0);
                this.b.b = this.d;
            }
            this.b.a();
            this.b.d = this.e;
            FragmentTransaction beginTransaction = this.c.beginTransaction();
            if (beginTransaction != null) {
                try {
                    if (!this.b.isAdded()) {
                        beginTransaction.add(R.id.filter_bar_dialog, this.b, "tag_main_page_future_filter_dialog");
                    }
                    b();
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                    beginTransaction.show(this.b);
                    beginTransaction.commitAllowingStateLoss();
                    this.c.executePendingTransactions();
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                }
            }
        }
    }

    private void a(List<b.a> list, Set<String> set, Map<String, g> map) {
        Object[] objArr = {list, set, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3fd7e8220a55c6510b021bcfa63d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3fd7e8220a55c6510b021bcfa63d1e");
        } else if (this.b == null || !isAttachedToWindow() || this.b.isHidden()) {
        } else {
            this.b.c = list;
            this.b.e = set;
            this.b.f = map;
            this.b.b(true);
            this.b.a();
        }
    }

    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar, Set<String> set, Map<String, g> map) {
        Object[] objArr = {bVar, set, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e241861a17f924d2961d7d6e2b440f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e241861a17f924d2961d7d6e2b440f");
        } else if (bVar != null) {
            a(bVar.b, set, map);
        }
    }

    public final void a(boolean z) {
        FragmentTransaction beginTransaction;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7f2a28d7bd878c234bff1c82ac7542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7f2a28d7bd878c234bff1c82ac7542");
        } else if (this.c == null || (beginTransaction = this.c.beginTransaction()) == null || this.b == null || !this.b.isVisible()) {
        } else {
            try {
                if (z) {
                    a(300);
                    beginTransaction.setCustomAnimations(R.anim.wm_common_dialog_top_in, R.anim.wm_common_dialog_top_out);
                } else {
                    a(0);
                }
                beginTransaction.hide(this.b);
                beginTransaction.commitAllowingStateLoss();
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5677037c9fed72e7aa832376e8c80dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5677037c9fed72e7aa832376e8c80dd2");
        } else if (this.b != null) {
            this.b.a(z);
            this.b.a();
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aff563c9e1bc5df5a912e5312d64844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aff563c9e1bc5df5a912e5312d64844");
        } else if (this.b != null) {
            this.b.c(z);
            this.b.a();
        }
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb88b60e93624d8260f2d0e8e92c07d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb88b60e93624d8260f2d0e8e92c07d");
        } else if (this.b != null) {
            this.b.d(z);
            this.b.a();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927d7760abe6f2e41099ad7c7410abab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927d7760abe6f2e41099ad7c7410abab");
            return;
        }
        this.f.removeCallbacksAndMessages(null);
        View findViewById = findViewById(R.id.filter_bar_dialog_background);
        if (findViewById.getVisibility() == 0) {
            return;
        }
        findViewById.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        findViewById.setAnimation(alphaAnimation);
        alphaAnimation.start();
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7e37f57846c2a9d6193d835ed94368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7e37f57846c2a9d6193d835ed94368");
            return;
        }
        final View findViewById = findViewById(R.id.filter_bar_dialog_background);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        long j = i;
        alphaAnimation.setDuration(j);
        findViewById.setAnimation(alphaAnimation);
        alphaAnimation.start();
        this.f.removeCallbacksAndMessages(null);
        this.f.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.FloatFilterDialogView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "020b506729c86d0c577a18f5593989d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "020b506729c86d0c577a18f5593989d3");
                } else {
                    findViewById.setVisibility(8);
                }
            }
        }, j);
    }
}
