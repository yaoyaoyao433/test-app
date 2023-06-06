package com.dianping.titans.widget;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.titans.ui.NavigateBarHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NavigateBar extends FrameLayout implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private NavigateBarHost mHost;

    public NavigateBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e90b3687f2b352262e3f1e27a6df4a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e90b3687f2b352262e3f1e27a6df4a0");
        } else {
            this.mHost = null;
        }
    }

    public NavigateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5ee599d444a5435e2a1daed9f755121", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5ee599d444a5435e2a1daed9f755121");
        } else {
            this.mHost = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b9db8116e953be49b8228913df41bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b9db8116e953be49b8228913df41bc");
            return;
        }
        super.onFinishInflate();
        View findViewById = findViewById(R.id.refresh);
        View findViewById2 = findViewById(R.id.backward);
        View findViewById3 = findViewById(R.id.forward);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
    }

    public void setHost(NavigateBarHost navigateBarHost) {
        this.mHost = navigateBarHost;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5428beb0cd5cd25b8659e22e7add8c5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5428beb0cd5cd25b8659e22e7add8c5");
        } else if (this.mHost == null) {
        } else {
            int id = view.getId();
            if (id == R.id.forward) {
                this.mHost.navigateForward();
            } else if (id == R.id.backward) {
                this.mHost.navigateBackward();
            } else if (id == R.id.refresh) {
                this.mHost.navigateRefresh();
            }
        }
    }
}
