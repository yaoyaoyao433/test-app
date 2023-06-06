package com.meituan.android.customerservice.callkefuuisdk.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.customerservice.callbase.utils.CallBaseUtil;
import com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.cscallsdk.e;
import com.meituan.android.customerservice.kit.floating.b;
import com.meituan.android.customerservice.kit.widget.BaseFloatView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends BaseFloatView implements d.a, e.a {
    public static ChangeQuickRedirect a;
    private d e;
    private ImageView f;
    private TextView g;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f5e92d0dd632a49605b3eacdc780edb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f5e92d0dd632a49605b3eacdc780edb");
            return;
        }
        this.f = (ImageView) findViewById(R.id.iv_float);
        this.g = (TextView) findViewById(R.id.time_text);
        this.f.setImageResource(R.drawable.cs_voip_layer_online);
        this.g.setTextColor(ContextCompat.getColor(context, R.color.cs_voip_floating_text));
        this.e = d.j();
        this.e.g().a(this);
        this.e.a(this);
    }

    @Override // com.meituan.android.customerservice.kit.widget.BaseFloatView
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29345ffd72540f727826447d54e968d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29345ffd72540f727826447d54e968d8");
        } else if (this.e.g().d() == 3) {
            getTimeView().setText(CallBaseUtil.formatDuration(i));
        }
    }

    @Override // com.meituan.android.customerservice.kit.widget.BaseFloatView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4701016db624f7bb73d067909112e0cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4701016db624f7bb73d067909112e0cf");
            return;
        }
        final int d = this.e.g().d();
        final long f = this.e.g().f();
        a(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.widget.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1b8077bce635482a95415143562da3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1b8077bce635482a95415143562da3f");
                    return;
                }
                int i = d;
                if (i != 3) {
                    switch (i) {
                        case 0:
                        case 1:
                            if (a.this.e.g().g()) {
                                a.this.getTimeView().setText(R.string.cs_voip_call_ring_tip);
                                return;
                            } else {
                                a.this.getTimeView().setText(R.string.cs_voip_call_wait);
                                return;
                            }
                        default:
                            return;
                    }
                }
                a aVar = a.this;
                long j = f;
                Object[] objArr3 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = BaseFloatView.b;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "88dbc3c0c8d571d6b1b8b5cc79190836", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "88dbc3c0c8d571d6b1b8b5cc79190836");
                } else {
                    aVar.getTalkingTimekeeper().a(j);
                }
            }
        });
    }

    @Override // com.meituan.android.customerservice.kit.widget.BaseFloatView
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dc49abdf883ed353b0f97c27f4e884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dc49abdf883ed353b0f97c27f4e884");
            return;
        }
        c();
        Intent intent = new Intent(getContext(), CallKFActivity.class);
        intent.setFlags(y.a);
        intent.putExtra("form_tip", true);
        try {
            PendingIntent.getActivity(getContext(), 0, intent, 0).send();
        } catch (Exception unused) {
            getContext().startActivity(intent);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.e.a
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075e9a734f8f78908ca28a7fd88463ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075e9a734f8f78908ca28a7fd88463ce");
            return;
        }
        a();
        if (i2 == 0) {
            a(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.widget.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "696b8c9c7b1ec9c5910467434f4900f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "696b8c9c7b1ec9c5910467434f4900f1");
                    } else {
                        a.this.getTimeView().setText(R.string.cs_voip_call_end);
                    }
                }
            });
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "099eb0e566f7f6e115ded185fbedff88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "099eb0e566f7f6e115ded185fbedff88");
                return;
            }
            setClickable(false);
            this.c.postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.widget.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b9d9f6151cf88ec5e12af991a9d4c1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b9d9f6151cf88ec5e12af991a9d4c1a");
                    } else {
                        a.this.c();
                    }
                }
            }, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66589d07b42e126489501b625913fc48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66589d07b42e126489501b625913fc48");
            return;
        }
        this.e.g().b(this);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44044cf831d13dffa2711d381b35ce5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44044cf831d13dffa2711d381b35ce5d");
            return;
        }
        this.e.g().b(this);
        this.e.b(this);
        b.a().a("call_kf");
    }

    public final void setFloatImgRes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc68e0c7b15988d422a281f51909a113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc68e0c7b15988d422a281f51909a113");
        } else {
            this.f.setImageResource(i);
        }
    }

    public final void setTimeTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447321228d9edfd7904e2676a875ac3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447321228d9edfd7904e2676a875ac3a");
        } else {
            this.g.setTextColor(i);
        }
    }

    @Override // com.meituan.android.customerservice.cscallsdk.d.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17afb6e0924201239821e835edace0cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17afb6e0924201239821e835edace0cc");
        } else {
            a(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.widget.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5f27a7400859b18b3f6fc80108e0507", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5f27a7400859b18b3f6fc80108e0507");
                    } else {
                        a.this.getTimeView().setText(R.string.cs_voip_call_ring_tip);
                    }
                }
            });
        }
    }
}
