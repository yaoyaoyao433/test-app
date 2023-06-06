package com.sankuai.waimai.mach.component.indicator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IndicatorView extends FrameLayout {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    String c;
    a d;
    private BroadcastReceiver e;

    public IndicatorView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a811f5a28586f8cb71eef5c2f2b8d21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a811f5a28586f8cb71eef5c2f2b8d21");
        }
    }

    private IndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "780dd1ae5adc862d2d6dbfa38a913053", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "780dd1ae5adc862d2d6dbfa38a913053");
        }
    }

    public IndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c54957a6ea022b6c7ea2fe7a32ca8ea0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c54957a6ea022b6c7ea2fe7a32ca8ea0");
            return;
        }
        this.e = new BroadcastReceiver() { // from class: com.sankuai.waimai.mach.component.indicator.IndicatorView.1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "328cbab2ab7c2c6c95db56ae11073087", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "328cbab2ab7c2c6c95db56ae11073087");
                } else if (com.sankuai.waimai.mach.utils.c.a() && intent != null && !TextUtils.isEmpty(IndicatorView.this.c) && IndicatorView.this.c.equals(intent.getAction())) {
                    int a2 = f.a(intent, "index_key", 0);
                    if (IndicatorView.this.d != null) {
                        IndicatorView.this.d.a(a2);
                    }
                }
            }
        };
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23a3be066762ffe634292581dcb4e3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23a3be066762ffe634292581dcb4e3c1");
            return;
        }
        this.b = new RecyclerView(context);
        this.b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.b, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c8d8e3c3998b224858ece7b103c6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c8d8e3c3998b224858ece7b103c6d0");
            return;
        }
        super.onDetachedFromWindow();
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287500ae727b0acfed84504abdf7edee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287500ae727b0acfed84504abdf7edee");
            return;
        }
        super.onAttachedToWindow();
        if (TextUtils.isEmpty(this.c)) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.e, new IntentFilter(this.c));
    }
}
