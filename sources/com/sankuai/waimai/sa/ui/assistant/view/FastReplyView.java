package com.sankuai.waimai.sa.ui.assistant.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.router.activity.d;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.sa.model.f;
import com.sankuai.waimai.sa.model.n;
import com.sankuai.waimai.sa.ui.assistant.adapter.c;
import com.sankuai.waimai.sa.ui.assistant.chat.h;
import com.sankuai.waimai.sa.ui.assistant.chat.l;
import com.tencent.mapsdk.internal.y;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FastReplyView extends StatisticsRecyclerView {
    public static ChangeQuickRedirect a;
    private Context e;
    private f f;
    private String g;
    private l h;
    private c i;
    private LinearLayoutManager j;
    private ValueAnimator k;
    private int l;
    private h m;

    public FastReplyView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e050a77cb0bc6c4b6fcd5a69a5ace2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e050a77cb0bc6c4b6fcd5a69a5ace2");
            return;
        }
        this.e = context;
        c();
    }

    public FastReplyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580b22a73e606650132f2439427f4789", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580b22a73e606650132f2439427f4789");
            return;
        }
        this.e = context;
        c();
    }

    public FastReplyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52cd300e7c717a34d132d79f792c806", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52cd300e7c717a34d132d79f792c806");
            return;
        }
        this.e = context;
        c();
    }

    public void setSelectedListener(l lVar) {
        this.h = lVar;
    }

    public void setRemoveReplyListener(h hVar) {
        this.m = hVar;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5745020f2b232baef52a3a88d3268d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5745020f2b232baef52a3a88d3268d4");
            return;
        }
        this.l = g.a(getContext(), 45.0f);
        this.i = new c(this.l);
        this.j = new LinearLayoutManager(this.e, 0, false);
        setLayoutManager(this.j);
        a aVar = new a(this.e, 0, g.a(this.e, 5.0f), true);
        aVar.b = g.a(this.e, 15.0f);
        addItemDecoration(aVar);
        setOverScrollMode(2);
        a();
        setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74fb2a567dd7775e2785680deb7ded28", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74fb2a567dd7775e2785680deb7ded28");
                } else if (FastReplyView.this.f == null || com.sankuai.waimai.foundation.utils.b.b(FastReplyView.this.f.a) || FastReplyView.this.f.a.get(i).f == null || FastReplyView.this.f.a.get(i).k) {
                } else {
                    JudasManualManager.b("b_4zlm3ad0").a("intelligent_count", FastReplyView.this.f.a.size()).a("index", i).a("result_id", FastReplyView.this.g).a("intelligent_scene_id", FastReplyView.this.f.b).a("guide_infos_id", FastReplyView.this.f.a.get(i).f.b).a("template_type", FastReplyView.this.f.a.get(i).f.a).a("c_6tg6wz4r").a();
                    FastReplyView.this.f.a.get(i).k = true;
                }
            }

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e7569c46c9dbba0bcbc51518bdd7df0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e7569c46c9dbba0bcbc51518bdd7df0");
                } else if (FastReplyView.this.f == null || com.sankuai.waimai.foundation.utils.b.b(FastReplyView.this.f.a) || FastReplyView.this.f.a.get(i).f == null) {
                } else {
                    JudasManualManager.a("b_qr4d8bns").a("intelligent_doc", FastReplyView.this.f.a.get(i).a).a("index", i).a("result_id", FastReplyView.this.g).a("intelligent_scene_id", FastReplyView.this.f.b).a("guide_infos_id", FastReplyView.this.f.a.get(i).f.b).a("template_type", FastReplyView.this.f.a.get(i).f.a).a("c_6tg6wz4r").a();
                }
            }
        });
        setOnRecyclerViewItemClickListener(new StatisticsRecyclerView.a() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView.a
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a318921ec67fb2c58dd4c00e2a03ed2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a318921ec67fb2c58dd4c00e2a03ed2");
                } else if (FastReplyView.this.h == null || FastReplyView.this.f == null || FastReplyView.this.f.a == null || FastReplyView.this.f.a.size() <= i) {
                } else {
                    int i2 = FastReplyView.this.f.a.get(i).h;
                    if (1 == i2) {
                        Context context = FastReplyView.this.e;
                        String str = FastReplyView.this.f.a.get(i).d;
                        Object[] objArr3 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.shop.helper.a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e48c80035c36ac14951bc3c30c881fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e48c80035c36ac14951bc3c30c881fb");
                            return;
                        }
                        d dVar = new d() { // from class: com.sankuai.waimai.platform.shop.helper.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.router.activity.d
                            public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                                Object[] objArr4 = {jVar, intent};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b44b173682c2a2e1e257474fdb6af438", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b44b173682c2a2e1e257474fdb6af438")).booleanValue();
                                }
                                intent.addFlags(603979776);
                                jVar.c.startActivity(intent);
                                return true;
                            }
                        };
                        if (TextUtils.isEmpty(str)) {
                            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(context, com.sankuai.waimai.foundation.router.interfaces.c.b);
                        } else {
                            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(context, str);
                        }
                    } else if (2 == i2) {
                        String str2 = FastReplyView.this.f.a.get(i).d;
                        if (TextUtils.isEmpty(str2)) {
                            return;
                        }
                        com.sankuai.waimai.foundation.router.a.a(FastReplyView.this.e, str2);
                    } else {
                        FastReplyView.this.h.a(FastReplyView.this.f.a.get(i).b, FastReplyView.this.f.a.get(i).c);
                        if (FastReplyView.this.m != null) {
                            FastReplyView.this.m.a(FastReplyView.this);
                        }
                        List<Integer> list = FastReplyView.this.f.a.get(i).j;
                        if (com.sankuai.waimai.sa.util.a.a() || com.sankuai.waimai.foundation.utils.b.b(list) || !list.contains(1)) {
                            return;
                        }
                        final CustomDialog a2 = new CustomDialog.a(FastReplyView.this.e).a((RelativeLayout) LayoutInflater.from(FastReplyView.this.e).inflate(R.layout.wm_smart_assistant_alarm_clock_premission_check, (ViewGroup) null)).b(CustomDialog.d.CENTER).a(-1, -2).a();
                        ((LinearLayout) a2.findViewById(R.id.dialog_main_panel).getParent()).setBackgroundColor(0);
                        a2.show();
                        a2.findViewById(R.id.alarm_clock_premission_check_bg).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr4 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00011e50bdcaca8f24b6a9b2e30cb614", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00011e50bdcaca8f24b6a9b2e30cb614");
                                    return;
                                }
                                Context context2 = FastReplyView.this.e;
                                Object[] objArr5 = {context2};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.sa.util.a.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "fe9b4b99a8870d49fb770051afd274b4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "fe9b4b99a8870d49fb770051afd274b4");
                                } else {
                                    Intent intent = new Intent();
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                        intent.putExtra("android.provider.extra.APP_PACKAGE", com.meituan.android.singleton.b.a.getPackageName());
                                    } else if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26) {
                                        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                        intent.putExtra("app_package", com.meituan.android.singleton.b.a.getPackageName());
                                        intent.putExtra("app_uid", com.meituan.android.singleton.b.a.getApplicationInfo().uid);
                                    } else if (Build.VERSION.SDK_INT == 19) {
                                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        intent.addCategory("android.intent.category.DEFAULT");
                                        intent.setData(Uri.parse("package:" + com.meituan.android.singleton.b.a.getPackageName()));
                                    } else {
                                        intent.addFlags(y.a);
                                        if (Build.VERSION.SDK_INT >= 9) {
                                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                            intent.setData(Uri.fromParts("package", com.meituan.android.singleton.b.a.getPackageName(), null));
                                        } else if (Build.VERSION.SDK_INT <= 8) {
                                            intent.setAction("android.intent.action.VIEW");
                                            intent.setClassName("com.android.settings", "com.android.setting.InstalledAppDetails");
                                            intent.putExtra("com.android.settings.ApplicationPkgName", com.meituan.android.singleton.b.a.getPackageName());
                                        }
                                    }
                                    if (context2 != null) {
                                        context2.startActivity(intent);
                                    }
                                }
                                a2.dismiss();
                            }
                        });
                        a2.findViewById(R.id.alarm_clock_premission_check).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.2.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                Object[] objArr4 = {view2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e5f8057c59a9c10e1ca2539dfb2cf26c", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e5f8057c59a9c10e1ca2539dfb2cf26c");
                                } else {
                                    a2.dismiss();
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public final void a(com.sankuai.waimai.sa.model.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636695778fe43c2a90eef8447cbc8b19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636695778fe43c2a90eef8447cbc8b19");
        } else if (fVar == null || com.sankuai.waimai.foundation.utils.b.b(fVar.a) || (1 == fVar.a.size() && 1 == fVar.a.get(0).h)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f = fVar;
            this.g = str;
            this.i.b = fVar;
            a();
            setAdapter(this.i);
            b();
            if (fVar.c) {
                return;
            }
            d();
            fVar.c = true;
        }
    }

    public String getResultId() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // android.view.View
    public void setVisibility(int i) {
        int findLastVisibleItemPosition;
        char c = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fe12e642223a138819c25b2f000602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fe12e642223a138819c25b2f000602");
        } else if (i != 8 || this.i.getItemCount() <= 0 || (findLastVisibleItemPosition = this.j.findLastVisibleItemPosition()) < 0) {
            super.setVisibility(i);
            if (i == 0) {
                postDelayed(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e26bbc618db5e5cd29ae2adc146875f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e26bbc618db5e5cd29ae2adc146875f");
                        } else if (FastReplyView.this.f.d) {
                        } else {
                            FastReplyView.this.b();
                            FastReplyView.this.f.d = true;
                        }
                    }
                }, 300L);
            }
        } else {
            int i2 = 0;
            while (i2 <= findLastVisibleItemPosition) {
                final View childAt = this.j.getChildAt(i2);
                if (childAt != null) {
                    final ?? r13 = i2 == findLastVisibleItemPosition ? 1 : 0;
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = childAt;
                    objArr2[c] = Float.valueOf(1.0f);
                    objArr2[2] = Float.valueOf(0.0f);
                    objArr2[3] = Byte.valueOf((byte) r13);
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e04d7bb77bd44fefeeab945051aa2321", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e04d7bb77bd44fefeeab945051aa2321");
                    } else {
                        if (this.k == null) {
                            this.k = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(600L);
                        }
                        this.k.start();
                        this.k.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.4
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr3 = {animator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85bc25e339c135b711edb23167e376be", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85bc25e339c135b711edb23167e376be");
                                    return;
                                }
                                super.onAnimationEnd(animator);
                                FastReplyView.super.setVisibility(8);
                            }
                        });
                        this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.sa.ui.assistant.view.FastReplyView.5
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr3 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "839ba9e6ef1995c55ad936d2e81af216", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "839ba9e6ef1995c55ad936d2e81af216");
                                    return;
                                }
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                childAt.setAlpha(floatValue);
                                childAt.setScaleX(floatValue);
                                childAt.setScaleY(floatValue);
                                childAt.setPivotX(childAt.getMeasuredWidth() / 2);
                                childAt.setPivotY(childAt.getMeasuredHeight() / 2);
                                if (r13 && FastReplyView.this != null) {
                                    ViewGroup.LayoutParams layoutParams = FastReplyView.this.getLayoutParams();
                                    layoutParams.height = (int) (FastReplyView.this.l * floatValue);
                                    FastReplyView.this.setLayoutParams(layoutParams);
                                }
                            }
                        });
                    }
                }
                i2++;
                c = 1;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247e530ef6f1e6249a8ce5d2b0ea4c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247e530ef6f1e6249a8ce5d2b0ea4c1d");
            return;
        }
        super.onDetachedFromWindow();
        if (this.i != null && this.i.getItemCount() > 0) {
            for (int i = 0; i < this.i.getItemCount(); i++) {
                View childAt = this.j.getChildAt(i);
                if (childAt != null) {
                    childAt.clearAnimation();
                }
            }
        }
        clearAnimation();
        if (this.f != null) {
            this.f.e = true;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed389a2ef29d660588e379b1766a5ef2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed389a2ef29d660588e379b1766a5ef2");
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (this.f == null || this.f.a == null) {
            return;
        }
        for (int i = 0; i < this.f.a.size(); i++) {
            n nVar = this.f.a.get(i);
            if (nVar != null && nVar.f != null) {
                if (!TextUtils.isEmpty(nVar.f.b)) {
                    sb.append(nVar.f.b);
                }
                sb2.append(nVar.f.a);
                if (i < this.f.a.size() - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb2.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        String sb3 = sb.toString();
        JudasManualManager.b("b_8km2rlcd").a("intelligent_count", this.f.a.size()).a("result_id", this.g).a("intelligent_scene_id", this.f.b).a("guide_infos_id", sb3).a("template_type", sb2.toString()).a("c_6tg6wz4r").a();
    }
}
