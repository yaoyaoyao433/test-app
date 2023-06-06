package com.sankuai.meituan.mapsdk.core.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ZoomControlView extends FrameLayout implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private ImageView c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void c();

        void d();
    }

    public ZoomControlView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea95fb593fa478613e6618cfa1ec898", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea95fb593fa478613e6618cfa1ec898");
        } else {
            a();
        }
    }

    public ZoomControlView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6cd631b7e8d359e0bd6099b150009d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6cd631b7e8d359e0bd6099b150009d");
        } else {
            a();
        }
    }

    public ZoomControlView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f6406607f8b1138ae207f8c7281bd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f6406607f8b1138ae207f8c7281bd6");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d5153dd859ddc05817c51ed045a0f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d5153dd859ddc05817c51ed045a0f8");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.mtmapsdk_zoom_control, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.img_zoom_in);
        this.c = (ImageView) findViewById(R.id.img_zoom_out);
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    public void setOnZoomListener(a aVar) {
        this.d = aVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3586bd982f432716186e93eca02d146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3586bd982f432716186e93eca02d146");
            return;
        }
        super.setEnabled(z);
        setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92bf4583daa48ce0e7509b1e54cfb8c9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92bf4583daa48ce0e7509b1e54cfb8c9");
        } else if (this.d == null) {
        } else {
            if (view == this.b) {
                this.d.c();
            } else if (view == this.c) {
                this.d.d();
            }
        }
    }
}
