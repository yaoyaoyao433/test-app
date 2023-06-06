package com.meituan.android.ptcommonim.pageadapter.titlebar;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.PTSessionFragment;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.android.ptcommonim.pageadapter.titlebar.bean.TitleBarBean;
import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.android.singleton.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.n;
import com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTTitleBarAdapter extends DefaultTitleBarAdapter {
    public static ChangeQuickRedirect a;
    private PTFrameMachContainer b;
    private RelativeLayout o;
    private TextView p;
    private ImageView q;
    private LinearLayout r;
    private TitleBarBean s;
    private TextView t;
    private TextView u;
    private final Handler v;

    public boolean a() {
        return false;
    }

    public PTTitleBarAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578a6827b49c255e3ff39c6c5dd1376a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578a6827b49c255e3ff39c6c5dd1376a");
        } else {
            this.v = new Handler(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void b(PTTitleBarAdapter pTTitleBarAdapter, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, pTTitleBarAdapter, changeQuickRedirect, false, "37ae5bd35a46f004672ee24b837d0f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTTitleBarAdapter, changeQuickRedirect, false, "37ae5bd35a46f004672ee24b837d0f7f");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            pTTitleBarAdapter.v.post(c.a(pTTitleBarAdapter, list));
        } else if (!CollectionUtils.isEmpty(list)) {
            pTTitleBarAdapter.u.setVisibility(0);
            TextView textView = pTTitleBarAdapter.u;
            textView.setText(list.size() + "人");
        } else {
            pTTitleBarAdapter.u.setVisibility(8);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter, com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e6d3071c8226384ca2751ac66a93c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e6d3071c8226384ca2751ac66a93c3");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.ptim_titlebar_layout, viewGroup);
        this.b = (PTFrameMachContainer) inflate.findViewById(R.id.titlebar_mach_container);
        this.o = (RelativeLayout) inflate.findViewById(R.id.titlebar_native_container);
        this.p = (TextView) inflate.findViewById(R.id.titlebar_tv_title);
        this.q = (ImageView) inflate.findViewById(R.id.titlebar_iv_label);
        this.r = (LinearLayout) inflate.findViewById(R.id.titlebar_right_container);
        this.t = (TextView) inflate.findViewById(R.id.titlebar_tv_subtitle);
        this.u = (TextView) inflate.findViewById(R.id.titlebar_tv_subtitle2);
        View findViewById = inflate.findViewById(R.id.img_back);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12b62d80050e31bf8ab509b1c50971fb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12b62d80050e31bf8ab509b1c50971fb");
                    } else if (PTTitleBarAdapter.this.d != null) {
                        PTTitleBarAdapter.this.d.finish();
                    }
                }
            });
        }
        a(this.s);
        return inflate;
    }

    public final void a(TitleBarBean titleBarBean) {
        Object[] objArr = {titleBarBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c140c39f14a32cd71f518571053a4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c140c39f14a32cd71f518571053a4f");
            return;
        }
        this.s = titleBarBean;
        if (a() && this.b != null && titleBarBean.machDataMap != null && !titleBarBean.machDataMap.isEmpty() && titleBarBean.machInfo != null) {
            this.b.setVisibility(0);
            this.o.setVisibility(8);
            this.b.setMachProxy(a(this.d));
            this.b.setMachLoadCallback(a.a(this, titleBarBean));
            this.b.a(this.d, titleBarBean.machInfo, titleBarBean.machDataMap);
        } else if (this.p == null || titleBarBean == null) {
        } else {
            b(titleBarBean);
        }
    }

    public static /* synthetic */ void a(PTTitleBarAdapter pTTitleBarAdapter, TitleBarBean titleBarBean) {
        Object[] objArr = {pTTitleBarAdapter, titleBarBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b2d271fed70118149dd03daf490e7be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b2d271fed70118149dd03daf490e7be");
        } else {
            pTTitleBarAdapter.b(titleBarBean);
        }
    }

    private void b(TitleBarBean titleBarBean) {
        Object[] objArr = {titleBarBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828444a2f8b26f1808f1754af01267cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828444a2f8b26f1808f1754af01267cb");
            return;
        }
        Activity activity = this.d;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.b.setVisibility(8);
        this.o.setVisibility(0);
        this.p.setText(titleBarBean.mainTitle);
        if (TextUtils.isEmpty(titleBarBean.labelIconUrl)) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            g.a().d(com.meituan.android.base.util.b.a(titleBarBean.labelIconUrl)).a(this.q);
        }
        this.r.removeAllViews();
        if (!CollectionUtils.isEmpty(titleBarBean.rightIconList)) {
            ArrayList arrayList = new ArrayList();
            for (TitleBarBean.TitleIcon titleIcon : titleBarBean.rightIconList) {
                if (titleIcon != null) {
                    LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.ptim_titlebar_icon_item, (ViewGroup) this.r, false);
                    if (!TextUtils.isEmpty(titleIcon.imgUrl)) {
                        g.a().d(titleIcon.imgUrl).a((ImageView) linearLayout.findViewById(R.id.titlebar_icon_img));
                    } else {
                        ((ImageView) linearLayout.findViewById(R.id.titlebar_icon_img)).setImageResource(titleIcon.drawableId);
                    }
                    ((TextView) linearLayout.findViewById(R.id.titlebar_icon_text)).setText(titleIcon.title);
                    linearLayout.setOnClickListener(b.a(titleIcon, activity));
                    this.r.addView(linearLayout);
                    arrayList.add(titleIcon.title);
                }
            }
            f.a(activity, arrayList);
        }
        c(titleBarBean);
    }

    public static /* synthetic */ void a(TitleBarBean.TitleIcon titleIcon, Activity activity, View view) {
        Object[] objArr = {titleIcon, activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "138c164834e400a3e4daebf6c5400127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "138c164834e400a3e4daebf6c5400127");
        } else if (titleIcon == null || titleIcon.clickCallback == null) {
        } else {
            titleIcon.clickCallback.a(view);
            String str = titleIcon.title;
            Object[] objArr2 = {activity, str};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad3e4c097eef32405ad307757575f0ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad3e4c097eef32405ad307757575f0ae");
                return;
            }
            Map<String, Object> a2 = f.a(activity);
            a2.put("button_name", str);
            HashMap hashMap = new HashMap();
            hashMap.put("bid", "b_group_2v2sy456_mc");
            hashMap.put("button_name", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("c_group_hjkzttqg", hashMap);
            Statistics.getChannel("group").updateTag("group", hashMap2);
            Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_2v2sy456_mc", a2, "c_group_hjkzttqg");
        }
    }

    private void c(TitleBarBean titleBarBean) {
        Object[] objArr = {titleBarBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa8b97e0072cd4bfdc03aa8cdda3de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa8b97e0072cd4bfdc03aa8cdda3de4");
            return;
        }
        String str = titleBarBean.subTitle;
        String str2 = titleBarBean.subTitle2;
        if (this.t != null) {
            if (TextUtils.isEmpty(str)) {
                this.t.setVisibility(8);
            } else {
                this.t.setVisibility(0);
                this.t.setText(str);
            }
        }
        if (this.u != null) {
            if (TextUtils.isEmpty(str2)) {
                if (com.sankuai.xm.imui.b.a().e() == 2) {
                    Callback<List<GroupMember>> callback = new Callback<List<GroupMember>>() { // from class: com.meituan.android.ptcommonim.pageadapter.titlebar.PTTitleBarAdapter.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(List<GroupMember> list) {
                            List<GroupMember> list2 = list;
                            Object[] objArr2 = {list2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "471cd84cdbb8992070519c437805baed", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "471cd84cdbb8992070519c437805baed");
                            } else {
                                PTTitleBarAdapter.b(PTTitleBarAdapter.this, list2);
                            }
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i, String str3) {
                            Object[] objArr2 = {Integer.valueOf(i), str3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "213958b24a8c239c324c39fc5cb58c7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "213958b24a8c239c324c39fc5cb58c7c");
                            } else {
                                PTTitleBarAdapter.b(PTTitleBarAdapter.this, null);
                            }
                        }
                    };
                    try {
                        com.sankuai.xm.group.b bVar = (com.sankuai.xm.group.b) com.sankuai.xm.ui.a.a().a(com.sankuai.xm.group.b.class);
                        if (bVar != null) {
                            SessionFragment a2 = com.sankuai.xm.imui.session.b.a(this.u.getContext());
                            if (a2 instanceof PTSessionFragment) {
                                bVar.a(((PTSessionFragment) a2).i(), true, callback);
                                return;
                            } else {
                                this.u.setVisibility(8);
                                return;
                            }
                        }
                        return;
                    } catch (n unused) {
                        return;
                    }
                }
                this.u.setVisibility(8);
                return;
            }
            this.u.setVisibility(0);
            this.u.setText(str2);
        }
    }

    public static /* synthetic */ void a(PTTitleBarAdapter pTTitleBarAdapter, List list) {
        Object[] objArr = {pTTitleBarAdapter, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "468a3d1740fbc942c52e51139428d49d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "468a3d1740fbc942c52e51139428d49d");
        } else if (!CollectionUtils.isEmpty(list)) {
            pTTitleBarAdapter.u.setVisibility(0);
            TextView textView = pTTitleBarAdapter.u;
            textView.setText(list.size() + "人");
        } else {
            pTTitleBarAdapter.u.setVisibility(8);
        }
    }

    private final com.meituan.android.ptcommonim.pageadapter.message.mach.f a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7efecac7759a85511a54952b50c0208", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.ptcommonim.pageadapter.message.mach.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7efecac7759a85511a54952b50c0208");
        }
        f.a aVar = new f.a();
        aVar.a(new com.meituan.android.ptcommonim.base.mach.a());
        aVar.a(context);
        aVar.d = new com.meituan.android.ptcommonim.pageadapter.message.mach.a(context);
        aVar.a(new com.meituan.android.ptcommonim.bridge.b(context));
        return aVar.b(context);
    }
}
