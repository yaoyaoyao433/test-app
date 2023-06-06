package com.sankuai.meituan.shortvideocore.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShortVideoPoisonRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;

    public ShortVideoPoisonRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f5c25d008b4bfad18c61994e5db7f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f5c25d008b4bfad18c61994e5db7f7");
        }
    }

    public ShortVideoPoisonRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a3be3820a63553ee4471f50164b024", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a3be3820a63553ee4471f50164b024");
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06749d1f8db5e001b37b10aa839f6e50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06749d1f8db5e001b37b10aa839f6e50")).booleanValue();
        }
        boolean z = getScrollState() == 1;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent && z && motionEvent.getAction() == 0) {
            onTouchEvent(motionEvent);
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("mScrollState");
                declaredField.setAccessible(true);
                declaredField.setInt(this, 0);
            } catch (IllegalAccessException e) {
                Log.e("ShortVideoPoisonRecycle", "onInterceptTouchEvent: ", e);
            } catch (NoSuchFieldException e2) {
                Log.e("ShortVideoPoisonRecycle", "onInterceptTouchEvent: ", e2);
            }
            return false;
        }
        return onInterceptTouchEvent;
    }
}
