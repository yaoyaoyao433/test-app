package com.dianping.live.status;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.live.status.c;
import com.dianping.util.j;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.dianping.live.live.livefloat.c {
    public static ChangeQuickRedirect a;
    private c b;
    private WindowManager.LayoutParams c;
    private WindowManager d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private View.OnTouchListener l;

    public static /* synthetic */ void e(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "67f81b00a767de5edb310b5dbe2db087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "67f81b00a767de5edb310b5dbe2db087");
            return;
        }
        aVar.c.x = (int) (aVar.e - aVar.i);
        aVar.c.y = (int) (aVar.f - aVar.j);
        aVar.c.windowAnimations = 0;
        aVar.d.updateViewLayout(aVar, aVar.c);
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4ce85330b441dd0942024581e29690", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4ce85330b441dd0942024581e29690");
            return;
        }
        this.l = new View.OnTouchListener() { // from class: com.dianping.live.status.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82d412bdfe7b53d229a08cfd00edcc2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82d412bdfe7b53d229a08cfd00edcc2")).booleanValue();
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        a.this.i = motionEvent.getX();
                        a.this.j = motionEvent.getY();
                        a.this.g = motionEvent.getRawX();
                        a.this.h = motionEvent.getRawY() - a.this.getStatusBarHeight();
                        a.this.e = motionEvent.getRawX();
                        a.this.f = motionEvent.getRawY() - a.this.getStatusBarHeight();
                        break;
                    case 1:
                        if (Math.abs(a.this.g - a.this.e) < 5.0f && Math.abs(a.this.h - a.this.f) < 5.0f) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a.this.b.i).buildUpon().build());
                            if (!(a.this.getContext() instanceof Activity)) {
                                intent.addFlags(y.a);
                            }
                            intent.addFlags(67108864);
                            a.this.getContext().startActivity(intent);
                            HashMap hashMap = new HashMap();
                            hashMap.put("buid", a.this.b.h);
                            hashMap.put("businessfigure", a.this.b.b);
                            hashMap.put("businessid", a.this.b.c);
                            hashMap.put("page_from", a.this.b.d);
                            hashMap.put("zhibo_id", Long.valueOf(a.this.b.j));
                            Statistics.getChannel("live").writeModelClick(AppUtil.generatePageInfoKey(this), "b_live_focpdvoq_mc", hashMap, "c_live_hvoqz7op");
                            break;
                        }
                        break;
                    case 2:
                        float rawX = motionEvent.getRawX() - a.this.i;
                        float rawY = motionEvent.getRawY() - a.this.j;
                        if (a.this.b.g == null || (rawX >= j.a(a.this.getContext(), a.this.b.g.a) && rawX + j.a(a.this.getContext(), a.this.b.e.d) <= j.a(a.this.getContext(), a.this.b.g.b))) {
                            a.this.e = motionEvent.getRawX();
                        }
                        if (a.this.b.g == null || (rawY >= j.a(a.this.getContext(), a.this.b.g.c) && rawY + j.a(a.this.getContext(), a.this.b.e.c) <= j.a(a.this.getContext(), a.this.b.g.d))) {
                            a.this.f = motionEvent.getRawY() - a.this.getStatusBarHeight();
                        }
                        a.e(a.this);
                        break;
                }
                return true;
            }
        };
        this.d = (WindowManager) context.getSystemService("window");
        setOnTouchListener(this.l);
    }

    public final void a(c cVar, WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {cVar, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811df8d1abcdaccb39c15f0167ff6bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811df8d1abcdaccb39c15f0167ff6bbd");
            return;
        }
        this.c = layoutParams;
        this.b = cVar;
        if (cVar.e.e != null) {
            a(cVar.e.e.a, cVar.e.e.b, cVar.e.e.c, cVar.e.e.d);
        }
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49e811ad856b2b5f922168c017c775ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49e811ad856b2b5f922168c017c775ac");
            return;
        }
        ArrayList<c.C0090c> arrayList = cVar.f;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<c.C0090c> it = arrayList.iterator();
        while (it.hasNext()) {
            c.C0090c next = it.next();
            Object[] objArr3 = {next, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab3f562bfb5d2f539f908a56089d3884", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab3f562bfb5d2f539f908a56089d3884");
            } else if (next != null && next.e != null) {
                final String str = next.e;
                ImageView imageView = new ImageView(getContext());
                Picasso.g(imageView.getContext()).d(str).a(imageView, new Callback() { // from class: com.dianping.live.status.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Callback
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6f76d43d2f1d8047fec07f4a28bee3ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6f76d43d2f1d8047fec07f4a28bee3ee");
                            return;
                        }
                        com.dianping.live.live.utils.j.a("MLive_LoganshowMLiveStatusWidget 图片展示成功 " + str);
                        Sniffer.normal("group_mlive", "mLive_status_widget_picture", "success", "图片地址：" + str, a.this.b.a());
                    }

                    @Override // com.squareup.picasso.Callback
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2120c02ca137f7f99e9c48283bff2d29", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2120c02ca137f7f99e9c48283bff2d29");
                            return;
                        }
                        com.dianping.live.live.utils.j.a("MLive_LoganshowMLiveStatusWidget 图片展示失败 " + str);
                        Sniffer.smell("group_mlive", "mLive_status_widget_picture", "fail", "", "图片地址：" + str, a.this.b.a());
                    }
                });
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(5, 5);
                layoutParams2.leftMargin = j.a(getContext(), next.a);
                layoutParams2.topMargin = j.a(getContext(), next.b);
                layoutParams2.width = j.a(getContext(), next.c);
                layoutParams2.height = j.a(getContext(), next.d);
                imageView.setLayoutParams(layoutParams2);
                addView(imageView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getStatusBarHeight() {
        Resources system;
        int identifier;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53b70d1a4e43cb6453d5804beb21a570", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53b70d1a4e43cb6453d5804beb21a570")).intValue();
        }
        if (this.k == 0 && (identifier = (system = Resources.getSystem()).getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            this.k = system.getDimensionPixelSize(identifier);
        }
        return this.k;
    }
}
