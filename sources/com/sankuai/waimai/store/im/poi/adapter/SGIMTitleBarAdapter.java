package com.sankuai.waimai.store.im.poi.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import com.sankuai.xm.imui.common.adapter.DialogModeSupportable;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMTitleBarAdapter implements ViewTreeObserver.OnGlobalLayoutListener, DialogModeSupportable, TitleBarAdapter {
    public static ChangeQuickRedirect a;
    public Activity b;
    public a c;
    protected PoiImInfo d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private View r;
    private View s;
    private View t;
    private LinearLayout u;
    private RelativeLayout v;
    private RelativeLayout w;
    private View x;
    private UserGroupImInfo y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1315f771666bbf163fad26c1f6568d90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1315f771666bbf163fad26c1f6568d90");
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onThemeChanged(com.sankuai.xm.imui.theme.b bVar) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onTitleTextChanged(String str) {
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter
    public void onUnreadCountChanged(int i) {
    }

    public SGIMTitleBarAdapter(PoiImInfo poiImInfo) {
        Object[] objArr = {poiImInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f3333d2ee36180fc69d0ab13721f07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f3333d2ee36180fc69d0ab13721f07");
            return;
        }
        this.d = poiImInfo;
        this.z = true;
    }

    public SGIMTitleBarAdapter(UserGroupImInfo userGroupImInfo) {
        Object[] objArr = {userGroupImInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d66b8355e40a4bd8464137c672ae48f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d66b8355e40a4bd8464137c672ae48f");
            return;
        }
        this.y = userGroupImInfo;
        this.z = false;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public void onAttach(Activity activity) {
        this.b = activity;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61bd1ba77dad1c2df02caaa405deb9aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61bd1ba77dad1c2df02caaa405deb9aa");
        }
        if (context == null || viewGroup == null) {
            return null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_common_im_title_layout, viewGroup, true);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a72ef606383f6317767d622324fcc63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a72ef606383f6317767d622324fcc63");
        } else {
            this.x = inflate.findViewById(R.id.ll_sc_im_title_root_view);
            this.e = (ImageView) inflate.findViewById(R.id.iv_sc_im_back);
            this.v = (RelativeLayout) inflate.findViewById(R.id.rl_sc_im_back);
            this.m = (TextView) inflate.findViewById(R.id.tv_sc_im_title);
            this.u = (LinearLayout) inflate.findViewById(R.id.tv_sc_im_group);
            this.k = (TextView) inflate.findViewById(R.id.tv_sc_im_group_num);
            this.l = (TextView) inflate.findViewById(R.id.tv_sc_im_group_info);
            this.w = (RelativeLayout) inflate.findViewById(R.id.rl_sc_im_group_info);
            this.i = (ImageView) inflate.findViewById(R.id.wm_sc_user_group_im_notice_horn);
            this.j = (ImageView) inflate.findViewById(R.id.wm_sc_user_group_im_notice_right);
            this.q = (TextView) inflate.findViewById(R.id.wm_c_user_group_notice_layout_content);
            this.r = inflate.findViewById(R.id.v_sc_im_phone);
            this.f = (ImageView) this.r.findViewById(R.id.iv_sc_im_title_icon);
            this.n = (TextView) this.r.findViewById(R.id.tv_sc_im_title_hint);
            this.s = inflate.findViewById(R.id.v_sc_im_poi);
            this.g = (ImageView) this.s.findViewById(R.id.iv_sc_im_title_icon);
            this.o = (TextView) this.s.findViewById(R.id.tv_sc_im_title_hint);
            this.t = inflate.findViewById(R.id.v_sc_im_more);
            this.h = (ImageView) this.t.findViewById(R.id.iv_sc_im_title_icon);
            this.p = (TextView) this.t.findViewById(R.id.tv_sc_im_title_hint);
            u.a(this.n, "电话");
            u.a(this.o, "店铺");
            u.a(this.p, "更多");
            u.a(this.l, "群公告");
            u.c(this.r, this.s, this.t, this.u, this.l, this.w);
            m.b("https://p0.meituan.net/ingee/1363a35df9c7aff89b9dff1cd36878e11750.png").a(this.f);
            m.b("https://p0.meituan.net/ingee/b1783d3a56f1a097f3ab68135171956c1347.png").a(this.g);
            m.b("https://p0.meituan.net/ingee/e4c4844398629065c7a562290fa068ca379.png").a(this.h);
            m.b("https://p0.meituan.net/ingee/32257ac97538b337fe74b4319aac4dd43041.png").a(this.i);
            m.b("https://p0.meituan.net/ingee/f48994326020e91803636a2c82ac1e09775.png").a(this.j);
            this.e.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.b, R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_14, R.color.wm_sg_color_000000, R.dimen.wm_sc_common_dimen_2, a.EnumC1338a.LEFT));
            u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88487c2c0c7c0e6754d7d30ad864423d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88487c2c0c7c0e6754d7d30ad864423d");
                        return;
                    }
                    k.b(view, 0);
                    if (SGIMTitleBarAdapter.this.b != null) {
                        SGIMTitleBarAdapter.this.b.finish();
                    }
                }
            }, this.v);
            if (this.c != null) {
                u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f6c162076776be4ed1c71ee6b6780d7", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f6c162076776be4ed1c71ee6b6780d7");
                        } else {
                            SGIMTitleBarAdapter.this.c.a();
                        }
                    }
                }, this.s);
                u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1fa1292f0f64fb923c054f16bde13eb1", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1fa1292f0f64fb923c054f16bde13eb1");
                        } else {
                            SGIMTitleBarAdapter.this.c.b();
                        }
                    }
                }, this.r);
                u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2d6dd7d2d61c29a7ddb3afbe95a2552", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2d6dd7d2d61c29a7ddb3afbe95a2552");
                        } else {
                            SGIMTitleBarAdapter.this.c.c();
                        }
                    }
                }, this.t);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99f8bc00168182295082fc3f4ec29a76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99f8bc00168182295082fc3f4ec29a76");
            } else if (this.z) {
                if (this.d != null) {
                    a(this.d.getPoiName());
                    Object[] objArr4 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e09b8180d514f45a69fdd406ef58d942", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e09b8180d514f45a69fdd406ef58d942");
                    } else {
                        u.a(this.r, 0);
                    }
                    b(true);
                }
            } else if (this.y != null) {
                a(this.y.groupName);
                b(true);
                byte b = this.y.groupState == 0 ? (byte) 1 : (byte) 0;
                Object[] objArr5 = {Byte.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b3c40e2a090d62f5a9e728ddd33a66ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b3c40e2a090d62f5a9e728ddd33a66ca");
                } else {
                    u.a(this.t, b != 0 ? 0 : 8);
                }
                byte b2 = this.y.groupState == 0 ? (byte) 1 : (byte) 0;
                Object[] objArr6 = {Byte.valueOf(b2)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "135577c64377600ada61fe88a4729a18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "135577c64377600ada61fe88a4729a18");
                } else {
                    u.a((View) this.u, b2 != 0 ? 0 : 8);
                }
                String str = this.y.groupNotice;
                byte b3 = this.y.groupState == 0 ? (byte) 1 : (byte) 0;
                Object[] objArr7 = {str, Byte.valueOf(b3)};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5955ded96398d41d44d16037393ab60d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5955ded96398d41d44d16037393ab60d");
                } else if (!t.a(str) && this.l != null && this.w != null && b3 != 0) {
                    u.a(this.l);
                    a(false, this.l);
                    u.a(this.q, str);
                    u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8abf3ab2ce9c0a37d35e0ea7fdaf5749", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8abf3ab2ce9c0a37d35e0ea7fdaf5749");
                                return;
                            }
                            u.a((View) SGIMTitleBarAdapter.this.w, SGIMTitleBarAdapter.this.w.getVisibility() == 0 ? 8 : 0);
                            SGIMTitleBarAdapter.this.a(SGIMTitleBarAdapter.this.w.getVisibility() == 0, SGIMTitleBarAdapter.this.l);
                        }
                    }, this.l);
                    u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.6
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2ec855fa58a94c6bb3ef907cc4c92e7d", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2ec855fa58a94c6bb3ef907cc4c92e7d");
                                return;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", "b_waimai_uaeex3zc_mc").a("poi_id", SGIMTitleBarAdapter.this.y.poiId).a("group_id", SGIMTitleBarAdapter.this.y.groupId).a();
                            com.sankuai.waimai.store.router.d.a(view.getContext(), SGIMTitleBarAdapter.this.y.groupNoticeUrl);
                        }
                    }, this.w);
                }
                String valueOf = String.valueOf(this.y.membeCount);
                Object[] objArr8 = {valueOf};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "72df1386d72f3fc661dc1e1b34b42bb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "72df1386d72f3fc661dc1e1b34b42bb9");
                } else {
                    u.a(this.k, this.b.getString(R.string.wm_sc_im_group_number, new Object[]{valueOf}));
                }
                a(this.y.noDisturbingStatus);
            }
        }
        return inflate;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d88007bbd7105e12dfe3cf7f523f77ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d88007bbd7105e12dfe3cf7f523f77ec");
        } else {
            u.a(this.m, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, @NotNull TextView textView) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fe95840ac3499512ebc02765ecd817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fe95840ac3499512ebc02765ecd817");
            return;
        }
        com.sankuai.waimai.store.view.a a2 = com.sankuai.waimai.store.view.a.a(this.b, R.dimen.wm_sc_common_dimen_8, R.dimen.wm_sc_common_dimen_4, R.color.wm_sg_im_color_B3000000, R.dimen.wm_sc_common_dimen_1, z ? a.EnumC1338a.UP : a.EnumC1338a.DOWN);
        a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
        textView.setCompoundDrawables(null, null, a2, null);
        textView.setCompoundDrawablePadding(5);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5bdf9b5842534176c522cb593768d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5bdf9b5842534176c522cb593768d2");
        } else if (this.b == null || this.m == null) {
        } else {
            Drawable drawable = this.b.getResources().getDrawable(R.drawable.wm_sc_user_group_no_voice_icon);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            TextView textView = this.m;
            if (!z) {
                drawable = null;
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            if (z) {
                this.m.setCompoundDrawablePadding(3);
            }
        }
    }

    private void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e7c0965bce31ea68110706635820f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e7c0965bce31ea68110706635820f5");
        } else {
            u.a(this.s, 0);
        }
    }
}
