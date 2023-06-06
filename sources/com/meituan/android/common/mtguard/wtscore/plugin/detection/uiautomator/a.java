package com.meituan.android.common.mtguard.wtscore.plugin.detection.uiautomator;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public View.OnTouchListener a;
    private boolean b;

    public a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3626a39e699cdf89e77d4048f9a25702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3626a39e699cdf89e77d4048f9a25702");
        } else {
            this.b = true;
        }
    }

    private static void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14c4108160eb6358990bfd8e3b7792ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14c4108160eb6358990bfd8e3b7792ff");
        } else if (motionEvent == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] main3 = NBridge.main3(12, new Object[]{motionEvent});
            int intValue = main3 != null ? ((Integer) main3[0]).intValue() : 0;
            MTGuardLog.setLogan("检测结果：" + intValue + " use: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        }
    }

    private void a(View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            return;
        }
        this.a = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08a84aeaa0cedb6ba31ef69e1f0bdc52", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08a84aeaa0cedb6ba31ef69e1f0bdc52")).booleanValue();
        }
        if (view != null && motionEvent != null) {
            try {
                if (this.b && motionEvent != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Object[] main3 = NBridge.main3(12, new Object[]{motionEvent});
                    int intValue = main3 != null ? ((Integer) main3[0]).intValue() : 0;
                    MTGuardLog.setLogan("检测结果：" + intValue + " use: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
        return this.a != null && this.a.onTouch(view, motionEvent);
    }
}
