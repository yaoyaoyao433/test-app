package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    protected View b;
    protected View c;
    protected View d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    protected ImageView i;
    protected TextView j;
    protected String k;
    protected String l;
    protected long m;
    protected String n;
    protected String o;
    String p;
    protected int[] q;
    protected List<c.b> r;
    protected c.b s;
    protected j t;
    private String u;

    public void b() {
    }

    public a(@NonNull Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc54800c813ec07b1118fbcd48b395c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc54800c813ec07b1118fbcd48b395c");
            return;
        }
        this.n = "";
        switch (i) {
            case 1:
                this.u = "c_hgowsqb";
                return;
            case 2:
                this.u = "c_48pltlz";
                return;
            default:
                this.u = "";
                return;
        }
    }

    public final void a(j jVar) {
        this.t = jVar;
    }

    public final void a(List<c.b> list) {
        this.r = list;
    }

    public void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3662f2e7a3d9ce2d8b772ae4903d7e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3662f2e7a3d9ce2d8b772ae4903d7e8");
        } else if (bVar == null || com.sankuai.waimai.foundation.utils.d.a(bVar.f)) {
        } else {
            if (d(bVar) && this.h != null) {
                this.h.setText(this.y.getString(R.string.wm_order_question_feedback_submit));
            }
            if (this.h != null) {
                this.h.setEnabled(false);
            }
            this.q = b.c(bVar, this.r);
            this.s = bVar;
            b(bVar);
            c(bVar);
            bVar.k = System.currentTimeMillis();
            long j = bVar.a;
            int i = this.q[0];
            Object[] objArr2 = {new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a98ce1bc2909e0adc09929e8235e19a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a98ce1bc2909e0adc09929e8235e19a8");
                return;
            }
            JudasManualManager.a a2 = JudasManualManager.b("b_lwccbzx0").a(this.u).a("question_id", j).a("question_naire_type", this.o).a("question_type", this.s.d).a("order_id", this.l).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.m, this.n)).a("feedback_number", i).a("deal_id", this.s.h);
            a2.b = this.p;
            a2.a();
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3575886200048bc74202b8a3275d4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3575886200048bc74202b8a3275d4d");
            return;
        }
        this.b = view;
        this.b.setVisibility(0);
        this.g = (TextView) view.findViewById(R.id.questionnaireTitle);
        this.f = (TextView) view.findViewById(R.id.questionTitle);
        this.e = (TextView) view.findViewById(R.id.questionRank);
        this.j = (TextView) view.findViewById(R.id.poi_des);
        this.i = (ImageView) view.findViewById(R.id.poi_img);
        this.h = (TextView) view.findViewById(R.id.next_question_btn);
        if (this.h != null) {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f7ebce5ef458551f3f615d413ce0542", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f7ebce5ef458551f3f615d413ce0542");
                    } else {
                        a.this.a();
                    }
                }
            });
            this.h.setEnabled(false);
        }
        this.c = view.findViewById(R.id.order_feedback_close);
        this.c.setContentDescription("关闭");
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67c0dca246b6dfa45783351b69e004be", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67c0dca246b6dfa45783351b69e004be");
                } else if (a.this.t != null) {
                    a.this.t.a(1);
                }
            }
        });
        this.d = view.findViewById(R.id.relativeLayout);
        if (this.d != null) {
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c403b7daa96061c9f69feae65ec50164", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c403b7daa96061c9f69feae65ec50164");
                    } else if (a.this.t != null) {
                        a.this.t.a(2);
                    }
                }
            });
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37cd820f84a25ddca834e1c75dfb8df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37cd820f84a25ddca834e1c75dfb8df");
        } else {
            this.g.setText(str);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af4ed086cd0c23229c6ea56e8528abf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af4ed086cd0c23229c6ea56e8528abf");
        } else if (this.j != null) {
            this.j.setText(str);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caedab569708db48d79946d73ce3c274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caedab569708db48d79946d73ce3c274");
            return;
        }
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.b = f();
        c.c = str;
        c.j = R.drawable.wm_common_poi_default_icon;
        c.i = R.drawable.wm_common_poi_default_icon;
        c.a(this.i);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc67b04c9421bea7c17efe281b158a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc67b04c9421bea7c17efe281b158a11");
            return;
        }
        b();
        this.s.c = 1;
        this.s.e = this.k;
        long currentTimeMillis = System.currentTimeMillis() - this.s.k;
        long j = this.s.a;
        int i = this.q[0];
        String str = this.k;
        Object[] objArr2 = {new Long(j), Integer.valueOf(i), str, new Long(currentTimeMillis)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fac05968c262c6252410520e8ebe0e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fac05968c262c6252410520e8ebe0e25");
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_plg9ibno").a(this.u).a("question_id", j).a("question_naire_type", this.o).a("question_type", this.s.d).a("order_id", this.l).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.m, this.n)).a("feedback_number", i).a("feedback_choice", str).a("deal_id", this.s.h).a("feedback_duration", currentTimeMillis);
            a2.b = this.p;
            a2.a();
        }
        if (this.t != null) {
            this.t.a(this.s, this.k);
        }
    }

    public final void d(String str) {
        this.l = str;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580dd80ca9d1b96fce962dce68d9b3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580dd80ca9d1b96fce962dce68d9b3e4");
        } else {
            this.m = j;
        }
    }

    public final void e(String str) {
        this.n = str;
    }

    public final void f(String str) {
        this.o = str;
    }

    public void b(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00cfa0f81d9a060fa9dce9dcaebd7f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00cfa0f81d9a060fa9dce9dcaebd7f5b");
        } else if (this.e == null || this.t == null || !this.t.a()) {
        } else {
            if (this.r.size() > 1) {
                SpannableString spannableString = new SpannableString(String.format(Locale.CHINESE, "%d/%d", Integer.valueOf(this.q[0]), Integer.valueOf(this.q[1])));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#999999")), 1, 3, 17);
                this.e.setText(spannableString);
                return;
            }
            this.e.setText("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2fe5745227dd5becd85bc98e057289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2fe5745227dd5becd85bc98e057289");
        } else if (this.f == null || this.t == null || !this.t.a()) {
        } else {
            String str = bVar.b;
            if (bVar.d == 2) {
                SpannableString spannableString = new SpannableString(bVar.b + "(可多选)");
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#999999")), spannableString.length() + (-6), spannableString.length(), 17);
                str = spannableString;
            }
            this.f.setText(str);
        }
    }

    public final boolean d(c.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6ad7dca27e4effad1386497ebcf9af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6ad7dca27e4effad1386497ebcf9af")).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        if (com.sankuai.waimai.foundation.utils.b.a(bVar.f)) {
            Iterator<c.C0753c> it = bVar.f.iterator();
            while (it.hasNext()) {
                if (it.next().f != 0) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return bVar.j == 0 && z;
    }
}
