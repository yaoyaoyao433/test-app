package com.dianping.picasso.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dianping.picasso.PicassoNotificationCenter;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.ButtonModel;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoButton extends AppCompatImageButton {
    public static ChangeQuickRedirect changeQuickRedirect;
    public PicassoNotificationCenter mNotificationCenter;
    private PicassoModel model;
    private int pressColor;

    public PicassoButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ee3966e9e34eb5ea0847bb17ab668d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ee3966e9e34eb5ea0847bb17ab668d");
        }
    }

    public PicassoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0043c7cd7a96312f17871a39ba09123e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0043c7cd7a96312f17871a39ba09123e");
            return;
        }
        this.pressColor = Integer.MAX_VALUE;
        this.model = new PicassoModel();
    }

    @SuppressLint({"NewApi"})
    public PicassoButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b78ad4dfbbe66474769239ba4203f01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b78ad4dfbbe66474769239ba4203f01");
        }
    }

    public void setNotificationCenter(PicassoNotificationCenter picassoNotificationCenter) {
        this.mNotificationCenter = picassoNotificationCenter;
    }

    public void setClickColor(String str, PicassoModel picassoModel) {
        Object[] objArr = {str, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae4da503660b326e5de24d446776b7ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae4da503660b326e5de24d446776b7ba");
            return;
        }
        this.pressColor = PicassoUtils.isValidColor(str) ? Color.parseColor(str) : Integer.MAX_VALUE;
        this.model = picassoModel;
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457d38804d2cf4838a4380be8e062cef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457d38804d2cf4838a4380be8e062cef")).booleanValue();
        }
        if (this.mNotificationCenter != null) {
            Object tag = getTag(R.id.id_picasso_model);
            if (tag instanceof ButtonModel) {
                this.mNotificationCenter.postNotificationName(getContext(), 1, (ButtonModel) tag);
            }
        }
        return super.performClick();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06139cd6489873ad926bb1b197cca2d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06139cd6489873ad926bb1b197cca2d8")).booleanValue();
        }
        Drawable background = getBackground();
        if ((background instanceof GradientDrawable) && this.pressColor != Integer.MAX_VALUE) {
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        ((GradientDrawable) background).setColor(this.pressColor);
                        break;
                    case 1:
                        PicassoUtils.setBackgroundColor((GradientDrawable) background, this.model);
                        break;
                }
            } else {
                PicassoUtils.setBackgroundColor((GradientDrawable) background, this.model);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
