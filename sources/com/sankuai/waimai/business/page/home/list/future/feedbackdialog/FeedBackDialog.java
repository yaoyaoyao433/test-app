package com.sankuai.waimai.business.page.home.list.future.feedbackdialog;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackDialog extends DialogFragment {
    public static ChangeQuickRedirect a;
    public int b;
    public Long c;
    public String d;
    public String e;
    public String f;
    private b g;
    private com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a h;
    private TextView i;
    private a j;
    private View k;
    private FrameLayout l;
    private d m;
    private RecyclerView n;

    public static /* synthetic */ void d(FeedBackDialog feedBackDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, feedBackDialog, changeQuickRedirect, false, "0d716665be8d52febb70d423e238298b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, feedBackDialog, changeQuickRedirect, false, "0d716665be8d52febb70d423e238298b");
        } else {
            feedBackDialog.l.setVisibility(8);
        }
    }

    public static /* synthetic */ void e(FeedBackDialog feedBackDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, feedBackDialog, changeQuickRedirect, false, "982c384d4940907e503a5eb8a9e1540e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, feedBackDialog, changeQuickRedirect, false, "982c384d4940907e503a5eb8a9e1540e");
        } else {
            feedBackDialog.l.setVisibility(0);
        }
    }

    public static /* synthetic */ void f(FeedBackDialog feedBackDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, feedBackDialog, changeQuickRedirect, false, "1135d2b7d3ef1cc64abcac0c8fb39182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, feedBackDialog, changeQuickRedirect, false, "1135d2b7d3ef1cc64abcac0c8fb39182");
        } else if (feedBackDialog.m.j()) {
            feedBackDialog.m.h();
        }
    }

    public static /* synthetic */ void g(FeedBackDialog feedBackDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, feedBackDialog, changeQuickRedirect, false, "84b8678a8cf2ae3bfce63dbef2f7ca0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, feedBackDialog, changeQuickRedirect, false, "84b8678a8cf2ae3bfce63dbef2f7ca0d");
        } else {
            feedBackDialog.m.g();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00655d09e9611e00724e432f4ce3538e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00655d09e9611e00724e432f4ce3538e");
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.FullScreenDialog);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "953c9a3290146bc196ae84ab2cca366c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "953c9a3290146bc196ae84ab2cca366c");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cff8993d303ac9385d77c4dedb0bc2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cff8993d303ac9385d77c4dedb0bc2e");
        }
        this.k = layoutInflater.inflate(R.layout.wm_page_home_feedback_dialog, viewGroup, false);
        return this.k;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65059d3bcb4bf80ea1551fefbf5b70f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65059d3bcb4bf80ea1551fefbf5b70f");
            return;
        }
        super.onActivityCreated(bundle);
        this.j = new a(getActivity());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e79c3b878d5826cd6c83688a70af6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e79c3b878d5826cd6c83688a70af6fb");
        } else {
            this.i = (TextView) this.k.findViewById(R.id.tv_question_submit);
            this.i.setEnabled(true);
            this.h = new com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a(this.j, (ViewStub) this.k.findViewById(R.id.fb_listview));
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dafd39579d1a716eb1bf112e6e33f515", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dafd39579d1a716eb1bf112e6e33f515");
            } else {
                this.g = new b(this.h);
                this.n = (RecyclerView) this.h.i();
                this.h.y = this.g;
                this.g.a((View) this.n);
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                this.g.c = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                this.g.d = new b.a() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b.a
                    public final void a(int i, Rect rect) {
                        Object[] objArr4 = {Integer.valueOf(i), rect};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8fbe301044e6c4cd872f29d1cde46869", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8fbe301044e6c4cd872f29d1cde46869");
                            return;
                        }
                        com.meituan.android.cube.pga.block.a b = FeedBackDialog.this.h.b(i);
                        if (b != null) {
                            b.a(rect);
                        }
                    }
                };
            }
            this.k.setPadding(0, g.e(com.meituan.android.singleton.b.a), 0, 0);
            this.l = (FrameLayout) this.k.findViewById(R.id.fl_area_loading);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bb52f7754f92032b67821527f2e41640", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bb52f7754f92032b67821527f2e41640");
                    }
                }
            });
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa2a72111814549b2e4d7f9cb9c3ec83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa2a72111814549b2e4d7f9cb9c3ec83");
        } else if (getDialog() != null && getDialog().getWindow() != null) {
            ae.a(getDialog().getWindow());
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getDialog().getWindow().setLayout(-1, -1);
            if (Build.VERSION.SDK_INT >= 23) {
                getDialog().getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "00dea1d9b9533b18f4d38f611b68c424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "00dea1d9b9533b18f4d38f611b68c424");
        } else {
            this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "edc5a04e580edc1d6d5a75d28e663774", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "edc5a04e580edc1d6d5a75d28e663774");
                        return;
                    }
                    FeedBackDialog.this.j.F.a((com.meituan.android.cube.pga.common.b<Void>) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(FeedBackDialog.this.c);
                    String sb2 = sb.toString();
                    FragmentActivity activity = FeedBackDialog.this.getActivity();
                    Object[] objArr7 = {sb2, "1", activity};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "457b23a150c4f8655bfeed517564074a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "457b23a150c4f8655bfeed517564074a");
                    } else {
                        JudasManualManager.a("b_waimai_8x87bzzm_mc").a(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.b).a(activity).a("survey_id", sb2).a("survey_type", "1").a();
                    }
                }
            });
            this.j.J.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "806aaa8197b69f8c6d675ac3d77b4851", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "806aaa8197b69f8c6d675ac3d77b4851");
                    } else {
                        FeedBackDialog.this.m.c(R.string.wm_page_poiList_footer_more);
                    }
                }
            });
            this.j.H.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "70f22e1ede13373920b7875aa5733fb2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "70f22e1ede13373920b7875aa5733fb2");
                    } else {
                        FeedBackDialog.d(FeedBackDialog.this);
                    }
                }
            });
            this.j.O.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5f7971f2243ea8109bd39d822ef3fee7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5f7971f2243ea8109bd39d822ef3fee7");
                    } else {
                        FeedBackDialog.this.dismiss();
                    }
                }
            });
            this.j.I.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b9ecffefac51f446032ac730b3f4d89a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b9ecffefac51f446032ac730b3f4d89a");
                    } else {
                        FeedBackDialog.e(FeedBackDialog.this);
                    }
                }
            });
            this.j.K.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b527979923d7ac6e35869ceb9488964c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b527979923d7ac6e35869ceb9488964c");
                    } else {
                        FeedBackDialog.f(FeedBackDialog.this);
                    }
                }
            });
            this.j.L.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr6 = {r11};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "dde477a3adfc641383fc5ab501ba6ed9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "dde477a3adfc641383fc5ab501ba6ed9");
                    } else {
                        FeedBackDialog.g(FeedBackDialog.this);
                    }
                }
            });
            this.k.findViewById(R.id.action_bar_roo_back).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e9e67163c233a0edb7ba1b439b1ab1be", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e9e67163c233a0edb7ba1b439b1ab1be");
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(FeedBackDialog.this.c);
                    String sb2 = sb.toString();
                    FragmentActivity activity = FeedBackDialog.this.getActivity();
                    Object[] objArr7 = {sb2, "1", activity};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "58ef36d1736c161cf7c3e95c33cb8c03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "58ef36d1736c161cf7c3e95c33cb8c03");
                    } else {
                        JudasManualManager.a("b_waimai_vl9qh3qt_mc").a(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.b).a(activity).a("survey_id", sb2).a("survey_type", "1").a();
                    }
                    FeedBackDialog.this.dismiss();
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "954a106179627536c7c911bdc10d2782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "954a106179627536c7c911bdc10d2782");
        } else {
            this.m = new d(this.k, (int) R.id.layout_refresh_global);
            this.m.a("c_i5kxn8l");
            this.m.c(R.string.wm_page_poiList_footer_more);
            this.m.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c9ea3384550c5cd863d76c2c200e08b0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c9ea3384550c5cd863d76c2c200e08b0");
                        return;
                    }
                    FeedBackDialog.this.m.c(R.string.wm_page_poiList_footer_more);
                    FeedBackDialog.this.j.M.a((com.meituan.android.cube.pga.common.b<Void>) null);
                }
            });
        }
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a aVar = this.h;
        int i = this.b;
        Long l = this.c;
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        Object[] objArr7 = {Integer.valueOf(i), l, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.s;
        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "343932bc38bdf99bbe130c390726c04d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "343932bc38bdf99bbe130c390726c04d");
            return;
        }
        aVar.w = str3;
        aVar.t = l.longValue();
        aVar.u = str;
        aVar.v = str2;
        aVar.x = i;
        aVar.a(l.longValue(), i);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88922fc5d1d244ab304d40ccfd0766df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88922fc5d1d244ab304d40ccfd0766df");
            return;
        }
        super.onDismiss(dialogInterface);
        this.j.G.a((com.meituan.android.cube.pga.common.b<Void>) null);
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
        ae.a();
    }

    public <T> T a(Map<String, Object> map, String str, Class<T> cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fe160a8a0f0074213459302e94b392", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fe160a8a0f0074213459302e94b392");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if ((obj instanceof Number) || (obj instanceof String)) {
            return cls.cast(map.get(str));
        }
        return null;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7150e0cb05d8be7e77d81791ec825500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7150e0cb05d8be7e77d81791ec825500");
            return;
        }
        super.onResume();
        if (this.h != null) {
            this.h.P();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683da54644b6fafea979e416c56fee4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683da54644b6fafea979e416c56fee4e");
        } else {
            super.onPause();
        }
    }
}
