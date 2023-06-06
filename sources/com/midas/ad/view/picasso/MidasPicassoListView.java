package com.midas.ad.view.picasso;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.dianping.picasso.PicassoView;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.widget.view.d;
import com.midas.ad.feedback.event.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rx.subjects.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MidasPicassoListView extends LinearLayout implements com.midas.ad.view.a {
    public List<PicassoView> a;
    public String b;
    private Context c;
    private List<com.midas.ad.resource.model.a> d;
    private boolean e;
    private b f;
    private a g;
    private int h;
    private int i;
    private e j;
    private long k;
    private List<d[]> l;
    private List<String[]> m;
    private final String n;
    private int o;
    private c p;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        int a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        int a();
    }

    public View getView() {
        return this;
    }

    public void setmEventBus(e eVar) {
        this.j = eVar;
    }

    public void setScrollYListener(c cVar) {
        this.p = cVar;
    }

    public void setGerModuleViewPosi(a aVar) {
        this.g = aVar;
    }

    public void setiNotificationListener(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.midas.ad.resource.a.a();
    }

    public MidasPicassoListView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.e = true;
        this.h = 0;
        this.i = 0;
        this.k = 0L;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = "midasad";
        this.o = 0;
        this.b = "";
        a(context);
    }

    public MidasPicassoListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.e = true;
        this.h = 0;
        this.i = 0;
        this.k = 0L;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = "midasad";
        this.o = 0;
        this.b = "";
        a(context);
    }

    private void a(Context context) {
        this.c = context;
        setOrientation(1);
        this.k = System.currentTimeMillis();
    }

    @Override // com.midas.ad.view.a
    public final boolean a() {
        String[] strArr;
        Rect rect = new Rect();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            if (this.a.get(i).getGlobalVisibleRect(rect) && (strArr = this.d.get(i).a) != null) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (!TextUtils.isEmpty(strArr[i2])) {
                        PicassoView picassoView = this.a.get(i);
                        int a2 = this.p != null ? this.p.a() : 0;
                        int[] iArr = new int[2];
                        picassoView.getLocationOnScreen(iArr);
                        boolean z = iArr[1] + a2 <= picassoView.getContext().getResources().getDisplayMetrics().heightPixels;
                        arrayList.add(strArr[i2]);
                        arrayList2.add(Boolean.valueOf(z));
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            if (this.j != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!TextUtils.isEmpty((CharSequence) arrayList.get(i3))) {
                        arrayList3.add(((String) arrayList.get(i3)) + "&isFirstScreen=" + arrayList2.get(i3));
                    }
                }
                a.C0532a c0532a = new a.C0532a();
                c0532a.b = arrayList3;
                c0532a.a = 3;
                HashMap hashMap = new HashMap();
                hashMap.put(DMKeys.KEY_VIEW_TYPE, AgentConfigParser.PICASSO_PREFIX);
                c0532a.c = hashMap;
                if (this.g != null) {
                    c0532a.d = this.g.a();
                }
                this.j.onNext(new com.midas.ad.feedback.event.a("first_exposed", c0532a));
            } else {
                com.dianping.codelog.b.b(MidasPicassoListView.class, "mEventBus Exception act=3,slotid=" + this.b, "modulePosi=" + this.g.a());
            }
        }
        return false;
    }
}
