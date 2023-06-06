package com.meituan.android.legwork.ui.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InfoWindowMarker extends LinearLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private ImageView c;
    private TextView d;
    private View e;

    public InfoWindowMarker(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61934fd5e1e30219f9e906510720366", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61934fd5e1e30219f9e906510720366");
        } else {
            a(context);
        }
    }

    public InfoWindowMarker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7263dbda22e25520933ae0e1fdad010", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7263dbda22e25520933ae0e1fdad010");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ae7af710e48dba67b5bdff88c3a82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ae7af710e48dba67b5bdff88c3a82d");
            return;
        }
        setOrientation(1);
        setGravity(17);
        this.b = inflate(context, R.layout.legwork_send_map_window_info, this);
        this.c = (ImageView) this.b.findViewById(R.id.marker_icon);
        this.d = (TextView) this.b.findViewById(R.id.info_title);
        this.e = this.b.findViewById(R.id.info_container);
        setBackgroundColor(0);
    }

    public View getView() {
        return this.b;
    }

    public void setInfoTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de823a624907b906105043f8862ddfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de823a624907b906105043f8862ddfe");
        } else if (TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.d.setText(Html.fromHtml(str, null, new com.meituan.android.legwork.ui.util.b()));
        }
    }

    public void setInfoTitleAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fed0055f47be36baae18f7a9425a0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fed0055f47be36baae18f7a9425a0e1");
        } else {
            this.e.setAlpha(f);
        }
    }

    public void setIcon(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1dd493057e28e533e0dbfa354dfe23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1dd493057e28e533e0dbfa354dfe23");
        } else {
            this.c.setBackgroundResource(i);
        }
    }

    public void setIconVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054c1bbc26c89ad40168d6bf97051095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054c1bbc26c89ad40168d6bf97051095");
        } else {
            this.c.setVisibility(i);
        }
    }
}
