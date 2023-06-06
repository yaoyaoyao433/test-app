package com.sankuai.waimai.bussiness.order.base.widget.picker.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ae;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RecyclerWheelPicker extends RecyclerView {
    public static ChangeQuickRedirect a;
    boolean b;
    public boolean c;
    private int d;
    private int e;
    private float f;
    private float g;
    private Paint h;
    private Rect i;
    private boolean j;
    private com.sankuai.waimai.bussiness.order.base.widget.picker.base.b k;
    private b l;
    private WheelPickerLayoutManager m;
    private a n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(RecyclerWheelPicker recyclerWheelPicker, boolean z, int i, com.sankuai.waimai.platform.ui.a aVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }

    public RecyclerWheelPicker(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3976b4b9c4c9067c8c4c2cda00cb2426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3976b4b9c4c9067c8c4c2cda00cb2426");
        }
    }

    public RecyclerWheelPicker(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9aecf717dc572548258c01f2026e2a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9aecf717dc572548258c01f2026e2a6");
        }
    }

    public RecyclerWheelPicker(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e39d58394bdafc6f3ce65f47534b6b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e39d58394bdafc6f3ce65f47534b6b6");
            return;
        }
        this.b = true;
        this.c = true;
        this.j = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.g = 40.0f * f;
        this.e = -13421773;
        this.d = -16777216;
        this.f = f * 22.0f;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f4ee31b1c4a31fac253e148a155a00b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f4ee31b1c4a31fac253e148a155a00b");
            return;
        }
        setOverScrollMode(2);
        setHasFixedSize(true);
        this.h = new Paint(1);
        this.i = new Rect();
        this.k = new com.sankuai.waimai.bussiness.order.base.widget.picker.base.a();
        this.l = new b(context);
        super.setAdapter(this.l);
        this.m = new WheelPickerLayoutManager(this);
        super.setLayoutManager(this.m);
        new ae().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e00703df9cadfcf30fd2eb340841cb2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e00703df9cadfcf30fd2eb340841cb2")).booleanValue() : !this.j || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5128950dad523e57e0b45fa2d2d4b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5128950dad523e57e0b45fa2d2d4b24");
            return;
        }
        super.onScrollStateChanged(i);
        this.j = this.l.getItemCount() == 0 || getChildCount() > 0;
        if (i == 0 && this.j) {
            int a2 = this.m.a();
            if (a2 == -1) {
                a(true, -1, null);
                return;
            } else {
                a(false, a2, this.l.a(a2));
                return;
            }
        }
        a(true, -1, null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea15bc06c172c570754f991bbb876c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea15bc06c172c570754f991bbb876c6f");
            return;
        }
        super.onScrolled(i, i2);
        this.j = this.l.getItemCount() == 0 || getChildCount() > 0;
        if (i == 0 && i2 == 0 && this.j) {
            int a2 = this.m.a();
            if (a2 == -1) {
                a(true, -1, null);
                return;
            } else {
                a(false, a2, this.l.a(a2));
                return;
            }
        }
        a(true, -1, null);
    }

    private void a(boolean z, int i, com.sankuai.waimai.platform.ui.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e605a070d90fec250e27faaf0697d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e605a070d90fec250e27faaf0697d2");
            return;
        }
        this.c = z;
        if (this.n != null) {
            this.n.a(this, z, i, aVar);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9089532eb576bdbac5b92110f6d27ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9089532eb576bdbac5b92110f6d27ef6");
        } else {
            this.m.a(i, this.l.f);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cdad7002fe23049b89e8cde2bb7cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cdad7002fe23049b89e8cde2bb7cfa");
        } else if (this.l.getItemCount() == 0) {
        } else {
            super.smoothScrollToPosition(i);
        }
    }

    public void setOnWheelScrollListener(a aVar) {
        this.n = aVar;
    }

    public void setTextColor(int i) {
        this.d = i;
    }

    public void setDecorationColor(int i) {
        this.e = i;
    }

    public void setTextSize(float f) {
        this.f = f;
    }

    public void setDecorationSize(float f) {
        this.g = f;
    }

    public void setData(List<com.sankuai.waimai.platform.ui.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0770ecfef5335f453a02bb0f90f467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0770ecfef5335f453a02bb0f90f467");
            return;
        }
        b bVar = this.l;
        int i = this.d;
        float f = this.f;
        Object[] objArr2 = {list, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ac0fc817f1430cc002f23868c0c72c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ac0fc817f1430cc002f23868c0c72c54");
        } else {
            bVar.c = list;
            bVar.d = i;
            bVar.e = f;
            bVar.f = (int) RecyclerWheelPicker.this.g;
            bVar.notifyDataSetChanged();
        }
        super.setAdapter(this.l);
        if (list == null || list.size() == 0) {
            onScrolled(0, 0);
        }
        WheelPickerLayoutManager wheelPickerLayoutManager = this.m;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = WheelPickerLayoutManager.a;
        if (PatchProxy.isSupport(objArr3, wheelPickerLayoutManager, changeQuickRedirect3, false, "6f5876e011112d12be47300fea0b6611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, wheelPickerLayoutManager, changeQuickRedirect3, false, "6f5876e011112d12be47300fea0b6611");
            return;
        }
        int itemCount = wheelPickerLayoutManager.getItemCount();
        if (itemCount == 0) {
            wheelPickerLayoutManager.b = 0;
            return;
        }
        int i2 = itemCount - 1;
        if (wheelPickerLayoutManager.b > wheelPickerLayoutManager.c * i2) {
            wheelPickerLayoutManager.b = i2 * wheelPickerLayoutManager.c;
        } else if (wheelPickerLayoutManager.b < 0) {
            wheelPickerLayoutManager.b = 0;
        }
    }

    public void setScrollEnabled(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438fc9276b671c80cbe30885a50e7193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438fc9276b671c80cbe30885a50e7193");
        } else if (this.b != z) {
            if (z) {
                this.b = z;
                smoothScrollBy(0, 1);
            }
            if (this.m.a() == -1) {
                postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.widget.picker.base.RecyclerWheelPicker.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45c22dbffaed11f39931753a312f8dd0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45c22dbffaed11f39931753a312f8dd0");
                            return;
                        }
                        RecyclerWheelPicker.this.b = z;
                    }
                }, 200L);
            } else {
                this.b = z;
            }
        }
    }

    public void setDecoration(com.sankuai.waimai.bussiness.order.base.widget.picker.base.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ed37ed344142ca48112a9fb79b78af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ed37ed344142ca48112a9fb79b78af");
            return;
        }
        this.k = bVar;
        invalidate();
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.b;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f17f4154d2a8792245886a8ac2fa413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f17f4154d2a8792245886a8ac2fa413");
            return;
        }
        super.onDraw(canvas);
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f0fb2033660ea60382e47a79da96286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f0fb2033660ea60382e47a79da96286");
        } else if (this.k != null) {
            this.i.set(-1, (int) ((getVerticalSpace() / 2) - (this.g / 2.0f)), getWidth() + 1, (int) ((getVerticalSpace() / 2) + (this.g / 2.0f)));
            this.h.setColor(this.e);
            this.h.setStyle(Paint.Style.STROKE);
            this.h.setStrokeWidth(0.25f);
            this.k.a(this, canvas, this.i, this.h);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c6bc67f708564ca03572990180b6a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c6bc67f708564ca03572990180b6a6")).booleanValue();
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            String charSequence = textView.getText().toString();
            if (textView.getTextSize() == this.f) {
                float f = this.f;
                float desiredWidth = StaticLayout.getDesiredWidth(charSequence, 0, charSequence.length(), textView.getPaint());
                if (getHorizontalSpace() > 0 && desiredWidth * 1.1f > getHorizontalSpace()) {
                    f = ((getHorizontalSpace() / desiredWidth) / 1.1f) * this.f;
                }
                textView.setTextSize(0, f);
            }
        }
        int verticalSpace = getVerticalSpace() / 2;
        float top = verticalSpace - (view.getTop() + (view.getHeight() / 2));
        float f2 = top * 1.0f;
        float f3 = verticalSpace;
        float f4 = f2 / f3;
        float abs = 1.0f - (Math.abs(f4) * 0.7f);
        view.setAlpha(abs * abs * abs);
        float abs2 = 1.0f - (Math.abs(f4) * 0.3f);
        view.setScaleX(abs2);
        view.setScaleY(abs2);
        if (view.getTop() > verticalSpace - view.getHeight() && view.getTop() < verticalSpace) {
            ((TextView) view).setTextColor(Color.parseColor("#FF8000"));
        } else {
            ((TextView) view).setTextColor(-16777216);
        }
        float f5 = (f3 * 2.0f) / 3.1415927f;
        double d = f2 / f5;
        Math.cos(d);
        view.setTranslationY(top - ((f5 * ((float) Math.sin(d))) * 1.3f));
        return super.drawChild(canvas, view, j);
    }

    public int getVerticalSpace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4628530e631b1dc273911892934e58", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4628530e631b1dc273911892934e58")).intValue() : (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public int getHorizontalSpace() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a4033c6cb092caedc43069de0cf559", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a4033c6cb092caedc43069de0cf559")).intValue() : (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b extends RecyclerView.a<RecyclerView.s> {
        public static ChangeQuickRedirect a;
        public Context b;
        public List<com.sankuai.waimai.platform.ui.a> c;
        public int d;
        public float e;
        public int f;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48f3bbdbf9fdcd85c443e7816d6362c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48f3bbdbf9fdcd85c443e7816d6362c");
            }
            TextView textView = new TextView(this.b);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(RecyclerWheelPicker.this.getLayoutParams());
            layoutParams.width = -1;
            layoutParams.height = this.f;
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            return new a(textView);
        }

        public b(Context context) {
            Object[] objArr = {RecyclerWheelPicker.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0bcb72332cb1a7e573d1e6e73dca22d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0bcb72332cb1a7e573d1e6e73dca22d");
                return;
            }
            this.f = (int) RecyclerWheelPicker.this.g;
            this.b = context;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.s sVar, int i) {
            Object[] objArr = {sVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9606202f069458d85cb9e51e0e22f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9606202f069458d85cb9e51e0e22f2");
            } else if (this.c != null) {
                TextView textView = (TextView) sVar.itemView;
                textView.setTextColor(this.d);
                textView.setTextSize(0, this.e);
                textView.setText(this.c.get(i).invalidStr());
                textView.setGravity(17);
            }
        }

        public final com.sankuai.waimai.platform.ui.a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec2c21ed28e5d3bcc8faf41216286137", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.platform.ui.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec2c21ed28e5d3bcc8faf41216286137");
            }
            if (this.c == null || i > this.c.size() - 1) {
                return null;
            }
            return this.c.get(i);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2266873015c169e2ef2e3d1b33d6df", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2266873015c169e2ef2e3d1b33d6df")).intValue();
            }
            if (this.c == null) {
                return 0;
            }
            return this.c.size();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        class a extends RecyclerView.s {
            public a(View view) {
                super(view);
            }
        }
    }
}
