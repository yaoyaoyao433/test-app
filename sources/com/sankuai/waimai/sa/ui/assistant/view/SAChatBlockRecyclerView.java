package com.sankuai.waimai.sa.ui.assistant.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SAChatBlockRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;

    public SAChatBlockRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee7e81c183a3d8a0b6350c24d10265b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee7e81c183a3d8a0b6350c24d10265b");
        }
    }

    public SAChatBlockRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fecb97b3a3a81704dfa63c5f7e88b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fecb97b3a3a81704dfa63c5f7e88b8");
        }
    }

    public SAChatBlockRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf4211c895325ba2f6b913f870471f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf4211c895325ba2f6b913f870471f2");
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b267e57c0f732e27bd677f82e8bdc07e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b267e57c0f732e27bd677f82e8bdc07e")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getRawX() - this.b);
            if (abs > ViewConfiguration.get(getContext()).getScaledTouchSlop() && abs > Math.abs(motionEvent.getRawY() - this.c)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
