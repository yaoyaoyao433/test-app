package com.sankuai.waimai.machpro.component;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    boolean b;
    private final int c;
    private float d;
    private float e;
    private boolean f;
    private float g;
    private float h;
    private final MPComponent i;
    private int j;
    private boolean k;

    public c(MPComponent mPComponent) {
        Object[] objArr = {mPComponent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10a8e62de05ea63b6b378bfe4e4a15fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10a8e62de05ea63b6b378bfe4e4a15fb");
            return;
        }
        this.f = false;
        this.j = 1;
        this.k = false;
        this.b = false;
        this.i = mPComponent;
        this.c = ViewConfiguration.get(mPComponent.getView().getContext()).getScaledTouchSlop();
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb346132968bafcf885bb3f561d8002c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb346132968bafcf885bb3f561d8002c");
            return;
        }
        this.d = motionEvent.getRawX();
        this.e = motionEvent.getRawY();
        this.f = false;
        if (this.b) {
            this.j = -1;
        } else {
            this.j = 1;
        }
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd58103da1a98b32050d1b02393e88a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd58103da1a98b32050d1b02393e88a")).booleanValue();
        }
        String str = "";
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        switch (motionEvent.getActionMasked()) {
            case 0:
                a(motionEvent);
                this.k = true;
                return this.i == null || this.i.getView() == null || !this.i.getView().hasOnClickListeners();
            case 1:
            case 3:
                this.k = false;
                if (this.f) {
                    str = "dragEnd";
                    break;
                }
                break;
            case 2:
                if (!this.k) {
                    this.k = true;
                    a(motionEvent);
                }
                if (!this.f && (Math.abs(rawX - this.d) >= this.c || Math.abs(rawY - this.e) >= this.c)) {
                    if (this.j == -1) {
                        this.j = com.sankuai.waimai.machpro.util.b.d(a("shouldStartDrag", rawX - this.d, rawY - this.e)) ? 1 : 0;
                    }
                    if (this.j == 1) {
                        this.g = rawX;
                        this.h = rawY;
                        str = "dragStart";
                        this.f = true;
                        break;
                    }
                } else if (this.f) {
                    str = "drag";
                    break;
                }
                break;
        }
        if (this.f) {
            float f = rawX - this.g;
            float f2 = rawY - this.h;
            if (!TextUtils.isEmpty(str)) {
                a(str, f, f2);
            }
        }
        return this.f;
    }

    private Object a(String str, float f, float f2) {
        Object[] objArr = {str, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcec4d7a2a4a5d3d2b7b6853af6fbe8f", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcec4d7a2a4a5d3d2b7b6853af6fbe8f");
        }
        MachMap machMap = new MachMap();
        machMap.put(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.i.getView().getContext(), f)));
        machMap.put(Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.i.getView().getContext(), f2)));
        if ("shouldStartDrag".equals(str)) {
            machMap.put("pageX", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.i.getView().getContext(), this.d)));
            machMap.put("pageY", Float.valueOf(com.sankuai.waimai.machpro.util.b.a(this.i.getView().getContext(), this.e)));
        }
        MachArray machArray = new MachArray();
        machArray.add(machMap);
        return this.i.dispatchEvent(str, machArray);
    }
}
