package com.dianping.shield.debug;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DebugNabviBarView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ImageView backView;
    private View.OnClickListener onBackClickListener;
    private View.OnClickListener onRightClickListener;
    private TextView rightView;
    private TextView titleView;

    public DebugNabviBarView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc25d2a06d8916fd70db52403a7fd6b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc25d2a06d8916fd70db52403a7fd6b6");
        }
    }

    public DebugNabviBarView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0e18f7fe7f9f1d37a89219c27e2d49e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0e18f7fe7f9f1d37a89219c27e2d49e");
        }
    }

    public DebugNabviBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457a01c99aef499cbcc8e24fbedcfd03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457a01c99aef499cbcc8e24fbedcfd03");
        } else {
            initView();
        }
    }

    public void setOnRightClickListener(View.OnClickListener onClickListener) {
        this.onRightClickListener = onClickListener;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.onBackClickListener = onClickListener;
    }

    public void setTitleView(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded8c0decd44a07ab0bbffd772d106d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded8c0decd44a07ab0bbffd772d106d2");
        } else {
            this.titleView.setText(str);
        }
    }

    public void setRightViewVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011d053c0d0ddc54d292903ac8edb235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011d053c0d0ddc54d292903ac8edb235");
        } else if (z) {
            this.rightView.setVisibility(0);
        } else {
            this.rightView.setVisibility(8);
        }
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b07bd4c0efaafc5beb7292a57f9100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b07bd4c0efaafc5beb7292a57f9100");
            return;
        }
        View inflate = inflate(getContext(), R.layout.shield_debug_title_layout, this);
        inflate.setBackgroundColor(ContextCompat.getColor(getContext(), 17170443));
        this.backView = (ImageView) inflate.findViewById(R.id.debug_backBtn);
        this.titleView = (TextView) inflate.findViewById(R.id.debug_title);
        this.rightView = (TextView) inflate.findViewById(R.id.debug_searchBtn);
        this.rightView.setVisibility(8);
        this.backView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugNabviBarView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d47c88c2490d1c568ef7f21b8792ad0b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d47c88c2490d1c568ef7f21b8792ad0b");
                } else if (DebugNabviBarView.this.onBackClickListener != null) {
                    DebugNabviBarView.this.onBackClickListener.onClick(view);
                }
            }
        });
        this.rightView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.DebugNabviBarView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4691209190f786627cdb7fbc16442e19", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4691209190f786627cdb7fbc16442e19");
                } else if (DebugNabviBarView.this.onRightClickListener != null) {
                    DebugNabviBarView.this.onRightClickListener.onClick(view);
                }
            }
        });
    }
}
