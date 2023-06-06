package com.meituan.android.recce.views.textinput;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.views.textinput.ReactEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceEditText extends ReactEditText {
    public static ChangeQuickRedirect changeQuickRedirect;

    public RecceEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a85ba207a85b418cd2f5a4f341ca53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a85ba207a85b418cd2f5a4f341ca53");
        }
    }

    @Override // com.facebook.react.views.textinput.ReactEditText, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c502e3026b3df8a2947f6881389da53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c502e3026b3df8a2947f6881389da53")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            requestFocusFromJS();
        }
        return super.onTouchEvent(motionEvent);
    }
}
