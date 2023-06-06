package com.meituan.android.legwork.ui.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AoiPointMarker extends LinearLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;
    private int d;

    public AoiPointMarker(Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e0c1b64bf7446a026476498a14b32c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e0c1b64bf7446a026476498a14b32c4");
            return;
        }
        this.d = 0;
        this.d = i;
        a(context);
    }

    public AoiPointMarker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedc1da87f3492cab2079be376158763", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedc1da87f3492cab2079be376158763");
            return;
        }
        this.d = 0;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33b3e5940c31b642764c41b09a74bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33b3e5940c31b642764c41b09a74bd5");
            return;
        }
        setOrientation(0);
        this.b = inflate(context, R.layout.legwork_poi_confirm_aoi_point_marker_left, this);
        this.c = (TextView) this.b.findViewById(R.id.address);
        setBackgroundColor(0);
    }

    public View getView() {
        return this.b;
    }

    public void setAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5922d3701aa740b43f7942471c52a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5922d3701aa740b43f7942471c52a46");
        } else if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(str);
            this.c.setVisibility(0);
        }
    }
}
