package com.meituan.android.legwork.ui.jump;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.meituan.android.legwork.ui.base.b {
    public static ChangeQuickRedirect c;
    private ImageView d;
    private TextView e;

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean d() {
        return true;
    }

    public c(ToSendOneMoreActivity toSendOneMoreActivity) {
        super(toSendOneMoreActivity);
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9829bdff10f6685b650db409247c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9829bdff10f6685b650db409247c5f");
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(Bundle bundle) {
        View view;
        Uri data;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e061e0eae5776574e81d58b2f0f8c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e061e0eae5776574e81d58b2f0f8c6");
            return;
        }
        super.a(bundle);
        ToSendOneMoreActivity toSendOneMoreActivity = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9040ff26b71e321f42585676c5127060", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9040ff26b71e321f42585676c5127060");
        } else {
            LinearLayout linearLayout = new LinearLayout(this.b);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(0, com.meituan.android.legwork.utils.h.a(136), 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            linearLayout.setLayoutParams(layoutParams);
            this.d = new ImageView(this.b);
            this.d.setLayoutParams(new ViewGroup.LayoutParams(com.meituan.android.legwork.utils.h.a(200), com.meituan.android.legwork.utils.h.a((int) MapConstant.ANIMATION_DURATION_SHORT)));
            linearLayout.addView(this.d);
            this.e = new TextView(this.b);
            this.e.setTextSize(1, 14.0f);
            this.e.setTextColor(Color.parseColor("#666666"));
            this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.addView(this.e);
            view = linearLayout;
        }
        toSendOneMoreActivity.setContentView(view);
        this.b.a("页面出错");
        String str = "";
        Intent intent = this.b.getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getQueryParameter("pt_error_text");
        }
        if (TextUtils.isEmpty(str)) {
            str = "无法找到该页面";
        }
        this.e.setText(str);
        Picasso.g(this.b.getApplicationContext()).d("http://p0.meituan.net/scarlett/23fa23c1bfacdbd1044327c0408b864454885.png").a(this.d);
    }
}
