package com.sankuai.waimai.business.restaurant.poicontainer.machpro.draglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.a;
import android.support.v7.widget.v;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.component.list.MPListComponent;
import com.sankuai.waimai.machpro.component.view.b;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPDragComponent extends b {
    public static ChangeQuickRedirect a;
    private RecyclerView b;
    private MPListComponent.a c;
    private GestureDetectorCompat e;
    private FrameLayout f;
    private boolean g;
    private int h;
    private int i;
    private RecyclerView.s j;
    private MPComponent k;
    private GestureDetector.SimpleOnGestureListener l;
    private Runnable m;
    private RecyclerView.j n;

    public static /* synthetic */ RecyclerView.s a(MPDragComponent mPDragComponent, RecyclerView.s sVar) {
        mPDragComponent.j = null;
        return null;
    }

    public static /* synthetic */ MPComponent a(MPDragComponent mPDragComponent, MPComponent mPComponent) {
        mPDragComponent.k = null;
        return null;
    }

    public static /* synthetic */ void a(MPDragComponent mPDragComponent, MotionEvent motionEvent) {
        View findChildViewUnder;
        MPComponent mPComponent;
        WeakReference<MPComponent> weakReference;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPDragComponent, changeQuickRedirect, false, "34fab97cbc9d9a239fcdf2814814df54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPDragComponent, changeQuickRedirect, false, "34fab97cbc9d9a239fcdf2814814df54");
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (mPDragComponent.b == null || mPDragComponent.c == null || (findChildViewUnder = mPDragComponent.b.findChildViewUnder(x, y)) == null) {
            return;
        }
        mPDragComponent.j = mPDragComponent.b.getChildViewHolder(findChildViewUnder);
        if (mPDragComponent.j != null) {
            int[] c = mPDragComponent.c.c(mPDragComponent.j.getAdapterPosition());
            MachMap machMap = new MachMap();
            machMap.put("section", Integer.valueOf(c[0]));
            machMap.put("item", Integer.valueOf(c[1]));
            machMap.put("type", c[1] == -1 ? "section" : "cell");
            MachArray machArray = new MachArray();
            machArray.add(machMap);
            Object dispatchEvent = mPDragComponent.dispatchEvent("dragBegin", machArray);
            if ((dispatchEvent instanceof Boolean) && ((Boolean) dispatchEvent).booleanValue()) {
                MachArray machArray2 = new MachArray();
                machArray2.add(machMap);
                mPDragComponent.dispatchEvent("snapshotCreated", machArray2);
                mPDragComponent.mMachContext.getJSContext().c();
                com.sankuai.waimai.machpro.instance.a mPContext = mPDragComponent.mMachContext.getInstance();
                Object[] objArr2 = {"snapshot"};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.machpro.instance.a.a;
                if (PatchProxy.isSupport(objArr2, mPContext, changeQuickRedirect2, false, "761024cf4f320e58da3c15ebf121cef9", RobustBitConfig.DEFAULT_VALUE)) {
                    mPComponent = (MPComponent) PatchProxy.accessDispatch(objArr2, mPContext, changeQuickRedirect2, false, "761024cf4f320e58da3c15ebf121cef9");
                } else {
                    mPComponent = (TextUtils.isEmpty("snapshot") || (weakReference = mPContext.x.get("snapshot")) == null || weakReference.get() == null) ? null : weakReference.get();
                }
                mPDragComponent.k = mPComponent;
                if (mPDragComponent.k != null) {
                    mPDragComponent.removeChild(mPDragComponent.k);
                    int[] iArr = new int[2];
                    findChildViewUnder.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    mPDragComponent.f.getLocationOnScreen(iArr2);
                    int i = iArr[1] - iArr2[1];
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = i;
                    mPDragComponent.f.addView(mPDragComponent.k.getView(), layoutParams);
                    mPDragComponent.g = true;
                }
            }
        }
    }

    public static /* synthetic */ boolean a(MPDragComponent mPDragComponent, boolean z) {
        mPDragComponent.g = false;
        return false;
    }

    public static /* synthetic */ boolean b(MPDragComponent mPDragComponent) {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPDragComponent, changeQuickRedirect, false, "d696f6818dfa21d3a6001331c8131525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, mPDragComponent, changeQuickRedirect, false, "d696f6818dfa21d3a6001331c8131525")).booleanValue();
        }
        if (mPDragComponent.k == null || mPDragComponent.k.getView() == null) {
            return false;
        }
        int top = mPDragComponent.k.getView().getTop();
        if ((mPDragComponent.k.getView().getHeight() + top) - mPDragComponent.b.getBottom() > 0) {
            mPDragComponent.b.scrollBy(0, 3);
            z = true;
        } else {
            z = false;
        }
        if (top - mPDragComponent.b.getTop() < 0) {
            mPDragComponent.b.scrollBy(0, -3);
            return true;
        }
        return z;
    }

    public static /* synthetic */ void c(MPDragComponent mPDragComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPDragComponent, changeQuickRedirect, false, "4b7d1f4abb6025e92e58ec8417595a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPDragComponent, changeQuickRedirect, false, "4b7d1f4abb6025e92e58ec8417595a5a");
            return;
        }
        RecyclerView.s b = mPDragComponent.b();
        if (b != null) {
            Object[] objArr2 = {b};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, mPDragComponent, changeQuickRedirect2, false, "ae23f3209da43f932dd349f94113f4d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mPDragComponent, changeQuickRedirect2, false, "ae23f3209da43f932dd349f94113f4d0");
            } else if (mPDragComponent.k != null && b != null) {
                MachMap machMap = new MachMap();
                int bottom = ((b.itemView.getBottom() - b.itemView.getTop()) / 2) + b.itemView.getTop();
                int[] c = mPDragComponent.c.c(b.getAdapterPosition());
                machMap.put("section", Integer.valueOf(c[0]));
                machMap.put("item", Integer.valueOf(c[1]));
                machMap.put("type", c[1] == -1 ? "section" : "cell");
                machMap.put("location", mPDragComponent.h >= bottom ? "lower" : "upper");
                MachArray machArray = new MachArray();
                machArray.add(machMap);
                mPDragComponent.dispatchEvent("dragChanged", machArray);
            }
            RecyclerView.LayoutManager layoutManager = mPDragComponent.b.getLayoutManager();
            if (layoutManager instanceof a.d) {
                ((a.d) layoutManager).prepareForDrop(mPDragComponent.j.itemView, b.itemView, 0, 0);
            }
        }
    }

    public MPDragComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72ba4761b3f7a9b44a22a2d49f61547", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72ba4761b3f7a9b44a22a2d49f61547");
            return;
        }
        this.l = new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.draglist.MPDragComponent.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67289d7422af22c872e102d41aa36208", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67289d7422af22c872e102d41aa36208");
                    return;
                }
                super.onLongPress(motionEvent);
                try {
                    MPDragComponent.a(MPDragComponent.this, motionEvent);
                } catch (Exception e) {
                    com.sankuai.waimai.machpro.util.a.a(e.getMessage());
                }
            }
        };
        this.m = new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.draglist.MPDragComponent.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f93a1f23a4534d3fa91ebad7e445f262", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f93a1f23a4534d3fa91ebad7e445f262");
                } else if (MPDragComponent.this.b == null || !MPDragComponent.b(MPDragComponent.this)) {
                } else {
                    MPDragComponent.c(MPDragComponent.this);
                    MPDragComponent.this.b.removeCallbacks(MPDragComponent.this.m);
                    ViewCompat.postOnAnimation(MPDragComponent.this.b, this);
                }
            }
        };
        this.n = new RecyclerView.j() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.draglist.MPDragComponent.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.j
            public final void onRequestDisallowInterceptTouchEvent(boolean z) {
            }

            @Override // android.support.v7.widget.RecyclerView.j
            public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                Object[] objArr2 = {recyclerView, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ea885fed5794d7b7f61c4335c42b09d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ea885fed5794d7b7f61c4335c42b09d")).booleanValue();
                }
                if (MPDragComponent.this.e != null) {
                    MPDragComponent.this.e.onTouchEvent(motionEvent);
                }
                if (motionEvent.getActionMasked() == 0) {
                    MPDragComponent.a(MPDragComponent.this, false);
                    MPDragComponent.this.h = (int) motionEvent.getY();
                    MPDragComponent.this.i = (int) motionEvent.getX();
                }
                return MPDragComponent.this.g;
            }

            @Override // android.support.v7.widget.RecyclerView.j
            public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                Object[] objArr2 = {recyclerView, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad09e4adb1dd85a116e140bb176474ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad09e4adb1dd85a116e140bb176474ab");
                    return;
                }
                if (MPDragComponent.this.e != null) {
                    MPDragComponent.this.e.onTouchEvent(motionEvent);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    if (MPDragComponent.this.g && MPDragComponent.this.k != null && (MPDragComponent.this.k.getView().getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) MPDragComponent.this.k.getView().getLayoutParams();
                        MPDragComponent.this.k.getView().getBottom();
                        MPDragComponent.this.k.getView().getTop();
                        MPDragComponent.this.h = (int) motionEvent.getY();
                        MPDragComponent.this.i = (int) motionEvent.getX();
                        layoutParams.topMargin += (int) (motionEvent.getY() - MPDragComponent.this.h);
                        MPDragComponent.this.k.getView().setLayoutParams(layoutParams);
                        MPDragComponent.c(MPDragComponent.this);
                        MPDragComponent.this.m.run();
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    MPDragComponent.a(MPDragComponent.this, false);
                    MPDragComponent.this.f.removeAllViews();
                    RecyclerView.s b = MPDragComponent.this.b();
                    if (b != null) {
                        MachMap machMap = new MachMap();
                        int[] c = MPDragComponent.this.c.c(b.getAdapterPosition());
                        machMap.put("section", Integer.valueOf(c[0]));
                        machMap.put("item", Integer.valueOf(c[1]));
                        MachArray machArray = new MachArray();
                        machArray.add(machMap);
                        MPDragComponent.this.dispatchEvent("dragWillEnd", machArray);
                    }
                    MPDragComponent.this.dispatchEvent("dragDidEnd", null);
                    MPDragComponent.a(MPDragComponent.this, (MPComponent) null);
                    MPDragComponent.a(MPDragComponent.this, (RecyclerView.s) null);
                }
            }
        };
        this.f = new a(mPContext.getContext());
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b9422ebe55f8f1a85540ac7e4ceb28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b9422ebe55f8f1a85540ac7e4ceb28");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        if (mPComponent instanceof MPListComponent) {
            if (this.e == null) {
                this.e = new GestureDetectorCompat(this.mMachContext.getContext(), this.l);
            }
            MPListComponent mPListComponent = (MPListComponent) mPComponent;
            this.b = mPListComponent.b;
            this.b.setItemAnimator(new v());
            this.b.removeOnItemTouchListener(this.n);
            this.b.addOnItemTouchListener(this.n);
            this.b.setOverScrollMode(2);
            this.c = (MPListComponent.a) this.b.getAdapter();
            if (this.f.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f.getParent()).removeView(this.f);
            }
            mPListComponent.getView().getPendantLayout().addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RecyclerView.s b() {
        View findChildViewUnder;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9bf1d7407cdae399b4c1824d0a80e1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9bf1d7407cdae399b4c1824d0a80e1e");
        }
        if (this.k == null || this.j == null || this.b == null || (findChildViewUnder = this.b.findChildViewUnder(this.i, this.h)) == null) {
            return null;
        }
        RecyclerView.s childViewHolder = this.b.getChildViewHolder(findChildViewUnder);
        int itemViewType = this.c.getItemViewType(childViewHolder.getAdapterPosition());
        if (itemViewType == 10002 || itemViewType == 10001 || itemViewType == 10003 || childViewHolder.itemView == this.j.itemView) {
            return null;
        }
        return childViewHolder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends FrameLayout {
        public static ChangeQuickRedirect a;

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17360e82ca05e8954d7bd673902b5f88", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17360e82ca05e8954d7bd673902b5f88");
            }
        }

        @Override // android.view.ViewGroup
        public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bb3204859cfc7f3a361fbe811301b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bb3204859cfc7f3a361fbe811301b7");
            } else {
                view.measure(getChildMeasureSpec(i, i2, ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
    }
}
