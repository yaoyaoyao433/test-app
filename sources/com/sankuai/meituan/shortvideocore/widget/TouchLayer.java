package com.sankuai.meituan.shortvideocore.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TouchLayer extends FrameLayout {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private int f;
    private float g;
    private float h;
    private a i;
    private GestureDetector j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public TouchLayer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca225f358026ce3262e7d4eabc351dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca225f358026ce3262e7d4eabc351dd");
        }
    }

    public TouchLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d861e42d4df66c6c300442e864d3015", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d861e42d4df66c6c300442e864d3015");
        }
    }

    public TouchLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eec2d545469ebf18b324f2cfe94e501", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eec2d545469ebf18b324f2cfe94e501");
            return;
        }
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = null;
        this.j = null;
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public float getTouchMinY() {
        return this.g;
    }

    public float getTouchMaxY() {
        return this.h;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.j = gestureDetector;
    }

    public final void a(float f, float f2, a aVar) {
        this.g = f;
        this.h = f2;
        this.i = aVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16fe65cd832facf67e7bfc9a81f5f455", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16fe65cd832facf67e7bfc9a81f5f455")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getX();
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
        } else if (action == 2) {
            a(motionEvent);
            this.b = motionEvent.getX();
        }
        return this.e;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0b1a32ddff66eae1fa20224cc9c75e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0b1a32ddff66eae1fa20224cc9c75e")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.b = motionEvent.getX();
                this.c = motionEvent.getX();
                this.d = motionEvent.getY();
                break;
            case 1:
                if (this.e) {
                    this.e = false;
                    break;
                }
                break;
            case 2:
                a(motionEvent);
                this.b = motionEvent.getX();
                break;
        }
        if (this.j != null) {
            this.j.onTouchEvent(motionEvent);
        }
        return true;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873bd175b88f2434176d06e208ce14f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873bd175b88f2434176d06e208ce14f5");
        } else if (this.e || (Math.abs(motionEvent.getX() - this.c) > this.f && this.d > this.g && this.d < this.h)) {
            if (!this.e) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.i != null) {
                motionEvent.getX();
            }
            this.e = true;
        }
    }
}
