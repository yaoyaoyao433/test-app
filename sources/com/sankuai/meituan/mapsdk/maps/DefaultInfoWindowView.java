package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DefaultInfoWindowView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView a;
    private TextView b;

    public DefaultInfoWindowView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e3be2cf97b8449cf9be2c5f79f8c77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e3be2cf97b8449cf9be2c5f79f8c77");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.mapsdk_default_info_window_view, this);
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.snippet);
    }

    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43a0bc55747ac50c1706c2f341933aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43a0bc55747ac50c1706c2f341933aad");
        } else if (TextUtils.isEmpty(charSequence)) {
            this.a.setText("");
        } else {
            this.a.setText(charSequence);
        }
    }

    public void setSnippet(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bf235369289aa139259fc47975a4656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bf235369289aa139259fc47975a4656");
        } else if (TextUtils.isEmpty(charSequence)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(charSequence);
        }
    }
}
