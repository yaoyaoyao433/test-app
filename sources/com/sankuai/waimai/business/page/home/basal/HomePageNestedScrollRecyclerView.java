package com.sankuai.waimai.business.page.home.basal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aq;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.c;
import com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePageNestedScrollRecyclerView extends NestedScrollRecyclerView {
    public static ChangeQuickRedirect i;
    private RecyclerView.c j;
    private int k;

    public HomePageNestedScrollRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7006af33dc3c4ed66d249612d9bd3112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7006af33dc3c4ed66d249612d9bd3112");
        }
    }

    public HomePageNestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3c4ab0849c54be6b114964913ec99b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3c4ab0849c54be6b114964913ec99b");
        }
    }

    public HomePageNestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087854d58dfb455e87331fab7ccdf8d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087854d58dfb455e87331fab7ccdf8d7");
        }
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dffb78467c92d03128958678e579c5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dffb78467c92d03128958678e579c5c3");
            return;
        }
        super.a(context);
        getItemAnimator().setAddDuration(0L);
        getItemAnimator().setChangeDuration(0L);
        getItemAnimator().setMoveDuration(0L);
        getItemAnimator().setRemoveDuration(0L);
        ((aq) getItemAnimator()).setSupportsChangeAnimations(false);
        this.j = new RecyclerView.c() { // from class: com.sankuai.waimai.business.page.home.basal.HomePageNestedScrollRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82685086277c59ee4c037c8f3558c066", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82685086277c59ee4c037c8f3558c066");
                    return;
                }
                if (HomePageNestedScrollRecyclerView.this.getLayoutManager() instanceof PreLoadLinearLayoutManager) {
                    ((PreLoadLinearLayoutManager) HomePageNestedScrollRecyclerView.this.getLayoutManager()).b = true;
                }
                super.onChanged();
            }
        };
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd626269ffbe8025ea2a820c032491e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd626269ffbe8025ea2a820c032491e");
            return;
        }
        super.setAdapter(aVar);
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.j);
        }
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fd53e3ac7146cac9ad89d285fdded7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fd53e3ac7146cac9ad89d285fdded7");
            return;
        }
        super.onDetachedFromWindow();
        try {
            if (getAdapter() != null) {
                getAdapter().unregisterAdapterDataObserver(this.j);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView
    public final void a(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1718644f11d91c12ebf67d57adcecada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1718644f11d91c12ebf67d57adcecada");
            return;
        }
        super.a(i2, i3);
        if (!(i2 == 0 && i3 == 0) && (getLayoutManager() instanceof PreLoadLinearLayoutManager)) {
            ((PreLoadLinearLayoutManager) getLayoutManager()).b = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void scrollToPosition(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b97e04e439e922e7f3411a0cd23452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b97e04e439e922e7f3411a0cd23452");
            return;
        }
        super.scrollToPosition(i2);
        a(i2);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void smoothScrollToPosition(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee624131a5f33edf4b277eb0e47df23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee624131a5f33edf4b277eb0e47df23e");
            return;
        }
        super.smoothScrollToPosition(i2);
        a(i2);
    }

    private void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d24398637140e410d4ac6747f40073c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d24398637140e410d4ac6747f40073c5");
            return;
        }
        this.k = 0;
        if (i2 == 0) {
            this.g = this.k;
            a(this.g, this.h);
            return;
        }
        setNotifyScrollChange(false);
        if (!(getAdapter() instanceof a)) {
            setNotifyScrollChange(true);
            return;
        }
        final a aVar = (a) getAdapter();
        if (!(getLayoutManager() instanceof LinearLayoutManager)) {
            setNotifyScrollChange(true);
            return;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (aVar.c == null || aVar.c.size() == 0) {
            setNotifyScrollChange(true);
        } else if (aVar.c.size() <= i2 || i2 < 0) {
            setNotifyScrollChange(true);
        } else {
            c.a(this, new Runnable() { // from class: com.sankuai.waimai.business.page.home.basal.HomePageNestedScrollRecyclerView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    View i3;
                    int i4;
                    int i5;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78344da81a3c8e7306d9f1af2f8123b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78344da81a3c8e7306d9f1af2f8123b5");
                    } else if (aVar.c == null || aVar.c.size() == 0) {
                        HomePageNestedScrollRecyclerView.this.setNotifyScrollChange(true);
                    } else {
                        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        if (findFirstVisibleItemPosition >= aVar.c.size() || findFirstVisibleItemPosition < 0) {
                            HomePageNestedScrollRecyclerView.this.setNotifyScrollChange(true);
                            return;
                        }
                        for (int i6 = findFirstVisibleItemPosition; i6 >= 0; i6--) {
                            com.meituan.android.cube.pga.block.a aVar2 = aVar.c.get(i6);
                            if (aVar2 != null && (i3 = aVar2.i()) != null) {
                                int top = i3.getTop();
                                ViewGroup.LayoutParams layoutParams = i3.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    i5 = marginLayoutParams.topMargin;
                                    i4 = marginLayoutParams.bottomMargin;
                                } else {
                                    i4 = 0;
                                    i5 = 0;
                                }
                                if (i6 == findFirstVisibleItemPosition) {
                                    HomePageNestedScrollRecyclerView.this.k += i5 - top;
                                } else {
                                    HomePageNestedScrollRecyclerView.this.k += i3.getHeight() + i4 + i5;
                                }
                            }
                        }
                        HomePageNestedScrollRecyclerView.this.g = HomePageNestedScrollRecyclerView.this.k;
                        HomePageNestedScrollRecyclerView.this.a(HomePageNestedScrollRecyclerView.this.g, HomePageNestedScrollRecyclerView.this.h);
                        HomePageNestedScrollRecyclerView.this.setNotifyScrollChange(true);
                    }
                }
            }, null);
        }
    }
}
