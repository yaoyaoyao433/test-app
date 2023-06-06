package com.meituan.android.edfu.mvex.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LightButton extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Context b;
    private ImageView c;
    private TextView d;

    public LightButton(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886ac2adb37daff1a9150f3a9f32ede1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886ac2adb37daff1a9150f3a9f32ede1");
        } else {
            a(context);
        }
    }

    public LightButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96855bdba5deb7cc90750040bcaa59f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96855bdba5deb7cc90750040bcaa59f2");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e5d4af8b79b8cc96300bcda52f2cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e5d4af8b79b8cc96300bcda52f2cd0");
            return;
        }
        this.b = context;
        LayoutInflater.from(getContext()).inflate(R.layout.layout_light_button, (ViewGroup) this, true);
        this.c = (ImageView) findViewById(R.id.image_light);
        this.d = (TextView) findViewById(R.id.text_light);
    }

    public void setLightState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d165365b1093079928ec5f9f274781fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d165365b1093079928ec5f9f274781fc");
            return;
        }
        this.c.setSelected(z);
        this.d.setText(z ? this.b.getString(R.string.mvex_light_close) : this.b.getString(R.string.mvex_light_open));
    }
}
