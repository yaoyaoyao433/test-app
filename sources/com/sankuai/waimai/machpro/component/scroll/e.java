package com.sankuai.waimai.machpro.component.scroll;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends FrameLayout {
    public static ChangeQuickRedirect a;
    private MPScrollComponent b;
    private String c;
    private int d;
    private int e;
    private boolean f;

    public e(@NonNull Context context, MPScrollComponent mPScrollComponent) {
        super(context);
        Object[] objArr = {context, mPScrollComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6daf6c34dde94a0aff111023bb0c9f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6daf6c34dde94a0aff111023bb0c9f8");
            return;
        }
        this.f = false;
        this.b = mPScrollComponent;
    }

    public final void setShouldStartDrag(String str) {
        this.c = str;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f18303c587d0a8d95756618013eba33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f18303c587d0a8d95756618013eba33")).booleanValue();
        }
        if (!TextUtils.isEmpty(this.c)) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.d = (int) motionEvent.getRawX();
                    this.e = (int) motionEvent.getRawY();
                case 1:
                case 3:
                    this.f = false;
                    break;
                case 2:
                    MachMap machMap = new MachMap();
                    machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a((int) (motionEvent.getRawX() - this.d))));
                    machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a((int) (motionEvent.getRawY() - this.e))));
                    machMap.put("pageX", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(motionEvent.getRawX())));
                    machMap.put("pageY", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(motionEvent.getRawY())));
                    MachArray machArray = new MachArray();
                    machArray.add(machMap);
                    this.f = com.sankuai.waimai.machpro.util.b.d(this.b.dispatchEvent(this.c, machArray));
                    break;
            }
        }
        if (this.f) {
            return this.f;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
