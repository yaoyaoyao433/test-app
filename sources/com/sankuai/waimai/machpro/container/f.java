package com.sankuai.waimai.machpro.container;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.container.d
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e56e752fffffcb290876c1c16987e85", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e56e752fffffcb290876c1c16987e85");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        TextView textView = new TextView(context);
        textView.setText("加载中...");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        return frameLayout;
    }

    @Override // com.sankuai.waimai.machpro.container.d
    public final View a(Context context, final a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22918f76017bee1442e3ab70e91a5a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22918f76017bee1442e3ab70e91a5a2");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        TextView textView = new TextView(context);
        textView.setText("加载失败，点击重试!!!");
        textView.setPadding(20, 20, 20, 20);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.machpro.container.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c896a94d47e3a65a6531408ee4c3341", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c896a94d47e3a65a6531408ee4c3341");
                } else if (aVar != null) {
                    aVar.b();
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(textView, layoutParams);
        return frameLayout;
    }
}
