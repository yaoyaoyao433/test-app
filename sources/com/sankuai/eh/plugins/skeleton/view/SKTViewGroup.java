package com.sankuai.eh.plugins.skeleton.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SKTViewGroup extends RelativeLayout implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private e<SKTViewGroup> b;

    public SKTViewGroup(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ea11941b5893e806ebc8bc60ed4757", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ea11941b5893e806ebc8bc60ed4757");
        } else {
            this.b = new e<>(this);
        }
    }

    public SKTViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bced3cd7b7891150d1073d7677058eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bced3cd7b7891150d1073d7677058eb");
        } else {
            this.b = new e<>(this);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cde28c6d8069489ea2b88951ff1181c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cde28c6d8069489ea2b88951ff1181c")).booleanValue();
        }
        removeAllViews();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7431363741163d5f501e9ce6911abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7431363741163d5f501e9ce6911abb");
            return;
        }
        super.onAttachedToWindow();
        this.b.sendEmptyMessageDelayed(0, MetricsAnrManager.ANR_THRESHOLD);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe8d8f6c40b910aee6e58039b8569de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe8d8f6c40b910aee6e58039b8569de");
        } else {
            super.onDetachedFromWindow();
        }
    }
}
