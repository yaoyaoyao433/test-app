package com.meituan.mmp.lib.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoadingIndicator extends FrameLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private ImageView c;
    private TextView d;
    private c e;
    private boolean f;

    public LoadingIndicator(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7be8a6982b2183f22ded67ee080509", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7be8a6982b2183f22ded67ee080509");
        } else {
            a(context);
        }
    }

    public LoadingIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a63599e22b1f626e79e2b49f6f1a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a63599e22b1f626e79e2b49f6f1a3e");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3807515104540649d082d4f742109ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3807515104540649d082d4f742109ee");
            return;
        }
        this.b = LayoutInflater.from(context).inflate(R.layout.hera_loading_indicator, this);
        this.c = (ImageView) findViewById(R.id.indicator_top_icon);
        this.d = (TextView) findViewById(R.id.indicator_title);
        this.e = new c();
        ((ImageView) findViewById(R.id.indicator_image)).setImageDrawable(this.e);
    }

    public void setTopIcon(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6434dbda40800a19ffd623d24fd42a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6434dbda40800a19ffd623d24fd42a1d");
            return;
        }
        this.c.setImageDrawable(drawable);
        this.c.setVisibility(0);
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709728e7110569423880b5306ce6fedc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709728e7110569423880b5306ce6fedc");
            return;
        }
        this.d.setText(str);
        this.d.setVisibility(0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a80f236dbcdaf8b25cdb59f3f7d750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a80f236dbcdaf8b25cdb59f3f7d750");
        } else if (i == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b58fd5df90705c7235782a55e78acdc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b58fd5df90705c7235782a55e78acdc");
            } else if (this.f) {
            } else {
                setVisibility(0);
                this.e.start();
                this.f = true;
            }
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7b0da8558239557d7f17dfe2570231e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7b0da8558239557d7f17dfe2570231e");
            } else if (this.f) {
                this.f = false;
                setVisibility(8);
                this.e.stop();
            }
        }
    }
}
