package com.sankuai.waimai.platform.widget.scrollview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CommentScrollView extends ScrollView {
    public static ChangeQuickRedirect a = null;
    public static float b = 3.0f;
    private View[] c;
    private a d;
    private float e;
    private float f;
    private float g;
    private float h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public CommentScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2410077f51eebf3d1bf7b2c1a827b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2410077f51eebf3d1bf7b2c1a827b1");
        }
    }

    public CommentScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe3a2232cd477d26e96738bdaf832b23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe3a2232cd477d26e96738bdaf832b23");
        }
    }

    public void setTouchViews(View... viewArr) {
        this.c = viewArr;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        char c = 1;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018388cd27ed134d363e345438854301", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018388cd27ed134d363e345438854301")).booleanValue();
        }
        if (super.onInterceptTouchEvent(motionEvent)) {
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6952091595965d591f26066f17d2348d", RobustBitConfig.DEFAULT_VALUE)) {
                View[] viewArr = this.c;
                int length = viewArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    View view = viewArr[i];
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = motionEvent;
                    objArr3[c] = view;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31ae97e91b4608d25d2296a41b184d96", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31ae97e91b4608d25d2296a41b184d96")).booleanValue();
                    } else {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        z2 = rawY >= ((float) iArr[1]) && rawY <= ((float) (iArr[1] + view.getHeight())) && rawX >= ((float) iArr[0]) && rawX <= ((float) (iArr[0] + view.getWidth()));
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                    i++;
                    c = 1;
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6952091595965d591f26066f17d2348d")).booleanValue();
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1fa033a367c5bda9c2aaa56ff6e740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1fa033a367c5bda9c2aaa56ff6e740");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63956cace21d9ac97cc4af7bfadf47c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63956cace21d9ac97cc4af7bfadf47c")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.e = motionEvent.getX();
                this.f = motionEvent.getY();
                break;
            case 1:
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
                if (this.h - this.f > 0.0f && Math.abs(this.h - this.f) > b) {
                    a aVar = this.d;
                    break;
                } else if (this.h - this.f < 0.0f) {
                    Math.abs(this.h - this.f);
                    break;
                }
                break;
            case 2:
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
                if (this.h - this.f > 0.0f && Math.abs(this.h - this.f) > b) {
                    a aVar2 = this.d;
                    break;
                } else if (this.h - this.f < 0.0f && Math.abs(this.h - this.f) > b) {
                    a aVar3 = this.d;
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollListener(a aVar) {
        this.d = aVar;
    }
}
