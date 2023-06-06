package com.dianping.voyager.widgets;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class StickTopRecyclerView extends PageContainerRecyclerView implements e {
    public static ChangeQuickRedirect a;
    public c b;
    protected List<com.dianping.agentsdk.pagecontainer.c> c;
    protected LinearLayoutManager d;
    protected int e;
    protected LinearLayout.LayoutParams f;
    protected int g;
    protected boolean h;
    protected int i;

    public StickTopRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0e55348301b2c980a2756c7596814bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0e55348301b2c980a2756c7596814bf");
        } else {
            this.c = new ArrayList();
        }
    }

    public void setViewTopMargin(int i) {
        this.g = i;
    }

    public int getViewTopMargin() {
        return this.g + this.i;
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.WrapRecyclerView, com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        this.i = i;
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.WrapRecyclerView, com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        return this.i;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b96dd6288ac6a23fe27be605539e5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b96dd6288ac6a23fe27be605539e5e")).booleanValue() : super.overScrollBy(i, i2, i3, i4, i5, i6, i7, 0, z);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5590c8ae6a2cd3aa63b1953bc5cf9a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5590c8ae6a2cd3aa63b1953bc5cf9a84");
            return;
        }
        if (i2 < 0 && !z2 && this.b != null) {
            this.b.a();
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public void setRecyclerViewScrollChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc79bc6d1470c5707e50de21d493e34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc79bc6d1470c5707e50de21d493e34");
            return;
        }
        this.e = i;
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6d9c077e4cdcf222156a79f3cbe177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6d9c077e4cdcf222156a79f3cbe177");
            return;
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = new LinearLayoutManager(getContext());
        }
        this.d = (LinearLayoutManager) layoutManager;
        super.setLayoutManager(this.d);
    }

    public View getTopView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd79f276b310891ab6547338dbf62e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd79f276b310891ab6547338dbf62e5");
        }
        if (this.b != null) {
            return this.b.f;
        }
        return null;
    }

    public void setOnTopViewLayoutChangeListener(com.dianping.agentsdk.pagecontainer.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849c67033dade82c24e57be4ab2ac671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849c67033dade82c24e57be4ab2ac671");
        } else if (cVar == null || this.c.contains(cVar)) {
        } else {
            this.c.add(cVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends LinearLayout {
        public static ChangeQuickRedirect a;

        public b(Context context) {
            this(context, null);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc5416fc2f3fa2e8aeaf0d8797ed954", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc5416fc2f3fa2e8aeaf0d8797ed954");
            }
        }

        private b(Context context, AttributeSet attributeSet) {
            super(context, null);
            Object[] objArr = {context, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093a4968ceb954b825131f8415e7ddd9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093a4968ceb954b825131f8415e7ddd9");
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130bf7848d258dab80da419d9ca900c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130bf7848d258dab80da419d9ca900c8");
            } else {
                super.onMeasure(i, i2);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c942e5078449911d59db4d5f47c8aec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c942e5078449911d59db4d5f47c8aec");
            } else {
                super.onAttachedToWindow();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends View {
        public static ChangeQuickRedirect a;

        public a(Context context) {
            this(context, null);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1aa51a46c0c551027aceed6419fba29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1aa51a46c0c551027aceed6419fba29");
            }
        }

        private a(Context context, AttributeSet attributeSet) {
            super(context, null);
            Object[] objArr = {context, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cca9aa0d31c2370b1b1a4ca5ee99d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cca9aa0d31c2370b1b1a4ca5ee99d1");
            }
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3966cdc410059c0b1c7e24f3dd3157c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3966cdc410059c0b1c7e24f3dd3157c0");
            } else {
                super.onMeasure(i, i2);
            }
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5321791fe3bc467b57c47344fcfe6035", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5321791fe3bc467b57c47344fcfe6035");
            } else {
                super.onAttachedToWindow();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c extends LinearLayout {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ StickTopRecyclerView b;
        private Integer c;
        private b d;
        private a e;
        private View f;
        private int g;
        private int h;

        public final int getPosition() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2d9ed9f1ee603aab7e35e98db61259", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2d9ed9f1ee603aab7e35e98db61259")).intValue();
            }
            if (this.d == null || !(this.d.getLayoutParams() instanceof RecyclerView.g)) {
                return this.g;
            }
            int position = this.b.d.getPosition(this.d);
            if (position != -1) {
                this.g = position;
            }
            return this.g;
        }

        public final int getCurrentPosition() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4062233f89e25dcfe87e870517543498", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4062233f89e25dcfe87e870517543498")).intValue();
            }
            if (this.d == null || !(this.d.getLayoutParams() instanceof RecyclerView.g)) {
                return -1;
            }
            return this.b.d.getPosition(this.d);
        }

        public final void setStatus(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3d20d3330649907098eca1e57b0922", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3d20d3330649907098eca1e57b0922");
            } else if (this.c.intValue() == i) {
            } else {
                this.c = Integer.valueOf(i);
            }
        }

        public final void setTopView(View view) {
            this.f = view;
        }

        public final void setEmptyView(b bVar) {
            this.d = bVar;
        }

        public final void setActualEmptyView(a aVar) {
            this.e = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
            if (r3.top <= r11.b.getViewTopMargin()) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.voyager.widgets.StickTopRecyclerView.c.a():void");
        }

        @Override // android.view.View
        public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e8d4a5fe302690de27ec7539be0de7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e8d4a5fe302690de27ec7539be0de7");
                return;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += this.b.e;
                if (this.b.c.size() > 0) {
                    for (int i = 0; i < this.b.c.size(); i++) {
                        this.b.c.get(i);
                        getPosition();
                        this.c.intValue();
                    }
                }
            }
            super.setLayoutParams(layoutParams);
        }

        public final ViewGroup.MarginLayoutParams getMarginParams() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36029486ce9cfdae2693d2f4255a6b39", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewGroup.MarginLayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36029486ce9cfdae2693d2f4255a6b39");
            }
            if (getLayoutParams() != null) {
                return (ViewGroup.MarginLayoutParams) getLayoutParams();
            }
            return null;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            ViewGroup.LayoutParams layoutParams;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc0e728975a2cb81322d4746b5222f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc0e728975a2cb81322d4746b5222f5");
                return;
            }
            super.onMeasure(i, i2);
            if (this.h == this.f.getMeasuredHeight()) {
                return;
            }
            this.h = this.f.getMeasuredHeight();
            if (this.h != this.e.getMeasuredHeight()) {
                if (this.e.getLayoutParams() == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, this.h);
                } else {
                    layoutParams = this.e.getLayoutParams();
                    layoutParams.height = this.h;
                }
                this.e.setLayoutParams(layoutParams);
                this.e.measure(this.e.getMeasuredWidthAndState(), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            }
        }
    }
}
