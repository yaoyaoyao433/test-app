package com.dianping.picassocontroller.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SectionIndexer;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends View {
    public static ChangeQuickRedirect a;
    private Paint b;
    private String[] c;
    private SectionIndexer d;
    private int e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void onSelected(int i, int i2);

        void onUnselected();
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1720eb12b2dac42c2b7f2c4a90a30ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1720eb12b2dac42c2b7f2c4a90a30ebb");
            return;
        }
        this.d = null;
        this.b = new Paint();
        this.b.setColor(-16777216);
        this.b.setAntiAlias(true);
        this.b.setTextSize(PicassoUtils.dp2px(getContext(), 12.0f));
        this.b.setTextAlign(Paint.Align.CENTER);
        this.e = PicassoUtils.dp2px(getContext(), 18.0f);
    }

    public final void setIndexColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637972b1b36615210fb77abda344b8b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637972b1b36615210fb77abda344b8b5");
        } else {
            this.b.setColor(Color.parseColor(str));
        }
    }

    public final int getItemHeight() {
        return this.e;
    }

    public final void setSectionIndicator(SectionIndexer sectionIndexer) {
        Object[] objArr = {sectionIndexer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4abeb387194f43b0fe5c75d3eaec8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4abeb387194f43b0fe5c75d3eaec8d");
            return;
        }
        this.d = sectionIndexer;
        this.c = (String[]) sectionIndexer.getSections();
        if (this.c == null || this.c.length == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04f206b156055163cab830a7168390d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04f206b156055163cab830a7168390d")).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        int y = ((int) motionEvent.getY()) / this.e;
        if (y >= this.c.length) {
            i = this.c.length - 1;
        } else if (y >= 0) {
            i = y;
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            int positionForSection = this.d.getPositionForSection(i);
            if (positionForSection != -1 && this.f != null) {
                this.f.onSelected(i, positionForSection);
            }
        } else if (motionEvent.getAction() == 1 && this.f != null) {
            this.f.onUnselected();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70aeb5dad05a3266102c4db5c03b0ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70aeb5dad05a3266102c4db5c03b0ea8");
        } else if (this.c != null) {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            for (int i = 0; i < this.c.length; i++) {
                String valueOf = String.valueOf(this.c[i]);
                if (valueOf.length() > 2) {
                    valueOf = valueOf.substring(0, 1);
                }
                int i2 = this.e;
                canvas.drawText(valueOf, measuredWidth, i2 + (i * i2), this.b);
            }
            super.onDraw(canvas);
        }
    }

    public final void setOnSelectedListener(a aVar) {
        this.f = aVar;
    }
}
