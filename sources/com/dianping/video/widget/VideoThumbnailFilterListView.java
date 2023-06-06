package com.dianping.video.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.util.j;
import com.dianping.video.model.e;
import com.dianping.video.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VideoThumbnailFilterListView extends FrameLayout implements View.OnLayoutChangeListener, View.OnTouchListener {
    public static ChangeQuickRedirect a = null;
    public static int b = 0;
    public static int c = 1;
    public static int d = 2;
    private Handler e;
    private int f;
    private RecyclerView g;
    private int h;
    private int i;
    private int j;
    private long k;
    private b l;
    private ImageView m;
    private FrameLayout n;
    private double o;
    private String p;
    private int q;
    private a r;
    private ArrayList<e> s;
    private int t;
    private List<e> u;
    private int v;
    private int w;
    private double x;
    private double y;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    public VideoThumbnailFilterListView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a1c5f07c1d40546a6156881438944a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a1c5f07c1d40546a6156881438944a");
            return;
        }
        this.e = new Handler();
        this.q = 0;
        this.s = new ArrayList<>();
        this.t = b;
        this.u = new ArrayList();
        a();
    }

    public VideoThumbnailFilterListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f010817271e5b24bf3164d88dce507", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f010817271e5b24bf3164d88dce507");
            return;
        }
        this.e = new Handler();
        this.q = 0;
        this.s = new ArrayList<>();
        this.t = b;
        this.u = new ArrayList();
        a();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7300a75e390272f278cd116f238ebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7300a75e390272f278cd116f238ebe");
            return;
        }
        removeOnLayoutChangeListener(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b2baf5a6cf79eb5379d589666a163b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b2baf5a6cf79eb5379d589666a163b2");
        } else {
            this.f = getWidth();
            this.w = j.a(getContext(), 12.0f);
            int i9 = this.f - (this.w * 2);
            this.i = j.a(getContext(), 22.5f);
            this.j = j.a(getContext(), 40.0f);
            this.h = i9 / this.i;
            this.k = (long) (this.y / this.h);
            this.v = this.h * this.i;
            this.o = (this.y * 1.0d) / this.v;
            this.g = new RecyclerView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.v, this.j);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = this.w;
            layoutParams.rightMargin = this.w;
            addView(this.g, layoutParams);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            this.g.setLayoutManager(linearLayoutManager);
            this.l = new b(new com.dianping.video.widget.a(this.p, (long) this.x, this.k, this.j), this.h, this.i, this.j);
            this.g.setAdapter(this.l);
            this.n = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, this.j);
            layoutParams2.gravity = 16;
            addView(this.n, layoutParams2);
            this.m = new ImageView(getContext());
            this.m.setOnTouchListener(this);
            this.m.setImageResource(R.drawable.video_progress_line);
            this.m.setScaleType(ImageView.ScaleType.FIT_XY);
            this.m.setAdjustViewBounds(true);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(j.a(getContext(), 24.0f), j.a(getContext(), 47.0f));
            layoutParams3.gravity = 16;
            addView(this.m, layoutParams3);
        }
        c();
        if (this.s.size() > 0) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09240349710fdee5ee41fdb5fece8141", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09240349710fdee5ee41fdb5fece8141");
            return;
        }
        super.onDetachedFromWindow();
        if (this.l != null) {
            b bVar = this.l;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c941b955a2d167b4377cd769c36842fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c941b955a2d167b4377cd769c36842fe");
            } else {
                com.dianping.video.widget.a aVar = bVar.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.video.widget.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ed77086bed5a0035ae21af7d94fa9635", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ed77086bed5a0035ae21af7d94fa9635");
                } else {
                    aVar.c.shutdown();
                    aVar.b.release();
                }
            }
        }
        if (this.e != null) {
            this.e.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 0;
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c129a3094c15aac36abc88630176f935", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c129a3094c15aac36abc88630176f935")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (view == this.m) {
            if (action == 0) {
                this.q = (int) motionEvent.getRawX();
                a(j.a(getContext(), 56.0f));
            } else if (2 == action) {
                int rawX = ((int) motionEvent.getRawX()) - this.q;
                Object[] objArr2 = {Integer.valueOf(rawX)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b6f0ee3996e79548287cafc2d05e9fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b6f0ee3996e79548287cafc2d05e9fe");
                } else if (this.m == null) {
                    Log.e("VideoThumbnailFilter", "moveLineViewByOffsetPosition mLineView is null");
                } else {
                    int i2 = rawX + ((FrameLayout.LayoutParams) this.m.getLayoutParams()).leftMargin;
                    Object[] objArr3 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1532e2d54ed89988a9336422424de630", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1532e2d54ed89988a9336422424de630");
                    } else {
                        if (i2 >= 0) {
                            i = i2 > this.v ? this.v : i2;
                        }
                        if (this.m == null) {
                            Log.e("VideoThumbnailFilter", "changeLineViewPosition mLineView is null");
                        } else {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
                            layoutParams.leftMargin = i;
                            this.m.setLayoutParams(layoutParams);
                        }
                    }
                    int i3 = ((FrameLayout.LayoutParams) this.m.getLayoutParams()).leftMargin;
                }
                this.q = (int) motionEvent.getRawX();
            } else if (1 == action) {
                this.q = 0;
                a(j.a(getContext(), 47.0f));
            }
            return true;
        }
        return false;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac0429d9e8fd39b8d86f5a15e100a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac0429d9e8fd39b8d86f5a15e100a3e");
        } else if (this.m == null) {
            Log.e("VideoThumbnailFilter", "modifyLineViewHeight mLineView is null");
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
            layoutParams.height = i;
            this.m.setLayoutParams(layoutParams);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "463f917c41109683792f6f486f27c304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "463f917c41109683792f6f486f27c304");
        } else {
            addOnLayoutChangeListener(this);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e70ace7a37aaa97eae08e5ff48b95d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e70ace7a37aaa97eae08e5ff48b95d95");
            return;
        }
        this.n.removeAllViews();
        for (int size = this.u.size() - 1; size >= 0; size--) {
            e eVar = this.u.get(size);
            View view = new View(getContext());
            view.setBackgroundColor(eVar.d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) Math.ceil((((eVar.c - eVar.b) * 1.0f) / this.y) * this.v), this.j);
            layoutParams.leftMargin = (int) Math.floor(((((eVar.b - this.x) * 1.0d) / this.y) * this.v) + this.w);
            this.n.addView(view, layoutParams);
        }
    }

    private void c() {
        int i;
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3746170ca862526ec7863cef5823862d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3746170ca862526ec7863cef5823862d");
            return;
        }
        Stack stack = new Stack();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= this.s.size() - 1) {
                break;
            }
            stack.push(this.s.get(i2));
            i2++;
        }
        this.u.clear();
        if (this.s.size() > 0) {
            this.u.add(this.s.get(this.s.size() - 1));
        }
        while (!stack.empty()) {
            e eVar = (e) stack.pop();
            int size = this.u.size() - i;
            while (true) {
                if (size >= 0) {
                    e eVar2 = this.u.get(size);
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = eVar;
                    ChangeQuickRedirect changeQuickRedirect2 = e.a;
                    if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "e18366f0e616f4e28aedceced27b3672", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "e18366f0e616f4e28aedceced27b3672")).booleanValue();
                    } else {
                        z = (eVar2.b < eVar.b && eVar2.c > eVar.c) || (eVar2.b == eVar.b && eVar2.c > eVar.c) || (eVar2.b < eVar.b && eVar2.c == eVar.c);
                    }
                    if (z) {
                        break;
                    }
                    if (!(eVar2.b == eVar.b && eVar2.c == eVar.c)) {
                        Object[] objArr3 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "ad835ade67608ba762c102c5e00a5936", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "ad835ade67608ba762c102c5e00a5936")).booleanValue();
                        } else {
                            z2 = (eVar2.b > eVar.b && eVar2.c < eVar.c) || (eVar2.b == eVar.b && eVar2.c < eVar.c) || (eVar2.b > eVar.b && eVar2.c == eVar.c);
                        }
                        if (z2) {
                            e eVar3 = new e();
                            eVar3.b = eVar.b;
                            eVar3.c = eVar2.b;
                            eVar3.d = eVar.d;
                            eVar3.e = eVar.a();
                            stack.push(eVar3);
                            e eVar4 = new e();
                            eVar4.d = eVar.d;
                            eVar4.b = eVar2.c;
                            eVar4.c = eVar.c;
                            eVar4.e = eVar.a();
                            stack.push(eVar4);
                            break;
                        }
                        if (eVar2.b > eVar.b && eVar2.b < eVar.c) {
                            e eVar5 = new e();
                            eVar5.b = eVar.b;
                            eVar5.c = eVar2.b;
                            eVar5.d = eVar.d;
                            eVar5.e = eVar.a();
                            stack.push(eVar5);
                            break;
                        }
                        if (eVar2.c < eVar.c && eVar2.c > eVar.b) {
                            e eVar6 = new e();
                            eVar6.d = eVar.d;
                            eVar6.b = eVar2.c;
                            eVar6.c = eVar.c;
                            eVar6.e = eVar.a();
                            stack.push(eVar6);
                            break;
                        }
                        if (size == 0) {
                            this.u.add(eVar);
                        }
                        size--;
                        i = 1;
                    }
                }
            }
            i = 1;
        }
    }

    public int getStatus() {
        return this.t;
    }

    public void setOnVideoSeekChangedListener(a aVar) {
        this.r = aVar;
    }

    public List<e> getDisplaySectionFilterDataList() {
        return this.u;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.a<c> implements a.b {
        public static ChangeQuickRedirect a;
        com.dianping.video.widget.a b;
        private int c;
        private int d;
        private int e;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(c cVar, int i) {
            Bitmap bitmap;
            c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13e9aeb123ac4523fe6424623623b1e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13e9aeb123ac4523fe6424623623b1e2");
                return;
            }
            com.dianping.video.widget.a aVar = this.b;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.widget.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "05a0d157a8e732050baa98df37d4a60c", RobustBitConfig.DEFAULT_VALUE)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "05a0d157a8e732050baa98df37d4a60c");
            } else {
                Bitmap bitmap2 = aVar.d.get(Integer.valueOf(i));
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else {
                    if (!aVar.e.contains(Integer.valueOf(i))) {
                        aVar.e.add(Integer.valueOf(i));
                        if (aVar.c != null && !aVar.c.isShutdown()) {
                            aVar.c.submit(new a.RunnableC0137a(i));
                        }
                    }
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                cVar2.a.setImageBitmap(bitmap);
            } else {
                cVar2.a.setImageBitmap(null);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb417c8d457dc408ea00de176ddb1ae1", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb417c8d457dc408ea00de176ddb1ae1");
            }
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new RecyclerView.g(this.c, this.d));
            c cVar = new c(imageView);
            cVar.a = imageView;
            return cVar;
        }

        public b(com.dianping.video.widget.a aVar, int i, int i2, int i3) {
            Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfbb072a8fa924a3556d06653bf6efd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfbb072a8fa924a3556d06653bf6efd");
                return;
            }
            this.b = aVar;
            this.b.f = this;
            this.e = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            return this.e;
        }

        @Override // com.dianping.video.widget.a.b
        public final void a(int i, Bitmap bitmap) {
            Object[] objArr = {Integer.valueOf(i), bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea2420aac240d670c5a5ad5b5166eff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea2420aac240d670c5a5ad5b5166eff");
            } else {
                notifyItemChanged(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c extends RecyclerView.s {
        public ImageView a;

        public c(View view) {
            super(view);
        }
    }
}
