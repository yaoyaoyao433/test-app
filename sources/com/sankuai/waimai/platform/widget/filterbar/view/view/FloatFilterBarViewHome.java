package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FloatFilterBarViewHome extends FloatFilterRelativeLayout {
    public static ChangeQuickRedirect a;
    public String b;
    public FilterBarViewHome c;
    public FragmentManager d;
    public PoiFilterActivityDialogFragmentHome e;
    public PoiFilterCategoryDialogFragment f;
    public PoiFilterActivityDialogFragmentHome g;
    public b.a h;
    public b.InterfaceC1095b i;
    public b.a j;
    public boolean k;
    public boolean l;
    private Context n;
    private RelativeLayout o;
    private LinearLayout p;
    private LinearLayout q;
    private boolean r;
    private Handler s;
    private boolean t;
    private int u;

    public int getFloatMoveOffsetMin() {
        return 0;
    }

    public FloatFilterBarViewHome(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68b950f3fdcd67c8bf65765b9cf9627", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68b950f3fdcd67c8bf65765b9cf9627");
            return;
        }
        this.s = new Handler();
        this.t = true;
        a(context);
    }

    public FloatFilterBarViewHome(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c8cffd1399e3355a75d2a3ef81e375", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c8cffd1399e3355a75d2a3ef81e375");
            return;
        }
        this.s = new Handler();
        this.t = true;
        a(context);
    }

    public void setPageInfoKey(String str) {
        this.b = str;
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.d = fragmentManager;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e3e0d5b0200d298b442521682d6b854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e3e0d5b0200d298b442521682d6b854");
            return;
        }
        this.n = context;
        LayoutInflater.from(this.n).inflate(R.layout.wm_widget_filter_bar_float_bar_home, (ViewGroup) this, true);
        this.o = (RelativeLayout) findViewById(R.id.filter_bar_container);
        this.c = (FilterBarViewHome) findViewById(R.id.filter_bar_tab);
        this.p = (LinearLayout) findViewById(R.id.filter_bar);
        this.q = (LinearLayout) findViewById(R.id.fast_filter_bar);
        this.u = com.sankuai.waimai.foundation.utils.g.a(this.n, 5.5f);
    }

    public void setForceHideFastFilterBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c493eaa1104690dd01c0526f7ab47236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c493eaa1104690dd01c0526f7ab47236");
            return;
        }
        this.r = z;
        if (this.r) {
            c();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7569ab3e443cb10b83b24f15f1d90db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7569ab3e443cb10b83b24f15f1d90db");
            return;
        }
        this.s.removeCallbacksAndMessages(null);
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

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964d3ba30eb4e2bd4c38c542e4dd760d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964d3ba30eb4e2bd4c38c542e4dd760d");
            return;
        }
        final View findViewById = findViewById(R.id.filter_bar_dialog_background);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        findViewById.setAnimation(alphaAnimation);
        alphaAnimation.start();
        this.s.removeCallbacksAndMessages(null);
        this.s.postDelayed(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FloatFilterBarViewHome.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5783fa985eb5527cfc1c7534dd12e0c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5783fa985eb5527cfc1c7534dd12e0c4");
                    return;
                }
                FloatFilterBarViewHome.this.d();
                findViewById.setVisibility(8);
            }
        }, 300L);
    }

    public void setCategoryDialogDisplaySate(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9f1a146a43650c5ace4b29205ed8e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9f1a146a43650c5ace4b29205ed8e0");
        } else if (this.f != null) {
            this.f.a(i);
        }
    }

    public void setOnTabSortClickListener(b.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83bfc31b18ccb4338588c9a3bf8e864e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83bfc31b18ccb4338588c9a3bf8e864e");
        } else {
            this.c.setOnTabSortClickListener(gVar);
        }
    }

    public void setOnTabFilterClickListener(b.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6763567fd9103377ecf37dea13e3fa90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6763567fd9103377ecf37dea13e3fa90");
        } else {
            this.c.setOnTabFilterClickListener(fVar);
        }
    }

    public void setOnTabDynamicFilterClickListener(b.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ea47e31984bf8de1b390f3123233b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ea47e31984bf8de1b390f3123233b7");
        } else {
            this.c.setOnTabDynamicFilterClickListener(eVar);
        }
    }

    public void setOnTabSortItemClickListener(b.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f4715e1f07a7a2fd13ae73dd68cf957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f4715e1f07a7a2fd13ae73dd68cf957");
        } else {
            this.c.setOnTabSortItemClickListener(hVar);
        }
    }

    public void setOnTabCategoryClickListener(b.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f29d1d95af7820281d60fe2bf1edf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f29d1d95af7820281d60fe2bf1edf6");
        } else {
            this.c.setOnTabCategoryClickListener(dVar);
        }
    }

    public void setOnCategoryItemClickListener(b.InterfaceC1095b interfaceC1095b) {
        this.i = interfaceC1095b;
    }

    public void setOnDialogSortItemClickListener(b.a aVar) {
        this.h = aVar;
    }

    public void setOnDynamicFilterDialogItemClickListener(b.a aVar) {
        this.j = aVar;
    }

    public void setOnFastFilterItemClickListener(b.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24be9185d813955dfc964c57ff0c35a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24be9185d813955dfc964c57ff0c35a4");
        } else {
            this.c.setOnFastFilterItemClickListener(cVar);
        }
    }

    public int getFloatFilterBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea11bea58163993ec960606ff8d888e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea11bea58163993ec960606ff8d888e")).intValue();
        }
        int height = this.k ? 0 + this.p.getHeight() : 0;
        return this.l ? height + this.q.getHeight() : height;
    }

    public int getFloatMoveOffsetMax() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bae40cd2b695a46a79c212544a06fc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bae40cd2b695a46a79c212544a06fc3")).intValue();
        }
        if (this.l) {
            int height = this.p.getHeight();
            return height > this.u ? height - this.u : height;
        }
        return 0;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c489813015b45f8618629143860e9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c489813015b45f8618629143860e9e4");
        } else if (getVisibility() == 0 && this.t) {
            if (i == Integer.MAX_VALUE) {
                i = getFloatMoveOffsetMax();
            }
            if (i == -2147483647) {
                i = -getFloatMoveOffsetMax();
            }
            int baseTop = getBaseTop();
            int curTop = (baseTop - getCurTop()) + i;
            if (curTop < getFloatMoveOffsetMin()) {
                curTop = getFloatMoveOffsetMin();
            } else if (curTop > getFloatMoveOffsetMax()) {
                curTop = getFloatMoveOffsetMax();
            }
            setCurTop(baseTop - curTop);
        }
    }

    private int getCurTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7fee24abc9c010a5f5665895c49794", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7fee24abc9c010a5f5665895c49794")).intValue();
        }
        if (this.k) {
            return this.c.getTop();
        }
        if (this.l) {
            return this.q.getTop();
        }
        return 0;
    }

    private void setCurTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b981b9e7850b5a5f8cf18116482e39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b981b9e7850b5a5f8cf18116482e39a");
            return;
        }
        int bottom = this.o.getBottom();
        this.c.setTop(i);
        this.c.setBottom(i + bottom);
    }

    private int getBaseTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2d2ca372bb8347074e3e595b3dcc82", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2d2ca372bb8347074e3e595b3dcc82")).intValue() : this.o.getTop();
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5684f0bc06a7db9e2f90fc31af26b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5684f0bc06a7db9e2f90fc31af26b1c");
        } else {
            this.q.setVisibility(8);
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56cf3d3849d1f0ecd77eb1dd9a992ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56cf3d3849d1f0ecd77eb1dd9a992ed9");
        } else if (!this.r && this.l) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
    }

    public void setIsFloatFilterBarCanMove(boolean z) {
        this.t = z;
    }

    public int getFloatFilterBarScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04551614da8a4866a1d1123afcdafd12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04551614da8a4866a1d1123afcdafd12")).intValue();
        }
        if (this.l) {
            return 0 + this.p.getHeight();
        }
        return 0;
    }

    public void setPageType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500452d7cce37cd45e2ab0fbb5a01a60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500452d7cce37cd45e2ab0fbb5a01a60");
        } else if (this.c != null) {
            this.c.setPageType(i);
        }
    }

    public void setFastFilterBarBackground(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0a62e48076857c2df48f39c922a62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0a62e48076857c2df48f39c922a62b");
        } else if (this.c != null) {
            this.c.setFastFilterBarBackground(i);
        }
    }
}
