package com.meituan.android.ptcommonim.pageadapter.message.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PTIMMachRootView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public PTIMMachViewGroup b;
    public com.meituan.android.ptcommonim.pageadapter.message.item.b c;
    private LinearLayout d;
    private View.OnClickListener e;

    public static PTIMMachRootView a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae896f7a0d330553f5d1a0b26f03f94d", RobustBitConfig.DEFAULT_VALUE) ? (PTIMMachRootView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae896f7a0d330553f5d1a0b26f03f94d") : (PTIMMachRootView) LayoutInflater.from(context).inflate(R.layout.ptim_general_msg_mach_root_layout, viewGroup, false);
    }

    public PTIMMachRootView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d714b7af0eefa271ced2f7c4e1242b54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d714b7af0eefa271ced2f7c4e1242b54");
        }
    }

    public PTIMMachRootView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a41b17dca40ce18d0e3a940d1b5dfb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a41b17dca40ce18d0e3a940d1b5dfb");
        }
    }

    public PTIMMachRootView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296c913621fec7f99024c5d4285f31d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296c913621fec7f99024c5d4285f31d1");
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65b4c912009d87c27b1fb1274fa89fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65b4c912009d87c27b1fb1274fa89fb");
            return;
        }
        super.onFinishInflate();
        this.d = (LinearLayout) findViewById(R.id.general_item_retry_container);
        this.b = (PTIMMachViewGroup) findViewById(R.id.general_item_mach_container);
        this.d.setOnClickListener(b.a(this));
    }

    public static /* synthetic */ void a(PTIMMachRootView pTIMMachRootView, View view) {
        Object[] objArr = {pTIMMachRootView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77d124c670b828185041e1d0bc02acbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77d124c670b828185041e1d0bc02acbb");
        } else if (pTIMMachRootView.e != null) {
            pTIMMachRootView.e.onClick(view);
        }
    }

    public final com.meituan.android.ptcommonim.pageadapter.message.item.b getMachIMItem() {
        return this.c;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c120b8f3132cae7230563d4b925e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c120b8f3132cae7230563d4b925e32");
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public final MachViewGroup getMachContainer() {
        return this.b;
    }

    public final void setRetryListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5945e91e2e91ef171401adc5f8b2d2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5945e91e2e91ef171401adc5f8b2d2b");
            return;
        }
        switch (i) {
            case -1:
                this.d.setVisibility(0);
                this.b.setVisibility(8);
                return;
            case 0:
                this.d.setVisibility(8);
                this.b.setVisibility(0);
                return;
            default:
                return;
        }
    }
}
